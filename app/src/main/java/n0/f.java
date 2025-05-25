package n0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n0.d;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f22291a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f22292b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f22293a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f22294b;
        public final int c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.f22293a = colorStateList;
            this.f22294b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.c = hashCode;
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f22295a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f22296b;

        public d(Resources resources, Resources.Theme theme) {
            this.f22295a = resources;
            this.f22296b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f22295a.equals(dVar.f22295a) && w0.b.a(this.f22296b, dVar.f22296b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return w0.b.b(this.f22295a, this.f22296b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public final void a(int i10) {
            new Handler(Looper.getMainLooper()).post(new h(this, i10, 0));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new g(0, this, typeface));
        }

        public abstract void c(int i10);

        public abstract void d(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: n0.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0297f {

        /* compiled from: ResourcesCompat.java */
        /* renamed from: n0.f$f$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final Object f22297a = new Object();

            /* renamed from: b  reason: collision with root package name */
            public static Method f22298b;
            public static boolean c;
        }

        /* compiled from: ResourcesCompat.java */
        /* renamed from: n0.f$f$b */
        /* loaded from: classes.dex */
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
                return;
            }
            synchronized (a.f22297a) {
                if (!a.c) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        a.f22298b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    a.c = true;
                }
                Method method = a.f22298b;
                if (method != null) {
                    try {
                        method.invoke(theme, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        a.f22298b = null;
                    }
                }
            }
        }
    }

    public static void a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f22292b;
            SparseArray<c> sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i10, new c(colorStateList, dVar.f22295a.getConfiguration(), theme));
        }
    }

    public static Typeface b(Context context, int i10, TypedValue typedValue, int i11, e eVar, boolean z10, boolean z11) {
        Typeface typeface;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                if (eVar != null) {
                    eVar.a(-3);
                }
            } else {
                int i12 = typedValue.assetCookie;
                y.g<String, Typeface> gVar = o0.e.f22646b;
                typeface = gVar.get(o0.e.b(resources, i10, charSequence2, i12, i11));
                if (typeface != null) {
                    if (eVar != null) {
                        eVar.b(typeface);
                    }
                } else if (!z11) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            d.b a10 = n0.d.a(resources.getXml(i10), resources);
                            if (a10 == null) {
                                if (eVar != null) {
                                    eVar.a(-3);
                                }
                            } else {
                                typeface = o0.e.a(context, a10, resources, i10, charSequence2, typedValue.assetCookie, i11, eVar, z10);
                            }
                        } else {
                            int i13 = typedValue.assetCookie;
                            typeface = o0.e.f22645a.d(context, resources, i10, charSequence2, i11);
                            if (typeface != null) {
                                gVar.put(o0.e.b(resources, i10, charSequence2, i13, i11), typeface);
                            }
                            if (eVar != null) {
                                if (typeface != null) {
                                    eVar.b(typeface);
                                } else {
                                    eVar.a(-3);
                                }
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        if (eVar != null) {
                            eVar.a(-3);
                        }
                    }
                }
                if (typeface != null && eVar == null && !z11) {
                    throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
                }
                return typeface;
            }
            typeface = null;
            if (typeface != null) {
            }
            return typeface;
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
    }
}
