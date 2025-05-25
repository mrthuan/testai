package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzewu implements zzevo {
    private final Executor zza;
    private final String zzb;

    public zzewu(zzbyv zzbyvVar, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return zzgcj.zzf(zzgcj.zzm(zzgcj.zzh(this.zzb), new zzful() { // from class: com.google.android.gms.internal.ads.zzews
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return new zzewv((String) obj);
            }
        }, this.zza), Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzewt
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzewu.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    public final /* synthetic */ y9.a zzc(Throwable th2) {
        return zzgcj.zzh(new zzewv(this.zzb));
    }
}
