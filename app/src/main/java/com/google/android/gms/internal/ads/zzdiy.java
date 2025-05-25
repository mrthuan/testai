package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdiy {
    private zzbfa zza;

    public zzdiy(zzdik zzdikVar) {
        this.zza = zzdikVar;
    }

    public final synchronized zzbfa zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbfa zzbfaVar) {
        this.zza = zzbfaVar;
    }
}
