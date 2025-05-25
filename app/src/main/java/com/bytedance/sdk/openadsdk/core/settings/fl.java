package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.appset.zzr;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: AppSetIdAndScope.java */
/* loaded from: classes.dex */
public class fl {
    private static int CJ = 0;
    private static volatile String Qhi = "";

    /* renamed from: ac  reason: collision with root package name */
    private static String f9171ac = null;
    private static volatile String cJ = "";

    public static String CJ() {
        if (TextUtils.isEmpty(f9171ac)) {
            f9171ac = com.bytedance.sdk.openadsdk.core.HzH.Qhi().getPackageManager().getInstallerPackageName(js.fl());
        }
        if (f9171ac == null) {
            f9171ac = "";
        }
        return f9171ac;
    }

    public static String ac() {
        if (CJ != 0) {
            return cJ;
        }
        Qhi();
        return cJ;
    }

    public static String cJ() {
        if (CJ != 0) {
            return Qhi;
        }
        Qhi();
        return Qhi;
    }

    public static void Qhi() {
        try {
            new zzr(com.bytedance.sdk.openadsdk.core.HzH.Qhi()).getAppSetIdInfo().e(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = fl.Qhi = Integer.toString(appSetIdInfo.f10794b);
                    String unused2 = fl.cJ = appSetIdInfo.f10793a;
                    int unused3 = fl.CJ = 1;
                }
            });
        } catch (Throwable unused) {
            CJ = 2;
        }
    }
}
