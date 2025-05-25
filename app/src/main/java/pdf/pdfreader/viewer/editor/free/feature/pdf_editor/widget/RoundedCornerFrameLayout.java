package pdf.pdfreader.viewer.editor.free.feature.pdf_editor.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ea.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: RoundedCornerFrameLayout.kt */
/* loaded from: classes3.dex */
public final class RoundedCornerFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Path f25621a;

    /* renamed from: b  reason: collision with root package name */
    public RectF f25622b;
    public float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerFrameLayout(Context context) {
        super(context);
        g.e(context, a.p("UG8ldBZ4dA==", "Qa7rAEa6"));
        a(context);
    }

    public final void a(Context context) {
        this.c = context.getResources().getDimensionPixelSize(R.dimen.dp_8);
        this.f25621a = new Path();
        this.f25622b = new RectF();
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g.e(canvas, "canvas");
        int save = canvas.save();
        Path path = this.f25621a;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g.e(canvas, "canvas");
        int save = canvas.save();
        Path path = this.f25621a;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Path path;
        super.onLayout(z10, i10, i11, i12, i13);
        RectF rectF = this.f25622b;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        }
        Path path2 = this.f25621a;
        if (path2 != null) {
            path2.reset();
        }
        RectF rectF2 = this.f25622b;
        if (rectF2 != null && (path = this.f25621a) != null) {
            float f10 = this.c;
            path.addRoundRect(rectF2, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        }
    }

    public final void setCornerRadius(float f10) {
        this.c = f10;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, a.p("UG8ldBZ4dA==", "ucSk8x7I"));
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("UG8ldBZ4dA==", "1c5pc3Zj"));
        a(context);
    }
}
