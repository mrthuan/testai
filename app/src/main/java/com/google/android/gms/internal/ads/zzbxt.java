package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbxt {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbya zzd;

    private zzbxt() {
        throw null;
    }

    public /* synthetic */ zzbxt(zzbxs zzbxsVar) {
    }

    public final zzbxt zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbxt zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbxt zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzbxt zzd(zzbya zzbyaVar) {
        this.zzd = zzbyaVar;
        return this;
    }

    public final zzbyb zze() {
        zzhfk.zzc(this.zza, Context.class);
        zzhfk.zzc(this.zzb, Clock.class);
        zzhfk.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhfk.zzc(this.zzd, zzbya.class);
        return new zzbxv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
