package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgam {
    public static char zza(long j10) {
        boolean z10;
        char c = (char) j10;
        if (c == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfuu.zzg(z10, "Out of range: %s", j10);
        return c;
    }

    public static char zzb(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
