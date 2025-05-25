package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.HashMap;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class BN extends FrameLayout implements U9 {
    public static byte[] A0A;
    public static String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public C1102Rk A00;
    public final int A01;
    public final AbstractC1456cD A02;
    public final C1314Zs A03;
    public final J7 A04;
    public final C0957Lv A05;
    public final PQ A06;
    public final C1041Pb A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{100, Field.FORMTEXT, Field.TOA, 0, Field.FORMDROPDOWN, 7, Field.ADVANCE, Field.FORMDROPDOWN, Field.FORMTEXT, Field.DOCPROPERTY, Field.FORMDROPDOWN, 7, 102, 82, Field.INCLUDEPICTURE, 78, Field.SECTIONPAGES, Field.TOA, Field.INCLUDETEXT, Field.SECTIONPAGES, 105, Field.SECTIONPAGES, Field.FORMDROPDOWN, 80, Field.NOTEREF, Field.DOCPROPERTY, 76, 102, Field.INCLUDETEXT, Field.FORMDROPDOWN, 78, Field.ADDIN, 78, Field.FORMDROPDOWN, Field.GREETINGLINE, 9, 7, 106, Field.FORMTEXT, 76, Field.SECTIONPAGES, 7, Field.ADVANCE, 82, Field.DOCPROPERTY, Field.SECTIONPAGES, 7, Field.FORMDROPDOWN, Field.AUTOTEXT, Field.FORMTEXT, Field.FORMDROPDOWN, 7, 78, Field.FORMDROPDOWN, 0, Field.ADVANCE, 7, 78, Field.TOA, 7, Field.GREETINGLINE, Field.NOTEREF, 82, Field.DOCPROPERTY, 7, 102, Field.TOA, Field.INCLUDEPICTURE, Field.DOCPROPERTY, Field.NOTEREF, 78, Field.INCLUDEPICTURE, 106, Field.FORMTEXT, Field.TOA, 78, Field.SECTION, Field.SECTIONPAGES, Field.ADVANCE, Field.FORMDROPDOWN, 9, Field.SHAPE, 74, Field.MERGESEQ, 7, Field.SECTION, 78, Field.MERGESEQ, Field.SECTIONPAGES, 9, 24, Field.NUMCHARS, 31, 43, 58, Field.IMPORT, 59, 48, 61, 59, 16, 59, 42, 41, Field.EQ, 44, Field.AUTONUMLGL, Field.FILESIZE, 74, 123, Field.FILESIZE, Field.FORMCHECKBOX, 80, 77, 82, 77, 80, Field.ADDRESSBLOCK, 4, 11, 14, 4, 12, 56, 20, 8, 18, 21, 4, 2, Field.LISTNUM, Field.DOCPROPERTY, 64, Field.ADDRESSBLOCK, Field.SECTIONPAGES, Field.ADDIN, 117, 80, 112, Field.DOCPROPERTY, 64, Field.DOCPROPERTY, 118, Field.SECTION, Field.LISTNUM, 80, Field.HYPERLINK, Field.ADDIN, Field.NUMWORDS, 29, 11, Field.NUMCHARS, 13, 2, 7, 13, 5, 22, 9, 5, 23, Field.AUTONUMOUT, 25, 16, 5};
    }

    static {
        A02();
    }

    public BN(C1314Zs c1314Zs, J7 j72, PQ pq, AbstractC1456cD abstractC1456cD, String str, int i10, C0957Lv c0957Lv) {
        super(c1314Zs);
        this.A03 = c1314Zs;
        this.A04 = j72;
        this.A02 = abstractC1456cD;
        this.A08 = str;
        this.A06 = pq;
        this.A01 = i10;
        C1041Pb preloadedDynamicWebViewController = AbstractC1042Pc.A02(abstractC1456cD.A0l());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new C1041Pb(this.A03, abstractC1456cD, j72, i10);
            AbstractC1042Pc.A03(abstractC1456cD, this.A07);
            this.A09 = false;
        }
        if (c0957Lv != null) {
            this.A05 = c0957Lv;
            this.A07.A0Z(c0957Lv);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new UG(this));
        this.A07.A0a(pq);
        LU.A04(this, LU.A0B);
        if (C0877Im.A1p(c1314Zs)) {
            c1314Zs.A0A().AHQ(this.A07.A0O(), abstractC1456cD.A1U(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0E().A5d();
            this.A07.A0X();
        } else {
            this.A03.A0E().A5e();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.ABp(this);
                    }
                    if (C0877Im.A1p(this.A03)) {
                        JJ A0A2 = this.A03.A0A();
                        if (A0B[1].length() != 25) {
                            throw new RuntimeException();
                        }
                        A0B[5] = "";
                        A0A2.ABh();
                    }
                } else {
                    AGz();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C1041Pb.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC1456cD abstractC1456cD) {
        intent.putExtra(A01(ShapeTypes.FLOW_CHART_DISPLAY, 8, 110), KG.A07);
        intent.putExtra(A01(ShapeTypes.DOUBLE_WAVE, 18, 58), abstractC1456cD);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC1456cD abstractC1456cD) {
        AdActivityIntent A04 = C0928Kq.A04(this.A03);
        A05(A04, abstractC1456cD);
        try {
            C0928Kq.A0A(this.A03, A04);
        } catch (Exception e10) {
            this.A03.A07().AA0(A01(107, 11, 42), C8E.A0D, new C8F(e10));
            Log.e(A01(90, 17, 80), A01(0, 90, 41), e10);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        OH oh = new OH(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A1Q());
        HashMap hashMap = new HashMap();
        hashMap.put(A01(118, 12, 105), A01(148, 9, 96));
        oh.A08(this.A02.A1U(), str, hashMap);
    }

    public final void A08() {
        M3.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void A8q() {
        A07(this.A02.A1P().A0G().A05());
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void A8r(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void A8v() {
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void A9j() {
        new Handler(Looper.getMainLooper()).post(new UF(this));
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AC2() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AC6() {
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void ACm(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void ADb() {
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AE5(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AE7(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AEK(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AGz() {
        if (this.A06 != null) {
            this.A06.ABp(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void close() {
    }

    public J7 getAdEventManager() {
        return this.A04;
    }

    public C1041Pb getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C1102Rk c1102Rk) {
        this.A00 = c1102Rk;
        this.A07.A0e(c1102Rk);
    }
}
