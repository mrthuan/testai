package com.facebook.ads.redexgen.X;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.1S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1S {
    public static int A06;
    public static byte[] A07;
    public static String[] A08 = {"Vkhbk7q", "bbLm7avGUtHkF3jUZkJgwv05OQOBaWiK", "tolCyKl3IftnRlKEmRnT2sO5c0DyKStU", "eQuD8llomM2wZCZ6oqqCRxFaVaKQS5vz", "G8C7OMdE9YEe4", OperatorName.SAVE, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES, "mGkZm9P"};
    public int A00;
    public int A01;
    public long A03;
    public String A04;
    public int A02 = 0;
    public LinkedList<Integer> A05 = new LinkedList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-50, 31, -7, 26, -44, 0, -13, -1, 3, -13, -4, -15, 7, -82, -47, -17, -2, -2, -9, -4, -11, -82, -46, -17, 2, -17, -56, -82, -4, -3, -4, -13, -82, -41, -4, 2, -13, -11, -13, 0, -82, -3, -15, -15, 3, 0, 0, -13, -4, -15, -13, 44, 16, 14, 29, 1, 10, -1, 14, 21, 12, 16, 1, 0, -5, 5, 0, -16, -28, -5, -30, -26, -28, -13, -13, -24, -25, -30, -28, -11, -11, -28, -4, -30, -17, -24, -15, -22, -9, -21, Field.PAGEREF, 25, 25, 43, Field.DATA, Field.DATA, Field.NUMWORDS, 36, 25, Field.NUMWORDS, 41, 44, 33, Field.DDEAUTO, Field.PAGEREF, 43, 32, Field.SYMBOL, 48, Field.AUTONUM, Field.AUTONUMLGL, 32, 48, 36, 36, Field.AUTONUM, Field.MACROBUTTON, Field.MACROBUTTON, Field.ASK, Field.GLOSSARY, 36, Field.ASK, 32, Field.AUTONUMOUT, Field.ASK, 36, Field.AUTONUMOUT, -19, -28, -22, -23, -44, -27, -38, -25, -34, -28, -39, 3, 101};
    }

    static {
        A03();
        A06 = 50;
    }

    public C1S(String str) {
        this.A04 = str;
    }

    public static int A00() {
        int i10 = A06;
        if (A08[3].charAt(20) != '5') {
            A08[1] = "fgVvaJPNAH92mxaTJIosOWA9xsF7cqZV";
            return i10;
        }
        throw new RuntimeException();
    }

    private void A02() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        while (true) {
            LinkedList<Integer> linkedList = this.A05;
            if (A08[6].length() != 1) {
                throw new RuntimeException();
            }
            A08[2] = "YiLzIz5T1838NHRcssOQsoNOVVrgTctO";
            if (!linkedList.isEmpty() && this.A05.peekFirst() != null) {
                long currentTime = this.A05.peekFirst().intValue();
                if (currentTimeMillis - currentTime >= this.A00) {
                    this.A05.removeFirst();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void A04(int i10) {
        this.A02 = i10;
    }

    public final void A05(int i10, int i11, long j10, int i12) {
        this.A00 = i10;
        this.A01 = i11;
        this.A03 = j10;
        A06 = i12;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06(org.json.JSONArray r4) throws org.json.JSONException {
        /*
            r3 = this;
            r2 = 0
        L1:
            int r0 = r4.length()
            if (r2 >= r0) goto L2c
            java.lang.Object r0 = r4.get(r2)
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L1d
            java.util.LinkedList<java.lang.Integer> r1 = r3.A05
            java.lang.Object r0 = r4.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1.addLast(r0)
            int r2 = r2 + 1
            goto L1
        L1d:
            r2 = 4
            r1 = 47
            r0 = 35
            java.lang.String r1 = A01(r2, r1, r0)
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1S.A06(org.json.JSONArray):void");
    }

    public final void A07(boolean z10) {
        if (z10) {
            this.A05.addLast(Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
        }
        A02();
    }

    public final boolean A08() {
        return ((long) this.A05.size()) >= this.A03;
    }

    public final boolean A09() {
        return (System.currentTimeMillis() / 1000) - ((long) this.A02) <= ((long) this.A01);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A01(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, 1, 29));
        sb2.append(A01(55, 12, 49));
        String A01 = A01(1, 1, 122);
        sb2.append(A01);
        sb2.append(this.A04);
        String A012 = A01(0, 1, 55);
        sb2.append(A012);
        sb2.append(A01(101, 6, 81));
        sb2.append(A01);
        sb2.append(this.A00);
        sb2.append(A012);
        sb2.append(A01(ShapeTypes.VERTICAL_SCROLL, 11, 10));
        sb2.append(A01);
        sb2.append(this.A01);
        sb2.append(A012);
        sb2.append(A01(52, 3, 66));
        sb2.append(A01);
        sb2.append(this.A03);
        sb2.append(A012);
        sb2.append(A01(107, 20, 86));
        sb2.append(A01);
        sb2.append(this.A02);
        sb2.append(A012);
        sb2.append(A01(67, 23, 24));
        sb2.append(A01);
        sb2.append(A06);
        sb2.append(A012);
        sb2.append(A01(90, 11, 75));
        sb2.append(A01(2, 2, 84));
        Iterator<Integer> itr = this.A05.iterator();
        while (itr.hasNext()) {
            sb2.append(itr.next());
            if (itr.hasNext()) {
                sb2.append(A012);
            }
        }
        sb2.append(A01(51, 1, 100));
        if (A08[1].charAt(17) != 'M') {
            A08[6] = OperatorName.STROKING_COLOR_GRAY;
            sb2.append(A01(ShapeTypes.FLOW_CHART_TERMINATOR, 1, 125));
            return sb2.toString();
        }
        throw new RuntimeException();
    }
}
