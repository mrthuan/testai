package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.4o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05484o {
    public static byte[] A0I;
    public static String[] A0J = {"xyZ8yvYzp3wrHAf7Yx6bEToOMuLBTkeJ", "zRc0P2oS", "sxpemPSbJ0zjH5L170Fpc8WIJnMfTOYM", "JLvxwq6R3Maitb0M5MelMbaPMbiMlz5H", "qno0WD9sdyP92Tf9SwtsGsNlEh6m7cws", "isTf1gingqqcw8OSNjwv80foOygzMJYI", "cYtNYfyLYrQzxoivZChv", "OeXF3cqFYKXlQ2ABbzPAkdUOYZHirWRh"};
    public int A00;
    public C4C A01;
    public AnonymousClass51 A02;
    public FL A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final AnonymousClass59 A0G = new C1368al(this);
    public final AnonymousClass59 A0H = new C1367ak(this);
    public C5B A04 = new C5B(this.A0G);
    public C5B A05 = new C5B(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0I = new byte[]{99, -122, -122, -121, -122, Field.SECTIONPAGES, 120, -117, -121, -103, Field.SECTIONPAGES, -118, -125, -107, Field.SECTIONPAGES, 116, -121, -123, -101, -123, -114, -121, -108, 120, -117, -121, -103, Field.SECTIONPAGES, -125, -107, Field.SECTIONPAGES, -110, -125, -108, -121, -112, -106, Field.SECTIONPAGES, -124, -105, -106, Field.SECTIONPAGES, -104, -117, -121, -103, Field.SECTIONPAGES, -117, -107, Field.SECTIONPAGES, -112, -111, -106, Field.SECTIONPAGES, -125, Field.SECTIONPAGES, -108, -121, -125, -114, Field.SECTIONPAGES, -123, -118, -117, -114, -122, 80, Field.SECTIONPAGES, 119, -112, -120, -117, -114, -106, -121, -108, -121, -122, Field.SECTIONPAGES, -117, -112, -122, -121, -102, Field.BIDIOUTLINE, -88, -58, -45, -45, -44, -39, -123, -46, -44, -37, -54, -123, -58, -123, -56, -51, -50, -47, -55, -123, -53, -41, -44, -46, -123, -45, -44, -45, -110, -54, -35, -50, -40, -39, -50, -45, -52, -123, -50, -45, -55, -54, -35, -97};
    }

    public abstract int A1d(int i10, C05554w c05554w, AnonymousClass53 anonymousClass53);

    public abstract int A1e(int i10, C05554w c05554w, AnonymousClass53 anonymousClass53);

    public abstract int A1f(AnonymousClass53 anonymousClass53);

    public abstract int A1g(AnonymousClass53 anonymousClass53);

    public abstract int A1h(AnonymousClass53 anonymousClass53);

    public abstract int A1i(AnonymousClass53 anonymousClass53);

    public abstract int A1j(AnonymousClass53 anonymousClass53);

    public abstract int A1k(AnonymousClass53 anonymousClass53);

    public abstract Parcelable A1l();

    public abstract View A1n(View view, int i10, C05554w c05554w, AnonymousClass53 anonymousClass53);

    public abstract C05494p A1o();

    public abstract void A1p(int i10);

    public abstract void A1q(int i10, int i11, AnonymousClass53 anonymousClass53, InterfaceC05464m interfaceC05464m);

    public abstract void A1r(int i10, InterfaceC05464m interfaceC05464m);

    public abstract void A1s(Parcelable parcelable);

    public abstract void A1u(C05554w c05554w, AnonymousClass53 anonymousClass53);

    public abstract void A1x(FL fl2, AnonymousClass53 anonymousClass53, int i10);

    public abstract boolean A1z();

    public abstract boolean A20();

    public abstract boolean A21();

    public abstract boolean A22();

    static {
        A08();
    }

    public static int A00(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        switch (mode) {
            case SlideAtom.USES_MASTER_SLIDE_ID /* -2147483648 */:
                int max = Math.max(i11, i12);
                int size2 = A0J[1].length();
                if (size2 != 8) {
                    throw new RuntimeException();
                }
                A0J[1] = "W1fJ2ceK";
                int mode2 = Math.min(size, max);
                return mode2;
            case 1073741824:
                return size;
            default:
                int mode3 = Math.max(i11, i12);
                return mode3;
        }
    }

    public static int A01(int i10, int i11, int i12, int i13, boolean z10) {
        int max = Math.max(0, i10 - i12);
        int i14 = 0;
        int resultMode = 0;
        if (z10) {
            if (i13 >= 0) {
                i14 = i13;
                resultMode = 1073741824;
            } else if (i13 == -1) {
                switch (i11) {
                    case SlideAtom.USES_MASTER_SLIDE_ID /* -2147483648 */:
                    case 1073741824:
                        i14 = max;
                        resultMode = i11;
                        break;
                    case 0:
                        i14 = 0;
                        resultMode = 0;
                        break;
                }
            } else if (i13 == -2) {
                i14 = 0;
                resultMode = 0;
            }
        } else if (i13 >= 0) {
            i14 = i13;
            resultMode = 1073741824;
        } else if (i13 == -1) {
            i14 = max;
            resultMode = i11;
        } else if (i13 == -2) {
            i14 = max;
            resultMode = (i11 == Integer.MIN_VALUE || i11 == 1073741824) ? SlideAtom.USES_MASTER_SLIDE_ID : 0;
        }
        int size = View.MeasureSpec.makeMeasureSpec(i14, resultMode);
        return size;
    }

    private final int A02(View view) {
        return ((C05494p) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C05494p) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C05494p) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C05494p) view.getLayoutParams()).A03.top;
    }

    private final int A06(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        return 0;
    }

    private final void A09(int i10) {
        A0C(i10, A0t(i10));
    }

    private final void A0A(int i10) {
        View child = A0t(i10);
        if (child != null) {
            this.A01.A0D(i10);
        }
    }

    private final void A0B(int i10, int i11) {
        View view = A0t(i10);
        if (view != null) {
            A09(i10);
            A0E(view, i11);
            String[] strArr = A0J;
            if (strArr[2].charAt(30) != strArr[5].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[0] = "fev5lwy8caKDFGGcVLFTWETO5UF90dOq";
            strArr2[7] = "EDoCIrgXqzBYQTf4WlngJinORtzJmrfl";
            return;
        }
        throw new IllegalArgumentException(A07(85, 44, 81) + i10 + this.A03.toString());
    }

    private void A0C(int i10, View view) {
        this.A01.A0C(i10);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i10) {
        A0F(view, i10, (C05494p) view.getLayoutParams());
    }

    private final void A0F(View view, int i10, C05494p c05494p) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F.A0a()) {
            this.A03.A0t.A09(A0F);
        } else {
            this.A03.A0t.A0A(A0F);
        }
        this.A01.A0H(view, i10, c05494p, A0F.A0a());
    }

    private void A0G(View view, int i10, boolean z10) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (z10 || A0F.A0a()) {
            this.A03.A0t.A09(A0F);
        } else {
            this.A03.A0t.A0A(A0F);
        }
        C05494p c05494p = (C05494p) view.getLayoutParams();
        if (A0F.A0g() || A0F.A0b()) {
            if (A0F.A0b()) {
                A0F.A0S();
            } else {
                A0F.A0O();
            }
            this.A01.A0H(view, i10, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            FL fl2 = this.A03;
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            A0J[4] = "uqKRxBtg59XPGVJDkfwEUsBOgdJYSppJ";
            if (parent == fl2) {
                int currentIndex = this.A01.A07(view);
                if (i10 == -1) {
                    i10 = this.A01.A05();
                }
                if (currentIndex != -1) {
                    if (currentIndex != i10) {
                        this.A03.A06.A0B(currentIndex, i10);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 14) + this.A03.indexOfChild(view) + this.A03.A1H());
                }
            } else {
                this.A01.A0I(view, i10, false);
                c05494p.A01 = true;
                AnonymousClass51 anonymousClass51 = this.A02;
                if (A0J[4].charAt(12) == 'v') {
                    throw new RuntimeException();
                }
                A0J[6] = "si9YLNjLFs";
                if (anonymousClass51 != null && this.A02.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c05494p.A02) {
            View view2 = A0F.A0H;
            if (A0J[1].length() != 8) {
                throw new RuntimeException();
            }
            A0J[1] = "bg493IDm";
            view2.invalidate();
            c05494p.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        FL.A0o(view, rect);
    }

    private void A0J(C05554w c05554w, int i10, View view) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F.A0f()) {
            return;
        }
        if (A0F.A0Z()) {
            boolean A0a = A0F.A0a();
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[2] = "wfzQKDpvqCerNRZHLtQvgaB031c5C1YU";
            strArr[5] = "KgFz3HBRwd8cETJWtdM1PF8pjKUjBKYl";
            if (!A0a && !this.A03.A04.A0A()) {
                A0A(i10);
                c05554w.A0X(A0F);
                return;
            }
        }
        A09(i10);
        c05554w.A0S(view);
        this.A03.A0t.A0C(A0F);
    }

    private final void A0K(C05554w c05554w, AnonymousClass53 anonymousClass53, AccessibilityEvent accessibilityEvent) {
        if (this.A03 == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (!this.A03.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        if (this.A03.A04 != null) {
            accessibilityEvent.setItemCount(this.A03.A04.A0E());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        if (r4.canScrollHorizontally(1) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
        if (r4.canScrollHorizontally(1) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r4 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0L(com.facebook.ads.redexgen.X.C05554w r6, com.facebook.ads.redexgen.X.AnonymousClass53 r7, com.facebook.ads.redexgen.X.C05273s r8) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.FL r0 = r5.A03
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            r3 = 1
            if (r0 != 0) goto L2d
            com.facebook.ads.redexgen.X.FL r0 = r5.A03
            boolean r4 = r0.canScrollHorizontally(r1)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC05484o.A0J
            r0 = 3
            r1 = r1[r0]
            r0 = 19
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L8e
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC05484o.A0J
            java.lang.String r1 = "KDPDh71uiY9dw6lSrmH00w2HuhKAvOYl"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "F84YzGx02ov8ufnexIEGkhiaGhnINbYS"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L35
        L2d:
            r0 = 8192(0x2000, float:1.148E-41)
            r8.A0N(r0)
            r8.A0R(r3)
        L35:
            com.facebook.ads.redexgen.X.FL r0 = r5.A03
            boolean r0 = r0.canScrollVertically(r3)
            if (r0 != 0) goto L5b
            com.facebook.ads.redexgen.X.FL r4 = r5.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC05484o.A0J
            r0 = 3
            r1 = r1[r0]
            r0 = 19
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L7b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC05484o.A0J
            java.lang.String r1 = "8s5rDkFpP"
            r0 = 6
            r2[r0] = r1
            boolean r0 = r4.canScrollHorizontally(r3)
            if (r0 == 0) goto L63
        L5b:
            r0 = 4096(0x1000, float:5.74E-42)
            r8.A0N(r0)
            r8.A0R(r3)
        L63:
            int r3 = r5.A0r(r6, r7)
            int r2 = r5.A0q(r6, r7)
            boolean r1 = r5.A0P(r6, r7)
            int r0 = r5.A06(r6, r7)
            com.facebook.ads.redexgen.X.3p r0 = com.facebook.ads.redexgen.X.C05243p.A00(r3, r2, r1, r0)
            r8.A0P(r0)
            return
        L7b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC05484o.A0J
            java.lang.String r1 = "3WqpoC752q4h2Wya5fT3BPHdY3ZkhgYP"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "HauWKBzmz4VUJQZuXSWVI1MWGOc6zBYt"
            r0 = 5
            r2[r0] = r1
            boolean r0 = r4.canScrollHorizontally(r3)
            if (r0 == 0) goto L63
            goto L5b
        L8e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC05484o.A0L(com.facebook.ads.redexgen.X.4w, com.facebook.ads.redexgen.X.53, com.facebook.ads.redexgen.X.3s):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AnonymousClass51 anonymousClass51) {
        if (this.A02 == anonymousClass51) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        return this.A02 != null && this.A02.A0F();
    }

    public static boolean A0O(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        switch (mode) {
            case SlideAtom.USES_MASTER_SLIDE_ID /* -2147483648 */:
                return size >= i10;
            case 0:
                return true;
            case 1073741824:
                return size == i10;
            default:
                return false;
        }
    }

    private final boolean A0P(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        return false;
    }

    private final boolean A0Q(C05554w c05554w, AnonymousClass53 anonymousClass53, int i10, Bundle bundle) {
        if (this.A03 == null) {
            return false;
        }
        int hScroll = 0;
        int i11 = 0;
        switch (i10) {
            case 4096:
                if (this.A03.canScrollVertically(1)) {
                    int hScroll2 = A0X();
                    int vScroll = A0g();
                    int hScroll3 = hScroll2 - vScroll;
                    int vScroll2 = A0d();
                    hScroll = hScroll3 - vScroll2;
                }
                if (this.A03.canScrollHorizontally(1)) {
                    int A0h = A0h();
                    int vScroll3 = A0e();
                    int i12 = A0h - vScroll3;
                    int vScroll4 = A0f();
                    i11 = i12 - vScroll4;
                    break;
                }
                break;
            case 8192:
                if (this.A03.canScrollVertically(-1)) {
                    int hScroll4 = A0X();
                    int vScroll5 = A0g();
                    int hScroll5 = hScroll4 - vScroll5;
                    int vScroll6 = A0d();
                    hScroll = -(hScroll5 - vScroll6);
                }
                if (this.A03.canScrollHorizontally(-1)) {
                    int A0h2 = A0h();
                    int vScroll7 = A0e();
                    int i13 = A0h2 - vScroll7;
                    int vScroll8 = A0f();
                    i11 = -(i13 - vScroll8);
                    break;
                }
                break;
        }
        if (hScroll == 0 && i11 == 0) {
            return false;
        }
        this.A03.scrollBy(i11, hScroll);
        return true;
    }

    private final boolean A0R(C05554w c05554w, AnonymousClass53 anonymousClass53, View view, int i10, Bundle bundle) {
        return false;
    }

    private boolean A0S(FL fl2, int i10, int i11) {
        View focusedChild = fl2.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0e();
        int parentRight = A0g();
        int parentTop = A0h();
        int parentTop2 = parentTop - A0f();
        int parentLeft = A0X();
        int parentLeft2 = parentLeft - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - i10 >= parentTop2 || rect.right - i10 <= parentBottom || rect.top - i11 >= parentLeft2 || rect.bottom - i11 <= parentRight) {
            return false;
        }
        return true;
    }

    @Deprecated
    private final boolean A0T(FL fl2, View view, View view2) {
        return A0N() || fl2.A1q();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0e();
        int offScreenTop = A0g();
        int dy = A0h() - A0f();
        int offScreenLeft = A0X() - A0d();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childLeft = rect.width() + childBottom;
        int parentLeft = rect.height();
        int parentBottom = Math.min(0, childBottom - offScreenRight);
        int parentRight = Math.min(0, childRight - offScreenTop);
        int parentTop = Math.max(0, childLeft - dy);
        int parentLeft2 = Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0a() == 1) {
            if (parentTop == 0) {
                parentTop = Math.max(parentBottom, childLeft - dy);
            }
        } else {
            parentTop = parentBottom != 0 ? parentBottom : Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentRight == 0) {
            parentRight = Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentRight;
        return iArr;
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        if (this.A01 != null) {
            return this.A01.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        AbstractC05364c a10;
        if (this.A03 != null) {
            FL fl2 = this.A03;
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            A0J[4] = "NhHtbEzlhB3n2IblVpNcmlHtdyAdrFMd";
            a10 = fl2.getAdapter();
        } else {
            a10 = null;
        }
        if (a10 != null) {
            return a10.A0E();
        }
        return 0;
    }

    public final int A0a() {
        return C3T.A01(this.A03);
    }

    public final int A0b() {
        return C3T.A02(this.A03);
    }

    public final int A0c() {
        return C3T.A03(this.A03);
    }

    public final int A0d() {
        if (this.A03 != null) {
            return this.A03.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        if (this.A03 != null) {
            return this.A03.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        if (this.A03 != null) {
            return this.A03.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        if (this.A03 != null) {
            return this.A03.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C05494p) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C05494p) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C05494p) view.getLayoutParams()).A00();
    }

    public int A0q(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        if (this.A03 == null || this.A03.A04 == null || !A20()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public int A0r(C05554w c05554w, AnonymousClass53 anonymousClass53) {
        if (this.A03 == null || this.A03.A04 == null || !A21()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public final View A0s() {
        View focusedChild;
        if (this.A03 == null || (focusedChild = this.A03.getFocusedChild()) == null || this.A01.A0K(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final View A0t(int i10) {
        if (this.A01 != null) {
            return this.A01.A09(i10);
        }
        return null;
    }

    public final View A0u(View view, int i10) {
        return null;
    }

    public C05494p A0v(Context context, AttributeSet attributeSet) {
        return new C05494p(context, attributeSet);
    }

    public C05494p A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C05494p) {
            return new C05494p((C05494p) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C05494p((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C05494p(layoutParams);
    }

    public final void A0x() {
        if (this.A02 != null) {
            this.A02.A09();
        }
    }

    public final void A0y() {
        if (this.A03 != null) {
            this.A03.requestLayout();
        }
    }

    public final void A0z(int i10) {
        if (this.A03 != null) {
            this.A03.A1T(i10);
        }
    }

    public final void A10(int i10) {
        if (this.A03 != null) {
            this.A03.A1U(i10);
        }
    }

    public final void A11(int i10, int i11) {
        this.A0C = View.MeasureSpec.getSize(i10);
        this.A0D = View.MeasureSpec.getMode(i10);
        if (this.A0D == 0 && !FL.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i11);
        this.A0B = View.MeasureSpec.getMode(i11);
        if (this.A0B == 0 && !FL.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int i10, int i11) {
        int A0W = A0W();
        if (A0W == 0) {
            this.A03.A1a(i10, i11);
            String[] strArr = A0J;
            String str = strArr[2];
            String str2 = strArr[5];
            int charAt = str.charAt(30);
            int count = str2.charAt(30);
            if (charAt != count) {
                throw new RuntimeException();
            }
            A0J[1] = "XwkGDyjU";
            return;
        }
        int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int maxY = SlideAtom.USES_MASTER_SLIDE_ID;
        int maxX = SlideAtom.USES_MASTER_SLIDE_ID;
        for (int i14 = 0; i14 < A0W; i14++) {
            View A0t = A0t(i14);
            Rect rect = this.A03.A0p;
            A0H(A0t, rect);
            int count2 = rect.left;
            if (count2 < i12) {
                i12 = rect.left;
            }
            int count3 = rect.right;
            if (count3 > maxY) {
                maxY = rect.right;
            }
            int count4 = rect.top;
            if (count4 < i13) {
                i13 = rect.top;
            }
            int count5 = rect.bottom;
            if (count5 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i12, i13, maxY, maxX);
        A15(this.A03.A0p, i10, i11);
    }

    public final void A13(int i10, int i11) {
        this.A03.setMeasuredDimension(i10, i11);
    }

    public final void A14(int i10, C05554w c05554w) {
        View view = A0t(i10);
        A0A(i10);
        c05554w.A0T(view);
    }

    public void A15(Rect rect, int i10, int i11) {
        int usedHeight = rect.width() + A0e() + A0f();
        int height = rect.height();
        int usedWidth = A0g();
        int i12 = height + usedWidth;
        int usedWidth2 = A0d();
        int width = i12 + usedWidth2;
        int usedWidth3 = A0c();
        int usedHeight2 = A00(i10, usedHeight, usedWidth3);
        int usedWidth4 = A0b();
        A13(usedHeight2, A00(i11, width, usedWidth4));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i10) {
        A0G(view, i10, true);
    }

    public final void A19(View view, int i10) {
        A0G(view, i10, false);
    }

    public final void A1A(View view, int i10, int i11) {
        C05494p c05494p = (C05494p) view.getLayoutParams();
        Rect A1D = this.A03.A1D(view);
        int i12 = i10 + A1D.left + A1D.right;
        int i13 = i11 + A1D.top + A1D.bottom;
        int A01 = A01(A0h(), A0i(), A0e() + A0f() + c05494p.leftMargin + c05494p.rightMargin + i12, c05494p.width, A20());
        int A0X = A0X();
        int A0Y = A0Y();
        int widthSpec = A0g();
        int A012 = A01(A0X, A0Y, widthSpec + A0d() + c05494p.topMargin + c05494p.bottomMargin + i13, c05494p.height, A21());
        if (A1W(view, A01, A012, c05494p)) {
            view.measure(A01, A012);
        }
    }

    public final void A1B(View view, int i10, int i11, int i12, int i13) {
        C05494p c05494p = (C05494p) view.getLayoutParams();
        Rect rect = c05494p.A03;
        view.layout(rect.left + i10 + c05494p.leftMargin, rect.top + i11 + c05494p.topMargin, (i12 - rect.right) - c05494p.rightMargin, (i13 - rect.bottom) - c05494p.bottomMargin);
    }

    public final void A1C(View view, C05273s c05273s) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F != null) {
            boolean A0a = A0F.A0a();
            if (A0J[4].charAt(12) == 'v') {
                throw new RuntimeException();
            }
            A0J[1] = "uJMRqraa";
            if (!A0a && !this.A01.A0K(A0F.A0H)) {
                A1K(this.A03.A0r, this.A03.A0s, view, c05273s);
            }
        }
    }

    public final void A1D(View view, C05554w c05554w) {
        A0D(view);
        c05554w.A0T(view);
    }

    public final void A1E(View view, boolean z10, Rect rect) {
        Matrix matrix;
        if (z10) {
            Rect rect2 = ((C05494p) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        FL fl2 = this.A03;
        String[] strArr = A0J;
        if (strArr[0].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[0] = "0LJ8GvUexdNG1AG11Ii0XfPOyD5lBlCr";
        strArr2[7] = "NwYNIOYDHD2wNBVOHxFlNgVOQtOI4Jp5";
        if (fl2 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int floor = (int) Math.floor(rectF.left);
            int floor2 = (int) Math.floor(rectF.top);
            double d10 = rectF.right;
            if (A0J[6].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0J;
            strArr3[0] = "AxZOVdXnwoPa2hByvRQIxFpOdsFmpigD";
            strArr3[7] = "eNbgBcin3tlOsNhY3b3xdMmObUbY1NrP";
            rect.set(floor, floor2, (int) Math.ceil(d10), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C05273s c05273s) {
        A0L(this.A03.A0r, this.A03.A0s, c05273s);
    }

    public final void A1G(C05554w c05554w) {
        int A0E = c05554w.A0E();
        for (int i10 = A0E - 1; i10 >= 0; i10--) {
            View A0F = c05554w.A0F(i10);
            AnonymousClass56 A0F2 = FL.A0F(A0F);
            if (!A0F2.A0f()) {
                A0F2.A0X(false);
                if (A0F2.A0c()) {
                    this.A03.removeDetachedView(A0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(A0F2);
                }
                A0F2.A0X(true);
                c05554w.A0R(A0F);
            }
        }
        c05554w.A0L();
        if (A0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C05554w c05554w) {
        int childCount = A0W();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            A0J(c05554w, i10, A0t(i10));
        }
    }

    public final void A1I(C05554w c05554w) {
        for (int A0W = A0W() - 1; A0W >= 0; A0W--) {
            if (!FL.A0F(A0t(A0W)).A0f()) {
                A14(A0W, c05554w);
            }
        }
    }

    public void A1J(C05554w c05554w, AnonymousClass53 anonymousClass53, int i10, int i11) {
        this.A03.A1a(i10, i11);
    }

    public void A1K(C05554w c05554w, AnonymousClass53 anonymousClass53, View view, C05273s c05273s) {
        C05253q itemInfo = C05253q.A00(A21() ? A0p(view) : 0, 1, A20() ? A0p(view) : 0, 1, false, false);
        c05273s.A0Q(itemInfo);
    }

    public final void A1L(AnonymousClass51 anonymousClass51) {
        if (this.A02 != null) {
            AnonymousClass51 anonymousClass512 = this.A02;
            if (A0J[4].charAt(12) == 'v') {
                throw new RuntimeException();
            }
            A0J[6] = OperatorName.STROKING_COLOR_GRAY;
            if (anonymousClass51 != anonymousClass512 && this.A02.A0F()) {
                AnonymousClass51 anonymousClass513 = this.A02;
                if (A0J[6].length() != 15) {
                    A0J[3] = "jdqDA9lv9LoPYcF6nkiuFYbBQf2p3Jna";
                    anonymousClass513.A09();
                } else {
                    String[] strArr = A0J;
                    strArr[0] = "CfhUeeIqQu1BzHSX9SgRD70OnW7YoiZA";
                    strArr[7] = "rBLjTriW7e2LTgD4knhZEnVORkWVeovT";
                    anonymousClass513.A09();
                }
            }
        }
        this.A02 = anonymousClass51;
        this.A02.A0D(this.A03, this);
    }

    public void A1M(FL fl2) {
    }

    public final void A1N(FL fl2) {
        this.A07 = true;
    }

    public final void A1O(FL fl2) {
        A11(View.MeasureSpec.makeMeasureSpec(fl2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(fl2.getHeight(), 1073741824));
    }

    public final void A1P(FL fl2) {
        if (fl2 == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = fl2;
            this.A01 = fl2.A01;
            this.A0C = fl2.getWidth();
            this.A0A = fl2.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public final void A1Q(FL fl2, C05554w c05554w) {
        this.A07 = false;
        A1w(fl2, c05554w);
    }

    public final void A1R(boolean z10) {
        this.A06 = z10;
    }

    public final boolean A1S() {
        int A0W = A0W();
        for (int i10 = 0; i10 < A0W; i10++) {
            ViewGroup.LayoutParams layoutParams = A0t(i10).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        if (A0J[4].charAt(12) != 'v') {
            A0J[3] = "WAOKNqtGQ8ovYE750tJA7vys4k4qcWl2";
            return false;
        }
        throw new RuntimeException();
    }

    public final boolean A1T() {
        return this.A03 != null && this.A03.A0B;
    }

    public final boolean A1U() {
        return this.A0E;
    }

    public final boolean A1V(int i10, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i10, bundle);
    }

    public final boolean A1W(View view, int i10, int i11, C05494p c05494p) {
        if (!view.isLayoutRequested()) {
            boolean z10 = this.A0F;
            String[] strArr = A0J;
            if (strArr[0].charAt(23) != strArr[7].charAt(23)) {
                throw new RuntimeException();
            }
            A0J[4] = "WuiXnf3Uz62WBJXd3E4QIRzbwyGUV3fL";
            if (z10 && A0O(view.getWidth(), i10, c05494p.width) && A0O(view.getHeight(), i11, c05494p.height)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1X(View view, int i10, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i10, bundle);
    }

    public boolean A1Y(C05494p c05494p) {
        return c05494p != null;
    }

    public final boolean A1Z(FL fl2, View view, Rect rect, boolean z10) {
        return A1a(fl2, view, rect, z10, false);
    }

    public final boolean A1a(FL fl2, View view, Rect rect, boolean z10, boolean z11) {
        int[] scrollAmount = A0U(view, rect);
        int i10 = scrollAmount[0];
        int i11 = scrollAmount[1];
        if ((z11 && !A0S(fl2, i10, i11)) || (i10 == 0 && i11 == 0)) {
            return false;
        }
        if (z10) {
            fl2.scrollBy(i10, i11);
        } else {
            fl2.A1c(i10, i11);
        }
        return true;
    }

    public final boolean A1b(FL fl2, AnonymousClass53 anonymousClass53, View view, View view2) {
        return A0T(fl2, view, view2);
    }

    public final boolean A1c(FL fl2, ArrayList<View> views, int i10, int i11) {
        return false;
    }

    public View A1m(int i10) {
        int A0W = A0W();
        for (int i11 = 0; i11 < A0W; i11++) {
            View child = A0t(i11);
            AnonymousClass56 A0F = FL.A0F(child);
            if (A0F != null) {
                int childCount = A0F.A0I();
                if (childCount == i10 && !A0F.A0f() && (this.A03.A0s.A07() || !A0F.A0a())) {
                    return child;
                }
            }
        }
        return null;
    }

    public void A1t(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1v(AnonymousClass53 anonymousClass53) {
    }

    public void A1w(FL fl2, C05554w c05554w) {
    }

    public void A1y(String str) {
        if (this.A03 != null) {
            this.A03.A1l(str);
        }
    }
}
