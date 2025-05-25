package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.5V  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5V {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final C5Q A01;
    public final C1314Zs A02;
    public final J7 A03;

    public static String A0K(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A04 = new byte[]{99, Byte.MAX_VALUE, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, 11, 1, 9, 0, 43, 41, 36, 36, Field.DDE, 58, Field.NUMCHARS, Field.EQ, 56, Field.DDE, 119, 124, 117, 125, 122, 113, 112, Field.DOCPROPERTY, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, Field.QUOTE, 44, 41, Field.EQ, 32, Field.IMPORT, 32, 33, 26, Field.ASK, 41, 44, Field.ASK, Field.DDEAUTO, 26, 33, 32, 41, 36, 60, 26, Field.DATA, Field.AUTONUM, 124, 115, 102, 123, 100, 119, Field.FORMDROPDOWN, 118, 86, 115, 102, 115, 80, 103, 124, 118, 126, 119, 104, Byte.MAX_VALUE, 109, 123, 104, 126, Byte.MAX_VALUE, 126, 76, 115, 126, Byte.MAX_VALUE, 117, Field.HTMLCONTROL, 126, Field.GREETINGLINE, 123, 110, 123, Field.HYPERLINK, 111, 116, 126, 118, Byte.MAX_VALUE, 36, 59, Field.AUTONUM, Field.IMPORT, 61, 13, Field.ASK, 59, Field.BARCODE, Field.IMPORT, 13, 34, 61, Field.USERADDRESS, Field.USERADDRESS, 59, 60, Field.AUTONUMLGL, 13, 59, 60, Field.ASK, Field.IMPORT, 32, 36, Field.MACROBUTTON, Field.USERADDRESS};
    }

    static {
        A0L();
    }

    public C5V(C5Q c5q, Intent intent, J7 j72, C1314Zs c1314Zs) {
        this.A01 = c5q;
        this.A00 = intent;
        this.A03 = j72;
        this.A02 = c1314Zs;
    }

    private AbstractC1456cD A00() {
        int i10 = Build.VERSION.SDK_INT;
        String A0K = A0K(68, 18, 41);
        if (i10 >= 33) {
            return (AbstractC1456cD) this.A00.getSerializableExtra(A0K, AbstractC1456cD.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC1456cD) intent.getSerializableExtra(A0K);
    }

    private C1454cB A01() {
        int i10 = Build.VERSION.SDK_INT;
        String A0K = A0K(26, 19, 47);
        if (i10 >= 33) {
            return (C1454cB) this.A00.getSerializableExtra(A0K, C1454cB.class);
        }
        return (C1454cB) this.A00.getSerializableExtra(A0K);
    }

    private C0803Fm A02() {
        int i10 = Build.VERSION.SDK_INT;
        String A0K = A0K(2, 14, 94);
        if (i10 >= 33) {
            return (C0803Fm) this.A00.getSerializableExtra(A0K, C0803Fm.class);
        }
        return (C0803Fm) this.A00.getSerializableExtra(A0K);
    }

    private C0801Fk A03() {
        int i10 = Build.VERSION.SDK_INT;
        String A0K = A0K(86, 25, 33);
        if (i10 >= 33) {
            return (C0801Fk) this.A00.getSerializableExtra(A0K, C0801Fk.class);
        }
        return (C0801Fk) this.A00.getSerializableExtra(A0K);
    }

    private MS A05() {
        if (C0877Im.A2j(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0K(45, 23, 126));
            C5Q c5q = this.A01;
            C1314Zs c1314Zs = this.A02;
            J7 j72 = this.A03;
            C1359ab c1359ab = new C1359ab(this.A01);
            Intent intent = this.A00;
            String clickDelayMs = A0K(16, 10, 115);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0K(0, 2, 117);
            }
            int parseInt = Integer.parseInt(stringExtra);
            if (A05[5].charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new CI(c5q, c1314Zs, j72, c1359ab, stringExtra2, parseInt);
        }
        return new VY(this.A01, this.A02, this.A03, new C1359ab(this.A01));
    }

    private VA A06() {
        C0803Fm A02 = A02();
        if (A02 == null) {
            return null;
        }
        return new VA(this.A02, this.A03, new C1359ab(this.A01), A02, null, new V6());
    }

    private VA A07() {
        C0801Fk A03 = A03();
        if (A03 == null) {
            return null;
        }
        return new VA(this.A02, this.A03, new Ej(this.A01), A03, A03.A0m(), new V5());
    }

    private final V9 A08() {
        return new V9(this.A02, this.A01);
    }

    private V7 A09(RelativeLayout relativeLayout) {
        V7 v72 = new V7(this.A02, new C1358aa(this), this.A03, new C1359ab(this.A01));
        v72.A05(relativeLayout);
        v72.A04(this.A00.getIntExtra(A0K(111, 27, 105), 200));
        M3.A0M(relativeLayout, -16777216);
        return v72;
    }

    private BO A0A() {
        C0803Fm A02 = A02();
        if (A02 == null) {
            return null;
        }
        return new BO(this.A02, this.A03, new C1359ab(this.A01), A02, new V6(), 1);
    }

    private BO A0B() {
        C0801Fk A03 = A03();
        if (A03 == null) {
            return null;
        }
        return new BO(this.A02, this.A03, new C1359ab(this.A01), A03, new V5(), 0);
    }

    private UE A0C() {
        C1041Pb A02;
        AbstractC1456cD A00 = A00();
        if (A00 == null || (A02 = AbstractC1042Pc.A02(A00.A0l())) == null) {
            return null;
        }
        return new UE(this.A02, new C1359ab(this.A01), A02, A00.A1U());
    }

    private C1156Tm A0D(KG kg2) {
        N9 v52;
        MR ej2;
        C1454cB A01 = A01();
        if (A01 == null) {
            return null;
        }
        if (kg2 == KG.A04) {
            v52 = new V6();
            ej2 = new C1359ab(this.A01);
        } else {
            v52 = new V5();
            ej2 = new Ej(this.A01);
        }
        return new C1156Tm(this.A02, v52, this.A03, A01, new C05906f(this.A02), ej2);
    }

    private A4 A0E() {
        C0803Fm A02 = A02();
        if (A02 == null) {
            if (A05[1].charAt(5) != 'X') {
                throw new RuntimeException();
            }
            A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
            return null;
        }
        return new A4(this.A02, new V6(), this.A03, A02, new C05906f(this.A02), new C1359ab(this.A01));
    }

    private C06519a A0F() {
        C0803Fm A02 = A02();
        if (A02 == null) {
            return null;
        }
        return new C06519a(this.A02, new V6(), this.A03, A02, new C05906f(this.A02), new C1359ab(this.A01));
    }

    private C06519a A0G() {
        C0801Fk A03 = A03();
        if (A03 == null) {
            return null;
        }
        return new C06519a(this.A02, new V5(), this.A03, A03, new C05906f(this.A02), new Ej(this.A01));
    }

    private TZ A0H() {
        C0801Fk A03;
        C0801Fk A032 = A03();
        if (A032 == null || (A03 = A03()) == null) {
            return null;
        }
        return new TZ(this.A02, this.A03, A032, A03, new Ej(this.A01), this.A01);
    }

    private C9Z A0I() {
        C0803Fm dataBundle = A02();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A0s(this.A01.A08());
        return new C9Z(this.A02, this.A03, new C05906f(this.A02), new C1359ab(this.A01), dataBundle);
    }

    private C9Z A0J() {
        C0801Fk dataBundle = A03();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A0s(this.A01.A08());
        return new C9Z(this.A02, this.A03, new C05906f(this.A02), new C1359ab(this.A01), dataBundle);
    }

    public final MS A0M(KG kg2, RelativeLayout relativeLayout) {
        if (kg2 == null) {
            return null;
        }
        switch (C5U.A00[kg2.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A09(relativeLayout);
                }
                return null;
            case 2:
                return A0J();
            case 3:
                return A0G();
            case 4:
                return A07();
            case 5:
                return A05();
            case 6:
                C06519a A0F = A0F();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return A0F;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return A0F;
            case 7:
                return A0E();
            case 8:
                return A0I();
            case 9:
                return A06();
            case 10:
                return A0C();
            case 11:
                BO A0A = A0A();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return A0A;
            case 12:
                return A0B();
            case 13:
            case 14:
                return A0D(kg2);
            case 15:
                return A08();
            case 16:
                return A0H();
            default:
                return null;
        }
    }
}
