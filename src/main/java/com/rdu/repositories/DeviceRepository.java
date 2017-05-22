package com.rdu.repositories;

import com.rdu.beans.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 05/08/2017.
 */
@Repository
public interface DeviceRepository extends JpaRepository<Device,Integer> {

    public Device findByDeviceName(String deviceNamne);
}
