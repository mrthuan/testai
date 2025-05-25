package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzfm extends zzfo {
    public zzfm(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzfp.zzE(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j10, b10);
        } else {
            zzfp.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zze(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final boolean zzg(Object obj, long j10) {
        if (zzfp.zzb) {
            return zzfp.zzt(obj, j10);
        }
        return zzfp.zzu(obj, j10);
    }
}
