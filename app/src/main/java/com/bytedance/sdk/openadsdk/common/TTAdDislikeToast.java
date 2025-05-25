package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTAdDislikeToast extends PAGFrameLayout {
    private static String CJ;

    /* renamed from: ac  reason: collision with root package name */
    private static String f8727ac;

    /* renamed from: fl  reason: collision with root package name */
    private static String f8728fl;
    private final Handler Qhi;
    private TextView cJ;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public static String getDislikeSendTip() {
        if (f8728fl == null) {
            Context Qhi = HzH.Qhi();
            f8728fl = MQ.Qhi(Qhi, "tt_feedback_thank_text") + "\n" + MQ.Qhi(Qhi, "tt_feedback_experience_text");
        }
        return f8728fl;
    }

    public static String getDislikeTip() {
        if (f8727ac == null) {
            f8727ac = MQ.Qhi(HzH.Qhi(), "tt_feedback_submit_text");
        }
        return f8727ac;
    }

    public static String getSkipText() {
        if (CJ == null) {
            CJ = MQ.Qhi(HzH.Qhi(), "tt_reward_screen_skip_tx");
        }
        return CJ;
    }

    public void ac() {
        setVisibility(8);
        this.Qhi.removeCallbacksAndMessages(null);
    }

    public void cJ() {
        setVisibility(8);
        this.Qhi.removeCallbacksAndMessages(null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void Qhi() {
        Context Qhi = HzH.Qhi();
        CJ = MQ.Qhi(Qhi, "tt_reward_screen_skip_tx");
        f8727ac = MQ.Qhi(Qhi, "tt_feedback_submit_text");
        f8728fl = MQ.Qhi(Qhi, "tt_feedback_thank_text") + "\n" + MQ.Qhi(Qhi, "tt_feedback_experience_text");
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Qhi = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        Qhi(context);
    }

    private void Qhi(Context context) {
        TextView textView = new TextView(context);
        this.cJ = textView;
        textView.setClickable(false);
        this.cJ.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int cJ = zn.cJ(HzH.Qhi(), 20.0f);
        int cJ2 = zn.cJ(HzH.Qhi(), 12.0f);
        this.cJ.setPadding(cJ, cJ2, cJ, cJ2);
        this.cJ.setLayoutParams(layoutParams);
        this.cJ.setTextColor(-1);
        this.cJ.setTextSize(16.0f);
        this.cJ.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#CC000000"));
        gradientDrawable.setCornerRadius(zn.cJ(HzH.Qhi(), 6.0f));
        this.cJ.setBackgroundDrawable(gradientDrawable);
        addView(this.cJ);
    }

    public void Qhi(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.Qhi.removeCallbacksAndMessages(null);
        this.Qhi.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.cJ != null) {
                    TTAdDislikeToast.this.cJ.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.Qhi.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }
}
