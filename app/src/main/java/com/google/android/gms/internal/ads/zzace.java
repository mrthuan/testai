package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzace {
    public final String zza;

    private zzace(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzace zza(zzek zzekVar) {
        String str;
        zzekVar.zzL(2);
        int zzm = zzekVar.zzm();
        int i10 = zzm >> 1;
        int i11 = zzm & 1;
        int zzm2 = zzekVar.zzm() >> 3;
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        int i12 = zzm2 | (i11 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i10);
        if (i12 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(i12);
        return new zzace(i10, i12, sb2.toString());
    }
}
