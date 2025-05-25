package com.pgl.ssdk;

import android.content.Context;
import java.lang.reflect.Method;

/* compiled from: DeviceUnits.java */
/* loaded from: classes2.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static double f15867a = -1.0d;

    public static String a(Context context) {
        double d10 = f15867a;
        double d11 = 0.0d;
        if (d10 >= 0.0d) {
            return Integer.toString((int) d10);
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
            declaredMethod.setAccessible(true);
            d11 = ((Double) declaredMethod.invoke(newInstance, "battery.capacity")).doubleValue();
        } catch (Throwable unused) {
        }
        f15867a = d11;
        return Integer.toString((int) d11);
    }
}
