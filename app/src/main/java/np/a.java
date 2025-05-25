package np;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.g;

/* compiled from: TabIndicatorDrawableWrapper.kt */
/* loaded from: classes3.dex */
public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f22634a;

    public a(Drawable drawable) {
        ea.a.p("J3JQZ1BuPnIpdwdiWGU=", "K7H99z8T");
        this.f22634a = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        g.e(canvas, "canvas");
        this.f22634a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f22634a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f22634a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f22634a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f22634a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int abs = Math.abs(i14);
        Drawable drawable = this.f22634a;
        if (abs > drawable.getIntrinsicWidth()) {
            int abs2 = (Math.abs(i14) / 2) + Math.min(i10, i12);
            drawable.setBounds(abs2 - (drawable.getIntrinsicWidth() / 2), i11, (drawable.getIntrinsicWidth() / 2) + abs2, i13);
        } else {
            drawable.setBounds(i10, i11, i12, i13);
        }
        super.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22634a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f22634a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
        g.e(mode, "mode");
        this.f22634a.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect bounds) {
        g.e(bounds, "bounds");
        int width = bounds.width();
        Drawable drawable = this.f22634a;
        if (width > drawable.getIntrinsicWidth()) {
            drawable.setBounds(bounds.centerX() - (drawable.getIntrinsicWidth() / 2), bounds.top, (drawable.getIntrinsicWidth() / 2) + bounds.centerX(), bounds.bottom);
        } else {
            drawable.setBounds(bounds);
        }
        super.setBounds(bounds);
    }
}
