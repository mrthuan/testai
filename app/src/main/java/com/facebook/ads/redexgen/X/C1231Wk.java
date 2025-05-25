package com.facebook.ads.redexgen.X;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Wk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1231Wk extends HT {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1231Wk A00(File file, HX hx) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 72))) {
            file = A05(file, hx);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            long length = file.length();
            String A0C = hx.A0C(Integer.parseInt(matcher.group(1)));
            if (A0C == null) {
                return null;
            }
            return new C1231Wk(A0C, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file);
        }
        return null;
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{60, 123, Field.QUOTE, 102, 123, 48, Field.DDE, 58, Field.FILESIZE, Field.MACROBUTTON, Field.AUTONUMLGL, 48, Field.GOTOBUTTON, Field.FORMCHECKBOX, Field.AUTONUMLGL, Field.MACROBUTTON, Field.FORMCHECKBOX, Byte.MAX_VALUE, 48, Field.GOTOBUTTON, Field.FORMCHECKBOX, Field.AUTONUMLGL, Field.MACROBUTTON, Field.FORMCHECKBOX, Byte.MAX_VALUE, 48, Field.GOTOBUTTON, Field.FORMCHECKBOX, Field.AUTONUMLGL, 109, 42, Field.FORMCHECKBOX, Field.AUTONUMLGL, 126, 99, 116, Field.BARCODE, 112, 6, 0, 5, 7, 114, 0, 6, 114, 74, 5, 7, 114, 0, 6, 114, 74, 5, 7, 114, 0, Field.HYPERLINK, Field.NUMCHARS, 114, 0, Field.MERGESEQ, 86, Field.SECTION, 10, 99, 21, 97, Field.AUTOTEXTLIST, 22, 20, 97, 19, 21, 97, Field.AUTOTEXTLIST, 22, 20, 97, 19, 21, 97, Field.AUTOTEXTLIST, 22, 20, 97, 19, Field.MERGESEQ, 14, 97, 19, Field.HYPERLINK, Field.FILESIZE, 82, 25};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 6), 32);
        A02 = Pattern.compile(A06(37, 29, 51), 32);
        A03 = Pattern.compile(A06(66, 30, 32), 32);
    }

    public C1231Wk(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static C1231Wk A01(String str, long j10) {
        return new C1231Wk(str, j10, -1L, -9223372036854775807L, null);
    }

    public static C1231Wk A02(String str, long j10) {
        return new C1231Wk(str, j10, -1L, -9223372036854775807L, null);
    }

    public static C1231Wk A03(String str, long j10, long j11) {
        return new C1231Wk(str, j10, j11, -9223372036854775807L, null);
    }

    public static File A04(File file, int i10, long j10, long j11) {
        StringBuilder append = new StringBuilder().append(i10);
        String A06 = A06(0, 1, 15);
        return new File(file, append.append(A06).append(j10).append(A06).append(j11).append(A06(1, 7, 72)).toString());
    }

    public static File A05(File file, HX hx) {
        String filename;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            String filename2 = matcher.group(1);
            filename = IK.A0O(filename2);
            if (filename == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            filename = matcher.group(1);
        }
        File parentFile = file.getParentFile();
        int A08 = hx.A08(filename);
        String filename3 = matcher.group(2);
        long parseLong = Long.parseLong(filename3);
        String filename4 = matcher.group(3);
        File A04 = A04(parentFile, A08, parseLong, Long.parseLong(filename4));
        if (file.renameTo(A04)) {
            return A04;
        }
        return null;
    }

    public final C1231Wk A08(int i10) {
        AbstractC0844Hf.A04(this.A05);
        long currentTimeMillis = System.currentTimeMillis();
        return new C1231Wk(this.A04, this.A02, this.A01, currentTimeMillis, A04(this.A03.getParentFile(), i10, this.A02, currentTimeMillis));
    }
}
