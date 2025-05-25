package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.a6  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1328a6 {
    public static byte[] A02;
    public static String[] A03 = {"lJVeP2IR7ua2", "jEDUnDrnc1QBGJRRXgI1zLNGeQAVlRB5", "4J1evWwVBwsv6j2jE3cxdE8l4EvJqUWx", "hbOpPbm2Lvz8WBi4M4lcAmyYP20RrxkZ", "42MJRsHMkke9vUn", "N1ePHibZvm11p1YoQp9n3cvTSohhnC86", "pzMHmXStxFGPpObuVYX1kVlrzXN", "JuJmyZjKd3poC4Sz8wRazc2gW2"};
    public static final String A04;
    public final AnonymousClass69 A00;
    public final C05906f A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Field.ADDIN, 115, 100, 109, 110, 96, 101, 104, 111, 102, 33, 36, 101, 33, 96, 114, 114, 100, 117, 114, 60, 30, 9, 0, 3, 13, 8, 5, 2, 11, 76, 5, 1, 13, 11, 9, 86, 76, Field.TOA, 31, 118, Field.ADVANCE, Field.INCLUDEPICTURE, 74, Field.TOA, Field.FORMCHECKBOX, Field.SECTIONPAGES, Field.AUTOTEXT, Field.NOTEREF, Field.SECTION, 6, Field.MERGESEQ, Field.FORMCHECKBOX, Field.ADVANCE, 77, Field.FORMDROPDOWN, 86, Field.NUMCHARS, 6, 3, Field.DOCPROPERTY, 86, 116, 99, 106, 105, 103, 98, 111, 104, 97, Field.ASK, 112, 111, 98, 99, 105, 60, Field.ASK, Field.QUOTE, 117, Field.GOTOBUTTON, 101, 48, 48, 96, 97, 98, 98, 123, Field.AUTONUMOUT, 110, 101, 100, 123, 103, 103, Field.MACROBUTTON, 111, 123, Field.IMPORT, 100, Field.IMPORT, 101, 123, 100, Field.IMPORT, 100, Field.IMPORT, Field.MACROBUTTON, 100, Field.GOTOBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUMLGL, Field.MACROBUTTON, 98, Field.IMPORT, Field.AUTONUMLGL, 34, 33, 34, Field.MACROBUTTON, 36, Field.GLOSSARY, 106, 113, 116, 113, 112, 104, 113};
    }

    static {
        A02();
        A04 = C1328a6.class.getSimpleName();
    }

    public C1328a6(AnonymousClass69 anonymousClass69, C1313Zr c1313Zr) {
        this.A00 = anonymousClass69;
        this.A00.A3l(new C1330a8(this));
        this.A01 = new C05906f(c1313Zr);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            Locale locale = Locale.US;
            AnonymousClass69 anonymousClass69 = this.A00;
            if (A03[2].charAt(7) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "B9WAOcp3zNbG4sQr12bKZPkRro";
            strArr[6] = "6ENVq9NVFWRAnG6rhAVuoXedHs5";
            String.format(locale, A00(0, 20, 44), Integer.valueOf(anonymousClass69.A6Q().size()));
        }
        for (C6C c6c : this.A00.A6Q()) {
            switch (AnonymousClass68.A00[c6c.A8b().ordinal()]) {
                case 1:
                    A04(c6c.getUrl());
                    break;
                case 2:
                    A06(c6c.getUrl());
                    break;
                case 3:
                    A05(c6c.getUrl());
                    break;
            }
        }
        this.A01.A0W(new C1329a7(this), new C6Y(A00(81, 36, 123), A00(125, 7, 50)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 65), str);
        }
        C05886d c05886d = new C05886d(str, -1, -1, A00(81, 36, 123), A00(125, 7, 50));
        c05886d.A01 = A00(117, 8, 106);
        this.A01.A0b(c05886d);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 11), str);
        }
        C05866b c05866b = new C05866b(str, A00(81, 36, 123), A00(125, 7, 50));
        c05866b.A04 = true;
        c05866b.A02 = A00(117, 8, 106);
        this.A01.A0X(c05866b);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 43), str);
        }
        C05866b c05866b = new C05866b(str, A00(81, 36, 123), A00(125, 7, 50));
        c05866b.A04 = false;
        c05866b.A02 = A00(117, 8, 106);
        this.A01.A0a(c05866b);
    }
}
