package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public class VY extends RelativeLayout implements MS {
    public static byte[] A0F;
    public static final String A0G;
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public String A04;
    public boolean A05;
    public final C5W A06;
    public final C5Q A07;
    public final C1314Zs A08;
    public final J7 A09;
    public final MR A0A;
    public final C0997Nj A0B;
    public final C0998Nk A0C;
    public final InterfaceC1006Ns A0D;
    public final C1194Uy A0E;

    public static String A0C(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0F = new byte[]{Field.LISTNUM, 112, 112, 125, 112, 20, Field.BARCODE, 61, 112, 19, Field.BARCODE, Field.USERADDRESS, 36, Field.AUTONUMLGL, Field.USERADDRESS, 36, 112, Field.NUMCHARS, Field.BARCODE, Field.EQ, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUMOUT, 112, 4, Field.SYMBOL, 61, Field.AUTONUMLGL, 106, 112, 48, 26, 26, 23, 26, 118, Field.DOCPROPERTY, Field.HTMLCONTROL, Field.GREETINGLINE, 26, 124, Field.FORMDROPDOWN, Field.ADVANCE, Field.FORMDROPDOWN, Field.TOA, 82, 26, 110, Field.FORMDROPDOWN, Field.CONTROL, Field.SHAPE, 0, 26, Field.SHAPE, 117, 117, 120, 117, 25, 58, Field.AUTONUMOUT, Field.EQ, 117, 6, 33, Field.AUTONUMOUT, Field.FILLIN, 33, 117, 1, 60, 56, 48, 111, 117, 117, Field.SHAPE, Field.SHAPE, 82, Field.SHAPE, Field.DDE, 26, 12, 15, 16, 17, 12, 26, Field.SHAPE, 58, 17, Field.NUMWORDS, Field.SHAPE, 43, 22, 18, 26, Field.FILESIZE, Field.SHAPE, 109, Field.FORMCHECKBOX, Field.FORMCHECKBOX, 74, Field.FORMCHECKBOX, Field.AUTONUMOUT, 4, 21, 8, 11, 11, Field.FORMCHECKBOX, Field.AUTONUMLGL, 2, 6, 3, 30, Field.FORMCHECKBOX, Field.MACROBUTTON, 14, 10, 2, Field.ADDRESSBLOCK, Field.FORMCHECKBOX, Field.CONTROL, 125, 125, 112, 125, 14, 56, Field.DDEAUTO, Field.DDEAUTO, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.MACROBUTTON, 125, Field.NUMWORDS, Field.AUTONUMOUT, Field.MACROBUTTON, Field.AUTONUMOUT, Field.DDEAUTO, Field.AUTONUMLGL, 125, 9, Field.AUTONUMOUT, 48, 56, 103, 125, 42, 26, 48, 48, 61, 48, Field.HYPERLINK, 113, 126, 116, 124, 117, 98, 48, Field.INCLUDETEXT, 121, 125, 117, 42, 48, 97, Field.ADDIN, 76, Field.ADVANCE, 80, Field.FORMTEXT, Field.ADDIN, 3, 80, Field.FORMTEXT, 80, 80, 74, 76, 77, 3, Field.FORMCHECKBOX, Field.SECTIONPAGES, Field.CONTROL, Field.SECTIONPAGES, 3, Field.AUTOTEXT, 76, Field.INCLUDETEXT, Field.INCLUDETEXT, Field.FORMTEXT, Field.FORMCHECKBOX, 3, 99, 3, 126, 125, 112, 106, 107, Field.PAGEREF, 125, 115, 126, 113, 116, Field.INCLUDEPICTURE, Field.FORMDROPDOWN, 78, 86, 82, Field.INCLUDETEXT, Field.FORMDROPDOWN, 116, 115, 109, Field.DOCPROPERTY, Field.LISTNUM, Field.SHAPE, Field.FORMDROPDOWN, Field.HYPERLINK, Field.SECTIONPAGES, 98, Field.AUTOTEXTLIST, Field.ADDRESSBLOCK, Field.FORMDROPDOWN, Field.HYPERLINK, Field.PAGEREF, 44, Field.QUOTE, 41, 33, Field.DATA, Field.BARCODE, 25, 36, 32, Field.DATA};
    }

    static {
        A0D();
        A0G = VY.class.getSimpleName();
    }

    public VY(C5Q c5q, C1314Zs c1314Zs, J7 j72, MR mr) {
        super(c1314Zs);
        C1194Uy c1194Uy;
        this.A06 = new C1197Vb(this);
        this.A05 = true;
        this.A01 = -1L;
        this.A03 = true;
        this.A07 = c5q;
        this.A09 = j72;
        this.A0A = mr;
        this.A08 = c1314Zs;
        if (c1314Zs.A0D() == null) {
            c1314Zs.A0E().A93();
        }
        this.A0D = A0E();
        if (AbstractC0878In.A02(c1314Zs) || c1314Zs.A0D() == null) {
            c1194Uy = new C1194Uy(c1314Zs, this.A0D);
        } else {
            c1194Uy = new C1194Uy(c1314Zs, c1314Zs.A0D(), this.A0D);
        }
        this.A0E = c1194Uy;
        this.A0B = new C0997Nj(c1314Zs, this.A0E);
        this.A0B.setId(View.generateViewId());
        this.A0B.setListener(new C1196Va(this));
        this.A0E.setBrowserNavigationListener(this.A0B.getBrowserNavigationListener());
        this.A0C = new C0998Nk(c1314Zs, null, 16842872);
        A0F();
        c5q.A0A(this.A06);
    }

    public InterfaceC1006Ns A0E() {
        return new VZ(this);
    }

    public void A0F() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A0A.A3q(this.A0B, layoutParams);
        RelativeLayout.LayoutParams webViewParams = new RelativeLayout.LayoutParams(-1, -2);
        webViewParams.addRule(3, this.A0B.getId());
        webViewParams.addRule(12);
        this.A0A.A3q(this.A0E, webViewParams);
        RelativeLayout.LayoutParams webViewParams2 = new RelativeLayout.LayoutParams(-1, (int) (LP.A02 * 2.0f));
        webViewParams2.addRule(3, this.A0B.getId());
        this.A0C.setProgress(0);
        this.A0A.A3q(this.A0C, webViewParams2);
    }

    public void A0G() {
        this.A07.finish(1);
    }

    public void A0H(String str) {
    }

    public void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String A0C = A0C(231, 11, 97);
        String A0C2 = A0C(220, 11, 26);
        String url = A0C(210, 10, 13);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(url);
            this.A04 = intent.getStringExtra(A0C2);
            this.A00 = intent.getLongExtra(A0C, -1L);
        } else {
            this.A02 = bundle.getString(url);
            this.A04 = bundle.getString(A0C2);
            this.A00 = bundle.getLong(A0C, -1L);
        }
        String A0C3 = this.A02 != null ? this.A02 : A0C(199, 11, 51);
        this.A0B.setUrl(A0C3);
        this.A0E.loadUrl(A0C3);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACz(boolean z10) {
        C1001Nn A07;
        this.A0E.onPause();
        if (this.A03) {
            this.A03 = false;
            this.A09.A9v(this.A04, new C1000Nm(this.A0E.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0E.getResponseEndMs()).A00(this.A0E.getDomContentLoadedMs()).A05(this.A0E.getScrollReadyMs()).A02(this.A0E.getLoadFinishMs()).A06(System.currentTimeMillis()).A07().A02());
            if (BuildConfigApi.isDebug()) {
                String str = A0C(ShapeTypes.ACTION_BUTTON_RETURN, 30, 15) + System.currentTimeMillis() + A0C(ShapeTypes.FLOW_CHART_SORT, 20, 60) + A07.A01 + A0C(53, 22, 121) + A07.A03 + A0C(75, 24, 83) + A07.A04 + A0C(0, 30, 124) + A07.A00 + A0C(99, 24, 75) + A07.A05 + A0C(30, 23, 22) + A07.A02 + A0C(123, 26, 113) + A07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ADN(boolean z10) {
        this.A0E.onResume();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AFx(Bundle bundle) {
        bundle.putString(A0C(210, 10, 13), this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public String getCurrentClientToken() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A07.A0B(this.A06);
        O4.A03(this.A0E);
        this.A0E.destroy();
    }

    public void setListener(MR mr) {
    }
}
