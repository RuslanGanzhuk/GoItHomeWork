package goit.javaOnline.homeWork6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Hello hello = new Hello();
        MusicalShop musicalShop = new MusicalShop();


        System.out.println("Enter have instruments in our shop ");

        try {
            System.out.println(" Enter piano ");
            int numberPiano = scanner.nextInt();
            while (numberPiano < 0){
                System.out.println("Please enter only positive number");
                numberPiano = scanner.nextInt();
            }
            musicalShop.piano.setQuantity(numberPiano);

            System.out.println(" Enter guitar ");
            int numberGuitar = scanner.nextInt();
            while (numberGuitar < 0){
                System.out.println("Please enter only positive number");
                numberGuitar = scanner.nextInt();
            }
            musicalShop.guitar.setQuantity(numberGuitar);

            System.out.println(" Enter trumpet ");
            int numberTrumpet = scanner.nextInt();
            while (numberTrumpet < 0){
                System.out.println("Please enter only positive number");
                numberTrumpet = scanner.nextInt();
            }
            musicalShop.trumpet.setQuantity(numberTrumpet);
        } catch (InputMismatchException e){
            System.out.println("Please enter only number!!!");
        }



        System.out.println("Please enter your name.");
        hello.setUserName(scanner1.nextLine().toUpperCase());
        hello.helloUser(hello.getUserName());

        System.out.println("Our assortment: ");
        musicalShop.printAssortmentShop(musicalShop.assortmentShop());

        System.out.println("Please enter your order ");
        System.out.println("Piano: ");
        musicalShop.setOrderNumberOfPiano(scanner2.nextInt());
        System.out.println("Guitar: ");
        musicalShop.setOrderNumberOfGuitar(scanner2.nextInt());
        System.out.println("Trumpet: ");
        musicalShop.setOrderNumberOfTrumpet(scanner2.nextInt());
        musicalShop.order(musicalShop.assortmentShop());


/* System.out.println("Please enter guitar in our shop.");
        musicalShop.createListGuitar(scanner.nextInt());
        System.out.println("Please enter piano in our shop.");
        musicalShop.createListPiano(scanner.nextInt());
        System.out.println("Please enter trumpet in our shop.");
        musicalShop.createListTrumpet(scanner.nextInt());
        musicalShop.printInfoInstrumentInShop();*/


    }
}
