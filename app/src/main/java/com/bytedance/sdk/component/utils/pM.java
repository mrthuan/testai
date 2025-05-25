package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: X2CUtils.java */
/* loaded from: classes.dex */
public class pM {
    public static final Class<?>[] Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private static final HashMap<Class<?>, Class<?>> f8431ac;
    private static Map<String, Method> cJ = new HashMap();

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f8431ac = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
        Qhi = new Class[0];
    }

    public static int Qhi(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static String cJ(Class<?> cls, String str, Class<?>... clsArr) {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls.toString());
        sb2.append("#");
        sb2.append(str);
        sb2.append("#");
        if (cls.getClassLoader() != null) {
            obj = Integer.valueOf(cls.getClassLoader().hashCode());
        } else {
            obj = "";
        }
        sb2.append(obj);
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls2 : clsArr) {
                sb2.append(cls2.toString());
                sb2.append("#");
            }
        } else {
            sb2.append(Void.class.toString());
        }
        return sb2.toString();
    }

    public static Method Qhi(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method[] declaredMethods;
        String cJ2 = cJ(cls, str, clsArr);
        synchronized (cJ) {
            method = cJ.get(cJ2);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        while (cls != null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (method == null) {
                try {
                    for (Method method2 : cls.getDeclaredMethods()) {
                        if (method2 != null && TextUtils.equals(method2.getName(), str)) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            if (clsArr != null && parameterTypes != null && clsArr.length == parameterTypes.length) {
                                boolean z10 = true;
                                for (int i10 = 0; i10 < clsArr.length; i10++) {
                                    if (!Qhi(clsArr[i10], parameterTypes[i10])) {
                                        z10 = false;
                                    }
                                }
                                if (z10) {
                                    method = method2;
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (method != null) {
                method.setAccessible(true);
                synchronized (cJ) {
                    cJ.put(cJ2, method);
                }
                return method;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static boolean Qhi(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive()) {
            cls = f8431ac.get(cls);
        }
        if (cls2.isPrimitive() && !cls.isPrimitive()) {
            cls2 = f8431ac.get(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    public static Object Qhi(Object obj, String str, Object... objArr) {
        return Qhi(obj, str, objArr, Qhi(objArr));
    }

    public static Object Qhi(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
        Method Qhi2 = Qhi(obj.getClass(), str, clsArr);
        if (Qhi2 != null) {
            return Qhi2.invoke(obj, objArr);
        }
        throw new NoSuchMethodException(str);
    }

    public static Class<?>[] Qhi(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj = objArr[i10];
                clsArr[i10] = obj == null ? null : obj.getClass();
            }
            return clsArr;
        }
        return Qhi;
    }

    public static int Qhi(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
