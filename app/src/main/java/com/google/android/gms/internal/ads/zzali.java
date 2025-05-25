package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzali {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzek zzc = new zzek();
    private final StringBuilder zzd = new StringBuilder();

    public static String zza(zzek zzekVar, StringBuilder sb2) {
        zzc(zzekVar);
        if (zzekVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzekVar, sb2);
        if (!"".equals(zzd)) {
            return zzd;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) zzekVar.zzm());
        return sb3.toString();
    }

    public static void zzc(zzek zzekVar) {
        while (true) {
            for (boolean z10 = true; zzekVar.zzb() > 0 && z10; z10 = false) {
                char c = (char) zzekVar.zzM()[zzekVar.zzd()];
                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                    int zzd = zzekVar.zzd();
                    int zze = zzekVar.zze();
                    byte[] zzM = zzekVar.zzM();
                    if (zzd + 2 <= zze) {
                        int i10 = zzd + 1;
                        if (zzM[zzd] == 47) {
                            int i11 = i10 + 1;
                            if (zzM[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= zze) {
                                        break;
                                    } else if (((char) zzM[i11]) == '*' && ((char) zzM[i12]) == '/') {
                                        zze = i12 + 1;
                                        i11 = zze;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                zzekVar.zzL(zze - zzekVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    zzekVar.zzL(1);
                }
            }
            return;
        }
    }

    private static String zzd(zzek zzekVar, StringBuilder sb2) {
        sb2.setLength(0);
        int zzd = zzekVar.zzd();
        int zze = zzekVar.zze();
        loop0: while (true) {
            for (boolean z10 = false; zzd < zze && !z10; z10 = true) {
                char c = (char) zzekVar.zzM()[zzd];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb2.append(c);
                    zzd++;
                }
            }
        }
        zzekVar.zzL(zzd - zzekVar.zzd());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0317, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (")".equals(zza(r3, r4)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzek r18) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzali.zzb(com.google.android.gms.internal.ads.zzek):java.util.List");
    }
}
