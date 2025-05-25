package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbhc extends RemoteCreator {
    public zzbhc() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbfk) {
            return (zzbfk) queryLocalInterface;
        }
        return new zzbfi(iBinder);
    }

    public final zzbfh zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzbfh zzbffVar;
        try {
            IBinder zze = ((zzbfk) getRemoteCreatorInstance(context)).zze(new ObjectWrapper(context), new ObjectWrapper(frameLayout), new ObjectWrapper(frameLayout2), 242402000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzbfh) {
                zzbffVar = (zzbfh) queryLocalInterface;
            } else {
                zzbffVar = new zzbff(zze);
            }
            return zzbffVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }
}
