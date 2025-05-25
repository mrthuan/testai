package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Ll  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0947Ll {
    public static byte[] A00;
    public static String[] A01 = {"LplfTEYRnODnDpz21EneRZRsMargZTNK", "2NrlLG7hqMfWnzI4aYc74QPIxJ4DJ1XR", "L7pmDhfbtl8pdMobHzydLQ1D6YOazgIb", "V9Kuj32Ww6lLhCXMI4XEd9rHt60G9lJq", "k0plFnx6zt0D5xnpu3Hlko5", "WGZsYEfxfTD4T7Cqe3yCHw86dz09xOKF", "rh2k8IOHNldhKVbVonTuZ6bN28ke0n", "kkjOWDxiYS6HSpJcTpvH6ub4oru0qlUQ"};
    public static final Pattern A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{13, 121, 86, 14, Field.INCLUDETEXT, Field.ADDIN, 121, 86, 14, 126, Field.INCLUDETEXT, 8, Field.SHAPE, 11, 120, 14, 12, 126, 100, 8, Byte.MAX_VALUE, 120, 11, 15, 125, Field.MERGESEQ, 76, 76, Field.HTMLCONTROL, 80, 74, 30, 77, 74, Field.SHAPE, Field.ADDRESSBLOCK, Field.DOCPROPERTY, 30, 74, 76, Field.SHAPE, Field.ADDRESSBLOCK, Field.HTMLCONTROL, 77, Field.SECTION, Field.INCLUDEPICTURE, 0, Field.NOTEREF, Field.AUTOTEXT, 77, Field.MERGESEQ, 76, Field.SECTION, Field.SECTION, Field.FILESIZE, 0, Field.AUTOTEXT, 74, Field.ADDRESSBLOCK};
    }

    static {
        A07();
        A02 = Pattern.compile(A02(0, 24, 9));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 18)), -1, -1, false);
    }

    public static String A01(int i10) {
        if (i10 <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i10) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, Throwable th2) {
        int A0K = C0877Im.A0K(context);
        int maxStacktraceLines = C0877Im.A03(context);
        return A06(th2, A0K, maxStacktraceLines, C0877Im.A1X(context));
    }

    public static String A04(String str) {
        Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(Throwable th2, int i10, int i11, boolean z10) {
        String A022 = A02(0, 0, 105);
        if (th2 == null) {
            return A022;
        }
        try {
            C1208Vm c1208Vm = new C1208Vm();
            InterfaceC0945Lj interfaceC0945Lj = c1208Vm;
            String[] strArr = A01;
            if (strArr[4].length() != strArr[6].length()) {
                String[] strArr2 = A01;
                strArr2[4] = "oxxlcYcFfaMihpA7yH6yiqF";
                strArr2[6] = "gkLsRpbpRAovdKGTxU7IYJzRyz6pLt";
                if (i11 >= 0) {
                    interfaceC0945Lj = new C1206Vk(interfaceC0945Lj, i11);
                }
                if (i10 >= 0) {
                    interfaceC0945Lj = new C1205Vj(interfaceC0945Lj, i10, i10);
                }
                if (z10) {
                    interfaceC0945Lj = new C1207Vl(interfaceC0945Lj);
                }
                C1209Vn c1209Vn = new C1209Vn(c1208Vm, 1, interfaceC0945Lj);
                th2.printStackTrace(new PrintWriter(new C0946Lk(c1209Vn)));
                c1209Vn.flush();
                return c1208Vm.toString();
            }
            throw new RuntimeException();
        } catch (Exception unused) {
            return A022;
        }
    }

    public static boolean A08(C0944Li c0944Li) {
        String middle = c0944Li.A02();
        if (middle == null) {
            return false;
        }
        boolean A0A = A0A(middle);
        if (A01[7].charAt(20) != 'o') {
            A01[2] = "GqDFUg33w18rdOydcZHrPduzmWx6ZxUu";
            if (A0A) {
                return true;
            }
            for (String str : c0944Li.A01()) {
                if (A01[2].charAt(10) != '8') {
                    if (A0A(str)) {
                        return true;
                    }
                } else {
                    String[] strArr = A01;
                    strArr[5] = "ZCUrIEQiGOY9U2nVCEFSNgqRdbKvDffQ";
                    strArr[0] = "2Hs1eEyuwWDgIwWONAgBlK6IqUqjA257";
                    if (A0A(str)) {
                        return true;
                    }
                }
            }
            for (String middle2 : c0944Li.A00()) {
                if (A0A(middle2)) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException();
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 2));
    }
}
