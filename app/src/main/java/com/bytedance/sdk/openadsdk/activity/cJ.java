package com.bytedance.sdk.openadsdk.activity;

import a0.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.WAv.hm;
import com.bytedance.sdk.openadsdk.component.reward.ABk;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.layout.TTProgressIndicator;
import com.bytedance.sdk.openadsdk.utils.ROR;
import com.bytedance.sdk.openadsdk.utils.zc;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdSceneManager.java */
/* loaded from: classes.dex */
public class cJ {

    /* renamed from: ac  reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ f8566ac;
    private static com.bytedance.sdk.openadsdk.apiImpl.CJ.ac cJ;
    private PAGFrameLayout ABk;
    private Runnable CQU;
    private int Dww;
    private boolean EBS;
    private ROR Gm;
    private int HzH;
    private TopProxyLayout MQ;
    public zc Qhi;
    private com.bytedance.sdk.openadsdk.apiImpl.CJ.ac ROR;
    private com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ Sf;
    private Activity WAv;
    private boolean bxS;

    /* renamed from: fl  reason: collision with root package name */
    private final tP f8567fl;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f8568hm;
    private PAGTextView hpZ;
    private com.bytedance.sdk.openadsdk.activity.ac iMK;
    private Bundle kYc;
    private PAGFrameLayout pA;
    private final hm pM;
    private AbstractC0106cJ qMt;
    private TTProgressIndicator tP;

    /* renamed from: zc  reason: collision with root package name */
    private int f8569zc;
    private final List<ROR> CJ = new ArrayList();
    private final Bundle Tgh = new Bundle();

    /* compiled from: AdSceneManager.java */
    /* loaded from: classes.dex */
    public static class Qhi extends AbstractC0106cJ {
        public Qhi(cJ cJVar, tP tPVar, TopProxyLayout topProxyLayout) {
            super(cJVar, tPVar, topProxyLayout);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.cJ.AbstractC0106cJ
        public int Qhi(tP tPVar) {
            return HzH.CJ().tP(String.valueOf(tPVar.Hy()));
        }
    }

    /* compiled from: AdSceneManager.java */
    /* loaded from: classes.dex */
    public static class ac extends AbstractC0106cJ {
        private int ROR;
        private boolean Sf;
        private final int Tgh;

        public ac(cJ cJVar, tP tPVar, TopProxyLayout topProxyLayout) {
            super(cJVar, tPVar, topProxyLayout);
            this.Tgh = HzH.CJ().Eh(String.valueOf(tPVar.Hy())).Tgh;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.cJ.AbstractC0106cJ
        public int Qhi(tP tPVar) {
            return HzH.CJ().Gm(String.valueOf(tPVar.Hy()));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.cJ.AbstractC0106cJ, android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!this.Sf && this.CJ <= this.ROR) {
                this.Sf = true;
                ROR kYc = this.Qhi.kYc();
                if (kYc instanceof Tgh) {
                    ((Tgh) kYc).EBS();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.cJ.AbstractC0106cJ
        public void Qhi(int i10) {
            boolean z10 = this.f8575fl == 0;
            int i11 = this.CJ;
            super.Qhi(i10);
            if (z10) {
                if (this.f8575fl == 1) {
                    this.ROR = 3;
                } else {
                    this.ROR = (int) ((1.0f - (this.Tgh / 100.0f)) * this.f8574ac);
                }
            } else if (this.f8574ac < i11) {
                this.ROR = (int) ((1.0f - (this.Tgh / 100.0f)) * this.CJ);
            }
        }
    }

    /* compiled from: AdSceneManager.java */
    /* renamed from: com.bytedance.sdk.openadsdk.activity.cJ$cJ  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0106cJ implements Handler.Callback {
        protected int CJ;
        protected final cJ Qhi;
        private final TopProxyLayout ROR;
        private final Context Sf;
        private final Handler Tgh = new Handler(Looper.getMainLooper(), this);
        private boolean WAv;

        /* renamed from: ac  reason: collision with root package name */
        protected float f8574ac;
        protected final tP cJ;

        /* renamed from: fl  reason: collision with root package name */
        protected int f8575fl;

        /* renamed from: hm  reason: collision with root package name */
        private boolean f8576hm;

        public AbstractC0106cJ(cJ cJVar, tP tPVar, TopProxyLayout topProxyLayout) {
            this.Qhi = cJVar;
            this.cJ = tPVar;
            this.ROR = topProxyLayout;
            this.Sf = topProxyLayout.getContext();
            this.CJ = Qhi(tPVar);
        }

        private void CJ() {
            if (this.Qhi.tP()) {
                this.ROR.fl();
                this.f8576hm = true;
                return;
            }
            this.WAv = true;
            this.ROR.Tgh();
        }

        public abstract int Qhi(tP tPVar);

        public void Qhi() {
            this.Tgh.removeMessages(this.f8575fl);
        }

        public void ac() {
            this.Tgh.removeMessages(this.f8575fl);
        }

        public void cJ() {
            if (this.CJ >= 0 && !this.f8576hm && !this.WAv) {
                this.Tgh.removeMessages(this.f8575fl);
                this.Tgh.sendEmptyMessage(this.f8575fl);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                if (this.CJ > 0) {
                    TopProxyLayout topProxyLayout = this.ROR;
                    Context context = this.Sf;
                    int cJ = MQ.cJ(context, "tt_reward_full_skip");
                    int i11 = this.CJ;
                    this.CJ = i11 - 1;
                    topProxyLayout.setSkipText(context.getString(cJ, Integer.valueOf(i11)));
                    if (this.CJ >= 0) {
                        this.Tgh.removeMessages(message.what);
                        this.Tgh.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    CJ();
                }
            } else if (i10 == 2) {
                if (this.CJ > 0) {
                    TopProxyLayout topProxyLayout2 = this.ROR;
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = this.CJ;
                    this.CJ = i12 - 1;
                    sb2.append(i12);
                    sb2.append("s");
                    topProxyLayout2.setSkipText(sb2.toString());
                    if (this.CJ >= 0) {
                        this.Tgh.removeMessages(message.what);
                        this.Tgh.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    CJ();
                }
            }
            return true;
        }

        public void Qhi(int i10) {
            if (this.f8576hm || this.WAv) {
                return;
            }
            float f10 = i10;
            this.f8574ac = f10;
            if (f10 > this.CJ) {
                if (this.f8575fl == 0) {
                    this.f8575fl = 2;
                }
            } else {
                this.f8575fl = 2;
                this.CJ = (int) f10;
            }
            this.Tgh.removeCallbacksAndMessages(null);
            this.Tgh.sendEmptyMessage(this.f8575fl);
        }
    }

    /* compiled from: AdSceneManager.java */
    /* loaded from: classes.dex */
    public static class fl {
        public boolean CJ;
        public final Bundle Qhi = new Bundle();

        /* renamed from: ac  reason: collision with root package name */
        public boolean f8577ac;
        public final int cJ;

        public fl(int i10) {
            this.cJ = i10;
        }
    }

    public cJ(Activity activity, tP tPVar) {
        com.bytedance.sdk.openadsdk.core.model.Qhi XJ;
        List<tP> ac2;
        this.f8567fl = tPVar;
        this.WAv = activity;
        this.pM = new hm(activity.getApplicationContext());
        int i10 = 0;
        if ((tPVar instanceof com.bytedance.sdk.openadsdk.core.model.MQ) && (XJ = ((com.bytedance.sdk.openadsdk.core.model.MQ) tPVar).XJ()) != null) {
            boolean Gm = XJ.Gm();
            this.f8568hm = Gm;
            if (Gm) {
                if (!com.bytedance.sdk.openadsdk.core.settings.HzH.YD().gT()) {
                    this.f8568hm = false;
                }
                if (this.f8568hm && (ac2 = XJ.ac()) != null) {
                    for (tP tPVar2 : ac2) {
                        this.CJ.add(Qhi(this, tPVar2, i10));
                        this.Dww++;
                        i10++;
                    }
                }
            }
        }
        if (this.CJ.isEmpty() && !bxS.Gm(tPVar)) {
            this.CJ.add(Qhi(this, tPVar, i10));
            i10++;
        }
        if (!com.bytedance.sdk.openadsdk.core.settings.HzH.YD().iMK(String.valueOf(tPVar.Hy())) && !bxS.Gm(tPVar)) {
            if (Qhi()) {
                this.Qhi = com.bytedance.sdk.openadsdk.utils.ROR.Qhi(activity, new ROR.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.cJ.1
                    @Override // com.bytedance.sdk.openadsdk.utils.ROR.Qhi
                    public View Qhi() {
                        if (cJ.this.MQ != null) {
                            return cJ.this.MQ.getCloseButton();
                        }
                        return null;
                    }

                    @Override // com.bytedance.sdk.openadsdk.utils.ROR.Qhi
                    public void cJ() {
                        if (cJ.this.MQ != null) {
                            cJ.this.MQ.ac();
                        }
                    }
                });
                return;
            }
            return;
        }
        this.CJ.add(new com.bytedance.sdk.openadsdk.activity.ac(this, tPVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ROR kYc() {
        return this.Gm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tP() {
        if (this.CJ.isEmpty()) {
            return false;
        }
        return ((ROR) a.f(this.CJ, -1)) instanceof com.bytedance.sdk.openadsdk.activity.ac;
    }

    public boolean ABk() {
        return this.bxS;
    }

    public void Gm() {
        com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar = this.ROR;
        if (acVar != null) {
            acVar.cJ();
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar = this.Sf;
        if (cJVar != null) {
            cJVar.cJ();
        }
    }

    public hm HzH() {
        return this.pM;
    }

    public TopProxyLayout ROR() {
        return this.MQ;
    }

    public ROR Sf() {
        int i10;
        ROR ror = this.Gm;
        if (ror == null || (i10 = ror.f8522hm + 1) < 0 || i10 >= this.CJ.size()) {
            return null;
        }
        return this.CJ.get(i10);
    }

    public int Tgh() {
        return this.f8569zc;
    }

    public void WAv() {
        com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar = this.ROR;
        if (acVar != null) {
            acVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar = this.Sf;
        if (cJVar != null) {
            cJVar.onAdClicked();
        }
    }

    public Bundle hm() {
        return this.Tgh;
    }

    public void hpZ() {
        this.EBS = true;
    }

    public void iMK() {
        this.bxS = true;
    }

    public boolean pA() {
        return this.EBS;
    }

    public void zc() {
        if (pA()) {
            return;
        }
        hpZ();
        com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar = this.ROR;
        if (acVar != null) {
            acVar.Qhi();
        } else {
            com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar = this.Sf;
            if (cJVar != null) {
                cJVar.Qhi();
            }
        }
        Runnable runnable = this.CQU;
        if (runnable != null) {
            runnable.run();
            this.CQU = null;
        }
    }

    private static ROR Qhi(cJ cJVar, tP tPVar, int i10) {
        boolean LpL = tPVar.LpL();
        AdSlot lB = tPVar.lB();
        if (lB != null) {
            LpL = lB.getDurationSlotType() == 7;
        }
        if (LpL) {
            return new Tgh(cJVar, tPVar, i10);
        }
        return new com.bytedance.sdk.openadsdk.activity.fl(cJVar, tPVar, i10);
    }

    private void cJ(ROR ror, fl flVar) {
        if (this.WAv == null) {
            return;
        }
        cJ();
        if (ror == null) {
            ROR ror2 = this.Gm;
            int i10 = ror2 != null ? ror2.f8522hm + 1 : 0;
            if (i10 < this.CJ.size()) {
                ror = this.CJ.get(i10);
            }
            if (ror == null) {
                Qhi(this.Gm);
                return;
            }
        }
        ROR ror3 = this.Gm;
        if (ror3 != null) {
            if (ror3 == ror) {
                return;
            }
            ror3.fl(this.WAv);
            this.Gm.ac(this.WAv);
            View Qhi2 = this.Gm.Qhi();
            if (Qhi2 != null) {
                this.pA.removeView(Qhi2);
            }
            this.Gm.pA();
            this.Gm.WAv = false;
        }
        ror.WAv = true;
        ror.Qhi(this.WAv, flVar);
        View Qhi3 = ror.Qhi();
        if (Qhi3 != null) {
            ViewParent parent = Qhi3.getParent();
            if (parent != null) {
                if (parent == this.pA) {
                    Qhi3.setVisibility(0);
                } else if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(Qhi3);
                }
            }
            if (Qhi3.getParent() == null) {
                this.pA.addView(Qhi3, new ViewGroup.LayoutParams(-1, -1));
            }
            if (this.WAv.getWindow().getContainer() == null) {
                this.WAv.setContentView(this.ABk);
            }
        }
        ROR ror4 = this.Gm;
        this.Gm = ror;
        Qhi(ror4, ror, flVar);
    }

    public void CJ(TTAdActivity tTAdActivity) {
        this.HzH = 5;
        ROR ror = this.Gm;
        if (ror != null) {
            ror.ac(tTAdActivity);
        }
    }

    public void ac(TTAdActivity tTAdActivity) {
        this.HzH = 4;
        ROR ror = this.Gm;
        if (ror != null) {
            ror.fl(tTAdActivity);
        }
        AbstractC0106cJ abstractC0106cJ = this.qMt;
        if (abstractC0106cJ != null) {
            abstractC0106cJ.Qhi();
        }
        zc zcVar = this.Qhi;
        if (zcVar != null) {
            zcVar.cJ();
        }
    }

    public void fl(TTAdActivity tTAdActivity) {
        this.HzH = 6;
        int cJ2 = cJ();
        for (ROR ror : this.CJ) {
            if (ror.f8522hm >= cJ2) {
                ror.pA();
            }
        }
        ROR ror2 = this.Gm;
        if (ror2 != null) {
            ror2.pM();
        }
        ROR ror3 = this.Gm;
        if (ror3 != null && !ror3.tP()) {
            iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.cJ.2
                @Override // java.lang.Runnable
                public void run() {
                    if (cJ.this.f8567fl.LpL()) {
                        ABk.Qhi(HzH.Qhi()).Qhi(cJ.this.f8567fl.lB());
                    } else {
                        com.bytedance.sdk.openadsdk.component.reward.Tgh.Qhi(HzH.Qhi()).Qhi(cJ.this.f8567fl.lB());
                    }
                }
            });
        }
        AbstractC0106cJ abstractC0106cJ = this.qMt;
        if (abstractC0106cJ != null) {
            abstractC0106cJ.ac();
        }
        zc zcVar = this.Qhi;
        if (zcVar != null) {
            zcVar.ac();
        }
        this.Gm = null;
        this.WAv = null;
    }

    public void CJ() {
        ROR ror = this.Gm;
        if (ror != null) {
            ror.HzH();
        }
    }

    public boolean Qhi() {
        return this.f8568hm;
    }

    public void Qhi(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar, com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar) {
        this.kYc = bundle;
        this.HzH = 1;
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(tTAdActivity);
        this.ABk = pAGFrameLayout;
        pAGFrameLayout.setFitsSystemWindows(true);
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(tTAdActivity);
        this.pA = pAGFrameLayout2;
        this.ABk.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        if (this.f8568hm) {
            this.tP = new TTProgressIndicator(tTAdActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, zn.cJ(tTAdActivity, 2.0f));
            layoutParams.gravity = 80;
            this.ABk.addView(this.tP, layoutParams);
            PAGTextView pAGTextView = new PAGTextView(tTAdActivity);
            this.hpZ = pAGTextView;
            pAGTextView.setTextColor(-1);
            this.hpZ.setTextSize(15.0f);
            this.hpZ.setShadowLayer(1.0f, 0.0f, 1.0f, -16777216);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = zn.cJ(tTAdActivity, 60.0f);
            layoutParams2.rightMargin = zn.cJ(tTAdActivity, 16.0f);
            layoutParams2.gravity = 8388661;
            this.ABk.addView(this.hpZ, layoutParams2);
            TopProxyLayout topProxyLayout = new TopProxyLayout(tTAdActivity);
            this.MQ = topProxyLayout;
            this.ABk.addView(topProxyLayout, new FrameLayout.LayoutParams(-1, -2));
            this.MQ.Qhi(this.f8567fl);
            this.MQ.setShowDislike(true);
        }
        this.ROR = acVar;
        this.Sf = cJVar;
        if (acVar == null && bundle != null) {
            this.ROR = cJ;
            cJ = null;
        }
        if (cJVar == null && bundle != null) {
            this.Sf = f8566ac;
            f8566ac = null;
        }
        cJ(null, new fl(1));
    }

    public Activity ac() {
        return this.WAv;
    }

    public com.bytedance.sdk.openadsdk.activity.ac fl() {
        com.bytedance.sdk.openadsdk.activity.ac acVar = this.iMK;
        if (acVar != null) {
            return acVar;
        }
        ROR ror = this.Gm;
        int i10 = ror != null ? ror.f8522hm : -1;
        int size = this.CJ.size() - 1;
        while (true) {
            if (size <= i10) {
                break;
            }
            ROR ror2 = this.CJ.get(size);
            if (ror2 instanceof com.bytedance.sdk.openadsdk.activity.ac) {
                this.iMK = (com.bytedance.sdk.openadsdk.activity.ac) ror2;
                break;
            }
            size--;
        }
        return this.iMK;
    }

    public void cJ(TTAdActivity tTAdActivity) {
        this.HzH = 3;
        ROR ror = this.Gm;
        if (ror != null) {
            ror.cJ(tTAdActivity);
        }
        AbstractC0106cJ abstractC0106cJ = this.qMt;
        if (abstractC0106cJ != null) {
            abstractC0106cJ.cJ();
        }
        zc zcVar = this.Qhi;
        if (zcVar != null) {
            zcVar.Qhi();
        }
    }

    public int cJ() {
        ROR ror = this.Gm;
        if (ror != null) {
            return ror.f8522hm;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [double] */
    /* JADX WARN: Type inference failed for: r5v6, types: [long] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8, types: [double] */
    private void Qhi(ROR ror, ROR ror2, fl flVar) {
        long j10;
        long j11;
        if (this.f8568hm) {
            boolean z10 = ror2 instanceof com.bytedance.sdk.openadsdk.activity.Qhi;
            if (z10) {
                this.f8569zc++;
                Qhi(0.0f);
                if (this.qMt == null) {
                    if (ror2 instanceof com.bytedance.sdk.openadsdk.activity.fl) {
                        this.qMt = new Qhi(this, this.f8567fl, this.MQ);
                    } else {
                        this.qMt = new ac(this, this.f8567fl, this.MQ);
                    }
                }
                int i10 = 0;
                for (int i11 = ror2.f8522hm; i11 < this.CJ.size(); i11++) {
                    ROR ror3 = this.CJ.get(i11);
                    if (ror3 instanceof com.bytedance.sdk.openadsdk.activity.ac) {
                        break;
                    }
                    com.bykv.vk.openvk.component.video.api.ac.cJ FQ = ror3.Sf.FQ();
                    if (FQ != null) {
                        j11 = i10;
                        j10 = FQ.Tgh();
                    } else {
                        j10 = i10;
                        j11 = 10;
                    }
                    i10 = (int) (j10 + j11);
                }
                this.qMt.Qhi(i10);
                zc zcVar = this.Qhi;
                if (zcVar != null && ror == null) {
                    zcVar.Qhi(i10 * 1000);
                }
            } else if (ror2 instanceof com.bytedance.sdk.openadsdk.activity.ac) {
                TTProgressIndicator tTProgressIndicator = this.tP;
                if (tTProgressIndicator != null) {
                    zn.ROR(tTProgressIndicator);
                    this.tP = null;
                }
                TopProxyLayout topProxyLayout = this.MQ;
                if (topProxyLayout != null) {
                    zn.ROR(topProxyLayout);
                    zn.ROR(this.MQ.getITopLayout());
                    this.MQ = null;
                }
                AbstractC0106cJ abstractC0106cJ = this.qMt;
                if (abstractC0106cJ != null) {
                    abstractC0106cJ.ac();
                }
                if (ror instanceof Tgh) {
                    ((Tgh) ror).EBS();
                }
                zc zcVar2 = this.Qhi;
                if (zcVar2 != null) {
                    zcVar2.ac();
                }
            }
            if (z10) {
                this.hpZ.setText(this.WAv.getString(MQ.cJ(HzH.Qhi(), "tt_multiple_ad_indicator"), Integer.valueOf(ror2.f8522hm + 1), Integer.valueOf(this.Dww)));
            } else {
                this.hpZ.setVisibility(8);
            }
        }
        for (int i12 = ror != null ? ror.f8522hm : 0; i12 < this.CJ.size(); i12++) {
            this.CJ.get(i12).Qhi(ror, ror2, flVar);
        }
        ror2.Qhi(this.WAv, this.kYc);
        int i13 = this.HzH;
        if (i13 == 2) {
            ror2.CJ(this.WAv);
        } else if (i13 == 3) {
            ror2.CJ(this.WAv);
            ror2.cJ(this.WAv);
        } else if (i13 == 4) {
            ror2.fl(this.WAv);
        } else if (i13 == 5) {
            ror2.ac(this.WAv);
        }
    }

    public void Qhi(TTAdActivity tTAdActivity) {
        this.HzH = 2;
        ROR ror = this.Gm;
        if (ror != null) {
            ror.CJ(tTAdActivity);
        }
    }

    public void Qhi(TTAdActivity tTAdActivity, Bundle bundle) {
        com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar = this.ROR;
        if (acVar != null) {
            cJ = acVar;
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar = this.Sf;
        if (cJVar != null) {
            f8566ac = cJVar;
        }
    }

    public void Qhi(ROR ror, fl flVar) {
        ROR ror2 = this.Gm;
        if (ror2 == null || ror2 == ror) {
            cJ(null, flVar);
        }
    }

    public void Qhi(ROR ror) {
        if (ror instanceof Tgh) {
            ((Tgh) ror).EBS();
        }
        Activity activity = this.WAv;
        if (activity != null) {
            activity.finish();
        }
    }

    public void Qhi(ROR ror, boolean z10, boolean z11, boolean z12, int i10) {
        com.bytedance.sdk.openadsdk.activity.ac fl2;
        ROR ror2 = this.Gm;
        if ((ror2 == null || ror2 == ror) && (fl2 = fl()) != null) {
            fl flVar = new fl(i10);
            flVar.Qhi.putBoolean("isSkip", z10);
            flVar.Qhi.putBoolean("force", z11);
            flVar.Qhi.putBoolean("isFromLandingPage", z12);
            cJ(fl2, flVar);
        }
    }

    public void Qhi(Activity activity) {
        ROR ror = this.Gm;
        if (ror != null) {
            ror.Qhi(activity);
        }
    }

    public void Qhi(float f10) {
        TTProgressIndicator tTProgressIndicator = this.tP;
        if (tTProgressIndicator == null) {
            return;
        }
        tTProgressIndicator.setProgress(f10);
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 == 0 && this.tP.getVisibility() == 0) {
            this.tP.setVisibility(4);
        } else if (i10 <= 0 || this.tP.getVisibility() == 0) {
        } else {
            this.tP.setVisibility(0);
        }
    }

    public void Qhi(int i10) {
        AbstractC0106cJ abstractC0106cJ = this.qMt;
        if (abstractC0106cJ == null) {
            return;
        }
        if (i10 == 2) {
            abstractC0106cJ.Qhi();
            zc zcVar = this.Qhi;
            if (zcVar != null) {
                zcVar.cJ();
            }
        } else if (i10 == 1) {
            abstractC0106cJ.cJ();
            zc zcVar2 = this.Qhi;
            if (zcVar2 != null) {
                zcVar2.Qhi();
            }
        }
    }

    public void Qhi(final ROR ror, final boolean z10, final int i10, final String str, final int i11, final String str2) {
        Activity activity;
        if (!this.EBS) {
            this.CQU = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.cJ.3
                @Override // java.lang.Runnable
                public void run() {
                    cJ.this.Qhi(ror, z10, i10, str, i11, str2);
                }
            };
        } else if (ABk()) {
        } else {
            iMK();
            if (this.ROR == null || (activity = this.WAv) == null) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.cJ.4
                @Override // java.lang.Runnable
                public void run() {
                    cJ.this.ROR.Qhi(z10, i10, str, i11, str2);
                }
            });
            if (Qhi()) {
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(System.currentTimeMillis(), ror.Sf, ror.b_(), z10 ? "reward_success" : "reward_fail");
            }
        }
    }

    public void Qhi(View view) {
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.pA.addView(view, 0);
    }
}
