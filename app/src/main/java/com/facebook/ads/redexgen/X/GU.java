package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class GU {
    public static byte[] A04;
    public static String[] A05 = {"JhUegHxCNjOzCxSr", "5gQD8Y8UzOmVvx7", "QqvGYdLSjaASY2OhI4i6KQ0w0ePoKf8h", "WBkkAIsrii16acJ5rPC2mCALWvIHjj77", "I0VCU9c7aI83", "rLOqK8wyyMztHLJUVhhhpDxqL", "Qb", "hV"};
    public static final String[] A06;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String[] A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{Field.AUTONUMOUT, 101, 23};
    }

    static {
        A03();
        A06 = new String[0];
    }

    public GU(String str, int i10, String str2, String[] strArr) {
        this.A00 = i10;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = strArr;
    }

    public static GU A00() {
        String A02 = A02(0, 0, 72);
        return new GU(A02, 0, A02, new String[0]);
    }

    public static GU A01(String str, int i10) {
        String trim;
        String[] strArr;
        String trim2 = str.trim();
        if (trim2.isEmpty()) {
            return null;
        }
        int indexOf = trim2.indexOf(A02(0, 1, 2));
        if (indexOf == -1) {
            trim = A02(0, 0, 72);
        } else {
            trim = trim2.substring(indexOf).trim();
            if (A05[4].length() == 12) {
                A05[0] = "AC4YCOMzy3EpJr";
                trim2 = trim2.substring(0, indexOf);
            }
            throw new RuntimeException();
        }
        String[] A0l = IK.A0l(trim2, A02(1, 2, 47));
        String voice = A05[3];
        if (voice.charAt(13) != 'L') {
            A05[3] = "AognuA3Gp5BMXUBAwXIZSKPi0LSslNIr";
            String name = A0l[0];
            if (A0l.length > 1) {
                strArr = (String[]) Arrays.copyOfRange(A0l, 1, A0l.length);
            } else {
                strArr = A06;
            }
            return new GU(name, i10, trim, strArr);
        }
        throw new RuntimeException();
    }
}
