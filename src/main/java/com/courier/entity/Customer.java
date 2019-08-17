package com.courier.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Customer{
    private int id;
    private int orderNo;
    private String lastName;
    private String firstName;
    private String middleName;
    private String lateDelivery;
    private String deliveryTime;
    private String address;
    private String phone;
    private String lateTaskTime;

    public Customer(){

    }

    public int getId(){
        return id;
    }

    public void setId( int id ){
        this.id = id;
    }

    public int getOrderNo(){
        return orderNo;
    }

    public void setOrderNo( int orderNo ){
        this.orderNo = orderNo;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName( String lastName ){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName( String firstName ){
        this.firstName = firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public void setMiddleName( String middleName ){
        this.middleName = middleName;
    }

    public String getLateDelivery() {
        return lateDelivery;
    };

    public void setLateDelivery( String lateDelivery ){
        this.lateDelivery = lateDelivery;
    }

    public String getDeliveryTime(){
        return deliveryTime;
    }

    public void setDeliveryTime( String deliveryTime ){
        this.deliveryTime = deliveryTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLateTaskTime() {
        return lateTaskTime;
    }

    public void setLateTaskTime(String lateTaskTime) {
        this.lateTaskTime = lateTaskTime;
    }
}
