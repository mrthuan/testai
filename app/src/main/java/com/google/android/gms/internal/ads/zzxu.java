package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzxu {
    public final zzcd zza;
    public final int[] zzb;

    public zzxu(zzcd zzcdVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzea.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcdVar;
        this.zzb = iArr;
    }
}
