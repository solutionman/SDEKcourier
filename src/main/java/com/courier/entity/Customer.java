package com.courier.entity;

public class Customer{
    private int id;
    private int orderNo;
    private String lastName;
    private String firstName;
    private String middleName;
    private String lateDelivery;

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
}
