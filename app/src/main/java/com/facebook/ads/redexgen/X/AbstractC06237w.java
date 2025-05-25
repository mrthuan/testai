package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.7w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC06237w {
    public static byte[] A01;
    public final C06207s A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{Field.DOCPROPERTY, Field.ADDRESSBLOCK, Field.CONTROL, 74, Field.CONTROL, Field.NOTEREF, Field.AUTONUM, 80, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.HTMLCONTROL, Field.AUTONUM, Field.ADVANCE, Field.QUOTE, 60, Field.EQ, Field.ASK, Field.EQ, Field.ADVANCE, Field.SHAPE, 4, 8, Field.AUTOTEXT, Field.GREETINGLINE, Field.TOA, 77, Field.HYPERLINK, Field.TOA, 44, Field.HYPERLINK, 77, 78, 64, Field.TOA, 44, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 34, Field.AUTONUMOUT, 61, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.PAGEREF, Field.ADDIN};
    }

    public abstract String A06();

    public abstract C7q[] A0A();

    public AbstractC06237w(C06207s c06207s) {
        this.A00 = c06207s;
    }

    private String A00() {
        C7q[] A0A = A0A();
        if (A0A.length < 1) {
            return null;
        }
        String result = A01(0, 0, 12);
        for (int i10 = 0; i10 < A0A.length - 1; i10++) {
            result = result + A0A[i10].A02() + A01(20, 2, 43);
        }
        return result + A0A[A0A.length - 1].A02();
    }

    public static String A02(String str, C7q[] c7qArr) {
        StringBuilder sb2 = new StringBuilder(A01(56, 7, 114));
        for (int i10 = 0; i10 < c7qArr.length - 1; i10++) {
            sb2.append(c7qArr[i10].A01);
            sb2.append(A01(20, 2, 43));
        }
        sb2.append(c7qArr[c7qArr.length - 1].A01);
        sb2.append(A01(6, 6, 21));
        sb2.append(str);
        return sb2.toString();
    }

    public static String A03(String str, C7q[] c7qArr, C7q c7q) {
        return A02(str, c7qArr) + A01(12, 7, 119) + c7q.A01 + A01(2, 4, 116);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, 118) + A00() + A01(19, 1, 117));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
