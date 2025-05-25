package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgbd extends zzgbf {
    public zzgbd(y9.a aVar, zzgbq zzgbqVar) {
        super(aVar, zzgbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzgbq zzgbqVar = (zzgbq) obj;
        y9.a zza = zzgbqVar.zza(obj2);
        zzfuu.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgbqVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final /* synthetic */ void zzf(Object obj) {
        zzs((y9.a) obj);
    }
}
