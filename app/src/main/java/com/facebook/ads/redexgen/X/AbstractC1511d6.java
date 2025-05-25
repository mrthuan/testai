package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.d6  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1511d6 {
    public static byte[] A00;
    public static final C1510d5 A01;
    public static final HS[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Field.AUTOTEXT, Field.MERGESEQ, 80, Field.NOTEREF, 77, 74, 10, 86, Field.SECTION, Field.SECTIONPAGES, Field.NOTEREF, Field.SECTION, Field.FORMCHECKBOX, 80, 10, 78, 82, Field.TOA, 10, 77, 74, 80, Field.SECTION, 86, 74, Field.FILESIZE, Field.NOTEREF, 10, 118, Field.SECTION, Field.SECTIONPAGES, Field.NOTEREF, Field.SECTION, Field.FORMCHECKBOX, 80, 77, Field.MERGESEQ, 74, 98, Field.FILESIZE, Field.FORMCHECKBOX, 80, Field.MERGESEQ, 86, Field.ADDRESSBLOCK, 109, Field.TOA, Field.ADVANCE, Field.NOTEREF};
    }

    static {
        C1510d5 impl;
        try {
            A02();
            Class<?> implClass = Class.forName(A00(0, 49, 40));
            impl = (C1510d5) implClass.newInstance();
        } catch (ClassCastException unused) {
            impl = null;
        } catch (ClassNotFoundException unused2) {
            impl = null;
        } catch (IllegalAccessException unused3) {
            impl = null;
        } catch (InstantiationException unused4) {
            impl = null;
        }
        if (impl == null) {
            impl = new C1510d5();
        }
        A01 = impl;
        A02 = new HS[0];
    }

    public static String A01(AbstractC06006r abstractC06006r) {
        return A01.A03(abstractC06006r);
    }
}
