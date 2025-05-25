package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ProgressView.kt */
/* loaded from: classes3.dex */
public final class ProgressView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f28281d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressView(Context context) {
        this(context, null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "ShwTrzdP"));
    }

    public final void c() {
        ObjectAnimator objectAnimator;
        boolean z10 = true;
        if (this.f28281d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ea.a.p("QW8_YQdpDW4=", "oFjN8rT5"), 0.0f, 360.0f);
            this.f28281d = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(1000L);
            }
            ObjectAnimator objectAnimator2 = this.f28281d;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = this.f28281d;
            if (objectAnimator3 != null) {
                objectAnimator3.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator4 = this.f28281d;
            if (objectAnimator4 != null) {
                objectAnimator4.setInterpolator(new AccelerateDecelerateInterpolator());
            }
        }
        ObjectAnimator objectAnimator5 = this.f28281d;
        if (objectAnimator5 == null || objectAnimator5.isStarted()) {
            z10 = false;
        }
        if (z10 && (objectAnimator = this.f28281d) != null) {
            objectAnimator.start();
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f28281d;
        boolean z10 = false;
        if (objectAnimator2 != null && objectAnimator2.isStarted()) {
            z10 = true;
        }
        if (z10 && (objectAnimator = this.f28281d) != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.g.e(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        if (i10 == 0) {
            c();
        } else {
            d();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "56vuzjcO"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "mLgbpX1r"));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pdf.pdfreader.viewer.editor.free.a.f23896g, i10, 0);
        kotlin.jvm.internal.g.d(obtainStyledAttributes, ea.a.p("JW9WdD14MS4nYhJhXW4EdEFsN2QIdEJyloDXZDRmEXQ_bF1BLHQ3LGgwbCAUIHcgGCByKQ==", "qhF8XEwf"));
        setImageResource(obtainStyledAttributes.getResourceId(0, R.drawable.progress_img_to_pdf_ic));
        obtainStyledAttributes.recycle();
    }
}
