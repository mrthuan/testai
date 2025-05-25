package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: DynamicViewRender.java */
/* loaded from: classes.dex */
public class fl extends com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi {
    private final Runnable CJ;
    private final com.bytedance.sdk.component.adexpress.cJ.iMK Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.sdk.component.Sf.hm f9147ac;
    private com.bytedance.sdk.component.adexpress.cJ.Sf cJ;

    public fl(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.CJ.WAv wAv, com.bytedance.sdk.component.adexpress.cJ.iMK imk, com.bytedance.sdk.component.adexpress.dynamic.fl.Qhi qhi) {
        super(context, themeStatusBroadcastReceiver, z10, wAv, imk, qhi);
        this.f9147ac = new com.bytedance.sdk.component.Sf.hm("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.fl.1
            @Override // java.lang.Runnable
            public void run() {
                fl.this.Qhi.ac();
                com.bytedance.sdk.openadsdk.core.iMK.ac().post(fl.this.CJ);
            }
        };
        this.CJ = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.fl.2
            @Override // java.lang.Runnable
            public void run() {
                if (fl.this.cJ != null) {
                    fl flVar = fl.this;
                    fl.super.Qhi(flVar.cJ);
                }
            }
        };
        this.Qhi = imk;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi
    public void cJ() {
        super.cJ();
        com.bytedance.sdk.openadsdk.core.iMK.ac().removeCallbacks(this.CJ);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Qhi.Qhi, com.bytedance.sdk.component.adexpress.cJ.fl
    public void Qhi(com.bytedance.sdk.component.adexpress.cJ.Sf sf2) {
        this.cJ = sf2;
        lG.cJ(this.f9147ac);
    }
}
