package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.ads.redexgen.X.3B  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3B {
    public static String[] A05 = {"HMLUAMeWTnTdrFyTRCB7w3ZhJ", "1Aun6", "yTavC3hBHsVyJRra79jdVUTW7IEAkuRz", "tJ693OcumSOXrVCtzwSe90nGcRRSjuPr", "DrEyERnZlKSQp8AkPycUbQNlm94xmy5e", "2BUIq1m7obUXC577xarT453dfNaADk5N", "yJUqjpNvvORIKjYa1o1Wy5wtSjtgR6zYd", "0hzYa3ofwknJpPrn6YTjRWoRNT8nV8gu"};
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public C3B(View view) {
        this.A04 = view;
    }

    private ViewParent A00(int i10) {
        switch (i10) {
            case 0:
                return this.A01;
            case 1:
                return this.A00;
            default:
                return null;
        }
    }

    private void A01(int i10, ViewParent viewParent) {
        switch (i10) {
            case 0:
                this.A01 = viewParent;
                return;
            case 1:
                this.A00 = viewParent;
                return;
            default:
                return;
        }
    }

    public final void A02() {
        A03(0);
    }

    public final void A03(int i10) {
        ViewParent A00 = A00(i10);
        if (A00 != null) {
            AbstractC05183j.A02(A00, this.A04, i10);
            A01(i10, null);
        }
    }

    public final void A04(boolean z10) {
        if (this.A02) {
            View view = this.A04;
            if (A05[0].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "sPOLp35TsNHusY6V5G0bvTSrJPIVSPnr";
            strArr[7] = "EPAyi3E2WcCopkomgXFhWqOsQM7C57d6";
            C3T.A08(view);
        }
        this.A02 = z10;
    }

    public final boolean A05() {
        return A09(0);
    }

    public final boolean A06() {
        return this.A02;
    }

    public final boolean A07(float f10, float f11) {
        ViewParent A00;
        if (!A06() || (A00 = A00(0)) == null) {
            return false;
        }
        return AbstractC05183j.A06(A00, this.A04, f10, f11);
    }

    public final boolean A08(float f10, float f11, boolean z10) {
        ViewParent A00;
        if (!A06() || (A00 = A00(0)) == null) {
            return false;
        }
        return AbstractC05183j.A07(A00, this.A04, f10, f11, z10);
    }

    public final boolean A09(int i10) {
        return A00(i10) != null;
    }

    public final boolean A0A(int i10) {
        return A0B(i10, 0);
    }

    public final boolean A0B(int i10, int i11) {
        if (A09(i11)) {
            return true;
        }
        if (A06()) {
            View view = this.A04;
            for (ViewParent parent = this.A04.getParent(); parent != null; parent = parent.getParent()) {
                if (AbstractC05183j.A08(parent, view, this.A04, i10, i11)) {
                    A01(i11, parent);
                    AbstractC05183j.A05(parent, view, this.A04, i10, i11);
                    return true;
                }
                boolean z10 = parent instanceof View;
                if (A05[1].length() != 5) {
                    throw new RuntimeException();
                }
                A05[0] = "7BAbpT06x25B1B2yqAUEO7iBu";
                if (z10) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A0C(int i10, int i11, int i12, int i13, int[] iArr) {
        return A0D(i10, i11, i12, i13, iArr, 0);
    }

    public final boolean A0D(int i10, int i11, int startX, int startY, int[] iArr, int i12) {
        ViewParent A00;
        if (!A06() || (A00 = A00(i12)) == null) {
            return false;
        }
        if (i10 != 0 || i11 != 0 || startX != 0 || startY != 0) {
            int i13 = 0;
            int startY2 = 0;
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                i13 = iArr[0];
                startY2 = iArr[1];
            }
            View view = this.A04;
            String[] strArr = A05;
            if (strArr[3].charAt(11) != strArr[5].charAt(11)) {
                throw new RuntimeException();
            }
            A05[0] = "CJefiU87NJ7XNqmbcPXjJdErx";
            AbstractC05183j.A03(A00, view, i10, i11, startX, startY, i12);
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i13;
                iArr[1] = iArr[1] - startY2;
            }
            return true;
        }
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return false;
    }

    public final boolean A0E(int i10, int i11, int[] iArr, int[] iArr2) {
        return A0F(i10, i11, iArr, iArr2, 0);
    }

    public final boolean A0F(int startX, int startY, int[] iArr, int[] iArr2, int i10) {
        ViewParent parent;
        int[] consumed = iArr;
        if (!A06() || (parent = A00(i10)) == null) {
            return false;
        }
        if (startX != 0 || startY != 0) {
            int i11 = 0;
            int i12 = 0;
            if (iArr2 != null) {
                this.A04.getLocationInWindow(iArr2);
                i11 = iArr2[0];
                i12 = iArr2[1];
            }
            if (consumed == null) {
                int[] iArr3 = this.A03;
                String[] strArr = A05;
                if (strArr[4].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                A05[0] = "EXwhuqfa8PSenPC96DfC6aE38";
                if (iArr3 == null) {
                    this.A03 = new int[2];
                }
                consumed = this.A03;
            }
            consumed[0] = 0;
            consumed[1] = 0;
            AbstractC05183j.A04(parent, this.A04, startX, startY, consumed, i10);
            if (iArr2 != null) {
                this.A04.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i11;
                iArr2[1] = iArr2[1] - i12;
            }
            return (consumed[0] == 0 && consumed[1] == 0) ? false : true;
        }
        if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }
}
