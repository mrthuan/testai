package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeuz implements zzevo {
    private final zzbya zza;
    private final zzgcu zzb;
    private final Context zzc;

    public zzeuz(zzbya zzbyaVar, zzgcu zzgcuVar, Context context) {
        this.zza = zzbyaVar;
        this.zzb = zzgcuVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuz.this.zzc();
            }
        });
    }

    public final zzeva zzc() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!this.zza.zzp(this.zzc)) {
            return new zzeva(null, null, null, null, null);
        }
        String zzd = this.zza.zzd(this.zzc);
        if (zzd == null) {
            str = "";
        } else {
            str = zzd;
        }
        String zzb = this.zza.zzb(this.zzc);
        if (zzb == null) {
            str2 = "";
        } else {
            str2 = zzb;
        }
        String zza = this.zza.zza(this.zzc);
        if (zza == null) {
            str3 = "";
        } else {
            str3 = zza;
        }
        Long l10 = null;
        if (true != this.zza.zzp(this.zzc)) {
            str4 = null;
        } else {
            str4 = "fa";
        }
        if ("TIME_OUT".equals(str2)) {
            l10 = (Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaa);
        }
        Long l11 = l10;
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        return new zzeva(str, str2, str3, str5, l11);
    }
}
