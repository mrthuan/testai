package a9;

import a9.b;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes2.dex */
public final class l<S extends b> extends j {

    /* renamed from: l  reason: collision with root package name */
    public k<S> f440l;

    /* renamed from: m  reason: collision with root package name */
    public androidx.appcompat.view.menu.c f441m;

    public l(Context context, b bVar, k<S> kVar, androidx.appcompat.view.menu.c cVar) {
        super(context, bVar);
        this.f440l = kVar;
        kVar.f439b = this;
        this.f441m = cVar;
        cVar.f2009a = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            k<S> kVar = this.f440l;
            Rect bounds = getBounds();
            float b10 = b();
            kVar.f438a.a();
            kVar.a(canvas, bounds, b10);
            k<S> kVar2 = this.f440l;
            Paint paint = this.f436i;
            kVar2.c(canvas, paint);
            int i10 = 0;
            while (true) {
                androidx.appcompat.view.menu.c cVar = this.f441m;
                int[] iArr = (int[]) cVar.c;
                if (i10 < iArr.length) {
                    k<S> kVar3 = this.f440l;
                    float[] fArr = (float[]) cVar.f2010b;
                    int i11 = i10 * 2;
                    kVar3.b(iArr[i10], paint, canvas, fArr[i11], fArr[i11 + 1]);
                    i10++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // a9.j
    public final boolean f(boolean z10, boolean z11, boolean z12) {
        boolean f10 = super.f(z10, z11, z12);
        if (!isRunning()) {
            this.f441m.c();
        }
        a aVar = this.c;
        ContentResolver contentResolver = this.f429a.getContentResolver();
        aVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z10 && z12) {
            this.f441m.i();
        }
        return f10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f440l.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f440l.e();
    }
}
