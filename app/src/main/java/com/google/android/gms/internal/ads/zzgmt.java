package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgmt {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgmt(Class cls, Class cls2, zzgms zzgmsVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgmt zzb(zzgmr zzgmrVar, Class cls, Class cls2) {
        return new zzgmq(cls, cls2, zzgmrVar);
    }

    public abstract zzgnq zza(zzgen zzgenVar);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
