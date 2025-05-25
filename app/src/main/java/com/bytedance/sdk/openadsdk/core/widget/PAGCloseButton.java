package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class PAGCloseButton extends PAGImageView {
    private float Qhi;
    private int cJ;

    public PAGCloseButton(Context context) {
        super(context);
        this.Qhi = 2.25f;
        this.cJ = 12;
        Qhi();
    }

    private void Qhi() {
        setBackground(cJ.Qhi());
        setImageResource(MQ.CJ(getContext(), "tt_close_btn"));
        int cJ = zn.cJ(getContext(), this.Qhi);
        setPadding(cJ, cJ, cJ, cJ);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static PAGImageView cJ(Context context) {
        return new PAGCloseButton(context, 28, 5.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGImageView, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int cJ = zn.cJ(getContext(), this.cJ);
            layoutParams.width = cJ;
            layoutParams.height = cJ;
        }
        super.setLayoutParams(layoutParams);
    }

    public PAGCloseButton(Context context, int i10, float f10) {
        super(context);
        this.Qhi = f10;
        this.cJ = i10;
        Qhi();
    }

    public static PAGImageView Qhi(Context context) {
        return new PAGCloseButton(context);
    }
}
