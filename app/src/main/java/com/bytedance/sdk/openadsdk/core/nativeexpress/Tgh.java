package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.qMt;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.utils.Jma;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ExpressAdLoadManager.java */
/* loaded from: classes.dex */
public class Tgh {
    private static final Set<Tgh> WAv = Collections.synchronizedSet(new HashSet());
    private PAGBannerAdLoadListener CJ;
    private AdSlot Qhi;
    private List<tP> ROR;
    private Qhi Sf;
    private List<tP> Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final Context f9135ac;

    /* renamed from: fl  reason: collision with root package name */
    private final AtomicBoolean f9136fl = new AtomicBoolean(false);

    /* renamed from: hm  reason: collision with root package name */
    private int f9137hm = 5;
    private final ScheduledFuture<?> Gm = null;

    /* renamed from: zc  reason: collision with root package name */
    private ScheduledFuture<?> f9138zc = null;
    private ScheduledFuture<?> ABk = null;
    private final Jma iMK = Jma.cJ();
    private final com.bytedance.sdk.openadsdk.core.tP cJ = com.bytedance.sdk.openadsdk.core.HzH.ac();

    /* compiled from: ExpressAdLoadManager.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi();

        void Qhi(List<tP> list);
    }

    private Tgh(Context context) {
        if (context != null) {
            this.f9135ac = context.getApplicationContext();
        } else {
            this.f9135ac = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
        }
        WAv.add(this);
    }

    private void ac(boolean z10) {
        try {
            ScheduledFuture<?> scheduledFuture = this.Gm;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.ABk.Qhi("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=".concat(String.valueOf(this.Gm.cancel(z10))));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(Jma jma) {
        if (this.CJ != null) {
            Iterator<tP> it = this.ROR.iterator();
            PAGBannerAd pAGBannerAd = null;
            while (it.hasNext() && (pAGBannerAd = Qhi(it.next())) == null) {
            }
            if (pAGBannerAd != null) {
                if (!TextUtils.isEmpty(this.Qhi.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi(this.ROR.get(0), this.iMK.ac());
                }
                this.CJ.onAdLoaded(pAGBannerAd);
                return;
            }
            this.CJ.onError(103, com.bytedance.sdk.openadsdk.core.Sf.Qhi(103));
            Qhi(103);
        }
    }

    public static Tgh Qhi(Context context) {
        return new Tgh(context);
    }

    public void Qhi(AdSlot adSlot, int i10, com.bytedance.sdk.openadsdk.common.fl flVar, int i11) {
        Qhi(adSlot, i10, flVar, null, i11);
    }

    public void Qhi(AdSlot adSlot, int i10, com.bytedance.sdk.openadsdk.common.fl flVar, Qhi qhi, int i11) {
        this.iMK.CJ();
        if (this.f9136fl.get()) {
            com.bytedance.sdk.component.utils.ABk.Qhi("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.f9137hm = i10;
        this.f9136fl.set(true);
        this.Qhi = adSlot;
        if (flVar instanceof PAGBannerAdLoadListener) {
            this.CJ = (PAGBannerAdLoadListener) flVar;
        }
        this.Sf = qhi;
        Qhi(adSlot, flVar);
    }

    private void cJ(boolean z10) {
        try {
            ScheduledFuture<?> scheduledFuture = this.ABk;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.ABk.cancel(z10);
        } catch (Throwable unused) {
        }
    }

    private void cJ() {
        WAv.remove(this);
    }

    private void Qhi(final AdSlot adSlot, com.bytedance.sdk.openadsdk.common.fl flVar) {
        if (adSlot == null) {
            return;
        }
        qMt qmt = new qMt();
        qmt.Sf = 2;
        this.cJ.Qhi(adSlot, qmt, this.f9137hm, new tP.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Tgh.1
            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(int i10, String str) {
                Tgh.this.Qhi(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
                if (qhi.ac() == null || qhi.ac().isEmpty()) {
                    Tgh.this.Qhi(-3, com.bytedance.sdk.openadsdk.core.Sf.Qhi(-3));
                    cJVar.Qhi(-3);
                    com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                    return;
                }
                Tgh.this.Tgh = qhi.ac();
                Tgh.this.ROR = qhi.ac();
                Tgh.this.Qhi(adSlot);
                Tgh tgh = Tgh.this;
                tgh.Qhi(tgh.iMK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(AdSlot adSlot) {
        List<com.bytedance.sdk.openadsdk.core.model.tP> list = this.Tgh;
        if (list == null) {
            return;
        }
        for (com.bytedance.sdk.openadsdk.core.model.tP tPVar : list) {
            if (com.bytedance.sdk.openadsdk.core.model.tP.fl(tPVar) && tPVar.FQ() != null && tPVar.FQ().Gm() != null) {
                if (com.bytedance.sdk.openadsdk.core.HzH.CJ().fl(String.valueOf(tPVar.Hy())) && com.bytedance.sdk.openadsdk.core.HzH.CJ().NBs()) {
                    com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi2 = com.bytedance.sdk.openadsdk.core.model.tP.Qhi(CacheDirFactory.getICacheDir(tPVar.zTC()).ac(), tPVar);
                    Qhi2.Qhi("material_meta", tPVar);
                    Qhi2.Qhi("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(Qhi2, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final Jma jma) {
        if (this.f9136fl.getAndSet(false)) {
            lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Tgh.2
                @Override // java.lang.Runnable
                public void run() {
                    if (Tgh.this.ROR != null && Tgh.this.ROR.size() > 0) {
                        Tgh.this.cJ(jma);
                        if (Tgh.this.Sf != null) {
                            Tgh.this.Sf.Qhi(Tgh.this.ROR);
                        }
                    } else if (Tgh.this.Sf != null) {
                        Tgh.this.Sf.Qhi();
                    }
                    Tgh.this.Qhi();
                }
            });
        }
    }

    private void Qhi(int i10) {
        List<com.bytedance.sdk.openadsdk.core.model.tP> list = this.Tgh;
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi(com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi(this.f9137hm).ac(this.Qhi.getCodeId()).fl((list == null || list.size() <= 0) ? "" : this.Tgh.get(0).jWV()).cJ(i10).Tgh(com.bytedance.sdk.openadsdk.core.Sf.Qhi(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(int i10, String str) {
        if (this.f9136fl.getAndSet(false)) {
            PAGBannerAdLoadListener pAGBannerAdLoadListener = this.CJ;
            if (pAGBannerAdLoadListener != null) {
                pAGBannerAdLoadListener.onError(i10, str);
            }
            Qhi qhi = this.Sf;
            if (qhi != null) {
                qhi.Qhi();
            }
            Qhi();
        }
    }

    private PAGBannerAd Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (this.f9137hm == 1) {
            if (tPVar.FQ() != null) {
                return new com.bytedance.sdk.openadsdk.core.bannerexpress.ac(this.f9135ac, tPVar, this.Qhi);
            }
            return new com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi(this.f9135ac, tPVar, this.Qhi);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi() {
        List<com.bytedance.sdk.openadsdk.core.model.tP> list = this.Tgh;
        if (list != null) {
            list.clear();
        }
        List<com.bytedance.sdk.openadsdk.core.model.tP> list2 = this.ROR;
        if (list2 != null) {
            list2.clear();
        }
        Qhi(true);
        cJ(true);
        ac(true);
        cJ();
    }

    private void Qhi(boolean z10) {
        try {
            ScheduledFuture<?> scheduledFuture = this.f9138zc;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.ABk.Qhi("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=".concat(String.valueOf(this.f9138zc.cancel(z10))));
        } catch (Throwable unused) {
        }
    }
}
