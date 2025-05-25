package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class QW {
    public static byte[] A09;
    public static String[] A0A = {"4QAeMuK9yCc4xE434", "vsUO926M2mRMCBHvkZDLDSVJZasjRX8H", "m75JG3kyGBA9Pa8Q", "BsXoGLiaQGDi3KDXWPANO86ZRypkU3", "NEfK90sKL", "NA5kCdAu0CbcY72yECaBPvDnC3FLldwL", "T76ZrsNa0P6C1lpNf7S0Tx3scEBkBq8W", "cxX21NDQKlhKMPjA26xNh3AVlSUU32"};
    public String A00;
    public String A01;
    public final C7j A02;
    public final J7 A03;
    public final JF A04;
    public final QV A05;
    public final String A06;
    public final Map<String, String> A07;
    public final boolean A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{Field.HYPERLINK, Field.AUTOTEXT, 78, 78, Field.DOCPROPERTY, Field.ADVANCE, 101, Field.AUTOTEXTLIST, 86, Field.FORMDROPDOWN, Field.AUTOTEXTLIST, Field.ADDIN, Field.ADDRESSBLOCK, 74, Field.MERGESEQ, Field.MERGESEQ, 80, Field.ADDIN, 96, Field.ADDIN, Field.GREETINGLINE, 82, Field.LISTNUM, 8, 3, 9, Field.GOTOBUTTON, 14, 12, 31, 9, Field.GOTOBUTTON, 30, 5, 2, 26, Field.GOTOBUTTON, 24, 29, 19, 0, 19, 24, 2, 41, 19, 14, 2, 4, 23, 33, Field.GOTOBUTTON, 33, 42, 48, Field.NUMWORDS, 48, 61, Field.AUTONUMOUT, 33, 78, Field.NOTEREF, Field.INCLUDETEXT, 76, 118, Field.FILESIZE, Field.FORMTEXT, Field.NOTEREF, 77, Field.ADDIN, Field.HYPERLINK, Field.MERGESEQ, Field.HYPERLINK, Field.ADDIN, 98, Field.GREETINGLINE, 82, 80, 77, Field.ADDIN, Field.HYPERLINK, Field.TOA, Field.HYPERLINK, 98, 107, 120, 107, 98, Field.ADDIN, 96, 111, 99, 107, 104, Field.ASK};
    }

    static {
        A04();
    }

    public QW(C7j c7j, QV qv, J7 j72, Map<String, String> metricsData, String str) {
        this.A02 = c7j;
        this.A05 = qv;
        this.A03 = j72;
        this.A07 = metricsData;
        this.A06 = str;
        this.A04 = new JF(this.A06, this.A03);
        this.A08 = C0877Im.A25(qv.getContext());
    }

    private void A01() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(50, 10, 28), A00(60, 9, 113));
        A07(hashMap);
    }

    private void A02() {
        this.A04.A04(JE.A0b, null);
    }

    private void A03() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(50, 10, 28), A00(23, 16, 53));
        A07(hashMap);
    }

    private void A05(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(83, 10, 86), String.valueOf(str));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A00(50, 10, 28), A00(69, 14, 101));
        hashMap2.put(A00(39, 11, 46), LV.A01(hashMap));
        A07(hashMap2);
    }

    private void A06(String str, float f10, float f11) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(12, 11, 103), str);
        hashMap.put(A00(93, 1, 72), String.valueOf(f10));
        hashMap.put(A00(94, 1, 7), String.valueOf(f11));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A00(50, 10, 28), A00(0, 12, 98));
        hashMap2.put(A00(39, 11, 46), LV.A01(hashMap));
        A07(hashMap2);
    }

    private void A07(Map<String, String> data) {
        if (TextUtils.isEmpty(this.A06)) {
            return;
        }
        data.putAll(this.A07);
        data.putAll(QX.A01(this.A02, this.A00, this.A01));
        this.A03.AAM(this.A06, data);
    }

    @JavascriptInterface
    public void initializeLogging(String str, String str2) {
        if (!this.A08) {
            return;
        }
        this.A00 = str;
        if (A0A[4].length() == 10) {
            throw new RuntimeException();
        }
        A0A[1] = "4HHX0Lv3voylt1VaUhFjcSRGfPCuBfwt";
        this.A01 = str2;
    }

    @JavascriptInterface
    public void logButtonClick(String str, float f10, float f11) {
        if (!this.A08) {
            return;
        }
        A06(str, f10, f11);
    }

    @JavascriptInterface
    public void logEndCardShowUp() {
        if (!this.A08) {
            return;
        }
        A03();
    }

    @JavascriptInterface
    public void logGameLoad() {
        if (!this.A08) {
            return;
        }
        A01();
    }

    @JavascriptInterface
    public void logLevelComplete(String str) {
        if (!this.A08) {
            return;
        }
        A05(str);
    }

    @JavascriptInterface
    public void onCTAClick() {
        A02();
        this.A05.A0A();
    }
}
