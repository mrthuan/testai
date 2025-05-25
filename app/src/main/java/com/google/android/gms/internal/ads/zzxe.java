package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzxe implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxe(zzaf zzafVar, int i10) {
        this.zza = 1 == (zzafVar.zze & 1);
        this.zzb = zzlf.zza(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzxe zzxeVar) {
        return zzfxg.zzj().zzd(this.zzb, zzxeVar.zzb).zzd(this.zza, zzxeVar.zza).zza();
    }
}
