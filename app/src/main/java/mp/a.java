package mp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import java.security.MessageDigest;
import v3.l;

/* compiled from: GlideRoundTransform.java */
/* loaded from: classes3.dex */
public final class a implements t3.h<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    public final w3.c f22185b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f22186d;

    /* renamed from: e  reason: collision with root package name */
    public float f22187e;

    /* renamed from: f  reason: collision with root package name */
    public float f22188f;

    public a(Context context, float f10, float f11, float f12, float f13) {
        this.f22185b = com.bumptech.glide.b.b(context).f6833a;
        this.c = f10;
        this.f22186d = f11;
        this.f22187e = f12;
        this.f22188f = f13;
    }

    @Override // t3.h
    public final l b(com.bumptech.glide.d dVar, l lVar, int i10, int i11) {
        int height;
        int i12;
        Bitmap bitmap = (Bitmap) lVar.get();
        if (i10 > i11) {
            float f10 = i11;
            float f11 = i10;
            height = bitmap.getWidth();
            i12 = (int) (bitmap.getWidth() * (f10 / f11));
            if (i12 > bitmap.getHeight()) {
                i12 = bitmap.getHeight();
                height = (int) (bitmap.getHeight() * (f11 / f10));
            }
        } else if (i10 < i11) {
            float f12 = i10;
            float f13 = i11;
            int height2 = bitmap.getHeight();
            int height3 = (int) (bitmap.getHeight() * (f12 / f13));
            if (height3 > bitmap.getWidth()) {
                height = bitmap.getWidth();
                i12 = (int) (bitmap.getWidth() * (f13 / f12));
            } else {
                height = height3;
                i12 = height2;
            }
        } else {
            height = bitmap.getHeight();
            i12 = height;
        }
        float f14 = i12 / i11;
        this.c *= f14;
        this.f22186d *= f14;
        this.f22187e *= f14;
        this.f22188f *= f14;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        w3.c cVar = this.f22185b;
        Bitmap e10 = cVar.e(height, i12, config);
        if (e10 == null) {
            e10 = Bitmap.createBitmap(height, i12, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(e10);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        int width = (bitmap.getWidth() - height) / 2;
        int height4 = (bitmap.getHeight() - i12) / 2;
        if (width != 0 || height4 != 0) {
            Matrix matrix = new Matrix();
            matrix.setTranslate(-width, -height4);
            bitmapShader.setLocalMatrix(matrix);
        }
        paint.setShader(bitmapShader);
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        float f15 = this.c;
        float f16 = this.f22187e;
        float f17 = this.f22188f;
        float f18 = this.f22186d;
        float[] fArr = {f15, f15, f16, f16, f17, f17, f18, f18};
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return c4.c.b(e10, cVar);
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
    }
}
