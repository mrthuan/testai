package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzakq {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzakq(int i10, int i11, int i12, int i13, int i14) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzakq zza(String str) {
        boolean z10;
        zzdi.zzd(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            int length = split.length;
            if (i10 < length) {
                String zza = zzfuf.zza(split[i10].trim());
                switch (zza.hashCode()) {
                    case 100571:
                        if (zza.equals("end")) {
                            z10 = true;
                            break;
                        }
                        z10 = true;
                        break;
                    case 3556653:
                        if (zza.equals("text")) {
                            z10 = true;
                            break;
                        }
                        z10 = true;
                        break;
                    case 109757538:
                        if (zza.equals("start")) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        break;
                    case 109780401:
                        if (zza.equals("style")) {
                            z10 = true;
                            break;
                        }
                        z10 = true;
                        break;
                    default:
                        z10 = true;
                        break;
                }
                if (z10) {
                    if (!z10) {
                        if (!z10) {
                            if (z10) {
                                i14 = i10;
                            }
                        } else {
                            i13 = i10;
                        }
                    } else {
                        i12 = i10;
                    }
                } else {
                    i11 = i10;
                }
                i10++;
            } else if (i11 != -1 && i12 != -1 && i14 != -1) {
                return new zzakq(i11, i12, i13, i14, length);
            } else {
                return null;
            }
        }
    }
}
