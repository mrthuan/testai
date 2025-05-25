package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class Et {
    public static String[] A04 = {"QJblDe3wVK6feXal4ldrY3QcOGG4UkHt", "2zepy1PmZTCf4jSxyWiaVOuG1uYDUhxq", "yYSZkIRTXInaVK1F9QQ9YZR4hxi7L96x", "9Bt0bU", "BsbuUwvwQ1kbtWiwTekQfziPaSue0dsw", "yLqexVAazno3TL8TDAW38tYF3t4XrW", "8DUKE7RXBSYmkSj7feSXhV2S4GEg6t2h", "8s5VPXlVl4Lwrm8gOC5ZhnLqGhthAU"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public Et(int i10) {
        this(i10, -1L);
    }

    public Et(int i10, int i11, int i12, long j10) {
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
        this.A03 = j10;
    }

    public Et(int i10, long j10) {
        this(i10, -1, -1, j10);
    }

    public final Et A00(int i10) {
        if (this.A02 == i10) {
            return this;
        }
        return new Et(i10, this.A00, this.A01, this.A03);
    }

    public final boolean A01() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Et et = (Et) obj;
        if (this.A02 == et.A02 && this.A00 == et.A00) {
            int i10 = this.A01;
            String[] strArr = A04;
            if (strArr[2].charAt(6) != strArr[6].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "3akbSKdkYbqYqb8XM8EoWhMtdFIZ3n";
            strArr2[5] = "92eUK6p4zC0e1AjStm6aKeEHBLYU05";
            if (i10 == et.A01 && this.A03 == et.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = this.A01;
        return (((((((17 * 31) + result) * 31) + this.A00) * 31) + result2) * 31) + ((int) this.A03);
    }
}
