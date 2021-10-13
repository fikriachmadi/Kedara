package com.dimsen.kedara.data;

import java.io.IOException;

public enum Description {

    BROKEN_CLOUDS, FEW_CLOUDS, LIGHT_RAIN, OVERCAST_CLOUDS, SCATTERED_CLOUDS;


    public String toValue() {
        switch (this) {
            case BROKEN_CLOUDS: return "broken clouds";
            case FEW_CLOUDS: return "few clouds";
            case LIGHT_RAIN: return "light rain";
            case OVERCAST_CLOUDS: return "overcast clouds";
            case SCATTERED_CLOUDS: return "scattered clouds";
        }
        return null;
    }


    public static Description forValue(String value) throws IOException {
        if (value.equals("broken clouds")) return BROKEN_CLOUDS;
        if (value.equals("few clouds")) return FEW_CLOUDS;
        if (value.equals("light rain")) return LIGHT_RAIN;
        if (value.equals("overcast clouds")) return OVERCAST_CLOUDS;
        if (value.equals("scattered clouds")) return SCATTERED_CLOUDS;
        throw new IOException("Cannot deserialize Description");
    }
}
