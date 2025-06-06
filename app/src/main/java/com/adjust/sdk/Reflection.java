package com.adjust.sdk;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public class Reflection {
    public static Object createDefaultInstance(Class cls) {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object createInstance(String str, Class[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class forName(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getAdvertisingInfoObject(Context context) {
        return invokeStaticMethod("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
    }

    public static String getAppSetId(Context context) {
        try {
            return (String) invokeInstanceMethod(invokeStaticMethod("com.google.android.gms.tasks.Tasks", "await", new Class[]{forName("com.google.android.gms.tasks.Task")}, invokeInstanceMethod(invokeStaticMethod("com.google.android.gms.appset.AppSet", "getClient", new Class[]{Context.class}, context), "getAppSetIdInfo", null, new Object[0])), "getId", null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map<String, String> getImeiParameters(Context context, ILogger iLogger) {
        try {
            Object invokeStaticMethod = invokeStaticMethod("com.adjust.sdk.imei.Util", "getImeiParameters", new Class[]{Context.class, ILogger.class}, context, iLogger);
            if (invokeStaticMethod != null && Map.class.isInstance(invokeStaticMethod)) {
                return (Map) invokeStaticMethod;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, String> getOaidParameters(Context context, ILogger iLogger) {
        try {
            Object invokeStaticMethod = invokeStaticMethod("com.adjust.sdk.oaid.Util", "getOaidParameters", new Class[]{Context.class, ILogger.class}, context, iLogger);
            if (invokeStaticMethod != null && Map.class.isInstance(invokeStaticMethod)) {
                return (Map) invokeStaticMethod;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPlayAdId(Context context, Object obj) {
        try {
            return (String) invokeInstanceMethod(obj, "getId", null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSamsungCloudDevGoogleAdId(Context context, ILogger iLogger) {
        try {
            return (String) invokeStaticMethod("com.adjust.sdk.samsung.clouddev.Util", "getGoogleAdId", new Class[]{Context.class, ILogger.class}, context, iLogger);
        } catch (Exception e10) {
            iLogger.info("invoke getGoogleAdId : " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public static ReferrerDetails getSamsungReferrer(Context context, ILogger iLogger) {
        try {
            return (ReferrerDetails) invokeStaticMethod("com.adjust.sdk.samsung.Util", "getSamsungInstallReferrerDetails", new Class[]{Context.class, ILogger.class}, context, iLogger);
        } catch (Exception e10) {
            iLogger.info("invoke getSamsungInstallReferrerDetails : " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public static ReferrerDetails getVivoReferrer(Context context, ILogger iLogger) {
        try {
            return (ReferrerDetails) invokeStaticMethod("com.adjust.sdk.vivo.Util", "getVivoInstallReferrerDetails", new Class[]{Context.class, ILogger.class}, context, iLogger);
        } catch (Exception e10) {
            iLogger.info("invoke getVivoInstallReferrerDetails : " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public static ReferrerDetails getXiaomiReferrer(Context context, ILogger iLogger) {
        try {
            return (ReferrerDetails) invokeStaticMethod("com.adjust.sdk.xiaomi.Util", "getXiaomiInstallReferrerDetails", new Class[]{Context.class, ILogger.class}, context, iLogger);
        } catch (Exception e10) {
            iLogger.info("invoke getXiaomiInstallReferrerDetails : " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public static Object invokeInstanceMethod(Object obj, String str, Class[] clsArr, Object... objArr) {
        return invokeMethod(obj.getClass(), str, obj, clsArr, objArr);
    }

    public static Object invokeMethod(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) {
        Method method = cls.getMethod(str, clsArr);
        if (method == null) {
            return null;
        }
        return method.invoke(obj, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Class[] clsArr, Object... objArr) {
        return invokeMethod(Class.forName(str), str2, null, clsArr, objArr);
    }

    public static boolean isAppRunningInSamsungCloudEnvironment(Context context, ILogger iLogger) {
        try {
            return ((Boolean) invokeStaticMethod("com.adjust.sdk.samsung.clouddev.Util", "isAppRunningInCloudEnvironment", new Class[]{Context.class, ILogger.class}, context, iLogger)).booleanValue();
        } catch (Exception e10) {
            iLogger.info("invoke isAppRunningInCloudEnvironment : " + e10.getMessage(), new Object[0]);
            return false;
        }
    }

    public static Boolean isPlayTrackingEnabled(Context context, Object obj) {
        try {
            Boolean bool = (Boolean) invokeInstanceMethod(obj, "isLimitAdTrackingEnabled", null, new Object[0]);
            if (bool == null) {
                return null;
            }
            return Boolean.valueOf(!bool.booleanValue());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object readField(String str, String str2) {
        return readField(str, str2, null);
    }

    public static Object createDefaultInstance(String str) {
        Class forName = forName(str);
        if (forName == null) {
            return null;
        }
        return createDefaultInstance(forName);
    }

    public static Object readField(String str, String str2, Object obj) {
        Field field;
        Class forName = forName(str);
        if (forName == null || (field = forName.getField(str2)) == null) {
            return null;
        }
        return field.get(obj);
    }
}
