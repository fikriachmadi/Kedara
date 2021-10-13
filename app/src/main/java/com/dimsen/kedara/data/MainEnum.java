package com.dimsen.kedara.data;

import java.io.IOException;

public enum MainEnum {
    CLOUDS, RAIN;

    public String toValue() {
        switch (this) {
            case CLOUDS: return "Clouds";
            case RAIN: return "Rain";
        }
        return null;
    }

    public static MainEnum forValue(String value) throws IOException {
        if (value.equals("Clouds")) return CLOUDS;
        if (value.equals("Rain")) return RAIN;
        throw new IOException("Cannot deserialize MainEnum");
    }
}
