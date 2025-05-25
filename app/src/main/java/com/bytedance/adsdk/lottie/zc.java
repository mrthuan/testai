package com.bytedance.adsdk.lottie;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class zc<V> {
    private final V Qhi;
    private final Throwable cJ;

    public zc(V v10) {
        this.Qhi = v10;
        this.cJ = null;
    }

    public V Qhi() {
        return this.Qhi;
    }

    public Throwable cJ() {
        return this.cJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc)) {
            return false;
        }
        zc zcVar = (zc) obj;
        if (Qhi() != null && Qhi().equals(zcVar.Qhi())) {
            return true;
        }
        if (cJ() == null || zcVar.cJ() == null) {
            return false;
        }
        return cJ().toString().equals(cJ().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Qhi(), cJ()});
    }

    public zc(Throwable th2) {
        this.cJ = th2;
        this.Qhi = null;
    }
}
