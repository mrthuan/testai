package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzjl implements zzkl {
    private final Object zza;
    private zzcc zzb;

    public zzjl(Object obj, zzud zzudVar) {
        this.zza = obj;
        this.zzb = zzudVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzcc zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzcc zzccVar) {
        this.zzb = zzccVar;
    }
}
