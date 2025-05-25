package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class QV extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC1456cD A03;
    public final C04581b A04;
    public final C1314Zs A05;
    public final J7 A06;
    public final O1 A07;
    public final C1185Up A08;
    public final QT A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{Field.AUTONUM, 18, 32, Field.NUMCHARS, 17, 9, 17, 18, Field.NUMCHARS, 21, Field.EQ, 20, 19, 34, Field.EQ, 48, 42, Field.DDE, 36, 99, Field.ASK, Field.EQ, Field.EQ, 44, Field.EQ, Field.INCLUDETEXT, 120, 117, 109, 117, 118, 120, 113, Field.AUTONUMOUT, 112, 123, Field.CONTROL, 96, 117, Field.CONTROL, 120, 125, 119, Byte.MAX_VALUE, Field.AUTONUMOUT, 96, 102, 125, 115, 115, 113, 102, 113, 112, Field.AUTONUMOUT, 99, 125, 96, 124, Field.AUTONUMOUT, 100, 102, 113, Field.SYMBOL, 113, 98, 113, 122, 96, Field.AUTONUMOUT, 119, 120, 125, 119, Byte.MAX_VALUE, 103, Field.AUTONUMOUT, 119, 123, 97, 122, 96, Field.AUTONUMOUT, 117, 122, 112, Field.AUTONUMOUT, 80, 113, 120, 117, 109, 13, Field.EQ, 60, 36, 60, Field.BARCODE, Field.EQ, 56, Field.NUMCHARS, Field.SYMBOL, Field.DDEAUTO, 11, Field.AUTONUMOUT, 56, 42, 114, 117, 119, 121, 126, 48, 124, Byte.MAX_VALUE, 113, 116, 121, 126, 119, 48, 98, 117, 125, Byte.MAX_VALUE, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, Field.DDE, Field.DATA, 34, 42, Field.GOTOBUTTON, 5, 4, 13, 0, 24, 114, 110, 99, 123, 99, 96, 110, 103, Field.AUTONUMOUT, Field.DATA, Field.PAGEREF, 61, Field.PAGEREF, Field.ASK, Field.DATA, 33, Field.NUMWORDS, Field.AUTONUM, 33, 41, 43, 48, 33, Field.SHAPE, Field.NOTEREF, 64, Field.SECTIONPAGES, Field.AUTOTEXTLIST, Field.NOTEREF, 114, Field.GREETINGLINE, Field.NOTEREF, Field.GREETINGLINE, Field.GREETINGLINE, Field.INCLUDETEXT, Field.SECTIONPAGES, Field.INCLUDEPICTURE, 114, Field.INCLUDETEXT, Field.TOA, 78, Field.DOCPROPERTY, Field.ADDIN, Field.SHAPE, Field.ADVANCE, 119, 101, 98, Field.SHAPE, 118, 105, 101, 119};
    }

    static {
        A09();
        A0E = (int) (LP.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public QV(C1314Zs c1314Zs, AbstractC1456cD abstractC1456cD, C04581b c04581b, J7 j72, QT qt, Map<String, String> playableMetricsData) {
        super(c1314Zs);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC1188Us() { // from class: com.facebook.ads.redexgen.X.9Y
            @Override // com.facebook.ads.redexgen.X.O1
            public final void ABD() {
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1188Us, com.facebook.ads.redexgen.X.O1
            public final void ABx(int i10, String str) {
                AtomicBoolean atomicBoolean;
                QT qt2;
                atomicBoolean = QV.this.A0B;
                atomicBoolean.set(true);
                qt2 = QV.this.A09;
                qt2.ACV();
            }

            @Override // com.facebook.ads.redexgen.X.O1
            public final void ACA() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                QT qt2;
                atomicBoolean = QV.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = QV.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                qt2 = QV.this.A09;
                qt2.ACA();
            }

            @Override // com.facebook.ads.redexgen.X.O1
            public final void AEC() {
                QT qt2;
                qt2 = QV.this.A09;
                qt2.AEC();
            }
        };
        this.A05 = c1314Zs;
        this.A03 = abstractC1456cD;
        this.A04 = c04581b;
        this.A06 = j72;
        this.A09 = qt;
        this.A02 = playableMetricsData;
        this.A08 = A04();
        if (C0877Im.A1p(this.A05)) {
            this.A05.A0A().AHO(this.A08, this.A03.A1U(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(QV qv) {
        int i10 = qv.A00;
        qv.A00 = i10 + 1;
        return i10;
    }

    private C1185Up A04() {
        C1185Up c1185Up = new C1185Up(this.A05, new WeakReference(this.A07), 10, C0877Im.A1y(this.A05));
        c1185Up.setCornerRadius(A0E);
        c1185Up.setLogMultipleImpressions(false);
        c1185Up.setCheckAssetsByJavascriptBridge(false);
        c1185Up.setWebViewTimeoutInMillis(this.A04.A09());
        c1185Up.setRequestId(this.A03.A0l());
        c1185Up.setOnTouchListener(new QU(this));
        WebSettings settings = c1185Up.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c1185Up.addJavascriptInterface(new QW(this.A05, this, this.A06, this.A02, this.A03.A1U()), A06(0, 12, 121));
        }
        return c1185Up;
    }

    public final void A0A() {
        long currentTimeMillis = System.currentTimeMillis() - this.A01;
        C8F c8f = new C8F(A06(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A06(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 6, 72), this.A00);
            jSONObject.put(A06(ShapeTypes.FLOW_CHART_MANUAL_OPERATION, 5, 104), currentTimeMillis);
            jSONObject.put(A06(ShapeTypes.CHART_PLUS, 5, 51), this.A03.A1U());
        } catch (JSONException e10) {
            Log.e(A06(92, 15, 84), A06(12, 13, 74), e10);
        }
        c8f.A07(jSONObject);
        c8f.A05(1);
        C8D A07 = this.A05.A07();
        int i10 = C8E.A2D;
        String A06 = A06(ShapeTypes.FLOW_CHART_OR, 8, 11);
        A07.AA1(A06, i10, c8f);
        this.A00 = 0;
        if (C0877Im.A1k(this.A05)) {
            if (currentTimeMillis <= C0877Im.A0J(this.A05)) {
                QT qt = this.A09;
                String[] strArr = A0D;
                if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
                strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
                qt.ABe();
                return;
            }
            c8f.A05(0);
            this.A05.A07().AA0(A06, C8E.A2E, c8f);
            return;
        }
        this.A09.ABe();
    }

    public final void A0B() {
        String A0F2;
        if (this.A04.A0N()) {
            C8F c8f = new C8F(A06(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(ShapeTypes.ACTION_BUTTON_DOCUMENT, 17, 36), this.A04.A0I());
                jSONObject.put(A06(ShapeTypes.CHART_PLUS, 5, 51), this.A03.A1U());
            } catch (JSONException e10) {
                String A06 = A06(92, 15, 84);
                String A062 = A06(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(A06, A062, e10);
            }
            c8f.A07(jSONObject);
            c8f.A05(1);
            C8D A07 = this.A05.A07();
            int i10 = C8E.A2G;
            String A063 = A06(ShapeTypes.FLOW_CHART_MAGNETIC_DISK, 15, 77);
            A07.AA1(A063, i10, c8f);
            if (C0877Im.A0o(this.A05) && AbstractC0954Ls.A00(this.A05) == EnumC0953Lr.A07) {
                this.A05.A07().AA1(A063, C8E.A2F, c8f);
                this.A07.ABx(0, null);
                String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                }
                String[] strArr5 = A0D;
                strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                return;
            }
        }
        try {
            C1185Up c1185Up = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0C())) {
                A0F2 = this.A04.A0C();
            } else {
                A0F2 = this.A04.A0F();
            }
            c1185Up.loadUrl(A0F2);
        } catch (Exception e11) {
            this.A05.A07().AA0(A06(192, 8, 9), C8E.A2f, new C8F(e11));
        }
    }

    public final void A0C() {
        if (C0877Im.A1p(this.A05)) {
            this.A05.A0A().AHC(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 121));
        this.A08.destroy();
    }

    public C0957Lv getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public C1102Rk getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
