package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgyw {
    public static final List zza(Object obj, long j10) {
        int i10;
        zzgyk zzgykVar = (zzgyk) zzhaz.zzh(obj, j10);
        if (!zzgykVar.zzc()) {
            int size = zzgykVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzgyk zzf = zzgykVar.zzf(i10);
            zzhaz.zzv(obj, j10, zzf);
            return zzf;
        }
        return zzgykVar;
    }
}
