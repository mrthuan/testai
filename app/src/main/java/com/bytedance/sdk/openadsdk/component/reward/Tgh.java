package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.bxS;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.fl;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.qMt;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.core.video.cJ.Qhi;
import com.bytedance.sdk.openadsdk.utils.Jma;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: FullScreenVideoLoadManager.java */
/* loaded from: classes.dex */
public class Tgh {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Tgh Qhi;
    private final Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private com.bytedance.sdk.component.Sf.hm f8838fl;

    /* renamed from: ac  reason: collision with root package name */
    private final AtomicBoolean f8837ac = new AtomicBoolean(false);
    private final List<ac> CJ = Collections.synchronizedList(new ArrayList());
    private final bxS.Qhi Tgh = new bxS.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Tgh.7
        @Override // com.bytedance.sdk.component.utils.bxS.Qhi
        public void Qhi(Context context, Intent intent, boolean z10, int i10) {
            if (!z10) {
                return;
            }
            if (Tgh.this.f8838fl == null) {
                Tgh tgh = Tgh.this;
                tgh.f8838fl = new com.bytedance.sdk.openadsdk.component.reward.cJ("fsv net connect task", tgh.CJ);
            }
            com.bytedance.sdk.component.utils.Sf.Qhi().post(Tgh.this.f8838fl);
        }
    };

    /* compiled from: FullScreenVideoLoadManager.java */
    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.Tgh$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements fl.Qhi<Object> {
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.Qhi CJ;
        final /* synthetic */ boolean Qhi;
        final /* synthetic */ boolean Tgh;

        /* renamed from: ac  reason: collision with root package name */
        final /* synthetic */ AdSlot f8844ac;
        final /* synthetic */ pA cJ;

        /* renamed from: fl  reason: collision with root package name */
        final /* synthetic */ cJ f8845fl;

        public AnonymousClass6(boolean z10, pA pAVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Qhi qhi, cJ cJVar, boolean z11) {
            this.Qhi = z10;
            this.cJ = pAVar;
            this.f8844ac = adSlot;
            this.CJ = qhi;
            this.f8845fl = cJVar;
            this.Tgh = z11;
        }

        @Override // com.bytedance.sdk.openadsdk.component.reward.fl.Qhi
        public void Qhi(boolean z10, Object obj) {
            if (z10) {
                this.cJ.cJ();
            }
            if (this.Qhi) {
                if (z10) {
                    fl.Qhi(Tgh.this.cJ).Qhi(this.f8844ac, this.CJ);
                }
            } else if (z10) {
                if (this.f8845fl != null) {
                    if (this.Tgh || HzH.CJ().MQ() == 1) {
                        this.f8845fl.onAdLoaded(this.cJ.Qhi());
                    }
                }
            } else if (this.f8845fl != null) {
                if (this.Tgh || HzH.CJ().MQ() == 1) {
                    this.f8845fl.onError(-1, "");
                }
            }
        }
    }

    /* compiled from: FullScreenVideoLoadManager.java */
    /* loaded from: classes.dex */
    public static class Qhi implements PAGInterstitialAdLoadListener {
        private final PAGInterstitialAdLoadListener CJ;
        private final Context Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.core.model.Qhi f8846ac;
        private final AdSlot cJ;

        /* renamed from: fl  reason: collision with root package name */
        private final boolean f8847fl;

        public Qhi(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Qhi qhi, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z10) {
            this.Qhi = context;
            this.cJ = adSlot;
            this.f8846ac = qhi;
            this.CJ = pAGInterstitialAdLoadListener;
            this.f8847fl = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: Qhi */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            Tgh.Qhi(this.Qhi).Qhi(this.cJ, this.f8846ac, this.CJ, pAGInterstitialAd, this.f8847fl);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
        public void onError(int i10, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.CJ;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i10, str);
            }
        }
    }

    /* compiled from: FullScreenVideoLoadManager.java */
    /* loaded from: classes.dex */
    public static class ac extends com.bytedance.sdk.component.Sf.hm {
        final tP Qhi;

        /* renamed from: ac  reason: collision with root package name */
        final com.bytedance.sdk.openadsdk.core.model.Qhi f8848ac;
        final AdSlot cJ;

        /* compiled from: FullScreenVideoLoadManager.java */
        /* renamed from: com.bytedance.sdk.openadsdk.component.reward.Tgh$ac$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements fl.Qhi<Object> {
            public AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.fl.Qhi
            public void Qhi(boolean z10, Object obj) {
                if (z10) {
                    fl Qhi = fl.Qhi(HzH.Qhi());
                    ac acVar = ac.this;
                    Qhi.Qhi(acVar.cJ, acVar.f8848ac);
                }
            }
        }

        public ac(tP tPVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Qhi qhi) {
            super("Fullscreen Task");
            this.Qhi = tPVar;
            this.cJ = adSlot;
            this.f8848ac = qhi;
        }

        @Override // java.lang.Runnable
        public void run() {
            tP tPVar = this.Qhi;
            if (tPVar != null && tPVar.FQ() != null) {
                com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi = tP.Qhi(CacheDirFactory.getICacheDir(this.Qhi.zTC()).Qhi(), this.Qhi);
                Qhi.Qhi("material_meta", this.Qhi);
                Qhi.Qhi("ad_slot", this.cJ);
                com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(Qhi, new com.bykv.vk.openvk.component.video.api.fl.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Tgh.ac.1
                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10, String str) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10) {
                        fl Qhi2 = fl.Qhi(HzH.Qhi());
                        ac acVar2 = ac.this;
                        Qhi2.Qhi(acVar2.cJ, acVar2.f8848ac);
                    }
                });
            }
        }
    }

    /* compiled from: FullScreenVideoLoadManager.java */
    /* loaded from: classes.dex */
    public static class cJ implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.Qhi CJ;
        private final PAGInterstitialAdLoadListener Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private final AtomicInteger f8849ac;
        private final AtomicBoolean cJ;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.fl
        public void onError(int i10, String str) {
            if (this.f8849ac.decrementAndGet() <= 0 && this.cJ.compareAndSet(false, true)) {
                this.Qhi.onError(i10, str);
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Tgh.cJ.1
                    @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                    public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("req_id", cJ.this.CJ.Qhi());
                        return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("choose_ad_load_error").cJ(jSONObject.toString());
                    }
                });
            }
        }

        private cJ(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.Qhi qhi) {
            this.cJ = new AtomicBoolean(false);
            this.Qhi = pAGInterstitialAdLoadListener;
            this.CJ = qhi;
            this.f8849ac = new AtomicInteger(Qhi());
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
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.f8849ac.decrementAndGet();
            if (this.Qhi == null || !this.cJ.compareAndSet(false, true)) {
                return;
            }
            this.Qhi.onAdLoaded(pAGInterstitialAd);
        }
    }

    private Tgh(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = HzH.Qhi();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.cJ = applicationContext;
        ac();
    }

    private void CJ() {
        if (!this.f8837ac.get()) {
            return;
        }
        this.f8837ac.set(false);
        try {
            bxS.Qhi(this.Tgh);
        } catch (Exception unused) {
        }
    }

    public void finalize() {
        super.finalize();
        if (this.f8838fl != null) {
            try {
                com.bytedance.sdk.component.utils.Sf.Qhi().removeCallbacks(this.f8838fl);
            } catch (Exception unused) {
            }
            this.f8838fl = null;
        }
        CJ();
    }

    private void ac() {
        if (this.f8837ac.get()) {
            return;
        }
        this.f8837ac.set(true);
        bxS.Qhi(this.Tgh, this.cJ);
    }

    private void cJ(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        Jma Qhi2 = Jma.Qhi();
        if (TextUtils.isEmpty(adSlot.getBidAdm())) {
            boolean z10 = true;
            com.bytedance.sdk.openadsdk.core.model.Qhi Qhi3 = fl.Qhi(this.cJ).Qhi(adSlot.getCodeId(), true);
            if ((Qhi3 == null || !Qhi3.CJ()) ? false : false) {
                pA pAVar = new pA(this.cJ, Qhi3);
                if (!Qhi3.Tgh() && !com.bytedance.sdk.openadsdk.core.model.bxS.Gm(Qhi3.fl())) {
                    pAVar.cJ();
                }
                if (pAGInterstitialAdLoadListener != null) {
                    if (!Qhi3.Tgh() && HzH.CJ().MQ() == 0) {
                        Qhi(adSlot, Qhi3, pAGInterstitialAdLoadListener, pAVar.Qhi(), true);
                    }
                    cJ cJVar = new cJ(new Qhi(this.cJ, adSlot, Qhi3, pAGInterstitialAdLoadListener, true), Qhi3);
                    for (int i10 = 0; i10 < Qhi3.ac().size(); i10++) {
                        Qhi(Qhi3.ac().get(i10), adSlot, cJVar, Qhi2, pAVar, Qhi3.Tgh());
                        if (Qhi3.Gm()) {
                            break;
                        }
                    }
                }
                for (int i11 = 0; i11 < Qhi3.ac().size(); i11++) {
                    com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(Qhi3.ac().get(i11), new Qhi.InterfaceC0131Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Tgh.1
                    });
                }
                return;
            }
        }
        Qhi(adSlot, false, Qhi2, pAGInterstitialAdLoadListener);
    }

    public static Tgh Qhi(Context context) {
        if (Qhi == null) {
            synchronized (Tgh.class) {
                if (Qhi == null) {
                    Qhi = new Tgh(context);
                }
            }
        }
        return Qhi;
    }

    public void Qhi() {
        try {
            fl.Qhi(this.cJ).Qhi();
        } catch (Throwable unused) {
        }
    }

    public void Qhi(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm()) || fl.Qhi(this.cJ).Qhi(adSlot.getCodeId(), false) != null) {
            return;
        }
        Qhi(adSlot, true, Jma.Qhi(), null);
    }

    public void Qhi(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        cJ(adSlot, pAGInterstitialAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Qhi qhi, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, boolean z10) {
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
        int cJ2 = cJ();
        if (!z10) {
            if (cJ2 == 2) {
                fl.Qhi(this.cJ).Qhi(adSlot, qhi);
                cJ(adSlot);
            }
        } else if (cJ2 == 2) {
            cJ(adSlot);
        } else if (cJ2 == 1) {
            fl.Qhi(this.cJ).Qhi(adSlot.getCodeId(), (tP) null);
        }
    }

    private void cJ(AdSlot adSlot) {
        if (cJ() != 2) {
            return;
        }
        fl.Qhi(this.cJ).Qhi(adSlot.getCodeId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (com.bytedance.sdk.openadsdk.core.HzH.CJ().MQ() != 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(com.bytedance.sdk.openadsdk.core.model.tP r3, com.bytedance.sdk.openadsdk.AdSlot r4, final com.bytedance.sdk.openadsdk.component.reward.Tgh.cJ r5, com.bytedance.sdk.openadsdk.utils.Jma r6, final com.bytedance.sdk.openadsdk.component.reward.pA r7, final boolean r8) {
        /*
            r2 = this;
            r6 = 0
            if (r5 == 0) goto L11
            r0 = 1
            if (r8 != 0) goto L12
            com.bytedance.sdk.openadsdk.core.settings.ROR r1 = com.bytedance.sdk.openadsdk.core.HzH.CJ()
            int r1 = r1.MQ()
            if (r1 != r0) goto L11
            goto L12
        L11:
            r0 = r6
        L12:
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.bxS.Gm(r3)
            if (r1 != 0) goto L44
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.tP.fl(r3)
            if (r1 == 0) goto L44
            r3.FQ()
            int r0 = r3.zTC()
            com.bykv.vk.openvk.component.video.api.Qhi.cJ r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            java.lang.String r0 = r0.Qhi()
            com.bytedance.sdk.openadsdk.core.video.Qhi.cJ r0 = com.bytedance.sdk.openadsdk.core.model.tP.Qhi(r0, r3)
            java.lang.String r1 = "material_meta"
            r0.Qhi(r1, r3)
            java.lang.String r3 = "ad_slot"
            r0.Qhi(r3, r4)
            com.bytedance.sdk.openadsdk.component.reward.Tgh$2 r3 = new com.bytedance.sdk.openadsdk.component.reward.Tgh$2
            r3.<init>()
            com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(r0, r3)
            goto L45
        L44:
            r6 = r0
        L45:
            if (r6 == 0) goto L4e
            com.bytedance.sdk.openadsdk.component.reward.ROR r3 = r7.Qhi()
            r5.onAdLoaded(r3)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.Tgh.Qhi(com.bytedance.sdk.openadsdk.core.model.tP, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.Tgh$cJ, com.bytedance.sdk.openadsdk.utils.Jma, com.bytedance.sdk.openadsdk.component.reward.pA, boolean):void");
    }

    public static int cJ() {
        return com.bytedance.sdk.openadsdk.HzH.Qhi.Qhi("ivrv_load_ad_cache_strategy", 0);
    }

    private void Qhi(final AdSlot adSlot, final boolean z10, final Jma jma, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        qMt qmt = new qMt();
        qmt.f9111ac = z10 ? 2 : 1;
        if (HzH.CJ().zc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            qmt.Sf = 2;
        }
        HzH.ac().Qhi(adSlot, qmt, 8, new tP.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Tgh.3
            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(int i10, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
                if (z10 || (pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener) == null) {
                    return;
                }
                pAGInterstitialAdLoadListener2.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
            public void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
                if (qhi.ac() != null && !qhi.ac().isEmpty()) {
                    pA pAVar = new pA(Tgh.this.cJ, qhi);
                    if (!z10) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.Gm.ac.Qhi(qhi.fl(), System.currentTimeMillis() - currentTimeMillis);
                        }
                        if (!qhi.Tgh() && pAGInterstitialAdLoadListener != null && HzH.CJ().MQ() == 0) {
                            Tgh.this.Qhi(adSlot, qhi, pAGInterstitialAdLoadListener, pAVar.Qhi(), false);
                        }
                    }
                    cJ cJVar2 = new cJ(new Qhi(Tgh.this.cJ, adSlot, qhi, pAGInterstitialAdLoadListener, false), qhi);
                    for (int i10 = 0; i10 < qhi.ac().size(); i10++) {
                        Tgh.this.Qhi(qhi, qhi.ac().get(i10), pAVar, adSlot, z10, jma, cJVar2, qhi.Tgh());
                        if (qhi.Gm()) {
                            return;
                        }
                    }
                } else if (!z10 && (pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener) != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.Sf.Qhi(-3));
                    cJVar.Qhi(-3);
                    com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final com.bytedance.sdk.openadsdk.core.model.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.tP tPVar, final pA pAVar, final AdSlot adSlot, final boolean z10, Jma jma, final cJ cJVar, final boolean z11) {
        com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(tPVar, new Qhi.InterfaceC0131Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Tgh.4
        });
        boolean z12 = true;
        if (z10 && !com.bytedance.sdk.openadsdk.core.model.bxS.Gm(tPVar) && com.bytedance.sdk.openadsdk.core.model.tP.fl(tPVar) && HzH.CJ().Eh(adSlot.getCodeId()).CJ == 1 && !com.bytedance.sdk.component.utils.hpZ.CJ(this.cJ)) {
            Qhi(new ac(tPVar, adSlot, qhi));
            return;
        }
        boolean z13 = false;
        if (cJVar == null || (!z11 && HzH.CJ().MQ() != 1)) {
            z12 = false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.bxS.Gm(tPVar)) {
            if (z10) {
                fl.Qhi(this.cJ).Qhi(adSlot, qhi);
            }
        } else if (com.bytedance.sdk.openadsdk.core.model.tP.fl(tPVar)) {
            if (tPVar.FQ() != null) {
                com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi2 = com.bytedance.sdk.openadsdk.core.model.tP.Qhi(CacheDirFactory.getICacheDir(tPVar.zTC()).Qhi(), tPVar);
                Qhi2.Qhi("material_meta", tPVar);
                Qhi2.Qhi("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(Qhi2, new com.bykv.vk.openvk.component.video.api.fl.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Tgh.5
                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10) {
                        pAVar.cJ();
                        if (z10) {
                            fl.Qhi(Tgh.this.cJ).Qhi(adSlot, qhi);
                        } else if (cJVar != null) {
                            if (z11 || HzH.CJ().MQ() == 1) {
                                cJVar.onAdLoaded(pAVar.Qhi());
                            }
                        }
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
                    public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10, String str) {
                        if (cJVar != null) {
                            if (z11 || HzH.CJ().MQ() == 1) {
                                cJVar.onError(i10, str);
                            }
                        }
                    }
                });
            } else {
                z13 = z12;
            }
            z12 = z13;
        } else if (z10) {
            fl.Qhi(this.cJ).Qhi(adSlot, qhi);
        }
        if (z12) {
            cJVar.onAdLoaded(pAVar.Qhi());
        }
    }

    private void Qhi(ac acVar) {
        if (acVar == null) {
            return;
        }
        if (this.CJ.size() > 0) {
            this.CJ.remove(0);
        }
        this.CJ.add(acVar);
    }

    public void Qhi(String str, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        fl.Qhi(this.cJ).Qhi(str, tPVar);
    }
}
