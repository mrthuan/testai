package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzest implements zzevo {
    private final Context zza;
    private final Intent zzb;

    public zzest(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlQ)).booleanValue()) {
            boolean z10 = false;
            try {
                if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                    z10 = true;
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "HsdpMigrationSignal.isHsdpMigrationSupported");
            }
            return zzgcj.zzh(new zzesu(Boolean.valueOf(z10)));
        }
        return zzgcj.zzh(new zzesu(null));
    }
}
