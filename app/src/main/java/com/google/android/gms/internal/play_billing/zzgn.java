package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzgn implements zzcw {
    static final zzcw zza = new zzgn();

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final boolean zza(int i10) {
        zzgo zzgoVar;
        zzgo zzgoVar2 = zzgo.BROADCAST_ACTION_UNSPECIFIED;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        zzgoVar = null;
                    } else {
                        zzgoVar = zzgo.ALTERNATIVE_BILLING_ACTION;
                    }
                } else {
                    zzgoVar = zzgo.LOCAL_PURCHASES_UPDATED_ACTION;
                }
            } else {
                zzgoVar = zzgo.PURCHASES_UPDATED_ACTION;
            }
        } else {
            zzgoVar = zzgo.BROADCAST_ACTION_UNSPECIFIED;
        }
        if (zzgoVar != null) {
            return true;
        }
        return false;
    }
}
