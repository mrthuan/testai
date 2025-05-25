package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbnf {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbno zzc;
    private zzbno zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    public final zzbno zza(Context context, VersionInfoParcel versionInfoParcel, zzfki zzfkiVar) {
        zzbno zzbnoVar;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = new zzbno(zzc(context), versionInfoParcel, (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zza), zzfkiVar);
                }
                zzbnoVar = this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbnoVar;
    }

    public final zzbno zzb(Context context, VersionInfoParcel versionInfoParcel, zzfki zzfkiVar) {
        zzbno zzbnoVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbno(zzc(context), versionInfoParcel, (String) zzbec.zza.zze(), zzfkiVar);
            }
            zzbnoVar = this.zzd;
        }
        return zzbnoVar;
    }
}
