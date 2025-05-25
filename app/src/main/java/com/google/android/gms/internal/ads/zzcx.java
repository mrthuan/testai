package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcx extends zzcu {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8 A[LOOP:6: B:38:0x00e8->B:39:0x00ea, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:17:0x003e, B:39:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzct
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcx.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcr zzi(zzcr zzcrVar) {
        int i10 = zzcrVar.zzd;
        if (i10 != 3) {
            if (i10 != 2) {
                if (i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
                    throw new zzcs("Unhandled input format:", zzcrVar);
                }
            } else {
                return zzcr.zza;
            }
        }
        return new zzcr(zzcrVar.zzb, zzcrVar.zzc, 2);
    }
}
