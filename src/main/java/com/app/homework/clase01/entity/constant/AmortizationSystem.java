package com.app.homework.clase01.entity.constant;

public enum AmortizationSystem {
    SISTEMA_ALEMAN("1"),
    SISTEMA_AMERICANO("2"),
    SISTEMA_AMIGO("3"),
    SISTEMA_FRANCES("4");

    private final String key;

    AmortizationSystem(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }

    public static String getNameByKey(int key){
        for(AmortizationSystem e : AmortizationSystem.values()){
            if(key == Integer.parseInt(e.key)) return e.name();
        }
        return null;
    }
    public static String getAllAmortizationSystems(){
        StringBuilder data = new StringBuilder();
        String separator = " - ";
        for (AmortizationSystem value: AmortizationSystem.values()) {
            data.append(value.key()).append(separator).append(value.name()).append("\n");
        }
        return data.toString();
    }
}
