package rp;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.io.File;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: BitmapDrawRunner.java */
/* loaded from: classes3.dex */
public final class a implements qp.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f29639a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f29640b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f29641d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f29642e;

    /* renamed from: f  reason: collision with root package name */
    public final int f29643f;

    /* renamed from: g  reason: collision with root package name */
    public final int f29644g;

    /* renamed from: h  reason: collision with root package name */
    public final Bitmap.Config f29645h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f29646i;

    static {
        ea.a.p("cWk_bRJwJnITd2Z1B24zcg==", "2zp9BXb0");
        ea.a.p("M21w", "UlQAoqmr");
    }

    public a(qp.b bVar, Bitmap bitmap, RectF rectF, int i10, Matrix matrix) {
        boolean z10;
        String str;
        this.f29643f = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f29644g = height;
        this.f29645h = bitmap.getConfig();
        this.f29640b = new RectF(rectF);
        this.c = i10;
        this.f29641d = new Matrix(matrix);
        String pixelsHash = ReaderPDFCore.getPixelsHash(bitmap);
        if (pixelsHash != null && (str = bVar.f29417f.get(pixelsHash)) != null) {
            File file = new File(str);
            if (file.isFile() && file.length() > 0) {
                this.f29639a = str;
                this.f29642e = file.length() * 8 < ((long) bitmap.getRowBytes()) * ((long) height);
                this.f29646i = false;
                return;
            }
        }
        String absolutePath = new File(bVar.f29413a, ea.a.p("UW1w", "HsnadZ4A") + bitmap.hashCode()).getAbsolutePath();
        this.f29639a = absolutePath;
        int savePixelsToFile = ReaderPDFCore.savePixelsToFile(bitmap, absolutePath);
        if (savePixelsToFile > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29642e = z10;
        if (pixelsHash != null && savePixelsToFile > 0) {
            bVar.f29417f.put(pixelsHash, absolutePath);
            this.f29646i = false;
            return;
        }
        this.f29646i = true;
    }

    @Override // qp.a
    public final void a() {
        if (this.f29646i && !new File(this.f29639a).delete()) {
            ea.a.p("QXUlOlNkB2wXdFEgD2k6ZWRmU2kqZSc6IA==", "0vjSywix");
        }
    }

    @Override // qp.a
    public final boolean b(ReaderPDFCore.b bVar) {
        Boolean bool;
        boolean pageWriteBmp;
        String str = this.f29639a;
        if (!new File(str).exists()) {
            return true;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f29643f, this.f29644g, this.f29645h);
        int loadPixelsFromFile = ReaderPDFCore.loadPixelsFromFile(createBitmap, str);
        if (createBitmap == null || loadPixelsFromFile < 0) {
            return false;
        }
        RectF rectF = this.f29640b;
        int i10 = this.c;
        Matrix matrix = this.f29641d;
        boolean z10 = this.f29642e;
        if (bVar.f21371a != 0) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            pageWriteBmp = ReaderPDFCore.this.pageWriteBmp(bVar.f21371a, createBitmap, rectF.left, rectF.top, rectF.right, rectF.bottom, i10, fArr, z10);
            bool = Boolean.valueOf(pageWriteBmp);
        } else {
            bool = null;
        }
        createBitmap.recycle();
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
