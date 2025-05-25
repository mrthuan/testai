package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class D4 {
    public static void a() {
        try {
            Iterator it = E4.f14222a.iterator();
            while (it.hasNext()) {
                X5 x52 = (X5) ((WeakReference) it.next()).get();
                if (x52 != null) {
                    x52.a();
                }
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }
}
