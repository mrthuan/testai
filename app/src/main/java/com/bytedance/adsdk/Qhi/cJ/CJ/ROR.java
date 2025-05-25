// Auto-fixed: added missing class declaration
public class ROR {
package com.bytedance.adsdk.Qhi.cJ.CJ;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Symbol.java */
/* loaded from: classes.dex */
public enum ROR implements Sf {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");
    
    private static final Map<String, ROR> Tgh;
    private final String ROR;

    static {
        HashMap hashMap = new HashMap(128);
        Tgh = hashMap;
        for (ROR ror : hashMap.values()) {
            Tgh.put(ror.Qhi(), ror);
        }
    }

    ROR(String str) {
        this.ROR = str;
    }

    public static boolean Qhi(Sf sf2) {
        return sf2 instanceof ROR;
    }

    public String Qhi() {
        return this.ROR;
    }
}

}
