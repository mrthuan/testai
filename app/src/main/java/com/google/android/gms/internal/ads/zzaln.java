package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaln {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzall
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((zzaln) obj).zzb.zzb, ((zzaln) obj2).zzb.zzb);
            return compare;
        }
    };
    private final zzalo zzb;
    private final int zzc;

    public /* synthetic */ zzaln(zzalo zzaloVar, int i10, zzalm zzalmVar) {
        this.zzb = zzaloVar;
        this.zzc = i10;
    }
}
