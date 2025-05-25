package jh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.system.f;

/* compiled from: PictureKit.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final c f19238d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final int f19239e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f19240f = 1048576;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f19241a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final Paint f19242b;
    public boolean c;

    public c() {
        Paint paint = new Paint();
        this.f19242b = paint;
        this.c = true;
        paint.setAntiAlias(true);
    }

    public static void a(Paint paint, kh.b bVar) {
        if (bVar != null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            Float f10 = bVar.c;
            if (f10 != null) {
                float floatValue = f10.floatValue() * (-256.0f);
                colorMatrix.set(new float[]{79.0016f, 156.0064f, 20.992f, 0.0f, floatValue, 79.0016f, 156.0064f, 20.992f, 0.0f, floatValue, 79.0016f, 156.0064f, 20.992f, 0.0f, floatValue, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            } else {
                Boolean bool = bVar.f19754b;
                if (bool != null && bool.booleanValue()) {
                    colorMatrix.set(new float[]{0.3086f, 0.6094f, 0.082f, 0.0f, 0.0f, 0.3086f, 0.6094f, 0.082f, 0.0f, 0.0f, 0.3086f, 0.6094f, 0.082f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
            }
            Float f11 = bVar.f19755d;
            Float f12 = bVar.f19756e;
            if (f11 != null && f12 != null) {
                ColorMatrix colorMatrix2 = new ColorMatrix();
                float intValue = f11.intValue();
                float floatValue2 = f12.floatValue();
                colorMatrix2.set(new float[]{floatValue2, 0.0f, 0.0f, 0.0f, intValue, 0.0f, floatValue2, 0.0f, 0.0f, intValue, 0.0f, 0.0f, floatValue2, 0.0f, intValue, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                colorMatrix.preConcat(colorMatrix2);
            } else if (f11 != null) {
                ColorMatrix colorMatrix3 = new ColorMatrix();
                float intValue2 = f11.intValue();
                colorMatrix3.set(new float[]{1.0f, 0.0f, 0.0f, 0.0f, intValue2, 0.0f, 1.0f, 0.0f, 0.0f, intValue2, 0.0f, 0.0f, 1.0f, 0.0f, intValue2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                colorMatrix.preConcat(colorMatrix3);
            } else if (f12 != null) {
                ColorMatrix colorMatrix4 = new ColorMatrix();
                float floatValue3 = f12.floatValue();
                float f13 = (1.0f - floatValue3) * 128.0f;
                colorMatrix4.set(new float[]{floatValue3, 0.0f, 0.0f, 0.0f, f13, 0.0f, floatValue3, 0.0f, 0.0f, f13, 0.0f, 0.0f, floatValue3, 0.0f, f13, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                colorMatrix.preConcat(colorMatrix4);
            }
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        }
    }

    public static int b(String str, float f10, float f11) {
        int i10;
        float f12;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i11 = options.outWidth * options.outHeight;
        float f13 = f10 * f11;
        if (f13 < 4194304.0f) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        float f14 = i11;
        if (f13 < 262144.0f) {
            f12 = f14 / 262144.0f;
        } else {
            f12 = f14 / f13;
        }
        if (f12 < i10 * 1.5d * 1.5d) {
            return 1;
        }
        return 1 << (31 - Integer.numberOfLeadingZeros((int) Math.round(Math.sqrt(f12 / i10))));
    }

    public static Bitmap c(Bitmap bitmap, int i10) {
        if (!bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            for (int i11 = 0; i11 < height; i11++) {
                for (int i12 = 0; i12 < width; i12++) {
                    int i13 = (i11 * width) + i12;
                    int i14 = iArr[i13];
                    int i15 = (i14 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                    int i16 = (i14 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                    int i17 = i14 & FunctionEval.FunctionID.EXTERNAL_FUNC;
                    int i18 = (i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                    int i19 = (i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                    int i20 = i10 & FunctionEval.FunctionID.EXTERNAL_FUNC;
                    if (Math.abs(i18 - i15) <= 10 && Math.abs(i19 - i16) <= 10 && Math.abs(i20 - i17) <= 10) {
                        iArr[i13] = 0;
                    }
                }
            }
            return Bitmap.createBitmap(iArr, width, height, Bitmap.Config.ARGB_4444);
        }
        return null;
    }

    public static Bitmap i(Bitmap bitmap, float f10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, Bitmap bitmap, kh.a aVar) {
        if (aVar != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f14 = width;
            int i10 = (int) (aVar.f19750a * f14);
            float f15 = height;
            int i11 = (int) (aVar.f19751b * f15);
            int i12 = (int) ((1.0f - aVar.c) * f14);
            int i13 = (int) ((1.0f - aVar.f19752d) * f15);
            Rect rect = new Rect(i10, i11, i12, i13);
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            if (i12 < width) {
                width = i12;
            }
            if (i13 < height) {
                height = i13;
            }
            Rect rect2 = new Rect(i10, i11, width, height);
            canvas.save();
            Matrix matrix = new Matrix();
            float width2 = f12 / rect.width();
            float height2 = f13 / rect.height();
            matrix.postScale(width2, height2);
            float f16 = rect.left * width2;
            float f17 = rect.top * height2;
            matrix.postTranslate(f10 - f16, f11 - f17);
            if (f16 >= 0.0f) {
                f16 = 0.0f;
            }
            if (f17 >= 0.0f) {
                f17 = 0.0f;
            }
            float f18 = f10 - f16;
            float f19 = f11 - f17;
            canvas.clipRect(f18, f19, (rect2.width() * width2) + f18, (rect2.height() * height2) + f19);
            canvas.drawBitmap(bitmap, matrix, this.f19242b);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9 A[Catch: OutOfMemoryError -> 0x01b1, all -> 0x0280, Exception -> 0x0283, TryCatch #1 {all -> 0x0280, blocks: (B:5:0x000f, B:8:0x0022, B:12:0x002a, B:14:0x003d, B:16:0x0047, B:154:0x0293, B:159:0x02ab, B:163:0x02ce, B:165:0x02de, B:164:0x02d8, B:23:0x0057, B:26:0x005f, B:29:0x0067, B:31:0x006b, B:33:0x0070, B:35:0x0076, B:37:0x007c, B:39:0x008b, B:40:0x0090, B:42:0x0096, B:44:0x00a4, B:45:0x00aa, B:48:0x00af, B:82:0x014a, B:88:0x015c, B:93:0x019f, B:95:0x01a3, B:101:0x01b9, B:103:0x01bd, B:104:0x01c6, B:106:0x01ce, B:109:0x01dd, B:111:0x01e3, B:115:0x01ef, B:118:0x01f7, B:121:0x01fc, B:123:0x0200, B:126:0x0205, B:128:0x0210, B:130:0x0226, B:136:0x025d, B:138:0x0264, B:140:0x026a, B:127:0x020b, B:131:0x022e, B:133:0x0251, B:54:0x00d0, B:56:0x00d6, B:58:0x00e5, B:59:0x00ea), top: B:176:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0264 A[Catch: OutOfMemoryError -> 0x0278, all -> 0x0280, Exception -> 0x0283, TryCatch #1 {all -> 0x0280, blocks: (B:5:0x000f, B:8:0x0022, B:12:0x002a, B:14:0x003d, B:16:0x0047, B:154:0x0293, B:159:0x02ab, B:163:0x02ce, B:165:0x02de, B:164:0x02d8, B:23:0x0057, B:26:0x005f, B:29:0x0067, B:31:0x006b, B:33:0x0070, B:35:0x0076, B:37:0x007c, B:39:0x008b, B:40:0x0090, B:42:0x0096, B:44:0x00a4, B:45:0x00aa, B:48:0x00af, B:82:0x014a, B:88:0x015c, B:93:0x019f, B:95:0x01a3, B:101:0x01b9, B:103:0x01bd, B:104:0x01c6, B:106:0x01ce, B:109:0x01dd, B:111:0x01e3, B:115:0x01ef, B:118:0x01f7, B:121:0x01fc, B:123:0x0200, B:126:0x0205, B:128:0x0210, B:130:0x0226, B:136:0x025d, B:138:0x0264, B:140:0x026a, B:127:0x020b, B:131:0x022e, B:133:0x0251, B:54:0x00d0, B:56:0x00d6, B:58:0x00e5, B:59:0x00ea), top: B:176:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ab A[Catch: all -> 0x0280, TRY_LEAVE, TryCatch #1 {all -> 0x0280, blocks: (B:5:0x000f, B:8:0x0022, B:12:0x002a, B:14:0x003d, B:16:0x0047, B:154:0x0293, B:159:0x02ab, B:163:0x02ce, B:165:0x02de, B:164:0x02d8, B:23:0x0057, B:26:0x005f, B:29:0x0067, B:31:0x006b, B:33:0x0070, B:35:0x0076, B:37:0x007c, B:39:0x008b, B:40:0x0090, B:42:0x0096, B:44:0x00a4, B:45:0x00aa, B:48:0x00af, B:82:0x014a, B:88:0x015c, B:93:0x019f, B:95:0x01a3, B:101:0x01b9, B:103:0x01bd, B:104:0x01c6, B:106:0x01ce, B:109:0x01dd, B:111:0x01e3, B:115:0x01ef, B:118:0x01f7, B:121:0x01fc, B:123:0x0200, B:126:0x0205, B:128:0x0210, B:130:0x0226, B:136:0x025d, B:138:0x0264, B:140:0x026a, B:127:0x020b, B:131:0x022e, B:133:0x0251, B:54:0x00d0, B:56:0x00d6, B:58:0x00e5, B:59:0x00ea), top: B:176:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.lang.String e(android.graphics.Canvas r22, lib.zj.office.system.f r23, int r24, jh.a r25, android.graphics.BitmapFactory.Options r26, float r27, float r28, float r29, float r30, float r31, kh.b r32, qh.d r33) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.c.e(android.graphics.Canvas, lib.zj.office.system.f, int, jh.a, android.graphics.BitmapFactory$Options, float, float, float, float, float, kh.b, qh.d):java.lang.String");
    }

    public final synchronized void f(Canvas canvas, f fVar, int i10, a aVar, float f10, float f11, float f12, float f13, float f14, kh.b bVar) {
        g(canvas, fVar, i10, aVar, f10, f11, f12, f13, f14, bVar, null);
    }

    public final synchronized void g(Canvas canvas, f fVar, int i10, a aVar, float f10, float f11, float f12, float f13, float f14, kh.b bVar, qh.d dVar) {
        if (aVar != null) {
            if (aVar.c != null) {
                if (dVar != null && dVar.e().f29343a == 0) {
                    return;
                }
                String e10 = e(canvas, fVar, i10, aVar, null, f10, f11, f12, f13, f14, bVar, dVar);
                if (e10 != null) {
                    if (e10.equalsIgnoreCase("Fail")) {
                        aVar.c = null;
                    } else {
                        aVar.f19230a = (byte) 6;
                        aVar.c = e10;
                    }
                }
            }
        }
    }

    public final boolean h() {
        if (!this.f19241a.get() && !this.c) {
            return false;
        }
        return true;
    }
}
