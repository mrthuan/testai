package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.as  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1375as extends AnonymousClass51 {
    public static byte[] A06;
    public static String[] A07 = {"ZeVLivVBnS1aoVlC2PGSN001bhNNVWpd", "UVHNMhASFprendMTBixyPal4p5ABOqh9", "McvoL7vwBcNsRrFgWF8", "NjfWBR2llDufPeBAgLyuBDteRTJCHxSb", "wixo9thO", "Otknv8q9MbYFm1QayK0knTm3Lm4p4QUP", "Dtck5bq60bDmwFSuqNFF3ANsa4oCLChk", "09JoBoJUIjBPlvD9emsVrlLKVUsGd7rc"};
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final int A03(View view, int i10) {
        AbstractC05484o A08 = A08();
        if (A08 == null || !A08.A21()) {
            return 0;
        }
        C05494p c05494p = (C05494p) view.getLayoutParams();
        return A0N(A08.A0o(view) - c05494p.topMargin, A08.A0j(view) + c05494p.bottomMargin, A08.A0g(), A08.A0X() - A08.A0d(), i10);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{Field.DDE, 8, 15, 4, 0, 19, Field.GOTOBUTTON, 12, 14, 14, 21, 9, Field.GOTOBUTTON, 2, 19, 14, 13, 13, 4, 19, 124, 74, 80, 5, 86, 77, 74, 80, Field.TOA, Field.SECTION, 5, 74, Field.FORMDROPDOWN, 64, Field.CONTROL, Field.CONTROL, 76, Field.SECTION, 64, 5, Field.FORMTEXT, 74, Field.NOTEREF, Field.DOCPROPERTY, 80, Field.ADDIN, 64, 118, Field.FORMTEXT, Field.CONTROL, 74, Field.TOA, Field.TOA, 115, 64, Field.FORMTEXT, Field.ADDIN, 74, Field.CONTROL, 99, 74, Field.CONTROL, 117, 74, 86, 76, Field.ADDIN, 76, 74, Field.MERGESEQ, 5, 82, 77, 64, Field.MERGESEQ, 5, Field.ADDIN, 77, 64, 5, 105, Field.INCLUDETEXT, Field.BIDIOUTLINE, 74, 80, Field.ADDIN, 104, Field.INCLUDETEXT, Field.MERGESEQ, Field.INCLUDETEXT, Field.SECTIONPAGES, 64, Field.CONTROL, 5, Field.SECTION, 74, 64, 86, 5, Field.MERGESEQ, 74, Field.ADDIN, 5, 76, Field.NOTEREF, Field.DOCPROPERTY, Field.TOA, 64, Field.NOTEREF, 64, Field.MERGESEQ, Field.ADDIN, 5, 117, 104, 103, 118, Field.ASK, 118, 116, 99, 96, 99, 116, 99, 104, 101, 99, Field.ASK, 117, 110, 105, 115, 106, 98, Field.ASK, 100, 99, Field.ASK, 105, 104, 99, Field.ASK, 105, 96, Field.ASK, 114, 110, 99, Field.ASK, 101, 105, 104, 117, 114, 103, 104, 114, 117, Field.ASK, 98, 99, 96, 111, 104, 99, 98, Field.ASK, 111, 104, Field.ASK, Field.DOCPROPERTY, 107, 105, 105, 114, 110, Field.DOCPROPERTY, 101, 116, 105, 106, 106, 99, 116, 42, Field.ASK, 117, 114, 103, 116, 114, 111, 104, 97, Field.ASK, 113, 111, 114, 110, Field.ASK, Field.DOCPROPERTY, Field.NOTEREF, Field.FORMCHECKBOX, 86, Field.AUTOTEXTLIST};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public int A0O(View view, int i10) {
        AbstractC05484o A08 = A08();
        if (A08 == null || !A08.A20()) {
            return 0;
        }
        C05494p c05494p = (C05494p) view.getLayoutParams();
        return A0N(A08.A0k(view) - c05494p.leftMargin, A08.A0n(view) + c05494p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i10);
    }

    static {
        A06();
    }

    public C1375as(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        if (this.A02 == null || this.A02.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i10, int i11) {
        int before = i10 - i11;
        if (i10 * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(C05584z c05584z) {
        PointF A0P = A0P(A07());
        if (A0P == null || (A0P.x == 0.0f && A0P.y == 0.0f)) {
            c05584z.A03(A07());
            A09();
            return;
        }
        A0B(A0P);
        this.A02 = A0P;
        this.A00 = (int) (A0P.x * 10000.0f);
        this.A01 = (int) (A0P.y * 10000.0f);
        int A0L = A0L(Constants.CP_MAC_ROMAN);
        int i10 = (int) (this.A00 * 1.2f);
        int i11 = (int) (this.A01 * 1.2f);
        int time = A07[2].length();
        if (time != 19) {
            throw new RuntimeException();
        }
        A07[1] = "hx3pIt9eJlYI2ywoto5TCaec45lSGfjK";
        int time2 = (int) (A0L * 1.2f);
        c05584z.A04(i10, i11, time2, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51
    public final void A0H(int i10, int i11, AnonymousClass53 anonymousClass53, C05584z c05584z) {
        if (A06() == 0) {
            A09();
            if (A07[2].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[7] = "mtmNmOzcoe2a0U4cnzAn20gs4sdBvWQ8";
            strArr[3] = "eV2w3A07ZjFunHiJvnAZuuNmUx5etHx7";
            return;
        }
        this.A00 = A01(this.A00, i10);
        this.A01 = A01(this.A01, i11);
        if (A07[4].length() != 8) {
            if (this.A00 != 0) {
                return;
            }
        } else {
            String[] strArr2 = A07;
            strArr2[7] = "DcFC9yFlUF16xNqjYqSfoPj4l29Ulhpi";
            strArr2[3] = "h8WgdOPxw0F7hfvsQm1LsAkbSgkBaMel";
            if (this.A00 != 0) {
                return;
            }
        }
        if (this.A01 == 0) {
            A07(c05584z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass51
    public void A0I(View view, AnonymousClass53 anonymousClass53, C05584z c05584z) {
        int A0O = A0O(view, A0K());
        int dx = A00();
        int A03 = A03(view, dx);
        int dy = A0O * A0O;
        int dx2 = A03 * A03;
        int time = A0M((int) Math.sqrt(dy + dx2));
        if (time > 0) {
            int distance = -A0O;
            int dy2 = -A03;
            c05584z.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        if (this.A02 == null || this.A02.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i10) {
        return (int) Math.ceil(Math.abs(i10) * this.A03);
    }

    public final int A0M(int i10) {
        return (int) Math.ceil(A0L(i10) / 0.3356d);
    }

    public final int A0N(int i10, int i11, int i12, int i13, int i14) {
        switch (i14) {
            case -1:
                return i12 - i10;
            case 0:
                int i15 = i12 - i10;
                if (i15 > 0) {
                    return i15;
                }
                int i16 = i13 - i11;
                if (i16 < 0) {
                    return i16;
                }
                return 0;
            case 1:
                return i13 - i11;
            default:
                throw new IllegalArgumentException(A04(113, 93, 125));
        }
    }

    public PointF A0P(int i10) {
        AbstractC05484o A08 = A08();
        if (A08 instanceof AnonymousClass50) {
            return ((AnonymousClass50) A08).A4k(i10);
        }
        Log.w(A04(0, 20, 26), A04(20, 93, 94) + AnonymousClass50.class.getCanonicalName());
        return null;
    }
}
