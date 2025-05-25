package com.facebook.appevents.iap;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: InAppPurchaseUtils.kt */
/* loaded from: classes.dex */
public final class InAppPurchaseUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9531a = 0;

    /* compiled from: InAppPurchaseUtils.kt */
    /* loaded from: classes.dex */
    public enum BillingClientVersion {
        NONE("none"),
        V1("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");
        
        private final String type;

        BillingClientVersion(String str) {
            this.type = str;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: InAppPurchaseUtils.kt */
    /* loaded from: classes.dex */
    public enum IAPProductType {
        INAPP("inapp"),
        SUBS("subs");
        
        private final String type;

        IAPProductType(String str) {
            this.type = str;
        }

        public final String getType() {
            return this.type;
        }
    }

    static {
        new InAppPurchaseUtils();
    }

    public static final Class<?> a(String str) {
        if (k6.a.b(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            k6.a.a(InAppPurchaseUtils.class, th2);
            return null;
        }
    }

    public static final Method b(Class<?> cls, String str, Class<?>... args) {
        if (k6.a.b(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.g.e(args, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            k6.a.a(InAppPurchaseUtils.class, th2);
            return null;
        }
    }

    public static final Method c(Class<?> clazz, String str, Class<?>... clsArr) {
        if (k6.a.b(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.g.e(clazz, "clazz");
            try {
                return clazz.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            k6.a.a(InAppPurchaseUtils.class, th2);
            return null;
        }
    }

    public static final Object d(Class<?> clazz, Method method, Object obj, Object... args) {
        if (k6.a.b(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.g.e(clazz, "clazz");
            kotlin.jvm.internal.g.e(method, "method");
            kotlin.jvm.internal.g.e(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            k6.a.a(InAppPurchaseUtils.class, th2);
            return null;
        }
    }
}
