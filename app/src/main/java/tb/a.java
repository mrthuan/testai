package tb;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: PaintDrawable.java */
/* loaded from: classes2.dex */
public abstract class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f29994a;

    public a() {
        Paint paint = new Paint();
        this.f29994a = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(-5592406);
    }

    public final void a(int i10) {
        this.f29994a.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f29994a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29994a.setColorFilter(colorFilter);
    }
}
