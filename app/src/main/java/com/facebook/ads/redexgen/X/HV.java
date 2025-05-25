package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public abstract class HV {
    public static String[] A00 = {"TbLLw7hS58Wjr59cfeSexk5oWyKF6s7C", "GpOyqB919hS11bb46l", "ubq0AnOQuLQbFAJR29OPJZIs2ZjnF7si", "RjLfiN5mdRoF0cuzHSo7oXSwBpNHH9g7", "VMhO8g9Caz8fI2muTjS3ZOWh9TiJbhjH", "4FvPrXeCmkf57cb8zYzpqv9yeWs0meic", "v7BrBjClyufuhZ3ukRXOOT1kcEOoG0uW", "kgJm8XvDyg2uL2T461lzWo2B48b2iSyN"};

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
        return r8;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0088: INVOKE  (r3 I:com.facebook.ads.redexgen.X.Gz) type: STATIC call: com.facebook.ads.redexgen.X.IK.A0W(com.facebook.ads.redexgen.X.Gz):void, block:B:32:0x0088 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0092: INVOKE  (r3 I:com.facebook.ads.redexgen.X.Gz) type: STATIC call: com.facebook.ads.redexgen.X.IK.A0W(com.facebook.ads.redexgen.X.Gz):void, block:B:36:0x0092 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long A00(com.facebook.ads.redexgen.X.H3 r14, long r15, long r17, com.facebook.ads.redexgen.X.InterfaceC0838Gz r19, byte[] r20, com.facebook.ads.redexgen.X.I8 r21, int r22, com.facebook.ads.redexgen.X.HU r23) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r2 = r14
        L1:
            r1 = r21
            if (r1 == 0) goto La
            r0 = r22
            r1.A01(r0)
        La:
            r3 = r19
            boolean r0 = java.lang.Thread.interrupted()     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            if (r0 != 0) goto L82
            com.facebook.ads.redexgen.X.H3 r4 = new com.facebook.ads.redexgen.X.H3     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            android.net.Uri r5 = r2.A04     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            byte[] r6 = r2.A06     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            long r9 = r2.A03     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            r7 = r15
            long r9 = r9 + r7
            long r0 = r2.A01     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            long r9 = r9 - r0
            java.lang.String r13 = r2.A05     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            int r0 = r2.A00     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            r14 = r0 | 2
            r11 = -1
            r4.<init>(r5, r6, r7, r9, r11, r13, r14)     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            r2 = r4
            long r7 = r3.AEE(r2)     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            r6 = r23
            long r4 = r6.A01     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            r10 = -1
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L42
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 == 0) goto L42
            long r0 = r2.A01     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            long r0 = r0 + r7
            r6.A01 = r0     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
        L42:
            r8 = 0
        L44:
            int r0 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r0 == 0) goto L8d
            boolean r0 = java.lang.Thread.interrupted()     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            if (r0 != 0) goto L7c
            int r0 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            r7 = r20
            if (r0 == 0) goto L5e
            int r0 = r7.length     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            long r4 = (long) r0     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            long r0 = r17 - r8
            long r4 = java.lang.Math.min(r4, r0)     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            int r1 = (int) r4     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            goto L5f
        L5e:
            int r1 = r7.length     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
        L5f:
            r0 = 0
            int r7 = r3.read(r7, r0, r1)     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            r0 = -1
            if (r7 != r0) goto L73
            long r4 = r6.A01     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L8d
            long r0 = r2.A01     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            long r0 = r0 + r8
            r6.A01 = r0     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            goto L8d
        L73:
            long r0 = (long) r7     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            long r8 = r8 + r0
            long r4 = r6.A02     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            long r0 = (long) r7     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            long r4 = r4 + r0
            r6.A02 = r4     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            goto L44
        L7c:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            r0.<init>()     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            throw r0     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
        L82:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            r0.<init>()     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
            throw r0     // Catch: com.facebook.ads.redexgen.X.I7 -> L88 java.lang.Throwable -> L91
        L88:
            com.facebook.ads.redexgen.X.IK.A0W(r3)
            goto L1
        L8d:
            com.facebook.ads.redexgen.X.IK.A0W(r3)
            return r8
        L91:
            r0 = move-exception
            com.facebook.ads.redexgen.X.IK.A0W(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HV.A00(com.facebook.ads.redexgen.X.H3, long, long, com.facebook.ads.redexgen.X.Gz, byte[], com.facebook.ads.redexgen.X.I8, int, com.facebook.ads.redexgen.X.HU):long");
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(H3 h32) {
        return h32.A05 != null ? h32.A05 : A01(h32.A04);
    }

    public static void A03(H3 h32, HP hp2, C1236Wp c1236Wp, byte[] bArr, I8 i82, int i10, HU hu, AtomicBoolean atomicBoolean, boolean z10) throws IOException, InterruptedException {
        HU hu2 = hu;
        AbstractC0844Hf.A01(c1236Wp);
        AbstractC0844Hf.A01(bArr);
        if (hu2 != null) {
            A04(h32, hp2, hu2);
        } else {
            hu2 = new HU();
        }
        String A02 = A02(h32);
        long j10 = h32.A01;
        long start = h32.A02;
        long start2 = start != -1 ? h32.A02 : hp2.A6u(A02);
        while (true) {
            long j11 = 0;
            if (start2 != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long A6e = hp2.A6e(A02, j10, start2 != -1 ? start2 : Long.MAX_VALUE);
                    if (A6e <= 0) {
                        long j12 = -A6e;
                        String[] strArr = A00;
                        if (strArr[0].charAt(10) == strArr[6].charAt(10)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A00;
                        strArr2[0] = "77qYVnkdLN0tfKXQgo4rJmGlA7ZctylX";
                        strArr2[6] = "CkGRSfLM0RLyHx4Ni7P5pgRctjE9bwcv";
                        A6e = j12;
                        if (A00(h32, j10, j12, c1236Wp, bArr, i82, i10, hu2) < A6e) {
                            if (!z10 || start2 == -1) {
                                return;
                            }
                            throw new EOFException();
                        }
                    }
                    j10 += A6e;
                    if (start2 != -1) {
                        j11 = A6e;
                    }
                    start2 -= j11;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(H3 h32, HP hp2, HU hu) {
        long left;
        String A02 = A02(h32);
        long j10 = h32.A01;
        if (h32.A02 != -1) {
            left = h32.A02;
        } else {
            left = hp2.A6u(A02);
        }
        hu.A01 = left;
        hu.A00 = 0L;
        hu.A02 = 0L;
        while (left != 0) {
            long A6e = hp2.A6e(A02, j10, left != -1 ? left : Long.MAX_VALUE);
            if (A6e > 0) {
                hu.A00 += A6e;
            } else {
                A6e = -A6e;
                if (A6e == Long.MAX_VALUE) {
                    return;
                }
            }
            j10 += A6e;
            if (left == -1) {
                A6e = 0;
            }
            left -= A6e;
        }
    }

    public static void A05(HP hp2, String str) {
        for (HT ht : hp2.A6f(str)) {
            try {
                hp2.AFc(ht);
            } catch (HN unused) {
            }
        }
    }
}
