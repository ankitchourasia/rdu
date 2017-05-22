package com.rdu.repositories;

import com.rdu.beans.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 05/11/2017.
 */
@Repository
public interface ResponseRepository extends JpaRepository<Response,Integer> {



    public Response findByDeviceName(String deviceName);
    public Response findByDeviceNameAndStatus(String deviceName,String status);

}
