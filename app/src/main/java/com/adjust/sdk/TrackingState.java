// Auto-fixed: added missing class declaration
public class TrackingState {
package com.adjust.sdk;

/* loaded from: classes.dex */
public enum TrackingState {
    OPTED_OUT(1);
    
    private int value;

    TrackingState(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}

}
