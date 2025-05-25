// Auto-fixed: added missing class declaration
public class ErrorType {
package com.iab.omid.library.inmobi.adsession;

/* loaded from: classes2.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO("video");
    
    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.errorType;
    }
}

}
