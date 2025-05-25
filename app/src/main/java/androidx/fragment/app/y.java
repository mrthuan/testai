package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y.i<ClassLoader, y.i<String, Class<?>>> f3960a = new y.i<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        y.i<ClassLoader, y.i<String, Class<?>>> iVar = f3960a;
        y.i<String, Class<?>> orDefault = iVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new y.i<>();
            iVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            orDefault.put(str, cls);
            return cls;
        }
        return orDefault2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.InstantiationException(a6.h.d("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException(a6.h.d("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public Fragment a(String str) {
        throw null;
    }
}
