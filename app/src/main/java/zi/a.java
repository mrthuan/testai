package zi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Vector;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.GeneralPath;
import lib.zj.office.java.awt.geom.b;
import wi.c;
import wi.d;
import wi.e;

/* compiled from: EMFUtil.java */
/* loaded from: classes3.dex */
public final class a {
    public static Bitmap a(int i10, int i11, String str, String str2) {
        Bitmap createBitmap;
        Canvas canvas;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        c cVar = new c(new FileInputStream(str));
        if (cVar.f31230k == null) {
            cVar.f31230k = new wi.a(cVar);
        }
        wi.a aVar = cVar.f31230k;
        Rectangle rectangle = aVar.f31218b;
        Dimension dimension = aVar.f31226k;
        int i22 = dimension.width;
        int i23 = dimension.height;
        Dimension dimension2 = aVar.f31227l;
        int width = (int) dimension2.getWidth();
        int height = (int) dimension2.getHeight();
        int width2 = (((((int) aVar.f31218b.getWidth()) * i22) / width) / 100) + 1;
        int height2 = (((((int) rectangle.getHeight()) * i23) / height) / 100) + 1;
        int i24 = ((rectangle.f20688x * i22) / width) / 100;
        int i25 = ((rectangle.f20689y * i23) / height) / 100;
        d dVar = new d(cVar);
        if (i10 * i11 < width2 * height2) {
            createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
            canvas.scale(i10 / width2, i11 / height2);
        } else {
            createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
        }
        canvas.translate(-i24, -i25);
        dVar.f31236g = canvas;
        Rect clipBounds = canvas.getClipBounds();
        Matrix matrix = canvas.getMatrix();
        int i26 = 12;
        int i27 = -1;
        int i28 = clipBounds.top;
        int i29 = clipBounds.left;
        int i30 = -2;
        int i31 = clipBounds.right;
        int i32 = clipBounds.bottom;
        int[] iArr = {-1, i28, i29, -2, i28, i31, -2, i32, i31, -2, i32, i29};
        GeneralPath generalPath = new GeneralPath();
        int i33 = 0;
        while (i33 < i26) {
            int i34 = iArr[i33];
            if (i34 == -5) {
                break;
            }
            if (i34 != -4) {
                if (i34 != -3) {
                    if (i34 != i30) {
                        if (i34 == i27) {
                            i33 = i33 + 1 + 1;
                            generalPath.moveTo(iArr[i21], iArr[i33]);
                        }
                    } else {
                        i33 = i33 + 1 + 1;
                        generalPath.lineTo(iArr[i20], iArr[i33]);
                    }
                } else {
                    i33 = i33 + 1 + 1 + 1 + 1;
                    generalPath.quadTo(iArr[i17], iArr[i18], iArr[i19], iArr[i33]);
                }
            } else {
                i33 = i33 + 1 + 1 + 1 + 1 + 1 + 1;
                generalPath.curveTo(iArr[i12], iArr[i13], iArr[i14], iArr[i15], iArr[i16], iArr[i33]);
            }
            i33++;
            i26 = 12;
            i27 = -1;
            i30 = -2;
        }
        dVar.f31254y = new b(generalPath);
        Paint paint = dVar.f31240k;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        dVar.f31232b = canvas.getMatrix();
        dVar.f31250u = null;
        dVar.f31231a = null;
        dVar.f31246q = 10;
        dVar.f31243n = 0;
        dVar.f31244o = 2;
        dVar.f31245p = true;
        dVar.f31248s = 4;
        dVar.c = null;
        dVar.f31233d = null;
        dVar.f31234e = false;
        double d10 = d.B;
        AffineTransform.getScaleInstance(d10, d10);
        dVar.i(canvas);
        dVar.f31235f = dVar.f31254y;
        int i35 = 0;
        while (true) {
            Vector vector = dVar.f31249t;
            if (i35 < vector.size()) {
                yi.c cVar2 = (yi.c) vector.get(i35);
                if (cVar2 instanceof e) {
                    ((e) vector.get(i35)).a(dVar);
                } else {
                    d.A.warning("unknown tag: " + cVar2);
                }
                i35++;
            } else {
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                canvas.setMatrix(matrix);
                dVar.j(dVar.f31235f);
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                return createBitmap;
            }
        }
    }
}
