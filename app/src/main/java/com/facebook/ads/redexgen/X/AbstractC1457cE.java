package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1457cE extends AbstractC05364c<VW> {
    public static String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (LP.A02 * 4.0f);
    public C1A A00;
    public final List<W7> A01;
    public final int A02;
    public final C1314Zs A03;
    public final AbstractC1101Rj A04 = new C1459cG(this);

    public AbstractC1457cE(C3C c3c, List<W7> list, C1314Zs c1314Zs) {
        this.A03 = c1314Zs;
        this.A02 = c3c.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i11 = this.A02;
        if (i10 == 0) {
            i11 *= 2;
        }
        int size = this.A01.size() - 1;
        String[] strArr = A05;
        if (strArr[3].charAt(2) != strArr[4].charAt(2)) {
            String[] strArr2 = A05;
            strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
            strArr2[1] = "gQBYn2ao1l5plthpQQ";
            marginLayoutParams.setMargins(i11, 0, i10 >= size ? this.A02 * 2 : this.A02, 0);
            return marginLayoutParams;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i10) {
        W7 w7 = this.A01.get(i10);
        JU adCoverImage = w7.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1183Un A04 = new AsyncTaskC1183Un(imageView, this.A03).A04();
            A04.A06(new C1458cF(this, i10, w7));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(C1A c1a) {
        this.A00 = c1a;
    }

    public void A0H(VW vw, int i10) {
        vw.A0j().setLayoutParams(A02(i10));
    }
}
