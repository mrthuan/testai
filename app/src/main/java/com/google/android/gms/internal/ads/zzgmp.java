package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgmp {
    private final zzgvr zza;
    private final Class zzb;

    public /* synthetic */ zzgmp(zzgvr zzgvrVar, Class cls, zzgmo zzgmoVar) {
        this.zza = zzgvrVar;
        this.zzb = cls;
    }

    public static zzgmp zzb(zzgmn zzgmnVar, zzgvr zzgvrVar, Class cls) {
        return new zzgmm(zzgvrVar, cls, zzgmnVar);
    }

    public abstract zzgen zza(zzgnq zzgnqVar);

    public final zzgvr zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
