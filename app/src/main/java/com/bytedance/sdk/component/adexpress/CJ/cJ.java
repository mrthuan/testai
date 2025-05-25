package com.bytedance.sdk.component.adexpress.cJ;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cJ.Gm;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* compiled from: DynamicRenderInterceptor.java */
/* loaded from: classes.dex */
public class cJ implements Gm {
    private hm CJ;
    private Context Qhi;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private ThemeStatusBroadcastReceiver f8142ac;
    private com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private iMK f8143fl;

    public cJ(Context context, iMK imk, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.CJ.WAv wAv, hm hmVar, com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi qhi, com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi qhi2) {
        this.Qhi = context;
        this.f8143fl = imk;
        this.f8142ac = themeStatusBroadcastReceiver;
        this.CJ = hmVar;
        if (qhi2 != null) {
            this.cJ = qhi2;
        } else {
            this.cJ = new com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi(context, themeStatusBroadcastReceiver, z10, wAv, imk, qhi);
        }
        this.cJ.Qhi(this.CJ);
        if (wAv instanceof com.bytedance.sdk.component.adexpress.dynamic.CJ.hm) {
            this.Tgh = 3;
        } else {
            this.Tgh = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm
    public boolean Qhi(final Gm.Qhi qhi) {
        this.f8143fl.fl().Qhi(this.Tgh);
        this.cJ.Qhi(new Sf() { // from class: com.bytedance.sdk.component.adexpress.cJ.cJ.1
            @Override // com.bytedance.sdk.component.adexpress.cJ.Sf
            public void Qhi(View view, pA pAVar) {
                if (qhi.ac()) {
                    return;
                }
                cJ.this.f8143fl.fl().fl(cJ.this.Tgh);
                cJ.this.f8143fl.fl().Tgh(cJ.this.Tgh);
                cJ.this.f8143fl.fl().WAv();
                hpZ cJ = qhi.cJ();
                if (cJ == null) {
                    return;
                }
                cJ.Qhi(cJ.this.cJ, pAVar);
                qhi.Qhi(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.cJ.Sf
            public void Qhi(int i10, String str) {
                cJ.this.f8143fl.fl().Qhi(cJ.this.Tgh, i10, str, qhi.cJ(cJ.this));
                if (qhi.cJ(cJ.this)) {
                    qhi.Qhi(cJ.this);
                    return;
                }
                hpZ cJ = qhi.cJ();
                if (cJ == null) {
                    return;
                }
                cJ.a_(i10);
            }
        });
        return true;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fl cJ() {
        com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi qhi = this.cJ;
        if (qhi != null) {
            return qhi.CJ();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.Gm
    public void Qhi() {
        com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi qhi = this.cJ;
        if (qhi != null) {
            qhi.cJ();
        }
    }
}
