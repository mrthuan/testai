package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.4w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05554w {
    public static byte[] A09;
    public static String[] A0A = {"", "d6jyZ4YF4aAx6mY2oyMV8cMH3x1tTmGX", "6ShmsSFKDmdiSeaEbVJI0pMmhv", "Jy6CLSdjiTJVmxisrmhO9od6ZqYVQGpz", "aKDRqPZxmSwbRmY5O7VQCqOvGq0yRVmO", "vr6xx06LqTBYtEPA9ZzozSqPDwzkbNaY", "Y84hViIy7qYskGYmJ3QVEouknT", ""};
    public C4v A01;
    public AnonymousClass54 A04;
    public final /* synthetic */ FL A08;
    public final ArrayList<AnonymousClass56> A05 = new ArrayList<>();
    public ArrayList<AnonymousClass56> A02 = null;
    public final ArrayList<AnonymousClass56> A06 = new ArrayList<>();
    public final List<AnonymousClass56> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{113, 56, 34, 16, Field.PAGEREF, Field.PAGEREF, 48, Field.GOTOBUTTON, Field.SYMBOL, Field.AUTONUMOUT, Field.AUTONUMLGL, 107, 56, 86, 17, 24, 24, 13, Field.NUMWORDS, 10, Field.INCLUDETEXT, 32, Field.FILLIN, 41, 64, 125, 108, 100, 41, 106, 102, 124, 103, 125, Field.MACROBUTTON, Field.AUTOTEXT, Field.NOTEREF, 21, 18, 7, 18, 3, Field.BIDIOUTLINE, 121, Field.HTMLCONTROL, 86, 86, Field.SHAPE, Field.GREETINGLINE, 26, Field.TOA, Field.AUTOTEXTLIST, Field.NOTEREF, Field.HTMLCONTROL, 74, 26, 76, Field.FORMDROPDOWN, Field.SHAPE, 77, 26, 77, Field.FORMDROPDOWN, 78, 82, 26, Field.HTMLCONTROL, Field.ADVANCE, 26, Field.FORMDROPDOWN, Field.ADVANCE, 76, Field.HTMLCONTROL, 86, Field.FORMDROPDOWN, Field.GREETINGLINE, 26, 76, Field.FORMDROPDOWN, Field.SHAPE, 77, 20, 26, 115, Field.ADVANCE, 76, Field.HTMLCONTROL, 86, Field.FORMDROPDOWN, Field.GREETINGLINE, 26, 76, Field.FORMDROPDOWN, Field.SHAPE, 77, Field.TOA, 26, Field.AUTOTEXTLIST, Field.HTMLCONTROL, Field.ADVANCE, Field.ADVANCE, Field.DOCPROPERTY, 78, 26, Field.HYPERLINK, Field.SHAPE, 26, Field.NOTEREF, Field.SHAPE, Field.AUTOTEXT, Field.TOA, Field.SHAPE, Field.GREETINGLINE, 26, Field.BIDIOUTLINE, Field.NOTEREF, Field.DOCPROPERTY, Field.CONTROL, 26, Field.TOA, Field.AUTOTEXTLIST, Field.NOTEREF, Field.HTMLCONTROL, 74, 22, 26, 78, 82, Field.SHAPE, Field.INCLUDEPICTURE, 26, Field.TOA, 82, Field.DOCPROPERTY, Field.AUTOTEXT, 86, Field.GREETINGLINE, 26, Field.NOTEREF, Field.SHAPE, Field.HYPERLINK, Field.DOCPROPERTY, Field.AUTOTEXT, Field.ADVANCE, Field.GREETINGLINE, 26, Field.BIDIOUTLINE, Field.NOTEREF, Field.DOCPROPERTY, Field.CONTROL, 26, Field.NOTEREF, Field.SHAPE, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, Field.AUTOTEXTLIST, 86, Field.SHAPE, Field.NOTEREF, 26, 74, Field.DOCPROPERTY, Field.DOCPROPERTY, 86, 20, 116, Field.FORMDROPDOWN, Field.GREETINGLINE, 82, Field.FORMDROPDOWN, 78, Field.ADVANCE, 78, Field.TOA, Field.HYPERLINK, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.INCLUDETEXT, 29, Field.AUTOTEXTLIST, Field.HYPERLINK, Field.TOA, Field.HYPERLINK, Field.GREETINGLINE, Field.TOA, Field.HYPERLINK, Field.AUTOTEXTLIST, 19, 29, 116, Field.FORMDROPDOWN, Field.MERGESEQ, Field.BIDIOUTLINE, Field.ADDIN, Field.ADVANCE, Field.AUTOTEXTLIST, 29, Field.ADVANCE, Field.TOA, Field.HYPERLINK, 80, 29, 77, 82, 78, Field.ADVANCE, Field.TOA, Field.ADVANCE, 82, Field.FORMDROPDOWN, 29, 31, 56, Field.AUTONUMLGL, Field.SYMBOL, 56, Field.PAGEREF, Field.BARCODE, Field.PAGEREF, 34, Field.MACROBUTTON, 56, Field.AUTONUMLGL, Field.GLOSSARY, 118, Field.GOTOBUTTON, Field.MACROBUTTON, 34, Field.MACROBUTTON, Field.AUTONUMLGL, 34, Field.MACROBUTTON, Field.GOTOBUTTON, 120, 118, 31, 56, 32, Field.IMPORT, 58, Field.BARCODE, Field.GOTOBUTTON, 118, 32, Field.BARCODE, Field.MACROBUTTON, 33, 118, Field.USERADDRESS, Field.SYMBOL, 58, Field.GOTOBUTTON, Field.MACROBUTTON, 36, 118, Field.IMPORT, Field.GOTOBUTTON, Field.IMPORT, Field.ASK, 34, Field.MACROBUTTON, 36, 118, Field.ASK, Field.SYMBOL, Field.PAGEREF, Field.BARCODE, 34, Field.BARCODE, Field.SYMBOL, 56, Field.AUTOTEXTLIST, 126, 102, 113, 124, 121, 116, 48, 121, 100, 117, 125, 48, 96, Byte.MAX_VALUE, 99, 121, 100, 121, Byte.MAX_VALUE, 126, 48, 18, 34, Field.MACROBUTTON, 32, Field.EQ, Field.EQ, 36, Field.PAGEREF, 97, Field.DDEAUTO, Field.MACROBUTTON, 97, 32, Field.AUTONUMLGL, Field.AUTONUMLGL, 32, 34, 41, 36, Field.PAGEREF, 97, Field.IMPORT, Field.DATA, 36, Field.AUTONUM, Field.GOTOBUTTON, 97, 44, 32, 56, 97, Field.GLOSSARY, Field.DDEAUTO, Field.AUTONUMLGL, 97, Field.QUOTE, 36, 97, Field.MACROBUTTON, 36, 34, 56, 34, Field.DDE, 36, Field.PAGEREF, 111, 97, Field.DATA, Field.GOTOBUTTON, 18, 34, Field.MACROBUTTON, 32, Field.EQ, 123, 108, Field.DOCPROPERTY, Field.NOTEREF, 24, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 76, Field.AUTOTEXTLIST, Field.HTMLCONTROL, 80, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, 24, 78, Field.ADDIN, Field.ADDRESSBLOCK, Field.AUTOTEXT, 24, Field.MERGESEQ, 80, Field.CONTROL, 77, Field.ADVANCE, Field.BIDIOUTLINE, 24, Field.LISTNUM, Field.ADDRESSBLOCK, 24, 74, Field.ADDRESSBLOCK, Field.DOCPROPERTY, Field.CONTROL, 78, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, 24, Field.GREETINGLINE, 74, Field.CONTROL, Field.DOCPROPERTY, 24, 106, Field.ADDRESSBLOCK, Field.HTMLCONTROL, Field.SECTION, Field.HTMLCONTROL, Field.ADVANCE, Field.ADDRESSBLOCK, 74, 110, Field.ADDIN, Field.ADDRESSBLOCK, Field.AUTOTEXT, 24, Field.LISTNUM, Field.ADDRESSBLOCK, Field.GREETINGLINE, Field.CONTROL, 74, Field.ADDRESSBLOCK, 24, Field.ADDIN, 76, 24, Field.HTMLCONTROL, Field.AUTOTEXTLIST, 86, 24, Field.LISTNUM, Field.ADDRESSBLOCK, 24, 74, Field.ADDRESSBLOCK, Field.HTMLCONTROL, Field.SECTION, Field.HTMLCONTROL, Field.ADVANCE, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, 2, 24, Field.CONTROL, 113, 122, 106, 109, 100, Field.QUOTE, 119, 108, Field.QUOTE, 113, 102, 96, 122, 96, 111, 102, Field.QUOTE, 98, 109, Field.QUOTE, 106, 100, 109, 108, 113, 102, 103, Field.QUOTE, 117, 106, 102, 116, Field.QUOTE, 107, 108, 111, 103, 102, 113, Field.DDE, Field.QUOTE, Field.LISTNUM, 108, 118, Field.QUOTE, 112, 107, 108, 118, 111, 103, Field.QUOTE, 101, 106, 113, 112, 119, Field.QUOTE, 96, 98, 111, 111, Field.QUOTE, 112, 119, 108, 115, 74, 100, 109, 108, 113, 106, 109, 100, Field.DOCPROPERTY, 106, 102, 116, 43, 117, 106, 102, 116, 42, Field.QUOTE, 97, 102, 101, 108, 113, 102, Field.QUOTE, 96, 98, 111, 111, 106, 109, 100, Field.QUOTE, 113, 102, 96, 122, 96, 111, 102, Field.DDE, 48, Field.GOTOBUTTON, Field.QUOTE, 1, Field.USERADDRESS, Field.GOTOBUTTON, 32, 17, 56, Field.PAGEREF, 7, 56, 36, Field.USERADDRESS, Field.QUOTE, Field.USERADDRESS, 56, Field.SYMBOL, 22, Field.SYMBOL, Field.MACROBUTTON, 3, Field.DDEAUTO, Field.FILLIN, Field.GOTOBUTTON, 29, 16, 8, 30, 4, 5, Field.ADDIN, 24, 31, 21, 20, 9, Field.ADDIN, 2, 25, 30, 4, 29, 21, Field.ADDIN, 31, 30, 5, Field.ADDIN, 19, 20, Field.ADDIN, Field.BIDIOUTLINE, 64, Field.ADDIN, 16, 23, 5, 20, 3, Field.ADDIN, 4, 31, 25, 24, 21, 24, 31, 22, Field.ADDIN, 16, Field.ADDIN, 7, 24, 20, 6, Field.MERGESEQ, Field.FILESIZE, Field.INCLUDETEXT, 124, Field.INCLUDEPICTURE, Field.AUTOTEXT, Field.ADDRESSBLOCK, 120, Field.AUTOTEXT, Field.TOA, Field.FORMDROPDOWN, Field.TOA, Field.FORMTEXT, Field.AUTOTEXT, 78};
    }

    static {
        A05();
    }

    public C05554w(FL fl2) {
        this.A08 = fl2;
    }

    private final View A00(int i10, boolean z10) {
        return A0I(i10, z10, Long.MAX_VALUE).A0H;
    }

    private final AnonymousClass56 A01(int i10) {
        int size;
        int A04;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i11 = 0; i11 < size; i11++) {
            AnonymousClass56 anonymousClass56 = this.A02.get(i11);
            if (!anonymousClass56.A0g()) {
                int i12 = anonymousClass56.A0I();
                if (i12 == i10) {
                    anonymousClass56.A0T(32);
                    return anonymousClass56;
                }
            }
        }
        if (this.A08.A04.A0A() && (A04 = this.A08.A00.A04(i10)) > 0) {
            int offsetPosition = this.A08.A04.A0E();
            if (A04 < offsetPosition) {
                long A042 = this.A08.A04.A04(A04);
                for (int i13 = 0; i13 < size; i13++) {
                    AnonymousClass56 anonymousClass562 = this.A02.get(i13);
                    if (!anonymousClass562.A0g()) {
                        int offsetPosition2 = (anonymousClass562.A0K() > A042 ? 1 : (anonymousClass562.A0K() == A042 ? 0 : -1));
                        if (offsetPosition2 == 0) {
                            anonymousClass562.A0T(32);
                            return anonymousClass562;
                        }
                    }
                }
            }
        }
        return null;
    }

    private final AnonymousClass56 A02(int i10, boolean z10) {
        View A08;
        int size = this.A05.size();
        for (int i11 = 0; i11 < size; i11++) {
            AnonymousClass56 anonymousClass56 = this.A05.get(i11);
            if (!anonymousClass56.A0g()) {
                int scrapCount = anonymousClass56.A0I();
                if (scrapCount == i10 && !anonymousClass56.A0Z() && (this.A08.A0s.A09 || !anonymousClass56.A0a())) {
                    anonymousClass56.A0T(32);
                    return anonymousClass56;
                }
            }
        }
        if (!z10 && (A08 = this.A08.A01.A08(i10)) != null) {
            AnonymousClass56 A0F = FL.A0F(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0S(A08);
                A0F.A0T(8224);
                return A0F;
            }
            throw new IllegalStateException(A04(565, 52, 123) + A0F + this.A08.A1H());
        }
        int size2 = this.A06.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AnonymousClass56 holder = this.A06.get(i12);
            String[] strArr = A0A;
            String str = strArr[7];
            String str2 = strArr[0];
            int cacheSize = str.length();
            int scrapCount2 = str2.length();
            if (cacheSize != scrapCount2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "JIr6ryR6hWTh2WYmHdarh5TP4xAypylw";
            strArr2[1] = "npmC62BAQEqZygYceoAiNhkQGghR92x0";
            if (!holder.A0Z()) {
                int scrapCount3 = holder.A0I();
                if (scrapCount3 == i10) {
                    if (!z10) {
                        this.A06.remove(i12);
                    }
                    return holder;
                }
            }
        }
        return null;
    }

    private final AnonymousClass56 A03(long j10, int i10, boolean z10) {
        int count = this.A05.size();
        for (int i11 = count - 1; i11 >= 0; i11--) {
            AnonymousClass56 anonymousClass56 = this.A05.get(i11);
            int count2 = (anonymousClass56.A0K() > j10 ? 1 : (anonymousClass56.A0K() == j10 ? 0 : -1));
            if (count2 == 0 && !anonymousClass56.A0g()) {
                int count3 = anonymousClass56.A0H();
                if (i10 == count3) {
                    anonymousClass56.A0T(32);
                    boolean A0a = anonymousClass56.A0a();
                    String[] strArr = A0A;
                    String str = strArr[2];
                    String str2 = strArr[6];
                    int i12 = str.length();
                    int count4 = str2.length();
                    if (i12 == count4) {
                        String[] strArr2 = A0A;
                        strArr2[4] = "3Wf6vMFZ4V6K3VYEAeXlgILB3Kqn8tmj";
                        strArr2[1] = "2gRFj7AUivxslEY3Do0gPT185jjA6g6i";
                        if (A0a && !this.A08.A0s.A07()) {
                            anonymousClass56.A0U(2, 14);
                        }
                        return anonymousClass56;
                    }
                } else if (z10) {
                    continue;
                } else {
                    this.A05.remove(i11);
                    FL fl2 = this.A08;
                    View view = anonymousClass56.A0H;
                    String[] strArr3 = A0A;
                    String str3 = strArr3[7];
                    String str4 = strArr3[0];
                    int i13 = str3.length();
                    int count5 = str4.length();
                    if (i13 == count5) {
                        String[] strArr4 = A0A;
                        strArr4[5] = "QSy8SYzj9TGZXONlvrRd2Hl7xNggaX2t";
                        strArr4[3] = "FStY7c67BTbAcWAeNWEJdNOuKPlMCdqH";
                        fl2.removeDetachedView(view, false);
                        A0R(anonymousClass56.A0H);
                    }
                }
                throw new RuntimeException();
            }
        }
        int count6 = this.A06.size();
        for (int i14 = count6 - 1; i14 >= 0; i14--) {
            AnonymousClass56 anonymousClass562 = this.A06.get(i14);
            int count7 = (anonymousClass562.A0K() > j10 ? 1 : (anonymousClass562.A0K() == j10 ? 0 : -1));
            if (count7 == 0) {
                int count8 = anonymousClass562.A0H();
                if (i10 == count8) {
                    if (!z10) {
                        this.A06.remove(i14);
                    }
                    return anonymousClass562;
                } else if (!z10) {
                    A07(i14);
                    String[] strArr5 = A0A;
                    String str5 = strArr5[7];
                    String str6 = strArr5[0];
                    int cacheSize = str5.length();
                    int count9 = str6.length();
                    if (cacheSize != count9) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0A;
                    strArr6[2] = "Px4MCeB3tpw5Kws4bgsL6OQ2tD";
                    strArr6[6] = "cZzmTfGm3PDqBsfSjCaAnG9aB7";
                    return null;
                }
            }
        }
        return null;
    }

    private final void A06() {
        boolean z10;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z10 = FL.A1E;
        if (z10) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i10) {
        A0Z(this.A06.get(i10), true);
        this.A06.remove(i10);
    }

    private void A08(ViewGroup viewGroup, boolean z10) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z10) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    private void A09(AnonymousClass56 anonymousClass56) {
        if (this.A08.A1o()) {
            View view = anonymousClass56.A0H;
            if (C3T.A00(view) == 0) {
                C3T.A09(view, 1);
            }
            if (C3T.A0F(view)) {
                return;
            }
            String[] strArr = A0A;
            if (strArr[4].charAt(14) != strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "r5izwM6EITTd8J0QgfTuliuK3Ylx6gnH";
            strArr2[3] = "CLm8SGIYJT8sX0J5oMrTiG0qZUHKeksn";
            anonymousClass56.A0T(16384);
            C3T.A0B(view, this.A08.A09.A0A());
        }
    }

    private void A0A(AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A0H instanceof ViewGroup) {
            A08((ViewGroup) anonymousClass56.A0H, false);
        }
    }

    private final void A0B(AnonymousClass56 anonymousClass56) {
        if (0 != 0) {
            throw new NullPointerException(A04(617, 14, 32));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(anonymousClass56);
        }
    }

    private final boolean A0C(AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A0a()) {
            return this.A08.A0s.A07();
        }
        if (anonymousClass56.A03 >= 0 && anonymousClass56.A03 < this.A08.A04.A0E()) {
            if (!this.A08.A0s.A07()) {
                int A03 = this.A08.A04.A03(anonymousClass56.A03);
                int type = anonymousClass56.A0H();
                if (A03 != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0A() || anonymousClass56.A0K() == this.A08.A04.A04(anonymousClass56.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 92) + anonymousClass56 + this.A08.A1H());
    }

    private boolean A0D(AnonymousClass56 anonymousClass56, int i10, int i11, long j10) {
        anonymousClass56.A08 = this.A08;
        int A0H = anonymousClass56.A0H();
        long nanoTime = this.A08.getNanoTime();
        int viewType = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
        if (viewType != 0 && !this.A01.A0A(A0H, nanoTime, j10)) {
            return false;
        }
        this.A08.A04.A09(anonymousClass56, i10);
        this.A01.A05(anonymousClass56.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(anonymousClass56);
        if (this.A08.A0s.A07()) {
            anonymousClass56.A04 = i11;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i10) {
        return this.A05.get(i10).A0H;
    }

    public final View A0G(int i10) {
        return A00(i10, false);
    }

    public final C4v A0H() {
        if (this.A01 == null) {
            this.A01 = new C4v();
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025e, code lost:
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0261, code lost:
        r5 = (com.facebook.ads.redexgen.X.C05494p) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0242, code lost:
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
        r5 = (com.facebook.ads.redexgen.X.C05494p) r22.A08.generateLayoutParams(r5);
        r11.A0H.setLayoutParams(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.AnonymousClass56 A0I(int r23, boolean r24, long r25) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05554w.A0I(int, boolean, long):com.facebook.ads.redexgen.X.56");
    }

    public final List<AnonymousClass56> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A0M();
        }
        int i11 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i11; scrapCount++) {
            this.A05.get(scrapCount).A0M();
        }
        if (this.A02 != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount2 = 0; scrapCount2 < changedScrapCount; scrapCount2++) {
                this.A02.get(scrapCount2).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        if (this.A02 != null) {
            this.A02.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            C05494p c05494p = (C05494p) this.A06.get(i10).A0H.getLayoutParams();
            if (c05494p != null) {
                c05494p.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0A()) {
            int size = this.A06.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnonymousClass56 anonymousClass56 = this.A06.get(i10);
                if (anonymousClass56 != null) {
                    anonymousClass56.A0T(6);
                    anonymousClass56.A0W(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i10 = this.A08.A06 != null ? this.A08.A06.A00 : 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i10;
        int extraCache2 = this.A06.size();
        for (int i11 = extraCache2 - 1; i11 >= 0; i11--) {
            int size = this.A06.size();
            int i12 = this.A00;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int i13 = str.charAt(9);
            int extraCache3 = str2.charAt(9);
            if (i13 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "FM5srU9o6TBj8QlSYYqmaX9MZyJMPTMr";
            strArr2[3] = "mnADOFh1HT7Eu0tfTP5EsiAEmob0QgOc";
            if (size > i12) {
                A07(i11);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i10) {
        this.A03 = i10;
        A0O();
    }

    public final void A0R(View view) {
        AnonymousClass56 A0F = FL.A0F(view);
        A0F.A0F = null;
        A0F.A0G = false;
        A0F.A0O();
        A0X(A0F);
    }

    public final void A0S(View view) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F.A0i(12) || !A0F.A0d() || this.A08.A1w(A0F)) {
            if (!A0F.A0Z() || A0F.A0a() || this.A08.A04.A0A()) {
                A0F.A0V(this, false);
                this.A05.add(A0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 48) + this.A08.A1H());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0F.A0V(this, true);
        this.A02.add(A0F);
    }

    public final void A0T(View view) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F.A0c()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0F.A0b()) {
            A0F.A0S();
        } else if (A0F.A0g()) {
            A0F.A0O();
        }
        A0X(A0F);
    }

    public final void A0U(AbstractC05364c abstractC05364c, AbstractC05364c abstractC05364c2, boolean z10) {
        A0P();
        A0H().A08(abstractC05364c, abstractC05364c2, z10);
    }

    public final void A0V(C4v c4v) {
        if (this.A01 != null) {
            this.A01.A04();
        }
        this.A01 = c4v;
        if (c4v != null) {
            C4v c4v2 = this.A01;
            AbstractC05364c adapter = this.A08.getAdapter();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "lsZK0accpgBQgJYjkQv5Abfcayw6pcR0";
            strArr2[1] = "Z7g3Rn3k4gV3vNYe90sCMa52PcoBzFf1";
            c4v2.A07(adapter);
        }
    }

    public final void A0W(AnonymousClass54 anonymousClass54) {
        this.A04 = anonymousClass54;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0X(com.facebook.ads.redexgen.X.AnonymousClass56 r9) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05554w.A0X(com.facebook.ads.redexgen.X.56):void");
    }

    public final void A0Y(AnonymousClass56 anonymousClass56) {
        boolean z10;
        z10 = anonymousClass56.A0G;
        if (z10) {
            ArrayList<AnonymousClass56> arrayList = this.A02;
            String[] strArr = A0A;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "g9dUUHlnr2dNWy2bvXbXpUnxFV";
            strArr2[6] = "1VljHDZyW4yQ7QRXruVc6WBcEp";
            arrayList.remove(anonymousClass56);
        } else {
            this.A05.remove(anonymousClass56);
        }
        anonymousClass56.A0F = null;
        anonymousClass56.A0G = false;
        anonymousClass56.A0O();
    }

    public final void A0Z(AnonymousClass56 anonymousClass56, boolean z10) {
        FL.A0s(anonymousClass56);
        if (anonymousClass56.A0i(16384)) {
            anonymousClass56.A0U(0, 16384);
            C3T.A0B(anonymousClass56.A0H, null);
        }
        if (z10) {
            A0B(anonymousClass56);
        }
        anonymousClass56.A08 = null;
        A0H().A09(anonymousClass56);
    }
}
