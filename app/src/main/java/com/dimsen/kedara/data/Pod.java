package com.dimsen.kedara.data;

import java.io.IOException;

public enum Pod {
    D, N;

    public String toValue() {
        switch (this) {
            case D: return "d";
            case N: return "n";
        }
        return null;
    }

    public static Pod forValue(String value) throws IOException {
        if (value.equals("d")) return D;
        if (value.equals("n")) return N;
        throw new IOException("Cannot deserialize Pod");
    }
}
