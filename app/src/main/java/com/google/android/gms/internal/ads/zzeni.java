package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeni implements zzevo {
    private final Context zza;

    public zzeni(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzcD)).booleanValue()) {
            if (androidx.core.content.a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return zzgcj.zzh(new zzenj(z10));
        }
        return zzgcj.zzh(null);
    }
}
