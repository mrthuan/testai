package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzewd implements zzevo {
    private final zzgcu zza;
    private final Context zzb;

    public zzewd(zzgcu zzgcuVar, Context context) {
        this.zza = zzgcuVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzewd.this.zzc();
            }
        });
    }

    public final zzewb zzc() {
        boolean z10;
        int i10;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        int i11 = -1;
        if (com.google.android.gms.ads.internal.util.zzt.a(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = ordinal;
            } else {
                i10 = -1;
            }
            z10 = connectivityManager.isActiveNetworkMetered();
        } else {
            z10 = false;
            i10 = -2;
        }
        return new zzewb(networkOperator, i10, zzuVar.f10555e.h(this.zzb), phoneType, z10, i11);
    }
}
