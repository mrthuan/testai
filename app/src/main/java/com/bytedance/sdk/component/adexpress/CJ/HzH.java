package com.bytedance.sdk.component.adexpress.cJ;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.CJ.qMt;
import com.bytedance.sdk.component.adexpress.cJ.Gm;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewRenderInterceptor.java */
/* loaded from: classes.dex */
public class HzH implements Gm {
    private iMK CJ;
    private Context Qhi;
    private AtomicBoolean Tgh = new AtomicBoolean(false);

    /* renamed from: ac  reason: collision with root package name */
    private hm f8138ac;
    private com.bytedance.sdk.component.adexpress.fl.Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private ScheduledFuture<?> f8139fl;

    /* compiled from: WebViewRenderInterceptor.java */
    /* loaded from: classes.dex */
    public class Qhi implements Runnable {
        Gm.Qhi Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private int f8140ac;

        public Qhi(int i10, Gm.Qhi qhi) {
            this.f8140ac = i10;
            this.Qhi = qhi;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8140ac == 1) {
                HzH.this.cJ.Qhi(true);
                HzH.this.Qhi(this.Qhi, 107, null);
            }
        }
    }

    public HzH(Context context, iMK imk, com.bytedance.sdk.component.adexpress.fl.Qhi qhi, hm hmVar) {
        this.Qhi = context;
        this.CJ = imk;
        this.f8138ac = hmVar;
        this.cJ = qhi;
        qhi.Qhi(this.f8138ac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f8139fl;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f8139fl.cancel(false);
                this.f8139fl = null;
            }
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.fl.Qhi cJ() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm
    public boolean Qhi(final Gm.Qhi qhi) {
        int Tgh = this.CJ.Tgh();
        if (Tgh < 0) {
            Qhi(qhi, 107, "time is ".concat(String.valueOf(Tgh)));
        } else {
            this.f8139fl = qMt.Qhi(new Qhi(1, qhi), Tgh, TimeUnit.MILLISECONDS);
            this.cJ.Qhi(new Sf() { // from class: com.bytedance.sdk.component.adexpress.cJ.HzH.1
                @Override // com.bytedance.sdk.component.adexpress.cJ.Sf
                public void Qhi(View view, pA pAVar) {
                    hpZ cJ;
                    HzH.this.ac();
                    if (qhi.ac() || (cJ = qhi.cJ()) == null) {
                        return;
                    }
                    cJ.Qhi(HzH.this.cJ, pAVar);
                    qhi.Qhi(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.cJ.Sf
                public void Qhi(int i10, String str) {
                    HzH.this.Qhi(qhi, i10, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm
    public void Qhi() {
        this.cJ.CJ();
        ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(Gm.Qhi qhi, int i10, String str) {
        hpZ cJ;
        if (qhi.ac() || this.Tgh.get()) {
            return;
        }
        ac();
        this.CJ.fl().Qhi(i10, str);
        if (qhi.cJ(this)) {
            qhi.Qhi(this);
        } else if (qhi.ac() || (cJ = qhi.cJ()) == null) {
            return;
        } else {
            qhi.Qhi(true);
            cJ.a_(i10);
        }
        this.Tgh.getAndSet(true);
    }
}
