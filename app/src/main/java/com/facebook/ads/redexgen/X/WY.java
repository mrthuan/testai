package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class WY implements J6 {
    public static byte[] A0D;
    public static String[] A0E = {"KlcQ4aPMCjTEuj6tlqvSPg02tmhmGUou", "NbdeitWOc1zrv1JDjauqKHmjPPhSGwGe", "R4vSD9xrU3uFkHfeeGcLq0xvgbIcHayT", "rvVAUvGslDbkwSzXQ4gHiQTP5zrG", "ljLEgEfbMYnmdR7mWy3vUvMk8HSCwfcz", "YjYM3cC5SO9DuryblpH9N9a8sNamrwLD", "dglxEHbBnsXp5lOZvNi9PFSn5QE5iyod", "nrMzKM4Ejqm74mRasA"};
    public static final String A0F;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final C1313Zr A06;
    public final J5 A07;
    public final InterfaceC1108Rq A08;
    public volatile boolean A0C;
    public final Runnable A0A = new C1221Wa(this);
    public final Runnable A09 = new WZ(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[2].charAt(25) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[3] = "STFGVVXWKW9SjLATYObI8PiLTu9r";
            strArr[7] = "1bj9PcPMGQWJpkILDx";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 77);
            i13++;
        }
    }

    public static void A07() {
        A0D = new byte[]{106, 121, 99, Field.ADVANCE, Field.HYPERLINK, 117, 111, 108, 125, 104, Byte.MAX_VALUE, 116, 117, 114, 123, 60, 121, 106, 121, 114, 104, 60, Field.AUTONUMOUT, 64, 125, 102, 96, 117, 113, 108, 106, 107, Field.PAGEREF, 114, 109, 108, 105, 96, Field.PAGEREF, 97, 108, 118, 117, 100, 113, 102, 109, 108, 107, 98, Field.PAGEREF, 96, 115, 96, 107, 113, 118, 43, Field.TOA, Byte.MAX_VALUE, 104, 108, Byte.MAX_VALUE, 104, 58, 106, 104, 117, 121, Byte.MAX_VALUE, 105, 105, Byte.MAX_VALUE, 126, 58, 106, 123, 104, 110, 115, 123, 118, 58, 120, 123, 110, 121, 114, Field.AUTONUM, 58, 121, 117, 116, 110, 115, 116, 111, 115, 116, 125, 58, 110, 117, 58, 116, Byte.MAX_VALUE, 98, 110, 58, 117, 116, Byte.MAX_VALUE, Field.AUTONUMOUT, Field.AUTOTEXTLIST, 111, 120, 124, 111, 120, 42, 120, 111, 121, 122, 101, 100, 121, 111, 42, 99, 121, 42, 111, 103, 122, 126, 115, 36, 0, Field.AUTONUM, 33, Field.PAGEREF, Field.AUTONUM, 33, 115, 33, Field.AUTONUM, Field.FILLIN, Field.ASK, 33, 61, Field.AUTONUM, Field.IMPORT, 115, Field.GOTOBUTTON, 115, 61, 60, 61, 126, 32, Field.ASK, 48, 48, Field.AUTONUM, 32, 32, Field.AUTONUMLGL, Field.ASK, Field.BARCODE, 115, 32, Field.FILLIN, Field.GOTOBUTTON, Field.FILLIN, Field.ASK, 32, 115, 48, 60, Field.IMPORT, Field.AUTONUM, 115, 60, Field.AUTONUMLGL, 115, Field.FORMTEXT, 112, 103, 99, 112, 103, Field.AUTONUMLGL, 98, 116, 102, Field.AUTONUMLGL, 96, 123, 116, 119, 121, 112, Field.AUTONUMLGL, 97, 122, Field.AUTONUMLGL, 101, 103, 122, 118, 112, 102, 102, Field.AUTONUMLGL, 116, 121, 121, Field.AUTONUMLGL, 112, 99, 112, 123, 97, 102, Field.SYMBOL, Field.AUTONUMLGL, 97, 103, 108, 124, 123, 114, Field.AUTONUMLGL, 116, 114, 116, 124, 123, 59, Field.SYMBOL, 1, 3, 26, 26, 3, 4, 13, 74, 14, 3, 25, 26, 11, 30, 9, 2, 74, 14, 31, 15, 74, 30, 5, 74, 6, 11, 9, 1, 74, 5, 12, 74, 9, 5, 4, 4, 15, 9, 30, 3, Field.NUMCHARS, 3, 30, 19, Field.INCLUDETEXT, 74, Field.SHAPE, Field.SHAPE, 78, Field.FORMTEXT, Field.HTMLCONTROL, Field.SHAPE, Field.ADDRESSBLOCK, Field.ADDIN, 80, 80, Field.HTMLCONTROL, Field.ADDRESSBLOCK, 74, Field.CONTROL, Field.NOTEREF, Field.CONTROL, 74, Field.FORMCHECKBOX, 32, Field.PAGEREF, 48, Field.PAGEREF, 3, 16, 3, 8, 18, 21, 59, 42, Field.GOTOBUTTON, Field.FILLIN, 36, 42, Field.GLOSSARY};
    }

    static {
        A07();
        A0F = J6.class.getSimpleName();
    }

    public WY(C1313Zr c1313Zr, J5 j52) {
        this.A07 = j52;
        this.A06 = c1313Zr;
        this.A04 = (ConnectivityManager) c1313Zr.getSystemService(A03(293, 12, 115));
        this.A08 = S8.A01(c1313Zr);
        this.A03 = Io.A0K(c1313Zr);
        this.A02 = Io.A0J(c1313Zr);
    }

    public static /* synthetic */ int A00(WY wy) {
        int i10 = wy.A00 + 1;
        wy.A00 = i10;
        return i10;
    }

    private void A05() {
        this.A06.A04().A9O();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.AB8();
        }
    }

    private void A06() {
        if (this.A00 >= Io.A09(this.A06)) {
            A05();
            A5X();
            return;
        }
        int i10 = this.A00;
        if (A0E[4].charAt(15) == 'm') {
            String[] strArr = A0E;
            strArr[0] = "48XWu56AgSaDG2v80CTGd4cBK4h9Z0cs";
            strArr[1] = "AYX5vj0PphgSAPbgEesjNh2Dg1h2Tuc1";
            if (i10 == 1) {
                this.A01 = Io.A0I(this.A06);
            } else {
                long j10 = this.A01 * 2;
                String[] strArr2 = A0E;
                if (strArr2[5].charAt(19) == strArr2[6].charAt(19)) {
                    String[] strArr3 = A0E;
                    strArr3[0] = "1ToF3hMm2VA6KDOeCYlfpYX9EZhWZaCs";
                    strArr3[1] = "Z30ky6DQTC9ucfzgiQKOMI68k5hVrHHu";
                    this.A01 = j10;
                }
            }
            A5Y();
            return;
        }
        throw new RuntimeException();
    }

    private void A08(long j10) {
        this.A05.postDelayed(this.A09, j10);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        Map<String, String> shortEvnData = this.A06.A03().A59();
        for (Map.Entry<String, String> entry : shortEvnData.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    public final void A0B() {
        JSONArray jSONArray;
        try {
            NetworkInfo activeNetwork = this.A04.getActiveNetworkInfo();
            if (activeNetwork == null || !activeNetwork.isConnectedOrConnecting()) {
                if (this.A06.A04().A9O()) {
                    Log.e(A0F, A03(240, 46, 39));
                }
                A08(this.A02);
                return;
            }
            this.A06.A04().A9O();
            JSONObject A4w = this.A07.A4w();
            if (A4w == null) {
                this.A06.A04().A9O();
                A05();
                return;
            }
            boolean A9O = this.A06.A04().A9O();
            String A03 = A03(309, 6, 43);
            if (A9O && A4w.has(A03)) {
                for (int i10 = 0; i10 < A4w.getJSONArray(A03).length(); i10++) {
                    String str = A03(4, 19, 81) + i10 + A03(0, 3, 14) + jSONArray.get(i10);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(286, 7, 102), String.valueOf(this.A00));
            A09(jSONObject);
            A4w.put(A03(305, 4, 9), jSONObject);
            S4 s4 = new S4();
            s4.put(A03(315, 7, 6), A4w.toString());
            InterfaceC1107Rp AES = this.A08.AES(this.A06.A04().A7R(), s4.A08());
            String A6X = AES != null ? AES.A6X() : null;
            if (!TextUtils.isEmpty(A6X) && AES != null) {
                if (AES.A8R() != 200) {
                    if (this.A06.A04().A9O()) {
                        String responseBody = A0F;
                        Log.e(responseBody, A03(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, 48, 30) + AES.A8R() + A03(3, 1, 55));
                    }
                    if (AES.A8R() == 413 && C0877Im.A2M(this.A06)) {
                        this.A07.ADH();
                        A05();
                        return;
                    }
                    if (A4w.has(A03)) {
                        this.A07.ABj(A4w.getJSONArray(A03));
                    }
                    A06();
                    return;
                } else if (!this.A07.ABk(new JSONArray(A6X))) {
                    if (this.A06.A04().A9O()) {
                        Log.w(A0F, A03(ShapeTypes.CHART_STAR, 54, 88));
                    }
                    A06();
                    return;
                } else if (this.A07.A9Z()) {
                    if (this.A06.A04().A9O()) {
                        Log.i(A0F, A03(58, 55, 87));
                    }
                    A06();
                    return;
                } else {
                    A05();
                    return;
                }
            }
            if (this.A06.A04().A9O()) {
                Log.e(A0F, A03(113, 25, 71));
            }
            if (C0877Im.A2C(this.A06) && A4w.has(A03)) {
                this.A07.ABj(A4w.getJSONArray(A03));
            }
            A06();
        } catch (Exception e10) {
            C1313Zr c1313Zr = this.A06;
            String[] strArr = A0E;
            if (strArr[0].charAt(26) != strArr[1].charAt(26)) {
                Exception e11 = new RuntimeException();
                throw e11;
            }
            String[] strArr2 = A0E;
            strArr2[5] = "juVm3rSGrTKw83uGBob9EWWg86xlgGIp";
            strArr2[6] = "uyuZsDIDSXItwx867Sl9CxjwWd0LLO11";
            if (c1313Zr.A04().A9O()) {
                Log.e(A0F, A03(23, 35, 72), e10);
            }
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.J6
    public final void A5X() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.J6
    public final void A5Y() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}
