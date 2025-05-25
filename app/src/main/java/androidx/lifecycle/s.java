package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: Lifecycling.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f4079a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f4080b = new HashMap();

    public static i a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.g.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (i) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z10;
        boolean z11;
        boolean z12;
        String fullPackage;
        boolean z13;
        boolean z14;
        HashMap hashMap = f4079a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String name = cls.getCanonicalName();
                if (r4 != null) {
                    fullPackage = r4.getName();
                } else {
                    fullPackage = "";
                }
                kotlin.jvm.internal.g.d(fullPackage, "fullPackage");
                if (fullPackage.length() == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    kotlin.jvm.internal.g.d(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    kotlin.jvm.internal.g.d(name, "this as java.lang.String).substring(startIndex)");
                }
                kotlin.jvm.internal.g.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = kotlin.text.j.K(name, ".", "_").concat("_LifecycleAdapter");
                if (fullPackage.length() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    concat = fullPackage + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = f4080b;
            if (constructor != null) {
                hashMap2.put(cls, ge.a.H(constructor));
            } else {
                c cVar = c.c;
                HashMap hashMap3 = cVar.f4031b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (((y) declaredMethods[i11].getAnnotation(y.class)) != null) {
                                    cVar.a(cls, declaredMethods);
                                    z10 = true;
                                    break;
                                }
                                i11++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && o.class.isAssignableFrom(superclass)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        kotlin.jvm.internal.g.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.g.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    kotlin.jvm.internal.g.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class<?> intrface = interfaces[i12];
                            if (intrface != null && o.class.isAssignableFrom(intrface)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                kotlin.jvm.internal.g.d(intrface, "intrface");
                                if (b(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                kotlin.jvm.internal.g.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i12++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
