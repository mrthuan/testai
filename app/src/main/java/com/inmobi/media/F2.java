package com.inmobi.media;

import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public abstract class F2 {
    public static JSONArray a(E2 it, List skipList) {
        kotlin.jvm.internal.g.e(it, "it");
        kotlin.jvm.internal.g.e(skipList, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list = E2.f14212j;
        if (!skipList.contains("ac")) {
            jSONArray.put(it.f14213a);
        }
        if (!skipList.contains("bid")) {
            jSONArray.put(it.f14214b);
        }
        if (!skipList.contains("its")) {
            jSONArray.put(it.c);
        }
        if (!skipList.contains("vtm")) {
            jSONArray.put(it.f14215d);
        }
        if (!skipList.contains("plid")) {
            jSONArray.put(it.f14216e);
        }
        if (!skipList.contains("catid")) {
            jSONArray.put(it.f14217f);
        }
        if (!skipList.contains("hcd")) {
            jSONArray.put(it.f14218g);
        }
        if (!skipList.contains("hsv")) {
            jSONArray.put(it.f14219h);
        }
        if (!skipList.contains("hcv")) {
            jSONArray.put(it.f14220i);
        }
        return jSONArray;
    }
}
