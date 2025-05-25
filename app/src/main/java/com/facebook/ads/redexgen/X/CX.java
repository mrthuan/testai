package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public abstract class CX {
    public static CW A00(int i10, long[] jArr, int[] iArr, long j10) {
        int chunkSamplesRemaining = 8192 / i10;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += IK.A04(i12, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[i11];
        int[] iArr2 = new int[i11];
        int originalSampleIndex = 0;
        long[] timestamps = new long[i11];
        int[] flags = new int[i11];
        int i13 = 0;
        int bufferSampleCount = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int rechunkedSampleCount = iArr[i14];
            long j11 = jArr[i14];
            while (rechunkedSampleCount > 0) {
                int min = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j11;
                iArr2[bufferSampleCount] = i10 * min;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = i13 * j10;
                flags[bufferSampleCount] = 1;
                j11 += iArr2[bufferSampleCount];
                i13 += min;
                rechunkedSampleCount -= min;
                bufferSampleCount++;
            }
        }
        return new CW(jArr2, iArr2, originalSampleIndex, timestamps, flags, j10 * i13);
    }
}
