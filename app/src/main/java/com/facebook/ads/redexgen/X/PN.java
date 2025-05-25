package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public abstract class PN {
    public static BP A00(final C1026Om c1026Om, int i10, final String str, final TV tv) {
        if (i10 == 1) {
            return new BP(c1026Om, str, tv) { // from class: com.facebook.ads.redexgen.X.3Q
                public static final int A00 = (int) (LP.A02 * 20.0f);
                public static final int A01 = (int) (LP.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.X.BP
                public final void A1A(C1314Zs c1314Zs) {
                    C1014Oa titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c1314Zs);
                    M3.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(A01, A01, A01, A01);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new BP(c1026Om, str, tv) { // from class: com.facebook.ads.redexgen.X.3b
            public static final int A00 = (int) (LP.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.BP, com.facebook.ads.redexgen.X.AbstractC1022Oi
            public final boolean A0C() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.BP
            public final void A1A(C1314Zs c1314Zs) {
                C1014Oa titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                titleDescContainer.setPadding(A00, A00, A00, A00);
                M3.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
