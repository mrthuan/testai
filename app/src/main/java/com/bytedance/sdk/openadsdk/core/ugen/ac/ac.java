package com.bytedance.sdk.openadsdk.core.ugen.ac;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.Gm;
import com.bytedance.adsdk.ugeno.core.iMK;
import com.bytedance.adsdk.ugeno.core.pA;
import com.bytedance.adsdk.ugeno.core.zc;
import com.bytedance.sdk.component.adexpress.CJ.Dww;
import com.bytedance.sdk.component.adexpress.cJ.Sf;
import com.bytedance.sdk.component.adexpress.cJ.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.pA;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* compiled from: UGenRender.java */
/* loaded from: classes.dex */
public class ac implements iMK, pA, com.bytedance.sdk.component.adexpress.cJ.fl<View>, com.bytedance.sdk.component.adexpress.dynamic.fl {
    private static float CQU = 0.0f;
    private static long Dww = 0;
    private static float Eh = 0.0f;
    protected static int Gm = 24;
    private static float aP;
    private static float pM;
    protected tP CJ;
    private long EBS;
    private final boolean HzH;
    private JSONObject Jma;
    private float MQ;
    private fl NFd;
    protected Gm Qhi;
    protected com.bytedance.sdk.component.adexpress.cJ.pA ROR;
    protected FrameLayout Tgh;

    /* renamed from: ac  reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.component.cJ<View> f9191ac;
    private long bxS;
    protected Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected Qhi f9192fl;

    /* renamed from: hm  reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.component.cJ f9193hm;
    private Sf hpZ;
    private JSONObject iMK;
    private float kYc;
    private NativeExpressView lB;
    private hm pA;
    private float qMt;
    private String sDy;
    private float tP;

    /* renamed from: zc  reason: collision with root package name */
    protected WeakReference<View> f9194zc;
    protected boolean WAv = true;
    public SparseArray<ac.Qhi> ABk = new SparseArray<>();
    private String lG = "";
    private final com.bytedance.sdk.component.Sf.hm js = new com.bytedance.sdk.component.Sf.hm("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.ugen.ac.ac.1
        @Override // java.lang.Runnable
        public void run() {
            ac acVar = ac.this;
            acVar.iMK = acVar.f9192fl.ac();
            if (ac.this.lB == null) {
                ac.this.lG = "expressView is null";
            } else {
                ac acVar2 = ac.this;
                acVar2.lG = acVar2.lB.getUgenTemplateErrorReason();
            }
            com.bytedance.sdk.openadsdk.core.iMK.ac().post(ac.this.f9195zn);
        }
    };

    /* renamed from: zn  reason: collision with root package name */
    private final Runnable f9195zn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ugen.ac.ac.2
        @Override // java.lang.Runnable
        public void run() {
            if (ac.this.hpZ != null) {
                ac acVar = ac.this;
                acVar.cJ(acVar.hpZ);
            }
        }
    };
    private boolean es = false;
    protected AtomicBoolean Sf = new AtomicBoolean(false);

    static {
        if (HzH.Qhi() != null) {
            Gm = HzH.cJ();
        }
    }

    public ac(Context context, tP tPVar, boolean z10, Qhi qhi, ViewGroup viewGroup) {
        this.cJ = context;
        this.HzH = z10;
        this.Qhi = new Gm(context);
        this.CJ = tPVar;
        this.f9192fl = qhi;
        this.Tgh = new FrameLayout(context);
        if (viewGroup instanceof NativeExpressView) {
            this.lB = (NativeExpressView) viewGroup;
        }
        this.sDy = qhi.CJ();
        JSONObject aP2 = this.f9192fl.aP();
        this.Jma = aP2;
        this.NFd = new fl(this.cJ, this.CJ, this.sDy, aP2);
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    public int ac() {
        return 7;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    public View fl() {
        return this.Tgh;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void setSoundMute(boolean z10) {
        com.bytedance.adsdk.ugeno.component.cJ<View> cJ;
        com.bytedance.adsdk.ugeno.component.cJ<View> cJVar = this.f9191ac;
        if (cJVar != null && (cJ = cJVar.cJ("mute")) != null) {
            if (z10) {
                ((com.bytedance.adsdk.ugeno.component.image.cJ) cJ).fl("local://tt_reward_full_mute");
            } else {
                ((com.bytedance.adsdk.ugeno.component.image.cJ) cJ).fl("local://tt_reward_full_unmute");
            }
            cJ.cJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(Sf sf2) {
        this.f9192fl.NFd().Qhi();
        if (this.iMK == null) {
            sf2.Qhi(ShapeTypes.FLOW_CHART_DECISION, "ugen template is null real reason is " + this.lG);
        } else if (this.Jma == null) {
            sf2.Qhi(ShapeTypes.FLOW_CHART_DECISION, "ugen data is null");
        } else {
            this.Qhi.Qhi((iMK) this);
            this.Qhi.Qhi((pA) this);
            com.bytedance.adsdk.ugeno.component.cJ<View> Qhi = this.Qhi.Qhi(this.iMK);
            this.f9191ac = Qhi;
            fl flVar = this.NFd;
            if (flVar != null && Qhi != null) {
                flVar.Qhi(Qhi);
            }
            this.f9192fl.NFd().cJ();
            this.f9192fl.NFd().ac();
            this.Qhi.cJ(this.Jma);
            if (this.f9191ac != null) {
                cJ cJVar = new cJ();
                this.ROR = cJVar;
                cJVar.Qhi(true);
                this.ROR.Qhi(ac());
                setSoundMute(this.HzH);
                com.bytedance.adsdk.ugeno.component.cJ<View> cJ = this.f9191ac.cJ("video");
                this.f9193hm = cJ;
                if (cJ != null && (cJ instanceof com.bytedance.sdk.openadsdk.core.ugen.component.video.Qhi)) {
                    ((cJ) this.ROR).Qhi((FrameLayout) ((com.bytedance.sdk.openadsdk.core.ugen.component.video.Qhi) cJ).MQ());
                }
                com.bytedance.adsdk.ugeno.component.cJ<View> cJ2 = this.f9191ac.cJ("feedback");
                fl flVar2 = this.NFd;
                if (flVar2 != null) {
                    flVar2.Qhi();
                }
                if (cJ2 != null && cJ2.hm() != null) {
                    this.f9194zc = new WeakReference<>(cJ2.hm());
                }
                this.Tgh.addView(this.f9191ac.hm(), new FrameLayout.LayoutParams(this.f9191ac.hpZ(), this.f9191ac.HzH()));
                float pM2 = this.f9192fl.pM();
                float Eh2 = this.f9192fl.Eh();
                float cJ3 = zn.cJ(this.cJ, pM2);
                float cJ4 = zn.cJ(this.cJ, Eh2);
                int i10 = (Eh2 > 0.0f ? 1 : (Eh2 == 0.0f ? 0 : -1));
                if (i10 <= 0) {
                    this.Tgh.setLayoutParams(new FrameLayout.LayoutParams((int) cJ3, -2));
                } else {
                    this.Tgh.setLayoutParams(new FrameLayout.LayoutParams((int) cJ3, (int) cJ4));
                }
                if (i10 > 0 && pM2 > 0.0f) {
                    this.ROR.Qhi(pM2);
                    this.ROR.cJ(Eh2);
                } else {
                    this.Tgh.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int ac2 = zn.ac(this.cJ, this.Tgh.getMeasuredWidth());
                    int ac3 = zn.ac(this.cJ, this.Tgh.getMeasuredHeight());
                    this.ROR.Qhi(ac2);
                    this.ROR.cJ(ac3);
                }
                if (this.Sf.get()) {
                    sf2.Qhi(ShapeTypes.FLOW_CHART_DOCUMENT, "ugen render timeout");
                    return;
                } else {
                    sf2.Qhi(this.Tgh, this.ROR);
                    return;
                }
            }
            sf2.Qhi(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, "ugen render error");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    public void Qhi(Sf sf2) {
        this.hpZ = sf2;
        lG.cJ(this.js);
    }

    public void Qhi(boolean z10) {
        this.Sf.set(z10);
    }

    public void Qhi(hm hmVar) {
        this.pA = hmVar;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.widget.ac acVar) {
        fl flVar = this.NFd;
        if (flVar != null) {
            flVar.Qhi(acVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.iMK
    public void Qhi(zc zcVar, iMK.cJ cJVar, iMK.Qhi qhi) {
        if (zcVar == null) {
            return;
        }
        if (zcVar.cJ() == 1 || zcVar.cJ() == 4) {
            Qhi(zcVar);
        }
        if (zcVar.cJ() == 10) {
            Qhi(zcVar.ac());
        }
        if (cJVar == null || zcVar.CJ() == null) {
            return;
        }
        cJVar.Qhi(zcVar.CJ());
    }

    private void Qhi(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.component.cJ<View> cJ;
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(optString2) || (cJ = this.f9191ac.cJ(optString2)) == null) {
            return;
        }
        if (TextUtils.equals(optString, "onShow")) {
            cJ.ac(0);
        } else if (TextUtils.equals(optString, "onDismiss")) {
            cJ.ac(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void d_() {
    }

    private void Qhi(zc zcVar) {
        JSONObject jSONObject;
        boolean z10;
        int i10;
        String str;
        fl flVar;
        fl flVar2;
        fl flVar3;
        if (this.pA == null) {
            return;
        }
        String optString = zcVar.ac().optString("type");
        if ("swiperLeft".equals(optString) && (flVar3 = this.NFd) != null) {
            flVar3.cJ();
        } else if ("swiperRight".equals(optString) && (flVar2 = this.NFd) != null) {
            flVar2.ac();
        } else {
            if (!"swiperClick".equals(optString) || (flVar = this.NFd) == null) {
                jSONObject = null;
                z10 = false;
                i10 = 0;
            } else {
                z10 = flVar.Qhi(zcVar);
                jSONObject = this.NFd.CJ();
                i10 = 2;
            }
            optString.getClass();
            char c = 65535;
            switch (optString.hashCode()) {
                case -314498168:
                    if (optString.equals("privacy")) {
                        c = 0;
                        break;
                    }
                    break;
                case -191501435:
                    if (optString.equals("feedback")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3363353:
                    if (optString.equals("mute")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3532159:
                    if (optString.equals("skip")) {
                        c = 3;
                        break;
                    }
                    break;
                case 112202875:
                    if (optString.equals("video")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1820422063:
                    if (optString.equals("creative")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i10 = 7;
                    break;
                case 1:
                    i10 = 3;
                    break;
                case 2:
                    i10 = 5;
                    break;
                case 3:
                    i10 = 6;
                    break;
                case 4:
                    i10 = 4;
                    break;
                case 5:
                    i10 = 2;
                    break;
            }
            com.bytedance.adsdk.ugeno.component.cJ Qhi = zcVar.Qhi();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.f9194zc;
            if (weakReference != null) {
                int[] Qhi2 = zn.Qhi(weakReference.get());
                if (Qhi2 != null) {
                    iArr = Qhi2;
                }
                int[] ac2 = zn.ac(this.f9194zc.get());
                if (ac2 != null) {
                    iArr2 = ac2;
                }
            }
            pA.Qhi Qhi3 = new pA.Qhi().CJ(this.kYc).ac(this.tP).cJ(this.MQ).Qhi(this.qMt).cJ(this.EBS).Qhi(this.bxS).ac(iArr[0]).CJ(iArr[1]).fl(iArr2[0]).Tgh(iArr2[1]).Qhi(this.ABk).Qhi(this.WAv);
            if (Qhi == null) {
                str = "";
            } else {
                str = Qhi.pA() + "_" + Qhi.iMK();
            }
            this.pA.Qhi(zcVar.Qhi().hm(), i10, Qhi3.Qhi(str).cJ(z10).cJ(jSONObject).Qhi());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void setTimeUpdate(int i10) {
    }

    private void cJ(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        View hm2;
        com.bytedance.adsdk.ugeno.component.cJ<View> cJ = this.f9191ac.cJ("skip");
        if (cJ == null || (hm2 = cJ.hm()) == null) {
            return;
        }
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        hm2.setVisibility(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (com.bytedance.sdk.openadsdk.core.ugen.ac.ac.aP <= r2) goto L23;
     */
    @Override // com.bytedance.adsdk.ugeno.core.pA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(com.bytedance.adsdk.ugeno.component.cJ r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ugen.ac.ac.Qhi(com.bytedance.adsdk.ugeno.component.cJ, android.view.MotionEvent):void");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl
    public void Qhi(CharSequence charSequence, int i10, int i11, boolean z10) {
        if (this.f9191ac == null) {
            return;
        }
        boolean z11 = i10 == 1;
        Qhi(charSequence, z11, i11, z10);
        cJ(charSequence, z11, i11, z10);
    }

    private void Qhi(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11;
        com.bytedance.adsdk.ugeno.component.cJ<View> cJ = this.f9191ac.cJ("countdown");
        if (cJ == null) {
            return;
        }
        View hm2 = cJ.hm();
        if (hm2 instanceof TextView) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                ABk.Qhi("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.es) {
                hm2.setVisibility(0);
                if (!z10 && this.f9192fl.Qhi() && Dww.cJ(this.f9192fl.CJ())) {
                    ((TextView) hm2).setText(String.format(MQ.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), "tt_reward_full_skip"), Integer.valueOf(i10)));
                    return;
                } else if (!"open_ad".equals(this.f9192fl.CJ()) && this.f9192fl.Qhi()) {
                    this.es = true;
                    hm2.setVisibility(8);
                    return;
                } else {
                    ((TextView) hm2).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            hm2.setVisibility(8);
        }
    }
}
