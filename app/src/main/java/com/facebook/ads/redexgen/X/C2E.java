package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.2E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2E {
    public static byte[] A00;
    public static String[] A01 = {"eCm2h", "Nf7MRRwZDvE8y93FmZbCxZ1qYSmL5", "hLhdl", "QFLrF4Ks", "BOssa91vTI1SLJXUpFqc70oF1BItrBHL", "FqkYvgsNMANULI15i6yaohJxBf4", "miT1Gr55rzSuK5J6MchCspbbNM8vv", "VeGA9hanV"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] ^ i12) ^ 8;
            String[] strArr = A01;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "4uOWgwLt9zl0NDLT0ztu7wfG2sM7UGLh";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {99, 102, Field.ADDRESSBLOCK, 103, 122, 114, 103, 112, 107, 103, 108, 97, 103, Field.ADDRESSBLOCK, 97, 109, 108, 100, 107, 101, Field.ADDRESSBLOCK, 107, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 32, Field.PAGEREF, 30, 36, Field.SYMBOL, Field.EQ, 36, Field.MACROBUTTON, Field.DATA, 36, Field.GLOSSARY, 34, 36, 30, 34, Field.DDEAUTO, Field.GLOSSARY, Field.FILLIN, Field.DATA, Field.ASK, 30, Field.MACROBUTTON, 36, Field.AUTONUM, 32, Field.MACROBUTTON, Field.PAGEREF, 36, Field.PAGEREF, 30, Field.DATA, Field.GLOSSARY, Field.AUTONUMLGL, 36, Field.MACROBUTTON, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.DATA, Field.AUTONUMLGL, Field.DATA, 32, Field.DDE};
        String[] strArr = A01;
        if (strArr[0].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "XJhKJAm65tduHMV7V8mUfKCv645Q9";
        strArr2[5] = "xNMnL7L41pq7X174jFC3Kxd5REO";
        A00 = bArr;
    }

    static {
        A03();
    }

    public static AdExperienceType A00(String str) {
        if (str == null) {
            return null;
        }
        if (A01(0, 33, 10).equals(str)) {
            AdExperienceType adExperienceType = AdExperienceType.AD_EXPERIENCE_TYPE_INTERSTITIAL;
            String[] strArr = A01;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "tWHbMLY0jEAGlYHbcSqJBIrBc18go";
            strArr2[5] = "4H5Z0LJ7wdDYVvSZnKKEqH9oXzt";
            return adExperienceType;
        } else if (A01(33, 42, 73).equals(str)) {
            return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
        } else {
            return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
        }
    }

    public static String A02(AdExperienceType adExperienceType) {
        return adExperienceType.getAdExperienceType();
    }
}
