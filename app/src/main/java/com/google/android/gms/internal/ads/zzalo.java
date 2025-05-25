package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalo {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzalo(String str, int i10, String str2, Set set) {
        this.zzb = i10;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzalo zza(String str, int i10) {
        String str2;
        String trim = str.trim();
        zzdi.zzd(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        int i11 = zzet.zza;
        String[] split = trim.split("\\.", -1);
        String str3 = split[0];
        HashSet hashSet = new HashSet();
        for (int i12 = 1; i12 < split.length; i12++) {
            hashSet.add(split[i12]);
        }
        return new zzalo(str3, i10, str2, hashSet);
    }

    public static zzalo zzb() {
        return new zzalo("", 0, "", Collections.emptySet());
    }
}
