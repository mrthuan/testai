package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Wt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1240Wt implements InterfaceC0838Gz {
    public static byte[] A07;
    public static String[] A08 = {"IyNPMRe3Wq3129mSM2JJi0NNMuNXY8W9", "C94SuBGu", "p8v8XXVPXz4O90kPZAm39VV3npkMPwoF", "0JhHJN6IXOb6Rl6r4FoMpOTStQ2rHZcY", "4KvwhmNBIb78DyW3SVt3pB4MzWrcxbsc", "bfcMZdwzM", "6zjZIoJfL0coyOt5OBcRR6INW9DxFi9j", "1ahrRgqwtfgXyv4XYnMKvvM4rwUartmI"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final HL<? super C1240Wt> A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{9, Field.NUMCHARS, 42, Field.ASK, 44, 41, 26, Field.NUMCHARS, -41, 32, Field.NUMWORDS, Field.NUMCHARS, Field.PAGEREF, 43, 32, 29, 32, Field.NUMCHARS, 41, -41, 36, 44, 42, 43, -41, 25, Field.NUMCHARS, -41, 24, Field.PAGEREF, -41, 32, Field.PAGEREF, 43, Field.NUMCHARS, 30, Field.NUMCHARS, 41, -27, 24, 21, 12, -29, 48, 56, Field.AUTONUM, Field.IMPORT, -29, 56, Field.AUTONUM, Field.DATA, -29, Field.AUTONUM, Field.ASK, 43, Field.DATA, 48, Field.DATA, -29, Field.AUTONUMLGL, 36, 58, Field.AUTONUMLGL, Field.DATA, Field.AUTONUM, Field.GOTOBUTTON, 56, Field.AUTONUMLGL, Field.ASK, Field.DATA, -13, -30, -8, -13, -26, -12, -16, -10, -13, -28, -26};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws HK {
        try {
            this.A02 = h32.A04;
            if (TextUtils.equals(A00(70, 11, 29), this.A02.getScheme())) {
                try {
                    this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                    this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                    this.A03.skip(this.A01.getStartOffset());
                    if (this.A03.skip(h32.A03) >= h32.A03) {
                        long j10 = h32.A02;
                        if (A08[7].charAt(18) != 'M') {
                            throw new RuntimeException();
                        }
                        A08[2] = "NeR0SJjHXwq6S99lykBHPSy65ApZKYsP";
                        if (j10 != -1) {
                            this.A00 = h32.A02;
                        } else {
                            long length = this.A01.getLength();
                            this.A00 = length != -1 ? length - h32.A03 : -1L;
                        }
                        this.A04 = true;
                        if (this.A06 != null) {
                            this.A06.ADs(this, h32);
                        }
                        long j11 = this.A00;
                        if (A08[5].length() != 9) {
                            A08[5] = "brCRBkm5E";
                            return j11;
                        }
                        A08[1] = "jAn2ZAPLqPp6gMTdEbZr";
                        return j11;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new HK(A00(0, 39, 83));
                }
            }
            throw new HK(A00(39, 31, 95));
        } catch (IOException e10) {
            throw new HK(e10);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public C1240Wt(Context context, HL<? super C1240Wt> hl2) {
        this.A05 = context.getResources();
        this.A06 = hl2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r3 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        r5.A06.ADr(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (r3 != null) goto L37;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws com.facebook.ads.redexgen.X.HK {
        /*
            r5 = this;
            r3 = 0
            r5.A02 = r3
            r2 = 0
            java.io.InputStream r0 = r5.A03     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L85
            if (r0 == 0) goto Ld
            java.io.InputStream r0 = r5.A03     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L85
            r0.close()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L85
        Ld:
            r5.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L4b
            if (r0 == 0) goto L18
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L4b
            r0.close()     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L4b
        L18:
            r5.A01 = r3
            boolean r0 = r5.A04
            if (r0 == 0) goto L43
            r5.A04 = r2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            if (r0 == 0) goto L43
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r3 = r5.A06
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1240Wt.A08
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto L39
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L39:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1240Wt.A08
            java.lang.String r1 = "2MhjdMt8WeGViEW378NV"
            r0 = 1
            r2[r0] = r1
            r3.ADr(r5)
        L43:
            return
        L44:
            r1 = move-exception
            com.facebook.ads.redexgen.X.HK r0 = new com.facebook.ads.redexgen.X.HK     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r4 = move-exception
            r5.A01 = r3
            boolean r0 = r5.A04
            if (r0 == 0) goto L73
            r5.A04 = r2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r3 = r5.A06
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1240Wt.A08
            r0 = 2
            r1 = r1[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            r0 = 88
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1240Wt.A08
            java.lang.String r1 = "yK4Di7JH64WA9zfY0TMBJ08urnBzTPx7"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L73
        L6e:
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            r0.ADr(r5)
        L73:
            throw r4
        L74:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1240Wt.A08
            java.lang.String r1 = "m1exV2er9"
            r0 = 5
            r2[r0] = r1
            if (r3 == 0) goto L73
            goto L6e
        L7e:
            r1 = move-exception
            com.facebook.ads.redexgen.X.HK r0 = new com.facebook.ads.redexgen.X.HK     // Catch: java.lang.Throwable -> L85
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L85:
            r1 = move-exception
            r5.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Laa
            if (r0 == 0) goto L91
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Laa
            r0.close()     // Catch: java.io.IOException -> La3 java.lang.Throwable -> Laa
        L91:
            r5.A01 = r3
            boolean r0 = r5.A04
            if (r0 == 0) goto La2
            r5.A04 = r2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            if (r0 == 0) goto La2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            r0.ADr(r5)
        La2:
            throw r1
        La3:
            r1 = move-exception
            com.facebook.ads.redexgen.X.HK r0 = new com.facebook.ads.redexgen.X.HK     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Laa
            throw r0     // Catch: java.lang.Throwable -> Laa
        Laa:
            r1 = move-exception
            r5.A01 = r3
            boolean r0 = r5.A04
            if (r0 == 0) goto Lbc
            r5.A04 = r2
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            if (r0 == 0) goto Lbc
            com.facebook.ads.redexgen.X.HL<? super com.facebook.ads.redexgen.X.Wt> r0 = r5.A06
            r0.ADr(r5)
        Lbc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1240Wt.close():void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) throws HK {
        if (i11 == 0) {
            String[] strArr = A08;
            if (strArr[4].charAt(20) != strArr[3].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "YO0PXEoDNxNkeyj6J5zVBwlvhUUksa7C";
            strArr2[6] = "J54PJiBLJytnlOojbjnozVdd3pHXhFgw";
            return 0;
        } else if (this.A00 == 0) {
            return -1;
        } else {
            try {
                if (this.A00 != -1) {
                    i11 = (int) Math.min(this.A00, i11);
                }
                int read = this.A03.read(bArr, i10, i11);
                if (read == -1) {
                    int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                    if (bytesRead == 0) {
                        return -1;
                    }
                    throw new HK(new EOFException());
                }
                int bytesRead2 = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                if (bytesRead2 != 0) {
                    this.A00 -= read;
                }
                if (this.A06 != null) {
                    this.A06.ABS(this, read);
                }
                return read;
            } catch (IOException e10) {
                throw new HK(e10);
            }
        }
    }
}
