package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Zf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1301Zf extends KY {
    public static byte[] A02;
    public static String[] A03 = {"w4GsGaTCcJA9wFWp2KNopTJOjqP8UDpw", "KJoDcXHO6XERgkU18ZjJw4XTw2kjUjU4", "R80wDz5faPpVYHVxJychiW2DfFSiKcfh", "t0Fzi1DjxmxSLCfz9XJ2VaEQot34azEH", "xhDPy00jOuqmtbPp3auQzix75rw9IX8h", "Uu427jBhvNl8yC5HrJluoVTOz", "6hGUj4iS9agb9", "ga1SCcoGdvIpCjYHRj6uJxXsB"};
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C1313Zr A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A03[1].charAt(16) != '8') {
                throw new RuntimeException();
            }
            A03[1] = "4HO8Ss9k2AmZ8k9M8zrjCYxt48xbOoMK";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{3, Field.AUTONUMOUT, 59, 112, Field.QUOTE, Field.PAGEREF, Field.MACROBUTTON, Field.MACROBUTTON, Field.AUTONUMLGL, Field.QUOTE, Field.QUOTE, Field.AUTONUM, Field.PAGEREF, 60, 60, 41, 112, Field.SYMBOL, Field.USERADDRESS, Field.SYMBOL, 36, Field.SYMBOL, Field.EQ, 60, Field.SYMBOL, 42, Field.AUTONUMLGL, Field.AUTONUMOUT, 113};
    }

    static {
        A02();
    }

    public C1301Zf(C1313Zr c1313Zr, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1313Zr;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        try {
            ZQ.A02().A0C(this.A01);
        } catch (Throwable th2) {
            this.A01.A07().A3y(th2);
        }
        C06278c.A0C(this.A01);
        if (this.A00 != null) {
            C06278c.A04(this.A00, new C06268b(true, A00(0, 29, 22)));
        }
    }
}
