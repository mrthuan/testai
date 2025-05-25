// Auto-fixed: added missing class declaration
public class Qhi {
package com.bytedance.sdk.openadsdk.core.ROR.Qhi;

import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: VastErrorCode.java */
/* loaded from: classes.dex */
public enum Qhi {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD),
    UNDEFINED_ERROR(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
    
    private final int Sf;

    Qhi(int i10) {
        this.Sf = i10;
    }

    public String Qhi() {
        return String.valueOf(this.Sf);
    }
}

}
