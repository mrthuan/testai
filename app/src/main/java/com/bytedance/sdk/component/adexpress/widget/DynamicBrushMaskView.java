package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.ac.Qhi;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.MQ;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* loaded from: classes.dex */
public class DynamicBrushMaskView extends FrameLayout {
    private Context CJ;
    private RelativeLayout Qhi;
    private ImageView ROR;
    private FrameLayout Sf;
    private ImageView Tgh;
    private volatile boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private TextView f8281ac;
    private BrushMaskView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private ObjectAnimator f8282fl;

    /* renamed from: hm  reason: collision with root package name */
    private volatile boolean f8283hm;

    public DynamicBrushMaskView(Context context) {
        super(context);
        this.WAv = false;
        this.CJ = context;
        addView(Qhi.fl(context));
        ac();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            try {
                ObjectAnimator objectAnimator = this.f8282fl;
                if (objectAnimator == null || (!objectAnimator.isStarted() && !this.f8282fl.isRunning() && !this.WAv)) {
                    BrushMaskView brushMaskView = this.cJ;
                    if (brushMaskView != null) {
                        brushMaskView.Qhi();
                    }
                    RelativeLayout relativeLayout = this.Qhi;
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(0);
                    }
                    CJ();
                }
            } catch (Exception e10) {
                ABk.Qhi("DynamicBrushMaskView", e10.getMessage());
            }
        }
    }

    public void setBrushText(String str) {
        if (this.f8281ac != null && !TextUtils.isEmpty(str)) {
            this.f8281ac.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CJ() {
        if (this.cJ != null) {
            this.f8283hm = false;
            int Qhi = CQU.Qhi(this.CJ);
            int i10 = (Qhi * 336) / 375;
            int i11 = (i10 * 80) / 336;
            this.Sf.setLayoutParams(new RelativeLayout.LayoutParams(i10, i11));
            float f10 = i10;
            final float f11 = f10 - (f10 / 3.0f);
            this.cJ.setEraserSize((this.cJ.getHeight() * 3) / 5.0f);
            float Qhi2 = CQU.Qhi(getContext(), 15.0f);
            final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) f11, i11 / 2);
            int i12 = i11 / 4;
            layoutParams.topMargin = i12;
            float f12 = f10 / 6.0f;
            int i13 = (int) f12;
            layoutParams.leftMargin = i13;
            layoutParams.setMarginStart(i13);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            this.Tgh.setLayoutParams(layoutParams);
            int i14 = (Qhi * 58) / 375;
            this.ROR.setLayoutParams(new RelativeLayout.LayoutParams((int) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM, (int) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i14, (i14 * 76) / 58);
            layoutParams2.topMargin = (int) (i12 + Qhi2);
            int i15 = (int) (f12 - (Qhi2 * 1.5f));
            layoutParams2.leftMargin = i15;
            layoutParams2.setMarginStart(i15);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.Qhi.setLayoutParams(layoutParams2);
            this.cJ.Qhi(this.cJ.getWidth() / 6.0f, this.cJ.getHeight() / 2.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Qhi, "translationX", 0.0f, f11);
            this.f8282fl = ofFloat;
            ofFloat.setDuration(1000L);
            this.f8282fl.setRepeatMode(1);
            this.f8282fl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (DynamicBrushMaskView.this.Tgh != null) {
                        layoutParams.width = (int) (f11 * animatedFraction);
                        DynamicBrushMaskView.this.Tgh.setLayoutParams(layoutParams);
                    }
                }
            });
            this.f8282fl.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (DynamicBrushMaskView.this.cJ != null) {
                        if (DynamicBrushMaskView.this.Tgh != null) {
                            layoutParams.width = 0;
                            DynamicBrushMaskView.this.Tgh.setLayoutParams(layoutParams);
                        }
                        if (!DynamicBrushMaskView.this.f8283hm) {
                            DynamicBrushMaskView.this.WAv = true;
                            DynamicBrushMaskView.this.cJ.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    DynamicBrushMaskView.this.WAv = false;
                                    if (!DynamicBrushMaskView.this.f8283hm) {
                                        DynamicBrushMaskView.this.f8282fl.start();
                                    }
                                }
                            }, 100L);
                        }
                    }
                }
            });
            ObjectAnimator objectAnimator = this.f8282fl;
            if (objectAnimator == null || objectAnimator.isStarted() || this.f8282fl.isRunning() || this.WAv) {
                return;
            }
            this.f8282fl.start();
        }
    }

    private void ac() {
        this.cJ = (BrushMaskView) findViewById(2097610740);
        this.Qhi = (RelativeLayout) findViewById(2097610737);
        this.Tgh = (ImageView) findViewById(2097610739);
        this.Sf = (FrameLayout) findViewById(2097610741);
        this.ROR = (ImageView) findViewById(2097610736);
        this.Sf.setClipChildren(false);
        this.f8281ac = (TextView) findViewById(2097610738);
        BrushMaskView brushMaskView = this.cJ;
        if (brushMaskView != null) {
            brushMaskView.setWatermark(MQ.CJ(this.CJ, "tt_splash_brush_bg"));
            this.cJ.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DynamicBrushMaskView.this.f8282fl == null || !DynamicBrushMaskView.this.f8282fl.isStarted()) {
                            DynamicBrushMaskView.this.CJ();
                        }
                    } catch (Exception e10) {
                        e10.getMessage();
                    }
                }
            });
        }
    }

    public void cJ() {
        clearAnimation();
    }

    public void Qhi() {
        if (this.f8283hm) {
            return;
        }
        this.f8283hm = true;
        ObjectAnimator objectAnimator = this.f8282fl;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            RelativeLayout relativeLayout = this.Qhi;
            if (relativeLayout != null) {
                relativeLayout.clearAnimation();
                this.Qhi.setVisibility(4);
            }
            this.cJ.Qhi();
        }
        BrushMaskView brushMaskView = this.cJ;
        if (brushMaskView != null) {
            brushMaskView.setEraserSize(brushMaskView.getHeight());
            BrushMaskView brushMaskView2 = this.cJ;
            brushMaskView2.Qhi(0.0f, brushMaskView2.getHeight() / 2.0f);
            this.cJ.cJ();
        }
    }
}
