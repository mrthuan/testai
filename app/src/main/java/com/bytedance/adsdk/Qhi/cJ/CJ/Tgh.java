// Auto-fixed: added missing class declaration
public class Tgh {
package com.bytedance.adsdk.Qhi.cJ.CJ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: Operator.java */
/* loaded from: classes.dex */
public enum Tgh implements Sf {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION(PackagingURIHelper.FORWARD_SLASH_STRING, 4),
    MOD("%", 4);
    
    private final String kYc;
    private final int tP;
    private static final Map<String, Tgh> hpZ = new HashMap(128);
    private static final Set<Tgh> HzH = new HashSet();

    static {
        Tgh[] values;
        for (Tgh tgh : values()) {
            hpZ.put(tgh.Qhi(), tgh);
            HzH.add(tgh);
        }
    }

    Tgh(String str, int i10) {
        this.kYc = str;
        this.tP = i10;
    }

    public static Tgh Qhi(String str) {
        return hpZ.get(str);
    }

    public int cJ() {
        return this.tP;
    }

    public static boolean Qhi(Sf sf2) {
        return sf2 instanceof Tgh;
    }

    public String Qhi() {
        return this.kYc;
    }
}

}
