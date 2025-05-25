package com.bytedance.sdk.openadsdk.core.ac.Qhi;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cJ.zc;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.pA;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.lang.ref.WeakReference;

/* compiled from: DynamicClickListener.java */
/* loaded from: classes.dex */
public class Qhi extends ac implements com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi {
    protected WeakReference<View> Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private zc f8987ac;
    protected WeakReference<View> cJ;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi
    public void Qhi(zc zcVar) {
        this.f8987ac = zcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi
    public void cJ(View view) {
        this.cJ = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi
    public void Qhi(View view) {
        this.Qhi = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cJ.ac
    public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
        Qhi(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void Qhi(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray) {
        if (this.f8987ac != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.cJ;
            if (weakReference != null) {
                int[] Qhi = zn.Qhi(weakReference.get());
                if (Qhi != null) {
                    iArr = Qhi;
                }
                int[] ac2 = zn.ac(this.cJ.get());
                if (ac2 != null) {
                    iArr2 = ac2;
                }
            }
            String str = "";
            try {
                int i11 = com.bytedance.sdk.component.adexpress.dynamic.Qhi.qMt;
                if (view.getTag(i11) != null) {
                    str = String.valueOf(view.getTag(i11));
                }
            } catch (Exception unused) {
            }
            this.f8987ac.Qhi(view, i10, new pA.Qhi().CJ(f10).ac(f11).cJ(f12).Qhi(f13).cJ(this.CQU).Qhi(this.pM).ac(iArr[0]).CJ(iArr[1]).fl(iArr2[0]).Tgh(iArr2[1]).Qhi(sparseArray).Qhi(this.lB).Qhi(str).Qhi());
        }
    }
}
