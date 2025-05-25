package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbsk extends RemoteCreator {
    public zzbsk() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbsq) {
            return (zzbsq) queryLocalInterface;
        }
        return new zzbso(iBinder);
    }

    public final zzbsn zza(Activity activity) {
        zzbsn zzbslVar;
        try {
            IBinder zze = ((zzbsq) getRemoteCreatorInstance(activity)).zze(new ObjectWrapper(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbsn) {
                zzbslVar = (zzbsn) queryLocalInterface;
            } else {
                zzbslVar = new zzbsl(zze);
            }
            return zzbslVar;
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        } catch (RemoteCreator.RemoteCreatorException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }
}
