package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public abstract class zzo extends zzw implements zzp {
    public zzo() {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzw
    public final boolean zzb(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzx.zzb(parcel);
            zza((Bundle) zzx.zza(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
