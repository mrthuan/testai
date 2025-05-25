package eh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;

/* compiled from: PatternShader.java */
/* loaded from: classes.dex */
public final class e extends a {
    public Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public final jh.a f16577d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16578e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16579f;

    public e(jh.a aVar, int i10, int i11) {
        this.f16577d = aVar;
        this.f16578e = i10;
        this.f16579f = i11;
    }

    @Override // eh.a
    public final Shader a(lib.zj.office.system.f fVar, int i10, Rect rect) {
        try {
            Bitmap bitmap = this.c;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.c.recycle();
            }
            Bitmap c = g.c(fVar, i10, this.f16577d, rect, null);
            this.c = c;
            if (c != null) {
                int width = c.getWidth();
                int height = this.c.getHeight();
                int i11 = width * height;
                int[] iArr = new int[i11];
                this.c.getPixels(iArr, 0, width, 0, 0, width, height);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((iArr[i12] & 16777215) == 0) {
                        iArr[i12] = this.f16578e;
                    } else {
                        iArr[i12] = this.f16579f;
                    }
                }
                this.c = Bitmap.createBitmap(iArr, width, height, Bitmap.Config.ARGB_8888);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                this.f16568b = new BitmapShader(this.c, tileMode, tileMode);
            }
            return this.f16568b;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // eh.a
    public final void b() {
        Bitmap bitmap = this.c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.c.recycle();
        }
    }
}
