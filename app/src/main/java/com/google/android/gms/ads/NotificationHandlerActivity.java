package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzaw zzawVar = zzay.f10107f.f10109b;
            zzboi zzboiVar = new zzboi();
            zzawVar.getClass();
            zzbsg a10 = zzaw.a(this, zzboiVar);
            if (a10 == null) {
                zzm.c("OfflineUtils is null");
            } else {
                a10.zze(getIntent());
            }
        } catch (RemoteException e10) {
            zzm.c("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
