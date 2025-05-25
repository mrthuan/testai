package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdnx implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdsk zzc;
    private final zzedh zzd;
    private final Executor zze;
    private final zzauo zzf;
    private final VersionInfoParcel zzg;
    private final zzfll zzh;
    private final zzeds zzi;
    private final zzffk zzj;

    public zzdnx(Context context, Executor executor, zzauo zzauoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcew zzcewVar, zzedh zzedhVar, zzfll zzfllVar, zzdsk zzdskVar, zzeds zzedsVar, zzffk zzffkVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzauoVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzedhVar;
        this.zzh = zzfllVar;
        this.zzc = zzdskVar;
        this.zzi = zzedsVar;
        this.zzj = zzffkVar;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdnx zzdnxVar) {
        return zzdnxVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzauo zzb(zzdnx zzdnxVar) {
        return zzdnxVar.zzf;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdnx zzdnxVar) {
        return zzdnxVar.zza;
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzd(zzdnx zzdnxVar) {
        return zzdnxVar.zzg;
    }

    public static /* bridge */ /* synthetic */ zzdsk zze(zzdnx zzdnxVar) {
        return zzdnxVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzedh zzf(zzdnx zzdnxVar) {
        return zzdnxVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzeds zzg(zzdnx zzdnxVar) {
        return zzdnxVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzffk zzh(zzdnx zzdnxVar) {
        return zzdnxVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfll zzi(zzdnx zzdnxVar) {
        return zzdnxVar.zzh;
    }

    public static /* bridge */ /* synthetic */ Executor zzj(zzdnx zzdnxVar) {
        return zzdnxVar.zze;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzdoa zzdoaVar = new zzdoa(this);
        zzdoaVar.zzk();
        return zzdoaVar;
    }
}
