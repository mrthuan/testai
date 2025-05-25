package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcgm {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcgm(zzcgk zzcgkVar, zzcgl zzcglVar) {
        VersionInfoParcel versionInfoParcel;
        Context context;
        WeakReference weakReference;
        long j10;
        versionInfoParcel = zzcgkVar.zza;
        this.zza = versionInfoParcel;
        context = zzcgkVar.zzb;
        this.zzb = context;
        weakReference = zzcgkVar.zzd;
        this.zzd = weakReference;
        j10 = zzcgkVar.zzc;
        this.zzc = j10;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.internal.zzj zzc() {
        return new com.google.android.gms.ads.internal.zzj(this.zzb, this.zza);
    }

    public final zzbel zzd() {
        return new zzbel(this.zzb);
    }

    public final VersionInfoParcel zze() {
        return this.zza;
    }

    public final String zzf() {
        return com.google.android.gms.ads.internal.zzu.B.c.v(this.zzb, this.zza.f10345a);
    }

    public final WeakReference zzg() {
        return this.zzd;
    }
}
