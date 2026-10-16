
package com.foobnix.pdf.search.activity.msg;

public class MessegeBrightness {

    private final int value;
    private final boolean blueLightOnly;

    public MessegeBrightness(int value) {
        this(value, false);
    }

    public MessegeBrightness(int value, boolean blueLightOnly) {
        super();
        this.value = value;
        this.blueLightOnly = blueLightOnly;
    }

    public int getValue() {
        return value;
    }

    public boolean isBlueLightOnly() {
        return blueLightOnly;
    }
}
