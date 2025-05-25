package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class UO extends AbstractC1022Oi {
    public static byte[] A00;

    static {
        A0D();
    }

    public static String A0C(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A00 = new byte[]{106, 111, 111, 110, Byte.MAX_VALUE, 106, 98, 103, 120};
    }

    public abstract void A14();

    public abstract void A15();

    public abstract void A16();

    public abstract boolean A17();

    public abstract boolean A18();

    public UO(C1026Om c1026Om, boolean z10) {
        super(c1026Om, z10);
        if (C0877Im.A12(c1026Om.A05())) {
            if (c1026Om.A09() != null) {
                c1026Om.A09().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A13() {
        if (C0877Im.A12(this.A06.A05()) && this.A06.A09() != null) {
            this.A06.A09().setCTAClickListener(getCtaButton());
        }
    }

    public void setAdDetailsClickListener(OE oe2) {
        if (C0877Im.A12(this.A06.A05()) && oe2 != null) {
            oe2.setOnClickListener(AbstractC1019Of.A03(getCtaButton(), A0C(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(QK qk2) {
    }
}
