package com.bykv.vk.openvk.preload.a.b;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public abstract class l {
    public static l a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new l() { // from class: com.bykv.vk.openvk.preload.a.b.l.1
                @Override // com.bykv.vk.openvk.preload.a.b.l
                public final <T> T a(Class<T> cls2) {
                    l.b(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new l() { // from class: com.bykv.vk.openvk.preload.a.b.l.2
                        @Override // com.bykv.vk.openvk.preload.a.b.l
                        public final <T> T a(Class<T> cls2) {
                            l.b(cls2);
                            return (T) declaredMethod2.invoke(null, cls2, Integer.valueOf(intValue));
                        }
                    };
                } catch (Exception unused2) {
                    return new l() { // from class: com.bykv.vk.openvk.preload.a.b.l.4
                        @Override // com.bykv.vk.openvk.preload.a.b.l
                        public final <T> T a(Class<T> cls2) {
                            throw new UnsupportedOperationException("Cannot allocate ".concat(String.valueOf(cls2)));
                        }
                    };
                }
            } catch (Exception unused3) {
                final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new l() { // from class: com.bykv.vk.openvk.preload.a.b.l.3
                    @Override // com.bykv.vk.openvk.preload.a.b.l
                    public final <T> T a(Class<T> cls2) {
                        l.b(cls2);
                        return (T) declaredMethod3.invoke(null, cls2, Object.class);
                    }
                };
            }
        }
    }

    public static void b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
    }

    public abstract <T> T a(Class<T> cls);
}
