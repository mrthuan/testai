package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.95  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum AnonymousClass95 {
    A03,
    A05,
    A04;
    
    public static byte[] A00;
    public static String[] A01 = {"seqAlwXEOvzJRT", "2kwhh1C9lzELPF4tFLY2", "Jj", "sVBc1MgsVLAc0bDFJylP1xNQuOv", "HeA0CnCob9O6sWYI", "hyCzZMBJpVm0WSm5X0p8b9", "uKys1875npMZUjGe7nShhq", "p4I3Upmes50ZeKIDqz8mdw8ttLtPhh"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[3] = "YOiRDsLdwk415VnA";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 80);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{Field.ADDRESSBLOCK, Field.GREETINGLINE, Field.AUTOTEXT, Field.HYPERLINK, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.SHAPE, Field.INCLUDETEXT, Field.TOA, Field.GREETINGLINE, Field.HYPERLINK, Field.ADVANCE, Field.TOA, Field.SHAPE, Field.NOTEREF, Field.NOTEREF, Field.MERGESEQ, Field.LISTNUM, 77, Field.FORMTEXT, Field.ADDIN, 76, Field.HTMLCONTROL, Field.NOTEREF, Field.NOTEREF, Field.MERGESEQ, Field.BIDIOUTLINE, Field.ADDIN, Field.LISTNUM, Field.SECTION, Field.SECTION, Field.ADDIN, Field.ADDRESSBLOCK, Field.INCLUDEPICTURE, Field.AUTOTEXT, Field.SECTIONPAGES, Field.SECTIONPAGES, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.TOA, Field.INCLUDETEXT, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.AUTOTEXTLIST, Field.INCLUDETEXT, 82, Field.FILESIZE, Field.TOA, Field.SECTIONPAGES, Field.AUTOTEXTLIST, Field.TOA, 80, Field.FORMDROPDOWN, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.GREETINGLINE};
    }

    static {
        A01();
    }
}
