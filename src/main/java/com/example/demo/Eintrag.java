package com.example.demo;

import lombok.Value;

@Value
public class Eintrag {
    private int jahr;
    private double anfangskapital;
    private double zinsen;
    private double endkapital;
}
