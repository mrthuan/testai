package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DrawableUtils.java */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2488a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2489b = new int[0];
    public static final Rect c = new Rect();

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f2490a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f2491b;
        public static final Field c;

        /* renamed from: d  reason: collision with root package name */
        public static final Field f2492d;

        /* renamed from: e  reason: collision with root package name */
        public static final Field f2493e;

        /* renamed from: f  reason: collision with root package name */
        public static final Field f2494f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = r0
                goto L49
            L2d:
                r7 = r1
                goto L47
            L2f:
                r6 = r1
                goto L46
            L31:
                r6 = r1
                goto L46
            L33:
                r6 = r1
                goto L46
            L35:
                r5 = r1
                goto L3d
            L37:
                r5 = r1
                goto L41
            L39:
                r5 = r1
                goto L45
            L3b:
                r4 = r1
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r1
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r1
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r3 = r1
                r8 = r2
            L49:
                if (r8 == 0) goto L58
                androidx.appcompat.widget.a0.a.f2491b = r4
                androidx.appcompat.widget.a0.a.c = r5
                androidx.appcompat.widget.a0.a.f2492d = r6
                androidx.appcompat.widget.a0.a.f2493e = r7
                androidx.appcompat.widget.a0.a.f2494f = r3
                androidx.appcompat.widget.a0.a.f2490a = r0
                goto L64
            L58:
                androidx.appcompat.widget.a0.a.f2491b = r1
                androidx.appcompat.widget.a0.a.c = r1
                androidx.appcompat.widget.a0.a.f2492d = r1
                androidx.appcompat.widget.a0.a.f2493e = r1
                androidx.appcompat.widget.a0.a.f2494f = r1
                androidx.appcompat.widget.a0.a.f2490a = r2
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.a.<clinit>():void");
        }
    }

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && i10 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f2489b);
            } else {
                drawable.setState(f2488a);
            }
            drawable.setState(state);
        }
    }

    public static Rect b(Drawable drawable) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            Insets a10 = b.a(drawable);
            i10 = a10.left;
            i11 = a10.top;
            i12 = a10.right;
            i13 = a10.bottom;
            return new Rect(i10, i11, i12, i13);
        }
        Drawable d10 = p0.a.d(drawable);
        if (i14 < 29) {
            if (a.f2490a) {
                try {
                    Object invoke = a.f2491b.invoke(d10, new Object[0]);
                    if (invoke != null) {
                        return new Rect(a.c.getInt(invoke), a.f2492d.getInt(invoke), a.f2493e.getInt(invoke), a.f2494f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z10 = a.f2490a;
        }
        return c;
    }

    public static PorterDuff.Mode c(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
