package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class BY extends AbstractC1173Ud {
    public static byte[] A02;
    public static String[] A03 = {"ccLmdgMtf", "50lpHgsnQSuWf1CWCacJGyiAwAWsDUud", "Nq2vo108Bdlpu7LWCjcAC5dDG31maruF", "TAe0PaklKNA7XHBVlxrhZCtyBfgeydAO", "ouUdcivF6", "IAXVD4SBpgtyrGYWX4yc8p2wBrUpSeUf", "nA5GNdAWyE31pAGlKcdnPdOQEY7Q2fwD", "a5Dyr8HKQP9cZfy0xnx35qJg31dQk6"};
    public static final int A04;
    public final View A00;
    public final boolean A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "FT3046kmt";
            strArr[4] = "J6Q3a22Lt";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{Field.PAGEREF, 33, Field.DDE, 43, 41};
    }

    static {
        A01();
        A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public BY(C1026Om c1026Om, boolean z10) {
        super(c1026Om, true);
        this.A01 = z10;
        this.A00 = c1026Om.A02();
        A14();
        if (this.A01) {
            addView(c1026Om.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c1026Om.A05());
            RelativeLayout.LayoutParams insideContainerParams = new RelativeLayout.LayoutParams(-1, -1);
            insideContainerParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(insideContainerParams);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC1022Oi.A07, 0, AbstractC1022Oi.A07, 0);
            frameLayout.addView(this.A00, layoutParams);
            addView(frameLayout);
        }
        LK A0A = this.A07.A0A(getAdDataBundle());
        c1026Om.A05().A0G().A00(A0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A07);
        if (this.A00 != null) {
            if (A0A.A00) {
                this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.On
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BY.this.A16(view);
                    }
                });
            } else if (C0877Im.A1C(getAdContextWrapper())) {
                OB.A00(this.A00, C0877Im.A1D(getAdContextWrapper()), new View$OnClickListenerC1028Oo(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A02() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A0C() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1173Ud, com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A10(C1F c1f, String str, double d10, Bundle bundle) {
        super.A10(c1f, str, d10, bundle);
        if (!this.A01 && d10 > 0.0d) {
            int mediaHeight = (int) ((A04 - (AbstractC1022Oi.A07 * 2)) / d10);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i10 = AbstractC1022Oi.A07;
            int mediaHeight2 = AbstractC1022Oi.A07;
            layoutParams.setMargins(i10, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A11() {
        return this.A01;
    }

    public final /* synthetic */ void A16(View view) {
        getCtaButton().A09(A00(0, 5, 11));
    }
}
