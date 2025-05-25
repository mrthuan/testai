package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeou implements zzevn {
    private final String zza;
    private final boolean zzb;

    public zzeou(String str, boolean z10) {
        this.zza = str;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza != null) {
            Bundle zza = zzffu.zza(bundle, "pii");
            zza.putString("afai", this.zza);
            zza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
