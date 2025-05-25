package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdxc implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzdxc(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.a((Context) this.zza.zzb()).c(0, ((zzdwy) this.zzb).zzb().packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
