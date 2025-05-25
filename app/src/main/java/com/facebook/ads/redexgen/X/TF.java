package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class TF extends LinearLayout implements InterfaceC1072Qg {
    public final NativeBannerAd A00;
    public final C1314Zs A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (LP.A02 * 42.0f);
    public static final int A03 = (int) (LP.A02 * 48.0f);
    public static final int A05 = (int) (LP.A02 * 54.0f);
    public static final int A07 = (int) (LP.A02 * 4.0f);
    public static final int A06 = (int) (LP.A02 * 8.0f);

    public TF(C1314Zs c1314Zs, NativeBannerAd nativeBannerAd, JW jw, JX jx, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1314Zs);
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams ctaButtonParams;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1314Zs;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(jx);
        OV ov = new OV(this.A01);
        ov.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams2.gravity = 16;
        ov.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(ov, layoutParams2);
        C1069Qd c1069Qd = new C1069Qd(c1314Zs, this.A00, jx, jw, adOptionsView);
        c1069Qd.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(c1069Qd, layoutParams3);
        if (jx == JX.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            ctaButtonParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView ctaButton = new TextView(getContext());
        ctaButton.setPadding(A06, A07, A06, A07);
        jw.A05(ctaButton);
        ctaButton.setText(this.A00.getAdCallToAction());
        addView(ctaButton, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(ctaButton);
    }

    public static int A00(JX jx) {
        switch (jx) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1072Qg
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1072Qg
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1072Qg
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
