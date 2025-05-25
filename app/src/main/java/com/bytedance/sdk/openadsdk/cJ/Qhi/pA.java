package com.bytedance.sdk.openadsdk.cJ.Qhi;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TrackUrlStrategy.java */
/* loaded from: classes.dex */
public class pA {
    public static pA Qhi = new pA();
    private volatile boolean CJ;

    /* renamed from: ac  reason: collision with root package name */
    private final Map<String, Qhi> f8657ac = new HashMap();
    private Qhi cJ;

    /* compiled from: TrackUrlStrategy.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private final int Qhi;
        private final int cJ;

        public Qhi(int i10, int i11) {
            this.Qhi = (i10 < 0 || i10 > 5) ? 3 : 3;
            this.cJ = i11 < 10 ? 30 : i11;
        }

        public int Qhi() {
            return this.Qhi;
        }

        public int cJ() {
            return this.cJ;
        }
    }

    private int ac() {
        Qhi qhi = this.cJ;
        if (qhi != null) {
            return qhi.cJ();
        }
        return 30;
    }

    private int cJ() {
        Qhi qhi = this.cJ;
        if (qhi != null) {
            return qhi.Qhi();
        }
        return 3;
    }

    public void Qhi(Qhi qhi) {
        this.cJ = qhi;
    }

    public void Qhi(String str, Qhi qhi) {
        if (TextUtils.isEmpty(str) || qhi == null) {
            return;
        }
        this.f8657ac.put(str, qhi);
    }

    public int cJ(String str) {
        Qhi qhi = this.f8657ac.get(str);
        if (qhi == null) {
            return ac();
        }
        return qhi.cJ();
    }

    public int Qhi(String str) {
        if (Qhi()) {
            Qhi qhi = this.f8657ac.get(str);
            if (qhi == null) {
                return cJ();
            }
            return qhi.Qhi();
        }
        return 4;
    }

    public boolean Qhi() {
        return this.CJ;
    }

    public void Qhi(boolean z10) {
        this.CJ = z10;
    }
}
