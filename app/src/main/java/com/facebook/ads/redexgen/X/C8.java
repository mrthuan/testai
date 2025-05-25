package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class C8 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C8(int i10, byte[] bArr, int i11, int i12) {
        this.A01 = i10;
        this.A03 = bArr;
        this.A02 = i11;
        this.A00 = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8 c82 = (C8) obj;
        if (this.A01 == c82.A01 && this.A02 == c82.A02 && this.A00 == c82.A00 && Arrays.equals(this.A03, c82.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = result * 31;
        int result2 = Arrays.hashCode(this.A03);
        int result3 = this.A00;
        return ((((i10 + result2) * 31) + this.A02) * 31) + result3;
    }
}
