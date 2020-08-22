package com.app.homework.clase01;


import com.app.homework.clase01.entity.constant.AmortizationSystem;
import com.app.homework.clase01.service.AmericanSystem;
import com.app.homework.clase01.service.FrenchSystem;
import com.app.homework.clase01.service.FriendSystem;
import com.app.homework.clase01.service.GermanySystem;

import java.util.Map;

public class calculeCredit {
    Map<Integer,Double> fees;
    public calculeCredit(double amount, double interests, int payments, int amortizationSystem) {
        switch (amortizationSystem) {
            case 1:
                GermanySystem germanyCreditDetails = new GermanySystem(amount, interests,payments);
                fees = germanyCreditDetails.calculateLoan();
                System.out.println("Detalle de pagos con el " + AmortizationSystem.SISTEMA_ALEMAN.name());
                for (Integer feeNumber : fees.keySet()) {
                    System.out.println("Cuota #" + feeNumber + " " + fees.get(feeNumber));
                }
                break;
            case 2:
                AmericanSystem americanCreditDetails = new AmericanSystem(amount, interests, payments);
                fees = americanCreditDetails.calculateLoan();
                System.out.println("Detalle de pagos con el " + AmortizationSystem.SISTEMA_AMERICANO.name());
                for (Integer feeNumber : fees.keySet()) {
                    System.out.println("Cuota #" + feeNumber + " " + fees.get(feeNumber));
                }
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
}
