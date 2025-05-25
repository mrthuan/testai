package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzboi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            zzaw zzawVar = zzay.f10107f.f10109b;
            zzboi zzboiVar = new zzboi();
            zzawVar.getClass();
            zzaw.a(this, zzboiVar).zze(intent);
        } catch (RemoteException e10) {
            zzm.c("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
