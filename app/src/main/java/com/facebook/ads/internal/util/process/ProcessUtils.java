package com.facebook.ads.internal.util.process;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.activity.f;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
/* loaded from: classes.dex */
public final class ProcessUtils {
    private static String sProcessName;
    private static final AtomicBoolean sRemoteRenderingProcess = new AtomicBoolean();

    private ProcessUtils() {
    }

    public static String getProcessName(Context context) {
        synchronized (ProcessUtils.class) {
            String str = sProcessName;
            if (str != null) {
                return str;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return getProcessNameAPI28();
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                String processNameViaReflection = getProcessNameViaReflection((Application) applicationContext);
                synchronized (ProcessUtils.class) {
                    sProcessName = processNameViaReflection;
                }
                return processNameViaReflection;
            }
            return null;
        }
    }

    private static String getProcessNameAPI28() {
        try {
            return (String) Application.class.getMethod("getProcessName", null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getProcessNameViaReflection(Application application) {
        try {
            Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(application);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getProcessSpecificName(String str, Context context) {
        String packageName = context.getPackageName();
        String processName = getProcessName(context);
        if (!TextUtils.isEmpty(processName) && !packageName.equals(processName)) {
            if (processName.contains(":")) {
                processName = processName.split(":")[1];
            }
            return f.m(str, "_", processName);
        }
        return str;
    }

    public static boolean isRemoteRenderingProcess() {
        return sRemoteRenderingProcess.get();
    }

    public static void setRemoteRenderingProcess(boolean z10) {
        sRemoteRenderingProcess.set(z10);
    }
}
