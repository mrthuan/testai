package com.bytedance.sdk.openadsdk.MQ.Qhi;

import android.view.View;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.core.model.tP;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PAGBaseMrcTracker.java */
/* loaded from: classes.dex */
public abstract class cJ {
    private final AtomicLong CJ;
    protected WeakReference<View> Qhi;
    private final int ROR;
    private final Integer Sf;
    private final Tgh.Qhi Tgh;

    /* renamed from: ac  reason: collision with root package name */
    protected final AtomicBoolean f8500ac;
    protected tP cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final AtomicBoolean f8501fl;

    /* renamed from: hm  reason: collision with root package name */
    private volatile boolean f8502hm = false;

    public cJ(Integer num, View view, tP tPVar, int i10, Tgh.Qhi qhi) {
        this.Sf = num;
        this.ROR = i10;
        this.cJ = tPVar;
        this.Tgh = qhi;
        Qhi(view);
        this.f8500ac = new AtomicBoolean(false);
        this.CJ = new AtomicLong(-1L);
        this.f8501fl = new AtomicBoolean(false);
    }

    public static cJ Qhi(boolean z10, Integer num, View view, tP tPVar, Tgh.Qhi qhi) {
        return z10 ? new hm(num, view, tPVar, qhi) : new ac(num, view, tPVar, qhi);
    }

    public void ABk() {
        this.f8500ac.set(false);
        Sf();
    }

    public void CJ() {
        if (this.f8501fl.compareAndSet(false, true)) {
            fl.Qhi(this.cJ, fl(), this.Tgh);
        }
    }

    public Integer Gm() {
        return this.Sf;
    }

    public void ROR() {
        if (hm()) {
            return;
        }
        if (!this.f8500ac.get()) {
            Sf();
        } else if (!this.CJ.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.CJ.get() >= this.ROR) {
            CJ();
        }
    }

    public void Sf() {
        this.CJ.set(-1L);
    }

    public abstract int Tgh();

    public void WAv() {
        this.f8502hm = true;
        Sf.cJ(this);
    }

    public abstract boolean ac();

    public int cJ() {
        if (hm()) {
            return 1;
        }
        WeakReference<View> weakReference = this.Qhi;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.f8502hm) {
            return 3;
        }
        if (Gm().equals(view.getTag(33554433))) {
            return Gm().equals(view.getTag(33554433)) && ac() ? 1 : 2;
        }
        WAv();
        Tgh.cJ(Gm());
        return 3;
    }

    public abstract void cJ(int i10);

    public Qhi fl() {
        WeakReference<View> weakReference = this.Qhi;
        if (weakReference == null) {
            return new Qhi(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new Qhi(0, 0, 0.0f);
        }
        return new Qhi(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public boolean hm() {
        return this.f8501fl.get();
    }

    public boolean zc() {
        return this.f8500ac.get();
    }

    public void Qhi() {
        if (this.f8500ac.compareAndSet(false, true)) {
            Sf.Qhi(this);
        }
    }

    public void Qhi(int i10) {
        if (i10 == 4) {
            Qhi();
        } else if (i10 == 8) {
            ABk();
        } else if (i10 == 9) {
            CJ();
        } else {
            cJ(i10);
        }
    }

    public void Qhi(View view) {
        if (view != null) {
            view.setTag(33554433, Gm());
        }
        this.Qhi = new WeakReference<>(view);
    }
}
