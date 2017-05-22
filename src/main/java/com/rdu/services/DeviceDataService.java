package com.rdu.services;

import com.rdu.beans.DeviceData;
import com.rdu.repositories.DeviceDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 05/10/2017.
 */
@Service
public class DeviceDataService {
    @Autowired
    DeviceDataRepository deviceDataRepository;

    public DeviceData getByDeviceName(String deviceName){
        return deviceDataRepository.findByDeviceName(deviceName);
    }
}
