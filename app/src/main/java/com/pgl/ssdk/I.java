package com.pgl.ssdk;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: JavaCalls.java */
/* loaded from: classes2.dex */
public class I {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f15774a;

    /* compiled from: JavaCalls.java */
    /* loaded from: classes2.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends T> f15775a;

        /* renamed from: b  reason: collision with root package name */
        public final T f15776b;
    }

    static {
        HashMap hashMap = new HashMap();
        f15774a = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(Boolean.class, cls);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        hashMap.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        hashMap.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        hashMap.put(Long.class, cls4);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(cls, cls);
        Class cls5 = Byte.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        hashMap.put(cls7, cls7);
        hashMap.put(cls2, cls2);
        hashMap.put(cls3, cls3);
        hashMap.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    public static void a(String str, String str2, Object... objArr) {
        try {
            a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r13.length != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
        if (r6.length == 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Method a(java.lang.Class<?> r11, java.lang.String r12, java.lang.Class... r13) {
        /*
            java.lang.reflect.Method[] r0 = r11.getDeclaredMethods()
            if (r12 == 0) goto L82
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L9:
            r4 = 1
            if (r3 >= r1) goto L66
            r5 = r0[r3]
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L63
            java.lang.Class[] r6 = r5.getParameterTypes()
            if (r6 != 0) goto L24
            if (r13 == 0) goto L5e
            int r6 = r13.length
            if (r6 != 0) goto L60
            goto L5e
        L24:
            if (r13 != 0) goto L2a
            int r6 = r6.length
            if (r6 != 0) goto L60
            goto L5e
        L2a:
            int r7 = r6.length
            int r8 = r13.length
            if (r7 != r8) goto L60
            r7 = r2
        L2f:
            int r8 = r6.length
            if (r7 >= r8) goto L5e
            r8 = r6[r7]
            r9 = r13[r7]
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 != 0) goto L5b
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r8 = com.pgl.ssdk.I.f15774a
            r9 = r6[r7]
            boolean r9 = r8.containsKey(r9)
            if (r9 == 0) goto L60
            r9 = r6[r7]
            java.lang.Object r9 = r8.get(r9)
            java.lang.Class r9 = (java.lang.Class) r9
            r10 = r13[r7]
            java.lang.Object r8 = r8.get(r10)
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L5b
            goto L60
        L5b:
            int r7 = r7 + 1
            goto L2f
        L5e:
            r6 = r4
            goto L61
        L60:
            r6 = r2
        L61:
            if (r6 != 0) goto L67
        L63:
            int r3 = r3 + 1
            goto L9
        L66:
            r5 = 0
        L67:
            if (r5 != 0) goto L7e
            java.lang.Class r0 = r11.getSuperclass()
            if (r0 == 0) goto L78
            java.lang.Class r11 = r11.getSuperclass()
            java.lang.reflect.Method r11 = a(r11, r12, r13)
            return r11
        L78:
            java.lang.NoSuchMethodException r11 = new java.lang.NoSuchMethodException
            r11.<init>()
            throw r11
        L7e:
            r5.setAccessible(r4)
            return r5
        L82:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "Method name must not be null."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.I.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public static void a(Class<?> cls, String str, Object... objArr) {
        Class[] clsArr;
        Object[] objArr2;
        if (objArr == null || objArr.length <= 0) {
            clsArr = null;
        } else {
            clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj = objArr[i10];
                if (obj != null && (obj instanceof a)) {
                    clsArr[i10] = ((a) obj).f15775a;
                } else {
                    clsArr[i10] = obj == null ? null : obj.getClass();
                }
            }
        }
        Method a10 = a(cls, str, clsArr);
        if (objArr == null || objArr.length <= 0) {
            objArr2 = null;
        } else {
            objArr2 = new Object[objArr.length];
            for (int i11 = 0; i11 < objArr.length; i11++) {
                Object obj2 = objArr[i11];
                if (obj2 != null && (obj2 instanceof a)) {
                    objArr2[i11] = ((a) obj2).f15776b;
                } else {
                    objArr2[i11] = obj2;
                }
            }
        }
        a10.invoke(null, objArr2);
    }
}
