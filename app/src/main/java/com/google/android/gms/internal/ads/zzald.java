package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzald {
    public static zzale zza(zzale zzaleVar, String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (zzaleVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzale) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzale zzaleVar2 = new zzale();
                while (i10 < length2) {
                    zzaleVar2.zzl((zzale) map.get(strArr[i10]));
                    i10++;
                }
                return zzaleVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            zzaleVar.zzl((zzale) map.get(strArr[0]));
            return zzaleVar;
        } else if (strArr != null && (length = strArr.length) > 1) {
            while (i10 < length) {
                zzaleVar.zzl((zzale) map.get(strArr[i10]));
                i10++;
            }
        }
        return zzaleVar;
    }
}
