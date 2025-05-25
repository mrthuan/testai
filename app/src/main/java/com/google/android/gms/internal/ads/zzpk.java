package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzpk extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzaf zzc;

    public zzpk(int i10, zzaf zzafVar, boolean z10) {
        super(b.a.c("AudioTrack write failed: ", i10));
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzafVar;
    }
}
