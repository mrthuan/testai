package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: GraffitiPreviewView.kt */
/* loaded from: classes3.dex */
public final class GraffitiPreviewView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f28211a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f28212b;
    public float c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraffitiPreviewView(Context context) {
        this(context, null);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "3DyvAcjN"));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.g.e(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f28212b;
        path.reset();
        path.moveTo(getMeasuredWidth() * 0.177f, getMeasuredHeight() * 0.659f);
        path.cubicTo(0.238f * getMeasuredWidth(), 0.55f * getMeasuredHeight(), 0.444f * getMeasuredWidth(), 0.351f * getMeasuredHeight(), 0.527f * getMeasuredWidth(), 0.382f * getMeasuredHeight());
        path.cubicTo(getMeasuredWidth() * 0.609f, 0.412f * getMeasuredHeight(), 0.469f * getMeasuredWidth(), 0.723f * getMeasuredHeight(), 0.521f * getMeasuredWidth(), getMeasuredHeight() * 0.659f);
        path.cubicTo(0.636f * getMeasuredWidth(), 0.519f * getMeasuredHeight(), 0.695f * getMeasuredWidth(), 0.508f * getMeasuredHeight(), 0.72f * getMeasuredWidth(), 0.533f * getMeasuredHeight());
        path.cubicTo(0.76f * getMeasuredWidth(), 0.574f * getMeasuredHeight(), 0.684f * getMeasuredWidth(), 0.721f * getMeasuredHeight(), 0.739f * getMeasuredWidth(), 0.668f * getMeasuredHeight());
        path.cubicTo(0.792f * getMeasuredWidth(), 0.618f * getMeasuredHeight(), getMeasuredWidth() * 0.835f, getMeasuredHeight() * 0.609f, getMeasuredWidth() * 0.835f, getMeasuredHeight() * 0.609f);
        canvas.drawPath(path, this.f28211a);
    }

    public final void setStrokeColor(int i10) {
        this.f28211a.setColor(i10);
        invalidate();
    }

    public final void setStrokeWidth(float f10) {
        this.c = f10;
        this.f28211a.setStrokeWidth(f10);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraffitiPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG8NdFF4dA==", "V7Oc4CWW"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraffitiPreviewView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("G28odBx4dA==", "qWxFy7VC"));
        Paint paint = new Paint();
        this.f28211a = paint;
        this.f28212b = new Path();
        this.c = 10.0f;
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.c);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
    }
}
