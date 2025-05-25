package com.bytedance.sdk.openadsdk.core.cJ;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.utils.iMK;

/* compiled from: VastClickListenerWrapper.java */
/* loaded from: classes.dex */
public abstract class Sf extends ac {
    private final String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private ac f9024ac;
    private final com.bytedance.sdk.openadsdk.core.ROR.Qhi cJ;

    public Sf(String str, com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi) {
        this(str, qhi, null);
    }

    public void Qhi(ac acVar) {
        this.f9024ac = acVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cJ.ac, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public Sf(String str, com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi, ac acVar) {
        this.Qhi = str;
        this.cJ = qhi;
        this.f9024ac = acVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cJ.ac
    public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
        com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi = this.cJ;
        if (qhi != null) {
            qhi.fl(this.Qhi);
        }
        if (view != null) {
            if (view.getId() == iMK.f9377ac) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == iMK.ROR) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.Qhi);
            }
        }
        ac acVar = this.f9024ac;
        if (acVar != null) {
            acVar.CQU = this.CQU;
            acVar.pM = this.pM;
            acVar.Eh = this.Eh;
            int i10 = this.Eh;
            acVar.aP = i10;
            acVar.NFd = i10;
            acVar.Qhi(view, f10, f11, f12, f13, sparseArray, z10);
        }
    }
}
