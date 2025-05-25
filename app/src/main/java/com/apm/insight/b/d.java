package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.l.q;
import com.apm.insight.l.u;
import com.inmobi.commons.core.configs.TelemetryConfig;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f6362a = null;

    /* renamed from: b  reason: collision with root package name */
    private static long f6363b = -1;
    private static boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private static FileObserver f6364d;

    /* renamed from: e  reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f6365e;

    public static String a(Context context, int i10) {
        if (q.a(256)) {
            c = false;
            return "TEST_ANR_INFO";
        } else if (SystemClock.uptimeMillis() - f6363b < TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL) {
            return null;
        } else {
            try {
                ActivityManager.ProcessErrorStateInfo a10 = com.apm.insight.l.a.a(context, i10);
                if (a10 != null && Process.myPid() == a10.pid) {
                    ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f6365e;
                    if (processErrorStateInfo == null || !a.a(processErrorStateInfo, a10)) {
                        f6365e = a10;
                        f6362a = null;
                        f6363b = SystemClock.uptimeMillis();
                        c = false;
                        return a.a(a10);
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            String str = f6362a;
            if (str != null) {
                c = true;
                f6362a = null;
                f6363b = SystemClock.uptimeMillis();
                return str;
            }
            return null;
        }
    }

    public static void b() {
        f6365e = null;
    }

    public static JSONObject a(boolean z10) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", u.a(stackTrace));
            return jSONObject;
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
            return null;
        }
    }

    public static void a(final String str, final com.apm.insight.f fVar) {
        FileObserver fileObserver = f6364d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str, ShapeTypes.FLOW_CHART_INTERNAL_STORAGE) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public void onEvent(int i10, String str2) {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        String unused = d.f6362a = fVar.a(str, str2);
                    } catch (Throwable th2) {
                        com.apm.insight.c.a().a("NPTH_CATCH", th2);
                    }
                }
            }
        };
        f6364d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static boolean a() {
        return c;
    }
}
