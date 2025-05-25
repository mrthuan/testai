package w8;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: FadeThroughDrawable.java */
/* loaded from: classes2.dex */
public final class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f30997a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f30998b;
    public final float[] c;

    /* renamed from: d  reason: collision with root package name */
    public float f30999d;

    public d(Drawable drawable, Drawable drawable2) {
        this.f30997a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.f30998b = mutate;
        mutate.setAlpha(0);
        this.c = new float[2];
    }

    public final void a(float f10) {
        if (this.f30999d != f10) {
            this.f30999d = f10;
            int i10 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
            float[] fArr = this.c;
            if (i10 <= 0) {
                fArr[0] = 1.0f - (f10 * 2.0f);
                fArr[1] = 0.0f;
            } else {
                fArr[0] = 0.0f;
                fArr[1] = (f10 * 2.0f) - 1.0f;
            }
            this.f30997a.setAlpha((int) (fArr[0] * 255.0f));
            this.f30998b.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f30997a.draw(canvas);
        this.f30998b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f30997a.getIntrinsicHeight(), this.f30998b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f30997a.getIntrinsicWidth(), this.f30998b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.f30997a.getMinimumHeight(), this.f30998b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.f30997a.getMinimumWidth(), this.f30998b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.f30997a.isStateful() && !this.f30998b.isStateful()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = (this.f30999d > 0.5f ? 1 : (this.f30999d == 0.5f ? 0 : -1));
        Drawable drawable = this.f30998b;
        Drawable drawable2 = this.f30997a;
        if (i11 <= 0) {
            drawable2.setAlpha(i10);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f30997a.setBounds(i10, i11, i12, i13);
        this.f30998b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30997a.setColorFilter(colorFilter);
        this.f30998b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        boolean state = this.f30997a.setState(iArr);
        boolean state2 = this.f30998b.setState(iArr);
        if (!state && !state2) {
            return false;
        }
        return true;
    }
}
