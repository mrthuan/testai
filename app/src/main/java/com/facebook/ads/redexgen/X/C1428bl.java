package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.bl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1428bl implements AnonymousClass20 {
    public static byte[] A05;
    public static String[] A06 = {"LqS4Vpkhy9E", "ge1EwIuJY0TovlYE8lSK4ibgoBpAWn9a", "g9aMV", "tM0yo6k6wg7fwB8A5Xyw1gAw", "QSFbFVun0ml7C8TY77Vqi1TYUccnWCEL", "t0vPMbYvCUeZJjWwsMbVoEbKc6G6LcPD", "iAyfyMUWIOpY9gjOpihEXzDIF", "NOfvqhzewpei8jQqPEPmMqHVwiKNDwof"};
    public AdError A00;
    public EnumC04821z A01 = EnumC04821z.A02;
    public EnumC04821z A02 = EnumC04821z.A02;
    public final AbstractC1425bi A03;
    public final C1314Zs A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {125, 41, Field.GOTOBUTTON, 125, 12, 2, 123, 77, Field.CONTROL, 2, Field.SECTION, Field.INCLUDEPICTURE, 76, 2, Field.SECTION, 74, Field.INCLUDEPICTURE, 76, Field.FILESIZE, Field.FORMCHECKBOX, 2, 107, 76, 86, Field.FORMCHECKBOX, Field.FILESIZE, 80, Field.INCLUDEPICTURE, 86, Field.MERGESEQ, 77, 76, 2, 103, 80, 80, 77, 80, 2, Field.AUTOTEXT, 77, Field.FORMTEXT, Field.FORMCHECKBOX, 2, 64, Field.HTMLCONTROL, 2, Field.ADDIN, Field.FORMCHECKBOX, 86, 86, Field.MERGESEQ, 76, Field.FILESIZE, 2, 99, Field.FORMTEXT, 113, Field.FORMCHECKBOX, 86, 86, Field.MERGESEQ, 76, Field.FILESIZE, Field.ADDIN, 12, Field.ADDIN, Field.FORMCHECKBOX, 86, 107, 76, 86, Field.FORMCHECKBOX, Field.FILESIZE, 80, Field.INCLUDEPICTURE, 86, Field.MERGESEQ, 77, 76, 103, 80, 80, 77, 80, 111, 77, Field.FORMTEXT, Field.FORMCHECKBOX, 10, 11, Field.PAGEREF, 33, 34, 22, 7, 10, 6, 13, 0, 6, Field.DDE, 6, 23, 20, 12, 17, 8, Field.SECTION, 117, 104, 106, Field.FILLIN, Field.LISTNUM, Byte.MAX_VALUE, 98, 99, 106, Field.DDE, 100, 99, 121, 104, Byte.MAX_VALUE, 99, 108, 97, Field.DDE, 121, Byte.MAX_VALUE, 108, 99, 126, 100, 121, 100, 98, 99, Field.QUOTE, 125, 108, 117, 106, 105, 103, 98, Field.DDEAUTO, Field.GLOSSARY, 121, 98, 101, 125, 34, Field.QUOTE, 120, 100, 109, 120, 44, 101, Byte.MAX_VALUE, 44, 109, 96, 126, 105, 109, 104, 117, 44, 64, Field.INCLUDEPICTURE, 77, Field.NOTEREF, Field.FILESIZE, Field.SECTIONPAGES, Field.MERGESEQ, 32, 44, 64, Field.INCLUDEPICTURE, 77, Field.NOTEREF, Field.TOA, Field.NOTEREF, 44, 99, 126, 44, Field.SHAPE, Field.INCLUDETEXT, Field.INCLUDEPICTURE, Field.HTMLCONTROL, Field.FILESIZE, Field.SECTIONPAGES, Field.MERGESEQ, 123, 103, 110, 123, Field.GLOSSARY, 102, 124, Field.GLOSSARY, 110, 99, 125, 106, 110, 107, 118, Field.GLOSSARY, Field.BIDIOUTLINE, Field.FORMCHECKBOX, 64, Field.HYPERLINK, Field.FORMTEXT, Field.SECTION, Field.NOTEREF, 121, 101, 108, 121, Field.DDE, 100, 126, Field.DDE, 99, 98, 121, Field.DDE, Field.SECTION, Field.SECTIONPAGES, 76, Field.TOA, Field.NOTEREF, Field.TOA};
        String[] strArr = A06;
        if (strArr[1].charAt(28) == strArr[5].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[1] = "uHXyGv91YS5AZybwuzmh7pK9ZkTxCxly";
        strArr2[5] = "aSclBZwoH94XlBt4xX3FAXD0bzJVnGEs";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C1428bl(C1314Zs c1314Zs, AbstractC1425bi abstractC1425bi) {
        this.A04 = c1314Zs;
        this.A03 = abstractC1425bi;
    }

    private void A02(EnumC04821z enumC04821z, EnumC04821z enumC04821z2) {
        String A00 = A00(113, 26, 44);
        StringBuilder sb2 = new StringBuilder();
        String errorTitle = A00(108, 5, 38);
        StringBuilder append = sb2.append(errorTitle).append(enumC04821z);
        String errorTitle2 = A00(0, 4, 124);
        String sb3 = append.append(errorTitle2).append(enumC04821z2).toString();
        C8D A07 = this.A04.A07();
        int i10 = C8E.A0e;
        C8F c8f = new C8F(A00, sb3);
        String errorTitle3 = A00(ShapeTypes.FLOW_CHART_TERMINATOR, 3, 61);
        A07.AA0(errorTitle3, i10, c8f);
        String errorTitle4 = A00 + ' ' + sb3;
        this.A04.A0E().AHl(errorTitle4);
    }

    private void A03(String str, String str2, boolean z10) {
        AdSettings.IntegrationErrorMode A00 = AbstractC04791w.A00(this.A04);
        String format = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String A002 = A00(ShapeTypes.FLOW_CHART_TERMINATOR, 3, 61);
        String A003 = A00(91, 17, 66);
        if (!z10) {
            Log.e(A003, format);
            this.A04.A07().AA0(A002, C8E.A0c, new C8F(format));
            this.A04.A0E().AHk(format);
            return;
        }
        switch (C04811y.A00[A00.ordinal()]) {
            case 1:
                String errorMessage = format + A00(4, 87, 3);
                throw new AnonymousClass21(errorMessage);
            case 2:
                this.A03.A08();
                this.A03.A0B(10, AdErrorType.INCORRECT_STATE_ERROR, format);
                this.A04.A0E().AHk(format);
                Log.e(A003, format);
                this.A04.A07().AA0(A002, C8E.A0c, new C8F(format));
                break;
        }
        Log.e(A003, format);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass20
    public final boolean A5z() {
        boolean z10 = (this.A01 == EnumC04821z.A02 || this.A01 == EnumC04821z.A04) && this.A02 != EnumC04821z.A07;
        if (z10) {
            this.A01 = EnumC04821z.A06;
        } else {
            A03(A00(ShapeTypes.FLOW_CHART_MANUAL_OPERATION, 6, 39), A00(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 42, 45), false);
        }
        return !z10;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass20
    public final boolean A60() {
        if (this.A01 == EnumC04821z.A04 && this.A00 != null && this.A00.getErrorCode() == 2008) {
            this.A04.A0E().AFM();
            this.A03.A0B(10, AdErrorType.AD_PRESENTATION_ERROR, null);
            return true;
        }
        EnumC04821z enumC04821z = this.A01;
        EnumC04821z enumC04821z2 = EnumC04821z.A05;
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            String[] strArr2 = A06;
            strArr2[4] = "mF60z106z8KVykzxhCmjg96dV72kpnud";
            strArr2[7] = "JHGcNRxcSq72OhujKZnAiyvPQwA3qgql";
            boolean z10 = enumC04821z == enumC04821z2 && (this.A02 != EnumC04821z.A07 || C0877Im.A0g(this.A04));
            if (z10) {
                this.A01 = EnumC04821z.A02;
                this.A02 = EnumC04821z.A07;
            } else {
                EnumC04821z enumC04821z3 = this.A01;
                EnumC04821z enumC04821z4 = EnumC04821z.A05;
                String A00 = A00(148, 6, 43);
                if (enumC04821z3 != enumC04821z4) {
                    A03(A00, A00(219, 18, 44), true);
                } else {
                    A03(A00, A00(196, 23, 46), false);
                }
            }
            return !z10;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass20
    public final EnumC04821z A6J() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass20
    public final EnumC04821z A6K() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass20
    public final void AGM(EnumC04821z enumC04821z) {
        this.A01 = enumC04821z;
        this.A02 = enumC04821z;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass20
    public final void AGQ(AdError adError) {
        this.A01 = EnumC04821z.A04;
        this.A02 = EnumC04821z.A04;
        this.A00 = adError;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass20
    public final void AGV() {
        if (this.A01 != EnumC04821z.A06) {
            A02(this.A01, EnumC04821z.A05);
        }
        EnumC04821z enumC04821z = EnumC04821z.A05;
        String[] strArr = A06;
        if (strArr[4].charAt(13) == strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "0CQ8O9HdNp0eBnIGd0pIqA2Cb";
        strArr2[2] = "A9QPt";
        this.A01 = enumC04821z;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass20
    public final void AGf() {
        if (this.A02 != EnumC04821z.A07) {
            A02(this.A01, EnumC04821z.A08);
        }
        this.A02 = EnumC04821z.A08;
    }
}
