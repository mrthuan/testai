package com.bytedance.sdk.openadsdk.component;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.ROR;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenBaseLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenDefaultNativeLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenIconOnlyLayout;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.cJ.cJ;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.hpZ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.pA;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: AppOpenAdNativeManager.java */
/* loaded from: classes.dex */
public class ac {
    private PAGTextView ABk;
    protected final FrameLayout CJ;
    private PAGImageView CQU;
    private PAGTextView Dww;
    private PAGImageView EBS;
    private View Eh;
    private ImageView Gm;
    private PAGTextView HzH;
    private final com.bytedance.sdk.openadsdk.component.view.Qhi MQ = new com.bytedance.sdk.openadsdk.component.view.Qhi();
    protected final Activity Qhi;
    protected int ROR;
    protected FrameLayout Sf;
    protected final int Tgh;
    private RelativeLayout WAv;

    /* renamed from: ac  reason: collision with root package name */
    protected final boolean f8763ac;
    private com.bytedance.sdk.openadsdk.component.Sf.ac bxS;
    protected final tP cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.component.Qhi f8764fl;

    /* renamed from: hm  reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.component.Sf.Qhi f8765hm;
    private PAGTextView hpZ;
    private ImageView iMK;
    private float kYc;
    private TTRoundRectImageView pA;
    private TTRatingBar2 pM;
    private View qMt;
    private float tP;

    /* renamed from: zc  reason: collision with root package name */
    private PAGLogoView f8766zc;

    /* compiled from: AppOpenAdNativeManager.java */
    /* loaded from: classes.dex */
    public class Qhi implements ROR.fl {
        WeakReference<Activity> Qhi;

        public Qhi(Activity activity) {
            this.Qhi = new WeakReference<>(activity);
        }

        @Override // com.bytedance.sdk.openadsdk.component.ROR.fl
        public void Qhi(Bitmap bitmap) {
            if (this.Qhi.get() != null && !this.Qhi.get().isFinishing()) {
                ac.this.Qhi(bitmap);
            }
        }
    }

    /* compiled from: AppOpenAdNativeManager.java */
    /* loaded from: classes.dex */
    public static class cJ implements pA.Qhi {
        private final WeakReference<ac> Qhi;

        public cJ(ac acVar) {
            this.Qhi = new WeakReference<>(acVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.pA.Qhi
        public void Qhi() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.pA.Qhi
        public void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi.cJ cJVar) {
            ac acVar;
            if (!cJVar.CJ() || (acVar = this.Qhi.get()) == null) {
                return;
            }
            acVar.Qhi(cJVar);
            if (cJVar.cJ() != null) {
                acVar.Qhi(cJVar.Qhi());
            }
        }
    }

    public ac(Activity activity, tP tPVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.Qhi qhi, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.Sf.Qhi qhi2) {
        this.Qhi = activity;
        this.cJ = tPVar;
        this.CJ = frameLayout;
        this.ROR = i10;
        this.f8763ac = z10;
        this.f8764fl = qhi;
        this.Tgh = tPVar.Hy();
        this.f8765hm = qhi2;
    }

    private void ROR() {
        if (this.hpZ != null) {
            if (this.cJ.pv() != null && !TextUtils.isEmpty(this.cJ.pv().cJ())) {
                this.hpZ.setText(this.cJ.pv().cJ());
            } else if (!TextUtils.isEmpty(this.cJ.PAe())) {
                this.hpZ.setText(this.cJ.PAe());
            } else {
                this.hpZ.setVisibility(8);
            }
        }
        if (this.HzH != null) {
            if (!TextUtils.isEmpty(this.cJ.dVA())) {
                this.HzH.setText(this.cJ.dVA());
            } else {
                this.HzH.setVisibility(8);
            }
        }
        if (this.pA != null && this.cJ.dIT() != null && !TextUtils.isEmpty(this.cJ.dIT().Qhi())) {
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.cJ.dIT().Qhi(), this.cJ.dIT().cJ(), this.cJ.dIT().ac(), this.pA, this.cJ);
        }
        this.f8764fl.ac();
    }

    private void Sf() {
        String ROR;
        hpZ hpz = this.cJ.cjC().get(0);
        if (TextUtils.isEmpty(hpz.ROR())) {
            ROR = com.bytedance.sdk.component.utils.Tgh.Qhi(hpz.Qhi());
        } else {
            ROR = hpz.ROR();
        }
        pA.Qhi(new com.bytedance.sdk.openadsdk.iMK.Qhi(hpz.Qhi(), hpz.ROR()), hpz.cJ(), hpz.ac(), new cJ(this), com.bytedance.sdk.openadsdk.component.ROR.Qhi.cJ(ROR).getParent(), 25);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Tgh() {
        /*
            r8 = this;
            com.bytedance.sdk.openadsdk.component.view.Qhi r0 = r8.MQ
            r0.Qhi()
            com.bytedance.sdk.openadsdk.core.customview.PAGTextView r0 = r8.ABk
            com.bytedance.sdk.openadsdk.core.model.tP r1 = r8.cJ
            java.lang.String r1 = r1.ots()
            r0.setText(r1)
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r8.cJ
            boolean r0 = r0.czB()
            if (r0 == 0) goto L1c
            r8.ROR()
            return
        L1c:
            boolean r0 = r8.f8763ac
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L4b
            r8.cJ(r1)
            r8.Qhi(r2)
            android.widget.FrameLayout r0 = r8.Sf
            boolean r0 = r8.Qhi(r0)
            if (r0 == 0) goto L37
            com.bytedance.sdk.openadsdk.component.Qhi r0 = r8.f8764fl
            r0.ac()
            goto L3c
        L37:
            com.bytedance.sdk.openadsdk.component.Qhi r0 = r8.f8764fl
            r0.CJ()
        L3c:
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r8.cJ
            com.bytedance.sdk.openadsdk.component.ac$Qhi r3 = new com.bytedance.sdk.openadsdk.component.ac$Qhi
            android.app.Activity r4 = r8.Qhi
            r3.<init>(r4)
            r4 = 25
            com.bytedance.sdk.openadsdk.component.ROR.Qhi(r0, r3, r4)
            goto L59
        L4b:
            r8.cJ(r2)
            r8.Qhi(r1)
            r8.Sf()
            com.bytedance.sdk.openadsdk.component.Qhi r0 = r8.f8764fl
            r0.ac()
        L59:
            com.bytedance.sdk.openadsdk.core.customview.PAGTextView r0 = r8.Dww
            r3 = 1
            if (r0 == 0) goto L8f
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r8.cJ
            java.lang.String r0 = r0.PAe()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L77
            com.bytedance.sdk.openadsdk.core.customview.PAGTextView r0 = r8.Dww
            com.bytedance.sdk.openadsdk.core.model.tP r4 = r8.cJ
            java.lang.String r4 = r4.PAe()
            r0.setText(r4)
        L75:
            r0 = r3
            goto L90
        L77:
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r8.cJ
            com.bytedance.sdk.openadsdk.core.model.ac r0 = r0.pv()
            if (r0 == 0) goto L8f
            com.bytedance.sdk.openadsdk.core.customview.PAGTextView r0 = r8.Dww
            com.bytedance.sdk.openadsdk.core.model.tP r4 = r8.cJ
            com.bytedance.sdk.openadsdk.core.model.ac r4 = r4.pv()
            java.lang.String r4 = r4.cJ()
            r0.setText(r4)
            goto L75
        L8f:
            r0 = r1
        L90:
            com.bytedance.sdk.openadsdk.core.customview.PAGImageView r4 = r8.CQU
            if (r4 == 0) goto La5
            com.bytedance.sdk.openadsdk.iMK.ac r4 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi()
            com.bytedance.sdk.openadsdk.core.model.tP r5 = r8.cJ
            com.bytedance.sdk.openadsdk.core.model.hpZ r5 = r5.dIT()
            com.bytedance.sdk.openadsdk.core.customview.PAGImageView r6 = r8.CQU
            com.bytedance.sdk.openadsdk.core.model.tP r7 = r8.cJ
            r4.Qhi(r5, r6, r7)
        La5:
            com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2 r4 = r8.pM
            if (r4 == 0) goto Lcc
            r5 = 0
            com.bytedance.sdk.openadsdk.core.model.tP r6 = r8.cJ
            com.bytedance.sdk.openadsdk.utils.zn.Qhi(r5, r4, r6)
            com.bytedance.sdk.openadsdk.core.model.tP r4 = r8.cJ
            com.bytedance.sdk.openadsdk.core.model.ac r4 = r4.pv()
            if (r4 == 0) goto Lc7
            com.bytedance.sdk.openadsdk.core.model.tP r4 = r8.cJ
            com.bytedance.sdk.openadsdk.core.model.ac r4 = r4.pv()
            double r4 = r4.CJ()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto Lcd
        Lc7:
            com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2 r3 = r8.pM
            r3.setVisibility(r2)
        Lcc:
            r3 = r0
        Lcd:
            android.view.View r0 = r8.Eh
            if (r0 == 0) goto Ld8
            if (r3 == 0) goto Ld4
            goto Ld5
        Ld4:
            r1 = r2
        Ld5:
            r0.setVisibility(r1)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.ac.Tgh():void");
    }

    public int CJ() {
        return -1;
    }

    public JSONObject Qhi(JSONObject jSONObject) {
        return null;
    }

    public void ac() {
        com.bytedance.sdk.openadsdk.component.Sf.ac acVar = this.bxS;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    public void cJ() {
        if (!this.cJ.gT()) {
            Tgh();
        } else {
            this.f8764fl.ac();
        }
    }

    public com.bytedance.sdk.openadsdk.component.Sf.ac fl() {
        return this.bxS;
    }

    public void Qhi(int i10, int i11, boolean z10) {
    }

    private void cJ(int i10) {
        zn.Qhi((View) this.Sf, i10);
    }

    public void Qhi(ViewGroup viewGroup) {
        PAGAppOpenBaseLayout pAGAppOpenDefaultNativeLayout = new PAGAppOpenDefaultNativeLayout(this.Qhi);
        int ABk = this.cJ.ABk();
        if (ABk == 5) {
            pAGAppOpenDefaultNativeLayout = new PAGAppOpenIconOnlyLayout(this.Qhi);
        } else if (ABk == 4) {
            pAGAppOpenDefaultNativeLayout = new PAGAppOpenHtmlLayout(this.Qhi, this.cJ);
        }
        this.WAv = pAGAppOpenDefaultNativeLayout;
        viewGroup.addView(pAGAppOpenDefaultNativeLayout);
        this.iMK = pAGAppOpenDefaultNativeLayout.getBackImage();
        this.Sf = pAGAppOpenDefaultNativeLayout.getVideoContainer();
        this.Gm = pAGAppOpenDefaultNativeLayout.getImageView();
        this.ABk = pAGAppOpenDefaultNativeLayout.getClickButton();
        this.f8766zc = pAGAppOpenDefaultNativeLayout.getAdLogo();
        this.Dww = pAGAppOpenDefaultNativeLayout.getAdTitleTextView();
        this.CQU = pAGAppOpenDefaultNativeLayout.getAdIconView();
        this.pM = pAGAppOpenDefaultNativeLayout.getScoreBar();
        this.Eh = pAGAppOpenDefaultNativeLayout.getOverlayLayout();
        if (this.cJ.czB()) {
            this.pA = pAGAppOpenDefaultNativeLayout.getIconOnlyView();
            this.hpZ = pAGAppOpenDefaultNativeLayout.getTitle();
            this.HzH = pAGAppOpenDefaultNativeLayout.getContent();
        }
        if (pAGAppOpenDefaultNativeLayout.getDspAdChoice() != null) {
            pAGAppOpenDefaultNativeLayout.getDspAdChoice().Qhi(14, this.cJ);
        }
        if (!this.cJ.gT()) {
            this.MQ.Qhi(pAGAppOpenDefaultNativeLayout, this.cJ, this.tP, this.kYc, this.f8763ac);
        }
        this.qMt = pAGAppOpenDefaultNativeLayout.getTopDisLike();
        this.EBS = pAGAppOpenDefaultNativeLayout.getTopSkip();
        if (pAGAppOpenDefaultNativeLayout instanceof PAGAppOpenHtmlLayout) {
            ((PAGAppOpenHtmlLayout) pAGAppOpenDefaultNativeLayout).setRenderListener(new PAGAppOpenHtmlLayout.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.ac.1
                @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout.Qhi
                public void Qhi(View view, int i10) {
                    ac.this.f8764fl.fl();
                }
            });
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Qhi() {
        this.f8766zc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ac.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    ac acVar = ac.this;
                    TTWebsiteActivity.Qhi(acVar.Qhi, acVar.cJ, "open_ad");
                } catch (Throwable th2) {
                    ABk.Qhi("AppOpenAdNativeManager", th2.getMessage());
                }
            }
        });
        this.qMt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ac.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.Qhi qhi = ac.this.f8764fl;
                if (qhi != null) {
                    qhi.cJ(view);
                }
            }
        });
        this.EBS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ac.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.Qhi qhi = ac.this.f8764fl;
                if (qhi != null) {
                    qhi.Qhi(view);
                }
            }
        });
        if (this.cJ.gT()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.Qhi.Qhi Qhi2 = com.bytedance.sdk.openadsdk.component.Qhi.cJ.Qhi(this.cJ, this.Qhi, this.f8765hm);
        Qhi2.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.ac.5
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
            public void Qhi(View view, int i10) {
                ac.this.f8764fl.fl();
            }
        });
        Qhi2.Qhi(this.bxS);
        if (this.cJ.zc() == 1) {
            this.WAv.setOnClickListener(Qhi2);
            this.WAv.setOnTouchListener(Qhi2);
        }
        this.ABk.setOnClickListener(Qhi2);
        this.ABk.setOnTouchListener(Qhi2);
    }

    public boolean Qhi(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.Sf.ac acVar = new com.bytedance.sdk.openadsdk.component.Sf.ac(this.Qhi);
        this.bxS = acVar;
        acVar.Qhi(frameLayout, this.cJ);
        this.bxS.Qhi(this.f8764fl);
        try {
            return this.bxS.Qhi();
        } catch (Throwable th2) {
            ABk.Qhi("AppOpenAdNativeManager", "open_ad", "ttAppOpenAd playVideo error: " + th2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                this.iMK.setImageDrawable(new BitmapDrawable(HzH.Qhi().getResources(), bitmap));
            } catch (Throwable unused) {
                ABk.Qhi("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
            }
        }
    }

    public void Qhi(com.bytedance.sdk.openadsdk.iMK.Qhi.cJ cJVar) {
        if (cJVar.cJ() != null) {
            this.Gm.setImageBitmap(cJVar.cJ());
        } else if (this.cJ.cjC() == null || this.cJ.cjC().get(0) == null) {
        } else {
            Drawable Qhi2 = pA.Qhi(cJVar.ac(), this.cJ.cjC().get(0).cJ());
            this.Gm.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.Gm.setImageDrawable(Qhi2);
        }
    }

    public void Qhi(int i10) {
        zn.Qhi((View) this.Gm, i10);
    }

    public void Qhi(float f10, float f11) {
        this.tP = f10;
        this.kYc = f11;
    }
}
