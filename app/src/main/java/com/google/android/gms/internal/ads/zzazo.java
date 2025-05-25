package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzazo extends zzaxn implements zzazp {
    public zzazo() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzazw zzazuVar;
        switch (i10) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbu zze = zze();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzazt) {
                        zzazt zzaztVar = (zzazt) queryLocalInterface;
                    }
                }
                zzaxo.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzazuVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof zzazw) {
                        zzazuVar = (zzazw) queryLocalInterface2;
                    } else {
                        zzazuVar = new zzazu(readStrongBinder2);
                    }
                }
                zzaxo.zzc(parcel);
                zzi(K, zzazuVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdn zzf = zzf();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzf);
                return true;
            case 6:
                boolean zzg = zzaxo.zzg(parcel);
                zzaxo.zzc(parcel);
                zzg(zzg);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdg K2 = com.google.android.gms.ads.internal.client.zzdf.K(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzh(K2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
