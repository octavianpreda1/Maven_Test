package Mobilier;

import java.util.List;

public class Mobilier {
    private String nume;
    private List<Placa> placi;

    public Mobilier(){}
    public Mobilier(String nume, List<Placa> placi) {
        this.nume = nume;
        this.placi = placi;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Placa> getPlaci() {
        return placi;
    }

    public void setPlaci(List<Placa> placi) {
        this.placi = placi;
    }


    public void afisareMobilier()
    {
        System.out.println("Numele mobilierului: "+nume);
        for(Placa placa:placi)
            System.out.println(placa);
    }
}
