package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzai {
    public /* synthetic */ zzai(zzo zzoVar, int i10, int i11, float f10, long j10, zzah zzahVar) {
        boolean z10;
        String c = b.a.c("width must be positive, but is: ", i10);
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zze(z10, c);
        zzdi.zze(i11 > 0, "height must be positive, but is: " + i11);
    }
}
