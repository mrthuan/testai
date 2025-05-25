package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.UUID;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Bu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0720Bu extends T7 {
    public static byte[] A0F;
    public static String[] A0G = {"Cb7nBOTqt", "Uv90YERdy9SZ9btNePue9j4WSufKww0d", "5tFdsnJl1aHC8QazlewrqKxrXvRcdsO5", "4XUHzfDXngka", "6zmG8GCKaenNI", "iTvfTfiU680tAW5ZUJpNe0fUcB62AaOp", "iIjhxtVkNHrsB", "9VdyyBhNHsky"};
    public static final String A0H;
    public Uri A00;
    public NativeAd A01;
    public J7 A02;
    public InterfaceC0966Me A03;
    public TC A04;
    public C9S A05;
    public String A06;
    public String A07;
    public String A08;
    public final AnonymousClass19 A09;
    public final C1314Zs A0A;
    public final AbstractC1127Sj A0B;
    public final AbstractC1121Sd A0C;
    public final AbstractC1105Rn A0D;
    public final String A0E;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A0G[0].length() == 17) {
                throw new RuntimeException();
            }
            A0G[2] = "GV7dEmS9dQikFIsLGq03TvmmBp0PGqms";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{32, 2, 13, Field.INCLUDETEXT, 23, Field.INCLUDEPICTURE, 16, 23, 2, 17, 23, Field.INCLUDEPICTURE, 34, 22, 7, 10, 6, 13, 0, 6, Field.DDE, 6, 23, 20, 12, 17, 8, 34, 0, 23, 10, 21, 10, 23, 26, 77, Field.INCLUDEPICTURE, Field.DDEAUTO, 2, 8, 6, Field.INCLUDEPICTURE, 16, 22, 17, 6, Field.INCLUDEPICTURE, 23, 11, 2, 23, Field.INCLUDEPICTURE, 10, 23, Field.INCLUDETEXT, 16, Field.INCLUDEPICTURE, 10, 13, Field.INCLUDEPICTURE, 26, 12, 22, 17, Field.INCLUDEPICTURE, 34, 13, 7, 17, 12, 10, 7, Field.DDEAUTO, 2, 13, 10, 5, 6, 16, 23, 77, Field.NUMWORDS, 14, 15, Field.INCLUDEPICTURE, 5, 10, 15, 6, 77, 29, 42, 42, Field.IMPORT, 42, 98, 120, Field.QUOTE, Field.FILLIN, 36, 16, 1, 12, 0, 11, 6, 0, 43, 0, 17, 18, 10, 23, 14, 21, Field.DDE, 43, 44, 120, 43, 61, 44, Field.NUMWORDS, Field.AUTONUMOUT, Field.EQ, 61, Field.AUTONUM, 44, 12, Field.IMPORT, Field.MACROBUTTON, 61, Field.AUTONUM, 120, Field.USERADDRESS, Field.EQ, 42, 43, 44, 3, 59, 61, 58, 110, 61, 43, 58, 24, Field.FILLIN, 42, 43, 33, Field.NUMWORDS, Field.NUMCHARS, 7, 110, 33, 60, 110, 61, 43, 58, 24, Field.FILLIN, 42, 43, 33, 3, 30, 10, 110, Field.DATA, Field.FILLIN, 60, 61, 58, 30, 17, 32, 30, Field.NUMCHARS, 11, 22, 9, 22, 11, 6, Field.MACROBUTTON, 60, Field.SYMBOL, Field.AUTONUMLGL, Field.USERADDRESS, 36, 4, Field.BARCODE, 59, Field.AUTONUMLGL, Field.USERADDRESS, Field.USERADDRESS, Field.GLOSSARY, 60, 61, Field.FILLIN, 32, 41, 23, 21, 2, 3, 2, 1, 14, 9, 2, 3, Field.DATA, 21, 14, 2, 9, 19, 6, 19, 14, 8, 9, 44, 2, 30, 86, 77, 74, 82, 86, Field.FORMTEXT, 106, Field.FORMCHECKBOX, 42, 44, 58, 17, Field.USERADDRESS, 43, Field.AUTONUM, 41, 58, Field.NUMCHARS, 43, Field.USERADDRESS, 29, 42, 43, 43, 48, Field.EQ, 117, 106, 103, 102, 108, Field.AUTOTEXT, 108, 100, 100, 102, 113, Field.DOCPROPERTY, 74, Field.FORMCHECKBOX, Field.FORMTEXT, 76, 110, 115, 103, Field.SECTIONPAGES, Field.ADDRESSBLOCK, 80, Field.ADDIN, Field.HTMLCONTROL, 103, Field.ADDIN, Field.ADDIN, Field.SHAPE, 96, Field.ADDRESSBLOCK, Field.AUTOTEXTLIST, Field.ADDIN, 99, 124, 113, 112, 122, 64, Field.FORMCHECKBOX, Field.AUTOTEXTLIST, 17, 14, 3, 2, 8, 56, 19, 14, 10, 2, 56, 23, 8, 11, 11, 14, 9, 0, 56, 14, 9, 19, 2, 21, 17, 6, 11, 19, 12, 0, 18, Field.EQ, Field.NUMCHARS, 21, 0};
    }

    static {
        A03();
        A0H = C0720Bu.class.getSimpleName();
    }

    public C0720Bu(C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new CA(this);
        this.A0C = new C0722Bw(this);
        this.A0B = new C0721Bv(this);
        this.A09 = new AnonymousClass19(this, c1314Zs);
        this.A0A = c1314Zs;
        A02();
    }

    public C0720Bu(C1314Zs c1314Zs, AttributeSet attributeSet) {
        super(c1314Zs, attributeSet);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new CA(this);
        this.A0C = new C0722Bw(this);
        this.A0B = new C0721Bv(this);
        this.A09 = new AnonymousClass19(this, c1314Zs);
        this.A0A = c1314Zs;
        A02();
    }

    public C0720Bu(C1314Zs c1314Zs, AttributeSet attributeSet, int i10) {
        super(c1314Zs, attributeSet, i10);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new CA(this);
        this.A0C = new C0722Bw(this);
        this.A0B = new C0721Bv(this);
        this.A09 = new AnonymousClass19(this, c1314Zs);
        this.A0A = c1314Zs;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 92));
        } else if (this.A00 == null && this.A08 == null) {
            A05(A01(ShapeTypes.FLOW_CHART_TERMINATOR, 37, 74));
            String[] strArr = A0G;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "rwc2";
        } else {
            intent.putExtra(A01(237, 18, 91), this.A07);
            intent.putExtra(A01(322, 8, 97), KG.A09);
            intent.putExtra(A01(287, 8, 17), this.A00.toString());
            intent.putExtra(A01(ShapeTypes.CHART_PLUS, 11, 84), this.A06 == null ? A01(0, 0, 6) : this.A06);
            intent.putExtra(A01(266, 8, 39), this.A08);
            intent.putExtra(A01(205, 24, 99), LP.A00(this.A0A));
            intent.putExtra(A01(274, 13, 48), getCurrentPositionInMillis());
            String[] strArr2 = A0G;
            if (strArr2[7].length() != strArr2[3].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "bFTSk0Gp6QusC65PcsD";
            intent.putExtra(A01(229, 8, 39), this.A0E);
            intent.putExtra(A01(FunctionEval.FunctionID.EXTERNAL_FUNC, 11, 7), this.A05.A0b());
            intent.putExtra(A01(295, 27, 99), getVideoProgressReportIntervalMs());
            intent.addFlags(268435456);
        }
    }

    private void A05(String str) {
        this.A0A.A07().AA0(A01(198, 7, 74), C8E.A28, new C8F(AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(90, 7, 92) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0H, str);
        }
    }

    public final void A0n() {
        if (this.A01 != null) {
            this.A01.onCtaBroadcast();
        }
    }

    public final void A0o() {
        AdActivityIntent A04 = C0928Kq.A04(this.A0A);
        A04(A04);
        try {
            A0e(false, 6);
            setVisibility(8);
            C0928Kq.A0A(this.A0A, A04);
        } catch (Exception e10) {
            this.A0A.A07().AA0(A01(ShapeTypes.MATH_PLUS, 11, 123), C8E.A0D, new C8F(e10));
            Log.e(A01(97, 17, 97), A01(0, 90, 103), e10);
        }
    }

    public InterfaceC0966Me getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.T7, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.X.T7, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(J7 j72) {
        this.A02 = j72;
    }

    public void setClientToken(String str) {
        C9S c9s;
        if (this.A04 != null) {
            TC tc2 = this.A04;
            String[] strArr = A0G;
            if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[2] = "geldSN57Uojbab2WOS9MzcIW4E8sQ4xA";
            tc2.A05();
        }
        if (this.A05 != null) {
            this.A05.A0o();
        }
        this.A06 = str;
        TC tc3 = null;
        if (str != null) {
            c9s = new C9S(this.A0A, this.A02, this, str);
        } else {
            c9s = null;
        }
        this.A05 = c9s;
        if (this.A05 != null && C0877Im.A1q(this.A0A)) {
            if (str != null) {
                tc3 = new TC(this.A0A, this.A02, this, str, this.A05, null);
            }
            this.A04 = tc3;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z10) {
        super.A0D.setBackgroundPlaybackEnabled(z10);
    }

    public void setListener(InterfaceC0966Me interfaceC0966Me) {
        this.A03 = interfaceC0966Me;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(String str) {
        this.A07 = str;
    }

    @Override // com.facebook.ads.redexgen.X.T7
    public void setVideoMPD(String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A08 = str;
        String[] strArr = A0G;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[4] = "ao7Mn74HmNnh4";
        strArr2[6] = "E6rOC8IWnX5Ja";
        super.setVideoMPD(str);
    }

    @Override // com.facebook.ads.redexgen.X.T7
    public void setVideoURI(Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A00 = uri;
        super.setVideoURI(uri);
        String[] strArr = A0G;
        if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        A0G[0] = "z2OQUaNXEwktMvnJ8h1OzGBt0";
    }
}
