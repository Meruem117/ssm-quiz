package com.niit.quiz.model.enums;

public enum ScheduleStatusEnum {
    START(1),
    NOT_START(0),
    END(1),
    NOT_END(0);

    private final int value;

    ScheduleStatusEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
