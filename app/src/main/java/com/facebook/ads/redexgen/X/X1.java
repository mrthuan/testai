package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X1 implements InterfaceC0838Gz {
    public static byte[] A05;
    public static String[] A06 = {"aq4IliIWDDncC3AYch6yko", OperatorName.STROKING_COLOR_CMYK, "7WihoyLotnvTQHZz2idft8ZXTVKY4zx7", "gI1erRXXD147Xe9Gq10kF", "pKYfB4E7PRZj7oqyTjC", "XBwEDGx62tHxzBOzLhjigx6FF1XIbcg4", "Gmgd", "152cUSbY7JMQW"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final HL<? super X1> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{15};
    }

    static {
        A01();
    }

    public X1() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public X1(HL<? super X1> hl2) {
        this.A04 = hl2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws H6 {
        try {
            this.A01 = h32.A04;
            this.A02 = new RandomAccessFile(h32.A04.getPath(), A00(0, 1, 46));
            this.A02.seek(h32.A03);
            this.A00 = h32.A02 == -1 ? this.A02.length() - h32.A03 : h32.A02;
            if (this.A00 >= 0) {
                this.A03 = true;
                if (this.A04 != null) {
                    HL<? super X1> hl2 = this.A04;
                    if (A06[3].length() == 0) {
                        throw new RuntimeException();
                    }
                    A06[4] = "kaTpwzrFHguK6C5ilEAmkkkNX";
                    hl2.ADs(this, h32);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new H6(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final void close() throws H6 {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e10) {
                throw new H6(e10);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                if (this.A04 != null) {
                    this.A04.ADr(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) throws H6 {
        if (i11 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            if (A06[3].length() != 0) {
                A06[3] = "SS1vrryUNPm";
                return -1;
            }
            throw new RuntimeException();
        }
        try {
            int read = this.A02.read(bArr, i10, (int) Math.min(this.A00, i11));
            if (read > 0) {
                this.A00 -= read;
                if (this.A04 != null) {
                    this.A04.ABS(this, read);
                }
            }
            return read;
        } catch (IOException e10) {
            throw new H6(e10);
        }
    }
}
