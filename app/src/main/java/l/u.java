package l;

import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* compiled from: ResourcesFlusher.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static Field f20375a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f20376b;
    public static Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f20377d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f20378e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f20379f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f20380g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f20381h;

    /* compiled from: ResourcesFlusher.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f20377d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f20377d = true;
        }
        Class<?> cls = c;
        if (cls == null) {
            return;
        }
        if (!f20379f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f20378e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f20379f = true;
        }
        Field field = f20378e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
