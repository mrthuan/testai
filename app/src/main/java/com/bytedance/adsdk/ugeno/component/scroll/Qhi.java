package com.bytedance.adsdk.ugeno.component.scroll;

import android.content.Context;
import android.widget.ScrollView;
import com.bytedance.adsdk.ugeno.component.Qhi;
import com.bytedance.adsdk.ugeno.component.frame.Qhi;

/* compiled from: UGScrollLayoutWidget.java */
/* loaded from: classes.dex */
public class Qhi extends com.bytedance.adsdk.ugeno.component.Qhi<ScrollView> {
    public Qhi(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.Qhi
    public Qhi.C0074Qhi Sf() {
        return new Qhi.C0075Qhi();
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: tP */
    public ScrollView ac() {
        UGScrollView uGScrollView = new UGScrollView(this.cJ);
        uGScrollView.Qhi(this);
        return uGScrollView;
    }
}
