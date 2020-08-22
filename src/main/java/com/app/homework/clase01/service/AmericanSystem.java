package com.app.homework.clase01.service;

import java.util.Map;
import java.util.TreeMap;

public class AmericanSystem implements CreditSystem {

    private final double amount;
    private final double interests;
    private final int payments;

    public AmericanSystem(double amount, double interests, int payments) {
        this.amount = amount;
        this.interests = interests;
        this.payments = payments;
    }


    @Override
    public Map<Integer, Double> calculateLoan() {
        double interestsByMonth = this.interests / 12;
        double annualQuota = this.amount * (interestsByMonth /100);
        double finalQuota = this.amount + annualQuota;

        Map<Integer, Double> creditDetail = new TreeMap<Integer, Double>();
        for (int i = 1 ; i <= this.payments ; i++){
            creditDetail.put(i,Math.round(annualQuota * 100.0) / 100.0);
        }
        creditDetail.put(this.payments, finalQuota);
        return creditDetail;
    }
}
