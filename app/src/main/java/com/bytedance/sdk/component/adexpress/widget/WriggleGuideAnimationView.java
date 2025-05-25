package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.sdk.component.adexpress.dynamic.ac.Gm;
import com.bytedance.sdk.component.utils.qMt;

/* loaded from: classes.dex */
public class WriggleGuideAnimationView extends LinearLayout {
    private Qhi CJ;
    private TextView Qhi;
    private Gm ROR;
    private LottieAnimationView Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private TextView f8324ac;
    private qMt cJ;

    /* renamed from: fl  reason: collision with root package name */
    private LinearLayout f8325fl;

    /* loaded from: classes.dex */
    public interface Qhi {
    }

    public WriggleGuideAnimationView(Context context, View view, Gm gm2) {
        super(context);
        this.ROR = gm2;
        Qhi(context, view);
    }

    public TextView getTopTextView() {
        return this.Qhi;
    }

    public LinearLayout getWriggleLayout() {
        return this.f8325fl;
    }

    public View getWriggleProgressIv() {
        return this.Tgh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.cJ == null) {
                this.cJ = new qMt(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.2
            };
            Gm gm2 = this.ROR;
            if (gm2 != null) {
                gm2.ac();
                this.ROR.fl();
                this.ROR.Tgh();
                this.ROR.Sf();
            }
            this.cJ.onResume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            LottieAnimationView lottieAnimationView = this.Tgh;
            if (lottieAnimationView != null) {
                lottieAnimationView.ac();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        qMt qmt = this.cJ;
        if (qmt != null && z10) {
            qmt.onResume();
        }
    }

    public void setOnShakeViewListener(Qhi qhi) {
        this.CJ = qhi;
    }

    public void setShakeText(String str) {
        this.f8324ac.setText(str);
    }

    private void Qhi(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.f8325fl = (LinearLayout) findViewById(2097610722);
        this.Qhi = (TextView) findViewById(2097610719);
        this.f8324ac = (TextView) findViewById(2097610718);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(2097610706);
        this.Tgh = lottieAnimationView;
        lottieAnimationView.setAnimation("lottie_json/twist_multi_angle.json");
        this.Tgh.setImageAssetsFolder("images/");
        this.Tgh.cJ(true);
    }

    public void Qhi() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    WriggleGuideAnimationView.this.Tgh.Qhi();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}
