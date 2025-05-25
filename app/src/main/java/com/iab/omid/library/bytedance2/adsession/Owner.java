// Auto-fixed: added missing class declaration
public class Owner {
package com.iab.omid.library.bytedance2.adsession;

/* loaded from: classes2.dex */
public enum Owner {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");
    
    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}

}
