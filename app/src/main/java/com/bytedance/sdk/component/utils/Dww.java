package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: TTReflectUtils.java */
/* loaded from: classes.dex */
public class Dww {
    public static Method Qhi(String str, String str2, Class<?>... clsArr) {
        Class<?> Qhi;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                Qhi = Qhi(str);
                if (Qhi == null) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return Qhi.getMethod(str2, clsArr);
    }

    public static Class<?> Qhi(String str) {
        try {
            try {
                try {
                    return Class.forName(str, true, Qhi());
                } catch (ClassNotFoundException unused) {
                    return Class.forName(str, true, Dww.class.getClassLoader());
                }
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return Class.forName(str);
        }
    }

    private static ClassLoader Qhi() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? Dww.class.getClassLoader() : contextClassLoader;
    }
}
