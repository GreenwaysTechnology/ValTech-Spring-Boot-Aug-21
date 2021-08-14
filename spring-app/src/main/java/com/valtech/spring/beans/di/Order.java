package com.valtech.spring.beans.di;

public class Order {
    private int orderId;
    private float orderValue;

    public Order() {
    }

    public Order(int orderId, float orderValue) {
        super();
        this.orderId = orderId;
        this.orderValue = orderValue;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(float orderValue) {
        this.orderValue = orderValue;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderValue=" + orderValue +
                '}';
    }
}
