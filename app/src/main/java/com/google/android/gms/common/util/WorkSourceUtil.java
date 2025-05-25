package com.google.android.gms.common.util;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import androidx.core.content.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class WorkSourceUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f11382a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f11383b;
    public static Boolean c;

    static {
        Method method;
        Method method2;
        boolean z10;
        boolean z11;
        boolean z12;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f11382a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f11383b = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused6) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception unused7) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            try {
                WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
            } catch (Exception unused8) {
            }
        }
        c = null;
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static synchronized boolean a(Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = c;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z10 = false;
            if (context == null) {
                return false;
            }
            if (a.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            c = valueOf;
            return valueOf.booleanValue();
        }
    }
}
