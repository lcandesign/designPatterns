package com.app.homework.clase01;


import com.app.homework.clase01.entity.constant.AmortizationSystem;
import com.app.homework.clase01.service.AmericanSystem;
import com.app.homework.clase01.service.FrenchSystem;
import com.app.homework.clase01.service.FriendSystem;
import com.app.homework.clase01.service.GermanySystem;

import java.util.Map;

public class calculeCredit {
    Map<Integer,Double> installments;
    public calculeCredit(double amount, double interests, int payments, int amortizationSystem) {
        switch (amortizationSystem) {
            case 1:
                GermanySystem germanyCreditDetails = new GermanySystem(amount, interests,payments);
                installments = germanyCreditDetails.calculateLoan();
                printDetailsCredit(AmortizationSystem.getNameByKey(amortizationSystem),installments);
                break;
            case 2:
                AmericanSystem americanCreditDetails = new AmericanSystem(amount, interests, payments);
                installments = americanCreditDetails.calculateLoan();
                printDetailsCredit(AmortizationSystem.getNameByKey(amortizationSystem),installments);
                break;
            case 3:
                FriendSystem friendCreditDetails = new FriendSystem(amount, interests, payments);
                //TODO Pendiente
                break;
            case 4:
                FrenchSystem frenchCreditDetails = new FrenchSystem(amount, interests, payments);
                //TODO Pendiente
                break;
            default:
                break;
        }
    }
    public void printDetailsCredit(String amortizationName,Map<Integer,Double> installments ){
        System.out.println("Detalle de pagos con el " + amortizationName);
        for (Integer installmentNumber : installments.keySet()) {
            System.out.println("Cuota #" + installmentNumber + " " + installments.get(installmentNumber));
        }
    }
}
