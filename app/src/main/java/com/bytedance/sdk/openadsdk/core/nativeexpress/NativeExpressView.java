package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.cJ.Gm;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi;
import com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView;
import com.bytedance.sdk.openadsdk.core.cJ.Qhi;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.lB;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.sDy;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.qMt;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeExpressView extends PAGFrameLayout implements com.bytedance.sdk.component.adexpress.cJ.hm, com.bytedance.sdk.component.adexpress.cJ.hpZ, com.bytedance.sdk.component.adexpress.dynamic.fl, Qhi.InterfaceC0120Qhi, ABk {
    public static int qMt = 500;
    protected boolean ABk;
    private TTDislikeDialogAbstract CJ;
    public com.bytedance.sdk.openadsdk.cJ.Sf CQU;
    private com.bytedance.sdk.component.adexpress.cJ.HzH Dq;
    boolean Dww;
    public boolean EBS;
    private float EGK;
    protected com.bytedance.sdk.component.adexpress.cJ.cJ Eh;
    private final AtomicBoolean FQ;
    protected tP Gm;
    private final SparseArray<ac.Qhi> HLI;
    private com.bytedance.sdk.component.adexpress.cJ.ROR Hf;
    boolean HzH;
    private String Jma;
    private final Runnable MND;
    protected HashSet<String> MQ;
    private com.bytedance.sdk.openadsdk.core.ugen.component.fl NBs;
    private String NFd;
    private cJ PAe;
    private kYc Qe;
    private boolean Qhi;
    private Sf ROR;
    private float ReL;
    protected final Context Sf;
    private ROR Tgh;
    private VastBannerBackupView VnT;
    protected AdSlot WAv;
    private Gm.Qhi YB;
    public com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> aP;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.dislike.cJ f9129ac;
    int bxS;
    private int cJ;
    private List<com.bytedance.sdk.component.adexpress.cJ.Gm> cjC;
    private com.bytedance.sdk.openadsdk.core.ugen.ac.ac dI;
    private ThemeStatusBroadcastReceiver dIT;
    private com.bytedance.sdk.component.adexpress.cJ.WAv dVA;
    private boolean es;

    /* renamed from: fl  reason: collision with root package name */
    private PAGExpressAdWrapperListener f9130fl;
    private long gga;

    /* renamed from: hm  reason: collision with root package name */
    protected String f9131hm;
    protected boolean hpZ;
    protected boolean iMK;

    /* renamed from: ip  reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f9132ip;
    private final Runnable jPH;
    private String js;
    protected int kYc;
    private float lB;
    private com.bytedance.sdk.openadsdk.cJ.ac.Tgh lG;
    private float oU;
    private int ots;
    protected com.bytedance.sdk.component.adexpress.cJ.ac pA;
    long pM;
    private float pv;
    private float sDy;
    protected String tP;
    private final Runnable xyz;
    private hpZ yN;

    /* renamed from: zc  reason: collision with root package name */
    public FrameLayout f9133zc;
    private com.bytedance.sdk.component.adexpress.cJ.iMK zjb;

    /* renamed from: zn  reason: collision with root package name */
    private Qhi.InterfaceC0119Qhi f9134zn;

    public NativeExpressView(Context context, tP tPVar, AdSlot adSlot, String str) {
        super(context);
        this.Qhi = true;
        this.cJ = 0;
        this.f9131hm = "embeded_ad";
        this.NFd = null;
        this.iMK = false;
        this.hpZ = false;
        this.HzH = true;
        this.kYc = -1;
        this.Jma = "";
        this.EBS = false;
        this.es = true;
        this.bxS = -1;
        this.CQU = new com.bytedance.sdk.openadsdk.cJ.Sf();
        this.pM = 0L;
        this.FQ = new AtomicBoolean(false);
        this.f9132ip = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                NativeExpressView nativeExpressView = NativeExpressView.this;
                if (!nativeExpressView.HzH) {
                    return;
                }
                nativeExpressView.qMt();
                NativeExpressView nativeExpressView2 = NativeExpressView.this;
                nativeExpressView2.removeCallbacks(nativeExpressView2.xyz);
                NativeExpressView nativeExpressView3 = NativeExpressView.this;
                nativeExpressView3.postDelayed(nativeExpressView3.xyz, 500L);
            }
        };
        this.xyz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (sDy.Qhi(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.fl(nativeExpressView.getVisibility());
                    return;
                }
                NativeExpressView.this.fl(8);
            }
        };
        this.jPH = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.fl(0);
            }
        };
        this.MND = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.fl(8);
            }
        };
        this.ots = 8;
        this.HLI = new SparseArray<>();
        this.oU = -1.0f;
        this.pv = -1.0f;
        this.ReL = -1.0f;
        this.EGK = -1.0f;
        this.gga = 0L;
        this.f9131hm = str;
        this.Sf = context;
        this.Gm = tPVar;
        this.WAv = adSlot;
        this.EBS = false;
        Tgh();
    }

    private boolean CQU() {
        if (!TextUtils.equals(this.f9131hm, "fullscreen_interstitial_ad") && !TextUtils.equals(this.f9131hm, "rewarded_video") && !TextUtils.equals("open_ad", this.f9131hm) && !kYc.cJ(this.f9131hm) && !TextUtils.equals(this.f9131hm, "embeded_ad")) {
            return false;
        }
        return true;
    }

    private void Dww() {
        List<com.bytedance.sdk.component.adexpress.cJ.Gm> list = this.cjC;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.cJ.Gm> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private boolean EBS() {
        return tP.fl(this.Gm);
    }

    private void HzH() {
        if (this.Gm.sqa() == 1 && this.Gm.IC()) {
            com.bytedance.sdk.component.adexpress.cJ.ROR ror = new com.bytedance.sdk.component.adexpress.cJ.ROR(this.Sf, this.zjb, new pA(this, this.dIT, this.zjb));
            this.Hf = ror;
            this.cjC.add(ror);
            this.YB = new com.bytedance.sdk.component.adexpress.cJ.ABk(this.cjC, this.dVA);
        } else if (CQU()) {
            kYc();
        } else {
            try {
                tP();
                kYc kyc = new kYc(this.Sf, this.zjb, this.dIT, this.lG, this.Gm);
                this.Qe = kyc;
                com.bytedance.sdk.component.adexpress.cJ.HzH hzH = new com.bytedance.sdk.component.adexpress.cJ.HzH(this.Sf, this.zjb, kyc, this);
                this.Dq = hzH;
                this.cjC.add(hzH);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
            }
            com.bytedance.sdk.component.adexpress.cJ.ROR ror2 = new com.bytedance.sdk.component.adexpress.cJ.ROR(this.Sf, this.zjb, new pA(this, this.dIT, this.zjb));
            this.Hf = ror2;
            this.cjC.add(ror2);
            this.YB = new com.bytedance.sdk.component.adexpress.cJ.ABk(this.cjC, this.dVA);
        }
    }

    private void MQ() {
        com.bytedance.sdk.openadsdk.core.ac.Qhi.Qhi qhi = new com.bytedance.sdk.openadsdk.core.ac.Qhi.Qhi();
        int i10 = this.cJ;
        if (i10 != 3) {
            if (i10 != 7) {
                kYc kyc = new kYc(this.Sf, this.zjb, this.dIT, this.lG, this.Gm);
                this.Qe = kyc;
                com.bytedance.sdk.component.adexpress.cJ.HzH hzH = new com.bytedance.sdk.component.adexpress.cJ.HzH(this.Sf, this.zjb, kyc, this);
                this.Dq = hzH;
                this.cjC.add(hzH);
                return;
            }
            com.bytedance.sdk.openadsdk.core.ugen.ac.ac acVar = new com.bytedance.sdk.openadsdk.core.ugen.ac.ac(this.Sf, this.Gm, this.EBS, (com.bytedance.sdk.openadsdk.core.ugen.ac.Qhi) this.zjb, this);
            this.dI = acVar;
            com.bytedance.sdk.openadsdk.core.ugen.component.fl flVar = new com.bytedance.sdk.openadsdk.core.ugen.component.fl(this.Sf, acVar, this, this.zjb);
            this.NBs = flVar;
            this.cjC.add(flVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.dynamic.CJ.hm hmVar = new com.bytedance.sdk.component.adexpress.dynamic.CJ.hm();
        Context applicationContext = this.Sf.getApplicationContext();
        com.bytedance.sdk.component.adexpress.cJ.iMK imk = this.zjb;
        ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.dIT;
        boolean z10 = this.EBS;
        com.bytedance.sdk.component.adexpress.cJ.cJ cJVar = new com.bytedance.sdk.component.adexpress.cJ.cJ(applicationContext, imk, themeStatusBroadcastReceiver, z10, hmVar, this, qhi, new fl(this.Sf, themeStatusBroadcastReceiver, z10, hmVar, imk, qhi));
        this.Eh = cJVar;
        this.cjC.add(cJVar);
    }

    private void ROR() {
        tP.Qhi es = this.Gm.es();
        if (TextUtils.equals(this.f9131hm, "embeded_ad") && es != null) {
            String Gm = es.Gm();
            if (!TextUtils.isEmpty(Gm)) {
                try {
                    JSONObject jSONObject = new JSONObject(Gm);
                    int optInt = jSONObject.optInt(InMobiNetworkValues.WIDTH);
                    int optInt2 = jSONObject.optInt(InMobiNetworkValues.HEIGHT);
                    if (optInt != 0 && optInt2 != 0) {
                        this.lB = optInt2;
                        this.sDy = optInt;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private void bxS() {
        List<com.bytedance.sdk.component.adexpress.cJ.Gm> list = this.cjC;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.cJ.Gm> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private int getAdSlotType() {
        String str = this.f9131hm;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c = 3;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 7;
            case 2:
                return 3;
            case 3:
                return 8;
            case 4:
                return 2;
            default:
                return 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void hpZ() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.hpZ():void");
    }

    private void kYc() {
        this.cJ = this.Gm.CQU();
        try {
            tP();
            MQ();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
        }
        boolean z10 = true;
        if (this.Gm.pM() != 1) {
            z10 = false;
        }
        this.Qhi = z10;
        if (z10) {
            com.bytedance.sdk.component.adexpress.cJ.ROR ror = new com.bytedance.sdk.component.adexpress.cJ.ROR(this.Sf, this.zjb, new pA(this, this.dIT, this.zjb));
            this.Hf = ror;
            this.cjC.add(ror);
        }
        Objects.toString(this.cjC);
        this.YB = new com.bytedance.sdk.component.adexpress.cJ.ABk(this.cjC, this.dVA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qMt() {
        if (this.FQ.get()) {
            this.CQU.Qhi(System.currentTimeMillis(), sDy.Qhi(this));
        }
    }

    private void tP() {
        if (!com.bytedance.sdk.openadsdk.core.iMK.fl()) {
            Gm.Qhi();
        }
    }

    public boolean ABk() {
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar != null && flVar.ac() == 1) {
            return true;
        }
        return false;
    }

    public int CJ() {
        return 0;
    }

    public void Gm() {
        try {
            cJ cJVar = this.PAe;
            if (cJVar != null) {
                cJVar.cJ();
            }
            iMK();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.cJ.Gm> list = this.cjC;
            if (list != null) {
                for (com.bytedance.sdk.component.adexpress.cJ.Gm gm2 : list) {
                    gm2.Qhi();
                }
            }
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(this.Gm);
            this.f9129ac = null;
            this.CJ = null;
            this.WAv = null;
            this.Gm = null;
            this.f9130fl = null;
            this.Tgh = null;
            this.pA = null;
            this.ROR = null;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("NativeExpressView", "detach error", th2);
        }
    }

    public void Qhi() {
    }

    public void Sf() {
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar instanceof kYc) {
            if (flVar == null) {
                return;
            }
            ((kYc) flVar).Sf();
        }
        tP tPVar = this.Gm;
        if (tPVar != null && tPVar.cJP() != null && this.Gm.cJP().Qhi() != null) {
            this.Gm.cJP().Qhi().Qhi(0L);
        }
    }

    public void Tgh() {
        this.MQ = new HashSet<>();
        this.dIT = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.WAv;
        if (adSlot != null) {
            this.sDy = adSlot.getExpressViewAcceptedWidth();
            this.lB = this.WAv.getExpressViewAcceptedHeight();
            ROR();
            this.NFd = this.WAv.getCodeId();
            if (TextUtils.equals(this.f9131hm, "fullscreen_interstitial_ad")) {
                this.bxS = com.bytedance.sdk.openadsdk.core.HzH.CJ().tP(this.NFd);
            } else if (TextUtils.equals(this.f9131hm, "rewarded_video")) {
                this.bxS = com.bytedance.sdk.openadsdk.core.HzH.CJ().WAv(this.NFd);
            } else if (TextUtils.equals(this.f9131hm, "open_ad")) {
                int EBS = com.bytedance.sdk.openadsdk.core.HzH.CJ().EBS(this.NFd);
                this.bxS = EBS;
                if (EBS < 0) {
                    this.bxS = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.Gm.gT()) {
            this.PAe = new cJ(this.Sf, this, this.Gm, this.f9131hm);
            return;
        }
        hpZ();
        this.cjC = new ArrayList();
        HzH();
        com.bytedance.sdk.component.adexpress.cJ.HzH hzH = this.Dq;
        if (hzH != null) {
            this.Qe = (kYc) hzH.cJ();
        }
        NFd jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.Tgh(this.f9131hm);
        }
    }

    public void WAv() {
        kYc kyc = this.Qe;
        if (kyc != null && kyc.fl() != null) {
            this.Qe.Tgh();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.hpZ
    public void a_(int i10) {
        com.bytedance.sdk.component.adexpress.cJ.WAv wAv = this.dVA;
        if (wAv != null) {
            if (!this.Qhi) {
                wAv.Sf();
            }
            this.dVA.hm();
            ((zc) this.dVA).Gm();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f9130fl;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.Sf.Qhi(i10), i10);
        }
        hpZ hpz = this.yN;
        if (hpz != null) {
            hpz.Qhi(this.Gm, this.f9131hm);
        }
    }

    public long ac() {
        return 0L;
    }

    public void cJ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.nativeexpress.ROR r0 = r12.Tgh
            r1 = 0
            if (r0 == 0) goto L1e
            int r2 = r13.getDeviceId()
            r0.cJ(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.ROR r0 = r12.Tgh
            int r2 = r13.getSource()
            r0.Qhi(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.ROR r0 = r12.Tgh
            int r2 = r13.getToolType(r1)
            r0.ac(r2)
        L1e:
            com.bytedance.sdk.openadsdk.core.nativeexpress.Sf r0 = r12.ROR
            if (r0 == 0) goto L3b
            int r2 = r13.getDeviceId()
            r0.cJ(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.Sf r0 = r12.ROR
            int r2 = r13.getSource()
            r0.Qhi(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.Sf r0 = r12.ROR
            int r2 = r13.getToolType(r1)
            r0.ac(r2)
        L3b:
            int r0 = r13.getActionMasked()
            if (r0 == 0) goto L9a
            r1 = 3
            r2 = 1
            if (r0 == r2) goto L4b
            r3 = 2
            if (r0 == r3) goto L4f
            if (r0 == r1) goto L4d
            r1 = -1
        L4b:
            r5 = r1
            goto Lad
        L4d:
            r1 = 4
            goto L4b
        L4f:
            float r0 = r12.ReL
            float r1 = r13.getX()
            float r4 = r12.oU
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.ReL = r1
            float r0 = r12.EGK
            float r1 = r13.getY()
            float r4 = r12.pv
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.EGK = r1
            float r0 = r13.getX()
            r12.oU = r0
            float r0 = r13.getY()
            r12.pv = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r12.gga
            long r0 = r0 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L98
            float r0 = r12.ReL
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L96
            float r0 = r12.EGK
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L98
        L96:
            r5 = r2
            goto Lad
        L98:
            r5 = r3
            goto Lad
        L9a:
            float r0 = r13.getRawX()
            r12.oU = r0
            float r0 = r13.getRawY()
            r12.pv = r0
            long r2 = java.lang.System.currentTimeMillis()
            r12.gga = r2
            goto L4b
        Lad:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.cJ.ac$Qhi> r0 = r12.HLI
            if (r0 == 0) goto Lcc
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.cJ.ac$Qhi r2 = new com.bytedance.sdk.openadsdk.core.cJ.ac$Qhi
            float r3 = r13.getSize()
            double r6 = (double) r3
            float r3 = r13.getPressure()
            double r8 = (double) r3
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r2
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r2)
        Lcc:
            boolean r13 = super.dispatchTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void fl() {
    }

    public com.bytedance.sdk.openadsdk.cJ.Sf getAdShowTime() {
        return this.CQU;
    }

    public cJ getBrandBannerController() {
        return this.PAe;
    }

    public ROR getClickCreativeListener() {
        return this.Tgh;
    }

    public Sf getClickListener() {
        return this.ROR;
    }

    public String getClosedListenerKey() {
        return this.js;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar != null) {
            return flVar.ac();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.lB).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.sDy).intValue();
    }

    public NFd getJsObject() {
        kYc kyc = this.Qe;
        if (kyc != null) {
            return kyc.hpZ();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        hm pA;
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if ((flVar instanceof kYc) && (pA = ((kYc) flVar).pA()) != null) {
            return pA.Qhi();
        }
        return 0;
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.HzH.CJ().aP();
    }

    public String getUgenTemplateErrorReason() {
        return this.Jma;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cJ.Qhi.InterfaceC0120Qhi
    public long getVideoProgress() {
        VastBannerBackupView vastBannerBackupView = this.VnT;
        if (vastBannerBackupView != null) {
            return vastBannerBackupView.getVideoProgress();
        }
        return 0L;
    }

    public SSWebView getWebView() {
        kYc kyc = this.Qe;
        if (kyc == null) {
            return null;
        }
        return kyc.Qhi();
    }

    public void hm() {
        if (this.Gm == null) {
            return;
        }
        this.pM = SystemClock.elapsedRealtime();
        if (this.Gm.gT()) {
            cJ cJVar = this.PAe;
            if (cJVar == null) {
                a_(106);
                return;
            }
            cJVar.Qhi((com.bytedance.sdk.component.adexpress.cJ.hpZ) this);
            this.PAe.Qhi();
            return;
        }
        this.lG.Qhi();
        Gm.Qhi qhi = this.YB;
        if (qhi != null) {
            qhi.Qhi(this);
        }
        try {
            this.YB.Qhi();
        } catch (Throwable unused) {
        }
    }

    public void iMK() {
        tP tPVar = this.Gm;
        if (tPVar != null && tPVar.cJP() != null && this.Gm.cJP().Qhi() != null) {
            this.Gm.cJP().Qhi().fl(getVideoProgress());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qMt();
        bxS();
        com.bytedance.sdk.component.utils.ABk.Qhi("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.f9132ip);
        com.bytedance.sdk.openadsdk.core.hm.cJ().Qhi(this.js, this.f9134zn);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.f9132ip);
        com.bytedance.sdk.openadsdk.core.hm.cJ().Tgh(this.js);
        Dww();
        com.bytedance.sdk.component.utils.ABk.Qhi("webviewpool", "onDetachedFromWindow===");
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.ABk.Qhi("webviewpool", "onFinishTemporaryDetach+++");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        qMt();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.ABk.Qhi("webviewpool", "onStartTemporaryDetach===");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        int i10;
        super.onWindowFocusChanged(z10);
        if (Build.VERSION.SDK_INT < 28) {
            if (z10) {
                i10 = getVisibility();
            } else {
                i10 = 8;
            }
            onWindowVisibilityChanged(i10);
        }
        qMt();
        if (z10) {
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(this.Gm, 4);
        } else {
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(this.Gm, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        Qhi(i10, true);
    }

    public boolean pA() {
        return this.FQ.get();
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.cJ.ac acVar) {
        this.pA = acVar;
        com.bytedance.sdk.component.adexpress.cJ.ROR ror = this.Hf;
        if (ror != null) {
            ror.Qhi(acVar);
        }
    }

    public void setBannerClickClosedListener(Qhi.InterfaceC0119Qhi interfaceC0119Qhi) {
        this.f9134zn = interfaceC0119Qhi;
    }

    public void setClickCreativeListener(ROR ror) {
        this.Tgh = ror;
        if (ror != null) {
            ror.Qhi((Qhi.InterfaceC0120Qhi) this);
        }
    }

    public void setClickListener(Sf sf2) {
        this.ROR = sf2;
    }

    public void setClosedListenerKey(String str) {
        this.js = str;
        cJ cJVar = this.PAe;
        if (cJVar != null) {
            cJVar.Qhi(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.dislike.cJ cJVar) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar != null && (flVar instanceof pA) && (backupView = (BackupView) flVar.fl()) != null) {
            backupView.setDislikeInner(cJVar);
        }
        cJ cJVar2 = this.PAe;
        if (cJVar2 != null) {
            cJVar2.Qhi(cJVar);
        }
        this.f9129ac = cJVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.f9130fl = pAGExpressAdWrapperListener;
        cJ cJVar = this.PAe;
        if (cJVar != null) {
            cJVar.Qhi(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.ac acVar) {
        if (this.Qe != null && getJsObject() != null) {
            getJsObject().Qhi(acVar);
        }
        com.bytedance.sdk.openadsdk.core.ugen.ac.ac acVar2 = this.dI;
        if (acVar2 != null) {
            acVar2.Qhi(acVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar != null && (flVar instanceof pA) && (backupView = (BackupView) flVar.fl()) != null) {
            backupView.setDislikeOuter(tTDislikeDialogAbstract);
        }
        cJ cJVar = this.PAe;
        if (cJVar != null) {
            cJVar.Qhi(tTDislikeDialogAbstract);
        }
        this.CJ = tTDislikeDialogAbstract;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void setSoundMute(boolean z10) {
        this.EBS = z10;
        com.bytedance.sdk.component.adexpress.cJ.cJ cJVar = this.Eh;
        if (cJVar != null && cJVar.cJ() != null) {
            this.Eh.cJ().setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if ((flVar instanceof com.bytedance.sdk.openadsdk.core.ugen.ac.ac) && flVar.ac() == 7) {
            ((com.bytedance.sdk.openadsdk.core.ugen.ac.ac) this.aP).setSoundMute(z10);
        }
    }

    public void setVastVideoHelper(VastBannerBackupView vastBannerBackupView) {
        this.VnT = vastBannerBackupView;
    }

    public void zc() {
        try {
            FrameLayout frameLayout = this.f9133zc;
            if (frameLayout != null && frameLayout.getParent() != null) {
                removeView(this.f9133zc);
            }
        } catch (Throwable unused) {
        }
    }

    public void Qhi(int i10) {
    }

    public void cJ(int i10) {
    }

    public void Qhi(int i10, String str) {
    }

    public Tgh.Qhi ac(int i10) {
        return new Tgh.Qhi(i10);
    }

    public void fl(int i10) {
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar == null || !(flVar instanceof kYc)) {
            return;
        }
        ((kYc) flVar).cJ(i10);
        this.ots = i10;
    }

    public void Qhi(iMK.Qhi qhi) {
    }

    public void cJ(int i10, int i11) {
        int i12;
        if (TextUtils.equals(this.f9131hm, "banner_ad")) {
            return;
        }
        int i13 = this.bxS;
        int i14 = ((i11 < i13 || i13 < 0 || !(this.Dww || TextUtils.equals(this.f9131hm, "open_ad"))) && CJ() != 5) ? 0 : 1;
        if (i11 <= this.bxS) {
            tP tPVar = this.Gm;
            if (tPVar != null && tPVar.FQ() != null) {
                i12 = (int) (Math.min(this.bxS, this.Gm.FQ().Tgh() * this.Gm.FQ().EBS()) - i11);
            } else {
                i12 = this.bxS - i11;
            }
        } else {
            i12 = 0;
        }
        com.bytedance.sdk.component.adexpress.cJ.cJ cJVar = this.Eh;
        if (cJVar != null && cJVar.cJ() != null) {
            this.Eh.cJ().Qhi(String.valueOf(i10), i14, i12, false);
        }
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar instanceof com.bytedance.sdk.openadsdk.core.ugen.ac.ac) {
            ((com.bytedance.sdk.openadsdk.core.ugen.ac.ac) flVar).Qhi((CharSequence) String.valueOf(i10), i14, i12, false);
        }
    }

    public void Qhi(JSONObject jSONObject) {
    }

    public void Qhi(boolean z10) {
    }

    public boolean Qhi(com.bytedance.sdk.component.adexpress.cJ.pA pAVar) {
        return true;
    }

    public void Qhi(int i10, boolean z10) {
        this.HzH = z10;
        removeCallbacks(this.MND);
        removeCallbacks(this.jPH);
        if (i10 == 0) {
            postDelayed(this.jPH, 50L);
        } else {
            postDelayed(this.MND, 50L);
        }
    }

    public void cJ(int i10, String str) {
        NFd hpZ;
        com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar = this.aP;
        if (flVar == null || !(flVar instanceof kYc) || (hpZ = ((kYc) flVar).hpZ()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i10);
            jSONObject.put("flag", str);
            hpZ.Qhi("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Qhi(View view, int i10, com.bytedance.sdk.component.adexpress.ac acVar) {
        View view2;
        qMt.Qhi("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i10));
        if (i10 == -1 || acVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (bxS.Gm(this.Gm)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.pA pAVar = (com.bytedance.sdk.openadsdk.core.model.pA) acVar;
        ROR ror = this.Tgh;
        if (ror != null) {
            ror.CJ(getDynamicShowType());
            this.Tgh.Qhi(hashMap);
        }
        Sf sf2 = this.ROR;
        if (sf2 != null) {
            sf2.CJ(getDynamicShowType());
            this.ROR.Qhi(hashMap);
        }
        float f10 = pAVar.Qhi;
        float f11 = pAVar.cJ;
        float f12 = pAVar.f9102ac;
        float f13 = pAVar.CJ;
        boolean z10 = pAVar.pA;
        SparseArray<ac.Qhi> sparseArray = pAVar.iMK;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.HLI;
        }
        SparseArray<ac.Qhi> sparseArray2 = sparseArray;
        String str = pAVar.Gm;
        if (view == null) {
            view2 = this;
        } else {
            r7 = view != this ? Qhi(view) : null;
            view2 = view;
        }
        pAVar.f9105zc = i10;
        if (r7 != null && pAVar.ABk == null) {
            pAVar.ABk = r7;
        }
        switch (i10) {
            case 1:
                FrameLayout frameLayout = this.f9133zc;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                tP tPVar = this.Gm;
                if (tPVar == null || tPVar.kYc() != 1 || z10) {
                    Sf sf3 = this.ROR;
                    if (sf3 != null) {
                        sf3.Qhi(pAVar);
                        this.ROR.Qhi(str);
                        this.ROR.Qhi(view2, f10, f11, f12, f13, sparseArray2, z10);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f9130fl;
                    if (pAGExpressAdWrapperListener == null || pAVar.kYc) {
                        return;
                    }
                    pAGExpressAdWrapperListener.onAdClicked();
                    return;
                }
                return;
            case 2:
                if (pAVar.hpZ > 0) {
                    lB.Qhi(true);
                }
                ROR ror2 = this.Tgh;
                if (ror2 != null) {
                    ror2.Qhi(pAVar);
                    this.Tgh.Qhi(str);
                    this.Tgh.Qhi(view2, f10, f11, f12, f13, sparseArray2, z10);
                }
                PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.f9130fl;
                if (pAGExpressAdWrapperListener2 != null && !pAVar.kYc) {
                    pAGExpressAdWrapperListener2.onAdClicked();
                }
                lB.Qhi(false);
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(this.Gm, 9);
                return;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.CJ;
                if (tTDislikeDialogAbstract != null) {
                    tTDislikeDialogAbstract.show();
                    return;
                }
                com.bytedance.sdk.openadsdk.dislike.cJ cJVar = this.f9129ac;
                if (cJVar != null) {
                    cJVar.Qhi();
                    return;
                } else {
                    TTDelegateActivity.Qhi(this.Gm, this.js);
                    return;
                }
            case 4:
                FrameLayout frameLayout2 = this.f9133zc;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                tP tPVar2 = this.Gm;
                if (tPVar2 == null || tPVar2.kYc() != 1 || z10) {
                    js.cJ(this.Gm);
                    if ("embeded_ad".equals(this.f9131hm) && EBS() && !this.ABk && js.cJ(this.Gm)) {
                        ROR ror3 = this.Tgh;
                        if (ror3 != null) {
                            ror3.Qhi(pAVar);
                            this.Tgh.Qhi(str);
                            this.Tgh.Qhi(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                    } else {
                        Sf sf4 = this.ROR;
                        if (sf4 != null) {
                            sf4.Qhi(pAVar);
                            this.ROR.Qhi(str);
                            this.ROR.Qhi(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.f9130fl;
                    if (pAGExpressAdWrapperListener3 == null || pAVar.kYc) {
                        return;
                    }
                    pAGExpressAdWrapperListener3.onAdClicked();
                    return;
                }
                return;
            case 5:
                Qhi(!this.EBS);
                return;
            case 6:
                Qhi();
                return;
            case 7:
                TTWebsiteActivity.Qhi(this.Sf, this.Gm, this.f9131hm);
                return;
            default:
                return;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void d_() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void setTimeUpdate(int i10) {
    }

    public NativeExpressView(Context context, tP tPVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        super(context);
        this.Qhi = true;
        this.cJ = 0;
        this.f9131hm = "embeded_ad";
        this.NFd = null;
        this.iMK = false;
        this.hpZ = false;
        this.HzH = true;
        this.kYc = -1;
        this.Jma = "";
        this.EBS = false;
        this.es = true;
        this.bxS = -1;
        this.CQU = new com.bytedance.sdk.openadsdk.cJ.Sf();
        this.pM = 0L;
        this.FQ = new AtomicBoolean(false);
        this.f9132ip = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                NativeExpressView nativeExpressView = NativeExpressView.this;
                if (!nativeExpressView.HzH) {
                    return;
                }
                nativeExpressView.qMt();
                NativeExpressView nativeExpressView2 = NativeExpressView.this;
                nativeExpressView2.removeCallbacks(nativeExpressView2.xyz);
                NativeExpressView nativeExpressView3 = NativeExpressView.this;
                nativeExpressView3.postDelayed(nativeExpressView3.xyz, 500L);
            }
        };
        this.xyz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (sDy.Qhi(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.fl(nativeExpressView.getVisibility());
                    return;
                }
                NativeExpressView.this.fl(8);
            }
        };
        this.jPH = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.fl(0);
            }
        };
        this.MND = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.fl(8);
            }
        };
        this.ots = 8;
        this.HLI = new SparseArray<>();
        this.oU = -1.0f;
        this.pv = -1.0f;
        this.ReL = -1.0f;
        this.EGK = -1.0f;
        this.gga = 0L;
        this.f9131hm = str;
        this.Sf = context;
        this.Gm = tPVar;
        this.WAv = adSlot;
        this.EBS = z10;
        this.es = z11;
        Tgh();
    }

    public static JSONObject Qhi(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InMobiNetworkValues.WIDTH, view.getWidth());
            jSONObject.put(InMobiNetworkValues.HEIGHT, view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void Qhi(com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar, com.bytedance.sdk.component.adexpress.cJ.pA pAVar) {
        tP tPVar;
        this.FQ.set(true);
        this.aP = flVar;
        if (this.ots != getWindowVisibility()) {
            fl(getWindowVisibility());
        }
        flVar.ac();
        if (flVar.ac() == 3 && (tPVar = this.Gm) != null && tPVar.hpZ() == 1) {
            this.Gm.cJ(0);
        }
        if (flVar.ac() == 2 || flVar.ac() == 0 || flVar.ac() == 3 || flVar.ac() == 7) {
            View fl2 = flVar.fl();
            if (fl2.getParent() != null) {
                ((ViewGroup) fl2.getParent()).removeView(fl2);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                arrayList.add(getChildAt(i10));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof SSWebView) {
                    removeView((View) arrayList.get(i11));
                }
            }
            addView(flVar.fl());
        }
        tP tPVar2 = this.Gm;
        if (tPVar2 != null) {
            com.bytedance.sdk.openadsdk.Gm.ac.Qhi(tPVar2.cJ(), this.pM, this.f9131hm, flVar.ac());
        }
        com.bytedance.sdk.component.adexpress.cJ.WAv wAv = this.dVA;
        if (wAv != null) {
            ((zc) wAv).Gm();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f9130fl;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) pAVar.CJ(), (float) pAVar.fl());
        }
        if (Qhi(pAVar)) {
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(this, this.Gm, ac(getDynamicShowType()));
        }
        hpZ hpz = this.yN;
        if (hpz != null) {
            hpz.Qhi(this.Gm, this.f9131hm);
        }
    }

    public JSONObject Qhi(JSONObject jSONObject, tP tPVar) {
        if (this.aP instanceof kYc) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                int renderEngineCacheType = getRenderEngineCacheType();
                if (tPVar != null && tPVar.es() != null && tPVar.es().ABk()) {
                    jSONObject.put("engine_version", tPVar.es().zc());
                } else {
                    jSONObject.put("engine_version", "v1");
                }
                jSONObject.put("engine_type", renderEngineCacheType);
            } catch (Exception e10) {
                e10.getMessage();
            }
            return jSONObject;
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void Qhi(CharSequence charSequence, int i10, int i11, boolean z10) {
        cJ(Integer.parseInt(String.valueOf(charSequence)), i10);
    }
}
