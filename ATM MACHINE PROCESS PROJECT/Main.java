package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AtmOperationInterface op = new AtmOperationImpliments();
        int accountnumber = 1234;
        int password = 123;
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE ACCOUNT NUMBER : ");
        int accountNumber = s.nextInt();
        System.out.print("ENTER THE PASSWARD : ");
        int Password = s.nextInt();
        if((accountnumber == accountNumber)&&(password == Password)) {
            while(true) {
                System.out.println("---------------------------------------------------------------");
                System.out.println("1.VIEW BALANCE\n2.WITHRAW MONEY\n3.DEPOSITE AMOUNT\n4.VIEW MIMI STATEMENT\n5.EXIT");
                System.out.println("---------------------------------------------------------------");
                System.out.print("ENTER THE CHOICE : ");
                int choice = s.nextInt();
                System.out.println("---------------------------------------------------------------");

                switch(choice) {
                    case 1 :
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.print("ENTER THE AMOUNT THAT YOU WANT TO WITHDRAW : ");
                        double withrawAmount = s.nextDouble();
                        op.withdrawAmount(withrawAmount);

                        break;
                    case 3:
                        System.out.print("ENTER THE DEPOSITE AMOUT IN DIGIT : ");
                        double depositeAmount = s.nextDouble();
                        op.depositeAmount(depositeAmount);
                        break;
                    case 4:
                        op.viewStatement();
                        break;
                    case 5:
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("COLLECT YOUR ATM CARD");
                        System.out.println("---------------------------------------------------------------");
                        System.exit(0);
                        break;
                    default :
                        System.out.print("PLEASE ENTER THE ABOVE GIVEN VALID NUMBER");
                        System.exit(0);
                }
            }

        }
        else {
            System.out.print("INCORECT ACCOUNT NUMBER OR PASSWORD");
            System.exit(0);
        }
    }
}
