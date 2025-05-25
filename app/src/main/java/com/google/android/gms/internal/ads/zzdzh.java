package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdzh {
    private final zzgcu zza;
    private final zzgcu zzb;
    private final zzeac zzc;
    private final zzhew zzd;

    public zzdzh(zzgcu zzgcuVar, zzgcu zzgcuVar2, zzeac zzeacVar, zzhew zzhewVar) {
        this.zza = zzgcuVar;
        this.zzb = zzgcuVar2;
        this.zzc = zzeacVar;
        this.zzd = zzhewVar;
    }

    public final y9.a zza(zzbug zzbugVar) {
        return this.zzc.zza(zzbugVar, ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkH)).longValue());
    }

    public final /* synthetic */ y9.a zzb(zzbug zzbugVar, int i10, zzdyp zzdypVar) {
        return ((zzebi) this.zzd.zzb()).zzb(zzbugVar, i10);
    }

    public final y9.a zzc(final zzbug zzbugVar) {
        y9.a zzf;
        String str = zzbugVar.zzf;
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        if (com.google.android.gms.ads.internal.util.zzt.c(str)) {
            zzf = zzgcj.zzg(new zzdyp(1, "Ads service proxy force local"));
        } else {
            zzf = zzgcj.zzf(zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzdze
                @Override // com.google.android.gms.internal.ads.zzgbp
                public final y9.a zza() {
                    return zzdzh.this.zza(zzbugVar);
                }
            }, this.zza), ExecutionException.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdzf
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    Throwable th2 = (ExecutionException) obj;
                    if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    }
                    return zzgcj.zzg(th2);
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgcj.zzf(zzf, zzdyp.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdzg
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdzh.this.zzb(zzbugVar, callingUid, (zzdyp) obj);
            }
        }, this.zzb);
    }
}
