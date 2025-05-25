package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
abstract class zzfr {
    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    public final boolean zzb(byte[] bArr, int i10, int i11) {
        if (zza(0, bArr, i10, i11) != 0) {
            return false;
        }
        return true;
    }
}
