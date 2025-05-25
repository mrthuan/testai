package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.Gm;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.zn;
import org.json.JSONObject;

/* compiled from: ExpressClickCreativeListener.java */
/* loaded from: classes.dex */
public class ROR extends com.bytedance.sdk.openadsdk.core.cJ.Qhi {
    public ROR(Context context, tP tPVar, String str, int i10) {
        super(context, tPVar, str, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ
    public com.bytedance.sdk.openadsdk.core.model.Gm Qhi(float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, long j10, long j11, View view, View view2, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        float f16;
        float f17;
        float f18;
        float f19;
        int i12;
        int i13;
        int i14;
        long j12;
        long j13;
        char c;
        int i15;
        int i16;
        int[] Qhi = zn.Qhi(view);
        int i17 = 0;
        if (Qhi == null || Qhi.length != 2) {
            f16 = f10;
            f17 = f11;
            f18 = f12;
            f19 = f13;
            i12 = 0;
            i13 = 0;
        } else {
            i12 = Qhi[0];
            i13 = Qhi[1];
            if (this.MQ == 0) {
                f19 = (zn.cJ(this.CJ, f13) + i13) - 0.5f;
                f18 = (zn.cJ(this.CJ, f12) + i12) - 0.5f;
                f16 = (zn.cJ(this.CJ, f10) + i12) - 0.5f;
                f17 = (zn.cJ(this.CJ, f11) + i13) - 0.5f;
            } else {
                f16 = f10;
                f17 = f11;
                f18 = f12;
                f19 = f13;
            }
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        com.bytedance.sdk.openadsdk.core.model.pA pAVar = this.f9029fl;
        if (pAVar != null) {
            j12 = pAVar.f9103fl;
            j13 = pAVar.Tgh;
            if (this.MQ == 0) {
                iArr[0] = zn.cJ(this.CJ, pAVar.ROR) + i12;
                iArr[1] = zn.cJ(this.CJ, this.f9029fl.Sf) + i13;
                i15 = zn.cJ(this.CJ, this.f9029fl.f9104hm);
                i16 = zn.cJ(this.CJ, this.f9029fl.WAv);
                c = 0;
                i14 = 1;
            } else {
                c = 0;
                iArr[0] = pAVar.ROR;
                i14 = 1;
                iArr[1] = pAVar.Sf;
                i15 = pAVar.f9104hm;
                i16 = pAVar.WAv;
            }
            iArr2[c] = i15;
            iArr2[i14] = i16;
            if (i15 == 0 && i16 == 0 && view2 != null) {
                iArr = zn.Qhi(view2);
                iArr2 = zn.ac(view2);
            }
            i17 = 0;
        } else {
            i14 = 1;
            j12 = j10;
            j13 = j11;
        }
        this.MQ = i17;
        return new Gm.Qhi().Tgh(f16).fl(f17).CJ(f18).ac(f19).cJ(j12).Qhi(j13).cJ(Qhi).Qhi(iArr).ac(zn.ac(view)).CJ(iArr2).CJ(this.Eh).fl(this.aP).Tgh(this.NFd).cJ(com.bytedance.sdk.openadsdk.core.hm.cJ().Qhi() ? i14 : 2).Qhi(sparseArray).Qhi(str).Qhi(f14).ac(i10).cJ(f15).Qhi(i11).Qhi(jSONObject).cJ(jSONObject2).Qhi();
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.model.pA pAVar) {
        this.f9029fl = pAVar;
    }
}
