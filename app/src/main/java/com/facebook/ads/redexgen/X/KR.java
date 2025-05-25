package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class KR implements S6 {
    public static byte[] A01;
    public final boolean A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.MERGESEQ, 14, 48, Field.NUMCHARS, 29, 7, 22, 29, 7, Field.TOA, Field.FORMDROPDOWN, 42, 29, Field.NUMWORDS, 29, 17, 14, 29, Field.HYPERLINK, 13, 10, 20, Field.SECTIONPAGES, Field.HYPERLINK, 30, Field.SYMBOL, 44, Field.SYMBOL, 56, Field.USERADDRESS, 119, 109};
    }

    public KR(boolean z10) {
        this.A00 = z10;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String header : map.get(str)) {
                    String str2 = str + A00(1, 1, 74) + header;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.S6
    public final boolean A9X() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.S6
    public final void AAO(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 21) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 13) + ((String) obj);
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.facebook.ads.redexgen.X.S6
    public final void AAP(InterfaceC1107Rp interfaceC1107Rp) {
        if (interfaceC1107Rp != null) {
            String str = A00(11, 13, 6) + interfaceC1107Rp.getUrl();
            String str2 = A00(24, 8, 51) + interfaceC1107Rp.A8R();
            A02(interfaceC1107Rp.A7X());
        }
    }
}
