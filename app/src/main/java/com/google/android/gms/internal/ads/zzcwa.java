package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcwa {
    private final Context zza;
    private final zzffg zzb;
    private final Bundle zzc;
    private final zzfey zzd;
    private final zzcvs zze;
    private final zzeey zzf;

    public /* synthetic */ zzcwa(zzcvy zzcvyVar, zzcvz zzcvzVar) {
        this.zza = zzcvy.zza(zzcvyVar);
        this.zzb = zzcvy.zzm(zzcvyVar);
        this.zzc = zzcvy.zzb(zzcvyVar);
        this.zzd = zzcvy.zzl(zzcvyVar);
        this.zze = zzcvy.zzc(zzcvyVar);
        this.zzf = zzcvy.zzk(zzcvyVar);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    public final Bundle zzb() {
        return this.zzc;
    }

    public final zzcvs zzc() {
        return this.zze;
    }

    public final zzcvy zzd() {
        zzcvy zzcvyVar = new zzcvy();
        zzcvyVar.zze(this.zza);
        zzcvyVar.zzi(this.zzb);
        zzcvyVar.zzf(this.zzc);
        zzcvyVar.zzg(this.zze);
        zzcvyVar.zzd(this.zzf);
        return zzcvyVar;
    }

    public final zzeey zze(String str) {
        zzeey zzeeyVar = this.zzf;
        if (zzeeyVar != null) {
            return zzeeyVar;
        }
        return new zzeey(str);
    }

    public final zzfey zzf() {
        return this.zzd;
    }

    public final zzffg zzg() {
        return this.zzb;
    }
}
