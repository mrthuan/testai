package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class TK extends AnonymousClass56 implements MY {
    public C1T A00;
    public AbstractC1101Rj A01;
    public C1102Rk A02;
    public C1102Rk A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1314Zs A09;
    public final BP A0A;

    public TK(BP bp2, SparseBooleanArray sparseBooleanArray, C1102Rk c1102Rk, int i10, int i11, int i12, int i13, C1314Zs c1314Zs, C1T c1t) {
        super(bp2);
        this.A09 = c1314Zs;
        this.A0A = bp2;
        this.A08 = sparseBooleanArray;
        this.A02 = c1102Rk;
        this.A04 = i10;
        this.A05 = i11;
        this.A06 = i12;
        this.A07 = i13;
        this.A00 = c1t;
    }

    private void A0A(J7 j72, C0957Lv c0957Lv, String str, QK qk2) {
        if (this.A08.get(qk2.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new TM(this, str, qk2, j72, qk2.A04(), c0957Lv);
        this.A03 = new C1102Rk(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new TL(this, qk2));
    }

    public final void A0j(QK qk2, J7 j72, C05906f c05906f, C0957Lv c0957Lv, String str) {
        int A02 = qk2.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = qk2.A03().A0E().A07();
        String A08 = qk2.A03().A0E().A08();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A0A.A18()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c05906f.A0S(A08));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(qk2.A03().A0F().A08(), qk2.A03().A0F().A02());
        this.A0A.setCTAInfo(qk2.A03().A0G(), qk2.A04());
        this.A0A.A1B(qk2.A04());
        A0A(j72, c0957Lv, str, qk2);
    }

    @Override // com.facebook.ads.redexgen.X.MY
    public final void AGH() {
        this.A0A.A13();
    }
}
