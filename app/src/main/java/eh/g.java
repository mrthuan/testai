package eh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import java.io.FileInputStream;

/* compiled from: TileShader.java */
/* loaded from: classes.dex */
public final class g extends a {
    public Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public final jh.a f16581d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16582e;

    /* renamed from: f  reason: collision with root package name */
    public final float f16583f;

    /* renamed from: g  reason: collision with root package name */
    public final float f16584g;

    /* renamed from: h  reason: collision with root package name */
    public final int f16585h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16586i;

    public g(jh.a aVar, int i10, float f10, float f11) {
        this.f16581d = aVar;
        this.f16582e = i10;
        this.f16583f = f10;
        this.f16584g = f11;
    }

    public static Bitmap c(lib.zj.office.system.f fVar, int i10, jh.a aVar, Rect rect, BitmapFactory.Options options) {
        boolean z10;
        try {
            String str = aVar.c;
            byte b10 = aVar.f19230a;
            if (b10 != 3 && b10 != 2) {
                return BitmapFactory.decodeStream(new FileInputStream(str), null, options);
            }
            return BitmapFactory.decodeStream(new FileInputStream(fVar.o().g().h(i10, b10, str, rect.width(), rect.height())), null, options);
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            fVar.o().g().getClass();
            if (jh.e.f19246h.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fVar.o().g().g();
                return c(fVar, i10, aVar, rect, options);
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                options.inSampleSize = 2;
            } else {
                options.inSampleSize *= 2;
            }
            return c(fVar, i10, aVar, rect, options);
        }
    }

    @Override // eh.a
    public final Shader a(lib.zj.office.system.f fVar, int i10, Rect rect) {
        try {
            Bitmap bitmap = this.c;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.c.recycle();
            }
            Bitmap c = c(fVar, i10, this.f16581d, rect, null);
            this.c = c;
            this.c = Bitmap.createScaledBitmap(this.c, Math.round(c.getWidth() * this.f16583f), Math.round(this.c.getHeight() * this.f16584g), true);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            int i11 = this.f16582e;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        BitmapShader bitmapShader = new BitmapShader(this.c, tileMode, tileMode);
                        this.f16568b = bitmapShader;
                        return bitmapShader;
                    }
                    tileMode = Shader.TileMode.MIRROR;
                    BitmapShader bitmapShader2 = new BitmapShader(this.c, tileMode, tileMode);
                    this.f16568b = bitmapShader2;
                    return bitmapShader2;
                }
            } else {
                Shader.TileMode tileMode2 = Shader.TileMode.MIRROR;
            }
            Shader.TileMode tileMode3 = Shader.TileMode.MIRROR;
            tileMode = Shader.TileMode.MIRROR;
            BitmapShader bitmapShader22 = new BitmapShader(this.c, tileMode, tileMode);
            this.f16568b = bitmapShader22;
            return bitmapShader22;
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

    public g(jh.a aVar, int i10, float f10, float f11, int i11, int i12) {
        this(aVar, i10, f10, f11);
        this.f16585h = i11;
        this.f16586i = i12;
    }
}
