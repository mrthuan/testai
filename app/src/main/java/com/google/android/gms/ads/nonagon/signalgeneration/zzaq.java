package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzhfc;
import com.google.android.gms.internal.ads.zzhfk;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzaq implements zzhfc {

    /* renamed from: a  reason: collision with root package name */
    public final zzap f10682a;

    public zzaq(zzap zzapVar) {
        this.f10682a = zzapVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        char c;
        zzbbc.zza.EnumC0157zza enumC0157zza;
        String str = this.f10682a.f10681a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        enumC0157zza = zzbbc.zza.EnumC0157zza.AD_INITIATER_UNSPECIFIED;
                    } else {
                        enumC0157zza = zzbbc.zza.EnumC0157zza.REWARD_BASED_VIDEO_AD;
                    }
                } else {
                    enumC0157zza = zzbbc.zza.EnumC0157zza.AD_LOADER;
                }
            } else {
                enumC0157zza = zzbbc.zza.EnumC0157zza.INTERSTITIAL;
            }
        } else {
            enumC0157zza = zzbbc.zza.EnumC0157zza.BANNER;
        }
        zzhfk.zzb(enumC0157zza);
        return enumC0157zza;
    }
}
