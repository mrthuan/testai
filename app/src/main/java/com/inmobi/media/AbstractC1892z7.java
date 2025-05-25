package com.inmobi.media;

/* renamed from: com.inmobi.media.z7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1892z7 {
    public static A7 a() {
        synchronized (A7.f14125d) {
            A7 a72 = A7.f14126e;
            if (a72 != null) {
                A7.f14126e = a72.c;
                a72.c = null;
                A7.f14127f--;
                return a72;
            }
            return new A7();
        }
    }
}
