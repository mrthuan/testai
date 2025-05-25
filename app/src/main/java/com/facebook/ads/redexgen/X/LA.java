package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class LA {
    public static byte[] A00;
    public static String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final Map<EnumC0896Jj, EnumC0898Jl> A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{104, 74, Field.FILESIZE, 12, Field.SHAPE, 11, Field.NOTEREF, Field.AUTOTEXTLIST, 78, 74, Field.SHAPE, 78, 11, 106, Field.AUTOTEXT, 120, Field.SECTIONPAGES, Field.ADDIN, 78, 11, Field.GREETINGLINE, Field.HYPERLINK, Field.SECTIONPAGES, Field.FILESIZE, 76, 11, Field.SHAPE, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.HYPERLINK, 11, Field.BIDIOUTLINE, Field.SECTIONPAGES, Field.AUTOTEXT, Field.SHAPE, Field.INCLUDEPICTURE, 11, 74, Field.FILESIZE, Field.AUTOTEXT, 11, Field.INCLUDEPICTURE, 78, Field.SECTIONPAGES, 76, Field.INCLUDEPICTURE, Field.SHAPE, 5, Field.GOTOBUTTON, 9, 12, 9, 8, 16, 9, Field.FORMCHECKBOX, Field.ASK, 3, Field.AUTONUMOUT, 14, 29, 2, Field.FORMCHECKBOX, 19, 30, 23, 2, Field.TOA};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(EnumC0896Jj.A09, EnumC0898Jl.A0D);
        A02.put(EnumC0896Jj.A07, EnumC0898Jl.A0F);
        A02.put(EnumC0896Jj.A06, EnumC0898Jl.A0E);
    }

    public static AdSize A00(EnumC0896Jj enumC0896Jj) {
        return AdSize.fromWidthAndHeight(enumC0896Jj.A04(), enumC0896Jj.A03());
    }

    public static AdSize A01(EnumC0898Jl enumC0898Jl) {
        for (Map.Entry<EnumC0896Jj, EnumC0898Jl> entry : A02.entrySet()) {
            if (entry.getValue() == enumC0898Jl) {
                EnumC0896Jj key = entry.getKey();
                if (A01[3].charAt(31) != 'z') {
                    String[] strArr = A01;
                    strArr[5] = "vUJqh";
                    strArr[7] = "m1G2X";
                    return A00(key);
                }
                throw new RuntimeException();
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static EnumC0896Jj A02(int i10) {
        switch (i10) {
            case 4:
                return EnumC0896Jj.A05;
            case 5:
                return EnumC0896Jj.A06;
            case 6:
                return EnumC0896Jj.A07;
            case 7:
                return EnumC0896Jj.A09;
            case 100:
                return EnumC0896Jj.A08;
            default:
                throw new IllegalArgumentException(A06(48, 20, 117));
        }
    }

    public static EnumC0896Jj A03(int i10, int i11) {
        if (EnumC0896Jj.A08.A03() == i11 && EnumC0896Jj.A08.A04() == i10) {
            return EnumC0896Jj.A08;
        }
        if (EnumC0896Jj.A05.A03() == i11) {
            int A04 = EnumC0896Jj.A05.A04();
            String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (A04 == i10) {
                return EnumC0896Jj.A05;
            }
        }
        if (EnumC0896Jj.A06.A03() == i11 && EnumC0896Jj.A06.A04() == i10) {
            return EnumC0896Jj.A06;
        }
        if (EnumC0896Jj.A07.A03() == i11 && EnumC0896Jj.A07.A04() == i10) {
            return EnumC0896Jj.A07;
        }
        if (EnumC0896Jj.A09.A03() == i11) {
            EnumC0896Jj enumC0896Jj = EnumC0896Jj.A09;
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (enumC0896Jj.A04() == i10) {
                return EnumC0896Jj.A09;
            }
        }
        throw new IllegalArgumentException(A06(0, 48, 57));
    }

    public static EnumC0896Jj A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC0898Jl A05(EnumC0896Jj enumC0896Jj) {
        EnumC0898Jl adTemplate = A02.get(enumC0896Jj);
        if (adTemplate == null) {
            return EnumC0898Jl.A0G;
        }
        return adTemplate;
    }
}
