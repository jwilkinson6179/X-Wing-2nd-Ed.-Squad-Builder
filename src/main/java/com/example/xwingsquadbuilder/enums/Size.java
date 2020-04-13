package com.example.xwingsquadbuilder.enums;

public enum Size
{
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    private final String baseSize;

    Size(String baseSize)
    {
        this.baseSize = baseSize;
    }


    @Override
    public String toString() {
        return this.baseSize;
    }
}
