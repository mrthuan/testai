package h2;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: VersionedParcel.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final y.b<String, Method> f17950a;

    /* renamed from: b  reason: collision with root package name */
    public final y.b<String, Method> f17951b;
    public final y.b<String, Class> c;

    public a(y.b<String, Method> bVar, y.b<String, Method> bVar2, y.b<String, Class> bVar3) {
        this.f17950a = bVar;
        this.f17951b = bVar2;
        this.c = bVar3;
    }

    public abstract b a();

    public final Class b(Class<? extends c> cls) {
        String name = cls.getName();
        y.b<String, Class> bVar = this.c;
        Class orDefault = bVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            bVar.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method c(String str) {
        y.b<String, Method> bVar = this.f17950a;
        Method orDefault = bVar.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            bVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        y.b<String, Method> bVar = this.f17951b;
        Method orDefault = bVar.getOrDefault(name, null);
        if (orDefault == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, a.class);
            bVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i10);

    public abstract int i();

    public final int j(int i10, int i11) {
        if (!h(i11)) {
            return i10;
        }
        return i();
    }

    public abstract <T extends Parcelable> T k();

    public abstract String l();

    public final <T extends c> T m() {
        String l10 = l();
        if (l10 == null) {
            return null;
        }
        try {
            return (T) c(l10).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void n(int i10);

    public abstract void o(boolean z10);

    public abstract void p(byte[] bArr);

    public abstract void q(CharSequence charSequence);

    public abstract void r(int i10);

    public final void s(int i10, int i11) {
        n(i11);
        r(i10);
    }

    public abstract void t(Parcelable parcelable);

    public abstract void u(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(c cVar) {
        if (cVar == null) {
            u(null);
            return;
        }
        try {
            u(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a10);
                a10.w();
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (e13.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e13.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
