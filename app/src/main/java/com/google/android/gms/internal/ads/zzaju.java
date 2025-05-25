package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaju {
    public static void zza(zzajv zzajvVar, zzajz zzajzVar, zzdn zzdnVar) {
        for (int i10 = 0; i10 < zzajvVar.zza(); i10++) {
            long zzb = zzajvVar.zzb(i10);
            List zzc = zzajvVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i10 != zzajvVar.zza() - 1) {
                    long zzb2 = zzajvVar.zzb(i10 + 1) - zzajvVar.zzb(i10);
                    if (zzb2 > 0) {
                        zzdnVar.zza(new zzajs(zzc, zzb, zzb2));
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
