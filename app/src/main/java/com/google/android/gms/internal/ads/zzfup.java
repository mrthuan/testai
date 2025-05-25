package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfup {
    private final String zza;
    private final zzfun zzb;
    private zzfun zzc;

    public /* synthetic */ zzfup(String str, zzfuo zzfuoVar) {
        zzfun zzfunVar = new zzfun();
        this.zzb = zzfunVar;
        this.zzc = zzfunVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzfun zzfunVar = this.zzb.zzb;
        String str = "";
        while (zzfunVar != null) {
            Object obj = zzfunVar.zza;
            sb2.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb2.append(obj);
            }
            zzfunVar = zzfunVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzfup zza(Object obj) {
        zzfun zzfunVar = new zzfun();
        this.zzc.zzb = zzfunVar;
        this.zzc = zzfunVar;
        zzfunVar.zza = obj;
        return this;
    }
}
