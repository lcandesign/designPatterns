package com.app.homework.clase01.service;

import java.util.Map;

public class FrenchSystem implements CreditSystem{

    private double amount;
    private final double interests;
    private final int payments;

    public FrenchSystem(double amount, double interests, int payments) {
        this.amount = amount;
        this.interests = interests;
        this.payments = payments;
    }

    @Override
    public Map<Integer, Double> calculateLoan() {
        return null;
    }
}
