package sg;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.concurrent.ConcurrentHashMap;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: PaintKit.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final d f29801b = new d();
    public static ColorMatrixColorFilter c;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, Paint> f29802a;

    public static void b(Paint paint) {
        if (rg.c.c) {
            if (c == null) {
                c = new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
            }
            paint.setColorFilter(c);
            return;
        }
        paint.setColorFilter(null);
    }

    public final Paint a() {
        Thread currentThread = Thread.currentThread();
        if (this.f29802a == null) {
            this.f29802a = new ConcurrentHashMap<>();
        }
        Paint paint = this.f29802a.get(String.valueOf(currentThread.getId()));
        if (paint == null) {
            paint = new Paint();
            paint.setTextSize(t0.f28775h);
            paint.setTypeface(Typeface.SERIF);
            paint.setFlags(1);
            paint.setStrokeCap(Paint.Cap.ROUND);
            this.f29802a.put(currentThread.getName(), paint);
        }
        paint.reset();
        paint.setAntiAlias(true);
        b(paint);
        return paint;
    }
}
