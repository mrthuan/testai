package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.ABk;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.utils.MQ;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnimationText extends TextSwitcher implements ViewSwitcher.ViewFactory, CQU.Qhi {
    private int ABk;
    private final int CJ;
    private int Gm;
    Animation.AnimationListener Qhi;
    private int ROR;
    private int Sf;
    private TextView Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private int f8259ac;
    private List<String> cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Context f8260fl;

    /* renamed from: hm  reason: collision with root package name */
    private float f8261hm;
    private Handler iMK;

    /* renamed from: zc  reason: collision with root package name */
    private int f8262zc;

    public AnimationText(Context context, int i10, float f10, int i11, int i12) {
        super(context);
        this.cJ = new ArrayList();
        this.f8259ac = 0;
        this.CJ = 1;
        this.iMK = new CQU(Looper.getMainLooper(), this);
        this.Qhi = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.AnimationText.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (AnimationText.this.Tgh != null) {
                    AnimationText.this.Tgh.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.f8260fl = context;
        this.Sf = i10;
        this.f8261hm = f10;
        this.WAv = i11;
        this.ABk = i12;
        ac();
    }

    private void ac() {
        setFactory(this);
    }

    public void cJ() {
        List<String> list = this.cJ;
        if (list != null && list.size() > 0) {
            int i10 = this.f8259ac;
            this.f8259ac = i10 + 1;
            this.Gm = i10;
            setText(this.cJ.get(i10));
            if (this.f8259ac > this.cJ.size() - 1) {
                this.f8259ac = 0;
            }
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.Tgh = textView;
        textView.setTextColor(this.Sf);
        this.Tgh.setTextSize(this.f8261hm);
        this.Tgh.setMaxLines(this.WAv);
        this.Tgh.setTextAlignment(this.ABk);
        return this.Tgh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.iMK.sendEmptyMessageDelayed(1, this.ROR);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.iMK.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ABk.cJ(this.cJ.get(this.Gm), this.f8261hm, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    public void setAnimationDuration(int i10) {
        this.ROR = i10;
    }

    public void setAnimationText(List<String> list) {
        this.cJ = list;
    }

    public void setAnimationType(int i10) {
        this.f8262zc = i10;
    }

    public void setMaxLines(int i10) {
        this.WAv = i10;
    }

    public void setTextColor(int i10) {
        this.Sf = i10;
    }

    public void setTextSize(float f10) {
        this.f8261hm = f10;
    }

    public void Qhi() {
        int i10 = this.f8262zc;
        if (i10 == 1) {
            setInAnimation(getContext(), MQ.hm(this.f8260fl, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), MQ.hm(this.f8260fl, "tt_text_animation_y_out"));
        } else if (i10 == 0) {
            setInAnimation(getContext(), MQ.hm(this.f8260fl, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), MQ.hm(this.f8260fl, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.Qhi);
            getOutAnimation().setAnimationListener(this.Qhi);
        }
        this.iMK.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        if (message.what != 1) {
            return;
        }
        cJ();
        this.iMK.sendEmptyMessageDelayed(1, this.ROR);
    }
}
