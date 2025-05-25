package com.inmobi.media;

import java.util.BitSet;

/* loaded from: classes2.dex */
public abstract class K3 {

    /* renamed from: a  reason: collision with root package name */
    public final E1 f14387a;

    public K3(String b64feature) {
        kotlin.jvm.internal.g.e(b64feature, "b64feature");
        E1 e12 = new E1();
        this.f14387a = e12;
        e12.a(b64feature);
    }

    public final boolean a(boolean z10) {
        BitSet bitSet = this.f14387a.f14211a;
        if (bitSet != null) {
            return bitSet.get(0);
        }
        return z10;
    }
}
