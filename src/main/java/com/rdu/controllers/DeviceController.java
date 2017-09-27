package com.rdu.controllers;

import com.rdu.beans.*;
import com.rdu.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 05/08/2017.
 */
@Controller
@RequestMapping("/backend/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private ConsumerService consumerService;

    @Autowired

    private ResponseService responseService;

    @Autowired
    private DeviceDataService deviceDataService;

    @RequestMapping(method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public ResponseEntity<Device> addDevice(@RequestBody Device device){
        System.out.println("Logging user : "+device);
        Device savedDevice = deviceService.addDevice(device);
        ResponseEntity<Device> responseEntity = null;
        if(savedDevice != null){
            System.out.println("Device Added Successfully");
            return responseEntity = new ResponseEntity<Device>(savedDevice, HttpStatus.CREATED);
        }else{
            System.out.println("Not Able to add Device, some error occurred");
            return responseEntity = new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Device>> getAllDevices(){
        System.out.println("inside get all devices");
        List<Device> devices = deviceService.getAllDevices();
        ResponseEntity<List<Device>> responseEntity = null;
        if(devices != null){
            for(Device device:devices){
                List<Consumer> consumers = new ArrayList<Consumer>();
                List<Consumer> newConsumers = new ArrayList<Consumer>();
                consumers=consumerService.getConsumersByDeviceName(device.getDeviceName());
                device.setDeviceData(deviceDataService.getByDeviceName(device.getDeviceName()));
                for(Consumer c : consumers){
                    switch(c.getTerminalNumber()){
                        case "1" : c.setStatus(device.getDeviceData().getT1());
                            break;
                        case "2" : c.setStatus(device.getDeviceData().getT2());
                            break;
                        case "3" : c.setStatus(device.getDeviceData().getT3());
                            break;
                        case "4" : c.setStatus(device.getDeviceData().getT4());
                            break;
                        case "5" : c.setStatus(device.getDeviceData().getT5());
                            break;
                        case "6" : c.setStatus(device.getDeviceData().getT6());
                            break;
                    }
                    newConsumers.add(c);
                }
                Response res = responseService.findByDeviceNameAndStatus(device.getDeviceName(),"N");
               if(res != null)
                    device.setStatus(res.getStatus());
                else{
                    device.setStatus("NA");
                }
                device.setConsumers(newConsumers);
            }
            System.out.println("Successfully got All Devices");
            return responseEntity = new ResponseEntity<List<Device>>(devices, HttpStatus.OK);
        }else{
            System.out.println("Unable to get Devices ");
            return responseEntity = new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }


    @RequestMapping(value="/response/{deviceName}",method = RequestMethod.GET)
    public ResponseEntity<Device> getDeviceByName(@PathVariable String deviceName){
        System.out.println("inside get device By NAme "+deviceName);
        //String actualDeviceName = new String(Base64.getDecoder().decode(deviceName));
        String actualDeviceName = null;
        try {
            actualDeviceName = URLDecoder.decode( deviceName, "UTF-8" );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(actualDeviceName);
        Device device = deviceService.findByDeviceName(actualDeviceName);
        ResponseEntity<Device> responseEntity = null;
        if(device != null){
            //for(Device device:devices){
                List<Consumer> consumers = new ArrayList<Consumer>();
                List<Consumer> newConsumers = new ArrayList<Consumer>();
                consumers=consumerService.getConsumersByDeviceName(device.getDeviceName());
                device.setDeviceData(deviceDataService.getByDeviceName(device.getDeviceName()));
                for(Consumer c : consumers){
                    switch(c.getTerminalNumber()){
                        case "1" : c.setStatus(device.getDeviceData().getT1());
                            break;
                        case "2" : c.setStatus(device.getDeviceData().getT2());
                            break;
                        case "3" : c.setStatus(device.getDeviceData().getT3());
                            break;
                        case "4" : c.setStatus(device.getDeviceData().getT4());
                            break;
                        case "5" : c.setStatus(device.getDeviceData().getT5());
                            break;
                        case "6" : c.setStatus(device.getDeviceData().getT6());
                            break;
                    }
                    newConsumers.add(c);
                }
                Response res = responseService.findByDeviceNameAndStatus(device.getDeviceName(),"N");
                if(res != null)
                    device.setStatus(res.getStatus());
                else{
                    device.setStatus("NA");
                }
                device.setConsumers(newConsumers);
            System.out.println("Successfully got Devices");
            return responseEntity = new ResponseEntity<Device>(device, HttpStatus.OK);
        }else{
            System.out.println("Unable to get Device ");
            return responseEntity = new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }


    @RequestMapping(value="response", method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public ResponseEntity<Response> addResponse(@RequestBody Device device){
        System.out.println("Receiving device : "+device);
        Date date = new Date();
       // SimpleDateFormat sd = new SimpleDateFormat(date);
        String op_date = ""+date.getDate()+"-"+(date.getMonth()+1)+"-"+date.getYear();
        System.out.println(op_date);
        String op_time = ""+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
        System.out.println(op_time);

        Response response = new Response();
        response.setDeviceName(device.getDeviceName());
        response.setOpDate(op_date);
        response.setOpTime(op_time);
        response.setStatus("N");
        for(Consumer consumer : device.getConsumers()){
            switch(consumer.getTerminalNumber()){
                case "1" : response.setT1(consumer.getStatus());
                    break;
                case "2" : response.setT2(consumer.getStatus());
                    break;
                case "3" : response.setT3(consumer.getStatus());
                    break;
                case "4" : response.setT4(consumer.getStatus());
                    break;
                case "5" : response.setT5(consumer.getStatus());
                    break;
                case "6" : response.setT6(consumer.getStatus());
                    break;
            }
        }
        Response savedResponse = responseService.addResponse(response);
        ResponseEntity<Response> responseEntity = null;
        if(savedResponse != null){
            System.out.println("Response Added Successfully");
            return responseEntity = new ResponseEntity<Response>(savedResponse, HttpStatus.CREATED);
        }else {
            System.out.println("Not Able to add Response, some error occurred");
            return responseEntity = new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}
