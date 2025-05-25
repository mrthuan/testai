package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzea {
    private static final Object zza = new Object();

    public static String zza(String str, Throwable th2) {
        String replace;
        if (th2 == null) {
            replace = null;
        } else {
            synchronized (zza) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 != null) {
                        if (th3 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        }
                        th3 = th3.getCause();
                    } else {
                        replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return a0.a.j(str, "\n  ", replace.replace("\n", "\n  "), "\n");
        }
        return str;
    }

    public static void zzb(String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzc(String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzd(String str, String str2, Throwable th2) {
        synchronized (zza) {
            zza(str2, th2);
        }
    }

    public static void zze(String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzf(String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzg(String str, String str2, Throwable th2) {
        synchronized (zza) {
            zza(str2, th2);
        }
    }
}
