package e1;

import android.content.Context;
import android.net.Uri;

/* compiled from: SingleDocumentFile.java */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16332a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f16333b;

    public b(Context context, Uri uri) {
        this.f16332a = context;
        this.f16333b = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r8 = this;
            android.net.Uri r1 = r8.f16333b
            java.lang.String r0 = "_display_name"
            android.content.Context r2 = r8.f16332a
            android.content.ContentResolver r2 = r2.getContentResolver()
            r6 = 0
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r4 = 0
            r5 = 0
            r7 = 0
            r0 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            if (r1 == 0) goto L3a
            r1 = 0
            boolean r2 = r0.isNull(r1)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            if (r2 != 0) goto L3a
            java.lang.String r6 = r0.getString(r1)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            goto L3a
        L2d:
            r1 = move-exception
            r6 = r0
            goto L43
        L30:
            r1 = move-exception
            goto L37
        L32:
            r0 = move-exception
            goto L44
        L34:
            r0 = move-exception
            r1 = r0
            r0 = r6
        L37:
            r1.toString()     // Catch: java.lang.Throwable -> L2d
        L3a:
            if (r0 == 0) goto L42
            r0.close()     // Catch: java.lang.RuntimeException -> L40 java.lang.Exception -> L42
            goto L42
        L40:
            r0 = move-exception
            throw r0
        L42:
            return r6
        L43:
            r0 = r1
        L44:
            if (r6 == 0) goto L4c
            r6.close()     // Catch: java.lang.RuntimeException -> L4a java.lang.Exception -> L4c
            goto L4c
        L4a:
            r0 = move-exception
            throw r0
        L4c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b.a():java.lang.String");
    }
}
