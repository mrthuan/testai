package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class zzdi extends zzaxn implements zzdj {
    public zzdi() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String readString = parcel.readString();
            IObjectWrapper K = IObjectWrapper.Stub.K(parcel.readStrongBinder());
            IObjectWrapper K2 = IObjectWrapper.Stub.K(parcel.readStrongBinder());
            zzaxo.zzc(parcel);
            zze(readString, K, K2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
