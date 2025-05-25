package com.bytedance.sdk.component.adexpress.dynamic.Qhi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.qMt;
import com.bytedance.sdk.component.adexpress.ac;
import com.bytedance.sdk.component.adexpress.cJ.Sf;
import com.bytedance.sdk.component.adexpress.cJ.fl;
import com.bytedance.sdk.component.adexpress.cJ.hm;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.cJ.pA;
import com.bytedance.sdk.component.adexpress.cJ.zc;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.WAv;
import com.bytedance.sdk.component.adexpress.dynamic.ac.ROR;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Tgh;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* compiled from: DynamicRender.java */
/* loaded from: classes.dex */
public class Qhi implements fl<DynamicRootView>, zc {
    private Sf CJ;
    private DynamicRootView Qhi;
    private ScheduledFuture<?> ROR;
    private AtomicBoolean Sf = new AtomicBoolean(false);
    private iMK Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private Context f8171ac;
    private WAv cJ;

    /* renamed from: fl  reason: collision with root package name */
    private hm f8172fl;

    /* compiled from: DynamicRender.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0087Qhi implements Runnable {
        private int cJ;

        public RunnableC0087Qhi(int i10) {
            this.cJ = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            if (this.cJ == 2) {
                if (Qhi.this.cJ instanceof com.bytedance.sdk.component.adexpress.dynamic.CJ.hm) {
                    i10 = ShapeTypes.VERTICAL_SCROLL;
                } else {
                    i10 = 117;
                }
                Qhi.this.Qhi.Qhi(i10, (String) null);
            }
        }
    }

    public Qhi(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, WAv wAv, iMK imk, com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi qhi) {
        this.f8171ac = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z10, imk, qhi);
        this.Qhi = dynamicRootView;
        this.cJ = wAv;
        this.Tgh = imk;
        dynamicRootView.setRenderListener(this);
        this.Tgh = imk;
    }

    private boolean ROR() {
        DynamicRootView dynamicRootView = this.Qhi;
        if (dynamicRootView == null || dynamicRootView.getChildCount() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sf() {
        try {
            ScheduledFuture<?> scheduledFuture = this.ROR;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.ROR.cancel(false);
                this.ROR = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tgh() {
        int i10;
        boolean z10;
        this.Tgh.fl().cJ(ac());
        JSONObject ac2 = this.Tgh.ac();
        if (!com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.Qhi(ac2)) {
            if (this.cJ instanceof com.bytedance.sdk.component.adexpress.dynamic.CJ.hm) {
                i10 = 123;
            } else {
                i10 = 113;
            }
            DynamicRootView dynamicRootView = this.Qhi;
            StringBuilder sb2 = new StringBuilder("data null is ");
            if (ac2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            dynamicRootView.Qhi(i10, sb2.toString());
            return;
        }
        this.cJ.Qhi(new com.bytedance.sdk.component.adexpress.dynamic.fl.cJ() { // from class: com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi.2
            @Override // com.bytedance.sdk.component.adexpress.dynamic.fl.cJ
            public void Qhi(final com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
                Qhi.this.Sf();
                Qhi.this.Tgh.fl().ac(Qhi.this.ac());
                Qhi.this.Qhi(hmVar);
                Qhi.this.cJ(hmVar);
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    Qhi.this.ac(hmVar);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Qhi.this.ac(hmVar);
                        }
                    });
                }
                if (Qhi.this.Qhi != null && hmVar != null) {
                    Qhi.this.Qhi.setBgColor(hmVar.Qhi());
                    Qhi.this.Qhi.setBgMaterialCenterCalcColor(hmVar.cJ());
                }
            }
        });
        this.cJ.Qhi(this.Tgh);
    }

    public DynamicRootView CJ() {
        return this.Qhi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
        float f10;
        float f11;
        List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> Gm;
        if (hmVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> Gm2 = hmVar.Gm();
        if (Gm2 == null || Gm2.size() <= 0) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar2 : Gm2) {
                if (hmVar2.ROR() > hmVar.ROR() - hmVar2.hm() || (Gm = hmVar2.Gm()) == null || Gm.size() <= 0) {
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar3 : Gm) {
                        if (hmVar3.WAv().cJ().equals("logo-union")) {
                            f11 = hmVar3.WAv().Tgh();
                            f10 = hmVar2.WAv().fl().wp() + ((hmVar.ROR() + (-f11)) - hmVar2.ROR());
                        }
                    }
                }
                cJ(hmVar2);
                if (f11 <= -15.0f) {
                    hmVar2.Tgh(hmVar2.hm() - f11);
                    hmVar2.CJ(hmVar2.ROR() + f11);
                    for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar4 : hmVar2.Gm()) {
                        hmVar4.CJ(hmVar4.ROR() - f11);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.ac.hm zc2 = hmVar.zc();
        if (zc2 == null) {
            return;
        }
        hmVar.ac(hmVar.Tgh() - zc2.Tgh());
        hmVar.CJ(hmVar.ROR() - zc2.ROR());
        if (f10 > 0.0f) {
            hmVar.CJ(hmVar.ROR() - f10);
            hmVar.Tgh(hmVar.hm() + f10);
            for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar5 : hmVar.Gm()) {
                hmVar5.CJ(hmVar5.ROR() + f10);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    public void Qhi(Sf sf2) {
        this.CJ = sf2;
        int Tgh = this.Tgh.Tgh();
        if (Tgh < 0) {
            this.Qhi.Qhi(this.cJ instanceof com.bytedance.sdk.component.adexpress.dynamic.CJ.hm ? ShapeTypes.VERTICAL_SCROLL : 117, "time is ".concat(String.valueOf(Tgh)));
            return;
        }
        this.ROR = qMt.Qhi(new RunnableC0087Qhi(2), Tgh, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.Tgh.hm() <= 0) {
            Tgh();
        } else {
            com.bytedance.sdk.component.utils.Sf.cJ().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi.1
                @Override // java.lang.Runnable
                public void run() {
                    Qhi.this.Tgh();
                }
            }, this.Tgh.hm());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    public int ac() {
        return this.cJ instanceof com.bytedance.sdk.component.adexpress.dynamic.CJ.hm ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
        if (hmVar == null) {
            this.Qhi.Qhi(this.cJ instanceof com.bytedance.sdk.component.adexpress.dynamic.CJ.hm ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.Tgh.fl().CJ(ac());
        try {
            this.Qhi.Qhi(hmVar, ac());
        } catch (Exception e10) {
            int i10 = this.cJ instanceof com.bytedance.sdk.component.adexpress.dynamic.CJ.hm ? 128 : 118;
            DynamicRootView dynamicRootView = this.Qhi;
            dynamicRootView.Qhi(i10, "exception is " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.ac.hm> Gm;
        if (hmVar == null || (Gm = hmVar.Gm()) == null || Gm.size() <= 0) {
            return;
        }
        Collections.sort(Gm, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.ac.hm>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi.3
            @Override // java.util.Comparator
            /* renamed from: Qhi */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar2, com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar3) {
                ROR fl2 = hmVar2.WAv().fl();
                ROR fl3 = hmVar3.WAv().fl();
                if (fl2 != null && fl3 != null) {
                    if (fl2.rB() >= fl3.rB()) {
                        return 1;
                    }
                    return -1;
                }
                return 0;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.ac.hm hmVar2 : Gm) {
            if (hmVar2 != null) {
                Qhi(hmVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    /* renamed from: Qhi */
    public DynamicRootView fl() {
        return CJ();
    }

    private void Qhi(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                Qhi(viewGroup.getChildAt(i10));
                i10++;
            }
        }
        if (view instanceof Tgh) {
            ((Tgh) view).cJ();
        }
    }

    public void Qhi(hm hmVar) {
        this.f8172fl = hmVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.zc
    public void Qhi(pA pAVar) {
        if (this.Sf.get()) {
            return;
        }
        this.Sf.set(true);
        if (pAVar.ac() && ROR()) {
            this.Qhi.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.CJ.Qhi(fl(), pAVar);
            return;
        }
        this.CJ.Qhi(pAVar.Gm(), pAVar.WAv());
    }

    public void cJ() {
        Qhi(fl());
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.zc
    public void Qhi(View view, int i10, ac acVar) {
        hm hmVar = this.f8172fl;
        if (hmVar != null) {
            hmVar.Qhi(view, i10, acVar);
        }
    }
}
