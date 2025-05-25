package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.adjust.sdk.network.ErrorCodes;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class BO extends FrameLayout implements MS, U9 {
    public static byte[] A0I;
    public static String[] A0J = {"UTx0mthy689a2sWy4JVu0tmbo5tf7DAX", "DpQrJfF4GGVCKG366ycalUQvQmaAeTpv", "eTaJ9UlZkoiVo78onrsfkh8qyWU6l07Y", "ASk", "tRl9yBUHWghtVC3MTlEkON1DGIMHt5L9", "IjjI8eijgHBxehc5IxL2bCSmbEZHlZYm", "ajbOHBl4KDnxYMWXO0J67", "uiq3lL8JcMvDgND3txStxUQziaPHduab"};
    public C5Q A00;
    public C5W A01;
    public InterfaceC1051Pl A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC1456cD A06;
    public final C1314Zs A07;
    public final J7 A08;
    public final JF A09;
    public final View$OnSystemUiVisibilityChangeListenerC0952Lq A0A;
    public final C0957Lv A0B;
    public final MR A0C;
    public final N9 A0D;
    public final PT A0E;
    public final C1041Pb A0F;
    public final AbstractC1101Rj A0G;
    public final C1102Rk A0H;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{24, Field.GLOSSARY, Field.GLOSSARY, Field.GOTOBUTTON, Field.GLOSSARY, 125, Field.USERADDRESS, Field.GLOSSARY, 56, 60, 41, Field.AUTONUMOUT, Field.MACROBUTTON, 58, 125, Field.USERADDRESS, Field.GOTOBUTTON, Field.MACROBUTTON, 59, Field.AUTONUMOUT, 58, 125, 23, 14, 18, 19, 78, Field.FILESIZE, 76, Field.INCLUDETEXT, Field.INCLUDEPICTURE, Field.NOTEREF, Field.TOA, 114, 76, Field.TOA, 36, Field.GLOSSARY, Field.ASK, Field.DDEAUTO, 41, 34, Field.QUOTE, 24, Field.ASK, Field.QUOTE, 24, Field.DDEAUTO, 41, Field.QUOTE, 34, Field.BARCODE, Field.DDEAUTO, Field.PAGEREF, 44, 36, Field.QUOTE, Field.DATA, 41, 18, 44, 41, 18, Field.SYMBOL, 34, Field.SYMBOL, 44, 33, Field.HTMLCONTROL, 80, Field.AUTOTEXTLIST, Field.ADDIN, 86, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, 103, 76, Field.ADDIN, Field.DOCPROPERTY, Field.ADDRESSBLOCK, 103, Field.MERGESEQ, Field.NOTEREF, Field.ADDRESSBLOCK, 86, 76, Field.QUOTE, 44, 41, Field.QUOTE, 43, 31, Field.MACROBUTTON, Field.GLOSSARY, Field.AUTONUMLGL, Field.GOTOBUTTON, Field.QUOTE, Field.PAGEREF, 74, 76, Field.LISTNUM, 77, Field.BIDIOUTLINE, Field.FORMDROPDOWN, 86, Field.BIDIOUTLINE, Field.ADVANCE};
    }

    static {
        A0D();
    }

    public BO(C1314Zs c1314Zs, J7 j72, MR mr, AbstractC1456cD abstractC1456cD, N9 n92, int i10) {
        super(c1314Zs);
        this.A01 = new UM(this);
        this.A0G = new UL(this);
        this.A03 = true;
        this.A07 = c1314Zs;
        this.A08 = j72;
        this.A0C = mr;
        this.A06 = abstractC1456cD;
        this.A0D = n92;
        C1041Pb A02 = AbstractC1042Pc.A02(abstractC1456cD.A0l());
        if (A02 == null) {
            this.A0F = new C1041Pb(this.A07, abstractC1456cD, j72, i10);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new UK(this));
        M3.A0G(ErrorCodes.MALFORMED_URL_EXCEPTION, this.A0F.A0O());
        if (this.A06.A11()) {
            this.A0E = new PT(this.A07, this.A08, this.A06, new C05906f(this.A07), this.A09, this.A0C, this.A0D, new UJ(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new PP(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C1102Rk(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0O());
        this.A0H.A0X(this.A06.A0P());
        this.A0F.A0e(this.A0H);
        this.A0A = new View$OnSystemUiVisibilityChangeListenerC0952Lq(this);
        this.A0A.A05(EnumC0951Lp.A02);
        setBackgroundColor(0);
        if (C0877Im.A1p(c1314Zs)) {
            c1314Zs.A0A().AHQ(mediaView, abstractC1456cD.A1U(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A1a = abstractC1456cD.A1a();
            String A0B = A0B(68, 18, 20);
            String A0B2 = A0B(36, 16, 107);
            String A0B3 = A0B(52, 16, 97);
            String A0B4 = A0B(26, 10, 1);
            if (A1a) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 0);
                jSONObject.put(A0B, this.A06.A0V());
            } else if (L6.A05(abstractC1456cD.A0b())) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 1);
                jSONObject.put(A0B, this.A06.A0V());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(C8E.A15, A0B(0, 26, 113));
        }
    }

    private void A0C() {
        Q7 A0F = new Q5(this.A07, this.A06.A1P().A0F(), this.A06.A1S()).A0A(this.A06.A1O().A01()).A0F();
        addView(A0F, new FrameLayout.LayoutParams(-1, -1));
        A0F.A04(new UH(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0E().A5d();
            this.A0F.A0X();
        } else {
            this.A07.A0E().A5e();
            if (this.A0F.A0k()) {
                AGz();
                if (C0877Im.A1p(this.A07)) {
                    this.A07.A0A().ABh();
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            C1041Pb c1041Pb = this.A0F;
            String[] strArr = A0J;
            if (strArr[0].charAt(1) != strArr[2].charAt(1)) {
                throw new RuntimeException();
            }
            A0J[6] = "m5i7x933C7hHEFpC39NkE";
            ViewGroup parent = c1041Pb.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3q(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A12()) {
            this.A0A.A05(EnumC0951Lp.A03);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        OH oh = new OH(this.A07, this.A0D.A6p(), this.A0H, this.A0B, this.A08, this.A06.A1Q(), this.A0C);
        HashMap hashMap = new HashMap();
        hashMap.put(A0B(86, 12, 108), A0B(98, 9, 19));
        oh.A08(this.A06.A1U(), str, hashMap);
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void A8q() {
        A0F(this.A06.A1P().A0G().A05());
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void A8r(String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void A8v() {
        this.A0C.A4P(this.A0D.A6F());
        C1068Qc serverSideRewardHandler = new C1068Qc(this.A07, this.A0D, this.A06.A0m(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void A9j() {
        new Handler(Looper.getMainLooper()).post(new UI(this));
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void A9q(Intent intent, Bundle bundle, C5Q c5q) {
        C1041Pb.A0B().incrementAndGet();
        c5q.A0A(this.A01);
        this.A00 = c5q;
        A0E();
        if (this.A06.A1P().A0R()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AC2() {
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AC6() {
        if (this.A0E != null) {
            this.A0E.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void ACm(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0R(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ACz(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0S(z10);
        }
        if (z10) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void ADN(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0T(z10);
        }
        if (this.A03) {
            this.A03 = false;
        } else if (z10) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void ADb() {
        if (this.A0E != null) {
            this.A0E.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AE5(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0U(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AE7(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0V(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AEK(String str) {
        String urlString = this.A06.A1V(str);
        if (urlString == null) {
            return;
        }
        L2.A0M(new L2(), this.A07, L5.A00(urlString), this.A06.A1U());
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void AFx(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void AGz() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.U9
    public final void close() {
        if (this.A00 == null) {
            return;
        }
        this.A00.finish(4);
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public String getCurrentClientToken() {
        return this.A06.A1U();
    }

    private ViewGroup getMediaView() {
        if (this.A0E != null) {
            return this.A0E;
        }
        return this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.MS
    public final void onDestroy() {
        if (C0877Im.A1p(this.A07)) {
            this.A07.A0A().AHC(getMediaView());
        }
        PT pt = this.A0E;
        String[] strArr = A0J;
        if (strArr[4].charAt(27) != strArr[5].charAt(27)) {
            throw new RuntimeException();
        }
        A0J[6] = "GZe1biqFkGajjfTMFdC84";
        if (pt != null) {
            this.A0E.A0O();
        }
        this.A0A.A03();
        this.A08.A9x(this.A06.A1U(), new O8().A02(this.A0B).A03(this.A0H).A05());
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        AbstractC1042Pc.A04(this.A06.A0l());
        C1041Pb.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(MR mr) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC1051Pl interfaceC1051Pl) {
        this.A02 = interfaceC1051Pl;
    }
}
