package com.dimsen.kedara.data;

import java.io.IOException;

public enum Icon {
    THE_02_D, THE_03_D, THE_04_D, THE_04_N, THE_10_D, THE_10_N;

    public String toValue() {
        switch (this) {
            case THE_02_D: return "02d";
            case THE_03_D: return "03d";
            case THE_04_D: return "04d";
            case THE_04_N: return "04n";
            case THE_10_D: return "10d";
            case THE_10_N: return "10n";
        }
        return null;
    }

    public static Icon forValue(String value) throws IOException {
        if (value.equals("02d")) return THE_02_D;
        if (value.equals("03d")) return THE_03_D;
        if (value.equals("04d")) return THE_04_D;
        if (value.equals("04n")) return THE_04_N;
        if (value.equals("10d")) return THE_10_D;
        if (value.equals("10n")) return THE_10_N;
        throw new IOException("Cannot deserialize Icon");
    }
}
