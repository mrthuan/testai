// Auto-fixed: added missing class declaration
public class AdSessionContextType {
package com.iab.omid.library.bytedance2.adsession;

/* loaded from: classes2.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}

}
