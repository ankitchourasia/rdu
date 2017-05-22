package com.rdu.controllers;

import com.rdu.beans.Consumer;
import com.rdu.beans.Device;
import com.rdu.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 05/08/2017.
 */
@Controller
@RequestMapping("/backend/consumer")
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping(method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public ResponseEntity<Consumer> addConsumer(@RequestBody Consumer consumer){
        Consumer savedConsumer = consumerService.addConsumer(consumer);
        ResponseEntity<Consumer> responseEntity = null;
        if(savedConsumer != null){
            System.out.println("Device Added Successfully");
            return responseEntity = new ResponseEntity<Consumer>(savedConsumer, HttpStatus.CREATED);
        }else{
            System.out.println("Not Able to add Device, some error occurred");
            return responseEntity = new ResponseEntity<Consumer>(HttpStatus.CREATED);
        }
    }


   /* @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Device>> getAllDevices(){

    }*/
}
