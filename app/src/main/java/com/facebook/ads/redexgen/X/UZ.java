package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.adjust.sdk.network.ErrorCodes;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class UZ extends AbstractC1022Oi implements LJ {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC1456cD A00;
    public final LL A01;
    public final MR A02;
    public final P9 A03;
    public final QJ A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{Field.ASK, 42, 30, 36, 34};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public UZ(C1026Om c1026Om, boolean z10) {
        super(c1026Om, z10);
        int id2;
        int A01;
        this.A02 = c1026Om.A0A();
        this.A00 = c1026Om.A04();
        this.A03 = new P9(c1026Om.A05(), c1026Om.A02());
        this.A03.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC1022Oi.A07, AbstractC1022Oi.A07, AbstractC1022Oi.A07, AbstractC1022Oi.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c1026Om.A0D()) {
            this.A04 = new QJ(c1026Om.A05());
            this.A04.setPageDetails(c1026Om.A04().A1S());
            M3.A0G(ErrorCodes.IO_EXCEPTION, this.A04);
            RelativeLayout.LayoutParams pageDetailsParams = new RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(AbstractC1022Oi.A07, AbstractC1022Oi.A07 - (AbstractC1022Oi.A07 / 2), AbstractC1022Oi.A07, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id2 = this.A04.getId();
            A01 = c1026Om.A01() - (AbstractC1022Oi.A07 / 2);
        } else {
            id2 = getCtaButton().getId();
            A01 = c1026Om.A01();
            this.A04 = null;
        }
        FrameLayout insideContainerLayout = new FrameLayout(c1026Om.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id2);
        layoutParams2.setMargins(0, A01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC1022Oi.A07, 0, AbstractC1022Oi.A07, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0A(c1026Om.A04(), c1026Om.A09());
        View A02 = c1026Om.A02();
        this.A01 = LL.A01(c1026Om.A05(), this.A00, this);
        LK A0A = this.A01.A0A(this.A00);
        c1026Om.A05().A0G().A00(A0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (A02 != null && A0A.A00) {
            A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Os
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UZ.this.A13(view);
                }
            });
        } else if (A02 != null && C0877Im.A1C(getAdContextWrapper())) {
            OB.A00(A02, C0877Im.A1D(getAdContextWrapper()), new View$OnClickListenerC1033Ot(this));
        }
        if (C0877Im.A12(c1026Om.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c1026Om.A09() != null) {
                c1026Om.A09().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C0877Im.A13(c1026Om.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0v() {
        super.A0v();
        this.A01.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A10(C1F c1f, String str, double d10, Bundle bundle) {
        super.A10(c1f, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) ((A06 - (AbstractC1022Oi.A07 * 2)) / d10);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A11() {
        return false;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 103));
    }

    @Override // com.facebook.ads.redexgen.X.LJ
    public final void ACa() {
        this.A02.A4P(this.A00.A0Y());
    }
}
