package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzef extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzei zza;

    public zzef(zzei zzeiVar) {
        this.zza = zzeiVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z10;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzei zzeiVar = this.zza;
        if (true == z10) {
            i10 = 10;
        }
        zzei.zzc(zzeiVar, i10);
    }
}
