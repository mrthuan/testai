package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
abstract class zzaet {
    protected final zzadp zza;

    public zzaet(zzadp zzadpVar) {
        this.zza = zzadpVar;
    }

    public abstract boolean zza(zzek zzekVar);

    public abstract boolean zzb(zzek zzekVar, long j10);

    public final boolean zzf(zzek zzekVar, long j10) {
        if (zza(zzekVar) && zzb(zzekVar, j10)) {
            return true;
        }
        return false;
    }
}
