package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Nw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1010Nw extends RelativeLayout {
    public static MR A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC1361ad A00;
    public C1314Zs A01;
    public AnonymousClass38 A02;
    public C1192Uw A03;
    public OT A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, Field.MACROBUTTON, Field.DDEAUTO, Field.AUTONUMOUT, Field.GOTOBUTTON, 36, Field.DDE, 97, 15, 32, Field.AUTONUMLGL, Field.DATA, Field.IMPORT, 36, 97, Field.IMPORT, Field.DATA, 36, Field.AUTONUM, 97, 32, Field.PAGEREF, 36, Field.EQ, Field.AUTONUMLGL, 36, Field.MACROBUTTON, 97, Field.DATA, Field.GOTOBUTTON, Field.GLOSSARY, 102, Field.AUTONUMLGL, 97, 34, Field.MACROBUTTON, 36, 32, Field.AUTONUMLGL, 36, Field.PAGEREF, 97, Field.EQ, Field.MACROBUTTON, Field.DDEAUTO, Field.EQ, 36, Field.MACROBUTTON, Field.DDE, 56, Field.INCLUDEPICTURE, Field.SECTION, 74, Field.SECTION, 86, 77, Field.FORMCHECKBOX};
    }

    static {
        A02();
        A08 = (int) (LP.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (LP.A02 * 15.0f);
        A05 = new C1191Uv();
    }

    public C1010Nw(C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A01 = c1314Zs;
        this.A02 = new AnonymousClass38(c1314Zs);
        M3.A0K(this.A02);
        this.A00 = new FM();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<QK> A01(AbstractC1456cD abstractC1456cD) {
        if (abstractC1456cD == null) {
            return new ArrayList<>();
        }
        List<C1F> A1W = abstractC1456cD.A1W();
        ArrayList<QK> arrayList = new ArrayList<>(A1W.size());
        for (int i10 = 0; i10 < A1W.size(); i10++) {
            arrayList.add(new QK(i10, A1W.size(), A1W.get(i10)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(W7 w7, int i10) {
        ArrayList<QK> A01 = A01(w7.A0z());
        this.A02.setCardsInfo(A01);
        this.A03 = new C1192Uw(this.A01, A01, w7.A0z(), this.A01.A01().A09(), w7, A05, w7.A0z().A1U(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i10 == 0) {
            i10 = LP.A03.widthPixels;
        }
        this.A03.A0F(i10 - A07, 16, 0);
        this.A03.A06();
        setupDotsLayout(w7, A01);
    }

    public final void A06(C1102Rk c1102Rk) {
        if (this.A03 != null) {
            this.A03.A0G(c1102Rk);
        } else {
            this.A01.A07().AA0(A00(51, 7, 24), C8E.A1v, new C8F(A00(0, 51, 125)));
        }
        this.A02.A1y(c1102Rk);
    }

    public static MR getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10 && this.A03 != null) {
            this.A03.A0F((i12 - i10) - A07, 16, 0);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i10) {
        if (this.A04 != null) {
            this.A04.A00(i10);
        }
    }

    private void setupDotsLayout(W7 w7, ArrayList<QK> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C1190Uu(this));
        this.A04 = new OT(this.A01, w7.A0z().A1O().A01(), arrayList.size());
        M3.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
