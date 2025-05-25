package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.activity.r;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: DrawerArrowDrawable.java */
/* loaded from: classes.dex */
public final class d extends Drawable {

    /* renamed from: l  reason: collision with root package name */
    public static final float f22259l = (float) Math.toRadians(45.0d);

    /* renamed from: a  reason: collision with root package name */
    public final Paint f22260a;

    /* renamed from: b  reason: collision with root package name */
    public final float f22261b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f22262d;

    /* renamed from: e  reason: collision with root package name */
    public float f22263e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22264f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f22265g;

    /* renamed from: h  reason: collision with root package name */
    public final int f22266h;

    /* renamed from: i  reason: collision with root package name */
    public float f22267i;

    /* renamed from: j  reason: collision with root package name */
    public float f22268j;

    /* renamed from: k  reason: collision with root package name */
    public final int f22269k;

    public d(Context context) {
        Paint paint = new Paint();
        this.f22260a = paint;
        this.f22265g = new Path();
        this.f22269k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, k.a.f19442o, R.attr.drawerArrowStyle, 2132017370);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f22268j = (float) (Math.cos(f22259l) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f22264f != z10) {
            this.f22264f = z10;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f22263e) {
            this.f22263e = round;
            invalidateSelf();
        }
        this.f22266h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.c = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f22261b = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f22262d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        int i10;
        Rect bounds = getBounds();
        boolean z10 = true;
        int i11 = this.f22269k;
        if (i11 == 0 || (i11 != 1 && (i11 == 3 ? a.c.a(this) != 0 : a.c.a(this) != 1))) {
            z10 = false;
        }
        float f11 = this.f22261b;
        float sqrt = (float) Math.sqrt(f11 * f11 * 2.0f);
        float f12 = this.f22267i;
        float f13 = this.c;
        float l10 = r.l(sqrt, f13, f12, f13);
        float l11 = r.l(this.f22262d, f13, f12, f13);
        float f14 = 0.0f;
        float round = Math.round(((this.f22268j - 0.0f) * f12) + 0.0f);
        float f15 = this.f22267i;
        float l12 = r.l(f22259l, 0.0f, f15, 0.0f);
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -180.0f;
        }
        if (z10) {
            f14 = 180.0f;
        }
        float l13 = r.l(f14, f10, f15, f10);
        double d10 = l10;
        double d11 = l12;
        float round2 = (float) Math.round(Math.cos(d11) * d10);
        float round3 = (float) Math.round(Math.sin(d11) * d10);
        Path path = this.f22265g;
        path.rewind();
        float f16 = this.f22263e;
        Paint paint = this.f22260a;
        float strokeWidth = paint.getStrokeWidth() + f16;
        float l14 = r.l(-this.f22268j, strokeWidth, this.f22267i, strokeWidth);
        float f17 = (-l11) / 2.0f;
        path.moveTo(f17 + round, 0.0f);
        path.rLineTo(l11 - (round * 2.0f), 0.0f);
        path.moveTo(f17, l14);
        path.rLineTo(round2, round3);
        path.moveTo(f17, -l14);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth2 = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth2);
        float f18 = this.f22263e;
        canvas.translate(bounds.centerX(), (strokeWidth2 * 1.5f) + f18 + ((((int) (height - (2.0f * f18))) / 4) * 2));
        if (this.f22264f) {
            if (z10) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            canvas.rotate(l13 * i10);
        } else if (z10) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f22266h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f22266h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Paint paint = this.f22260a;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22260a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
