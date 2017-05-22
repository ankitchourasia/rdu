package com.rdu.services;

import com.rdu.beans.Response;
import com.rdu.repositories.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 05/11/2017.
 */
@Service
public class ResponseService {

    @Autowired
    ResponseRepository responseRepository;
    public Response getByDeviceName(String deviceName){
        return responseRepository.findByDeviceName(deviceName);
    }
    public Response findByDeviceNameAndStatus(String deviceName,String status){
        return responseRepository.findByDeviceNameAndStatus(deviceName,status);
    }

    public Response addResponse(Response response){
        return responseRepository.save(response);
    }
}
