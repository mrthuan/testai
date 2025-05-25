package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.cJ.cJ;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.hm;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.pA;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.qMt;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hpsf.Constants;

/* loaded from: classes.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements CQU.Qhi, com.bytedance.sdk.openadsdk.core.video.ac.cJ {
    private final AtomicBoolean ABk;
    final CQU CJ;
    private boolean Gm;
    public final String Qhi;
    boolean Sf;
    int Tgh;
    protected com.bytedance.sdk.openadsdk.WAv.Tgh WAv;

    /* renamed from: ac  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.component.reward.cJ.cJ f8530ac;
    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected IListenerManager f8531fl;

    /* renamed from: hm  reason: collision with root package name */
    int f8532hm;

    /* renamed from: zc  reason: collision with root package name */
    private int f8533zc;

    public TTBaseVideoActivity() {
        String str;
        if (HzH()) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        this.Qhi = str;
        this.CJ = new CQU(Looper.getMainLooper(), this);
        this.Gm = false;
        this.f8533zc = 0;
        this.f8532hm = 1;
        this.ABk = new AtomicBoolean(false);
        this.WAv = new com.bytedance.sdk.openadsdk.WAv.Tgh() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.WAv.Tgh
            public void Qhi() {
                TTBaseVideoActivity.this.iMK();
            }
        };
    }

    private void MQ() {
        this.f8530ac.Qhi(this.WAv);
        this.Tgh = (int) this.cJ.bxS.aP();
        hpZ();
        ac();
        if (this.cJ.cJ.cJP() != null && this.cJ.cJ.cJP().Qhi() != null) {
            this.cJ.cJ.cJP().Qhi().Qhi(0L);
        }
    }

    private boolean qMt() {
        if (this.cJ.WAv.get() && this.cJ.ROR) {
            return false;
        }
        if (!(this instanceof TTFullScreenExpressVideoActivity) && !(this instanceof TTRewardExpressVideoActivity)) {
            return true;
        }
        return this.cJ.WAv.get();
    }

    private void tP() {
        setContentView(this.cJ.yN);
        this.cJ.yN.Qhi(this.f8530ac);
        this.f8530ac.Qhi(this, this.CJ);
        this.f8530ac.Gm();
    }

    public void ABk() {
        Message message = new Message();
        message.what = 400;
        if (HzH()) {
            Qhi(Constants.CP_MAC_ROMAN);
        }
        this.CJ.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Gm() {
        if (this.cJ.iMK.getAndSet(true) && !bxS.Gm(this.cJ.cJ)) {
            return;
        }
        this.cJ.aP.Qhi();
    }

    public abstract boolean HzH();

    public abstract void Qhi();

    public void Qhi(Intent intent) {
    }

    public void ROR() {
        if (!kYc() || this.Gm) {
            return;
        }
        this.Gm = true;
        getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.3
            @Override // java.lang.Runnable
            public void run() {
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = tTBaseVideoActivity.cJ;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.ROR ror = qhi.NFd;
                float[] Qhi = qhi.Eh.Qhi(tTBaseVideoActivity.f8532hm);
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                ror.Qhi(Qhi, tTBaseVideoActivity2, tTBaseVideoActivity2.f8530ac);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Sf() {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.f8530ac;
        if (cJVar == null) {
            return;
        }
        cJVar.ABk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void Tgh() {
        if (!this.ABk.compareAndSet(false, true)) {
            return;
        }
        qMt.Qhi("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
        fl();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public View WAv() {
        return this.cJ.bxS.sDy();
    }

    public void ac() {
        if (bxS.Gm(this.cJ.cJ)) {
            Qhi(false, cJ.C0110cJ.f8695ac);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.f8530ac;
        if (cJVar != null) {
            cJVar.Qhi(this.cJ.es.Tgh());
            this.f8530ac.pM();
        }
    }

    public IListenerManager cJ(int i10) {
        if (this.f8531fl == null) {
            this.f8531fl = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi().Qhi(i10));
        }
        return this.f8531fl;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.cJ == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.CQU.fl()) {
            zn.cJ((Activity) this);
        }
        if (bxS.cJ(this.cJ.cJ) && !this.cJ.WAv.get()) {
            ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
        }
    }

    public abstract void fl();

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void hm() {
        this.cJ.bxS.NFd();
    }

    public abstract void hpZ();

    public boolean kYc() {
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi == null) {
            return;
        }
        qhi.Eh.Qhi();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar;
        if (this.cJ != null && (cJVar = this.f8530ac) != null) {
            cJVar.bxS();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi;
        super.onCreate(bundle);
        qMt.Qhi("BVA", "onCreate ".concat(String.valueOf(this)));
        HzH.cJ(getApplicationContext());
        if (!iMK.fl()) {
            finish();
            return;
        }
        tP Qhi = com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(getIntent(), bundle, this);
        if (Qhi == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.cJ.Qhi(Qhi);
        this.f8532hm = Qhi.SL();
        Qhi(Qhi, bundle);
        if (bundle != null) {
            if (Qhi.Xx()) {
                this.ABk.set(true);
            }
            if (Qhi.uyf() && (qhi = this.cJ) != null) {
                qhi.ABk.set(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.cJ;
            if (qhi2 != null) {
                qhi2.aP.ROR();
            }
        }
        try {
            tP();
            MQ();
        } catch (Throwable th2) {
            ABk.Qhi("TTAD.BVA", "onCreate: ", th2);
            com.bytedance.sdk.openadsdk.Gm.ac.cJ();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qMt.Qhi("BVA", "onDestroy ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi != null && this.f8530ac != null) {
            if (qhi.HLI > 0 && qhi.ABk.get()) {
                String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.cJ.HLI);
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.cJ;
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(valueOf, qhi2.cJ, this.Qhi, qhi2.bxS.Qhi());
                this.cJ.HLI = 0L;
            }
            this.cJ.sDy.cJ();
            this.CJ.removeCallbacksAndMessages(null);
            this.f8530ac.EBS();
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(this.cJ.cJ);
            final AdSlot lB = this.cJ.cJ.lB();
            if (!this.cJ.bxS.Dww() && lB != null && TextUtils.isEmpty(lB.getBidAdm())) {
                iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TTBaseVideoActivity.this.HzH()) {
                            com.bytedance.sdk.openadsdk.component.reward.ABk.Qhi(HzH.Qhi()).Qhi(lB);
                        } else {
                            com.bytedance.sdk.openadsdk.component.reward.Tgh.Qhi(HzH.Qhi()).Qhi(lB);
                        }
                    }
                });
            }
            com.bytedance.sdk.openadsdk.utils.ABk.Qhi();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        qMt.Qhi("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.f8530ac;
        if (cJVar == null) {
            return;
        }
        cJVar.MQ();
    }

    @Override // android.app.Activity
    public void onRestart() {
        tP tPVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi != null && (tPVar = qhi.cJ) != null) {
            if (this.ROR && !tPVar.HUk() && !TextUtils.isEmpty(tP.Qhi(this, tPVar))) {
                finish();
            }
            if (tPVar.HUk()) {
                tPVar.fl(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar;
        boolean z10;
        super.onResume();
        qMt.Qhi("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.cJ != null && (cJVar = this.f8530ac) != null) {
            cJVar.HzH();
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
            qhi.Qe = true;
            qhi.Eh.cJ(this.CJ);
            if (qMt()) {
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.cJ;
                qhi2.js.Qhi(qhi2.cJ.rB());
            }
            this.cJ.es.pA();
            this.cJ.lG.MQ();
            this.cJ.CQU.ABk();
            if (this.f8530ac.cJ()) {
                this.cJ.bxS.Qhi(this.f8530ac);
                pA pAVar = this.cJ.bxS;
                if (this.f8533zc != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pAVar.Qhi(false, this, z10);
            }
            this.f8533zc++;
            ROR();
            com.bytedance.sdk.openadsdk.component.reward.view.ac acVar = this.cJ.pM;
            if (acVar != null) {
                acVar.ROR();
            }
            this.cJ.Eh.Qhi(this.CJ);
            this.f8530ac.tP();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (qhi.ABk.get()) {
            this.cJ.cJ.Sf(true);
        }
        if (this.ABk.get()) {
            this.cJ.cJ.gt();
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(this.cJ, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        qMt.Qhi("BVA", "onStart ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi == null) {
            return;
        }
        qhi.lG.sDy();
        com.bytedance.sdk.openadsdk.utils.ac.Qhi(this, this.cJ.cJ);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        qMt.Qhi("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.f8530ac;
        if (cJVar == null) {
            return;
        }
        cJVar.qMt();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        hm hmVar;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi != null && (hmVar = qhi.aP) != null) {
            hmVar.cJ(z10);
            this.cJ.aP.ac(z10);
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.cJ;
        if (qhi2 != null) {
            com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = qhi2.ReL;
            if (cJVar instanceof com.bytedance.sdk.openadsdk.component.reward.cJ.Tgh) {
                ((com.bytedance.sdk.openadsdk.component.reward.cJ.Tgh) cJVar).cJ(z10);
            }
        }
    }

    public void pA() {
        this.CJ.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(Bundle bundle) {
    }

    private void Qhi(tP tPVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = new com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi(this, this.CJ, tPVar, this, 0);
        this.cJ = qhi;
        com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(qhi, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Qhi(intent);
            tPVar.Qhi(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.cJ.zjb) {
            Qhi();
        }
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ Qhi = com.bytedance.sdk.openadsdk.component.reward.cJ.ROR.Qhi(this.cJ);
        this.f8530ac = Qhi;
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.cJ;
        qhi2.ReL = Qhi;
        com.bytedance.sdk.openadsdk.utils.ABk.Qhi(qhi2);
        Objects.toString(this.f8530ac);
    }

    public void Qhi(boolean z10, int i10) {
        Qhi(z10, false, i10);
    }

    public void Qhi(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.f8530ac;
        if (cJVar == null) {
            return;
        }
        cJVar.Qhi(z10, z11, false, i10);
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.f8530ac;
        if (cJVar == null) {
            return;
        }
        cJVar.Qhi(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void zc() {
    }
}
