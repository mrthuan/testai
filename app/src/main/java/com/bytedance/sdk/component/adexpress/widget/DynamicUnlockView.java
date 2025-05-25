package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.ac.Qhi;

/* loaded from: classes.dex */
public class DynamicUnlockView extends FrameLayout {
    private final RotateAnimation CJ;
    private final TextView Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final FlowLightView f8287ac;
    private final ImageView cJ;

    public DynamicUnlockView(Context context) {
        super(context);
        addView(Qhi.CJ(context));
        this.Qhi = (TextView) findViewById(2097610742);
        this.cJ = (ImageView) findViewById(2097610745);
        this.f8287ac = (FlowLightView) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.CJ = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicUnlockView.this.cJ.startAnimation(DynamicUnlockView.this.CJ);
                DynamicUnlockView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DynamicUnlockView.this.f8287ac.Qhi(4);
                    }
                }, 100L);
                DynamicUnlockView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DynamicUnlockView.this.f8287ac.Qhi(4);
                    }
                }, 300L);
                DynamicUnlockView dynamicUnlockView = DynamicUnlockView.this;
                dynamicUnlockView.postDelayed(dynamicUnlockView.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.Qhi;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void Qhi() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void cJ() {
        this.CJ.cancel();
    }
}
