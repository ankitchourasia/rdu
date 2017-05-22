package com.rdu.services;

import com.rdu.beans.Consumer;
import com.rdu.repositories.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by lenovo on 05/08/2017.
 */
@Service
public class ConsumerService {

    @Autowired
    ConsumerRepository consumerRepository;

    public List<Consumer> getAllConsumers(){
        return consumerRepository.findAll();
    }
    public Consumer addConsumer(Consumer consumer){
        return consumerRepository.save(consumer);
    }
    public List<Consumer> getConsumersByDeviceName(String deviceName){return consumerRepository.findByDevice(deviceName);}
}
