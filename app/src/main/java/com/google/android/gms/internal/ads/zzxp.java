package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzxp {
    public final int zza;
    public final zzcd zzb;
    public final int zzc;
    public final zzaf zzd;

    public zzxp(int i10, zzcd zzcdVar, int i11) {
        this.zza = i10;
        this.zzb = zzcdVar;
        this.zzc = i11;
        this.zzd = zzcdVar.zzb(i11);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzxp zzxpVar);
}
