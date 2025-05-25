package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcgd {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgd(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzcgd zza() {
        return new zzcgd(0, 0, 0);
    }

    public static zzcgd zzb(int i10, int i11) {
        return new zzcgd(1, i10, i11);
    }

    public static zzcgd zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        if (zzqVar.f10240d) {
            return new zzcgd(3, 0, 0);
        }
        if (zzqVar.f10245i) {
            return new zzcgd(2, 0, 0);
        }
        if (zzqVar.f10244h) {
            return zza();
        }
        return zzb(zzqVar.f10242f, zzqVar.c);
    }

    public static zzcgd zzd() {
        return new zzcgd(5, 0, 0);
    }

    public static zzcgd zze() {
        return new zzcgd(4, 0, 0);
    }

    public final boolean zzf() {
        if (this.zzc == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        if (this.zzc == 2) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        if (this.zzc == 5) {
            return true;
        }
        return false;
    }

    public final boolean zzi() {
        if (this.zzc == 3) {
            return true;
        }
        return false;
    }

    public final boolean zzj() {
        if (this.zzc == 4) {
            return true;
        }
        return false;
    }
}
