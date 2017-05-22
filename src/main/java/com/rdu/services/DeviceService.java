package com.rdu.services;

import com.rdu.beans.Device;
import com.rdu.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 05/08/2017.
 */
@Service
public class DeviceService{

    @Autowired
    DeviceRepository deviceRepository;

    public Device addDevice(Device device){
        return deviceRepository.save(device);
    }
    public List<Device> getAllDevices(){
        return deviceRepository.findAll();
    }

    public Device findByDeviceName(String deviceName){
        return deviceRepository.findByDeviceName(deviceName);
    }
}
