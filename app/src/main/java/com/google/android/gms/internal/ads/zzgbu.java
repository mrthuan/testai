package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgbu extends zzgbv {
    final /* synthetic */ zzgbw zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbu(zzgbw zzgbwVar, Callable callable, Executor executor) {
        super(zzgbwVar, executor);
        this.zza = zzgbwVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final Object zza() {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
