package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfvc extends zzfvf {
    public zzfvc(zzfvd zzfvdVar, zzfvh zzfvhVar, CharSequence charSequence) {
        super(zzfvhVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzd(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzfvf) this).zzb.length()) {
            return i11;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzc(int i10) {
        return i10;
    }
}
