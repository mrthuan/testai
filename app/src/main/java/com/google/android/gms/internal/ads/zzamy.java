package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamy implements zzang {
    private zzaf zza;
    private zzer zzb;
    private zzadp zzc;

    public zzamy(String str) {
        zzad zzadVar = new zzad();
        zzadVar.zzX(str);
        this.zza = zzadVar.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zza(zzek zzekVar) {
        zzdi.zzb(this.zzb);
        int i10 = zzet.zza;
        long zze = this.zzb.zze();
        long zzf = this.zzb.zzf();
        if (zze != -9223372036854775807L && zzf != -9223372036854775807L) {
            zzaf zzafVar = this.zza;
            if (zzf != zzafVar.zzq) {
                zzad zzb = zzafVar.zzb();
                zzb.zzab(zzf);
                zzaf zzad = zzb.zzad();
                this.zza = zzad;
                this.zzc.zzl(zzad);
            }
            int zzb2 = zzekVar.zzb();
            this.zzc.zzq(zzekVar, zzb2);
            this.zzc.zzs(zze, 1, zzb2, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzb(zzer zzerVar, zzacn zzacnVar, zzans zzansVar) {
        this.zzb = zzerVar;
        zzansVar.zzc();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 5);
        this.zzc = zzw;
        zzw.zzl(this.zza);
    }
}
