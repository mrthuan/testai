package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdwq {
    private final zzgcu zza;
    private final zzgcu zzb;
    private final zzdxx zzc;
    private final zzhew zzd;

    public zzdwq(zzgcu zzgcuVar, zzgcu zzgcuVar2, zzdxx zzdxxVar, zzhew zzhewVar) {
        this.zza = zzgcuVar;
        this.zzb = zzgcuVar2;
        this.zzc = zzdxxVar;
        this.zzd = zzhewVar;
    }

    public final zzdyq zza(zzbvb zzbvbVar) {
        return (zzdyq) this.zzc.zza(zzbvbVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeU)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ y9.a zzb(final zzbvb zzbvbVar, int i10, zzdyp zzdypVar) {
        Bundle bundle;
        if (zzbvbVar != null && (bundle = zzbvbVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgcj.zzn(((zzeay) this.zzd.zzb()).zzc(zzbvbVar, i10), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdwm
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzgcj.zzh(new zzdyq((InputStream) obj, zzbvb.this));
            }
        }, this.zzb);
    }

    public final y9.a zzc(final zzbvb zzbvbVar) {
        y9.a zzf;
        String str = zzbvbVar.zzd;
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        if (com.google.android.gms.ads.internal.util.zzt.c(str)) {
            zzf = zzgcj.zzg(new zzdyp(1));
        } else {
            zzf = zzgcj.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdwq.this.zza(zzbvbVar);
                }
            }), ExecutionException.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdwo
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    return zzgcj.zzg(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgcj.zzf(zzf, zzdyp.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdwp
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdwq.this.zzb(zzbvbVar, callingUid, (zzdyp) obj);
            }
        }, this.zzb);
    }
}
