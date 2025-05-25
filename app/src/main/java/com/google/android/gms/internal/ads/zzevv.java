package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzevv implements zzevn {
    private final int zza;
    private final int zzb;

    public zzevv(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("sessions_without_flags", this.zza);
        bundle.putInt("crashes_without_flags", this.zzb);
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f10107f;
        if (com.google.android.gms.ads.internal.client.zzba.f10115d.c.zze()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
