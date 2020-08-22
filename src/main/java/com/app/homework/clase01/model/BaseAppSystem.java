package com.app.homework.clase01.model;

import com.app.homework.clase01.calculeCredit;
import com.app.homework.clase01.entity.constant.AmortizationSystem;

import java.util.Scanner;

public class BaseAppSystem {
    private double amount;
    private double interests;
    private int amortizationSystem;
    private int payment;

    public void run() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el importe del préstamo: ");
        while(!scan.hasNextDouble()) {
            System.out.print("Ingrese un valor valido: ");
            scan.next();
        }
        setAmount(scan.nextDouble());

        System.out.print("Introduce el monto de interés anual (TNA): ");
        while(!scan.hasNextDouble()) {
            System.out.print("Ingrese un valor valido: ");
            scan.next();
        }
        setInterests(scan.nextDouble());

        System.out.print("Introduce la cantidad de cuotas: ");
        while(!scan.hasNextInt()) {
            System.out.print("Ingrese un valor valido: ");
            scan.next();
        }
        setPayment(scan.nextInt());

        System.out.println("Indique el número del sistema de amortización a usar: ");
        System.out.print(AmortizationSystem.getAllAmortizationSystems());
        int number;
        do {
            while(!scan.hasNextInt()) {
                System.out.print("Ingrese un valor valido: ");
                scan.next();
            }
            number = scan.nextInt();
        } while (!(number > 0 && number <= AmortizationSystem.values().length));
        setAmortizationSystem(number);

        new calculeCredit(getAmount(),getInterests(), getPayment(),getAmortizationSystem());
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterests() {
        return interests;
    }

    public void setInterests(double interests) {
        this.interests = interests;
    }

    public int getAmortizationSystem() {
        return amortizationSystem;
    }

    public void setAmortizationSystem(int amortizationSystem) {
        this.amortizationSystem = amortizationSystem;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
