package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ComponentRegistrar.java */
/* loaded from: classes.dex */
public class fl {
    private static Map<String, cJ> Qhi = new HashMap();

    public static void Qhi(List<cJ> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (cJ cJVar : list) {
            if (cJVar != null) {
                Qhi.put(cJVar.Qhi(), cJVar);
            }
        }
    }

    public static cJ Qhi(String str) {
        return Qhi.get(str);
    }
}
