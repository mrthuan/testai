package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzetf implements zzevn {
    public final zzfek zza;

    public zzetf(zzfek zzfekVar) {
        this.zza = zzfekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkW)).booleanValue()) {
                bundle.putBoolean("render_in_browser", this.zza.zzd());
                bundle.putBoolean("disable_ml", this.zza.zzc());
            }
        }
    }
}
