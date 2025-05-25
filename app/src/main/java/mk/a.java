package mk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import n2.h;

/* compiled from: BoundaryInterfaceReflectionUtil.java */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: BoundaryInterfaceReflectionUtil.java */
    /* renamed from: mk.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0292a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final Object f22143a;

        public C0292a(h hVar) {
            this.f22143a = hVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2 = this.f22143a;
            try {
                return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
