// Auto-fixed: added missing class declaration
public class EnumC1519dI {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import kotlin.Metadata;
import lib.zj.office.fc.hwpf.usermodel.Field;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.dI  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1519dI {
    A05,
    A04,
    A0H,
    A0C,
    A08,
    A0B,
    A0I,
    A06,
    A0A,
    A0D,
    A0E,
    A0F,
    A07,
    A09,
    A0G;
    
    public static byte[] A00;
    public static String[] A01 = {"Rv8gvV16xF14rXJa8ys12UvRM3fqPLyI", "UcSDNoyAd7hAuBmsZZHLguWnytii130l", "ED7ecOC6EdeJIgNMIPoHmXrwamnQGstx", "BUEKOmcJKNgB4JeoBrUcYjJkope3pnc", "09HtIC6J3ndQ006hR2DfsxfysqzwGQ1s", "uKMTkvRb9VJmiylnlY8d6WVdU9", "Y6AdbyooKlLQqvqU7YO0Osoc2idrR8tf", "d6Zg2ebC4FLOENwv3uxY"};
    public static final /* synthetic */ InterfaceC0843He A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A01[6].charAt(0) == 's') {
            throw new RuntimeException();
        }
        A01[6] = "fY3Nz46mZ4ok68tyHpIJjbxIlrtCCt3n";
        A00 = new byte[]{126, 113, 113, 112, 107, 126, 107, 118, 112, 113, 96, 124, 115, 126, 108, 108, 36, 43, Field.ASK, Field.AUTONUMOUT, Field.AUTONUMOUT, Field.FILLIN, 43, 42, Field.IMPORT, 48, Field.AUTONUM, Field.EQ, Field.FILLIN, 48, 43, Field.AUTONUM, 20, 9, 1, 3, 20, 2, 2, 24, 30, 31, 96, 111, 99, 106, 98, Field.AUTOTEXTLIST, 86, Field.FORMDROPDOWN, Field.LISTNUM, 12, 31, 4, 9, 30, 3, 5, 4, 30, 29, 17, 19, 30, 13, 4, 19, 0, Field.NUMWORDS, 19, 16, 30, 23, 59, Field.SYMBOL, 36, 59, Field.DDEAUTO, Field.SYMBOL, Field.BARCODE, Field.GOTOBUTTON, 117, 119, 106, 117, 96, 119, 113, 124, 122, 98, 96, 113, 113, 96, 119, Field.FORMTEXT, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.FORMTEXT, Field.FORMDROPDOWN, Field.INCLUDETEXT, Field.SECTIONPAGES, Field.AUTOTEXT, Field.TOA, Field.FILESIZE, Field.FORMDROPDOWN, Field.SECTIONPAGES, Field.SECTIONPAGES, Field.FORMDROPDOWN, Field.INCLUDETEXT, 126, 115, 122, 111, Field.FORMCHECKBOX, 74, Field.INCLUDEPICTURE, 86, 82, Field.SHAPE, Field.LISTNUM, 82, 64, Field.AUTOTEXT, Field.SECTIONPAGES, Field.MERGESEQ, Field.GREETINGLINE, Field.INCLUDETEXT, Field.MERGESEQ, Field.LISTNUM, Field.TOA, Field.LISTNUM, 86, Field.GREETINGLINE, Field.AUTOTEXT, Field.GREETINGLINE, Field.TOA, Field.INCLUDETEXT, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.FORMCHECKBOX, Field.CONTROL, 77, Field.SECTIONPAGES, Field.FORMDROPDOWN, 64, Field.FORMDROPDOWN, Field.SHAPE, Field.CONTROL, Field.FORMTEXT, Field.CONTROL, 64};
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC1519dI[] valuesCustom() {
        Object clone = values().clone();
        String[] strArr = A01;
        if (strArr[7].length() != strArr[5].length()) {
            String[] strArr2 = A01;
            strArr2[7] = "fNr6S9qwrpJNcVOY2uQv";
            strArr2[5] = "MQ40BB82iiEDH6m8yNyJR95Ya0";
            return (EnumC1519dI[]) clone;
        }
        throw new RuntimeException();
    }

    static {
        A01();
        A02 = AbstractC1515dB.A01(A03);
    }
}

}
