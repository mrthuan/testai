package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.bP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1406bP implements C2C {
    public static byte[] A05;
    public static String[] A06 = {"hwQkg6wydYZbPmHd9ra1rendlmZDH9o", "EZChF1CYxmcTUt5XULmCX0u1P", "cTSi58RkvxQZRZutX5Kpp639urCcNivT", "ILotitRaBN9o4fzRERLTj8sSXBTWlTTb", "JZvxvLc", "wZ48NZZ1KfL4Szkg73ZSFlGgbHtYLjcz", "R8pWvTFrbs0CFqCxyNRNjvJ5bjwX3", "qzEf3MAjBvJJtqQXUiJPrqpPaexFktRV"};
    public final AbstractC1425bi A00;
    public final AnonymousClass20 A01;
    public final AnonymousClass27 A02;
    public final C1405bO A03;
    public final C1314Zs A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{Field.CONTROL, 114, Field.AUTONUM, 121, 116, 124, 115, 117, 98, Field.AUTONUM, Byte.MAX_VALUE, 101, Field.AUTONUM, 120, 99, 122, 122, 3, 20, 15, 5, 13, 4, 30, 4, 25, 21, 19, 0, 18, 30, 10, 4, 24, Field.SECTION, Field.FILESIZE, Field.FORMTEXT, 114, 99, 110, 98, 105, 100, 98, Field.TOA, 98, 115, 112, 104, 117, 108, Field.GREETINGLINE, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, Field.NOTEREF, 82, Field.FILESIZE, Field.FILESIZE, Field.HYPERLINK, Field.FILESIZE, Field.NOTEREF, Field.ADVANCE, Field.HYPERLINK, Field.FORMDROPDOWN, 82, Field.NOTEREF, Field.BIDIOUTLINE, 82, 78, 96, 103, 125, 118, 123, Byte.MAX_VALUE, 118, Byte.MAX_VALUE, 96, 109, 108, 102, 118, 109, 124, 123, 104, 125, 96, 102, 103, 118, 98, 108, 112, Field.INCLUDEPICTURE, 64, Field.SECTION, Field.NOTEREF, 80, Field.FORMTEXT, Field.SECTION, Field.AUTOTEXTLIST, 78, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.MERGESEQ, 78, Field.HTMLCONTROL, Field.FORMTEXT, 64, Field.SECTION, 80, Field.HTMLCONTROL, Field.FORMTEXT, Field.SECTIONPAGES, 74, 80, Field.INCLUDETEXT, 74, 86, 34, 10, Field.NUMCHARS, Field.NUMCHARS, 14, 8, 10, Field.DOCPROPERTY, Field.AUTOTEXT, Byte.MAX_VALUE, Field.HTMLCONTROL, Field.SECTION, Field.SECTION, Field.HTMLCONTROL, Field.BIDIOUTLINE, Field.DOCPROPERTY, 18, 80, Field.FORMCHECKBOX, Field.BIDIOUTLINE, 86, Field.GREETINGLINE, Field.CONTROL, 18, Field.ADVANCE, Field.ADDRESSBLOCK, 64, 18, Field.SHAPE, Field.CONTROL, Field.SECTION, Field.SECTION, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.CONTROL, 9, Field.DDE, Field.IMPORT, Field.IMPORT, Field.DDE, 42, Field.QUOTE, 100, Field.ASK, Field.EQ, 42, 32, Field.DATA, 33, 100, 34, 43, Field.AUTONUM, 100, 41, 33, Field.IMPORT, Field.IMPORT, Field.PAGEREF, Field.QUOTE, 33, 106, Field.AUTONUM, Field.EQ, Field.IMPORT, 58, 32, Field.IMPORT, Field.IMPORT, 42, Field.IMPORT, 58, Field.DATA, 32, Field.AUTONUM, Field.AUTONUM, 36, 34, 32, 58, Field.DDEAUTO, 32, 60, 5, 20, 13};
    }

    static {
        A01();
    }

    public C1406bP(C1314Zs c1314Zs, C1405bO c1405bO, AnonymousClass20 anonymousClass20, AbstractC1425bi abstractC1425bi, AnonymousClass27 anonymousClass27) {
        this.A04 = c1314Zs;
        this.A03 = c1405bO;
        this.A01 = anonymousClass20;
        this.A00 = abstractC1425bi;
        this.A02 = anonymousClass27;
    }

    @Override // com.facebook.ads.redexgen.X.C2C
    public final Bundle A50(String str) {
        return C2J.A03(str, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.C2C
    public final void A5S() {
        this.A02.A0F(AdError.CACHE_ERROR_CODE, null);
        this.A02.A0C();
        this.A03.A02(null);
    }

    @Override // com.facebook.ads.redexgen.X.C2C
    public final int A7h() {
        return AdError.SERVER_ERROR_CODE;
    }

    @Override // com.facebook.ads.redexgen.X.C2C
    public final void A8u(Message message) {
        com.facebook.ads.Ad A6E = this.A03.A6E();
        String A00 = A00(203, 3, 38);
        if (A6E == null) {
            this.A04.A07().AA0(A00, C8E.A0K, new C8F(A00(0, 17, 84)));
            return;
        }
        int i10 = message.what;
        String A002 = A00(120, 9, 45);
        String A003 = A00(17, 17, 3);
        switch (i10) {
            case 10:
            case 2103:
                Bundle bundle = message.getData().getBundle(A003);
                if (bundle != null) {
                    int i11 = bundle.getInt(A00(51, 18, 85));
                    String string = bundle.getString(A00(ShapeTypes.CORNER_TABS, 21, 39));
                    AdError adError = new AdError(i11, string);
                    this.A01.AGQ(adError);
                    if (this.A03.A04 != null) {
                        this.A03.A04.onError(A6E, adError);
                    } else {
                        Log.e(A00(34, 17, 69), string);
                    }
                } else {
                    this.A01.AGM(EnumC04821z.A04);
                    String errorMessage = A002 + message;
                    this.A04.A07().AA0(A00, C8E.A0V, new C8F(A00(ShapeTypes.FLOW_CHART_MAGNETIC_DISK, 27, 6), errorMessage));
                }
                this.A03.A02(null);
                return;
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                this.A01.AGV();
                Bundle bundle2 = message.getData().getBundle(A003);
                if (bundle2 != null) {
                    this.A03.A01 = bundle2.getLong(A00(94, 26, 77));
                    this.A03.A00 = bundle2.getInt(A00(69, 25, 107));
                } else {
                    this.A04.A07().AA0(A00, C8E.A0V, new C8F(A00(129, 26, 112), A002 + message));
                }
                C1405bO c1405bO = this.A03;
                if (A06[0].length() == 31) {
                    A06[4] = "nZDiJI4iz";
                    c1405bO.A02(null);
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 2106:
                this.A03.A02(null);
                break;
            case 2110:
                this.A01.AGf();
                break;
        }
        if (this.A03.A04 == null) {
            return;
        }
        switch (message.what) {
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                C1405bO c1405bO2 = this.A03;
                if (A06[2].charAt(0) == 'F') {
                    c1405bO2.A04.onAdLoaded(A6E);
                    return;
                }
                A06[6] = "0IooEpc5XoMFwfovHEQu";
                c1405bO2.A04.onAdLoaded(A6E);
                return;
            case 2104:
                this.A03.A04.onAdClicked(A6E);
                return;
            case 2105:
                this.A03.A04.onLoggingImpression(A6E);
                return;
            case 2106:
                if (this.A03.A04 instanceof RewardedVideoAdExtendedListener) {
                    ((RewardedVideoAdExtendedListener) this.A03.A04).onRewardedVideoActivityDestroyed();
                    return;
                }
                return;
            case 2110:
                this.A03.A04.onRewardedVideoClosed();
                return;
            case 3000:
                this.A03.A04.onRewardedVideoCompleted();
                return;
            case AdError.MEDIATION_ERROR_CODE /* 3001 */:
                if (this.A03.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A03.A04).onRewardServerSuccess();
                    return;
                }
                return;
            case 3002:
                if (this.A03.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A03.A04).onRewardServerFailed();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
