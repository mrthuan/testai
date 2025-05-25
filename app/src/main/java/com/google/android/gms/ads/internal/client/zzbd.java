package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class zzbd extends zzaxn implements zzbe {
    public zzbd() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            ((zzb) this).zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
