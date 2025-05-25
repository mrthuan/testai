package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import com.adjust.sdk.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdr {
    public static void zza(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw new zzdq(str);
    }

    public static boolean zzb(Context context) {
        int i10 = zzet.zza;
        if (i10 >= 24) {
            if (i10 >= 26 || (!Constants.REFERRER_API_SAMSUNG.equals(zzet.zzc) && !"XT1650".equals(zzet.zzd))) {
                if (i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                    return false;
                }
                return zzd("EGL_EXT_protected_content");
            }
            return false;
        }
        return false;
    }

    public static boolean zzc() {
        return zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains(str)) {
            return false;
        }
        return true;
    }
}
