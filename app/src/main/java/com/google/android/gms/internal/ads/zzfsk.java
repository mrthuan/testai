package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfsk extends zzaxn implements zzfsl {
    public zzfsk() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzaxo.zzc(parcel);
            zzb((Bundle) zzaxo.zza(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
