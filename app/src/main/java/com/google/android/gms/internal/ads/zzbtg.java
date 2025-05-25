package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbtg extends zzbtb {
    final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbtg(zzbtk zzbtkVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zze(String str) {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzf(List list) {
        Uri uri = (Uri) list.get(0);
        this.zza.getClass();
    }
}
