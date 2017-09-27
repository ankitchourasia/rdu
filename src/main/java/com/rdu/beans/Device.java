package com.rdu.beans;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lenovo on 05/08/2017.
 */
@Entity

@Table(name="device")
public class Device {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private int id;
    @Column(name="device_name")
    private String deviceName;
    @Column(name="name_of_feeder")
    private String feederName;
    @Column(name="pole_number")
    private String poleNumber;
    @Column(name="date_of_installation")
    private String installationDate;
    @Column(name="zone_name")
    private String zoneName;
    @Column(name="sim_no")
    private String simNo;
    @Transient
    private List<Consumer> consumers;
    @Transient
    private DeviceData deviceData;
    @Transient
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getFeederName() {
        return feederName;
    }

    public void setFeederName(String feederName) {
        this.feederName = feederName;
    }

    public String getPoleNumber() {
        return poleNumber;
    }

    public void setPoleNumber(String poleNumber) {
        this.poleNumber = poleNumber;
    }

    public String getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(String installationDate) {
        this.installationDate = installationDate;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getSimNo() {
        return simNo;
    }

    public void setSimNo(String simNo) {
        this.simNo = simNo;
    }

    public List<Consumer> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<Consumer> consumers) {
        this.consumers = consumers;
    }

    public DeviceData getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(DeviceData deviceData) {
        this.deviceData = deviceData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", deviceName='" + deviceName + '\'' +
                ", feederName='" + feederName + '\'' +
                ", poleNumber='" + poleNumber + '\'' +
                ", installationDate='" + installationDate + '\'' +
                ", zoneName='" + zoneName + '\'' +
                ", simNo='" + simNo + '\'' +
                ", consumers=" + consumers +
                ", deviceData=" + deviceData +
                ", status='" + status + '\'' +
                '}';
    }
}
