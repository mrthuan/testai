package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class AP {
    public static String[] A02 = {"z5cWhBKwyfDPSiydbjddEPZfwt53ja0x", "cRtyb", "3nl2uEmm3Y6v2r6DUjAJFGqyxF5bM8Tl", "Xh7r", "szA3L8LMw85djaignONCiRG8", "IkzVIE", "xrsAK", "aL7FDs2Gv9osoDuKJqGKfwNkNHCE1i97"};
    public final int A00;
    public final Et A01;

    public AP(int i10, Et et) {
        this.A00 = i10;
        this.A01 = et;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AP ap2 = (AP) obj;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[3].length()) {
            String[] strArr2 = A02;
            strArr2[2] = "kxld16OEBNgi84xJjJHT7I1GCW5BWB1v";
            strArr2[0] = "YhTGjjkd4nQlp6zPvBFYrrZ7l65Vw2gm";
            if (this.A00 == ap2.A00) {
                Et et = this.A01;
                if (A02[7].charAt(9) != '6') {
                    String[] strArr3 = A02;
                    strArr3[5] = "HGjNL7";
                    strArr3[3] = "NcRh";
                    if (et.equals(ap2.A01)) {
                        return true;
                    }
                } else {
                    String[] strArr4 = A02;
                    strArr4[6] = "oEAqE";
                    strArr4[1] = "ZR52c";
                    if (et.equals(ap2.A01)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
