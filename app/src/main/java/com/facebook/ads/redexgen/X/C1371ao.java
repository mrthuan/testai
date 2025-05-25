package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ao  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1371ao implements C4B {
    public static byte[] A01;
    public final /* synthetic */ FL A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, 15, 15, 8, 7, -61, 4, 23, 23, 4, 6, 11, -61, 18, 17, -61, 4, -61, 6, 11, 12, 15, 7, -61, 26, 11, 12, 6, 11, -61, 12, 22, -61, 17, 18, 23, -61, 7, 8, 23, 4, 6, 11, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C1371ao(FL fl2) {
        this.A00 = fl2;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void A40(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F != null) {
            if (A0F.A0c() || A0F.A0f()) {
                A0F.A0P();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + A0F + this.A00.A1H());
            }
        }
        this.A00.attachViewToParent(view, i10, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void A5T(int i10) {
        AnonymousClass56 A0F;
        View view = A6k(i10);
        if (view != null && (A0F = FL.A0F(view)) != null) {
            if (!A0F.A0c() || A0F.A0f()) {
                A0F.A0T(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + A0F + this.A00.A1H());
            }
        }
        this.A00.detachViewFromParent(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final View A6k(int i10) {
        return this.A00.getChildAt(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final int A6l() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final AnonymousClass56 A6o(View view) {
        return FL.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final int A9C(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void ABr(View view) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F != null) {
            A0F.A07(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void ACO(View view) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F != null) {
            A0F.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void AFZ() {
        int A6l = A6l();
        for (int i10 = 0; i10 < A6l; i10++) {
            View A6k = A6k(i10);
            this.A00.A1e(A6k);
            A6k.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void AFd(int i10) {
        View childAt = this.A00.getChildAt(i10);
        if (childAt != null) {
            this.A00.A1e(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void addView(View view, int i10) {
        this.A00.addView(view, i10);
        this.A00.A1d(view);
    }
}
