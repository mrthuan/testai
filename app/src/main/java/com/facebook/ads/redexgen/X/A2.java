package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class A2 {
    public static String[] A04 = {"", "VtJRvyPxmOImdsyLi4M2", "Gm1PRIYmvz", "uPcs22Bv4Ecng1eDU86bpHQLBlw1u", "FddESRKU", "iRaMLR8dbHBCXOgyzzarEjyYAsYlFtS", "", "bNCmKEz4NkHWTfLh0ykYoXiICiHkm4jm"};
    public static final A2 A05 = new A2(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public A2(float f10) {
        this(f10, 1.0f, false);
    }

    public A2(float f10, float f11, boolean z10) {
        AbstractC0844Hf.A03(f10 > 0.0f);
        AbstractC0844Hf.A03(f11 > 0.0f);
        this.A01 = f10;
        this.A00 = f11;
        this.A02 = z10;
        this.A03 = Math.round(1000.0f * f10);
    }

    public final long A00(long j10) {
        return this.A03 * j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        A2 a22 = (A2) obj;
        if (this.A01 == a22.A01) {
            float f10 = this.A00;
            if (A04[6].length() == 0) {
                String[] strArr = A04;
                strArr[5] = "hwWatJQYKhKE8FUxymmZjRx10ScAWIj";
                strArr[3] = "Hxeg71DMLMKL7cxntL9BIHkxZ6VOo";
                if (f10 == a22.A00) {
                    boolean z10 = this.A02;
                    boolean z11 = a22.A02;
                    if (A04[7].charAt(4) != 'a') {
                        A04[6] = "";
                        if (z10 == z11) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        int result2 = this.A02 ? 1 : 0;
        return (((((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + result2;
    }
}
