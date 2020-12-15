package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Ergebnis {
    private List<Eintrag> tabelle = new ArrayList<>();
    private double endkapital;

    public void addEintrag(Eintrag e) {
        tabelle.add(e);
    }

    public List<Eintrag> getTabelle() {
        return tabelle;
    }

    public double getEndkapital() {
        return endkapital;
    }

    public void setEndkapital(double endkapital) {
        this.endkapital = endkapital;
    }
}
