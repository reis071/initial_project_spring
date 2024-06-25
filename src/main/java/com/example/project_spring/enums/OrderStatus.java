package com.example.project_spring.enums;

public enum OrderStatus {
    PAID(1),
    AWAITING_PAYMENT(2);

    private int value;

    OrderStatus(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public static OrderStatus status(int value) {
        for (OrderStatus typeStatus : OrderStatus.values()) {
            if (typeStatus.getValue() == value) {
                return typeStatus;
            }
        }
        throw new IllegalArgumentException("Invalid status");

    }
}
