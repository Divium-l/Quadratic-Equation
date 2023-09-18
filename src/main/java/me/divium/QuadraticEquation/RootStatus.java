package me.divium.QuadraticEquation;

public enum  RootStatus {
    NO_ROOTS(0),
    ONE_ROOT(1),
    TWO_ROOTS(2);

    private final int value;

    private RootStatus(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
