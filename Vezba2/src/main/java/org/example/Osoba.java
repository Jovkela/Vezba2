package org.example;

import java.awt.im.spi.InputMethod;

public class Osoba {
    String ime;
    static int brOsoba;
    int god;

    public Osoba(String ime, int god) {
        this.ime = ime;
        this.god = god;
        brOsoba++;
    }
}
}
