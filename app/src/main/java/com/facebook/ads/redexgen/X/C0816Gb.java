package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.Gb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0816Gb {
    public final int A00;
    public final int A01;
    public final String A02;

    public C0816Gb(int i10, int i11, String str) {
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0816Gb c0816Gb = (C0816Gb) obj;
        if (this.A00 == c0816Gb.A00 && this.A01 == c0816Gb.A01 && TextUtils.equals(this.A02, c0816Gb.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i10 = result * 31;
        int result2 = this.A01;
        int result3 = (i10 + result2) * 31;
        int result4 = this.A02 != null ? this.A02.hashCode() : 0;
        return result3 + result4;
    }
}
