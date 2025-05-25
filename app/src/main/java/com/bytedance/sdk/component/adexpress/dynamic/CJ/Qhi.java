package com.bytedance.sdk.component.adexpress.dynamic.cJ;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.ac.Sf;

/* compiled from: DynamicInteractHelper.java */
/* loaded from: classes.dex */
public class Qhi {
    public static int Qhi(Sf sf2) {
        if (sf2 == null) {
            return 0;
        }
        String es = sf2.es();
        String Dww = sf2.Dww();
        if (TextUtils.isEmpty(Dww) || TextUtils.isEmpty(es) || !Dww.equals("creative")) {
            return 0;
        }
        if (es.equals("shake")) {
            return 2;
        }
        if (es.equals("twist")) {
            return 3;
        }
        if (!es.equals("slide")) {
            return 0;
        }
        return 1;
    }
}
