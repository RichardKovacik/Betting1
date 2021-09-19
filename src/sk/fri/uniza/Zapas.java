package sk.fri.uniza;

import java.util.ArrayList;

public class Zapas {
    private String casADatum;
    private String liga;
    private String ucastnici;
    private ArrayList<String> bets;

    public Zapas(String casADatum, String liga, String ucastnici, ArrayList<String> bets) {
        this.casADatum = casADatum;
        this.liga = liga;
        this.ucastnici = ucastnici;
        this.bets = bets;
    }

    public String getCasADatum() {
        return casADatum;
    }

    public void setCasADatum(String casADatum) {
        this.casADatum = casADatum;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getUcastnici() {
        return ucastnici;
    }

    public void setUcastnici(String ucastnici) {
        this.ucastnici = ucastnici;
    }

    public ArrayList<String> getBets() {
        return bets;
    }

    public void setBets(ArrayList<String> bets) {
        this.bets = bets;
    }
}
