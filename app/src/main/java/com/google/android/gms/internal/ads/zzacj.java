package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzacj implements zzadp {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ int zzf(zzp zzpVar, int i10, boolean z10) {
        return zzadn.zza(this, zzpVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final int zzg(zzp zzpVar, int i10, boolean z10, int i11) {
        int zza = zzpVar.zza(this.zza, 0, Math.min(4096, i10));
        if (zza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzq(zzek zzekVar, int i10) {
        zzadn.zzb(this, zzekVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzr(zzek zzekVar, int i10, int i11) {
        zzekVar.zzL(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzl(zzaf zzafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzs(long j10, int i10, int i11, int i12, zzado zzadoVar) {
    }
}
