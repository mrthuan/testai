package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ProcessUtil.java */
/* loaded from: classes.dex */
public class kYc {
    private static String Qhi;

    public static boolean Qhi(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), cJ(context));
    }

    private static String ac(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static String cJ(Context context) {
        if (!TextUtils.isEmpty(Qhi)) {
            return Qhi;
        }
        String Qhi2 = Qhi();
        Qhi = Qhi2;
        if (!TextUtils.isEmpty(Qhi2)) {
            return Qhi;
        }
        String cJ = cJ();
        Qhi = cJ;
        if (!TextUtils.isEmpty(cJ)) {
            return Qhi;
        }
        String ac2 = ac(context);
        Qhi = ac2;
        return ac2;
    }

    private static String Qhi() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                processName = Application.getProcessName();
                return processName;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    private static String cJ() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
