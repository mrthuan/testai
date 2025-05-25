package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* compiled from: SlideUpInteract.java */
/* loaded from: classes.dex */
public class tP<E extends SlideUpView> implements hm<E> {
    protected com.bytedance.sdk.component.adexpress.dynamic.ac.Sf CJ;
    protected SlideUpView Qhi;

    /* renamed from: ac  reason: collision with root package name */
    protected DynamicBaseWidget f8249ac;
    protected Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected int f8250fl;

    public tP(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2, int i10) {
        this.f8250fl = i10;
        this.cJ = context;
        this.f8249ac = dynamicBaseWidget;
        this.CJ = sf2;
        CJ();
    }

    public void CJ() {
        this.Qhi = new SlideUpView(this.cJ, this.CJ.ip());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) CQU.Qhi(this.cJ, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) CQU.Qhi(this.cJ, 100 - this.f8250fl);
        this.Qhi.setLayoutParams(layoutParams);
        try {
            this.Qhi.setGuideText(this.CJ.Dq());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void Qhi() {
        this.Qhi.Qhi();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    public void cJ() {
        this.Qhi.cJ();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.hm
    /* renamed from: fl */
    public E ac() {
        return (E) this.Qhi;
    }

    public tP(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.ac.Sf sf2) {
        this(context, dynamicBaseWidget, sf2, 0);
    }
}
