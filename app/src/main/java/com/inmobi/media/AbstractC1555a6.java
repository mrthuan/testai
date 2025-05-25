package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.inmobi.media.a6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1555a6 {
    public static void a(C9 c92) {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC1569b6.f14964a;
        Objects.toString(c92);
        if (c92 == null) {
            return;
        }
        try {
            Iterator it = AbstractC1569b6.f14964a.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || kotlin.jvm.internal.g.a(weakReference.get(), c92)) {
                    AbstractC1569b6.f14964a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }
}
