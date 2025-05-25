package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.hpZ;
import com.bytedance.sdk.component.adexpress.cJ.Gm;
import com.bytedance.sdk.component.adexpress.cJ.Sf;
import com.bytedance.sdk.component.adexpress.cJ.hm;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.cJ.pA;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: UGenRenderInterceptor.java */
/* loaded from: classes.dex */
public class fl implements Gm {
    private ScheduledFuture<?> CJ;
    private Context Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private iMK f9206ac;
    private com.bytedance.sdk.openadsdk.core.ugen.ac.ac cJ;

    /* renamed from: fl  reason: collision with root package name */
    private AtomicBoolean f9207fl = new AtomicBoolean(false);

    /* compiled from: UGenRenderInterceptor.java */
    /* loaded from: classes.dex */
    public class Qhi implements Runnable {
        Gm.Qhi Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private int f9208ac;

        public Qhi(int i10, Gm.Qhi qhi) {
            this.f9208ac = i10;
            this.Qhi = qhi;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9208ac == 1) {
                fl.this.cJ.Qhi(true);
                fl flVar = fl.this;
                Gm.Qhi qhi = this.Qhi;
                flVar.Qhi(qhi, ShapeTypes.FLOW_CHART_DOCUMENT, "real time out" + fl.this.f9206ac.Tgh());
            }
        }
    }

    public fl(Context context, com.bytedance.sdk.openadsdk.core.ugen.ac.ac acVar, hm hmVar, iMK imk) {
        this.Qhi = context;
        this.cJ = acVar;
        this.f9206ac = imk;
        this.cJ.Qhi(hmVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm
    public void Qhi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ() {
        try {
            ScheduledFuture<?> scheduledFuture = this.CJ;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.CJ.cancel(false);
            this.CJ = null;
        } catch (Throwable th2) {
            ABk.Qhi("RenderInterceptor", "remove ugen time out task fail", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm
    public boolean Qhi(final Gm.Qhi qhi) {
        int Tgh = this.f9206ac.Tgh();
        if (Tgh < 0) {
            Qhi(qhi, ShapeTypes.FLOW_CHART_DOCUMENT, "time is ".concat(String.valueOf(Tgh)));
        } else {
            this.CJ = lG.Qhi().schedule(new Qhi(1, qhi), Tgh, TimeUnit.MILLISECONDS);
            this.cJ.Qhi(new Sf() { // from class: com.bytedance.sdk.openadsdk.core.ugen.component.fl.1
                @Override // com.bytedance.sdk.component.adexpress.cJ.Sf
                public void Qhi(View view, pA pAVar) {
                    fl.this.cJ();
                    if (qhi.ac()) {
                        return;
                    }
                    hpZ hpz = new hpZ();
                    hpz.Qhi(0);
                    ((com.bytedance.sdk.openadsdk.core.ugen.ac.Qhi) fl.this.f9206ac).NFd().Qhi(hpz);
                    fl.this.f9206ac.fl().WAv();
                    com.bytedance.sdk.component.adexpress.cJ.hpZ cJ = qhi.cJ();
                    if (cJ == null) {
                        return;
                    }
                    cJ.Qhi(fl.this.cJ, pAVar);
                    qhi.Qhi(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.cJ.Sf
                public void Qhi(int i10, String str) {
                    fl.this.Qhi(qhi, i10, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(Gm.Qhi qhi, int i10, String str) {
        com.bytedance.sdk.component.adexpress.cJ.hpZ cJ;
        if (qhi.ac() || this.f9207fl.get()) {
            return;
        }
        cJ();
        hpZ hpz = new hpZ();
        hpz.Qhi(i10);
        hpz.Qhi(str);
        ((com.bytedance.sdk.openadsdk.core.ugen.ac.Qhi) this.f9206ac).NFd().Qhi(hpz);
        if (qhi.cJ(this)) {
            qhi.Qhi(this);
        } else if (qhi.ac() || (cJ = qhi.cJ()) == null) {
            return;
        } else {
            qhi.Qhi(true);
            cJ.a_(i10);
        }
        this.f9207fl.getAndSet(true);
    }
}
