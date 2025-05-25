// Auto-fixed: added missing class declaration
public class ParameterClassification {
package com.facebook.appevents;

/* compiled from: OperationalData.kt */
/* loaded from: classes.dex */
public enum ParameterClassification {
    CustomData("custom_data"),
    OperationalData("operational_data"),
    CustomAndOperationalData("custom_and_operational_data");
    
    private final String value;

    ParameterClassification(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}

}
