package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbgn extends zzaxn implements zzbgo {
    public zzbgn() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbgo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (queryLocalInterface instanceof zzbgo) {
            return (zzbgo) queryLocalInterface;
        }
        return new zzbgm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            com.google.android.gms.ads.internal.client.zzbu zzad = com.google.android.gms.ads.internal.client.zzbt.zzad(parcel.readStrongBinder());
            IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
            zzaxo.zzc(parcel);
            zze(zzad, K);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
