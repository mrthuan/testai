package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfsa {
    private static zzfsa zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfsa(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static zzfsa zzb(Context context) {
        if (zza == null) {
            zza = new zzfsa(context);
        }
        return zza;
    }

    public final long zza(String str, long j10) {
        return this.zzc.getLong(str, -1L);
    }

    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    public final void zzd(String str, Object obj) {
        boolean commit;
        if (obj instanceof String) {
            commit = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            String.valueOf(obj.getClass());
            throw new IOException(androidx.appcompat.view.menu.d.d("Failed to store ", str, " for app ", this.zzb));
        }
        if (commit) {
            return;
        }
        throw new IOException(androidx.appcompat.view.menu.d.d("Failed to store ", str, " for app ", this.zzb));
    }

    public final void zze(String str) {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        throw new IOException(androidx.appcompat.view.menu.d.d("Failed to remove ", str, " for app ", this.zzb));
    }

    public final boolean zzf(String str, boolean z10) {
        return this.zzc.getBoolean(str, true);
    }

    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
