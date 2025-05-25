package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Iy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0887Iy {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", "n", "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC0884Iv A01 = EnumC0884Iv.A03;
    public EnumC0885Iw A02 = EnumC0885Iw.A06;
    public EnumC0886Ix A03 = EnumC0886Ix.A02;
    public EnumC0883Iu A00 = EnumC0883Iu.A02;

    public final void A00() {
        this.A00 = EnumC0883Iu.A03;
    }

    public final void A01() {
        this.A02 = EnumC0885Iw.A04;
    }

    public final void A02() {
        this.A02 = EnumC0885Iw.A05;
    }

    public final void A03() {
        this.A03 = EnumC0886Ix.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC0885Iw.A06) {
            EnumC0885Iw enumC0885Iw = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC0885Iw != EnumC0885Iw.A02 && this.A02 != EnumC0885Iw.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC0885Iw.A06 || this.A02 == EnumC0885Iw.A02;
    }

    public final boolean A06() {
        return this.A03 == EnumC0886Ix.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC0883Iu.A03;
    }
}
