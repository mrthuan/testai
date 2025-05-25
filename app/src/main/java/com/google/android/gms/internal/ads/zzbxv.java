package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbxv extends zzbyb {
    private final Clock zzb;
    private final zzhfl zzc;
    private final zzhfl zzd;
    private final zzhfl zze;
    private final zzhfl zzf;
    private final zzhfl zzg;
    private final zzhfl zzh;
    private final zzhfl zzi;
    private final zzhfl zzj;

    public /* synthetic */ zzbxv(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbya zzbyaVar, zzbxu zzbxuVar) {
        this.zzb = clock;
        zzhfc zza = zzhfd.zza(context);
        this.zzc = zza;
        zzhfc zza2 = zzhfd.zza(zzgVar);
        this.zzd = zza2;
        this.zze = zzhfb.zzc(new zzbxn(zza, zza2));
        zzhfc zza3 = zzhfd.zza(clock);
        this.zzf = zza3;
        zzhfc zza4 = zzhfd.zza(zzbyaVar);
        this.zzg = zza4;
        zzhfl zzc = zzhfb.zzc(new zzbxp(zza3, zza2, zza4));
        this.zzh = zzc;
        zzbxr zzbxrVar = new zzbxr(zza3, zzc);
        this.zzi = zzbxrVar;
        this.zzj = zzhfb.zzc(new zzbyg(zza, zzbxrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final zzbxm zza() {
        return (zzbxm) this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final zzbxq zzb() {
        return new zzbxq(this.zzb, (zzbxo) this.zzh.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final zzbyf zzc() {
        return (zzbyf) this.zzj.zzb();
    }
}
