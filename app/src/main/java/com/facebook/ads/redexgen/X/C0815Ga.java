package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Ga  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0815Ga extends AbstractC1491cm {
    public static byte[] A03;
    public Map<String, String> A00;
    public boolean A01;
    public final Uri A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Field.HYPERLINK, Field.ADDRESSBLOCK, Field.LISTNUM, Field.SHAPE, 59, 60, Field.FILLIN, 58, Field.DDE, 23, 61, 58, 36, 23, Field.BARCODE, Field.DDE, 42, 23, Field.DDEAUTO, 41, 36, 36, 42, 41, 43, Field.QUOTE};
    }

    public C0815Ga(C1314Zs c1314Zs, J7 j72, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1314Zs, j72, str, null, true, true);
        this.A02 = uri;
        this.A00 = mExtraData;
    }

    public C0815Ga(C1314Zs c1314Zs, J7 j72, String str, Uri uri, Map<String, String> mExtraData, boolean z10) {
        this(c1314Zs, j72, str, uri, mExtraData);
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1491cm
    public final EnumC04380g A0D() {
        A0E(this.A00, null);
        return EnumC04380g.A09;
    }

    public final Uri A0G() {
        String queryParameter = this.A02.getQueryParameter(A00(4, 22, 5));
        if (this.A01 && !TextUtils.isEmpty(queryParameter)) {
            return L5.A00(queryParameter);
        }
        Uri uri = this.A02;
        String url = A00(0, 4, 121);
        return L5.A00(uri.getQueryParameter(url));
    }
}
