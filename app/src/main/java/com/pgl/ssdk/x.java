package com.pgl.ssdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* compiled from: AppInfo.java */
/* loaded from: classes2.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private static int f15864a = -1;

    /* renamed from: b  reason: collision with root package name */
    private static int f15865b = -1;

    private static boolean a(Context context) {
        List<ActivityManager.AppTask> appTasks;
        Intent intent;
        if (context != null && (appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks()) != null && !appTasks.isEmpty()) {
            for (ActivityManager.AppTask appTask : appTasks) {
                if (appTask.getTaskInfo() != null) {
                    intent = appTask.getTaskInfo().baseIntent;
                    if (a(intent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void b(Context context) {
        try {
            if (f15864a == -1 || f15865b == -1) {
                d(context);
            }
            if (a(context)) {
                f15864a++;
            }
            f15865b++;
            if (f15864a != 0) {
                e(context);
                com.pgl.ssdk.ces.a.meta(160, null, new int[]{f15864a, f15865b});
            }
        } catch (Throwable unused) {
        }
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static void d(Context context) {
        int i10;
        int i11;
        String a10 = L.a(context, "hac_date", null);
        if (!TextUtils.isEmpty(a10)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            if (a10.equals(simpleDateFormat.format(new Date()))) {
                SharedPreferences a11 = L.a(context);
                if (a11 != null) {
                    i10 = a11.getInt("hac", -1);
                } else {
                    i10 = -1;
                }
                SharedPreferences a12 = L.a(context);
                if (a12 != null) {
                    i11 = a12.getInt("tac", -1);
                } else {
                    i11 = -1;
                }
                if (i10 != -1 && i11 != -1) {
                    f15864a = i10;
                    f15865b = i11;
                    return;
                }
            }
        }
        f15864a = 0;
        f15865b = 0;
    }

    private static void e(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        L.b(context, "hac_date", simpleDateFormat.format(new Date()));
        int i10 = f15864a;
        SharedPreferences a10 = L.a(context);
        if (a10 != null) {
            a10.edit().putInt("hac", i10).apply();
        }
        int i11 = f15865b;
        SharedPreferences a11 = L.a(context);
        if (a11 != null) {
            a11.edit().putInt("tac", i11).apply();
        }
    }

    private static boolean a(Intent intent) {
        return (intent == null || (intent.getFlags() & 8388608) == 0) ? false : true;
    }
}
