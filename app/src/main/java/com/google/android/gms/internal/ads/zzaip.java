package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaip {
    public final zzaiw zza;
    public final zzaiz zzb;
    public final zzadp zzc;
    public final zzadq zzd;
    public int zze;

    public zzaip(zzaiw zzaiwVar, zzaiz zzaizVar, zzadp zzadpVar) {
        zzadq zzadqVar;
        this.zza = zzaiwVar;
        this.zzb = zzaizVar;
        this.zzc = zzadpVar;
        if ("audio/true-hd".equals(zzaiwVar.zzf.zzm)) {
            zzadqVar = new zzadq();
        } else {
            zzadqVar = null;
        }
        this.zzd = zzadqVar;
    }
}
