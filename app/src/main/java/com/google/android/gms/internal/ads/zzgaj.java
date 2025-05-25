package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgaj {
    public static long zza(long j10, long j11) {
        boolean z10;
        boolean z11 = true;
        if ((j10 ^ j11) < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j10 + j11;
        if ((j10 ^ j12) < 0) {
            z11 = false;
        }
        if (z10 | z11) {
            return j12;
        }
        throw new ArithmeticException(android.support.v4.media.session.h.e(androidx.activity.r.h("overflow: checkedAdd(", j10, ", "), j11, ")"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r8 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r8 < 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r9 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long zzb(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L59
        L10:
            long r8 = r8 ^ r10
            int[] r6 = com.google.android.gms.internal.ads.zzgai.zza
            int r7 = r12.ordinal()
            r6 = r6[r7]
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r9 = 1
            r8 = r8 | r9
            r7 = 0
            switch(r6) {
                case 1: goto L56;
                case 2: goto L59;
                case 3: goto L4d;
                case 4: goto L53;
                case 5: goto L4a;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L29:
            long r2 = java.lang.Math.abs(r2)
            long r10 = java.lang.Math.abs(r10)
            long r10 = r10 - r2
            long r2 = r2 - r10
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L47
            java.math.RoundingMode r10 = java.math.RoundingMode.HALF_UP
            if (r12 == r10) goto L51
            java.math.RoundingMode r10 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r10) goto L50
            r10 = 1
            long r10 = r10 & r0
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 == 0) goto L50
            goto L51
        L47:
            if (r10 <= 0) goto L50
            goto L51
        L4a:
            if (r8 <= 0) goto L50
            goto L51
        L4d:
            if (r8 >= 0) goto L50
            goto L51
        L50:
            r9 = r7
        L51:
            if (r9 == 0) goto L59
        L53:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L56:
            com.google.android.gms.internal.ads.zzgak.zzb(r7)
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaj.zzb(long, long, java.math.RoundingMode):long");
    }

    public static long zzc(long j10, long j11) {
        zzgak.zza("a", j10);
        zzgak.zza("b", j11);
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j13 = j11 >> numberOfTrailingZeros2;
        while (j12 != j13) {
            long j14 = j12 - j13;
            long j15 = (j14 >> 63) & j14;
            long j16 = (j14 - j15) - j15;
            j12 = j16 >> Long.numberOfTrailingZeros(j16);
            j13 += j15;
        }
        return j12 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long zzd(long j10, long j11) {
        boolean z10;
        boolean z11;
        long j12 = ~j10;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(j12) + Long.numberOfLeadingZeros(j10);
        if (numberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j13 = j10 ^ j11;
        boolean z12 = true;
        if (numberOfLeadingZeros < 64) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j11 != Long.MIN_VALUE) {
            z12 = false;
        }
        long j14 = (j13 >>> 63) + Long.MAX_VALUE;
        if (z10 | (z12 & z11)) {
            return j14;
        }
        long j15 = j10 * j11;
        if (i10 != 0 && j15 / j10 != j11) {
            return j14;
        }
        return j15;
    }
}
