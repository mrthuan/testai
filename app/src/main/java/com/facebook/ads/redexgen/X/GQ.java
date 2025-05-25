package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class GQ extends AbstractC1491cm {
    public static byte[] A02;
    public static String[] A03 = {"FXNBCWXiStej7hPExkUYAqHU7xYJWQz0", "1k", "9V456DvY4LqOh9I9hdT7Vdo5", "hY2FptqSd7XbZZsJCz2yOGxQcUuE9Eo6", "F2N3RsuOcTrAQaEUExDI4U65CqttWDRl", "hYiRMwjZqKFmNKhRfgQ6FfhFwFErfvFO", "BBwXtDWFWjLC6NycZYUWGAP3M0YJ", ""};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-100, -73, -65, -62, -69, -70, 118, -54, -59, 118, -59, -58, -69, -60, 118, -62, -65, -60, -63, 118, -53, -56, -62, -112, 118, -45, -48, -43, -46};
        if (A03[3].charAt(0) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "n2WgzR0RMCkX50JDMRkryQ8YygezODnU";
        strArr[5] = "Oz9myBlwI7NBoyftyrFAavzWMm25M0Ie";
    }

    static {
        A01();
        A04 = GQ.class.getSimpleName();
    }

    public GQ(C1314Zs c1314Zs, J7 j72, String str, Uri uri, Map<String, String> mExtraData, C04450o c04450o, boolean z10) {
        super(c1314Zs, j72, str, c04450o, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1491cm
    public final EnumC04380g A0D() {
        EnumC04380g enumC04380g = EnumC04380g.A09;
        if (((AbstractC1491cm) this).A02) {
            enumC04380g = A0G();
        }
        if (!M3.A0g(((AbstractC04390h) this).A00, enumC04380g, this.A01)) {
            A0E(this.A01, enumC04380g);
        }
        return enumC04380g;
    }

    public final EnumC04380g A0G() {
        if (A0F(this.A00)) {
            EnumC04380g actionOutcome = EnumC04380g.A0A;
            return actionOutcome;
        }
        try {
            EnumC04380g actionOutcome2 = L2.A05(new L2(), ((AbstractC04390h) this).A00, L5.A00(this.A00.getQueryParameter(A00(25, 4, 19))), ((AbstractC04390h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 2) + this.A00.toString();
            EnumC04380g actionOutcome3 = EnumC04380g.A04;
            return actionOutcome3;
        }
    }
}
