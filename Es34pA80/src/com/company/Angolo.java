package com.company;

public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    // costruttori
    public Angolo(int gradi, int primi, int secondi){
        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
        secondiAngolo(angoloSecondi());
    }

    // metodi
    public long angoloSecondi(){
        return gradi*3600+primi*30+secondi;
    }

    public void secondiAngolo(long n){
        gradi = (int)(n/3600);
        n = n - gradi * 3600;
        gradi = gradi % 360;
        primi = (int)(n/360);
        secondi = (int)(n-primi*60);
    }

    public void visualizzaAngolo(){
        System.out.println(gradi + "° " + primi + "' " + secondi + "''");
    }

    public void aggiungiGradi(int n){
        gradi = gradi + n;
        secondiAngolo(angoloSecondi());
    }

    public void aggiungiPrimi(int n){
        primi = primi + n;
        secondiAngolo(angoloSecondi());
    }

    public void aggiungiSecondi(int n){
        secondi = secondi + n;
        secondiAngolo(angoloSecondi());
    }

    public void sommaAngolo(Angolo a) {
        secondiAngolo(a.angoloSecondi()+angoloSecondi());
    }

    public long differenzaSecondi(Angolo a){
        return gradi-a.gradi;
    }
}
