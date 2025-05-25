package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Zd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1299Zd extends KY {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ AudienceNetworkAds.InitResult A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Field.ADDIN, 3, Field.BIDIOUTLINE, Field.ADDIN, 80, 80, 1, Field.ADVANCE, 16, 7, 8, 99, 42, Field.DDE, 42, Field.IMPORT, 42, 34, Field.GLOSSARY, 42, Field.SYMBOL, 34, Field.IMPORT, 42, 44, Field.DDE, 99, 32, 44, Field.DDEAUTO, Field.MACROBUTTON, Field.GLOSSARY, Field.ASK, Field.IMPORT, Field.ASK, 17, 22, 13, 48, 2, 5, 6};
    }

    public C1299Zd(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        AbstractC0907Ju.A05(A00(35, 7, 46), A00(8, 27, 14), A00(0, 8, 40));
        this.A00.onInitialized(this.A01);
    }
}
