package com.facebook.ads.redexgen.X;

import java.io.IOException;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Yd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1273Yd implements CH {
    public static String[] A01 = {"fkpDs3QrEIUPB2JazraUrlgdIiJXkDMl", "", "3HlyBddE8XVn9YWwOLwH4VSFJFUcfjL0", "3K9dx3znN2rHUAZqPmMaGO8Kk3HVHL", "ARHsMRyctUah9fFmcWsHvoxDV4Rlay", "5EW0ieNDx7VK4pqGb6z6bT1osScjQsM9", "btk6csKYz9h0JxqDm", "WpS6SBH9FSKJVaJoG3rUFILpStpx8zmr"};
    public final /* synthetic */ C1272Yc A00;

    public C1273Yd(C1272Yc c1272Yc) {
        this.A00 = c1272Yc;
    }

    public /* synthetic */ C1273Yd(C1272Yc c1272Yc, C1274Ye c1274Ye) {
        this(c1272Yc);
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final void A4O(int i10, int i11, InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        this.A00.A0K(i10, i11, interfaceC0724By);
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final void A5t(int i10) throws A0 {
        this.A00.A0I(i10);
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final void A65(int i10, double d10) throws A0 {
        this.A00.A0J(i10, d10);
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final int A7G(int i10) {
        switch (i10) {
            case ShapeTypes.PLUS /* 131 */:
            case ShapeTypes.FLOW_CHART_INTERNAL_STORAGE /* 136 */:
            case ShapeTypes.FLOW_CHART_MAGNETIC_DISK /* 155 */:
            case ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS /* 159 */:
            case ShapeTypes.MATH_PLUS /* 176 */:
            case ShapeTypes.MATH_DIVIDE /* 179 */:
            case ShapeTypes.CHART_STAR /* 186 */:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                if (A01[2].charAt(31) != '0') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "hOx4RvbcQ4rmRQD7lsU8LCRsUvEPJOMI";
                strArr[5] = "NE0o9u3qbPEpEKxTGS4cMUcBICbCHbMr";
                return 2;
            case ShapeTypes.FLOW_CHART_INPUT_OUTPUT /* 134 */:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case ShapeTypes.GEAR_9 /* 174 */:
            case ShapeTypes.SQUARE_TABS /* 183 */:
            case ShapeTypes.CHART_PLUS /* 187 */:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case ShapeTypes.ACTION_BUTTON_BLANK /* 161 */:
            case ShapeTypes.ACTION_BUTTON_HELP /* 163 */:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case ShapeTypes.MATH_NOT_EQUAL /* 181 */:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final void A9I(int i10, long j10) throws A0 {
        this.A00.A0L(i10, j10);
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final boolean A9V(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final void AGv(int i10, long j10, long j11) throws A0 {
        this.A00.A0M(i10, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final void AH4(int i10, String str) throws A0 {
        this.A00.A0N(i10, str);
    }
}
