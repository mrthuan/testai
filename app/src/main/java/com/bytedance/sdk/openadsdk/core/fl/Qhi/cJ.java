package com.bytedance.sdk.openadsdk.core.fl.Qhi;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdShowCheckForSec.java */
/* loaded from: classes.dex */
public class cJ {
    private static volatile cJ Qhi;
    private final ArrayList<String> cJ = new ArrayList<>();

    /* renamed from: ac  reason: collision with root package name */
    private final AtomicBoolean f9035ac = new AtomicBoolean(false);
    private long CJ = System.currentTimeMillis();

    /* renamed from: fl  reason: collision with root package name */
    private long f9036fl = 0;
    private long Tgh = 0;
    private String ROR = "";
    private String Sf = "";

    /* renamed from: hm  reason: collision with root package name */
    private String f9037hm = "";
    private boolean WAv = false;
    private boolean Gm = false;

    public static cJ Qhi(Application application) {
        if (Qhi == null) {
            synchronized (cJ.class) {
                if (Qhi == null) {
                    cJ cJVar = new cJ();
                    Qhi = cJVar;
                    cJVar.WAv = Qhi((Context) application);
                    Qhi.Gm = Qhi(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    Qhi.Qhi();
                }
            }
        }
        return Qhi;
    }

    public void cJ(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.cJ.contains(localClassName)) {
            this.cJ.remove(localClassName);
        }
        if (this.cJ.size() == 0) {
            this.CJ = System.currentTimeMillis();
            this.f9035ac.set(true);
            this.Sf = localClassName;
        }
    }

    private static int Qhi(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean Qhi(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void Qhi(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.cJ.size() == 0) {
            this.ROR = localClassName;
            this.f9036fl = System.currentTimeMillis();
            this.Tgh = System.currentTimeMillis() - this.CJ;
            this.f9035ac.set(false);
        }
        if (!this.cJ.contains(localClassName)) {
            this.cJ.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.f9037hm = localClassName;
    }

    private void Qhi() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i10 = 0; i10 < size; i10++) {
                    Object valueAt = arrayMap.valueAt(i10);
                    if (!((Boolean) declaredField2.get(valueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(valueAt)).getLocalClassName();
                        if (!this.cJ.contains(localClassName)) {
                            this.cJ.add(localClassName);
                        }
                    }
                }
                this.f9035ac.set(this.cJ.size() <= 0);
            }
        } catch (Exception unused) {
        }
    }

    public String Qhi(String str, long j10, int i10) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f9036fl;
        long j12 = currentTimeMillis - j10;
        int i11 = j12 < 500 ? 1 : 0;
        if (this.f9035ac.get() && this.Gm) {
            i11 |= 2;
        }
        if (!this.f9035ac.get() && this.Tgh >= TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL && j11 < 1000) {
            i11 = this.Sf.equals(this.f9037hm) ? i11 | 4 : i11 | 8;
        }
        try {
            str2 = new JSONObject().put("rst", i11).put("adtag", str).put("bakdur", this.Tgh).put("rit", i10).put("poptime", j11).put("unlocktime", j12).put("bakground", this.f9035ac).put("alert", this.Gm).put("sys", this.WAv).put("actsize", this.cJ.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.cJ.ac()).toString();
        } catch (JSONException unused) {
            str2 = "";
        }
        this.ROR = "";
        this.Tgh = 0L;
        this.f9036fl = 0L;
        this.CJ = System.currentTimeMillis();
        return str2;
    }
}
