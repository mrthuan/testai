package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.56  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass56 {
    public static byte[] A0I;
    public static String[] A0J = {"elFBINX9KCZeeh3GuBtXNkrnzvQO2EpS", "90eRnITlqXrODLYCktUoA3f94MaN8E2n", "frZa4xykTTwKCwTkBfcIIin", "72h0olRZUROZW521vLa1lYqHWLi1sRbG", "kk2D46k9ZSS3Lo8lOZQg", "QRz6bzRDBRAzmbOrrZDxPPvKGEinNos5", "9IkI3xtzDHMbybABrSkeOgSSTxMSP2eR", "o2K5Iq3zbWnsvhRLVQUneLMfyrath7l2"};
    public static final List<Object> A0K;
    public FL A08;
    public WeakReference<FL> A09;
    public int A0C;
    public final View A0H;
    public int A03 = -1;
    public int A01 = -1;
    public long A05 = -1;
    public int A00 = -1;
    public int A04 = -1;
    public AnonymousClass56 A06 = null;
    public AnonymousClass56 A07 = null;
    public List<Object> A0A = null;
    public List<Object> A0B = null;
    public int A0D = 0;
    public C05554w A0F = null;
    public boolean A0G = false;
    public int A0E = 0;
    public int A02 = -1;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
            String[] strArr = A0J;
            if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[0] = "UeRrU6VIZhMUvjXaMrLT2TysGAtdmGOb";
            strArr2[1] = "zACgjBXCZF9ewGg4NUIKbeNCvKdUEEL0";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0I = new byte[]{3, 74, Field.FORMCHECKBOX, 30, 126, Field.IMPORT, Field.SYMBOL, 48, Field.EQ, 44, 59, 58, 86, 31, 24, 0, 23, 26, 31, 18, 25, Field.CONTROL, 86, 25, Field.TOA, Field.HYPERLINK, Field.MERGESEQ, Field.BIDIOUTLINE, Field.CONTROL, 77, 60, 114, 115, 104, 60, 110, 121, Byte.MAX_VALUE, 101, Byte.MAX_VALUE, 112, 125, 126, 112, 121, Field.AUTONUMOUT, 24, Field.NOTEREF, Field.CONTROL, Field.MERGESEQ, Field.ADDIN, 76, Field.ADDIN, Field.CONTROL, 86, 5, 33, 115, 100, 108, 110, 119, 100, 101, Field.DOCPROPERTY, 6, 22, 7, 20, 5, Field.DOCPROPERTY, 18, Field.FORMTEXT, Field.SHAPE, Field.SECTIONPAGES, 118, Field.CONTROL, Field.FORMTEXT, Field.FORMDROPDOWN, Field.ADDIN, Field.LISTNUM, Field.CONTROL, 86, 122, Field.GLOSSARY, Field.AUTONUMOUT, 56, Field.AUTONUMLGL, Field.GLOSSARY, Field.AUTONUMOUT, Field.USERADDRESS, 26, Field.AUTOTEXT, Field.ADVANCE, Field.GREETINGLINE, Field.SHAPE, Field.BIDIOUTLINE, Field.FORMDROPDOWN, Field.ADVANCE, Field.SHAPE, Field.GREETINGLINE, 26, Field.HTMLCONTROL, Field.GREETINGLINE, Field.HTMLCONTROL, 74, 78, Field.SHAPE, Field.NOTEREF, 26, 74, Field.DOCPROPERTY, Field.TOA, Field.FORMDROPDOWN, 78, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.ADVANCE, 2, Field.CONTROL, 82, Field.FORMTEXT, Field.INCLUDEPICTURE, 86, Field.FORMCHECKBOX, Field.GOTOBUTTON, 32, 44, 99, 96, 104, Field.BIDIOUTLINE, 99, Byte.MAX_VALUE, Field.EQ, Field.NUMWORDS, 23, Field.FORMCHECKBOX, 123, Field.FORMCHECKBOX, Field.HYPERLINK, Field.INCLUDETEXT, 13, 34, 29, 17, 3, Field.ASK, 25, 21, 7, 56, 31, Field.NUMCHARS, 20, 21, 2, 11, 61, 7, 18, 18, 7, 5, 14, 3, 2, Field.AUTONUMLGL, 5, 20, 7, 22, 59, 58, 2, 9, 0, 15, 6, 4, Field.GOTOBUTTON, 2, 19, 0, 17, 60, Field.DDEAUTO, Field.AUTONUMOUT, 21, 34, 36, Field.USERADDRESS, 36, 43, Field.ASK, Field.PAGEREF, 43, 34, 103, Field.QUOTE, 34, 36, Field.AUTONUMLGL, 34, 42, 34, 41, Field.MACROBUTTON, 34, Field.QUOTE, 103, Field.PAGEREF, 34, 43, Field.DATA, 48, 103, 119, 125, 103, Field.GOTOBUTTON, 41, 42, Field.ASK, Field.MACROBUTTON, 36, Field.GLOSSARY, 34, Field.QUOTE, 103, Field.IMPORT, Field.ASK, Field.DDEAUTO, Field.AUTONUMLGL, 103, Field.DATA, 33, 103, Field.AUTONUMOUT, 34, Field.MACROBUTTON, 14, Field.AUTONUMOUT, 21, 34, 36, Field.USERADDRESS, Field.ASK, Field.PAGEREF, 43, 34, 111, 110, 103, 36, Field.ASK, 43, 43, Field.AUTONUMOUT, 103, 33, Field.DATA, Field.AUTONUMLGL, 103, 29, 0, 17, 25, 34, 29, 17, 3, Field.ADVANCE, 25, 21, 13, Field.ADVANCE, 26, Field.NUMWORDS, 0, Field.ADVANCE, 22, 17, Field.ADVANCE, 26, 1, 24, 24, 123};
    }

    static {
        A04();
        A0K = Collections.EMPTY_LIST;
    }

    public AnonymousClass56(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException(A02(264, 24, 66));
    }

    private void A03() {
        if (this.A0A == null) {
            this.A0A = new ArrayList();
            this.A0B = Collections.unmodifiableList(this.A0A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(FL fl2) {
        this.A0E = C3T.A00(this.A0H);
        fl2.A1x(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(FL fl2) {
        fl2.A1x(this, this.A0E);
        this.A0E = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A09() {
        return (this.A0C & 16) == 0 && C3T.A0G(this.A0H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0A() {
        return (this.A0C & 16) != 0;
    }

    private final boolean A0B() {
        if ((this.A0C & 512) == 0) {
            boolean A0Z = A0Z();
            if (A0J[2].length() != 23) {
                throw new RuntimeException();
            }
            A0J[4] = "dSQQEa0elVuDjjqhtuiH";
            if (!A0Z) {
                return false;
            }
        }
        return true;
    }

    public final int A0G() {
        if (this.A08 == null) {
            return -1;
        }
        int A1C = this.A08.A1C(this);
        String[] strArr = A0J;
        if (strArr[7].charAt(1) != strArr[3].charAt(1)) {
            throw new RuntimeException();
        }
        A0J[2] = "FYB2N4b61bNhg9cwpN00hgm";
        return A1C;
    }

    public final int A0H() {
        return this.A00;
    }

    public final int A0I() {
        return this.A04 == -1 ? this.A03 : this.A04;
    }

    public final int A0J() {
        return this.A01;
    }

    public final long A0K() {
        return this.A05;
    }

    public final List<Object> A0L() {
        if ((this.A0C & 1024) == 0) {
            if (this.A0A == null || this.A0A.size() == 0) {
                List<Object> list = A0K;
                String[] strArr = A0J;
                if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                    throw new RuntimeException();
                }
                A0J[2] = "hQ1JLXyYGxOkcwlW4dXhMkD";
                return list;
            }
            List<Object> list2 = this.A0B;
            String[] strArr2 = A0J;
            if (strArr2[0].charAt(4) != strArr2[1].charAt(4)) {
                String[] strArr3 = A0J;
                strArr3[7] = "12FReyGhr0Gy9SAr2o7QhiY2oo1Ever4";
                strArr3[3] = "Q2P3QGMLTw8PDNq5VpeXaAuVADEzryB4";
                return list2;
            }
            return list2;
        }
        return A0K;
    }

    public final void A0M() {
        this.A01 = -1;
        this.A04 = -1;
    }

    public final void A0N() {
        if (this.A0A != null) {
            this.A0A.clear();
        }
        this.A0C &= -1025;
        String[] strArr = A0J;
        if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[0] = "zfgIUpP6NOwkKkp2713xr48Icx9i2htm";
        strArr2[1] = "7toV51THczyutnu9dsZIYiPQpALa8FIp";
    }

    public final void A0O() {
        this.A0C &= -33;
    }

    public final void A0P() {
        this.A0C &= -257;
    }

    public final void A0Q() {
        this.A0C = 0;
        this.A03 = -1;
        this.A01 = -1;
        this.A05 = -1L;
        this.A04 = -1;
        this.A0D = 0;
        this.A06 = null;
        this.A07 = null;
        A0N();
        this.A0E = 0;
        this.A02 = -1;
        FL.A0s(this);
    }

    public final void A0R() {
        if (this.A01 == -1) {
            int i10 = this.A03;
            if (A0J[4].length() != 20) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "ZtNXNLZ2mB5tglrdrkplF8NneRyyOdxT";
            strArr[5] = "cQ2wGPgO9l4ITB75rCj9hGEnqQmfMy7J";
            this.A01 = i10;
        }
    }

    public final void A0S() {
        this.A0F.A0Y(this);
    }

    public final void A0T(int i10) {
        this.A0C |= i10;
    }

    public final void A0U(int i10, int i11) {
        this.A0C = (this.A0C & (i11 ^ (-1))) | (i10 & i11);
    }

    public final void A0V(C05554w c05554w, boolean z10) {
        this.A0F = c05554w;
        this.A0G = z10;
    }

    public final void A0W(Object obj) {
        if (obj != null) {
            if ((1024 & this.A0C) != 0) {
                return;
            }
            A03();
            this.A0A.add(obj);
            return;
        }
        A0T(1024);
    }

    public final void A0X(boolean z10) {
        int i10;
        int i11 = this.A0D;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.A0D = i10;
        int i12 = this.A0D;
        if (A0J[2].length() != 23) {
            throw new RuntimeException();
        }
        A0J[2] = "rX8ZXsodik0buiwUD3KFOeS";
        if (i12 < 0) {
            this.A0D = 0;
            Log.e(A02(ShapeTypes.FLOW_CHART_CONNECTOR, 4, 66), A02(ShapeTypes.CHART_STAR, 78, 113) + this);
        } else if (!z10 && this.A0D == 1) {
            this.A0C |= 16;
        } else if (!z10 || this.A0D != 0) {
        } else {
            this.A0C &= -17;
        }
    }

    public final boolean A0Y() {
        return (this.A0C & 1) != 0;
    }

    public final boolean A0Z() {
        return (this.A0C & 4) != 0;
    }

    public final boolean A0a() {
        return (this.A0C & 8) != 0;
    }

    public final boolean A0b() {
        return this.A0F != null;
    }

    public final boolean A0c() {
        return (this.A0C & 256) != 0;
    }

    public final boolean A0d() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0e() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0f() {
        return (this.A0C & 128) != 0;
    }

    public final boolean A0g() {
        return (this.A0C & 32) != 0;
    }

    public final boolean A0h() {
        if ((this.A0C & 16) == 0) {
            View view = this.A0H;
            String[] strArr = A0J;
            if (strArr[7].charAt(1) != strArr[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[6] = "oGhVpGrwcoPRlkZsrOks4DxLuVnWzLrQ";
            strArr2[5] = "RzFlIrJ9otd57SLzr7ci506FuBBONCMw";
            if (!C3T.A0G(view)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0i(int i10) {
        return (this.A0C & i10) != 0;
    }

    public final String toString() {
        String A02;
        StringBuilder sb2 = new StringBuilder(A02(ShapeTypes.FLOW_CHART_OR, 11, 70) + Integer.toHexString(hashCode()) + A02(46, 10, 14) + this.A03 + A02(0, 4, 21) + this.A05 + A02(126, 9, 58) + this.A01 + A02(ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS, 8, 1) + this.A04);
        if (A0b()) {
            StringBuilder append = sb2.append(A02(64, 7, 67));
            boolean z10 = this.A0G;
            if (A0J[2].length() != 23) {
                throw new RuntimeException();
            }
            A0J[2] = "PPawOVKlLlIRUbnpb4vzMoP";
            if (z10) {
                String[] strArr = A0J;
                if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                    throw new RuntimeException();
                }
                A0J[4] = "lFbF3LZCiVqyeVLEGjED";
                A02 = A02(ShapeTypes.GEAR_6, 13, 87);
            } else {
                A02 = A02(ShapeTypes.FLOW_CHART_DELAY, 15, 80);
            }
            append.append(A02);
        }
        if (A0Z()) {
            sb2.append(A02(12, 8, 64));
        }
        if (!A0Y()) {
            sb2.append(A02(83, 8, 108));
        }
        if (A0e()) {
            sb2.append(A02(118, 7, 20));
        }
        if (A0a()) {
            sb2.append(A02(56, 8, 55));
        }
        if (A0f()) {
            sb2.append(A02(4, 8, 104));
        }
        if (A0c()) {
            sb2.append(A02(71, 12, 4));
        }
        if (!A0h()) {
            StringBuilder sb3 = new StringBuilder().append(A02(30, 16, 42)).append(this.A0D).append(A02(125, 1, 45));
            sb2.append(sb3.toString());
        }
        if (A0B()) {
            sb2.append(A02(91, 27, 12));
        }
        if (this.A0H.getParent() == null) {
            sb2.append(A02(20, 10, 15));
        }
        sb2.append(A02(288, 1, 48));
        return sb2.toString();
    }
}
