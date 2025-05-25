package c4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5528a = new a();

    public static c a(w3.c cVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else if (i11 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i10 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i11 = current.getIntrinsicHeight();
                }
                Lock lock = v.f5552b;
                lock.lock();
                Bitmap e10 = cVar.e(i10, i11, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(e10);
                    current.setBounds(0, 0, i10, i11);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = e10;
                    z10 = true;
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            }
            bitmap = null;
            z10 = true;
        } else {
            bitmap = null;
        }
        if (!z10) {
            cVar = f5528a;
        }
        return c.b(bitmap, cVar);
    }

    /* compiled from: DrawableToBitmapConverter.java */
    /* loaded from: classes.dex */
    public class a extends w3.d {
        @Override // w3.d, w3.c
        public final void d(Bitmap bitmap) {
        }
    }
}
