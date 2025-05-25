package x;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f31404a;
    public final RectF c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f31406d;

    /* renamed from: e  reason: collision with root package name */
    public float f31407e;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f31410h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f31411i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f31412j;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31408f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f31409g = true;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f31413k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f31405b = new Paint(5);

    public b(float f10, ColorStateList colorStateList) {
        this.f31404a = f10;
        b(colorStateList);
        this.c = new RectF();
        this.f31406d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f31410h = colorStateList;
        this.f31405b.setColor(colorStateList.getColorForState(getState(), this.f31410h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f31406d;
        rect2.set(rect);
        if (this.f31408f) {
            float a10 = c.a(this.f31407e, this.f31404a, this.f31409g);
            float f10 = this.f31407e;
            float f11 = this.f31404a;
            if (this.f31409g) {
                f10 = (float) (((1.0d - c.f31414a) * f11) + f10);
            }
            rect2.inset((int) Math.ceil(f10), (int) Math.ceil(a10));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f31405b;
        if (this.f31411i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f31411i);
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF = this.c;
        float f10 = this.f31404a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f31406d, this.f31404a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f31412j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f31410h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f31410h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f31405b;
        if (colorForState != paint.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f31412j;
        if (colorStateList2 != null && (mode = this.f31413k) != null) {
            this.f31411i = a(colorStateList2, mode);
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f31405b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31405b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f31412j = colorStateList;
        this.f31411i = a(colorStateList, this.f31413k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f31413k = mode;
        this.f31411i = a(this.f31412j, mode);
        invalidateSelf();
    }
}
