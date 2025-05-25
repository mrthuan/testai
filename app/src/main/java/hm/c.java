package hm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: FastBitmapDrawable.java */
/* loaded from: classes3.dex */
public final class c extends Drawable {

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f18372b;

    /* renamed from: d  reason: collision with root package name */
    public int f18373d;

    /* renamed from: e  reason: collision with root package name */
    public int f18374e;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f18371a = new Paint(2);
    public int c = FunctionEval.FunctionID.EXTERNAL_FUNC;

    public c(Bitmap bitmap) {
        this.f18372b = bitmap;
        if (bitmap != null) {
            this.f18373d = bitmap.getWidth();
            this.f18374e = this.f18372b.getHeight();
            return;
        }
        this.f18374e = 0;
        this.f18373d = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f18372b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f18372b, (Rect) null, getBounds(), this.f18371a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f18374e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f18373d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f18374e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f18373d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.c = i10;
        this.f18371a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18371a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f18371a.setFilterBitmap(z10);
    }
}
