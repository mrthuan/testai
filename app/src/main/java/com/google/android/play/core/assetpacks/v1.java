package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class v1 {
    public static final q9.y c = new q9.y("PackMetadataManager");

    /* renamed from: a  reason: collision with root package name */
    public final d0 f13412a;

    /* renamed from: b  reason: collision with root package name */
    public final w1 f13413b;

    public v1(d0 d0Var, w1 w1Var) {
        this.f13412a = d0Var;
        this.f13413b = w1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r10) {
        /*
            r9 = this;
            com.google.android.play.core.assetpacks.d0 r0 = r9.f13412a
            r0.getClass()
            r1 = 1
            r2 = 0
            java.lang.String r3 = r0.o(r10)     // Catch: java.io.IOException -> Lf
            if (r3 == 0) goto Lf
            r3 = r1
            goto L10
        Lf:
            r3 = r2
        L10:
            java.lang.String r4 = ""
            if (r3 != 0) goto L15
            return r4
        L15:
            com.google.android.play.core.assetpacks.w1 r3 = r9.f13413b
            int r3 = r3.a()
            long r5 = r0.j(r10)
            java.io.File r7 = new java.io.File
            java.io.File r8 = new java.io.File
            java.io.File r0 = r0.l(r3, r5, r10)
            java.lang.String r5 = "_metadata"
            r8.<init>(r0, r5)
            java.lang.String r0 = "properties.dat"
            r7.<init>(r8, r0)
            boolean r0 = r7.exists()     // Catch: java.io.IOException -> L65
            if (r0 != 0) goto L3c
            java.lang.String r10 = java.lang.String.valueOf(r3)     // Catch: java.io.IOException -> L65
            goto L5a
        L3c:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L65
            r0.<init>(r7)     // Catch: java.io.IOException -> L65
            java.util.Properties r5 = new java.util.Properties     // Catch: java.lang.Throwable -> L5b
            r5.<init>()     // Catch: java.lang.Throwable -> L5b
            r5.load(r0)     // Catch: java.lang.Throwable -> L5b
            r0.close()     // Catch: java.io.IOException -> L65
            java.lang.String r0 = "moduleVersionTag"
            java.lang.String r0 = r5.getProperty(r0)     // Catch: java.io.IOException -> L65
            if (r0 != 0) goto L59
            java.lang.String r10 = java.lang.String.valueOf(r3)     // Catch: java.io.IOException -> L65
            goto L5a
        L59:
            r10 = r0
        L5a:
            return r10
        L5b:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L60
            goto L64
        L60:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.io.IOException -> L65
        L64:
            throw r3     // Catch: java.io.IOException -> L65
        L65:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r10
            java.lang.String r10 = "Failed to read pack version tag for pack %s"
            q9.y r1 = com.google.android.play.core.assetpacks.v1.c
            r1.b(r10, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.v1.a(java.lang.String):java.lang.String");
    }

    public final void b(int i10, String str, String str2, long j10) {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i10);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        d0 d0Var = this.f13412a;
        d0Var.getClass();
        File file = new File(new File(d0Var.l(i10, j10, str), "_metadata"), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
