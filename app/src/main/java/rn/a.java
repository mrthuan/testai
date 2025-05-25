package rn;

/* compiled from: PhotoUtils.java */
/* loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r7 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r7 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r7, android.net.Uri r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            java.lang.String r0 = "i7HrcW5v"
            java.lang.String r1 = "bGQqdGE="
            ea.a.p(r1, r0)
            java.lang.String r0 = "5D5nmzkt"
            java.lang.String r0 = ea.a.p(r1, r0)
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r6 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            if (r7 == 0) goto L3c
            boolean r8 = r7.moveToFirst()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L4c
            if (r8 == 0) goto L3c
            java.lang.String r8 = "N2QjdGE="
            java.lang.String r9 = "NBhBbeF7"
            java.lang.String r8 = ea.a.p(r8, r9)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L4c
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L4c
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L4c
            r7.close()
            return r8
        L3a:
            r8 = move-exception
            goto L43
        L3c:
            if (r7 == 0) goto L4b
            goto L48
        L3f:
            r8 = move-exception
            goto L4e
        L41:
            r8 = move-exception
            r7 = r0
        L43:
            r8.printStackTrace()     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto L4b
        L48:
            r7.close()
        L4b:
            return r0
        L4c:
            r8 = move-exception
            r0 = r7
        L4e:
            if (r0 == 0) goto L53
            r0.close()
        L53:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.a.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r10, android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.a.b(android.content.Context, android.net.Uri):java.lang.String");
    }
}
