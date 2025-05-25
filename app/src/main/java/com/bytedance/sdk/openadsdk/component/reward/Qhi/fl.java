package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.tP;
import org.json.JSONObject;

/* compiled from: RewardFullDownloadManager.java */
/* loaded from: classes.dex */
public class fl {
    private boolean CJ;
    com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final String f8813ac;
    private final tP cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi f8814fl;

    /* compiled from: RewardFullDownloadManager.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, int i10, int i11, int i12);

        void Qhi(String str, JSONObject jSONObject);
    }

    public fl(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        this.f8814fl = qhi;
        this.cJ = qhi.cJ;
        this.f8813ac = qhi.f8798fl;
    }

    private void CJ() {
        if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac() && this.cJ.ip() == 4) {
            this.Qhi = com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(this.f8814fl.f8800ip, this.cJ, this.f8813ac);
        }
        if (this.Qhi == null) {
            this.Qhi = com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(this.f8814fl.FQ, this.cJ, this.f8813ac);
        }
    }

    public void Qhi() {
        if (this.CJ) {
            return;
        }
        this.CJ = true;
        CJ();
    }

    public com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl ac() {
        return this.Qhi;
    }

    public void cJ() {
        com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl flVar = this.Qhi;
        if (flVar != null) {
            flVar.CJ();
        }
    }

    public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, int i10, int i11, int i12, Qhi qhi) {
        if (this.Qhi != null) {
            int id2 = view.getId();
            if (id2 == com.bytedance.sdk.openadsdk.utils.iMK.f9379fl) {
                qhi.Qhi("click_play_star_level", null);
                return;
            } else if (id2 == com.bytedance.sdk.openadsdk.utils.iMK.CJ) {
                qhi.Qhi("click_play_star_nums", null);
                return;
            } else if (id2 == com.bytedance.sdk.openadsdk.utils.iMK.f9377ac) {
                qhi.Qhi("click_play_source", null);
                return;
            } else if (id2 == com.bytedance.sdk.openadsdk.utils.iMK.cJ) {
                qhi.Qhi("click_play_logo", null);
                return;
            } else {
                return;
            }
        }
        qhi.Qhi(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }
}
