package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccn extends com.google.android.gms.ads.internal.util.zzb {
    final zzcbk zza;
    final zzccv zzb;
    private final String zzc;
    private final String[] zzd;

    public zzccn(zzcbk zzcbkVar, zzccv zzccvVar, String str, String[] strArr) {
        this.zza = zzcbkVar;
        this.zzb = zzccvVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzu.B.f10576z.zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzt.f10496l.post(new zzccm(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final y9.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbM)).booleanValue() && (this.zzb instanceof zzcde)) {
            return zzbzo.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzccl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzccn.this.zzd();
                }
            });
        }
        return super.zzb();
    }

    public final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
