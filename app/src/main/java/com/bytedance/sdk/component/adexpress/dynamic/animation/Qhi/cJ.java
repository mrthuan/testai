package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimationSets.java */
/* loaded from: classes.dex */
public class cJ implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Tgh {
    List<fl> Qhi = new ArrayList();

    public cJ(View view, List<com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi> list) {
        for (com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi : list) {
            fl Qhi = ac.Qhi().Qhi(view, qhi);
            if (Qhi != null) {
                this.Qhi.add(Qhi);
            }
        }
    }

    public void Qhi() {
        for (fl flVar : this.Qhi) {
            try {
                flVar.ac();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Tgh
    public void cJ() {
        for (fl flVar : this.Qhi) {
            try {
                flVar.cJ();
            } catch (Exception unused) {
            }
        }
    }
}
