package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrt implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzbfx zza;

    public zzbrt(zzbfx zzbfxVar) {
        this.zza = zzbfxVar;
        try {
            zzbfxVar.zzm();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzp(new ObjectWrapper(view));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return false;
        }
    }
}
