package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfhs {
    private final long zza;
    private long zzc;
    private final zzfhr zzb = new zzfhr();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfhs() {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfhr zzd() {
        zzfhr zzfhrVar = this.zzb;
        zzfhr clone = zzfhrVar.clone();
        zzfhrVar.zza = false;
        zzfhrVar.zzb = 0;
        return clone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.zzc = System.currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
