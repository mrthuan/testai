package com.facebook.ads.redexgen.X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.UUID;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Zp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1311Zp extends AbstractC06237w {
    public static byte[] A00;
    public static String[] A01 = {"v5MZzRzrTL11f6lKUt2ZQD1OVIavmnrt", "OQAuAlzJEKPfh7ZgcR4xCXzzkMNpdJq1", "ORBVlGZaT9NsACLTU7PLH6nx7c52uYSI", "kFePfToViPIZQeUiwoBs", "eRXXWt8NkKb0AEFThzS2KgPgrvMEJJml", "Br8mzprdPK1S49BanGBC", "SoemqsWiEpTnAycOeZvswJMc9fMJVUnI", "UAbmRevtk8pEhuOi2MMFgEMoVQVmS6xB"};
    public static final C7q A02;
    public static final C7q A03;
    public static final C7q[] A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;
    public static final String A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{122, 103, 122, Field.DATA, 43, 118, 119, 126, 119, 102, 119, 18, 116, 96, 125, Byte.MAX_VALUE, 18, Field.FORMTEXT, Field.ADDRESSBLOCK, Field.AUTOTEXTLIST, Field.CONTROL, Field.BIDIOUTLINE, Field.SECTION, 18, 101, 122, 119, 96, 119, 18, 124, 125, 102, 18, 119, 106, 123, 97, 102, 97, 18, 26, 97, 119, 126, 119, 113, 102, 18, 3, 18, 116, 96, 125, Byte.MAX_VALUE, 18, Field.CONTROL, Field.INCLUDETEXT, Field.CONTROL, Field.BIDIOUTLINE, Field.FORMTEXT, Field.SECTION, 18, 101, 122, 119, 96, 119, 18, Field.FORMTEXT, Field.ADDRESSBLOCK, Field.AUTOTEXTLIST, Field.CONTROL, Field.BIDIOUTLINE, Field.SECTION, Field.NUMCHARS, Field.NUMWORDS, Field.ASK, 61, 59, Field.DDEAUTO, 42, Field.IMPORT, Field.EQ, 48, 126, 41, Field.AUTONUM, 59, 48, 126, 42, 44, Field.FILLIN, Field.IMPORT, 48, Field.SYMBOL, 126, 42, Field.EQ, 126, 58, 59, Field.GOTOBUTTON, 59, 42, 59, 126, 61, Field.AUTONUM, Field.IMPORT, Field.GOTOBUTTON, 58, Field.GOTOBUTTON, 59, Field.DDE, Field.DDE, 126, 42, Field.EQ, Field.AUTONUMLGL, 59, 48, Field.DDE, 112, 124, Field.HTMLCONTROL, Field.INCLUDEPICTURE, Field.ADVANCE, Field.AUTOTEXTLIST, Field.BIDIOUTLINE, Field.ADDIN, 21, Field.SECTION, Field.LISTNUM, Field.GREETINGLINE, 80, Field.HTMLCONTROL, Field.NUMWORDS, 20, 5, 24, 20, 36, Field.AUTONUMLGL, Field.DATA, 36, 80, 32, 34, Field.SYMBOL, 61, Field.EQ, 34, 41, 80, 59, Field.AUTONUMLGL, 41, Field.SECTIONPAGES, Field.ADDIN, Field.SECTIONPAGES, Field.TOA, Field.FORMDROPDOWN, Field.ADVANCE, 5, 30, 26, 20, 31, 125, 102, 98, 108, 103, 86, 96, 109, Field.INCLUDEPICTURE, Field.HYPERLINK, Field.BIDIOUTLINE, 82, Field.AUTOTEXTLIST, Field.INCLUDETEXT};
    }

    static {
        A04();
        A03 = new C7q(0, A00(ShapeTypes.ACTION_BUTTON_DOCUMENT, 8, 107), A00(ShapeTypes.FLOW_CHART_CONNECTOR, 16, 18));
        A02 = new C7q(1, A00(ShapeTypes.ACTION_BUTTON_FORWARD_NEXT, 5, 19), A00(ShapeTypes.FLOW_CHART_TERMINATOR, 4, 34));
        A04 = new C7q[]{A03, A02};
        A08 = C1311Zp.class.getSimpleName();
        C7q[] c7qArr = A04;
        String A002 = A00(ShapeTypes.MATH_MULTIPLY, 6, 85);
        A06 = AbstractC06237w.A02(A002, c7qArr);
        A07 = AbstractC06237w.A03(A002, A04, A02);
        A05 = A00(5, 71, 80) + A03.A01 + A00(0, 3, 56) + A00(ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS, 6, 69) + A00(4, 1, 103) + C1312Zq.A09.A01 + A00(3, 1, 99);
    }

    public C1311Zp(C06207s c06207s) {
        super(c06207s);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06237w
    public final String A06() {
        return A00(ShapeTypes.MATH_MULTIPLY, 6, 85);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06237w
    public final C7q[] A0A() {
        return A04;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A06, null);
    }

    public final String A0C(String str) throws IllegalArgumentException, SQLiteException {
        if (!TextUtils.isEmpty(str)) {
            Cursor cursor = null;
            try {
                cursor = A05().rawQuery(A07, new String[]{str});
                String string = cursor.moveToNext() ? cursor.getString(A03.A00) : null;
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
                String uuid = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(A03.A01, uuid);
                contentValues.put(A02.A01, str);
                A05().insertOrThrow(A00(ShapeTypes.MATH_MULTIPLY, 6, 85), null, contentValues);
                if (cursor != null) {
                    cursor.close();
                }
                return uuid;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        throw new IllegalArgumentException(A00(125, 14, 87));
    }

    public final void A0D(C1313Zr c1313Zr) {
        try {
            A05().execSQL(A05);
        } catch (SQLException e10) {
            InterfaceC06177o A042 = c1313Zr.A04();
            if (A01[0].charAt(14) != 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "zGpOEoeFk9mKuFaHfebiepQHWPBtYRlV";
            strArr[4] = "gQOnf7kUk2P1iMeHKJrfxPX4gK9wMRl8";
            if (A042.A9O()) {
                Log.e(A08, A00(76, 49, 60), e10);
            }
        }
    }
}
