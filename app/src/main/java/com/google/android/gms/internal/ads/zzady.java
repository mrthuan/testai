package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzady implements zzadi {
    final /* synthetic */ zzaeb zza;
    private final long zzb;

    public zzady(zzaeb zzaebVar, long j10) {
        this.zza = zzaebVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        zzaee[] zzaeeVarArr;
        zzaee[] zzaeeVarArr2;
        zzaee[] zzaeeVarArr3;
        zzaeeVarArr = this.zza.zzi;
        zzadg zza = zzaeeVarArr[0].zza(j10);
        int i10 = 1;
        while (true) {
            zzaeb zzaebVar = this.zza;
            zzaeeVarArr2 = zzaebVar.zzi;
            if (i10 < zzaeeVarArr2.length) {
                zzaeeVarArr3 = zzaebVar.zzi;
                zzadg zza2 = zzaeeVarArr3[i10].zza(j10);
                if (zza2.zza.zzc < zza.zza.zzc) {
                    zza = zza2;
                }
                i10++;
            } else {
                return zza;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
