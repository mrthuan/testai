package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class X2 implements InterfaceC0838Gz {
    public static byte[] A00;
    public static final InterfaceC0837Gy A01;
    public static final X2 A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Field.SHAPE, 110, 118, 118, 98, 59, 104, 116, 110, 105, 120, 126};
    }

    static {
        A01();
        A02 = new X2();
        A01 = new X3();
    }

    public X2() {
    }

    public /* synthetic */ X2(X3 x32) {
        this();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws IOException {
        throw new IOException(A00(0, 12, 90));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        throw new UnsupportedOperationException();
    }
}
