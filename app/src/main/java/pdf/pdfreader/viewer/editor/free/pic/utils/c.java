package pdf.pdfreader.viewer.editor.free.pic.utils;

/* compiled from: PicUtil.kt */
/* loaded from: classes3.dex */
public final class c {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
        if (r11 != 8) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Size a(android.content.Context r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g.e(r11, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g.e(r12, r0)
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Lbd
            r1 = 1
            r0 = r0 ^ r1
            r2 = 270(0x10e, float:3.78E-43)
            r3 = 8
            r4 = 7
            r5 = 6
            r6 = 90
            r7 = 5
            r8 = 3
            r9 = 180(0xb4, float:2.52E-43)
            r10 = 0
            if (r0 == 0) goto L74
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> Lbd
            r0 = 0
            if (r11 == 0) goto L34
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch: java.lang.Throwable -> Lbd
            java.io.InputStream r11 = r11.openInputStream(r12)     // Catch: java.lang.Throwable -> Lbd
            goto L35
        L34:
            r11 = r0
        L35:
            kotlin.jvm.internal.g.b(r11)     // Catch: java.lang.Throwable -> Lbd
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> Lbd
            r12.<init>()     // Catch: java.lang.Throwable -> Lbd
            r12.inJustDecodeBounds = r1     // Catch: java.lang.Throwable -> Lbd
            android.graphics.BitmapFactory.decodeStream(r11, r0, r12)     // Catch: java.lang.Throwable -> Lbd
            r12.inJustDecodeBounds = r10     // Catch: java.lang.Throwable -> Lbd
            android.util.Size r0 = new android.util.Size     // Catch: java.lang.Throwable -> Lbd
            int r1 = r12.outWidth     // Catch: java.lang.Throwable -> Lbd
            int r12 = r12.outHeight     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r1, r12)     // Catch: java.lang.Throwable -> Lbd
            j1.a r12 = new j1.a     // Catch: java.lang.Throwable -> Lbd
            r12.<init>(r11)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r11 = "fHIiZR10A3Qbb24="
            java.lang.String r1 = "tyFxmQaT"
            java.lang.String r11 = ea.a.p(r11, r1)     // Catch: java.lang.Throwable -> Lbd
            int r11 = r12.i(r10, r11)     // Catch: java.lang.Throwable -> Lbd
            pdf.pdfreader.viewer.editor.free.pic.utils.b r12 = pdf.pdfreader.viewer.editor.free.pic.utils.b.f26457a     // Catch: java.lang.Throwable -> Lbd
            r12.getClass()     // Catch: java.lang.Throwable -> Lbd
            if (r11 == r8) goto L72
            if (r11 == r7) goto L70
            if (r11 == r5) goto L70
            if (r11 == r4) goto L70
            if (r11 == r3) goto Laa
        L6e:
            r2 = r10
            goto Laa
        L70:
            r2 = r6
            goto Laa
        L72:
            r2 = r9
            goto Laa
        L74:
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> Lbd
            r11.<init>()     // Catch: java.lang.Throwable -> Lbd
            r11.inJustDecodeBounds = r1     // Catch: java.lang.Throwable -> Lbd
            android.graphics.BitmapFactory.decodeFile(r12, r11)     // Catch: java.lang.Throwable -> Lbd
            r11.inJustDecodeBounds = r10     // Catch: java.lang.Throwable -> Lbd
            android.util.Size r0 = new android.util.Size     // Catch: java.lang.Throwable -> Lbd
            int r1 = r11.outWidth     // Catch: java.lang.Throwable -> Lbd
            int r11 = r11.outHeight     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r1, r11)     // Catch: java.lang.Throwable -> Lbd
            j1.a r11 = new j1.a     // Catch: java.lang.Throwable -> Lbd
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r12 = "NXI7ZSV0VnQhb24="
            java.lang.String r1 = "QjzRK7ur"
            java.lang.String r12 = ea.a.p(r12, r1)     // Catch: java.lang.Throwable -> Lbd
            int r11 = r11.i(r10, r12)     // Catch: java.lang.Throwable -> Lbd
            pdf.pdfreader.viewer.editor.free.pic.utils.b r12 = pdf.pdfreader.viewer.editor.free.pic.utils.b.f26457a     // Catch: java.lang.Throwable -> Lbd
            r12.getClass()     // Catch: java.lang.Throwable -> Lbd
            if (r11 == r8) goto L72
            if (r11 == r7) goto L70
            if (r11 == r5) goto L70
            if (r11 == r4) goto L70
            if (r11 == r3) goto Laa
            goto L6e
        Laa:
            if (r2 == 0) goto Lbc
            if (r2 == r9) goto Lbc
            android.util.Size r11 = new android.util.Size     // Catch: java.lang.Throwable -> Lbd
            int r12 = r0.getHeight()     // Catch: java.lang.Throwable -> Lbd
            int r0 = r0.getWidth()     // Catch: java.lang.Throwable -> Lbd
            r11.<init>(r12, r0)     // Catch: java.lang.Throwable -> Lbd
            r0 = r11
        Lbc:
            return r0
        Lbd:
            android.util.Size r11 = new android.util.Size
            r12 = 512(0x200, float:7.17E-43)
            r11.<init>(r12, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pic.utils.c.a(android.content.Context, java.lang.String):android.util.Size");
    }
}
