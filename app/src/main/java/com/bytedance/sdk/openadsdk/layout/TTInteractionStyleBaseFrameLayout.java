package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.hm;

/* loaded from: classes.dex */
public abstract class TTInteractionStyleBaseFrameLayout extends PAGFrameLayout {
    protected PAGTextView CJ;
    protected PAGFrameLayout Qhi;
    protected PAGTextView Tgh;

    /* renamed from: ac  reason: collision with root package name */
    protected TTRoundRectImageView f9338ac;
    protected PAGImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected PAGTextView f9339fl;

    public TTInteractionStyleBaseFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Qhi(context);
    }

    public PAGTextView CJ(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setBackground(hm.Qhi(context, "tt_backup_btn_1"));
        pAGTextView.setGravity(17);
        pAGTextView.setText(MQ.cJ(context, "tt_video_download_apk"));
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        return pAGTextView;
    }

    public abstract void Qhi(Context context);

    public TTRoundRectImageView ROR(Context context) {
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        tTRoundRectImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        tTRoundRectImageView.setBackgroundColor(0);
        return tTRoundRectImageView;
    }

    public PAGLogoView Sf(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    public PAGImageView Tgh(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return pAGImageView;
    }

    public PAGTextView ac(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setMaxLines(1);
        pAGTextView.setSingleLine();
        pAGTextView.setTextColor(Color.parseColor("#FF999999"));
        pAGTextView.setTextSize(2, 12.0f);
        return pAGTextView;
    }

    public PAGTextView cJ(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setMaxLines(1);
        pAGTextView.setTextColor(Color.parseColor("#FF999999"));
        pAGTextView.setTextSize(2, 16.0f);
        return pAGTextView;
    }

    public PAGFrameLayout fl(Context context) {
        return new PAGFrameLayout(context);
    }

    public FrameLayout getTtAdContainer() {
        return this.Qhi;
    }

    public TextView getTtFullAdAppName() {
        return this.CJ;
    }

    public TextView getTtFullAdDesc() {
        return this.f9339fl;
    }

    public TextView getTtFullAdDownload() {
        return this.Tgh;
    }

    public TTRoundRectImageView getTtFullAdIcon() {
        return this.f9338ac;
    }

    public ImageView getTtFullImg() {
        return this.cJ;
    }
}
