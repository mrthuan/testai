package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Kn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0925Kn implements S5 {
    public static byte[] A01;
    public final S6 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, -114, -114, -112, -101, -97, Field.HYPERLINK, 110, -109, -116, -99, -98, -112, -97, -42, -11, 7, -3, -9, -26, -7, 5, 9, -7, 7, 8, -36, -11, 2, -8, 0, -7, 6, -62, 3, 2, -39, 6, 6, 3, 6, -126, -82, -83, -77, -92, -83, -77, 108, -109, -72, -81, -92, -126, -127, 115, Field.LISTNUM, 101};
    }

    public AbstractC0925Kn(S6 s62) {
        this.A00 = s62;
    }

    @Override // com.facebook.ads.redexgen.X.S5
    public final boolean ABv(S3 s32) {
        InterfaceC1107Rp A00 = s32.A00();
        if (this.A00.A9X()) {
            Log.e(AbstractC0925Kn.class.getSimpleName(), A00(14, 27, 123), s32);
        }
        if (A00 != null && A00.A8R() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.S5
    public final HttpURLConnection AEH(String str, Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.X.S5
    public final InputStream AEI(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.X.S5
    public final OutputStream AEJ(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.X.S5
    public final void AEZ(HttpURLConnection httpURLConnection, S1 s12, String str) throws IOException {
        httpURLConnection.setRequestMethod(s12.A03());
        httpURLConnection.setDoOutput(s12.A05());
        httpURLConnection.setDoInput(s12.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 38), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 18), A00(53, 5, 20));
    }

    @Override // com.facebook.ads.redexgen.X.S5
    public final byte[] AEr(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.S5
    public final void AHj(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
