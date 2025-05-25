package com.google.android.gms.dynamite;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzb {

    /* renamed from: a  reason: collision with root package name */
    public static ClassLoader f11426a;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f11427b;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader a() {
        /*
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.f11426a     // Catch: java.lang.Throwable -> La5
            if (r1 != 0) goto La1
            java.lang.Thread r1 = com.google.android.gms.dynamite.zzb.f11427b     // Catch: java.lang.Throwable -> La5
            r2 = 0
            if (r1 != 0) goto L8d
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> La5
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> La5
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> La5
            if (r1 != 0) goto L1d
            r1 = r2
            goto L86
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> La5
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            r6 = 0
            r7 = r6
        L2b:
            if (r7 >= r4) goto L3f
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            if (r9 == 0) goto L3c
            goto L40
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r8 = r2
        L40:
            if (r8 != 0) goto L49
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
        L49:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
        L52:
            if (r6 >= r1) goto L66
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L7c java.lang.SecurityException -> L7e
            if (r7 == 0) goto L63
            goto L67
        L63:
            int r6 = r6 + 1
            goto L52
        L66:
            r5 = r2
        L67:
            if (r5 != 0) goto L84
            x7.c r1 = new x7.c     // Catch: java.lang.SecurityException -> L79 java.lang.Throwable -> L7c
            r1.<init>(r8)     // Catch: java.lang.SecurityException -> L79 java.lang.Throwable -> L7c
            r1.setContextClassLoader(r2)     // Catch: java.lang.SecurityException -> L76 java.lang.Throwable -> L7c
            r1.start()     // Catch: java.lang.SecurityException -> L76 java.lang.Throwable -> L7c
            r5 = r1
            goto L84
        L76:
            r4 = move-exception
            r5 = r1
            goto L81
        L79:
            r1 = move-exception
            r4 = r1
            goto L81
        L7c:
            r1 = move-exception
            goto L8b
        L7e:
            r1 = move-exception
            r4 = r1
            r5 = r2
        L81:
            r4.getMessage()     // Catch: java.lang.Throwable -> L7c
        L84:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            r1 = r5
        L86:
            com.google.android.gms.dynamite.zzb.f11427b = r1     // Catch: java.lang.Throwable -> La5
            if (r1 != 0) goto L8d
            goto L9c
        L8b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            throw r1     // Catch: java.lang.Throwable -> La5
        L8d:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.Thread r3 = com.google.android.gms.dynamite.zzb.f11427b     // Catch: java.lang.Throwable -> L95 java.lang.SecurityException -> L97
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> L95 java.lang.SecurityException -> L97
            goto L9b
        L95:
            r2 = move-exception
            goto L9f
        L97:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L95
        L9b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
        L9c:
            com.google.android.gms.dynamite.zzb.f11426a = r2     // Catch: java.lang.Throwable -> La5
            goto La1
        L9f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
            throw r2     // Catch: java.lang.Throwable -> La5
        La1:
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.f11426a     // Catch: java.lang.Throwable -> La5
            monitor-exit(r0)
            return r1
        La5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.zzb.a():java.lang.ClassLoader");
    }
}
