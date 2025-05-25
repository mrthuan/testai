package com.facebook.ads.redexgen.X;

import android.net.Uri;

/* loaded from: assets/audience_network.dex */
public final class FS {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final Uri[] A03;

    public FS() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public FS(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
        AbstractC0844Hf.A03(iArr.length == uriArr.length);
        this.A00 = i10;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A01(int r4) {
        /*
            r3 = this;
            int r2 = r4 + 1
        L2:
            int[] r0 = r3.A01
            int r0 = r0.length
            if (r2 >= r0) goto L14
            int[] r0 = r3.A01
            r0 = r0[r2]
            if (r0 == 0) goto L14
            int[] r0 = r3.A01
            r1 = r0[r2]
            r0 = 1
            if (r1 != r0) goto L15
        L14:
            return r2
        L15:
            int r2 = r2 + 1
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FS.A01(int):int");
    }

    public final boolean A02() {
        return this.A00 == -1 || A00() < this.A00;
    }
}
