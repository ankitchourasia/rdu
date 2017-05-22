package com.rdu.beans;

import javax.persistence.*;

/**
 * Created by lenovo on 05/08/2017.
 */
@Entity
@Table(name = "consumer")
public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "device")
    private String device;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "pole_number")
    private String poleNumber;
    @Column(name = "terminal_number")
    private String terminalNumber;
    @Transient
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPoleNumber() {
        return poleNumber;
    }

    public void setPoleNumber(String poleNumber) {
        this.poleNumber = poleNumber;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Consumer(){

    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", device='" + device + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", poleNumber='" + poleNumber + '\'' +
                ", terminalNumber='" + terminalNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
