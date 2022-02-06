package carpark;

import java.util.Scanner;

public class Main {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        Parking pa = new Parking();
        System.out.println("\t" + "	*****WELCOME TO UOC CAR PARKING *****");
        System.out.println("\t" + "  FACULTY:UOC FOT ");
        System.out.println("\t" + "  CAR PARK  ");
        System.out.println("\t" + " 3 slot HAVE PARK(Standard slot,Handicapped slot,Long vehicle slot) ");
        int choice;
        int Standard = 0, Handicapped = 0, Long_vehicle = 0;
        while (true) {
            System.out.println("Press 1 to enter Vehicle to  Standard slot");
            System.out.println("Press 2 to enter Vehicle to  Handicapped slot");
            System.out.println("Press 3 to enter Vehicle to Long vehicle slot");
            System.out.println("Press 4 to view data");
            System.out.println("Press 5 to delete data");
            System.out.println("Press 6 to exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Standard++;
                    if (Standard < 10) {
                        pa.setStandard(Standard);
                        System.out.println(Standard + " Vehicle is added to Standard slot  ");
                    } else {
                        System.out.println(" Vehicles FULL Standard slot  ");
                    }
                    break;
                case 2:
                    Handicapped++;
                    if (Handicapped < 20) {
                        pa.setHandicapped(Handicapped);
                        System.out.println(Handicapped + " Vehicle is added to Handicapped slot ");
                    } else {
                        System.out.println(" Vehicles FULL Handicapped slot  ");
                    }

                    break;