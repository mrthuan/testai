package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.core.Dww;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.ABk;

/* loaded from: classes.dex */
public class TTAdActivity extends TTBaseActivity {
    private cJ Qhi;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            cJVar.Qhi((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        cJ cJVar = this.Qhi;
        if (cJVar == null) {
            super.onBackPressed();
        } else {
            cJVar.CJ();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.apiImpl.CJ.ac ac2 = Dww.Qhi().ac();
        com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ CJ = Dww.Qhi().CJ();
        tP Qhi = com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.video.ac.cJ) null);
        if (Qhi != null) {
            cJ cJVar = new cJ(this, Qhi);
            this.Qhi = cJVar;
            cJVar.Qhi(this, bundle, ac2, CJ);
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            cJVar.fl(this);
        }
        Dww.Qhi().Qhi((com.bytedance.sdk.openadsdk.apiImpl.CJ.ac) null);
        Dww.Qhi().Qhi((com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ) null);
        ABk.Qhi();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            cJVar.ac(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            cJVar.cJ(this);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            cJVar.Qhi(this, bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            cJVar.Qhi(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            cJVar.CJ(this);
        }
    }
}
