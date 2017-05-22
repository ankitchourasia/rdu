package com.rdu.repositories;

import com.rdu.beans.Device;
import com.rdu.beans.DeviceData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 05/10/2017.
 */
@Repository
public interface DeviceDataRepository extends JpaRepository<DeviceData,Integer> {
    public DeviceData findByDeviceName(String deviceName);
}
