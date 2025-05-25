package com.pgl.ssdk;

import java.lang.reflect.Method;

/* compiled from: ReflectionUtil.java */
/* loaded from: classes2.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    private static Method f15777a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f15778b;
    private static Method c;

    static {
        try {
            f15777a = Class.class.getDeclaredMethod("forName", String.class);
            f15778b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[Catch: all -> 0x0024, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:12:0x001d), top: B:17:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.Object r3, java.lang.Class r4, java.lang.String r5, java.lang.Object r6) {
        /*
            r3 = 0
            boolean r6 = a()     // Catch: java.lang.Throwable -> L24
            r0 = 1
            if (r6 == 0) goto L19
            java.lang.reflect.Method r6 = com.pgl.ssdk.J.c     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L19
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r6.invoke(r4, r1)     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L19
            r4.setAccessible(r0)     // Catch: java.lang.Throwable -> L1a
            goto L1a
        L19:
            r4 = r3
        L1a:
            if (r4 != 0) goto L1d
            return r3
        L1d:
            r4.setAccessible(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L24
        L24:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.J.a(java.lang.Object, java.lang.Class, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:3:0x0001, B:10:0x001f), top: B:15:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.Object r4, java.lang.Class r5, java.lang.String r6, java.lang.Class[] r7, java.lang.Object... r8) {
        /*
            r0 = 0
            boolean r1 = a()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L1c
            java.lang.reflect.Method r1 = com.pgl.ssdk.J.f15778b     // Catch: java.lang.Throwable -> L1c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            r2[r3] = r6     // Catch: java.lang.Throwable -> L1c
            r6 = 1
            r2[r6] = r7     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r5 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L1c
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L1d
            goto L1d
        L1c:
            r5 = r0
        L1d:
            if (r5 == 0) goto L23
            java.lang.Object r0 = r5.invoke(r4, r8)     // Catch: java.lang.Throwable -> L23
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.J.a(java.lang.Object, java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.Object");
    }

    private static boolean a() {
        return (f15777a == null || f15778b == null || c == null) ? false : true;
    }
}
