package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class V7 implements MS {
    public static byte[] A0D;
    public int A00;
    public TC A01;
    public C9S A02;
    public String A03;
    public final C1314Zs A04;
    public final J7 A05;
    public final MR A06;
    public final N4 A07;
    public final T7 A08;
    public final AbstractC1105Rn A0C = new C0715Bp(this);
    public final AbstractC1121Sd A0B = new C0714Bo(this);
    public final AbstractC1127Sj A09 = new C0713Bn(this);
    public final AbstractC1125Sh A0A = new C0712Bm(this);

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, Field.SYMBOL, 34, 61, 33, 44, Field.AUTONUMOUT, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, 20, 18, 4, Field.GLOSSARY, 0, 21, 8, 23, 4, 34, 21, 0, Field.QUOTE, 20, 21, 21, 14, 15, Field.IMPORT, Field.DATA, Field.PAGEREF, 36, Field.DDEAUTO, 8, Field.GLOSSARY, Field.AUTONUMLGL, 36, Field.MACROBUTTON, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.DATA, Field.AUTONUMLGL, 32, Field.DDE, 4, Field.IMPORT, 36, Field.GLOSSARY, Field.AUTONUMLGL, Field.ADDIN, 78, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.NOTEREF, 107, Field.NOTEREF, 64, 64, Field.SECTIONPAGES, Field.DOCPROPERTY, 116, 107, 102, 103, 109, Field.AUTOTEXT, 82, Field.FORMTEXT, 103, 120, 117, 116, 126, Field.SECTIONPAGES, 116, 116, 122, Field.FILESIZE, 120, 124, 116, Field.BARCODE, 32, Field.DDE, 44, Field.ASK, Field.NUMCHARS, Field.NUMWORDS, 5};
    }

    public V7(C1314Zs c1314Zs, N4 n42, J7 j72, MR mr) {
        this.A04 = c1314Zs;
        this.A05 = j72;
        this.A07 = n42;
        this.A08 = new T7(c1314Zs);
        this.A08.A0c(new C8S(c1314Zs));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = mr;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        mr.A3q(this.A08, layoutParams);
        MZ closeButton = new MZ(c1314Zs);
        closeButton.setOnClickListener(new N2(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        mr.A3q(closeButton, params);
    }

    public final void A04(int i10) {
        this.A08.setVideoProgressReportIntervalMs(i10);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        String ctaText = A02(8, 11, ShapeTypes.VERTICAL_SCROLL);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            QI qi2 = new QI(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i10 = (int) (16.0f * LP.A02);
            layoutParams.setMargins(i10, i10, i10, i10);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            qi2.setOnClickListener(new N3(this));
            this.A06.A3q(qi2, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 119), 0);
        this.A02 = new C9S(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (C0877Im.A1q(this.A04)) {
            this.A01 = new TC(this.A04, this.A05, this.A08, this.A03, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0Y(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0b(EnumC1084Qs.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACz(boolean z10) {
        this.A06.A4Q(A02(37, 21, 39), new C1123Sf());
        this.A08.A0W();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ADN(boolean z10) {
        this.A06.A4Q(A02(37, 21, 39), new C1122Se());
        if (!this.A08.A0k()) {
            this.A08.A0b(EnumC1084Qs.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        this.A06.A4Q(A02(37, 21, 39), new R6(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0i(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A06();
        }
        this.A08.A0Z(1);
        this.A08.A0V();
    }
}
