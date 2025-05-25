package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzegy implements zzdgx {
    private final zzfel zza;
    private final zzbql zzb;
    private final AdFormat zzc;
    private zzcxi zzd = null;

    public zzegy(zzfel zzfelVar, zzbql zzbqlVar, AdFormat adFormat) {
        this.zza = zzfelVar;
        this.zzb = zzbqlVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdgx
    public final void zza(boolean z10, Context context, zzcxd zzcxdVar) {
        boolean zzs;
        try {
            int ordinal = this.zzc.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzs = this.zzb.zzr(new ObjectWrapper(context));
                    }
                    throw new zzdgw("Adapter failed to show.");
                }
                zzs = this.zzb.zzt(new ObjectWrapper(context));
            } else {
                zzs = this.zzb.zzs(new ObjectWrapper(context));
            }
            if (zzs) {
                if (this.zzd != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbm)).booleanValue() && this.zza.zzY == 2) {
                        this.zzd.zza();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new zzdgw("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdgw(th2);
        }
    }

    public final void zzb(zzcxi zzcxiVar) {
        this.zzd = zzcxiVar;
    }
}
