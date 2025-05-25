package com.bytedance.sdk.component.Tgh.Qhi;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: AdLogManager.java */
/* loaded from: classes.dex */
public class cJ {
    private static volatile List<Object> Qhi = new ArrayList();

    public static void CJ() {
        fl.Qhi.cJ();
    }

    public static void Qhi(Qhi qhi, Context context) {
        fl.Qhi.Qhi(qhi, context);
    }

    public static void ac() {
        Qhi(false);
        fl.Qhi.Qhi();
    }

    public static boolean cJ() {
        if (hm.ROR().hpZ() != null && hm.ROR().Tgh() != null) {
            return false;
        }
        return true;
    }

    public static void fl() {
        fl flVar = fl.Qhi;
    }

    public static void Qhi(boolean z10) {
        fl.Qhi.Qhi(z10);
    }

    public static List<Object> Qhi() {
        return Qhi;
    }

    public static void Qhi(String str, boolean z10) {
        fl.Qhi.Qhi(str, z10);
    }

    public static void Qhi(String str, List<String> list, boolean z10, int i10, String str2) {
        Qhi(str, list, z10, null, i10, str2);
    }

    public static void Qhi(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        fl.Qhi.Qhi(str, list, z10, map, i10, str2);
    }

    public static void Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh) {
        fl.Qhi.Qhi(tgh);
    }
}
