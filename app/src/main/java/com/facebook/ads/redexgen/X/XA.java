package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class XA implements InterfaceC0838Gz {
    public static byte[] A06;
    public static String[] A07 = {"dBAoZLypinVieBiN6OmOrWglm0mkw7Th", "n", "cmJJD6tZYhQ1wcbsHE5vIxhw0qQZwo02", "X8ZVpNsLQVQ2kLhXMp5QNPazaYxfqolh", "NaudB7RRuuobxIxQA39JuxlozKEnLkCL", "rXbUFyh56idg3rSuJ4tJQtpYdGaFTF2y", "zDvFriMjZpoGqxlueWcDzXzIguNkUtNl", "sVEOjn8EJonDcZfN7QRvAJKGT0zqZa3R"};
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;
    public final HL<? super XA> A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] ^ i12) ^ 101;
            if (A07[1].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[0] = "n6owUrHV0UlTalMNOYWSyyNAru5hM8Vx";
            strArr[7] = "gByYkjtEEdTZs51Nu13z1IN8evpdXlXB";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {106, Field.LISTNUM, 20, Field.NUMWORDS, 17, 7, 26, Field.NUMCHARS, 17, 42, 20, 6, 6, 16, 1, Field.LISTNUM};
        if (A07[6].charAt(24) != 'g') {
            throw new RuntimeException();
        }
        A07[4] = "9ywXzXhCM32rn3RSs826HxV6thYomWUI";
        A06 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws C0831Gs {
        try {
            this.A01 = h32.A04;
            String path = this.A01.getPath();
            if (path.startsWith(A00(1, 15, 16))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 32))) {
                path = path.substring(1);
            }
            this.A02 = this.A04.open(path, 1);
            if (this.A02.skip(h32.A03) >= h32.A03) {
                if (h32.A02 != -1) {
                    this.A00 = h32.A02;
                } else {
                    this.A00 = this.A02.available();
                    if (this.A00 == 2147483647L) {
                        this.A00 = -1L;
                    }
                }
                this.A03 = true;
                if (this.A05 != null) {
                    this.A05.ADs(this, h32);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new C0831Gs(e10);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.AssetDataSource> */
    public XA(Context context, HL<? super XA> hl2) {
        this.A04 = context.getAssets();
        this.A05 = hl2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final void close() throws C0831Gs {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e10) {
                throw new C0831Gs(e10);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                if (this.A05 != null) {
                    this.A05.ADr(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) throws C0831Gs {
        if (i11 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A00 != -1) {
                i11 = (int) Math.min(this.A00, i11);
            }
            int read = this.A02.read(bArr, i10, i11);
            if (read == -1) {
                int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                if (bytesRead == 0) {
                    return -1;
                }
                throw new C0831Gs(new EOFException());
            }
            int bytesRead2 = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
            if (bytesRead2 != 0) {
                this.A00 -= read;
            }
            if (this.A05 != null) {
                this.A05.ABS(this, read);
            }
            return read;
        } catch (IOException e10) {
            throw new C0831Gs(e10);
        }
    }
}
