package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.at  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1376at extends AbstractC05484o implements AnonymousClass50 {
    public static byte[] A0F;
    public static String[] A0G = {"ZTDwmEtle1avZIcEXO6Ngzge8j05pfT9", "s1YfUPq4amp3sGXTr0KOnMWCCCkrB2x5", "RLSriKm", "hA4l3MFFurEjuKvfb479JjwTp2cnC09n", "5GFF521rSn4TdhEStccPhauxYrt7NMVp", "XQN2s9DMc1xKucEpv2CitIAcNHBR8E7y", "8ubGCSX", "EFysGv6XChRnXfWxG2n7d2ksHTdYT6om"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public C4Y A04;
    public boolean A05;
    public int A06;
    public C4T A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C4R A0D;
    public final C4S A0E;

    public static String A0T(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{31, 24, 0, 23, 26, 31, 18, 86, 25, 4, 31, 19, 24, 2, 23, 2, 31, 25, 24, 76};
    }

    static {
        A0V();
    }

    public C1376at(Context context) {
        this(context, 1, false);
    }

    public C1376at(Context context, int i10, boolean z10) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = SlideAtom.USES_MASTER_SLIDE_ID;
        this.A03 = null;
        this.A0D = new C4R(this);
        this.A0E = new C4S();
        this.A06 = 2;
        A2A(i10);
        A0h(z10);
        A1R(true);
    }

    private final int A04(int i10, C05554w c05554w, AnonymousClass53 anonymousClass53) {
        if (A0W() == 0 || i10 == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A29();
        int absDy = i10 > 0 ? 1 : -1;
        int consumed = Math.abs(i10);
        A0Y(absDy, consumed, true, anonymousClass53);
        int i11 = this.A07.A07;
        int layoutDirection = A08(c05554w, this.A07, anonymousClass53, false);
        int i12 = i11 + layoutDirection;
        if (i12 < 0) {
            return 0;
        }
        int absDy2 = consumed > i12 ? absDy * i12 : i10;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i10, C05554w c05554w, AnonymousClass53 anonymousClass53, boolean z10) {
        int fixOffset;
        int gap = this.A04.A07() - i10;
        if (gap > 0) {
            int i11 = -A04(-gap, c05554w, anonymousClass53);
            int i12 = i10 + i11;
            if (z10 && (fixOffset = this.A04.A07() - i12) > 0) {
                this.A04.A0J(fixOffset);
                return fixOffset + i11;
            }
            return i11;
        }
        return 0;
    }

    private int A06(int i10, C05554w c05554w, AnonymousClass53 anonymousClass53, boolean z10) {
        int A0A;
        int gap = i10 - this.A04.A0A();
        if (gap > 0) {
            int i11 = -A04(gap, c05554w, anonymousClass53);
            int i12 = i10 + i11;
            if (z10 && (A0A = i12 - this.A04.A0A()) > 0) {
                this.A04.A0J(-A0A);
                return i11 - A0A;
            }
            return i11;
        }
        return 0;
    }

    private final int A08(C05554w c05554w, C4T c4t, AnonymousClass53 anonymousClass53, boolean z10) {
        int i10 = c4t.A00;
        int start = c4t.A07;
        if (start != Integer.MIN_VALUE) {
            int start2 = c4t.A00;
            if (start2 < 0) {
                int i11 = c4t.A07;
                int start3 = c4t.A00;
                c4t.A07 = i11 + start3;
            }
            A0e(c05554w, c4t);
        }
        int i12 = c4t.A00;
        int start4 = c4t.A02;
        int i13 = i12 + start4;
        C4S c4s = this.A0E;
        while (true) {
            if ((!c4t.A09 && i13 <= 0) || !c4t.A05(anonymousClass53)) {
                break;
            }
            c4s.A00();
            A2D(c05554w, anonymousClass53, c4t, c4s);
            if (!c4s.A01) {
                int i14 = c4t.A06;
                int remainingSpace = c4s.A00;
                int start5 = c4t.A05;
                c4t.A06 = i14 + (remainingSpace * start5);
                if (!c4s.A03 || this.A07.A08 != null || !anonymousClass53.A07()) {
                    int remainingSpace2 = c4t.A00;
                    int start6 = c4s.A00;
                    c4t.A00 = remainingSpace2 - start6;
                    int start7 = c4s.A00;
                    i13 -= start7;
                }
                int start8 = c4t.A07;
                if (start8 != Integer.MIN_VALUE) {
                    int remainingSpace3 = c4t.A07;
                    int start9 = c4s.A00;
                    c4t.A07 = remainingSpace3 + start9;
                    int start10 = c4t.A00;
                    if (start10 < 0) {
                        int remainingSpace4 = c4t.A07;
                        int start11 = c4t.A00;
                        c4t.A07 = remainingSpace4 + start11;
                    }
                    A0e(c05554w, c4t);
                }
                if (z10 && c4s.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        int start12 = c4t.A00;
        return i10 - start12;
    }

    private int A09(AnonymousClass53 anonymousClass53) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return AnonymousClass57.A00(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private int A0A(AnonymousClass53 anonymousClass53) {
        if (A0W() != 0) {
            A29();
            return AnonymousClass57.A02(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
        } else if (A0G[3].charAt(25) != '2') {
            throw new RuntimeException();
        } else {
            A0G[1] = "J9JFedtgHh7lzsKv2wGVe5URJzbGPRgH";
            return 0;
        }
    }

    private int A0B(AnonymousClass53 anonymousClass53) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return AnonymousClass57.A01(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private final int A0C(AnonymousClass53 anonymousClass53) {
        if (anonymousClass53.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0W());
    }

    private View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final View A0H(int i10, int i11) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A29();
        if (i11 > i10) {
            next = 1;
        } else {
            next = i11 < i10 ? -1 : 0;
        }
        if (next == 0) {
            return A0t(i10);
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0t(i10));
        int next2 = this.A04.A0A();
        if (preferredBoundsFlag2 < next2) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = 4097;
        }
        int next3 = this.A00;
        if (next3 == 0) {
            return super.A04.A00(i10, i11, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i10, i11, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0J(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        A29();
        int i13 = 0;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (z11) {
            i13 = 320;
        }
        int i14 = this.A00;
        int acceptableBoundsFlag = A0G[5].charAt(29);
        if (acceptableBoundsFlag != 69) {
            throw new RuntimeException();
        }
        A0G[5] = "CO2lCdhiUyNnJNyVLVKK7uQ85cne8EHP";
        if (i14 == 0) {
            return super.A04.A00(i10, i11, i12, i13);
        }
        return super.A05.A00(i10, i11, i12, i13);
    }

    private View A0K(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        return A28(c05554w, anonymousClass53, 0, A0W(), anonymousClass53.A03());
    }

    private View A0L(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        return A28(c05554w, anonymousClass53, A0W() - 1, -1, anonymousClass53.A03());
    }

    private View A0M(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0K(c05554w, anonymousClass53) : A0L(c05554w, anonymousClass53);
    }

    private View A0P(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0L(c05554w, anonymousClass53) : A0K(c05554w, anonymousClass53);
    }

    private View A0Q(boolean z10, boolean z11) {
        if (this.A05) {
            return A0J(0, A0W(), z10, z11);
        }
        return A0J(A0W() - 1, -1, z10, z11);
    }

    private View A0R(boolean z10, boolean z11) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z10, z11);
        }
        return A0J(0, A0W(), z10, z11);
    }

    private final C4T A0S() {
        return new C4T();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2F()) {
            this.A05 = this.A0A;
        } else {
            this.A05 = !this.A0A;
        }
    }

    private void A0W(int i10, int i11) {
        this.A07.A00 = this.A04.A07() - i11;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i10;
        this.A07.A05 = 1;
        this.A07.A06 = i11;
        this.A07.A07 = SlideAtom.USES_MASTER_SLIDE_ID;
    }

    private void A0X(int i10, int i11) {
        this.A07.A00 = i11 - this.A04.A0A();
        this.A07.A01 = i10;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i11;
        this.A07.A07 = SlideAtom.USES_MASTER_SLIDE_ID;
    }

    private void A0Y(int i10, int i11, boolean z10, AnonymousClass53 anonymousClass53) {
        int A0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(anonymousClass53);
        this.A07.A05 = i10;
        if (i10 == 1) {
            this.A07.A02 += this.A04.A08();
            View A0F2 = A0F();
            C4T c4t = this.A07;
            if (!this.A05) {
                r4 = 1;
            }
            c4t.A03 = r4;
            this.A07.A01 = A0p(A0F2) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(A0F2);
            A0A = this.A04.A0C(A0F2) - this.A04.A07();
        } else {
            View A0G2 = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(A0G2) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(A0G2);
            A0A = (-this.A04.A0F(A0G2)) + this.A04.A0A();
        }
        this.A07.A00 = i11;
        if (z10) {
            C4T c4t2 = this.A07;
            int scrollingOffset = c4t2.A00;
            c4t2.A00 = scrollingOffset - A0A;
        }
        this.A07.A07 = A0A;
    }

    private void A0Z(C4R c4r) {
        A0W(c4r.A01, c4r.A00);
    }

    private void A0a(C4R c4r) {
        A0X(c4r.A01, c4r.A00);
    }

    private void A0b(C05554w c05554w, int i10) {
        int A0W = A0W();
        if (i10 < 0) {
            return;
        }
        int A06 = this.A04.A06() - i10;
        boolean z10 = this.A05;
        int limit = A0G[3].charAt(25);
        if (limit != 50) {
            throw new RuntimeException();
        }
        A0G[1] = "5eQap7viEGWOuRbzagNYDGjkAWEMIhVp";
        if (z10) {
            for (int i11 = 0; i11 < A0W; i11++) {
                View A0t = A0t(i11);
                int childCount = this.A04.A0F(A0t);
                if (childCount >= A06) {
                    int childCount2 = this.A04.A0H(A0t);
                    if (childCount2 >= A06) {
                    }
                }
                int limit2 = A0G[4].length();
                if (limit2 != 13) {
                    String[] strArr = A0G;
                    strArr[6] = "EiwXPaP";
                    strArr[2] = "4OvxlWI";
                    A0d(c05554w, 0, i11);
                    return;
                }
                A0d(c05554w, 0, i11);
                return;
            }
            return;
        }
        for (int i12 = A0W - 1; i12 >= 0; i12--) {
            View A0t2 = A0t(i12);
            int childCount3 = this.A04.A0F(A0t2);
            if (childCount3 >= A06) {
                int childCount4 = this.A04.A0H(A0t2);
                if (childCount4 >= A06) {
                }
            }
            int childCount5 = A0W - 1;
            A0d(c05554w, childCount5, i12);
            return;
        }
    }

    private void A0c(C05554w c05554w, int i10) {
        if (i10 < 0) {
            return;
        }
        int A0W = A0W();
        if (this.A05) {
            for (int i11 = A0W - 1; i11 >= 0; i11--) {
                View A0t = A0t(i11);
                C4Y c4y = this.A04;
                int childCount = A0G[5].charAt(29);
                if (childCount != 69) {
                    throw new RuntimeException();
                }
                A0G[3] = "CCkneFsBnjHsOQTiipl2DNgji2H70UcR";
                int limit = c4y.A0C(A0t);
                if (limit <= i10) {
                    int limit2 = this.A04.A0G(A0t);
                    if (limit2 <= i10) {
                    }
                }
                int limit3 = A0W - 1;
                A0d(c05554w, limit3, i11);
                return;
            }
            return;
        }
        for (int i12 = 0; i12 < A0W; i12++) {
            View A0t2 = A0t(i12);
            int limit4 = this.A04.A0C(A0t2);
            if (limit4 <= i10) {
                int limit5 = this.A04.A0G(A0t2);
                if (limit5 <= i10) {
                }
            }
            A0d(c05554w, 0, i12);
            return;
        }
    }

    private void A0d(C05554w c05554w, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                A14(i12, c05554w);
            }
            return;
        }
        while (i10 > i11) {
            A14(i10, c05554w);
            i10--;
        }
    }

    private void A0e(C05554w c05554w, C4T c4t) {
        if (!c4t.A0B || c4t.A09) {
            return;
        }
        if (c4t.A05 == -1) {
            A0b(c05554w, c4t.A07);
        } else {
            A0c(c05554w, c4t.A07);
        }
    }

    private void A0f(C05554w c05554w, AnonymousClass53 anonymousClass53, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!anonymousClass53.A08() || A0W() == 0 || anonymousClass53.A07() || !A22()) {
            return;
        }
        int i10 = 0;
        int scrapExtraStart = 0;
        List<AnonymousClass56> A0J = c05554w.A0J();
        int i11 = A0J.size();
        int A0p = A0p(A0t(0));
        for (int scrapSize = 0; scrapSize < i11; scrapSize++) {
            AnonymousClass56 anonymousClass56 = A0J.get(scrapSize);
            if (!anonymousClass56.A0a()) {
                int direction = 1;
                if ((anonymousClass56.A0I() < A0p) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    i10 += this.A04.A0D(anonymousClass56.A0H);
                } else {
                    scrapExtraStart += this.A04.A0D(anonymousClass56.A0H);
                }
            }
        }
        this.A07.A08 = A0J;
        if (i10 > 0) {
            A0X(A0p(A0G()), scrapExtraEnd);
            this.A07.A02 = i10;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c05554w, this.A07, anonymousClass53, false);
        }
        if (scrapExtraStart > 0) {
            A0W(A0p(A0F()), scrapExtraEnd2);
            this.A07.A02 = scrapExtraStart;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c05554w, this.A07, anonymousClass53, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C05554w c05554w, AnonymousClass53 anonymousClass53, C4R c4r) {
        if (A0k(anonymousClass53, c4r) || A0j(c05554w, anonymousClass53, c4r)) {
            return;
        }
        c4r.A02();
        c4r.A01 = this.A0C ? anonymousClass53.A03() - 1 : 0;
    }

    private final void A0h(boolean z10) {
        A1y(null);
        if (z10 == this.A0A) {
            return;
        }
        this.A0A = z10;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C05554w c05554w, AnonymousClass53 anonymousClass53, C4R c4r) {
        View A0P;
        int A0A;
        boolean z10 = false;
        if (A0W() == 0) {
            return false;
        }
        View A0s = A0s();
        if (A0s != null && c4r.A06(A0s, anonymousClass53)) {
            c4r.A05(A0s);
            return true;
        } else if (this.A08 != this.A0C) {
            return false;
        } else {
            if (c4r.A02) {
                A0P = A0O(c05554w, anonymousClass53);
            } else {
                A0P = A0P(c05554w, anonymousClass53);
            }
            if (A0P != null) {
                c4r.A04(A0P);
                if (!anonymousClass53.A07() && A22()) {
                    if ((this.A04.A0F(A0P) >= this.A04.A07() || this.A04.A0C(A0P) < this.A04.A0A()) ? true : true) {
                        if (c4r.A02) {
                            A0A = this.A04.A07();
                        } else {
                            A0A = this.A04.A0A();
                        }
                        c4r.A00 = A0A;
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if ((r7 - r6) < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
        r10.A00 = r8.A04.A0A();
        r10.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
        if ((r7 - r6) < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
        r1 = r8.A04.A07() - r8.A04.A0C(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        if (r1 >= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
        r10.A00 = r8.A04.A07();
        r10.A02 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
        if (r10.A02 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
        r1 = r8.A04.A0C(r5);
        r1 = r1 + r8.A04.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
        r10.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
        r1 = r8.A04.A0F(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0k(com.facebook.ads.redexgen.X.AnonymousClass53 r9, com.facebook.ads.redexgen.X.C4R r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1376at.A0k(com.facebook.ads.redexgen.X.53, com.facebook.ads.redexgen.X.4R):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public int A1d(int i10, C05554w c05554w, AnonymousClass53 anonymousClass53) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i10, c05554w, anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public int A1e(int i10, C05554w c05554w, AnonymousClass53 anonymousClass53) {
        if (this.A00 == 0) {
            return 0;
        }
        return A04(i10, c05554w, anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final int A1f(AnonymousClass53 anonymousClass53) {
        return A09(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final int A1g(AnonymousClass53 anonymousClass53) {
        return A0A(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final int A1h(AnonymousClass53 anonymousClass53) {
        return A0B(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final int A1i(AnonymousClass53 anonymousClass53) {
        return A09(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final int A1j(AnonymousClass53 anonymousClass53) {
        return A0A(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final int A1k(AnonymousClass53 anonymousClass53) {
        return A0B(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final Parcelable A1l() {
        if (this.A03 != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(this.A03));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A29();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState.A01 = A0p(refChild);
            } else {
                View A0G2 = A0G();
                linearLayoutManager$SavedState.A01 = A0p(A0G2);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(A0G2) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final View A1m(int i10) {
        int firstChild = A0W();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i10 - A0p(A0t(0));
        if (childCount >= 0 && childCount < firstChild) {
            View A0t = A0t(childCount);
            if (A0p(A0t) == i10) {
                return A0t;
            }
        }
        return super.A1m(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public View A1n(View view, int i10, C05554w c05554w, AnonymousClass53 anonymousClass53) {
        int maxScroll;
        View nextFocus;
        View A0F2;
        A0U();
        if (A0W() == 0 || (maxScroll = A27(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        A29();
        A29();
        int layoutDir = this.A04.A0B();
        A0Y(maxScroll, (int) (layoutDir * 0.33333334f), false, anonymousClass53);
        this.A07.A07 = SlideAtom.USES_MASTER_SLIDE_ID;
        this.A07.A0B = false;
        A08(c05554w, this.A07, anonymousClass53, true);
        if (maxScroll == -1) {
            nextFocus = A0N(c05554w, anonymousClass53);
        } else {
            nextFocus = A0M(c05554w, anonymousClass53);
        }
        if (maxScroll == -1) {
            A0F2 = A0G();
        } else {
            A0F2 = A0F();
        }
        if (A0F2.hasFocusable()) {
            if (nextFocus == null) {
                return null;
            }
            return A0F2;
        }
        return nextFocus;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public C05494p A1o() {
        return new C05494p(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public void A1p(int i10) {
        this.A01 = i10;
        this.A02 = SlideAtom.USES_MASTER_SLIDE_ID;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final void A1q(int i10, int i11, AnonymousClass53 anonymousClass53, InterfaceC05464m interfaceC05464m) {
        if (this.A00 != 0) {
            i10 = i11;
        }
        int delta = A0W();
        if (delta == 0 || i10 == 0) {
            return;
        }
        A29();
        int i12 = i10 > 0 ? 1 : -1;
        int delta2 = Math.abs(i10);
        A0Y(i12, delta2, true, anonymousClass53);
        A2E(anonymousClass53, this.A07, interfaceC05464m);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final void A1r(int i10, InterfaceC05464m interfaceC05464m) {
        boolean z10;
        int direction;
        if (this.A03 != null && this.A03.A01()) {
            z10 = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z10 = this.A05;
            if (this.A01 == -1) {
                direction = z10 ? i10 - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int anchorPos = z10 ? -1 : 1;
        for (int i11 = 0; i11 < this.A06 && direction >= 0 && direction < i10; i11++) {
            interfaceC05464m.A3o(direction, 0);
            direction += anchorPos;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final void A1s(Parcelable parcelable) {
        ClassLoader classLoader;
        if (!(parcelable instanceof WrappedParcelable) || (classLoader = getClass().getClassLoader()) == null) {
            return;
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (state instanceof LinearLayoutManager$SavedState) {
            this.A03 = (LinearLayoutManager$SavedState) state;
            A0y();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final void A1t(AccessibilityEvent accessibilityEvent) {
        super.A1t(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A24());
            if (A0G[1].charAt(13) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "JM0e54P";
            strArr[2] = "62qYDCA";
            accessibilityEvent.setToIndex(A25());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0240, code lost:
        if (r8 < r7) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x024e, code lost:
        if (r9.A04.A0C(r5) > r9.A04.A0A()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0250, code lost:
        r9.A0D.A05(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0257, code lost:
        if (r8 < r7) goto L80;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1u(com.facebook.ads.redexgen.X.C05554w r10, com.facebook.ads.redexgen.X.AnonymousClass53 r11) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1376at.A1u(com.facebook.ads.redexgen.X.4w, com.facebook.ads.redexgen.X.53):void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public void A1v(AnonymousClass53 anonymousClass53) {
        super.A1v(anonymousClass53);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = SlideAtom.USES_MASTER_SLIDE_ID;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final void A1w(FL fl2, C05554w c05554w) {
        super.A1w(fl2, c05554w);
        if (this.A09) {
            A1I(c05554w);
            c05554w.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public void A1x(FL fl2, AnonymousClass53 anonymousClass53, int i10) {
        C1375as linearSmoothScroller = new C1375as(fl2.getContext());
        linearSmoothScroller.A0A(i10);
        A1L(linearSmoothScroller);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final void A1y(String str) {
        if (this.A03 == null) {
            super.A1y(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final boolean A1z() {
        return (A0Y() == 1073741824 || A0i() == 1073741824 || !A1S()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final boolean A20() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public final boolean A21() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05484o
    public boolean A22() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A23() {
        View child = A0J(0, A0W(), true, false);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A24() {
        View child = A0J(0, A0W(), false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A25() {
        View child = A0J(A0W() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A26() {
        return this.A00;
    }

    public final int A27(int i10) {
        switch (i10) {
            case 1:
                if (this.A00 == 1) {
                    return -1;
                }
                boolean A2F = A2F();
                if (A0G[4].length() != 13) {
                    A0G[7] = "JFBGAdvw0W46p1IiHd184rfjlhxsbjRk";
                    return A2F ? 1 : -1;
                }
                break;
            case 2:
                return (this.A00 != 1 && A2F()) ? -1 : 1;
            case 17:
                if (this.A00 == 0) {
                    return -1;
                }
                return SlideAtom.USES_MASTER_SLIDE_ID;
            case 33:
                if (this.A00 == 1) {
                    return -1;
                }
                return SlideAtom.USES_MASTER_SLIDE_ID;
            case 66:
                int i11 = this.A00;
                String[] strArr = A0G;
                if (strArr[6].length() == strArr[2].length()) {
                    A0G[0] = "A4gNOGqmCbgTlyYHXDAs3UqrHjABAhAn";
                    if (i11 == 0) {
                        return 1;
                    }
                    return SlideAtom.USES_MASTER_SLIDE_ID;
                }
                break;
            case ShapeTypes.DOUBLE_WAVE /* 130 */:
                if (this.A00 == 1) {
                    return 1;
                }
                return SlideAtom.USES_MASTER_SLIDE_ID;
            default:
                return SlideAtom.USES_MASTER_SLIDE_ID;
        }
        throw new RuntimeException();
    }

    public View A28(C05554w c05554w, AnonymousClass53 anonymousClass53, int i10, int i11, int i12) {
        A29();
        View view = null;
        View view2 = null;
        int A0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View outOfBoundsMatch = A0t(i10);
            int A0p = A0p(outOfBoundsMatch);
            if (A0p >= 0 && A0p < i12) {
                if (((C05494p) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < A0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i10 += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A29() {
        if (this.A07 == null) {
            C4T A0S = A0S();
            if (A0G[3].charAt(25) != '2') {
                throw new RuntimeException();
            }
            A0G[7] = "6FRvOBuqOIFmnj4QgnBJgNDOjl7oudHL";
            this.A07 = A0S;
        }
        if (this.A04 == null) {
            this.A04 = C4Y.A02(this, this.A00);
        }
    }

    public final void A2A(int i10) {
        if (i10 == 0 || i10 == 1) {
            A1y(null);
            if (i10 == this.A00) {
                return;
            }
            this.A00 = i10;
            this.A04 = null;
            A0y();
            return;
        }
        throw new IllegalArgumentException(A0T(0, 20, 45) + i10);
    }

    public final void A2B(int i10, int i11) {
        this.A01 = i10;
        this.A02 = i11;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    public void A2C(C05554w c05554w, AnonymousClass53 anonymousClass53, C4R c4r, int i10) {
    }

    public void A2D(C05554w c05554w, AnonymousClass53 anonymousClass53, C4T c4t, C4S c4s) {
        int A0g;
        int right;
        int i10;
        int i11;
        View A03 = c4t.A03(c05554w);
        if (A03 == null) {
            c4s.A01 = true;
            return;
        }
        C05494p c05494p = (C05494p) A03.getLayoutParams();
        if (c4t.A08 == null) {
            boolean z10 = this.A05;
            int bottom = c4t.A05 == -1 ? 1 : 0;
            if (z10 == bottom) {
                A17(A03);
            } else {
                A19(A03, 0);
            }
        } else {
            boolean z11 = this.A05;
            int bottom2 = c4t.A05;
            int bottom3 = bottom2 == -1 ? 1 : 0;
            if (z11 == bottom3) {
                A16(A03);
            } else {
                A18(A03, 0);
            }
        }
        A1A(A03, 0, 0);
        c4s.A00 = this.A04.A0D(A03);
        if (this.A00 == 1) {
            if (A2F()) {
                i11 = A0h() - A0f();
                i10 = i11 - this.A04.A0E(A03);
            } else {
                i10 = A0e();
                i11 = this.A04.A0E(A03) + i10;
            }
            if (c4t.A05 == -1) {
                right = c4t.A06;
                A0g = c4t.A06 - c4s.A00;
            } else {
                A0g = c4t.A06;
                right = c4t.A06 + c4s.A00;
            }
        } else {
            A0g = A0g();
            right = this.A04.A0E(A03) + A0g;
            int bottom4 = c4t.A05;
            if (bottom4 == -1) {
                i11 = c4t.A06;
                int i12 = c4t.A06;
                int bottom5 = c4s.A00;
                i10 = i12 - bottom5;
            } else {
                i10 = c4t.A06;
                int i13 = c4t.A06;
                int bottom6 = c4s.A00;
                i11 = i13 + bottom6;
            }
        }
        A1B(A03, i10, A0g, i11, right);
        if (c05494p.A02() || c05494p.A01()) {
            c4s.A03 = true;
        }
        c4s.A02 = A03.hasFocusable();
    }

    public void A2E(AnonymousClass53 anonymousClass53, C4T c4t, InterfaceC05464m interfaceC05464m) {
        int i10 = c4t.A01;
        if (i10 >= 0) {
            int pos = anonymousClass53.A03();
            if (i10 < pos) {
                int pos2 = c4t.A07;
                interfaceC05464m.A3o(i10, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2F() {
        return A0a() == 1;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass50
    public final PointF A4k(int i10) {
        if (A0W() == 0) {
            return null;
        }
        boolean z10 = i10 < A0p(A0t(0));
        boolean z11 = this.A05;
        int firstChildPos = A0G[4].length();
        if (firstChildPos != 13) {
            A0G[7] = "FFnbbIQmxzlcCB5QJgqtb02Njm6aLfkX";
            int i11 = z10 != z11 ? -1 : 1;
            int direction = this.A00;
            if (direction == 0) {
                return new PointF(i11, 0.0f);
            }
            return new PointF(0.0f, i11);
        }
        throw new RuntimeException();
    }
}
