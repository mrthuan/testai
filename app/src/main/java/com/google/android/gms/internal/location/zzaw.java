package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzaw extends zzaj {
    private BaseImplementation.ResultHolder<Status> zza;

    public zzaw(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i10, String[] strArr) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        if ((i10 < 0 || i10 > 1) && (i10 < 1000 || i10 >= 1006)) {
            i10 = 1;
        }
        if (i10 == 1) {
            i10 = 13;
        }
        this.zza.setResult(new Status(i10, null, null, null));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i10, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i10, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }
}
