package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzahy {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzek zzf;
    private final zzek zzg;
    private int zzh;
    private int zzi;

    public zzahy(zzek zzekVar, zzek zzekVar2, boolean z10) {
        this.zzg = zzekVar;
        this.zzf = zzekVar2;
        this.zze = z10;
        zzekVar2.zzK(12);
        this.zza = zzekVar2.zzp();
        zzekVar.zzK(12);
        this.zzi = zzekVar.zzp();
        zzaco.zzb(zzekVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long zzu;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        if (this.zze) {
            zzu = this.zzf.zzv();
        } else {
            zzu = this.zzf.zzu();
        }
        this.zzd = zzu;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzL(4);
            int i11 = -1;
            int i12 = this.zzi - 1;
            this.zzi = i12;
            if (i12 > 0) {
                i11 = (-1) + this.zzg.zzp();
            }
            this.zzh = i11;
        }
        return true;
    }
}
