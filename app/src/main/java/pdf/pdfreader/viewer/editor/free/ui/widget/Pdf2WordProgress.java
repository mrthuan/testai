package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: Pdf2WordProgress.kt */
/* loaded from: classes3.dex */
public final class Pdf2WordProgress extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f28254a;

    /* renamed from: b  reason: collision with root package name */
    public int f28255b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f28256d;

    /* renamed from: e  reason: collision with root package name */
    public int f28257e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f28258f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f28259g;

    /* renamed from: h  reason: collision with root package name */
    public final Path f28260h;

    /* renamed from: i  reason: collision with root package name */
    public LinearGradient f28261i;

    /* renamed from: j  reason: collision with root package name */
    public int f28262j;

    /* renamed from: k  reason: collision with root package name */
    public int f28263k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pdf2WordProgress(Context context) {
        this(context, null);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "L23NkNhy"));
    }

    public final int getMaxProgress() {
        return this.f28256d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.g.e(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f28260h;
        path.reset();
        Paint paint = this.f28258f;
        paint.setColor(this.c);
        path.addRoundRect(0.0f, 0.0f, this.f28262j, this.f28263k, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.drawPath(path, paint);
        path.reset();
        if (this.f28261i == null) {
            this.f28261i = new LinearGradient(0.0f, 0.0f, (this.f28257e / 100.0f) * this.f28262j, 0.0f, this.f28254a, this.f28255b, Shader.TileMode.CLAMP);
        }
        Paint paint2 = this.f28259g;
        paint2.setShader(this.f28261i);
        int i10 = this.f28257e;
        if (i10 >= this.f28256d) {
            path.addRoundRect(0.0f, 0.0f, (i10 / 100.0f) * this.f28262j, this.f28263k, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        } else {
            float f10 = (i10 / 100.0f) * this.f28262j;
            float f11 = this.f28263k;
            float f12 = f11 / 2.0f;
            float f13 = 1.5f * f12;
            path.addRoundRect(0.0f, 0.0f, f10, f11, new float[]{0.0f, 0.0f, f13, f12, f13, f12, 0.0f, 0.0f}, Path.Direction.CW);
        }
        canvas.drawPath(path, paint2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = 0;
        }
        this.f28262j = size;
        int i12 = (mode2 == Integer.MIN_VALUE || mode2 == 0) ? 20 : 20;
        this.f28263k = i12;
        setMeasuredDimension(size, i12);
    }

    public final void setCurrentProgress(int i10) {
        int i11 = this.f28256d;
        if (i10 <= i11) {
            i11 = i10;
        }
        this.f28257e = i11;
        this.f28261i = new LinearGradient(0.0f, 0.0f, (i10 / 100.0f) * this.f28262j, 0.0f, this.f28254a, this.f28255b, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void setMaxProgress(int i10) {
        this.f28256d = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pdf2WordProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("Nm8kdCp4dA==", "nHUJOPTU"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2WordProgress(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("BG8mdFR4dA==", "XJgH1bcs"));
        this.f28254a = -65536;
        this.f28255b = -65536;
        this.c = -7829368;
        this.f28256d = 100;
        Paint paint = new Paint();
        this.f28258f = paint;
        Paint paint2 = new Paint();
        this.f28259g = paint2;
        this.f28260h = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pdf.pdfreader.viewer.editor.free.a.f23894e, i10, 0);
        kotlin.jvm.internal.g.d(obtainStyledAttributes, ea.a.p("LG9fdBx4Qy41Yj5hHG47dExsC2QEdBFypYDRZAZmEXQ2bFRBDXRFLHowQCBVIEggFSBOKQ==", "DbwKGwcB"));
        this.f28254a = obtainStyledAttributes.getColor(4, -65536);
        this.f28255b = obtainStyledAttributes.getColor(2, -65536);
        this.c = obtainStyledAttributes.getColor(0, -7829368);
        this.f28256d = obtainStyledAttributes.getInt(3, 100);
        this.f28257e = obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.recycle();
    }
}
