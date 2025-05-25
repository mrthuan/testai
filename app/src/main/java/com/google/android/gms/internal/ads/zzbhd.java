package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbhd extends RemoteCreator {
    public zzbhd() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzbfq) {
            return (zzbfq) queryLocalInterface;
        }
        return new zzbfo(iBinder);
    }

    public final zzbfn zza(View view, HashMap hashMap, HashMap hashMap2) {
        zzbfn zzbflVar;
        try {
            IBinder zze = ((zzbfq) getRemoteCreatorInstance(view.getContext())).zze(new ObjectWrapper(view), new ObjectWrapper(hashMap), new ObjectWrapper(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzbfn) {
                zzbflVar = (zzbfn) queryLocalInterface;
            } else {
                zzbflVar = new zzbfl(zze);
            }
            return zzbflVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }
}
