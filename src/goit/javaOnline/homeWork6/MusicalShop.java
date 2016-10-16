package goit.javaOnline.homeWork6;

import java.util.*;

public class MusicalShop {

    private int orderNumberOfGuitar;
    private int orderNumberOfPiano;
    private int orderNumberOfTrumpet;

    Piano piano = new Piano();
    Guitar guitar = new Guitar();
    Trumpet trumpet = new Trumpet();

    private Map<String, Integer> assortment = new HashMap<>();

    public Map assortmentShop() {

        assortment.put(piano.getName(), piano.getQuantity());
        assortment.put(guitar.getName(), guitar.getQuantity());
        assortment.put(trumpet.getName(), trumpet.getQuantity());

        return assortment;
    }

    public void printAssortmentShop(Map<String,Integer> assortment){

        for (Map.Entry entry : assortment.entrySet()) {
            System.out.println("Name position: " + entry.getKey() + " In stock -  " + entry.getValue());
        }
    }


    // private Map<String, Integer> orderMap = new HashMap<>();

    public void order(Map<String, Integer> assortment) {


        for (Map.Entry<String, Integer> entry : assortment.entrySet()) {
            if (piano.getName().equals(entry.getKey())) entry.setValue(piano.getQuantity() - getOrderNumberOfPiano());
            if (guitar.getName().equals(entry.getKey())) entry.setValue(guitar.getQuantity() - getOrderNumberOfGuitar());
            if (trumpet.getName().equals(entry.getKey())) entry.setValue(trumpet.getQuantity() - getOrderNumberOfTrumpet());

        }
        System.out.println( "In shop stock after order: " + assortment);
    }

    public int getOrderNumberOfGuitar() {
        return orderNumberOfGuitar;
    }

    public void setOrderNumberOfGuitar(int orderNumberOfGuitar) {
        this.orderNumberOfGuitar = orderNumberOfGuitar;
    }

    public int getOrderNumberOfPiano() {
        return orderNumberOfPiano;
    }

    public void setOrderNumberOfPiano(int orderNumberOfPiano) {
        this.orderNumberOfPiano = orderNumberOfPiano;
    }

    public int getOrderNumberOfTrumpet() {
        return orderNumberOfTrumpet;
    }

    public void setOrderNumberOfTrumpet(int orderNumberOfTrumpet) {
        this.orderNumberOfTrumpet = orderNumberOfTrumpet;
    }
}
