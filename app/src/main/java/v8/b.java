package v8;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import f9.m;
import f9.n;

/* compiled from: BorderDrawable.java */
/* loaded from: classes2.dex */
public final class b extends Drawable {

    /* renamed from: b  reason: collision with root package name */
    public final Paint f30749b;

    /* renamed from: h  reason: collision with root package name */
    public float f30754h;

    /* renamed from: i  reason: collision with root package name */
    public int f30755i;

    /* renamed from: j  reason: collision with root package name */
    public int f30756j;

    /* renamed from: k  reason: collision with root package name */
    public int f30757k;

    /* renamed from: l  reason: collision with root package name */
    public int f30758l;

    /* renamed from: m  reason: collision with root package name */
    public int f30759m;

    /* renamed from: o  reason: collision with root package name */
    public m f30761o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f30762p;

    /* renamed from: a  reason: collision with root package name */
    public final n f30748a = n.a.f17245a;
    public final Path c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f30750d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f30751e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f30752f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final a f30753g = new a();

    /* renamed from: n  reason: collision with root package name */
    public boolean f30760n = true;

    /* compiled from: BorderDrawable.java */
    /* loaded from: classes2.dex */
    public class a extends Drawable.ConstantState {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return b.this;
        }
    }

    public b(m mVar) {
        this.f30761o = mVar;
        Paint paint = new Paint(1);
        this.f30749b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.f30760n;
        Paint paint = this.f30749b;
        Rect rect = this.f30750d;
        if (z10) {
            copyBounds(rect);
            float height = this.f30754h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{o0.a.c(this.f30755i, this.f30759m), o0.a.c(this.f30756j, this.f30759m), o0.a.c(o0.a.d(this.f30756j, 0), this.f30759m), o0.a.c(o0.a.d(this.f30758l, 0), this.f30759m), o0.a.c(this.f30758l, this.f30759m), o0.a.c(this.f30757k, this.f30759m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f30760n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f30751e;
        rectF.set(rect);
        f9.d dVar = this.f30761o.f17215e;
        RectF rectF2 = this.f30752f;
        rectF2.set(getBounds());
        float min = Math.min(dVar.a(rectF2), rectF.width() / 2.0f);
        m mVar = this.f30761o;
        rectF2.set(getBounds());
        if (mVar.f(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f30753g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f30754h > 0.0f) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        m mVar = this.f30761o;
        RectF rectF = this.f30752f;
        rectF.set(getBounds());
        if (mVar.f(rectF)) {
            f9.d dVar = this.f30761o.f17215e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), dVar.a(rectF));
            return;
        }
        Rect rect = this.f30750d;
        copyBounds(rect);
        RectF rectF2 = this.f30751e;
        rectF2.set(rect);
        m mVar2 = this.f30761o;
        Path path = this.c;
        this.f30748a.a(mVar2, 1.0f, rectF2, null, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
        } else if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        m mVar = this.f30761o;
        RectF rectF = this.f30752f;
        rectF.set(getBounds());
        if (mVar.f(rectF)) {
            int round = Math.round(this.f30754h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f30762p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f30760n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f30762p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f30759m)) != this.f30759m) {
            this.f30760n = true;
            this.f30759m = colorForState;
        }
        if (this.f30760n) {
            invalidateSelf();
        }
        return this.f30760n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f30749b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30749b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
