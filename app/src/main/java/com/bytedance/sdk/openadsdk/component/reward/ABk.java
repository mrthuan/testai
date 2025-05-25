package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.bxS;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.zc;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.qMt;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.core.video.cJ.Qhi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: RewardVideoLoadManager.java */
/* loaded from: classes.dex */
public class ABk {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ABk Qhi;
    private final Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private com.bytedance.sdk.component.Sf.hm f8776fl;

    /* renamed from: ac  reason: collision with root package name */
    private final AtomicBoolean f8775ac = new AtomicBoolean(false);
    private final List<cJ> CJ = Collections.synchronizedList(new ArrayList());
    private final bxS.Qhi Tgh = new bxS.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.ABk.7
        @Override // com.bytedance.sdk.component.utils.bxS.Qhi
        public void Qhi(Context context, Intent intent, boolean z10, int i10) {
            if (!z10) {
                return;
            }
            if (ABk.this.f8776fl == null) {
                ABk aBk = ABk.this;
                aBk.f8776fl = new com.bytedance.sdk.openadsdk.component.reward.cJ("net connect task", aBk.CJ);
            }
            com.bytedance.sdk.component.utils.Sf.Qhi().post(ABk.this.f8776fl);
        }
    };

    /* compiled from: RewardVideoLoadManager.java */
    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.ABk$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements zc.Qhi<Object> {
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.Qhi CJ;
        final /* synthetic */ boolean Qhi;
        final /* synthetic */ boolean Tgh;

        /* renamed from: ac  reason: collision with root package name */
        final /* synthetic */ AdSlot f8782ac;
        final /* synthetic */ hpZ cJ;

        /* renamed from: fl  reason: collision with root package name */
        final /* synthetic */ ac f8783fl;

        public AnonymousClass6(boolean z10, hpZ hpz, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Qhi qhi, ac acVar, boolean z11) {
            this.Qhi = z10;
            this.cJ = hpz;
            this.f8782ac = adSlot;
            this.CJ = qhi;
            this.f8783fl = acVar;
            this.Tgh = z11;
        }

        @Override // com.bytedance.sdk.openadsdk.component.reward.zc.Qhi
        public void Qhi(boolean z10, Object obj) {
            if (z10) {
                this.cJ.cJ();
            }
            if (this.Qhi) {
                if (z10) {
                    zc.Qhi(ABk.this.cJ).Qhi(this.f8782ac, this.CJ);
                }
            } else if (z10) {
                if (this.f8783fl != null) {
                    if (this.Tgh || HzH.CJ().MQ() == 1) {
                        this.f8783fl.onAdLoaded(this.cJ.Qhi());
                    }
                }
            } else if (this.f8783fl != null) {
                if (this.Tgh || HzH.CJ().MQ() == 1) {
                    this.f8783fl.onError(-1, "");
                }
            }
        }
    }

    /* compiled from: RewardVideoLoadManager.java */
    /* loaded from: classes.dex */
    public static class Qhi implements PAGRewardedAdLoadListener {
        private final PAGRewardedAdLoadListener CJ;
        private final Context Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.core.model.Qhi f8784ac;
        private final AdSlot cJ;

        /* renamed from: fl  reason: collision with root package name */
        private final boolean f8785fl;

        public Qhi(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Qhi qhi, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z10) {
            this.Qhi = context;
            this.cJ = adSlot;
            this.f8784ac = qhi;
            this.CJ = pAGRewardedAdLoadListener;
            this.f8785fl = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: Qhi */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            ABk.Qhi(this.Qhi).Qhi(this.cJ, this.f8784ac, this.CJ, pAGRewardedAd, this.f8785fl);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
        public void onError(int i10, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.CJ;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i10, str);
            }
        }
    }

    /* compiled from: RewardVideoLoadManager.java */
    /* loaded from: classes.dex */
    public static class ac implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.Qhi CJ;
        private final PAGRewardedAdLoadListener Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private final AtomicInteger f8786ac;
        private final AtomicBoolean cJ;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
        public void onError(int i10, String str) {
            if (this.f8786ac.decrementAndGet() <= 0 && this.Qhi != null && this.cJ.compareAndSet(false, true)) {
                this.Qhi.onError(i10, str);
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.ABk.ac.1
                    @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                    public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("req_id", ac.this.CJ.Qhi());
                        return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("choose_ad_load_error").cJ(jSONObject.toString());
                    }
                });
            }
        }

        private ac(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.Qhi qhi) {
            this.cJ = new AtomicBoolean(false);
            this.Qhi = pAGRewardedAdLoadListener;
            this.CJ = qhi;
            this.f8786ac = new AtomicInteger(Qhi());
        }

        private int Qhi() {
            if (this.CJ.CJ()) {
                int i10 = 0;
                for (int i11 = 0; i11 < this.CJ.ac().size(); i11++) {
                    tP tPVar = this.CJ.ac().get(i11);
                    if (tPVar != null && !com.bytedance.sdk.openadsdk.core.model.bxS.Gm(tPVar) && tPVar.FQ() != null) {
                        i10++;
                    }
                }
                return i10;
            }
            return 0;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: Qhi */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.f8786ac.decrementAndGet();
            if (this.Qhi == null || !this.cJ.compareAndSet(false, true)) {
                return;
            }
            this.Qhi.onAdLoaded(pAGRewardedAd);
        }
    }

    /* compiled from: RewardVideoLoadManager.java */
    /* loaded from: classes.dex */
    public static class cJ extends com.bytedance.sdk.component.Sf.hm {
        final tP Qhi;

        /* renamed from: ac  reason: collision with root package name */
        final com.bytedance.sdk.openadsdk.core.model.Qhi f8787ac;
        final AdSlot cJ;

        /* compiled from: RewardVideoLoadManager.java */
        /* renamed from: com.bytedance.sdk.openadsdk.component.reward.ABk$cJ$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements zc.Qhi<Object> {
            public AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.zc.Qhi
            public void Qhi(boolean z10, Object obj) {
                if (z10) {
                    zc Qhi = zc.Qhi(HzH.Qhi());
                    cJ cJVar = cJ.this;
                    Qhi.Qhi(cJVar.cJ, cJVar.f8787ac);
                }
            }
        }

        public cJ(tP tPVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Qhi qhi) {
            super("Reward Task");
            this.Qhi = tPVar;
            this.cJ = adSlot;
            this.f8787ac = qhi;
        }

        @Override // java.lang.Runnable
        public void run() {
            tP tPVar = this.Qhi;
            if (tPVar != null && tPVar.FQ() != null) {
                com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi = tP.Qhi(CacheDirFactory.getICacheDir(this.Qhi.zTC()).Qhi(), this.Qhi);
                Qhi.Qhi("material_meta", this.Qhi);
                Qhi.Qhi("ad_slot", this.cJ);
                com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(Qhi, new com.bykv.vk.openvk.component.video.api.fl.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.ABk.cJ.1
                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10, String str) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10) {
                        zc Qhi2 = zc.Qhi(HzH.Qhi());
                        cJ cJVar = cJ.this;
                        Qhi2.Qhi(cJVar.cJ, cJVar.f8787ac);
                    }
                });
            }
        }
    }

    private ABk(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = HzH.Qhi();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.cJ = applicationContext;
        cJ();
    }

    public void finalize() {
        super.finalize();
        if (this.f8776fl != null) {
            try {
                com.bytedance.sdk.component.utils.Sf.Qhi().removeCallbacks(this.f8776fl);
            } catch (Exception unused) {
            }
            this.f8776fl = null;
        }
        ac();
    }

    private void ac() {
        if (this.f8775ac.get()) {
            this.f8775ac.set(false);
            try {
                bxS.Qhi(this.Tgh);
            } catch (Exception unused) {
            }
        }
    }

    private void cJ(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (TextUtils.isEmpty(adSlot.getBidAdm())) {
            boolean z10 = true;
            com.bytedance.sdk.openadsdk.core.model.Qhi Qhi2 = zc.Qhi(this.cJ).Qhi(adSlot.getCodeId(), true);
            if ((Qhi2 == null || !Qhi2.CJ()) ? false : false) {
                hpZ hpz = new hpZ(this.cJ, Qhi2, adSlot);
                if (!Qhi2.Tgh() && !com.bytedance.sdk.openadsdk.core.model.bxS.Gm(Qhi2.fl())) {
                    hpz.cJ();
                }
                if (pAGRewardedAdLoadListener != null) {
                    if (!Qhi2.Tgh() && HzH.CJ().MQ() == 0) {
                        Qhi(adSlot, Qhi2, pAGRewardedAdLoadListener, (PAGRewardedAd) hpz.Qhi(), true);
                    }
                    ac acVar = new ac(new Qhi(this.cJ, adSlot, Qhi2, pAGRewardedAdLoadListener, true), Qhi2);
                    for (int i10 = 0; i10 < Qhi2.ac().size(); i10++) {
                        Qhi(Qhi2.ac().get(i10), adSlot, acVar, hpz, Qhi2.Tgh());
                        if (Qhi2.Gm()) {
                            break;
                        }
                    }
                }
                for (int i11 = 0; i11 < Qhi2.ac().size(); i11++) {
                    com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(Qhi2.ac().get(i11), new Qhi.InterfaceC0131Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.ABk.1
                    });
                }
                return;
            }
        }
        Qhi(adSlot, false, pAGRewardedAdLoadListener);
    }

    public static ABk Qhi(Context context) {
        if (Qhi == null) {
            synchronized (ABk.class) {
                if (Qhi == null) {
                    Qhi = new ABk(context);
                }
            }
        }
        return Qhi;
    }

    public void Qhi(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm()) || zc.Qhi(this.cJ).Qhi(adSlot.getCodeId(), false) != null) {
            return;
        }
        Qhi(adSlot, true, null);
    }

    public void Qhi(String str, tP tPVar) {
        zc.Qhi(this.cJ).Qhi(str, tPVar);
    }

    public void Qhi() {
        try {
            zc.Qhi(this.cJ).Qhi();
        } catch (Throwable unused) {
        }
    }

    public void Qhi(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        cJ(adSlot, pAGRewardedAdLoadListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (com.bytedance.sdk.openadsdk.core.HzH.CJ().MQ() != 1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(com.bytedance.sdk.openadsdk.core.model.tP r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.ABk.ac r6, final com.bytedance.sdk.openadsdk.component.reward.hpZ r7, final boolean r8) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L11
            r1 = 1
            if (r8 != 0) goto L12
            com.bytedance.sdk.openadsdk.core.settings.ROR r2 = com.bytedance.sdk.openadsdk.core.HzH.CJ()
            int r2 = r2.MQ()
            if (r2 != r1) goto L11
            goto L12
        L11:
            r1 = r0
        L12:
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.bxS.Gm(r4)
            if (r2 != 0) goto L3b
            int r1 = r4.zTC()
            com.bykv.vk.openvk.component.video.api.Qhi.cJ r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            java.lang.String r1 = r1.Qhi()
            com.bytedance.sdk.openadsdk.core.video.Qhi.cJ r1 = com.bytedance.sdk.openadsdk.core.model.tP.Qhi(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.Qhi(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.Qhi(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.ABk$2 r4 = new com.bytedance.sdk.openadsdk.component.reward.ABk$2
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(r1, r4)
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L45
            com.bytedance.sdk.openadsdk.component.reward.hm r4 = r7.Qhi()
            r6.onAdLoaded(r4)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ABk.Qhi(com.bytedance.sdk.openadsdk.core.model.tP, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.ABk$ac, com.bytedance.sdk.openadsdk.component.reward.hpZ, boolean):void");
    }

    private void cJ(AdSlot adSlot) {
        if (Tgh.cJ() != 2) {
            return;
        }
        zc.Qhi(this.cJ).Qhi(adSlot.getCodeId());
    }

    private void Qhi(final AdSlot adSlot, final boolean z10, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.ABk.CJ()) {
            com.bykv.vk.openvk.component.video.api.Tgh.cJ.Qhi(adSlot.getBidAdm());
        }
        final long currentTimeMillis = System.currentTimeMillis();
        qMt qmt = new qMt();
        qmt.cJ = z10 ? 2 : 1;
        if (HzH.CJ().zc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            qmt.Sf = 2;
        }
        HzH.ac().Qhi(adSlot, qmt, 7, new tP.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.ABk.3
            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(int i10, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
                if (z10 || (pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener) == null) {
                    return;
                }
                pAGRewardedAdLoadListener2.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
                if (qhi.ac() != null && !qhi.ac().isEmpty()) {
                    hpZ hpz = new hpZ(ABk.this.cJ, qhi, adSlot);
                    if (!z10) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.Gm.ac.Qhi(qhi.fl(), System.currentTimeMillis() - currentTimeMillis);
                        }
                        if (!qhi.Tgh() && pAGRewardedAdLoadListener != null && HzH.CJ().MQ() == 0) {
                            ABk.this.Qhi(adSlot, qhi, pAGRewardedAdLoadListener, (PAGRewardedAd) hpz.Qhi(), false);
                        }
                    }
                    ac acVar = new ac(new Qhi(ABk.this.cJ, adSlot, qhi, pAGRewardedAdLoadListener, false), qhi);
                    for (int i10 = 0; i10 < qhi.ac().size(); i10++) {
                        ABk.this.Qhi(qhi, qhi.ac().get(i10), hpz, adSlot, z10, acVar, qhi.Tgh());
                        if (qhi.Gm()) {
                            return;
                        }
                    }
                } else if (!z10 && (pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener) != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.Sf.Qhi(-3));
                    cJVar.Qhi(-3);
                    com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                }
            }
        });
    }

    private void cJ() {
        if (this.f8775ac.get()) {
            return;
        }
        this.f8775ac.set(true);
        bxS.Qhi(this.Tgh, this.cJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final com.bytedance.sdk.openadsdk.core.model.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.tP tPVar, final hpZ hpz, final AdSlot adSlot, final boolean z10, final ac acVar, final boolean z11) {
        com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(tPVar, new Qhi.InterfaceC0131Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.ABk.4
        });
        boolean z12 = true;
        if (z10 && !com.bytedance.sdk.openadsdk.core.model.bxS.Gm(tPVar) && HzH.CJ().Eh(adSlot.getCodeId()).CJ == 1 && !com.bytedance.sdk.component.utils.hpZ.CJ(this.cJ)) {
            Qhi(new cJ(tPVar, adSlot, qhi));
            return;
        }
        boolean z13 = false;
        if (acVar == null || (!z11 && HzH.CJ().MQ() != 1)) {
            z12 = false;
        }
        if (!com.bytedance.sdk.openadsdk.core.model.bxS.Gm(tPVar)) {
            if (tPVar.FQ() != null) {
                com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi2 = com.bytedance.sdk.openadsdk.core.model.tP.Qhi(CacheDirFactory.getICacheDir(tPVar.zTC()).Qhi(), tPVar);
                Qhi2.Qhi("material_meta", tPVar);
                Qhi2.Qhi("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(Qhi2, new com.bykv.vk.openvk.component.video.api.fl.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.ABk.5
                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar2, int i10) {
                        hpz.cJ();
                        if (z10) {
                            zc.Qhi(ABk.this.cJ).Qhi(adSlot, qhi);
                        } else if (acVar != null) {
                            if (z11 || HzH.CJ().MQ() == 1) {
                                acVar.onAdLoaded(hpz.Qhi());
                            }
                        }
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar2, int i10, String str) {
                        if (acVar != null) {
                            if (z11 || HzH.CJ().MQ() == 1) {
                                acVar.onError(i10, str);
                            }
                        }
                    }
                });
            } else {
                z13 = z12;
            }
            z12 = z13;
        } else if (z10) {
            zc.Qhi(this.cJ).Qhi(adSlot, qhi);
        }
        if (z12) {
            acVar.onAdLoaded(hpz.Qhi());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Qhi qhi, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, boolean z10) {
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
        int cJ2 = Tgh.cJ();
        if (!z10) {
            if (cJ2 == 2) {
                zc.Qhi(this.cJ).Qhi(adSlot, qhi);
                cJ(adSlot);
            }
        } else if (cJ2 == 2) {
            cJ(adSlot);
        } else if (cJ2 == 1) {
            zc.Qhi(this.cJ).Qhi(adSlot.getCodeId(), (com.bytedance.sdk.openadsdk.core.model.tP) null);
        }
    }

    private void Qhi(cJ cJVar) {
        if (cJVar == null) {
            return;
        }
        if (this.CJ.size() > 0) {
            this.CJ.remove(0);
        }
        this.CJ.add(cJVar);
    }
}
