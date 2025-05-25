package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfke {
    public static void zza(y9.a aVar, zzfkf zzfkfVar, zzfju zzfjuVar) {
        zzg(aVar, zzfkfVar, zzfjuVar, false);
    }

    public static void zzb(y9.a aVar, zzfkf zzfkfVar, zzfju zzfjuVar) {
        zzg(aVar, zzfkfVar, zzfjuVar, true);
    }

    public static void zzc(y9.a aVar, zzfkf zzfkfVar, zzfju zzfjuVar) {
        if (!((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            return;
        }
        zzgcj.zzr(zzgca.zzu(aVar), new zzfkd(zzfkfVar, zzfjuVar), zzbzo.zzf);
    }

    public static void zzd(y9.a aVar, zzfju zzfjuVar) {
        if (!((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            return;
        }
        zzgcj.zzr(zzgca.zzu(aVar), new zzfkb(zzfjuVar), zzbzo.zzf);
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhU), str);
    }

    public static int zzf(zzffg zzffgVar) {
        int e10 = com.google.android.gms.ads.nonagon.signalgeneration.zzq.e(zzffgVar) - 1;
        if (e10 != 0 && e10 != 1) {
            return 23;
        }
        return 7;
    }

    private static void zzg(y9.a aVar, zzfkf zzfkfVar, zzfju zzfjuVar, boolean z10) {
        if (!((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            return;
        }
        zzgcj.zzr(zzgca.zzu(aVar), new zzfkc(zzfkfVar, zzfjuVar, z10), zzbzo.zzf);
    }
}
