package pdf.pdfreader.viewer.editor.free.pic.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.util.Size;
import com.bumptech.glide.e;
import com.lib.cp.Cp;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: BitmapUtil.kt */
/* loaded from: classes3.dex */
public final class a {
    public static void a(String str, Bitmap bitmap) {
        try {
            File file = new File(str);
            file.deleteOnExit();
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            ea.a.p("BmEYYWE=", "y4gyp9HJ");
        } catch (Exception e10) {
            e10.printStackTrace();
            ea.a.p("LmFQYWE=", "VOvENGFU");
            e10.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            ea.a.p("LmFQYWE=", "3v4yeKRE");
            th2.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap b(ArrayList arrayList, Bitmap bitmap) {
        try {
            Bitmap a10 = Cp.a(bitmap, new Point[]{arrayList.get(0), arrayList.get(1), arrayList.get(3), arrayList.get(2)});
            g.d(a10, ea.a.p("F3IAcEFiIXQlYRYsFHA4aVZ0ISk=", "kRtoiH7w"));
            return a10;
        } catch (Throwable unused) {
            Point point = (Point) arrayList.get(0);
            Point point2 = (Point) arrayList.get(1);
            Point point3 = (Point) arrayList.get(2);
            Point point4 = (Point) arrayList.get(3);
            double d10 = 2;
            int e10 = (int) ((e(point3, point4) + e(point, point2)) / d10);
            int e11 = (int) ((e(point2, point4) + e(point, point3)) / d10);
            if (e10 <= 0 || e11 <= 0) {
                return bitmap;
            }
            Bitmap createBitmap = Bitmap.createBitmap(e10, e11, Bitmap.Config.ARGB_8888);
            g.d(createBitmap, ea.a.p("VHIAYTFlMGk8bQdwHGMlb0hXO2Q9aBogloDXIBNpNm1WcEtDKm4UaS8uJ1JzQgg4ADhqKQ==", "DB7eErR7"));
            float[] fArr = {point.x, point.y, point2.x, point2.y, point4.x, point4.y, point3.x, point3.y};
            float f10 = e10;
            float f11 = e11;
            float[] fArr2 = {0.0f, 0.0f, f10, 0.0f, f10, f11, 0.0f, f11};
            Matrix matrix = new Matrix();
            matrix.setPolyToPoly(fArr, 0, fArr2, 0, 4);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, null);
            return createBitmap;
        }
    }

    public static Object c(String str, Context context, Integer num, Integer num2, kotlin.coroutines.c cVar, int i10) {
        Integer num3;
        Integer num4;
        boolean z10;
        if ((i10 & 2) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i10 & 4) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i10 & 16) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return t0.w0(j0.f20207b, new BitmapUtil$getBitmapFromFilePath$2(num3, num4, context, str, null, z10, null), cVar);
    }

    public static Bitmap d(String str, Context context, int i10) {
        if (i10 >= 4320) {
            i10 = 4320;
        }
        try {
            Size a10 = c.a(context, str);
            float width = (a10.getWidth() * 1.0f) / a10.getHeight();
            if (a10.getWidth() > i10 || a10.getHeight() > i10) {
                if (a10.getWidth() > a10.getHeight()) {
                    a10 = new Size(i10, (int) (i10 / width));
                } else {
                    a10 = new Size((int) (i10 * width), i10);
                }
            }
            e<Bitmap> a11 = com.bumptech.glide.b.c(context).f(context).a();
            a11.F = str;
            a11.I = true;
            Bitmap bitmap = (Bitmap) a11.J(a10.getWidth(), a10.getHeight()).get();
            g.d(bitmap, ea.a.p("NAoRIFkgFyB6IGogVSBIIBUgGGEpIBFljYDAaQNoBClhZ1R0USk9IHogaiBVIEggFSBOfQ==", "xd1jofdp"));
            return bitmap;
        } catch (Throwable th2) {
            ea.a.p("UmEqYWE=", "CKZ5C2EE");
            th2.getMessage();
            Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
            g.d(createBitmap, ea.a.p("NnIUYTNlFGk8bQdwHDFnMBQgYzB5LBZCHXQcYSEuAW87ZhhnaUEERwpfXjgMOCk=", "xLUqGVoy"));
            return createBitmap;
        }
    }

    public static double e(Point point, Point point2) {
        return Math.sqrt(Math.pow(point.y - point2.y, 2.0d) + Math.pow(point.x - point2.x, 2.0d));
    }
}
