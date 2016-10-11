package goit.javaOnline.homeWork6;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hello hello = new Hello();
        System.out.println("Please enter your name.");
        hello.setUserName(scanner.nextLine().toUpperCase());
        hello.helloUser(hello.getUserName());

    }
}
