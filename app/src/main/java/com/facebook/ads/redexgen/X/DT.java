package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public final class DT {
    public final String A00;
    public final boolean A01;

    public DT(String str, boolean z10) {
        this.A00 = str;
        this.A01 = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != DT.class) {
            return false;
        }
        DT dt = (DT) obj;
        return TextUtils.equals(this.A00, dt.A00) && this.A01 == dt.A01;
    }

    public final int hashCode() {
        int result = 1 * 31;
        int prime = this.A00 == null ? 0 : this.A00.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        return result2 + prime2;
    }
}
