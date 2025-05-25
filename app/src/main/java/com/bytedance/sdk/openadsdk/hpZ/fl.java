// Auto-fixed: added missing class declaration
public class fl {
package com.bytedance.sdk.openadsdk.hpZ;

/* compiled from: NetType.java */
/* loaded from: classes.dex */
public enum fl {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");
    
    private String Sf;

    fl(String str) {
        this.Sf = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.Sf;
    }
}

}
