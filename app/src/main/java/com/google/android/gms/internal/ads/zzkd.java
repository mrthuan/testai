package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzkd {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkd() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzkd zzd(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzdi.zzd(z10);
        this.zzc = j10;
        return this;
    }

    public final zzkd zze(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzkd zzf(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzdi.zzd(z10);
        this.zzb = f10;
        return this;
    }

    public final zzkf zzg() {
        return new zzkf(this, null);
    }

    public /* synthetic */ zzkd(zzkf zzkfVar, zzkc zzkcVar) {
        this.zza = zzkfVar.zza;
        this.zzb = zzkfVar.zzb;
        this.zzc = zzkfVar.zzc;
    }
}
