package com.company;
import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpliments implements AtmOperationInterface {
    Atm atm = new Atm();
    HashMap<Double, String> mini = new HashMap<Double,String>();


    public void viewBalance() {
        System.out.println("YOUR BALANCE IS : " + atm.getBalance());
        System.out.println("---------------------------------------------------------------");
    }


    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 500 == 0){
        if (withdrawAmount <= atm.getBalance()) {
            System.out.println("---------------------------------------------------------------");
            System.out.println(withdrawAmount + " IS DEBITED IN YOUR ACCOUNT ");
            mini.put(withdrawAmount, "Debited");
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        } else {
            System.out.println("INSUFFICIENT BALANCE");
            viewBalance();
        }
        }
        else{

            System.out.println("ENTER THE NUMBER THAT MULTIPLE OF 500");
            System.out.println("---------------------------------------------------------------");
        }
    }


    public void depositeAmount(double depositeAmount) {
        System.out.println("---------------------------------------------------------------");
        System.out.println(depositeAmount + " HAS BEEN DEPOSITED TO YOUR ACCOUNT");

        mini.put(depositeAmount, "Deposited");
        atm.setBalance(atm.getBalance() + depositeAmount);
        viewBalance();
    }


    public void viewStatement() {
        int i =0;
        for(Map.Entry<Double,String> m : mini.entrySet()){
            i++;
            System.out.println(i+"." +m.getKey()+" "+m.getValue());
        }

    }
}
