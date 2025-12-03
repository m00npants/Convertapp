package org.example;
import java.util.Scanner;

public class LengthConverter {
    public void convert(Scanner scanner) {
        //menu
        System.out.println("\n--- Length Converter ---");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.print("Choose conversion: ");
        int option = scanner.nextInt();
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        double result = 0;
        String from = "", to = "";
//converter
        switch (option) {
            case 1 -> { result = length / 1000; from = "meters"; to = "kilometers"; }
            case 2 -> { result = length * 1000; from = "kilometers"; to = "meters"; }
            default -> System.out.println("Invalid option.");
        }
//results and time/date
        if (option == 1 || option == 2) {
            System.out.printf("Result: %.2f %s = %.2f %s\n", length, from, result, to);
            System.out.println("Converted at: " + DateTime.getTimestamp());
        }
    }
}