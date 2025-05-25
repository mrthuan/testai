package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class KT implements InterfaceC1107Rp {
    public static byte[] A04;
    public int A00;
    public String A01;
    public Map<String, List<String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Field.NOTEREF, 99, 114, 113, 105, 116, 109, Field.ASK, 99, 116, 116, 105, 116};
    }

    public KT(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e10) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 122), e10);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1107Rp
    public final byte[] A6W() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1107Rp
    public final String A6X() {
        if (this.A03 != null) {
            return new String(this.A03);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1107Rp
    public final Map<String, List<String>> A7X() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1107Rp
    public final int A8R() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1107Rp
    public final String getUrl() {
        return this.A01;
    }
}
