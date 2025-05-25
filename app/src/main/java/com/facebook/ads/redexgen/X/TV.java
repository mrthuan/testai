package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class TV extends AbstractC05534t {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public PE A02;
    public C1102Rk A04;
    public List<QK> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C1376at A0C;
    public final AnonymousClass51 A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final PI A0F = new TY(this);
    public PG A03 = new TX(this);
    public final PH A0E = new TW(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, Field.ADDIN, Field.HTMLCONTROL, 103, 78, Field.ADDIN, Field.LISTNUM, Field.HTMLCONTROL, Field.BIDIOUTLINE, 103, Field.GREETINGLINE, Field.ADDIN, 76, 77, Field.CONTROL, 103, Field.HYPERLINK, Field.TOA, Field.LISTNUM, Field.TOA, Field.DOCPROPERTY, -51, -58, -61, -52, -60, -68, -42, -61, -68, -51, -68, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public TV(C05263r c05263r, int i10, List<QK> list, C1102Rk c1102Rk, Bundle bundle) {
        this.A0C = c05263r.getLayoutManager();
        this.A0A = i10;
        this.A05 = list;
        this.A04 = c1102Rk;
        this.A0D = new C1375as(c05263r.getContext());
        this.A0B = c05263r.getContext();
        c05263r.A1f(this);
        A0D(bundle);
    }

    private UO A03(int i10, int i11) {
        return A04(i10, i11, true);
    }

    private UO A04(int i10, int i11, boolean z10) {
        UO uo2 = null;
        while (i10 <= i11) {
            UO uo3 = (UO) this.A0C.A1m(i10);
            if (uo3 == null || uo3.A17()) {
                return null;
            }
            boolean A0a = A0a(uo3);
            if (uo2 == null && uo3.A18() && A0a && !this.A0G.contains(Integer.valueOf(i10)) && (!z10 || A0I(uo3, this.A0A))) {
                uo2 = uo3;
            }
            if (uo3.A18() && !A0a) {
                A0C(i10, false);
            }
            i10++;
        }
        return uo2;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        UO A03 = A03(lastVisibleItem, firstVisibleItem);
        if (A03 != null) {
            A03.A15();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int A23 = this.A0C.A23();
        if (A23 != -1) {
            int curPos = this.A05.size();
            if (A23 < curPos - 1) {
                int curPos2 = A23 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i10) {
        UO A04 = A04(i10 + 1, this.A0C.A25(), false);
        if (A04 != null) {
            A04.A15();
            A0U(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i10, int i11) {
        while (i10 <= i11) {
            A0T(i10);
            i10++;
        }
    }

    private final void A0B(int i10, int i11) {
        A0S(i10);
        A0S(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i10, boolean z10) {
        if (z10) {
            this.A0G.add(Integer.valueOf(i10));
        } else {
            this.A0G.remove(Integer.valueOf(i10));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC1022Oi abstractC1022Oi, int i10) {
        int allowedAreaMaxX;
        int furthestX;
        if (i10 == 2) {
            allowedAreaMaxX = LP.A03.widthPixels - 1;
        } else {
            int width = abstractC1022Oi.getWidth();
            int allowedAreaMinX = LP.A03.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i10 == 2) {
            furthestX = 1;
        } else {
            int i11 = LP.A03.widthPixels;
            int allowedAreaMinX2 = abstractC1022Oi.getWidth();
            furthestX = (int) (((i11 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x4 = abstractC1022Oi.getX();
        int allowedAreaMinX3 = abstractC1022Oi.getWidth();
        if (((int) (x4 + allowedAreaMinX3)) <= allowedAreaMaxX) {
            int allowedAreaMinX4 = (abstractC1022Oi.getX() > furthestX ? 1 : (abstractC1022Oi.getX() == furthestX ? 0 : -1));
            if (allowedAreaMinX4 >= 0) {
                return true;
            }
        }
        return false;
    }

    private boolean A0J(UO uo2) {
        if (this.A08 && uo2.A18()) {
            this.A08 = false;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05534t
    public void A0L(FL fl2, int i10) {
        super.A0L(fl2, i10);
        if (i10 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05534t
    public void A0M(FL fl2, int i10, int i11) {
        super.A0M(fl2, i10, i11);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A24();
        int firstVisibleItem = this.A0C.A25();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i10);
    }

    public final PG A0N() {
        return this.A03;
    }

    public final PH A0O() {
        return this.A0E;
    }

    public final PI A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int A25 = this.A0C.A25();
        for (int A24 = this.A0C.A24(); A24 <= A25 && A24 >= 0; A24++) {
            UO card = (UO) this.A0C.A1m(A24);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A17()) {
                this.A01 = A24;
                card.A14();
                return;
            }
        }
    }

    public final void A0R() {
        UO uo2 = (UO) this.A0C.A1m(this.A01);
        if (uo2 != null && this.A01 >= 0) {
            uo2.A15();
        }
    }

    public final void A0S(int i10) {
        UO uo2 = (UO) this.A0C.A1m(i10);
        if (uo2 != null && !A0a(uo2)) {
            A0Z(uo2, false);
        }
    }

    public final void A0T(int i10) {
        UO uo2 = (UO) this.A0C.A1m(i10);
        if (uo2 == null) {
            return;
        }
        if (A0a(uo2)) {
            A0Z(uo2, true);
        }
        if (!A0J(uo2) || this.A05 == null) {
            return;
        }
        this.A0F.setVolume(this.A05.get(((Integer) uo2.getTag(-1593835536)).intValue()).A03().A0E().A09() ? 0.0f : 1.0f);
    }

    public final void A0U(int i10) {
        this.A0D.A0A(i10);
        this.A0C.A1L(this.A0D);
    }

    public final void A0V(int i10, int i11, int i12) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A23();
        if (recomputeFrom == -1) {
            recomputeFrom = i12 < 0 ? i10 : i11;
        }
        this.A02.AHH(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void A0Y(PE pe2) {
        this.A02 = pe2;
    }

    public void A0Z(UO uo2, boolean z10) {
        if (A0H()) {
            A0X(uo2, z10);
        }
        if (!z10 && uo2.A17()) {
            uo2.A14();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
