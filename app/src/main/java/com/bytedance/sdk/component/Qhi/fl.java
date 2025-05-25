package com.bytedance.sdk.component.Qhi;

import com.bytedance.component.sdk.annotation.CallSuper;

/* compiled from: BaseStatefulMethod.java */
/* loaded from: classes.dex */
public abstract class fl<P, R> extends com.bytedance.sdk.component.Qhi.cJ<P, R> {
    private boolean Qhi = true;

    /* renamed from: ac  reason: collision with root package name */
    private ROR f7992ac;
    private Qhi cJ;

    /* compiled from: BaseStatefulMethod.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(Object obj);

        void Qhi(Throwable th2);
    }

    /* compiled from: BaseStatefulMethod.java */
    /* loaded from: classes.dex */
    public interface cJ {
        fl Qhi();
    }

    private boolean Tgh() {
        if (!this.Qhi) {
            WAv.Qhi(new IllegalStateException("Jsb async call already finished: " + Qhi() + ", hashcode: " + hashCode()));
            return false;
        }
        return true;
    }

    @CallSuper
    public void CJ() {
        this.Qhi = false;
        this.f7992ac = null;
    }

    @Override // com.bytedance.sdk.component.Qhi.cJ
    public /* bridge */ /* synthetic */ String Qhi() {
        return super.Qhi();
    }

    public abstract void Qhi(P p10, ROR ror);

    public final void ac() {
        Qhi((Throwable) null);
    }

    public void fl() {
        CJ();
    }

    public final void Qhi(R r4) {
        if (Tgh()) {
            this.cJ.Qhi(r4);
            CJ();
        }
    }

    public final void Qhi(Throwable th2) {
        if (Tgh()) {
            this.cJ.Qhi(th2);
            CJ();
        }
    }

    public void Qhi(P p10, ROR ror, Qhi qhi) {
        this.f7992ac = ror;
        this.cJ = qhi;
        Qhi(p10, ror);
    }
}
