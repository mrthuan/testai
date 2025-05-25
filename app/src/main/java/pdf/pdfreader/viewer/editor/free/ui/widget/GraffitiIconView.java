package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: GraffitiIconView.kt */
/* loaded from: classes3.dex */
public final class GraffitiIconView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f28199a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f28200b;
    public final Paint c;

    /* renamed from: d  reason: collision with root package name */
    public float f28201d;

    /* renamed from: e  reason: collision with root package name */
    public int f28202e;

    /* renamed from: f  reason: collision with root package name */
    public float f28203f;

    /* renamed from: g  reason: collision with root package name */
    public int f28204g;

    /* renamed from: h  reason: collision with root package name */
    public int f28205h;

    /* renamed from: i  reason: collision with root package name */
    public final int f28206i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f28207j;

    /* renamed from: k  reason: collision with root package name */
    public final Path f28208k;

    /* renamed from: l  reason: collision with root package name */
    public final Path f28209l;

    /* renamed from: m  reason: collision with root package name */
    public final Path f28210m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraffitiIconView(Context context) {
        this(context, null);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "11XiRbhD"));
    }

    public final void a(int i10, int i11, boolean z10) {
        this.f28204g = i10;
        this.f28200b.setColor(i10);
        this.f28205h = i11;
        this.c.setColor(i11);
        this.f28207j = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        kotlin.jvm.internal.g.e(canvas, "canvas");
        super.onDraw(canvas);
        boolean z11 = true;
        if (this.f28201d == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Paint paint = this.f28199a;
        if (z10) {
            float measuredWidth = (getMeasuredWidth() * 2.06897f) / 24.0f;
            this.f28201d = measuredWidth;
            paint.setStrokeWidth(measuredWidth);
        }
        if (this.f28203f != 0.0f) {
            z11 = false;
        }
        Paint paint2 = this.c;
        Paint paint3 = this.f28200b;
        if (z11) {
            float measuredWidth2 = (getMeasuredWidth() * 2.2f) / 24.0f;
            this.f28203f = measuredWidth2;
            paint3.setStrokeWidth(measuredWidth2);
            paint2.setStrokeWidth(this.f28203f + (this.f28206i * 2));
        }
        Path path = this.f28208k;
        path.reset();
        path.moveTo((getMeasuredWidth() * 9.83f) / 24.0f, (getMeasuredHeight() * 7.5f) / 24.0f);
        path.lineTo((getMeasuredWidth() * 10.82f) / 24.0f, (getMeasuredHeight() * 6.18f) / 24.0f);
        this.f28208k.cubicTo((getMeasuredWidth() * 11.77f) / 24.0f, (getMeasuredHeight() * 4.89f) / 24.0f, (getMeasuredWidth() * 13.57f) / 24.0f, (getMeasuredHeight() * 4.58f) / 24.0f, (getMeasuredWidth() * 14.9f) / 24.0f, (getMeasuredHeight() * 5.48f) / 24.0f);
        this.f28208k.cubicTo((getMeasuredWidth() * 16.31f) / 24.0f, (getMeasuredHeight() * 6.43f) / 24.0f, (getMeasuredWidth() * 16.65f) / 24.0f, (getMeasuredHeight() * 8.36f) / 24.0f, (getMeasuredWidth() * 15.65f) / 24.0f, (getMeasuredHeight() * 9.73f) / 24.0f);
        path.lineTo((getMeasuredWidth() * 14.66f) / 24.0f, (getMeasuredHeight() * 11.09f) / 24.0f);
        path.moveTo((getMeasuredWidth() * 9.83f) / 24.0f, (getMeasuredHeight() * 7.5f) / 24.0f);
        path.lineTo((getMeasuredWidth() * 3.98f) / 24.0f, (getMeasuredHeight() * 15.37f) / 24.0f);
        this.f28208k.cubicTo((getMeasuredWidth() * 3.7f) / 24.0f, (getMeasuredHeight() * 15.75f) / 24.0f, (getMeasuredWidth() * 3.56f) / 24.0f, (getMeasuredHeight() * 16.21f) / 24.0f, (getMeasuredWidth() * 3.58f) / 24.0f, (getMeasuredHeight() * 16.68f) / 24.0f);
        path.lineTo((getMeasuredWidth() * 3.7f) / 24.0f, (getMeasuredHeight() * 20.12f) / 24.0f);
        this.f28208k.cubicTo((getMeasuredWidth() * 3.71f) / 24.0f, (getMeasuredHeight() * 20.45f) / 24.0f, (getMeasuredWidth() * 4.03f) / 24.0f, (getMeasuredHeight() * 20.68f) / 24.0f, (getMeasuredWidth() * 4.35f) / 24.0f, (getMeasuredHeight() * 20.6f) / 24.0f);
        path.lineTo((getMeasuredWidth() * 7.68f) / 24.0f, (getMeasuredHeight() * 19.72f) / 24.0f);
        this.f28208k.cubicTo((getMeasuredWidth() * 8.13f) / 24.0f, (getMeasuredHeight() * 19.61f) / 24.0f, (getMeasuredWidth() * 8.53f) / 24.0f, (getMeasuredHeight() * 19.33f) / 24.0f, (getMeasuredWidth() * 8.81f) / 24.0f, (getMeasuredHeight() * 18.96f) / 24.0f);
        path.lineTo((getMeasuredWidth() * 14.66f) / 24.0f, (getMeasuredHeight() * 11.09f) / 24.0f);
        path.moveTo((getMeasuredWidth() * 9.83f) / 24.0f, (getMeasuredHeight() * 7.5f) / 24.0f);
        path.lineTo((getMeasuredWidth() * 14.66f) / 24.0f, (getMeasuredHeight() * 11.09f) / 24.0f);
        canvas.drawPath(path, paint);
        if (this.f28207j) {
            Path path2 = this.f28210m;
            path2.reset();
            path2.moveTo((getMeasuredWidth() * 11.44f) / 24.0f, (getMeasuredHeight() * 20.75f) / 24.0f);
            this.f28210m.cubicTo((getMeasuredWidth() * 11.44f) / 24.0f, (getMeasuredHeight() * 20.75f) / 24.0f, (getMeasuredWidth() * 14.02f) / 24.0f, (getMeasuredHeight() * 18.06f) / 24.0f, (getMeasuredWidth() * 16.08f) / 24.0f, (getMeasuredHeight() * 19.76f) / 24.0f);
            this.f28210m.cubicTo((getMeasuredWidth() * 18.75f) / 24.0f, (getMeasuredHeight() * 21.96f) / 24.0f, (getMeasuredWidth() * 20.47f) / 24.0f, (getMeasuredHeight() * 19.92f) / 24.0f, (getMeasuredWidth() * 20.47f) / 24.0f, (getMeasuredHeight() * 19.92f) / 24.0f);
            canvas.drawPath(path2, paint2);
        }
        Path path3 = this.f28209l;
        path3.reset();
        path3.moveTo((getMeasuredWidth() * 11.44f) / 24.0f, (getMeasuredHeight() * 20.75f) / 24.0f);
        this.f28209l.cubicTo((getMeasuredWidth() * 11.44f) / 24.0f, (getMeasuredHeight() * 20.75f) / 24.0f, (getMeasuredWidth() * 14.02f) / 24.0f, (getMeasuredHeight() * 18.06f) / 24.0f, (getMeasuredWidth() * 16.08f) / 24.0f, (getMeasuredHeight() * 19.76f) / 24.0f);
        this.f28209l.cubicTo((getMeasuredWidth() * 18.75f) / 24.0f, (getMeasuredHeight() * 21.96f) / 24.0f, (getMeasuredWidth() * 20.47f) / 24.0f, (getMeasuredHeight() * 19.92f) / 24.0f, (getMeasuredWidth() * 20.47f) / 24.0f, (getMeasuredHeight() * 19.92f) / 24.0f);
        canvas.drawPath(path3, paint3);
    }

    public final void setIconStrokeColor(int i10) {
        this.f28202e = i10;
        this.f28199a.setColor(i10);
        invalidate();
    }

    public final void setNeedDrawStroke(boolean z10) {
        this.f28207j = z10;
        invalidate();
    }

    public final void setOutSideStrokeColor(int i10) {
        this.f28205h = i10;
        this.c.setColor(i10);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraffitiIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "FD46J0jW"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraffitiIconView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "DsaDKmD9"));
        Paint paint = new Paint();
        this.f28199a = paint;
        Paint paint2 = new Paint();
        this.f28200b = paint2;
        Paint paint3 = new Paint();
        this.c = paint3;
        this.f28202e = -16777216;
        this.f28204g = -16777216;
        this.f28205h = -65536;
        this.f28206i = 1;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.dp_1);
        this.f28206i = dimensionPixelSize;
        this.f28202e = androidx.core.content.a.getColor(getContext(), R.color.colorSurface);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f28202e);
        paint.setStrokeWidth(this.f28201d);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(this.f28204g);
        paint2.setStrokeWidth(this.f28203f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(this.f28205h);
        paint3.setStrokeWidth(this.f28203f + (dimensionPixelSize * 2));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setAntiAlias(true);
        this.f28208k = new Path();
        this.f28209l = new Path();
        this.f28210m = new Path();
    }
}
