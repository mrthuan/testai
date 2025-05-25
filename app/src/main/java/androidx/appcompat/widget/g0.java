package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: i  reason: collision with root package name */
    public static g0 f2585i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, y.j<ColorStateList>> f2587a;

    /* renamed from: b  reason: collision with root package name */
    public y.i<String, e> f2588b;
    public y.j<String> c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, y.f<WeakReference<Drawable.ConstantState>>> f2589d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f2590e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2591f;

    /* renamed from: g  reason: collision with root package name */
    public f f2592g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f2584h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final c f2586j = new c();

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // androidx.appcompat.widget.g0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return n.a.g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // androidx.appcompat.widget.g0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                g2.d dVar = new g2.d(context);
                dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return dVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class c extends y.g<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // androidx.appcompat.widget.g0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    o.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface f {
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // androidx.appcompat.widget.g0.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                g2.i iVar = new g2.i();
                iVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return iVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static synchronized g0 d() {
        g0 g0Var;
        synchronized (g0.class) {
            if (f2585i == null) {
                g0 g0Var2 = new g0();
                f2585i = g0Var2;
                j(g0Var2);
            }
            g0Var = f2585i;
        }
        return g0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (g0.class) {
            c cVar = f2586j;
            cVar.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = cVar.get(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                cVar.getClass();
                cVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(g0 g0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            g0Var.a("vector", new g());
            g0Var.a("animated-vector", new b());
            g0Var.a("animated-selector", new a());
            g0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f2588b == null) {
            this.f2588b = new y.i<>();
        }
        this.f2588b.put(str, eVar);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            y.f<WeakReference<Drawable.ConstantState>> fVar = this.f2589d.get(context);
            if (fVar == null) {
                fVar = new y.f<>();
                this.f2589d.put(context, fVar);
            }
            fVar.h(j10, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable c(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.util.TypedValue r0 = r7.f2590e
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.f2590e = r0
        Lb:
            android.util.TypedValue r0 = r7.f2590e
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.e(r8, r3)
            if (r1 == 0) goto L26
            return r1
        L26:
            androidx.appcompat.widget.g0$f r1 = r7.f2592g
            if (r1 != 0) goto L2b
            goto L73
        L2b:
            r1 = 2131230921(0x7f0800c9, float:1.8077908E38)
            if (r9 != r1) goto L4c
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r5 = 2131230920(0x7f0800c8, float:1.8077906E38)
            android.graphics.drawable.Drawable r5 = r7.f(r8, r5)
            r6 = 0
            r1[r6] = r5
            r5 = 2131230922(0x7f0800ca, float:1.807791E38)
            android.graphics.drawable.Drawable r5 = r7.f(r8, r5)
            r1[r2] = r5
            r9.<init>(r1)
            goto L74
        L4c:
            r1 = 2131230956(0x7f0800ec, float:1.807798E38)
            if (r9 != r1) goto L59
            r9 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.h.a.c(r7, r8, r9)
            goto L74
        L59:
            r1 = 2131230955(0x7f0800eb, float:1.8077977E38)
            if (r9 != r1) goto L66
            r9 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.h.a.c(r7, r8, r9)
            goto L74
        L66:
            r1 = 2131230957(0x7f0800ed, float:1.8077981E38)
            if (r9 != r1) goto L73
            r9 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.h.a.c(r7, r8, r9)
            goto L74
        L73:
            r9 = 0
        L74:
            if (r9 == 0) goto L7e
            int r0 = r0.changingConfigurations
            r9.setChangingConfigurations(r0)
            r7.b(r8, r3, r9)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.c(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(Context context, long j10) {
        y.f<WeakReference<Drawable.ConstantState>> fVar = this.f2589d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) fVar.f(j10, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.i(j10);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, false, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010b, code lost:
        p0.a.b.i(r13, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:58:0x00e2, B:60:0x00e8, B:62:0x00ee, B:64:0x00f4, B:71:0x010b, B:69:0x0107, B:73:0x0111, B:77:0x0128, B:84:0x015e, B:88:0x0188, B:95:0x0195, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d9, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:98:0x019a, B:99:0x01a3), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:58:0x00e2, B:60:0x00e8, B:62:0x00ee, B:64:0x00f4, B:71:0x010b, B:69:0x0107, B:73:0x0111, B:77:0x0128, B:84:0x015e, B:88:0x0188, B:95:0x0195, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d9, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:98:0x019a, B:99:0x01a3), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:58:0x00e2, B:60:0x00e8, B:62:0x00ee, B:64:0x00f4, B:71:0x010b, B:69:0x0107, B:73:0x0111, B:77:0x0128, B:84:0x015e, B:88:0x0188, B:95:0x0195, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d9, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:98:0x019a, B:99:0x01a3), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0195 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:58:0x00e2, B:60:0x00e8, B:62:0x00ee, B:64:0x00f4, B:71:0x010b, B:69:0x0107, B:73:0x0111, B:77:0x0128, B:84:0x015e, B:88:0x0188, B:95:0x0195, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d9, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:98:0x019a, B:99:0x01a3), top: B:104:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.g(android.content.Context, boolean, int):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        y.j<ColorStateList> jVar;
        try {
            WeakHashMap<Context, y.j<ColorStateList>> weakHashMap = this.f2587a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (jVar = weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) jVar.d(i10, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                f fVar = this.f2592g;
                if (fVar != null) {
                    colorStateList2 = ((h.a) fVar).d(context, i10);
                }
                if (colorStateList2 != null) {
                    if (this.f2587a == null) {
                        this.f2587a = new WeakHashMap<>();
                    }
                    y.j<ColorStateList> jVar2 = this.f2587a.get(context);
                    if (jVar2 == null) {
                        jVar2 = new y.j<>();
                        this.f2587a.put(context, jVar2);
                    }
                    jVar2.a(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        y.f<WeakReference<Drawable.ConstantState>> fVar = this.f2589d.get(context);
        if (fVar != null) {
            fVar.c();
        }
    }

    public final synchronized void l(h.a aVar) {
        this.f2592g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.g0$f r0 = r6.f2592g
            r1 = 0
            if (r0 == 0) goto L70
            androidx.appcompat.widget.h$a r0 = (androidx.appcompat.widget.h.a) r0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.h.f2593b
            int[] r3 = r0.f2595a
            boolean r3 = androidx.appcompat.widget.h.a.a(r8, r3)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130968864(0x7f040120, float:1.7546394E38)
            goto L4a
        L17:
            int[] r3 = r0.c
            boolean r3 = androidx.appcompat.widget.h.a.a(r8, r3)
            if (r3 == 0) goto L23
            r8 = 2130968862(0x7f04011e, float:1.754639E38)
            goto L4a
        L23:
            int[] r0 = r0.f2597d
            boolean r0 = androidx.appcompat.widget.h.a.a(r8, r0)
            if (r0 == 0) goto L2e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L47
        L2e:
            r0 = 2131230942(0x7f0800de, float:1.807795E38)
            if (r8 != r0) goto L42
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L52
        L42:
            r0 = 2131230924(0x7f0800cc, float:1.8077915E38)
            if (r8 != r0) goto L4d
        L47:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L4a:
            r0 = r8
            r8 = r4
            goto L4f
        L4d:
            r8 = r1
            r0 = r8
        L4f:
            r3 = r2
            r2 = r0
            r0 = r5
        L52:
            if (r8 == 0) goto L6c
            int[] r8 = androidx.appcompat.widget.a0.f2488a
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = androidx.appcompat.widget.p0.c(r7, r2)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.h.c(r7, r3)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L6a
            r8.setAlpha(r0)
        L6a:
            r7 = r4
            goto L6d
        L6c:
            r7 = r1
        L6d:
            if (r7 == 0) goto L70
            r1 = r4
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
