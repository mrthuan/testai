package com.bytedance.sdk.openadsdk.core.ugen.component.video;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* loaded from: classes.dex */
public class UGVideoPlaceholderView extends UGFrameLayout {
    private final UGFrameLayout Qhi;
    private final UGFrameLayout cJ;

    public UGVideoPlaceholderView(Context context) {
        super(context);
        UGFrameLayout uGFrameLayout = new UGFrameLayout(context);
        this.Qhi = uGFrameLayout;
        addView(uGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        UGFrameLayout uGFrameLayout2 = new UGFrameLayout(context);
        this.cJ = uGFrameLayout2;
        uGFrameLayout2.setBackgroundColor(0);
        addView(uGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
    }

    public UGFrameLayout getVideoView() {
        return this.Qhi;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.cJ.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.cJ.setOnTouchListener(onTouchListener);
    }
}
