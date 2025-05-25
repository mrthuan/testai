package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: assets/audience_network.dex */
public final class JZ {
    public static byte[] A00;
    public static String[] A01 = {"t11qfTcdRX3vtzWg9o3D7yzOQIlsgekI", "6i20agDhmSdy9vSyuA65WoFMQBMnYQqu", "rdyvRl0mnrLy9iBwCAplKJJzDaMabc0M", "SOZt7VgRETJYcVg4", "xbstiP5KKiAzncux", "VTcuBCbEWMb14OGNQVtfuGUmCLIRmz1L", "NW0LuK6Vb9eH6jcO6lyYeFn7KSHSxynw", "5brGPIOfpSxIScBaveghLVMlb1271YeU"};
    public static final /* synthetic */ JZ[] A02;
    public static final JZ A03;
    public static final JZ A04;
    public static final JZ A05;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Field.HYPERLINK, Field.AUTOTEXTLIST, Field.LISTNUM, Field.ADDRESSBLOCK, Field.TOA, 80, Field.NOTEREF, 98, 107, 107, 2, 3};
    }

    static {
        A02();
        A03 = new JZ(A01(0, 7, 61), 0);
        A05 = new JZ(A01(10, 2, 108), 1);
        A04 = new JZ(A01(7, 3, 12), 2);
        A02 = A03();
    }

    public JZ(String str, int i10) {
    }

    public static VideoAutoplayBehavior A00(JZ jz) {
        if (jz == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        switch (jz) {
            case A03:
                VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(31) != 'u') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "tGhoRPzzdwkU9rBMhrkq51QPgJKMKCG7";
                strArr[7] = "oLzw2E9OShYSASB843fXRAiyIcSfpUGD";
                return videoAutoplayBehavior;
            case A05:
                return VideoAutoplayBehavior.ON;
            case A04:
                return VideoAutoplayBehavior.OFF;
            default:
                return VideoAutoplayBehavior.DEFAULT;
        }
    }

    public static /* synthetic */ JZ[] A03() {
        JZ[] jzArr = new JZ[3];
        jzArr[0] = A03;
        if (A01[5].charAt(31) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "zoiTRupMudK7uDXw";
        strArr[4] = "VFYrxWbIb3tlnjHn";
        jzArr[1] = A05;
        jzArr[2] = A04;
        return jzArr;
    }

    public static JZ valueOf(String str) {
        return (JZ) Enum.valueOf(JZ.class, str);
    }

    public static JZ[] values() {
        return (JZ[]) A02.clone();
    }
}
