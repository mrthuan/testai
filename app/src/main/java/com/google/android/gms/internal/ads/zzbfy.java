package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbfy {
    private final zzbfx zza;

    public zzbfy(zzbfx zzbfxVar) {
        Context context;
        this.zza = zzbfxVar;
        try {
            context = (Context) ObjectWrapper.L0(zzbfxVar.zzh());
        } catch (RemoteException | NullPointerException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(new ObjectWrapper(new MediaView(context)));
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
        }
    }

    public final zzbfx zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }
}
