package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class LottieView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2343b = 0;

    /* renamed from: a  reason: collision with root package name */
    public LottieAnimationView f2344a;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i10 = LottieView.f2343b;
            LottieView.this.getClass();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            int i10 = LottieView.f2343b;
            LottieView.this.getClass();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }
    }

    public LottieView(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        View.inflate(context, R.layout.ad_full_loading_lottieview, this);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.ad_lottie_view);
        this.f2344a = lottieAnimationView;
        lottieAnimationView.c(new c());
        lottieAnimationView.f6018h.c.addUpdateListener(new a());
    }

    public LottieAnimationView getLottieAnimationView() {
        return this.f2344a;
    }

    public void setLottiePath(String str) {
        try {
            this.f2344a.setAnimation(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setLottieRawRes(int i10) {
        try {
            this.f2344a.setAnimation(i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setProgress(float f10) {
        setVisibility(0);
        try {
            this.f2344a.setVisibility(0);
            this.f2344a.setProgress(f10);
        } catch (Exception e10) {
            setVisibility(8);
            e10.printStackTrace();
        }
    }

    public LottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public LottieView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }

    public void setListener(b bVar) {
    }
}
