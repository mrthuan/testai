package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.cl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1490cl extends AbstractC04390h {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Field.AUTONUMOUT, Field.AUTONUM, Field.DDE, Field.MACROBUTTON, Field.AUTONUM, Field.DDE, 56, 61, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = C1490cl.class.getSimpleName();
    }

    public C1490cl(C1314Zs c1314Zs, J7 j72, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1314Zs, j72, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04390h
    public final EnumC04380g A0C() {
        J9 j92 = J9.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 109));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                j92 = J9.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        super.A01.AAL(this.A02, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), j92);
        return EnumC04380g.A09;
    }
}
