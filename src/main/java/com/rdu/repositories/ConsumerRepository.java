package com.rdu.repositories;

import com.rdu.beans.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 05/08/2017.
 */
@Repository
public interface ConsumerRepository extends JpaRepository<Consumer,Integer> {

    public List<Consumer> findByDevice(String device);
}
