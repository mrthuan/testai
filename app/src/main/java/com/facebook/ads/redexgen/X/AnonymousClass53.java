package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.53  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass53 {
    public static byte[] A0H;
    public int A01;
    public int A02;
    public int A06;
    public int A07;
    public long A08;
    public SparseArray<Object> A0G;
    public int A0F = -1;
    public int A05 = 0;
    public int A00 = 0;
    public int A04 = 1;
    public int A03 = 0;
    public boolean A0D = false;
    public boolean A09 = false;
    public boolean A0E = false;
    public boolean A0A = false;
    public boolean A0C = false;
    public boolean A0B = false;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0H = new byte[]{Field.MERGESEQ, 9, 30, 31, Field.MERGESEQ, 2, 31, Field.MERGESEQ, 2, 24, Field.MERGESEQ, 22, 26, Field.CONTROL, 126, Field.HTMLCONTROL, 78, Field.HTMLCONTROL, 7, 78, Field.SECTIONPAGES, 15, Field.ASK, 7, 14, 7, 22, 7, 6, 43, 12, 20, 11, 17, 11, 0, 14, 7, 43, 22, 7, 15, 33, 13, 23, 12, 22, Field.EQ, 11, 12, 1, 7, Field.GOTOBUTTON, 16, 7, 20, 11, 13, 23, 17, Field.DDEAUTO, 3, Field.NUMWORDS, 13, 23, 22, Field.SHAPE, 33, Field.DDE, 96, Field.INCLUDETEXT, 99, Field.ADDRESSBLOCK, Byte.MAX_VALUE, 104, Field.SECTION, 108, 116, 98, 120, 121, 48, 60, 48, 125, Field.AUTOTEXTLIST, 100, 117, 125, Field.FORMDROPDOWN, Byte.MAX_VALUE, 101, 126, 100, Field.DDE, 3, 15, Field.SECTIONPAGES, Byte.MAX_VALUE, Field.ADDRESSBLOCK, 74, Field.AUTOTEXTLIST, Field.FORMTEXT, 64, Field.LISTNUM, Field.BIDIOUTLINE, 99, 78, 86, 64, Field.LISTNUM, Field.HTMLCONTROL, 102, Field.HTMLCONTROL, 74, Field.SECTIONPAGES, 108, 64, Field.LISTNUM, Field.SECTION, Field.HTMLCONTROL, 18, 86, Field.LISTNUM, 23, Field.DATA, 15, 20, 42, 8, 31, 30, 19, 25, 14, 19, 12, 31, 59, 20, 19, 23, Field.NUMWORDS, 14, 19, 21, 20, 9, Field.FORMCHECKBOX, 41, Field.PAGEREF, 104, Field.CONTROL, 112, 107, 86, 108, 104, 117, 105, 96, Field.INCLUDETEXT, 107, 108, 104, 100, 113, 108, 106, 107, 118, 56, 17, 29, 80, 110, Field.TOA, Field.AUTOTEXT, Field.NOTEREF, Field.GREETINGLINE, Field.TOA, Field.NOTEREF, Field.AUTOTEXT, Field.HYPERLINK, 126, Field.DOCPROPERTY, Field.BIDIOUTLINE, Field.FORMDROPDOWN, Field.LISTNUM, Field.HYPERLINK, Field.AUTOTEXTLIST, 0, 120, Field.DOCPROPERTY, 77, Field.HTMLCONTROL, Field.SECTION, 64, 20, Field.FORMCHECKBOX, 64, Field.DOCPROPERTY, 64, Field.ADDIN, 20, Field.FORMCHECKBOX, Field.BIDIOUTLINE, Field.HTMLCONTROL, Field.SECTION, Field.HYPERLINK, 80, 20, 86, Field.ADDIN, 20, Field.HTMLCONTROL, Field.LISTNUM, Field.ADDIN, 20, Field.HTMLCONTROL, 82, 20, 107, 76, Field.AUTOTEXTLIST, 76, Field.ADDRESSBLOCK, Field.INCLUDEPICTURE, Field.DOCPROPERTY, 108, Field.AUTOTEXTLIST, 74, Field.SHAPE, Field.ADDRESSBLOCK, 76, 104, Field.CONTROL, Field.MERGESEQ, Field.ADDIN, 76, Field.ADDIN, Field.CONTROL, 86, 5};
    }

    public final int A03() {
        if (this.A09) {
            return this.A05 - this.A00;
        }
        return this.A03;
    }

    public final void A04(int i10) {
        if ((this.A04 & i10) != 0) {
            return;
        }
        throw new IllegalStateException(A01(192, 30, 44) + Integer.toBinaryString(i10) + A01(0, 11, 115) + Integer.toBinaryString(this.A04));
    }

    public final void A05(AbstractC05364c abstractC05364c) {
        this.A04 = 1;
        this.A03 = abstractC05364c.A0E();
        this.A09 = false;
        this.A0E = false;
        this.A0A = false;
    }

    public final boolean A06() {
        return this.A0F != -1;
    }

    public final boolean A07() {
        return this.A09;
    }

    public final boolean A08() {
        return this.A0B;
    }

    public final String toString() {
        return A01(222, 22, 32) + this.A0F + A01(11, 8, 34) + this.A0G + A01(82, 13, 8) + this.A03 + A01(95, 27, 55) + this.A05 + A01(19, 48, 122) + this.A00 + A01(ShapeTypes.ACTION_BUTTON_MOVIE, 20, 37) + this.A0D + A01(67, 15, 21) + this.A09 + A01(ShapeTypes.FLOW_CHART_SORT, 23, 29) + this.A0C + A01(122, 27, 98) + this.A0B + '}';
    }
