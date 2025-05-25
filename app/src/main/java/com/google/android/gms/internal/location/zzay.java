package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
final class zzay extends zzan {
    private BaseImplementation.ResultHolder<LocationSettingsResult> zza;

    public zzay(BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder) {
        boolean z10;
        if (resultHolder != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.a("listener can't be null.", z10);
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        this.zza.setResult(locationSettingsResult);
        this.zza = null;
    }
}
