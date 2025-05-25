package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
abstract class zznw {
    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    public final boolean zzb(byte[] bArr, int i10, int i11) {
        if (zza(0, bArr, i10, i11) != 0) {
            return false;
        }
        return true;
    }
}
