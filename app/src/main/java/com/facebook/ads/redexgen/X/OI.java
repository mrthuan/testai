package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class OI {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3n] */
    public static C05223n A00(final C1026Om c1026Om, final W7 w7, final String str, final C0711Bl c0711Bl) {
        return new BZ(c1026Om, w7, true, str, c0711Bl) { // from class: com.facebook.ads.redexgen.X.3n
            public View$OnClickListenerC1178Ui A00;
            public QK A01;
            public final J7 A02 = this.A0I.A05().A01().A09();
            public final W7 A03;
            public final C0711Bl A04;
            public final String A05;
            public static String[] A06 = {OperatorName.SAVE, "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (LP.A02 * (-4.0f));
            public static final int A07 = (int) (LP.A02 * 6.0f);

            {
                this.A03 = w7;
                this.A05 = str;
                this.A04 = c0711Bl;
                this.A03.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.X.UO
            public void setupNativeCtaExtension(QK qk2) {
                C1T A1Q;
                this.A01 = qk2;
                int A0O = C0877Im.A0O(this.A0I.A05());
                C1O A01 = this.A03.A0z().A1O().A01();
                C1314Zs A05 = this.A0I.A05();
                String A0Y = this.A03.A0z().A0Y();
                J7 j72 = this.A02;
                MR dummyListener = C1010Nw.getDummyListener();
                C1102Rk A0b = this.A04.A0b();
                C0957Lv A19 = this.A03.A19();
                if (this.A03.A0z() == null) {
                    A1Q = null;
                } else {
                    A1Q = this.A03.A0z().A1Q();
                }
                this.A00 = new View$OnClickListenerC1178Ui(A05, A0Y, A01, j72, dummyListener, A0b, A19, A1Q);
                this.A00.setCta(qk2.A03().A0G(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0O == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    M3.A0P(this.A00, A07, 5, A01.A09(false));
                    ((BZ) this).A06.addView(this.A00, layoutParams);
                } else if (A0O == 2) {
                    layoutParams.addRule(3, ((BZ) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((BZ) this).A06.bringToFront();
                }
            }
        };
    }
}
