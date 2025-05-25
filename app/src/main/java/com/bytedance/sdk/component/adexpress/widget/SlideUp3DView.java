package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.fl;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class SlideUp3DView extends FrameLayout {
    private TextView CJ;
    private Context Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private TextView f8314ac;
    private ImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private AnimationDrawable f8315fl;

    public SlideUp3DView(Context context) {
        super(context);
        this.Qhi = context;
        Qhi();
    }

    private void CJ() {
        this.f8315fl = new AnimationDrawable();
        Qhi(100, "tt_slide_up_1");
        Qhi(100, "tt_slide_up_2");
        Qhi(100, "tt_slide_up_4");
        Qhi(100, "tt_slide_up_5");
        Qhi(100, "tt_slide_up_7");
        Qhi(100, "tt_slide_up_8");
        Qhi(100, "tt_slide_up_10");
        Qhi(120, "tt_slide_up_11");
        Qhi(120, "tt_slide_up_12");
        Qhi(120, "tt_slide_up_15");
        this.f8315fl.setOneShot(false);
    }

    public void Qhi() {
        this.cJ = new ImageView(this.Qhi);
        this.CJ = new TextView(this.Qhi);
        this.f8314ac = new TextView(this.Qhi);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) CQU.Qhi(this.Qhi, 200.0f), (int) CQU.Qhi(this.Qhi, 200.0f));
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = (int) CQU.Qhi(this.Qhi, 70.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) CQU.Qhi(this.Qhi, 25.0f);
        this.CJ.setText(MQ.cJ(this.Qhi, "tt_slide_up_3d"));
        this.CJ.setTextColor(-1);
        this.CJ.setTextSize(24.0f);
        this.CJ.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#59000000"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        this.f8314ac.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#59000000"));
        this.f8314ac.setTextColor(-1);
        this.f8314ac.setTextSize(14.0f);
        addView(this.cJ, layoutParams);
        if (!fl.cJ()) {
            addView(this.CJ, layoutParams2);
        }
        addView(this.f8314ac, layoutParams3);
    }

    public void ac() {
        AnimationDrawable animationDrawable = this.f8315fl;
        if (animationDrawable != null) {
            animationDrawable.stop();
            this.f8315fl = null;
        }
    }

    public void cJ() {
        if (this.f8315fl == null) {
            CJ();
        }
        this.cJ.setImageDrawable(this.f8315fl);
        this.f8315fl.start();
    }

    public void setGuideText(String str) {
        this.f8314ac.setText(str);
    }

    private void Qhi(int i10, String str) {
        this.f8315fl.addFrame(MQ.ac(this.Qhi, str), i10);
    }
}
