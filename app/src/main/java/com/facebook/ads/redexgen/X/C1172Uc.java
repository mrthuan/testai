package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.adjust.sdk.network.ErrorCodes;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Uc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1172Uc extends AbstractC1022Oi implements LJ {
    public static byte[] A03;
    public static String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final AbstractC1456cD A00;
    public final LL A01;
    public final MR A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 78);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{64, Field.INCLUDETEXT, Field.NOTEREF, 78, 76};
    }

    static {
        A01();
    }

    public C1172Uc(C1026Om c1026Om, boolean z10) {
        super(c1026Om, true);
        FrameLayout.LayoutParams mediaViewParams;
        this.A02 = c1026Om.A0A();
        this.A00 = c1026Om.A04();
        RelativeLayout relativeLayout = new RelativeLayout(c1026Om.A05());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        M3.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c1026Om.A05());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        M3.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC1022Oi.A07, 0, AbstractC1022Oi.A07, AbstractC1022Oi.A07);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams3.setMargins(z10 ? AbstractC1022Oi.A07 : 0, z10 ? 0 : AbstractC1022Oi.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        this.A01 = LL.A01(c1026Om.A05(), this.A00, this);
        LK A0A = this.A01.A0A(this.A00);
        c1026Om.A05().A0G().A00(A0A.A01);
        if (c1026Om.A0D() && !z10) {
            QJ qj2 = new QJ(c1026Om.A05());
            qj2.setPageDetails(c1026Om.A04().A1S());
            int A042 = this.A06.A04().A1O().A00().A04(true);
            qj2.A02(A042, A042);
            M3.A0G(ErrorCodes.IO_EXCEPTION, qj2);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.setMargins(0, AbstractC1022Oi.A07, 0, 0);
            linearLayout.addView(qj2, layoutParams5);
            if (C0877Im.A13(c1026Om.A05())) {
                qj2.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        getCtaButton().A0A(c1026Om.A04(), c1026Om.A09());
        View A02 = c1026Om.A02();
        if (A02 != null && (A0A.A00 || C0877Im.A1C(getAdContextWrapper()))) {
            if (z10) {
                mediaViewParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                mediaViewParams = new FrameLayout.LayoutParams(-1, -2);
            }
            mediaViewParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c1026Om.A05());
            frameLayout.addView(A02, mediaViewParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (A0A.A00) {
                A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Og
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1172Uc.this.A13(view);
                    }
                });
            } else {
                OB.A00(A02, C0877Im.A1D(getAdContextWrapper()), new View$OnClickListenerC1021Oh(this));
            }
        } else if (A02 != null) {
            addView(A02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams);
        if (C0877Im.A12(c1026Om.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c1026Om.A09() != null) {
                c1026Om.A09().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A0v() {
        super.A0v();
        this.A01.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final void A10(C1F c1f, String str, double d10, Bundle bundle) {
        super.A10(c1f, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Oi
    public final boolean A11() {
        return true;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 103));
    }

    @Override // com.facebook.ads.redexgen.X.LJ
    public final void ACa() {
        this.A02.A4P(this.A00.A0Y());
    }
}
