package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1437bu implements K8 {
    public static byte[] A0D;
    public static String[] A0E = {"mx9sJqsz4sgJcdPgoYbgRIW9VnwzqRx6", "rFbyGWP2Ub8PQhtH", "vlmOFoI5eqS6Nw0ENJhYNh6o4BRmenqE", "", "JTMxf3amnDxIP84vbXSIdB2jgXN5bQ", "LkG9NIMCA2H26FKF", "xLNm9V1ZNmyFYJ5qhdZubuzSePd6Iimu", "7SoM7bEoo8CKfR8pxc6QG8O9JCd0xBEh"};
    public static final Handler A0F;
    public static final C04510u A0G = null;
    public static final K9 A0H = null;
    public static final String A0I;
    public InterfaceC04460p A00;
    public InterfaceC04460p A01;
    public C8W A04;
    public K6 A05;
    public K9 A06;
    public AbstractC04470q A07;
    public final C04761t A08;
    public final J7 A09;
    public final C04510u A0A;
    public final C1314Zs A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{-58, -23, -26, -11, -7, -22, -9, -91, -23, -12, -22, -8, -91, -13, -12, -7, -91, -22, -3, -18, -8, -7, -14, 21, 18, 33, Field.PAGEREF, 22, Field.QUOTE, -47, 26, 36, -47, 31, Field.ASK, 29, 29, -47, -39, 20, 25, 18, 26, 31, -47, 31, 32, Field.PAGEREF, -47, 29, 32, 18, 21, 22, 21, -38, -56, -21, -24, -9, -5, -20, -7, -89, -16, -6, -89, -11, -4, -13, -13, -89, -81, -22, -17, -24, -16, -11, -20, -21, -80, -91, -56, -59, -44, -40, -55, -42, -124, -51, -41, -124, -46, -39, -48, -48, -124, -116, -46, -45, -124, -57, -52, -59, -51, -46, -115, 6, 41, Field.ASK, Field.AUTONUMLGL, Field.SYMBOL, 42, Field.IMPORT, -27, Field.DDEAUTO, 56, -27, Field.MACROBUTTON, 58, Field.EQ, Field.EQ, -27, Field.AUTONUMOUT, Field.MACROBUTTON, -27, 56, Field.SYMBOL, Field.ASK, Field.IMPORT, Field.SYMBOL, 6, 41, -21, 12, -67, 10, 12, 15, 2, -67, -2, 1, -67, 0, -2, 11, 1, 6, 1, -2, 17, 2, 16, -53, -50, -23, -26, -27, -34, -105, -40, -37, -40, -25, -21, -36, -23, -105, -21, -16, -25, -36, -91, Field.BARCODE, Field.SECTIONPAGES, -2, Field.BARCODE, 74, 80, Field.INCLUDEPICTURE, Field.BARCODE, Field.SECTIONPAGES, Field.CONTROL, -2, Field.ADDIN, 82, Field.BARCODE, 80, 82, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.GLOSSARY, Field.GOTOBUTTON, Field.SECTION, -51, -36, -43, Field.USERADDRESS, Field.INCLUDEPICTURE, 60, Field.INCLUDETEXT, Field.TOA, 58, Field.MERGESEQ, 60, 77, 60, Field.NOTEREF, 78, -50, -33, -29, -32, -13, -32, -50, -31, -23, -28, -30, -13, -97, -24, -14, -97, -19, -12, -21, -21, 19, Field.NUMCHARS, 17, 32, Field.FILLIN, 30, 34, 19, 18, 13, 23, 18, 60, Field.FILESIZE, 77, 64, Field.TOA, Field.FORMTEXT, Field.FILESIZE, Field.INCLUDETEXT, 60, Field.FILESIZE, Field.MERGESEQ, -9, 64, 74, -9, 60, Field.INCLUDETEXT, Field.FORMCHECKBOX, Field.MERGESEQ, 80, Field.MACROBUTTON, Field.SYMBOL, Field.DDEAUTO, 64, Field.AUTONUMLGL, 44, 48, 60, 59, Field.MACROBUTTON, Field.AUTONUM, Field.AUTONUMOUT, 21, 33, 20, 32, 36, 20, 29, 18, Field.DATA, 14, 18, 16, 31, 31, 24, 29, 22, -3, 2, 10, -11, 0, -3, -8, -76, 4, 0, -11, -9, -7, 1, -7, 2, 8, -76, -3, 2, -76, 6, -7, 7, 4, 3, 2, 7, -7, 36, Field.FILLIN, 25, Field.NUMCHARS, 23, 44, 33, Field.PAGEREF, 29, 23, Field.PAGEREF, 43, 17, 4, 16, 20, 4, 18, 19, -2, 8, 3, 10, 5, -7, -10, 9, -6, -12, 9, -2, 2, -6, 8, 9, -10, 2, 5};
    }

    public abstract void A0O();

    public abstract void A0Q(InterfaceC04460p interfaceC04460p, C8W c8w, C8U c8u, C04771u c04771u);

    static {
        A08();
        M5.A02();
        A0I = AbstractC1437bu.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC1437bu(C1314Zs c1314Zs, C04761t c04761t) {
        this.A0B = c1314Zs;
        this.A08 = c04761t;
        if (A0H != null) {
            this.A06 = A0H;
        } else {
            this.A06 = new K9(this.A0B);
        }
        this.A06.A0Q(this);
        if (A0G != null) {
            this.A0A = A0G;
        } else {
            this.A0A = new C04510u();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A09 = c1314Zs.A09();
        this.A0B.A0E().A5D();
    }

    private void A09(C8W c8w) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(this.A0B);
        if (c8w.A0C() != null) {
            sharedPreferences.edit().putString(A07(262, 12, 110), c8w.A0C()).putLong(A07(342, 16, 54), System.currentTimeMillis()).apply();
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    private void A0A(Vu vu) {
        C8W placement = vu.A00();
        if (placement == null || placement.A05() == null) {
            String A07 = A07(291, 29, 53);
            C0894Jg error = new C0894Jg(AdErrorType.NO_AD_PLACEMENT, A07);
            this.A0B.A0E().A5F(error.A03().getErrorCode(), A07);
            if (this.A07 != null) {
                this.A07.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C8W c8w = this.A04;
        JSONObject A0E2 = c8w.A0E();
        String A072 = A07(195, 3, 13);
        if (A0E2 == null) {
            C8U A04 = c8w.A04();
            if (!A0E(c8w, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().AA0(A072, C8E.A0a, new C8F(A07(81, 26, 5), A04.A02()));
                ABs(C0894Jg.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            A0Q(this.A00, c8w, A04, new C04771u(A04.A04(), c8w.A05(), this.A08.A0A, c8w.A05().A0C()));
        } else {
            ArrayList<C8U> arrayList = new ArrayList();
            C8U A042 = c8w.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0E(c8w, A042)) {
                        arrayList.add(A042);
                    } else {
                        return;
                    }
                } else if (A0D(A042)) {
                    arrayList.add(A042);
                }
                A042 = c8w.A04();
            } while (A042 != null);
            InterfaceC04460p interfaceC04460p = this.A00;
            String[] strArr = A0E;
            if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
                throw new RuntimeException();
            }
            A0E[2] = "ioxWOihgwDfBac41kTr6w1CF9LpRHapv";
            if (interfaceC04460p == null) {
                this.A0B.A07().AA0(A072, C8E.A0a, new C8F(A07(56, 25, 40), ((C8U) arrayList.get(0)).A02()));
                ABs(C0894Jg.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z10 = false;
            try {
                if (arrayList.size() > 1 && this.A00 != null && this.A00.AH5()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    for (C8U c8u : arrayList) {
                        jSONArray.put(c8u.A04());
                    }
                    jSONObject.put(A07(192, 3, 111), jSONArray);
                    jSONObject.put(A07(198, 12, 124), c8w.A0E());
                    A0Q(this.A00, c8w, A042, new C04771u(jSONObject, c8w.A05(), this.A08.A0A, c8w.A05().A0C()));
                    z10 = true;
                }
            } catch (Exception unused) {
                z10 = false;
            }
            if (!z10) {
                if (arrayList.isEmpty()) {
                    C0894Jg A01 = C0894Jg.A01(AdErrorType.NO_FILL, A07(0, 0, 103));
                    this.A0B.A0E().A5F(A01.A03().getErrorCode(), A07(ShapeTypes.FLOW_CHART_DECISION, 22, 62));
                    if (this.A07 != null) {
                        this.A07.A0G(A01);
                        return;
                    }
                    return;
                } else if (this.A00 == null) {
                    this.A0B.A07().AA0(A072, C8E.A0a, new C8F(A07(22, 34, 82), ((C8U) arrayList.get(0)).A02()));
                    ABs(C0894Jg.A00(AdErrorType.INTERNAL_ERROR));
                    return;
                } else {
                    C8U c8u2 = (C8U) arrayList.get(0);
                    A0Q(this.A00, c8w, c8u2, new C04771u(c8u2.A04(), c8w.A05(), this.A08.A0A, c8w.A05().A0C()));
                }
            }
        }
        A09(placement);
    }

    private final void A0B(String str, AdExperienceType adExperienceType) {
        this.A0B.A0E().A5G(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            ABs(new C0894Jg(AdErrorType.API_NOT_SUPPORTED, A07(0, 0, 103)));
            return;
        }
        try {
            C0903Jq bidPayload = new C0903Jq(this.A0B, str, this.A08.A0A, this.A08.A09);
            this.A05 = this.A08.A00(this.A0B, bidPayload, adExperienceType);
            if (this.A06 != null) {
                this.A06.A0P(this.A05);
            }
        } catch (C0895Jh e10) {
            ABs(C0894Jg.A02(e10));
        }
    }

    private void A0C(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 79));
            C04530w.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0D(C8U c8u) {
        return (c8u == null || c8u.A04() == null) ? false : true;
    }

    private boolean A0E(C8W c8w, C8U c8u) {
        String A07 = A07(0, 0, 103);
        if (c8u == null) {
            C0894Jg A01 = C0894Jg.A01(AdErrorType.NO_FILL, A07);
            this.A0B.A0E().A5F(A01.A03().getErrorCode(), A07(ShapeTypes.FLOW_CHART_DECISION, 22, 62));
            if (this.A07 != null) {
                this.A07.A0G(A01);
            }
            return false;
        }
        String A02 = c8u.A02();
        InterfaceC04460p A00 = this.A0A.A00(this.A0B, c8w.A05().A0D());
        if (A00 == null) {
            this.A0B.A07().AA0(A07(195, 3, 13), C8E.A0a, new C8F(A07(0, 22, 38), A02));
            ABs(C0894Jg.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        } else if (!this.A08.A01().contains(A00.A82())) {
            C0894Jg A012 = C0894Jg.A01(AdErrorType.INTERNAL_ERROR, A07);
            this.A0B.A0E().A5F(A012.A03().getErrorCode(), A07(ShapeTypes.FLOW_CHART_MAGNETIC_DISK, 19, 24));
            if (this.A07 != null) {
                AbstractC04470q abstractC04470q = this.A07;
                if (A0E[0].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[7] = "XDVsCbJ3K5v8dlUMGtS0uKtjThdAM1fs";
                strArr[6] = "AXbWkB0jI9efrJtSTWvCCcVR8Wd1ee9G";
                abstractC04470q.A0G(A012);
            }
            return false;
        } else {
            this.A00 = A00;
            JSONObject A04 = c8u.A04();
            if (A04 != null) {
                String optString = A04.optString(A07(332, 10, 64));
                this.A0B.A0E().AGd(optString);
                this.A0B.A0C(optString);
                C1313Zr A002 = AbstractC06137i.A00();
                if (A002 != null) {
                    A002.A0C(optString);
                }
                JSONObject dataObject = A04.optJSONObject(A07(274, 17, 80));
                A0C(dataObject);
                if (this.A05 == null) {
                    String A072 = A07(242, 20, 120);
                    C0894Jg A013 = C0894Jg.A01(AdErrorType.UNKNOWN_ERROR, A072);
                    this.A0B.A0E().A5F(A013.A03().getErrorCode(), A072);
                    if (this.A07 != null) {
                        this.A07.A0G(A013);
                    }
                    return false;
                }
                return true;
            }
            String A073 = A07(212, 18, 32);
            C0894Jg A014 = C0894Jg.A01(AdErrorType.UNKNOWN_ERROR, A073);
            this.A0B.A0E().A5F(A014.A03().getErrorCode(), A073);
            if (this.A07 != null) {
                this.A07.A0G(A014);
            }
            return false;
        }
    }

    public final long A0F() {
        if (this.A04 != null) {
            return this.A04.A03();
        }
        String[] strArr = A0E;
        if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A0E[2] = "cOTrI9DB0oxjTyLR1voyMrEgWVbVphTL";
        return -1L;
    }

    public final Handler A0G() {
        return A0F;
    }

    public C1E A0H() {
        if (this.A01 != null) {
            InterfaceC04460p interfaceC04460p = this.A01;
            if (A0E[2].charAt(15) != 'D') {
                A0E[0] = "oRXWb94touLPnP0lmqQIoCQNN81QkmVq";
                return ((AbstractC1460cH) interfaceC04460p).A0H();
            }
            return ((AbstractC1460cH) interfaceC04460p).A0H();
        }
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[4].length()) {
            String[] strArr2 = A0E;
            strArr2[7] = "c4mFc8cvcfHQyghvzrB7bYP2aMdrhGND";
            strArr2[6] = "OOjdStzIF6ducmayoMT1WxOsFGdjLtMG";
            return null;
        }
        throw new RuntimeException();
    }

    public final C8X A0I() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A05();
    }

    public final void A0J() {
        if (!C0877Im.A1l(this.A0B)) {
            return;
        }
        InterfaceC04460p interfaceC04460p = this.A01;
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "";
        strArr2[4] = "YS2d1pFjROLoYd3yH38ADYRoaACmCS";
        if (interfaceC04460p != null) {
            C0920Kh.A00(this.A0B).A0D(this.A01.A82().toString(), this.A01.A6r());
        }
        if (this.A06 != null) {
            this.A06.A0Q(null);
            this.A06 = null;
        }
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0K() {
        String A6r;
        this.A0B.A0E().A3C(C0956Lu.A01(this.A03));
        if (this.A01 == null || (A6r = this.A01.A6r()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A04 = C0956Lu.A04(this.A03);
        String clientToken = A07(320, 12, 89);
        hashMap.put(clientToken, A04);
        new JF(A6r, this.A09).A04(JE.A08, hashMap);
    }

    public final void A0L() {
        InterfaceC04460p interfaceC04460p = this.A01;
        String A07 = A07(195, 3, 13);
        if (interfaceC04460p == null) {
            String A072 = A07(107, 26, 102);
            this.A0B.A07().AA0(A07, C8E.A0Q, new C8F(A072));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A5F(adErrorType.getErrorCode(), A072);
            if (this.A07 != null) {
                AbstractC04470q abstractC04470q = this.A07;
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC04470q.A0G(C0894Jg.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A5I();
        } else if (this.A0C) {
            String A073 = A07(ShapeTypes.GEAR_9, 18, ShapeTypes.VERTICAL_SCROLL);
            this.A0B.A07().AA0(A07, C8E.A0M, new C8F(A073));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A5F(adErrorType2.getErrorCode(), A073);
            if (this.A07 != null) {
                AbstractC04470q abstractC04470q2 = this.A07;
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC04470q2.A0G(C0894Jg.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A5H();
        } else {
            if (!TextUtils.isEmpty(this.A01.A6r())) {
                this.A09.AAT(this.A01.A6r());
            }
            this.A0B.A0E().A5J();
            this.A0C = true;
            A0O();
        }
    }

    public final void A0M() {
        A0X(false);
    }

    public final void A0N() {
        if (this.A02 != null) {
            C04530w.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0P(InterfaceC04460p interfaceC04460p) {
        if (interfaceC04460p != null) {
            interfaceC04460p.onDestroy();
        }
    }

    public final void A0R(AbstractC04470q abstractC04470q) {
        this.A07 = abstractC04470q;
    }

    public final void A0S(C04771u c04771u) {
        A0U(c04771u.A03().optString(A07(210, 2, 12)));
    }

    public void A0T(String str) {
        A0B(str, null);
    }

    public final void A0U(String str) {
        this.A0B.A0E().A5C();
        if (!TextUtils.isEmpty(str)) {
            new JF(str, this.A09).A04(JE.A04, null);
        }
    }

    public final void A0V(String str) {
        A0T(str);
    }

    public final void A0W(String str, AdExperienceType adExperienceType) {
        A0B(str, adExperienceType);
    }

    public void A0X(boolean z10) {
        if (!z10 && !this.A0C) {
            return;
        }
        this.A0B.A0E().A5K();
        A0P(this.A01);
        this.A0C = false;
    }

    public final boolean A0Y() {
        return this.A04 == null || this.A04.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final synchronized void ABs(C0894Jg c0894Jg) {
        A0G().post(new C1438bv(this, c0894Jg));
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final synchronized void ADj(Vu vu) {
        try {
            A0A(vu);
        } catch (Exception e10) {
            this.A0B.A07().AA0(A07(195, 3, 13), C8E.A0T, new C8F(e10));
        }
    }
}
