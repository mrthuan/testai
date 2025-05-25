package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzyc {
    public final int zza;
    public final zzli[] zzb;
    public final zzxv[] zzc;
    public final zzck zzd;
    public final Object zze;

    public zzyc(zzli[] zzliVarArr, zzxv[] zzxvVarArr, zzck zzckVar, Object obj) {
        this.zzb = zzliVarArr;
        this.zzc = (zzxv[]) zzxvVarArr.clone();
        this.zzd = zzckVar;
        this.zze = obj;
        this.zza = zzliVarArr.length;
    }

    public final boolean zza(zzyc zzycVar, int i10) {
        if (zzycVar == null || !zzet.zzG(this.zzb[i10], zzycVar.zzb[i10]) || !zzet.zzG(this.zzc[i10], zzycVar.zzc[i10])) {
            return false;
        }
        return true;
    }

    public final boolean zzb(int i10) {
        if (this.zzb[i10] != null) {
            return true;
        }
        return false;
    }
}
