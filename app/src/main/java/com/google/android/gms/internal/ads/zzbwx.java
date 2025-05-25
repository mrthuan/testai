package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbwx extends zzbwc {
    private final String zza;
    private final int zzb;

    public zzbwx(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final String zzf() {
        return this.zza;
    }

    public zzbwx(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }
}
