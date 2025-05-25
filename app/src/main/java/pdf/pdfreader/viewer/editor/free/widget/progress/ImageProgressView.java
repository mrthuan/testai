package pdf.pdfreader.viewer.editor.free.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import ea.a;
import kotlin.jvm.internal.g;

/* compiled from: ImageProgressView.kt */
/* loaded from: classes3.dex */
public final class ImageProgressView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public float f28818d;

    /* renamed from: e  reason: collision with root package name */
    public float f28819e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f28820f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageProgressView(Context context) {
        this(context, null, 6, 0);
        g.e(context, a.p("LG9fdBx4dA==", "deBNU8Ae"));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28818d = 0.0f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28818d = 0.0f;
        this.f28820f.removeCallbacksAndMessages(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        g.e(canvas, "canvas");
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && getVisibility() == 0) {
            canvas.rotate(this.f28818d, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            this.f28820f.postDelayed(new pdf.pdfreader.viewer.editor.free.ui.widget.act.a(this, 3), 10L);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            this.f28820f.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, a.p("J28ldFJ4dA==", "TADK7EIC"));
    }

    public /* synthetic */ ImageProgressView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageProgressView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("UG8ldBZ4dA==", "ZZk9wDSy"));
        this.f28819e = 10.0f;
        this.f28820f = new Handler(Looper.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jp.a.c, i10, 0);
        this.f28819e = obtainStyledAttributes.getFloat(0, 10.0f);
        obtainStyledAttributes.recycle();
    }
}
