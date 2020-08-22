package com.app.homework.clase01.service;

import java.util.Map;
import java.util.TreeMap;

public class GermanySystem implements CreditSystem {

    private double amount;
    private final double interests;
    private final int payments;

    public GermanySystem(double amount, double interests, int payments) {
        this.amount = amount;
        this.interests = interests;
        this.payments = payments;
    }

    @Override
    public Map<Integer, Double> calculateLoan() {
        double interestsByMonth = this.interests / 12;
        double capital = this.amount / this.payments;

        Map<Integer, Double> creditDetail = new TreeMap<Integer, Double>();
        for (int i = 1 ; i <= this.payments ; i++){
            creditDetail.put(i,Math.round((this.amount * (interestsByMonth/100) + capital) * 100.0) / 100.0);
            this.amount -= capital;
        }
        return creditDetail;
    }
}
