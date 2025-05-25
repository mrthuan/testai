package yf;

import java.lang.reflect.Method;
import kotlin.jvm.internal.g;

/* compiled from: PlatformImplementations.kt */
/* loaded from: classes.dex */
public class a {

    /* compiled from: PlatformImplementations.kt */
    /* renamed from: yf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0420a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f32139a;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
            if (kotlin.jvm.internal.g.a(r5, java.lang.Throwable.class) != false) goto L11;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.g.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Le:
                r5 = 0
                if (r4 >= r2) goto L3d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.g.a(r7, r8)
                if (r7 == 0) goto L35
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.g.d(r7, r8)
                int r8 = r7.length
                r9 = 1
                if (r8 != r9) goto L2e
                r5 = r7[r3]
            L2e:
                boolean r5 = kotlin.jvm.internal.g.a(r5, r0)
                if (r5 == 0) goto L35
                goto L36
            L35:
                r9 = r3
            L36:
                if (r9 == 0) goto L3a
                r5 = r6
                goto L3d
            L3a:
                int r4 = r4 + 1
                goto Le
            L3d:
                yf.a.C0420a.f32139a = r5
                int r0 = r1.length
            L40:
                if (r3 >= r0) goto L54
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = kotlin.jvm.internal.g.a(r2, r4)
                if (r2 == 0) goto L51
                goto L54
            L51:
                int r3 = r3 + 1
                goto L40
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yf.a.C0420a.<clinit>():void");
        }
    }

    public void a(Throwable cause, Throwable exception) {
        g.e(cause, "cause");
        g.e(exception, "exception");
        Method method = C0420a.f32139a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
