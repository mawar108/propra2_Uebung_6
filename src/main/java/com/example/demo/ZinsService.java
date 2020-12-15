package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ZinsService {

    public Ergebnis berechneEndkapital(ZinsForm form) {
        Ergebnis e = new Ergebnis();
        int laufzeit = form.getLaufzeit();
        double startKapital = form.getAnfangsKapital();
        double zins = form.getZinsSatz();

        for (int i = 1; i <= laufzeit; ++i) {
            double zinsen = startKapital * (zins / 100);
            Eintrag eintrag = new Eintrag(i, startKapital, zinsen, startKapital + zinsen);
            startKapital += zinsen;
            e.addEintrag(eintrag);
        }

        e.setEndkapital(startKapital);

        return e;
    }
}
