package goit.javaOnline.homeWork5;

public class Distance {

    private double dotX1;
    private double dotX2;
    private double dotY1;
    private double dotY2;

    public void distanceDot(double dotX1,double dotX2,double dotY1,double dotY2){

        double d = Math.sqrt(((dotX2 - dotX1)*(dotX2 - dotX1)) + ((dotY2 - dotY1)*(dotY2 - dotY1)));

        System.out.println("Distance dot = " + d);
    }
}
