package ln;

import android.content.Context;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.g;
import org.tensorflow.lite.b;

/* compiled from: MLDocJudgeHelper.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f21779b = ea.a.p("UGguYxhkA3Rh", "J4SxUjLX");

    /* renamed from: a  reason: collision with root package name */
    public final org.tensorflow.lite.b f21780a;

    public a(Context context) {
        g.e(context, ea.a.p("UG8ldBZ4dA==", "l94WKSVL"));
        byte[] w7 = ea.a.w(new fc.a(context.getAssets().open(f21779b)));
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(w7.length);
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.put(w7);
        ea.a.p("UXk_ZTF1BGYXcg==", "sE5klcXW");
        org.tensorflow.lite.b bVar = new org.tensorflow.lite.b(allocateDirect, new b.a());
        this.f21780a = bVar;
        bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:2:0x0000, B:10:0x0028, B:17:0x0059, B:26:0x0071, B:23:0x0066, B:24:0x0069, B:25:0x006b, B:27:0x0077, B:28:0x007a, B:29:0x007d, B:31:0x0095, B:32:0x0098, B:34:0x009e, B:35:0x00a1, B:37:0x00a7, B:38:0x00aa, B:7:0x0018), top: B:43:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:2:0x0000, B:10:0x0028, B:17:0x0059, B:26:0x0071, B:23:0x0066, B:24:0x0069, B:25:0x006b, B:27:0x0077, B:28:0x007a, B:29:0x007d, B:31:0x0095, B:32:0x0098, B:34:0x009e, B:35:0x00a1, B:37:0x00a7, B:38:0x00aa, B:7:0x0018), top: B:43:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:2:0x0000, B:10:0x0028, B:17:0x0059, B:26:0x0071, B:23:0x0066, B:24:0x0069, B:25:0x006b, B:27:0x0077, B:28:0x007a, B:29:0x007d, B:31:0x0095, B:32:0x0098, B:34:0x009e, B:35:0x00a1, B:37:0x00a7, B:38:0x00aa, B:7:0x0018), top: B:43:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(java.lang.String r12) {
        /*
            r11 = this;
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> Laf
            r0.<init>()     // Catch: java.lang.Exception -> Laf
            r1 = 1
            r0.inJustDecodeBounds = r1     // Catch: java.lang.Exception -> Laf
            android.graphics.BitmapFactory.decodeFile(r12, r0)     // Catch: java.lang.Exception -> Laf
            int r2 = r0.outWidth     // Catch: java.lang.Exception -> Laf
            int r3 = r0.outHeight     // Catch: java.lang.Exception -> Laf
            r4 = 128(0x80, float:1.8E-43)
            if (r2 >= r4) goto L18
            if (r3 < r4) goto L16
            goto L18
        L16:
            r2 = r1
            goto L28
        L18:
            float r2 = (float) r2     // Catch: java.lang.Exception -> Laf
            float r5 = (float) r4     // Catch: java.lang.Exception -> Laf
            float r2 = r2 / r5
            int r2 = pdf.pdfreader.viewer.editor.free.utils.t0.o0(r2)     // Catch: java.lang.Exception -> Laf
            float r3 = (float) r3     // Catch: java.lang.Exception -> Laf
            float r3 = r3 / r5
            int r3 = pdf.pdfreader.viewer.editor.free.utils.t0.o0(r3)     // Catch: java.lang.Exception -> Laf
            if (r2 >= r3) goto L28
            r2 = r3
        L28:
            r0.inSampleSize = r2     // Catch: java.lang.Exception -> Laf
            r2 = 0
            r0.inJustDecodeBounds = r2     // Catch: java.lang.Exception -> Laf
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeFile(r12, r0)     // Catch: java.lang.Exception -> Laf
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r12, r4, r4, r1)     // Catch: java.lang.Exception -> Laf
            java.lang.String r3 = "LHJUYQ1lZGM7bC9kN2kcbVRwRm83aQJp04DMX3FOG1UbX3NJLU12UAVTA1owLEh0R3ULKQ=="
            java.lang.String r4 = "BQMz1j8K"
            java.lang.String r3 = ea.a.p(r3, r4)     // Catch: java.lang.Exception -> Laf
            kotlin.jvm.internal.g.d(r0, r3)     // Catch: java.lang.Exception -> Laf
            int r3 = r0.getHeight()     // Catch: java.lang.Exception -> Laf
            int r4 = r0.getWidth()     // Catch: java.lang.Exception -> Laf
            int r5 = r3 * 3
            int r5 = r5 * r4
            java.nio.FloatBuffer r5 = java.nio.FloatBuffer.allocate(r5)     // Catch: java.lang.Exception -> Laf
            r6 = r2
        L50:
            r7 = 3
            if (r6 >= r7) goto L7d
            r7 = r2
        L54:
            if (r7 >= r3) goto L7a
            r8 = r2
        L57:
            if (r8 >= r4) goto L77
            int r9 = r0.getPixel(r8, r7)     // Catch: java.lang.Exception -> Laf
            if (r6 == 0) goto L6b
            if (r6 == r1) goto L69
            r10 = 2
            if (r6 == r10) goto L66
            r9 = 0
            goto L71
        L66:
            int r9 = r9 >> 16
            goto L6b
        L69:
            int r9 = r9 >> 8
        L6b:
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9     // Catch: java.lang.Exception -> Laf
            r10 = 1132396544(0x437f0000, float:255.0)
            float r9 = r9 / r10
        L71:
            r5.put(r9)     // Catch: java.lang.Exception -> Laf
            int r8 = r8 + 1
            goto L57
        L77:
            int r7 = r7 + 1
            goto L54
        L7a:
            int r6 = r6 + 1
            goto L50
        L7d:
            r5.rewind()     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = "VWwkYQdCF2YUZXI="
            java.lang.String r3 = "s0YhQc29"
            ea.a.p(r1, r3)     // Catch: java.lang.Exception -> Laf
            r1 = 49152(0xc000, float:6.8877E-41)
            java.nio.FloatBuffer r1 = java.nio.FloatBuffer.allocate(r1)     // Catch: java.lang.Exception -> Laf
            r1.order()     // Catch: java.lang.Exception -> Laf
            org.tensorflow.lite.b r3 = r11.f21780a     // Catch: java.lang.Exception -> Laf
            if (r3 == 0) goto L98
            r3.b(r5, r1)     // Catch: java.lang.Exception -> Laf
        L98:
            boolean r3 = r12.isRecycled()     // Catch: java.lang.Exception -> Laf
            if (r3 != 0) goto La1
            r12.recycle()     // Catch: java.lang.Exception -> Laf
        La1:
            boolean r12 = r0.isRecycled()     // Catch: java.lang.Exception -> Laf
            if (r12 != 0) goto Laa
            r0.recycle()     // Catch: java.lang.Exception -> Laf
        Laa:
            float r12 = r1.get(r2)     // Catch: java.lang.Exception -> Laf
            return r12
        Laf:
            r12 = move-exception
            r12.printStackTrace()
            r12 = 1065353216(0x3f800000, float:1.0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.a.a(java.lang.String):float");
    }
}
