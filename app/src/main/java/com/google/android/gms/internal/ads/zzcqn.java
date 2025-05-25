package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcqn implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;

    public zzcqn(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* synthetic */ Object zzb() {
        boolean booleanValue = ((zzcqt) this.zza).zzb().booleanValue();
        zzeif zzb = ((zzeig) this.zzb).zzb();
        zzekf zzb2 = ((zzekg) this.zzc).zzb();
        if (true != booleanValue) {
            return zzb2;
        }
        return zzb;
    }
}
