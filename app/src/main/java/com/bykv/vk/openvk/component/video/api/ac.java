package com.bykv.vk.openvk.component.video.api;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoConfig.java */
/* loaded from: classes.dex */
public class ac {
    private static boolean CJ = false;
    public static boolean Qhi = false;
    private static int Tgh = 1;

    /* renamed from: ac  reason: collision with root package name */
    private static String f7173ac;
    private static Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private static zc f7174fl;

    public static zc CJ() {
        if (f7174fl == null) {
            zc.Qhi qhi = new zc.Qhi("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f7174fl = qhi.Qhi(10000L, timeUnit).cJ(10000L, timeUnit).ac(10000L, timeUnit).Qhi();
        }
        return f7174fl;
    }

    public static Context Qhi() {
        return cJ;
    }

    public static int Tgh() {
        return Tgh;
    }

    public static boolean ac() {
        return CJ;
    }

    public static String cJ() {
        if (TextUtils.isEmpty(f7173ac)) {
            try {
                File file = new File(Qhi().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f7173ac = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return f7173ac;
    }

    public static boolean fl() {
        return Qhi;
    }

    public static void Qhi(Context context, String str) {
        cJ = context;
        f7173ac = str;
    }

    public static void Qhi(boolean z10) {
        CJ = z10;
    }

    public static void Qhi(zc zcVar) {
        f7174fl = zcVar;
    }

    public static void Qhi(int i10) {
        Tgh = i10;
    }
}
