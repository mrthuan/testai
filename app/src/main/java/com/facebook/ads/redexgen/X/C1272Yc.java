package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Yc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1272Yc implements InterfaceC0723Bx {
    public static byte[] A0p;
    public static String[] A0q = {"rxtglFl1g0Um93LlgG73fPdHkECfhKTJ", "156rIhkjT5ca6mPiErNt0KfDlMTC", "do9WW65ZTIOUPfb1TmF4h6vlquEuLjy3", "QV7gmxZ9dxFMEmtOO1dnCHFrQrj32J64", "QDdPnTaHPqSIAhGd7OJ", "0MPgRfIRGG9Z3GM5iK3KXo10VaKBAgiN", "eMES0qt6ZhGX5hbnTa3YivJZAsKhiDVN", "cMd8ydiemrnpAsn7XU3xyG8InpRYLS"};
    public static final C0 A0r;
    public static final UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public InterfaceC0725Bz A0N;
    public CJ A0O;
    public C0859Hu A0P;
    public C0859Hu A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<CJ> A0c;
    public final CF A0d;
    public final CM A0e;
    public final I4 A0f;
    public final I4 A0g;
    public final I4 A0h;
    public final I4 A0i;
    public final I4 A0j;
    public final I4 A0k;
    public final I4 A0l;
    public final I4 A0m;
    public final I4 A0n;
    public final boolean A0o;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0p, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        String[] strArr = A0q;
        if (strArr[5].charAt(3) != strArr[0].charAt(3)) {
            throw new RuntimeException();
        }
        A0q[7] = "VtyRGyix4nImbLWXcmGsSmYiZpiT2B";
        A0p = new byte[]{-91, -13, -12, -7, -91, -8, -6, -11, -11, -12, -9, -7, -22, -23, -121, -110, -109, -58, -100, -121, -110, -108, -58, -100, -121, -110, -108, -58, -100, -121, -110, -108, -58, -94, -83, -81, -31, -73, -94, -83, -81, -31, -73, -94, -83, -81, -31, -87, -94, -83, -80, -31, -17, -13, 1, 1, 19, 34, 34, 23, Field.NUMCHARS, 21, 33, -15, 23, 30, 22, 19, 32, -5, 29, 18, 19, -50, -6, 24, -6, -6, -4, -42, -12, -42, -40, -56, -61, -31, -58, -42, -43, -60, -30, -57, -41, -42, -78, -56, -37, -45, -43, -56, -42, -42, -78, -48, -75, -59, -60, -96, -67, -64, -60, -60, -67, -74, -60, -60, -1, 29, 3, -1, 1, -15, -45, -15, -40, -34, -45, -43, -53, -23, -41, -38, -49, -47, -71, -42, -68, -11, 19, 1, 4, -7, -5, -29, 0, -25, 32, Field.USERADDRESS, 44, Field.GOTOBUTTON, 14, 32, 34, 44, -66, -36, -52, -51, -46, -48, -22, 8, -7, -20, -10, -40, -14, -9, -3, -40, -11, -14, -3, 22, Field.AUTONUMOUT, 41, Field.FILLIN, 42, 26, 29, 25, -64, -34, -43, -50, -47, -63, -56, -46, -74, -44, -31, -102, -25, -109, -26, -42, -44, -33, -40, -109, -25, -36, -32, -40, -42, -30, -41, -40, -109, -29, -27, -36, -30, -27, -109, -25, -30, -109, -25, -36, -32, -40, -42, -30, -41, -40, -58, -42, -44, -33, -40, -109, -43, -40, -36, -31, -38, -109, -26, -40, -25, -95, -45, -1, -3, -14, -7, -2, -7, -2, -9, -80, -11, -2, -13, 2, 9, 0, 4, -7, -1, -2, -80, -15, -2, -12, -80, -13, -1, -3, 0, 2, -11, 3, 3, -7, -1, -2, -80, -7, 3, -80, -2, -1, 4, -80, 3, 5, 0, 0, -1, 2, 4, -11, -12, -27, 17, 16, 22, 7, 16, 22, -27, 17, 15, 18, -29, 14, 9, 17, -62, -9, Field.QUOTE, 34, Field.DATA, 25, 34, Field.DATA, -7, 34, 23, -11, 32, Field.NUMWORDS, Field.QUOTE, -44, -21, 23, 22, Field.NUMCHARS, 13, 22, Field.NUMCHARS, -19, 22, 11, 23, 12, 17, 22, 15, -9, 26, 12, 13, 26, -56, -50, -6, -7, -1, -16, -7, -1, -48, -7, -18, -6, -17, -12, -7, -14, -34, -18, -6, -5, -16, -85, -88, -45, -57, -72, -35, -44, -55, -124, -49, -6, -18, -33, 4, -5, -16, -35, -16, -20, -17, -31, -16, -3, -2, -12, -6, -7, -85, -51, -54, -43, -44, -88, -12, -23, -21, -15, -10, -17, -88, -5, -23, -11, -8, -12, -19, -88, -5, -15, 2, -19, -88, -9, -3, -4, -88, -9, -18, -88, -6, -23, -10, -17, -19, -74, -40, -43, -32, -33, -27, -8, -12, -9, -23, -8, 5, 6, -4, 2, 1, -77, -17, 24, 13, Field.NUMCHARS, Field.QUOTE, 26, 30, 15, 14, -54, -2, Field.NUMCHARS, 11, 13, 21, -54, 16, 25, 31, 24, 14, -54, 12, 31, 30, -54, -19, 25, 24, 30, 15, 24, 30, -17, 24, 13, -11, 15, Field.QUOTE, -13, -18, -54, 33, 11, 29, -54, 24, 25, 30, -54, 16, 25, 31, 24, 14, 6, Field.SYMBOL, Field.AUTONUMLGL, Field.ASK, Field.GLOSSARY, Field.AUTONUMOUT, 42, 48, Field.GLOSSARY, -31, Field.QUOTE, 42, Field.AUTONUMLGL, -31, 42, Field.AUTONUMOUT, -31, Field.AUTONUMOUT, Field.ASK, Field.AUTONUMLGL, -31, 42, Field.GLOSSARY, -31, Field.AUTONUMOUT, 42, Field.DATA, Field.GLOSSARY, 34, Field.DDE, -31, Field.QUOTE, 58, Field.AUTONUMLGL, Field.ASK, -57, -16, -13, -18, -30, -11, -69, -95, -44, -11, -30, -13, -11, -83, -95, -58, -17, -27, -83, -95, -45, -26, -30, -27, -48, -13, -27, -26, -13, -83, -95, -51, -30, -6, -26, -13, -83, -95, -44, -11, -6, -19, -26, -83, -95, -49, -30, -18, -26, -83, -95, -50, -30, -13, -24, -22, -17, -51, -83, -95, -50, -30, -13, -24, -22, -17, -45, -83, -95, -50, -30, -13, -24, -22, -17, -41, -83, -95, -58, -25, -25, -26, -28, -11, -83, -95, -43, -26, -7, -11, -13, 8, 10, 16, 21, 14, -57, 22, 21, 19, 32, -57, 26, Field.NUMCHARS, 23, 23, 22, 25, Field.NUMWORDS, 12, 11, -57, 16, 21, -57, -6, 16, 20, 23, 19, 12, -23, 19, 22, 10, 18, 26, -43, -13, 7, 20, 10, 7, 26, 21, 24, 31, -58, 11, 18, 11, 19, 11, 20, 26, -58, -7, 11, 11, 17, -17, -22, -58, 21, 24, -58, -7, 11, 11, 17, -10, 21, 25, 15, 26, 15, 21, 20, -58, 20, 21, 26, -58, 12, 21, Field.NUMWORDS, 20, 10, -47, -7, -16, -8, -19, -12, -16, -23, -92, -41, -23, -21, -15, -23, -14, -8, -92, -23, -16, -23, -15, -23, -14, -8, -9, -92, -14, -13, -8, -92, -9, -7, -12, -12, -13, -10, -8, -23, -24, -52, -19, -98, -12, -33, -22, -25, -30, -98, -14, -16, -33, -31, -23, -15, -98, -11, -29, -16, -29, -98, -28, -19, -13, -20, -30, 1, 34, -45, 41, 20, 31, Field.NUMCHARS, 23, -45, 41, 20, Field.PAGEREF, Field.NUMCHARS, 33, Field.FILLIN, -45, 31, 24, 33, 26, Field.FILLIN, Field.NUMWORDS, -45, 32, 20, Field.ASK, 30, -45, 25, 34, Field.DATA, 33, 23, 12, 24, -3, 15, -5, 12, 14, -5, 18, 30, 7, 3, 12, 21, -18, 15, 6, 18, 13, 25, 14, -1, 18, 14, -23, -5, 13, 13, 29, 41, 30, 15, 34, 30, -7, 31, 30, 16, 2, -39, -27, -36, -43, -56, -39, -37, -56, -11, 14, 5, 24, 16, 5, 3, 20, 5, 4, -64, 9, 4, -38, -64, -9, 16, 7, 26, 18, 7, 5, 22, 7, 6, -62, 14, 3, 5, 11, 16, 9, -62, 24, 3, 14, 23, 7, -36, -62, Field.MACROBUTTON, 60, 42, Field.DDE, 34, 36, 15, Field.FILLIN, 48, 30, 33, 22, 24, 5, 0, 26, 36, 32, 0, 18, 33, 6, 15, -3, 0, -11, -9, -28, -33, -7, 3, -1, -33, -15, 3, 0, -69, -60, -78, -75, -86, -84, -103, -108, -82, -72, -76, -108, -90, -69, -88, 34, 43, 25, Field.NUMCHARS, 17, 19, 0, -5, 21, 31, Field.NUMWORDS, -5, 31, Field.NUMCHARS, -3, 6, -12, -9, -20, -18, -17, -42, -16, -6, -10, -42, -17, -20, -3, -22, -16, -7, -25, -19, -55, -16, -32, -15, -55, -32, -23, -17, -20, -35, -35, -26, -17, 
        -28, -40, -43, -33, -30, -47, -21, -12, -21, -27, -51, Field.AUTONUM, Field.BARCODE, Field.AUTONUM, 48, 25, Field.FORMTEXT, 58, 77, Field.MERGESEQ, Field.NOTEREF, 76, Field.INCLUDETEXT, 58, Field.PAGEREF, 24, 19, 20, 30, -34, Field.ASK, 20, 17, Field.NUMCHARS, 80, Field.USERADDRESS, 59, Field.FORMTEXT};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ff, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x031d, code lost:
        if (r4 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0320, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
        if ((r11.A0k.A00[0] & 128) != 128) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        r11.A00 = r11.A0k.A00[0];
        r11.A0X = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b2, code lost:
        if ((r11.A0k.A00[0] & 128) != 128) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x021d, code lost:
        throw new com.facebook.ads.redexgen.X.A0(A03(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.BASE64_FAILED, 35, 96));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02fd, code lost:
        if (r4 == 0) goto L91;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.X.InterfaceC0724By r12, com.facebook.ads.redexgen.X.CJ r13, int r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1272Yc.A08(com.facebook.ads.redexgen.X.By, com.facebook.ads.redexgen.X.CJ, int):void");
    }

    static {
        A06();
        A0r = new C1274Ye();
        A0w = new byte[]{Field.EQ, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Field.DDE, Field.DDE, Field.USERADDRESS, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = IK.A0i(A03(539, 90, 32));
        A0u = new byte[]{Field.INCLUDETEXT, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public C1272Yc() {
        this(0);
    }

    public C1272Yc(int i10) {
        this(new C1275Yf(), i10);
    }

    public C1272Yc(CF cf2, int i10) {
        this.A0K = -1L;
        this.A0M = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = -9223372036854775807L;
        this.A0d = cf2;
        this.A0d.A9E(new C1273Yd(this, null));
        this.A0o = (i10 & 1) == 0;
        this.A0e = new CM();
        this.A0c = new SparseArray<>();
        this.A0k = new I4(4);
        this.A0n = new I4(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new I4(4);
        this.A0i = new I4(I0.A03);
        this.A0h = new I4(4);
        this.A0j = new I4();
        this.A0m = new I4();
        this.A0f = new I4(8);
        this.A0g = new I4();
    }

    private int A00(InterfaceC0724By interfaceC0724By, C9 c92, int i10) throws IOException, InterruptedException {
        int bytesRead;
        int strippedBytesLeft = this.A0j.A04();
        if (strippedBytesLeft > 0) {
            bytesRead = Math.min(i10, strippedBytesLeft);
            c92.AFv(this.A0j, bytesRead);
        } else {
            bytesRead = c92.AFu(interfaceC0724By, i10, false);
        }
        this.A07 += bytesRead;
        this.A08 += bytesRead;
        return bytesRead;
    }

    private long A01(long j10) throws A0 {
        if (this.A0M != -9223372036854775807L) {
            return IK.A0F(j10, this.A0M, 1000L);
        }
        throw new A0(A03(189, 54, 18));
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0068 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.C6 A02() {
        /*
            r11 = this;
            long r3 = r11.A0K
            r1 = -1
            r8 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L32
            long r3 = r11.A0H
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L32
            com.facebook.ads.redexgen.X.Hu r0 = r11.A0Q
            if (r0 == 0) goto L32
            com.facebook.ads.redexgen.X.Hu r0 = r11.A0Q
            int r0 = r0.A02()
            if (r0 == 0) goto L32
            com.facebook.ads.redexgen.X.Hu r0 = r11.A0P
            if (r0 == 0) goto L32
            com.facebook.ads.redexgen.X.Hu r0 = r11.A0P
            int r1 = r0.A02()
            com.facebook.ads.redexgen.X.Hu r0 = r11.A0Q
            int r0 = r0.A02()
            if (r1 == r0) goto L3e
        L32:
            r11.A0Q = r8
            r11.A0P = r8
            long r1 = r11.A0H
            com.facebook.ads.redexgen.X.Yo r0 = new com.facebook.ads.redexgen.X.Yo
            r0.<init>(r1)
            return r0
        L3e:
            com.facebook.ads.redexgen.X.Hu r0 = r11.A0Q
            int r7 = r0.A02()
            int[] r9 = new int[r7]
            long[] r6 = new long[r7]
            long[] r5 = new long[r7]
            long[] r4 = new long[r7]
            r10 = 0
        L4d:
            if (r10 >= r7) goto L65
            com.facebook.ads.redexgen.X.Hu r0 = r11.A0Q
            long r0 = r0.A03(r10)
            r4[r10] = r0
            long r0 = r11.A0K
            com.facebook.ads.redexgen.X.Hu r2 = r11.A0P
            long r2 = r2.A03(r10)
            long r0 = r0 + r2
            r6[r10] = r0
            int r10 = r10 + 1
            goto L4d
        L65:
            r10 = 0
        L66:
            int r0 = r7 + (-1)
            if (r10 >= r0) goto L80
            int r0 = r10 + 1
            r0 = r6[r0]
            r2 = r6[r10]
            long r0 = r0 - r2
            int r2 = (int) r0
            r9[r10] = r2
            int r0 = r10 + 1
            r2 = r4[r0]
            r0 = r4[r10]
            long r2 = r2 - r0
            r5[r10] = r2
            int r10 = r10 + 1
            goto L66
        L80:
            int r10 = r7 + (-1)
            long r2 = r11.A0K
            long r0 = r11.A0L
            long r2 = r2 + r0
            int r0 = r7 + (-1)
            r0 = r6[r0]
            long r2 = r2 - r0
            int r0 = (int) r2
            r9[r10] = r0
            int r10 = r7 + (-1)
            long r0 = r11.A0H
            int r2 = r7 + (-1)
            r2 = r4[r2]
            long r0 = r0 - r2
            r5[r10] = r0
            r11.A0Q = r8
            r11.A0P = r8
            com.facebook.ads.redexgen.X.Yt r0 = new com.facebook.ads.redexgen.X.Yt
            r0.<init>(r9, r6, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1272Yc.A02():com.facebook.ads.redexgen.X.C6");
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0V();
    }

    private void A07(InterfaceC0724By interfaceC0724By, int i10) throws IOException, InterruptedException {
        if (this.A0k.A07() >= i10) {
            return;
        }
        if (this.A0k.A05() < i10) {
            I4 i42 = this.A0k;
            I4 i43 = this.A0k;
            String[] strArr = A0q;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0q;
            strArr2[4] = "rT72M2ede8MzF7iNlXS";
            strArr2[1] = "ZGqx0ngevM9RicVUzOfV30c6jBNW";
            i42.A0b(Arrays.copyOf(i43.A00, Math.max(this.A0k.A00.length * 2, i10)), this.A0k.A07());
        }
        interfaceC0724By.readFully(this.A0k.A00, this.A0k.A07(), i10 - this.A0k.A07());
        this.A0k.A0X(i10);
    }

    private void A09(InterfaceC0724By interfaceC0724By, byte[] bArr, int i10) throws IOException, InterruptedException {
        int length = bArr.length + i10;
        int sizeWithPrefix = this.A0m.A05();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i10;
            this.A0m.A00 = Arrays.copyOf(bArr, sizeWithPrefix2);
        } else {
            System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        byte[] bArr2 = this.A0m.A00;
        int sizeWithPrefix3 = bArr.length;
        interfaceC0724By.readFully(bArr2, sizeWithPrefix3, i10);
        this.A0m.A0W(length);
    }

    private void A0A(InterfaceC0724By interfaceC0724By, byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int min = Math.min(i11, this.A0j.A04());
        int pendingStrippedBytes = i11 - min;
        interfaceC0724By.readFully(bArr, i10 + min, pendingStrippedBytes);
        if (min > 0) {
            this.A0j.A0c(bArr, i10, min);
        }
        int pendingStrippedBytes2 = this.A07;
        this.A07 = pendingStrippedBytes2 + i11;
    }

    private void A0B(CJ cj2, long j10) {
        if (cj2.A0X != null) {
            cj2.A0X.A03(cj2, j10);
        } else {
            if (A03(843, 11, 105).equals(cj2.A0Y)) {
                A0C(cj2, A03(33, 19, 28), 19, 1000L, A0x);
            } else if (A03(833, 10, 89).equals(cj2.A0Y)) {
                A0C(cj2, A03(14, 19, 1), 21, 10000L, A0v);
            }
            cj2.A0W.AFw(j10, this.A01, this.A08, 0, cj2.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0C(CJ cj2, String str, int i10, long j10, byte[] bArr) {
        A0D(this.A0m.A00, this.A0C, str, i10, j10, bArr);
        cj2.A0W.AFv(this.A0m, this.A0m.A07());
        this.A08 += this.A0m.A07();
    }

    public static void A0D(byte[] bArr, long j10, String str, int i10, long j11, byte[] bArr2) {
        byte[] timeCodeData;
        if (j10 == -9223372036854775807L) {
            timeCodeData = bArr2;
        } else {
            int i11 = (int) (j10 / 3600000000L);
            long j12 = j10 - ((i11 * 3600) * 1000000);
            int i12 = (int) (j12 / 60000000);
            int minutes = i12 * 60;
            long j13 = j12 - (minutes * 1000000);
            int lastValue = (int) (j13 / 1000000);
            int minutes2 = (int) ((j13 - (lastValue * 1000000)) / j11);
            timeCodeData = IK.A0i(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(lastValue), Integer.valueOf(minutes2)));
        }
        System.arraycopy(timeCodeData, 0, bArr, i10, bArr2.length);
    }

    private boolean A0E(C4 c42, long j10) {
        if (this.A0Y) {
            this.A0J = j10;
            c42.A00 = this.A0F;
            this.A0Y = false;
            String[] strArr = A0q;
            if (strArr[5].charAt(3) != strArr[0].charAt(3)) {
                throw new RuntimeException();
            }
            A0q[3] = "3sMiiyikeABHc79KuFbt5PifQhbEMiPL";
            return true;
        } else if (!this.A0a || this.A0J == -1) {
            return false;
        } else {
            c42.A00 = this.A0J;
            this.A0J = -1L;
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
        if (A03(lib.zj.office.fc.ss.usermodel.ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 6, 28).equals(r6) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
        r2 = com.facebook.ads.redexgen.X.C1272Yc.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e8, code lost:
        if (r2[4].length() == r2[1].length()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
        r2 = com.facebook.ads.redexgen.X.C1272Yc.A0q;
        r2[2] = "7cKpE7xR7J3Aq7pNTLEDFNkVH25Zgbua";
        r2[6] = "8CcZX4JJYq12yj73T9598uB0Y3yvkFOz";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
        if (A03(lib.zj.office.fc.ss.usermodel.ShapeTypes.MATH_NOT_EQUAL, 8, 30).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
        if (A03(74, 5, 88).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
        if (A03(128, 9, 41).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012f, code lost:
        if (A03(lib.zj.office.fc.ss.usermodel.ShapeTypes.FLOW_CHART_DOCUMENT, 9, 83).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013e, code lost:
        if (A03(79, 5, 52).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
        if (A03(116, 6, 93).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015d, code lost:
        if (A03(lib.zj.office.fc.ss.usermodel.ShapeTypes.GEAR_6, 8, 116).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016c, code lost:
        if (A03(84, 5, 33).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017c, code lost:
        if (A03(89, 13, 34).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018c, code lost:
        if (A03(102, 14, 16).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019b, code lost:
        if (A03(122, 6, 49).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ab, code lost:
        if (A03(lib.zj.office.fc.ss.usermodel.ShapeTypes.FLOW_CHART_SUMMING_JUNCTION, 8, 126).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01be, code lost:
        if (com.facebook.ads.redexgen.X.C1272Yc.A0q[7].length() == 30) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c0, code lost:
        com.facebook.ads.redexgen.X.C1272Yc.A0q[7] = "hCOrDW1Xt9EUQRBJh4lIFcdmIau3uO";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cf, code lost:
        if (A03(160, 13, 72).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01df, code lost:
        if (A03(843, 11, 105).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ef, code lost:
        if (A03(833, 10, 89).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ff, code lost:
        if (com.facebook.ads.redexgen.X.C1272Yc.A0q[3].charAt(1) == 'J') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0201, code lost:
        r2 = com.facebook.ads.redexgen.X.C1272Yc.A0q;
        r2[2] = "2Y1KYLFk3QhgHC6kTmmXwzPMLyCgOOml";
        r2[6] = "5mhsWfLPzlfy0mrjTbURgRjZHxOWOUq3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0219, code lost:
        if (A03(854, 8, 37).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0229, code lost:
        if (A03(823, 10, 94).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0239, code lost:
        if (A03(815, 8, 88).equals(r6) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x024b, code lost:
        if (A03(854, 8, 37).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024e, code lost:
        r2 = com.facebook.ads.redexgen.X.C1272Yc.A0q;
        r2[2] = "g5yfSR3lkhXiJ6bMTwygRkv9DkY9Awd9";
        r2[6] = "Ux785EUFU4U6vpERTZn7VKH4gfY9IFZT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0262, code lost:
        if (A03(160, 13, 72).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0266, code lost:
        com.facebook.ads.redexgen.X.C1272Yc.A0q[3] = "57SEv8zsmKegk4FairLq34Nwn3RXRdHM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0277, code lost:
        if (A03(lib.zj.office.fc.ss.usermodel.ShapeTypes.MATH_NOT_EQUAL, 8, 25).equals(r6) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x028a, code lost:
        if (A03(lib.zj.office.fc.ss.usermodel.ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 6, 28).equals(r6) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0F(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1272Yc.A0F(java.lang.String):boolean");
    }

    public static int[] A0H(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        String[] strArr = A0q;
        if (strArr[4].length() != strArr[1].length()) {
            String[] strArr2 = A0q;
            strArr2[2] = "KGTULEZOhECvdgncTg0P5sR2NlniOyva";
            strArr2[6] = "LglDNYTdNlWs2NlpTSjFbJOzEAAFHyKn";
            if (length >= i10) {
                return iArr;
            }
            return new int[Math.max(iArr.length * 2, i10)];
        }
        throw new RuntimeException();
    }

    public final void A0I(int i10) throws A0 {
        switch (i10) {
            case 160:
                if (this.A04 != 2) {
                    return;
                }
                if (!this.A0W) {
                    this.A01 = 1 | this.A01;
                }
                A0B(this.A0c.get(this.A05), this.A0D);
                this.A04 = 0;
                return;
            case ShapeTypes.GEAR_9 /* 174 */:
                if (A0F(this.A0O.A0Y)) {
                    this.A0O.A09(this.A0N, this.A0O.A0N);
                    this.A0c.put(this.A0O.A0N, this.A0O);
                }
                this.A0O = null;
                return;
            case 19899:
                if (this.A0B != -1 && this.A0I != -1) {
                    if (this.A0B != 475249515) {
                        return;
                    }
                    this.A0F = this.A0I;
                    return;
                }
                throw new A0(A03(667, 50, 69));
            case 25152:
                if (!this.A0O.A0c) {
                    return;
                }
                if (this.A0O.A0V != null) {
                    this.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(AbstractC06529b.A05, A03(1024, 10, 78), this.A0O.A0V.A03));
                    return;
                }
                throw new A0(A03(449, 55, 73));
            case 28032:
                if (!this.A0O.A0c || this.A0O.A0f == null) {
                    return;
                }
                throw new A0(A03(243, 53, 47));
            case 357149030:
                if (this.A0M == -9223372036854775807L) {
                    this.A0M = 1000000L;
                }
                if (this.A0G == -9223372036854775807L) {
                    return;
                }
                this.A0H = A01(this.A0G);
                return;
            case 374648427:
                if (this.A0c.size() != 0) {
                    this.A0N.A5u();
                    return;
                }
                throw new A0(A03(756, 26, 29));
            case 475249515:
                if (this.A0a) {
                    return;
                }
                this.A0N.AG8(A02());
                this.A0a = true;
                return;
            default:
                return;
        }
    }

    public final void A0J(int i10, double d10) {
        switch (i10) {
            case ShapeTypes.MATH_NOT_EQUAL /* 181 */:
                this.A0O.A0O = (int) d10;
                return;
            case 17545:
                this.A0G = (long) d10;
                return;
            case 21969:
                this.A0O.A06 = (float) d10;
                return;
            case 21970:
                this.A0O.A07 = (float) d10;
                return;
            case 21971:
                this.A0O.A04 = (float) d10;
                return;
            case 21972:
                this.A0O.A05 = (float) d10;
                return;
            case 21973:
                this.A0O.A02 = (float) d10;
                return;
            case 21974:
                this.A0O.A03 = (float) d10;
                return;
            case 21975:
                this.A0O.A08 = (float) d10;
                return;
            case 21976:
                this.A0O.A09 = (float) d10;
                return;
            case 21977:
                this.A0O.A00 = (float) d10;
                return;
            case 21978:
                this.A0O.A01 = (float) d10;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x037f, code lost:
        if ((r5[2] & 128) == 128) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K(int r18, int r19, com.facebook.ads.redexgen.X.InterfaceC0724By r20) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1272Yc.A0K(int, int, com.facebook.ads.redexgen.X.By):void");
    }

    public final void A0L(int i10, long j10) throws A0 {
        String A03 = A03(0, 14, 36);
        switch (i10) {
            case ShapeTypes.PLUS /* 131 */:
                this.A0O.A0Q = (int) j10;
                return;
            case ShapeTypes.FLOW_CHART_INTERNAL_STORAGE /* 136 */:
                this.A0O.A0Z = j10 == 1;
                return;
            case ShapeTypes.FLOW_CHART_MAGNETIC_DISK /* 155 */:
                this.A0C = A01(j10);
                return;
            case ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS /* 159 */:
                CJ cj2 = this.A0O;
                String[] strArr = A0q;
                if (strArr[4].length() != strArr[1].length()) {
                    String[] strArr2 = A0q;
                    strArr2[5] = "i9uguL91zJnK2yVYCyHqAB59vxZFjl2P";
                    strArr2[0] = "fGsgm4Hoe7bESI0hQ7ztbHh2GgFDcRlr";
                    cj2.A0B = (int) j10;
                    return;
                }
                break;
            case ShapeTypes.MATH_PLUS /* 176 */:
                CJ cj3 = this.A0O;
                int i11 = (int) j10;
                String[] strArr3 = A0q;
                if (strArr3[2].charAt(16) == strArr3[6].charAt(16)) {
                    String[] strArr4 = A0q;
                    strArr4[4] = "W80lq1iXH9TjQZFEMfH";
                    strArr4[1] = "1TwlxhYaNWr6kTom4YkUw4A2VhQH";
                    cj3.A0R = i11;
                    return;
                }
                break;
            case ShapeTypes.MATH_DIVIDE /* 179 */:
                this.A0Q.A04(A01(j10));
                return;
            case ShapeTypes.CHART_STAR /* 186 */:
                this.A0O.A0J = (int) j10;
                return;
            case 215:
                this.A0O.A0N = (int) j10;
                return;
            case 231:
                long A01 = A01(j10);
                String[] strArr5 = A0q;
                if (strArr5[5].charAt(3) != strArr5[0].charAt(3)) {
                    A0q[3] = "01bhmw6SIf50qa1UvEULm1xpTobjuZdK";
                    this.A0E = A01;
                    return;
                }
                String[] strArr6 = A0q;
                strArr6[5] = "zc5gYpUx9kUe1cbXfien411w3j0Oc62D";
                strArr6[0] = "7oEgI3j4aZ7oW1BIigIE5Jd90ipFBRir";
                this.A0E = A01;
                return;
            case 241:
                if (this.A0Z) {
                    return;
                }
                this.A0P.A04(j10);
                this.A0Z = true;
                return;
            case 251:
                this.A0W = true;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw new A0(A03(296, 16, 65) + j10 + A03);
            case 17029:
                if (j10 >= 1 && j10 <= 2) {
                    return;
                }
                throw new A0(A03(377, 19, 42) + j10 + A03);
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw new A0(A03(433, 16, 50) + j10 + A03);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw new A0(A03(312, 15, 83) + j10 + A03);
            case 18408:
                int i12 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
                String[] strArr7 = A0q;
                if (strArr7[4].length() != strArr7[1].length()) {
                    A0q[3] = "Wv4RFKmG8mcGFxh8unEsyyCM2rxpQxvN";
                    if (i12 == 0) {
                        return;
                    }
                } else if (i12 == 0) {
                    return;
                }
                throw new A0(A03(52, 22, 77) + j10 + A03);
            case 20529:
                if (j10 == 0) {
                    return;
                }
                throw new A0(A03(327, 21, 71) + j10 + A03);
            case 20530:
                if (j10 == 1) {
                    return;
                }
                throw new A0(A03(348, 21, 42) + j10 + A03);
            case 21420:
                this.A0I = this.A0K + j10;
                return;
            case 21432:
                int layout = (int) j10;
                switch (layout) {
                    case 0:
                        this.A0O.A0P = 0;
                        return;
                    case 1:
                        this.A0O.A0P = 2;
                        return;
                    case 3:
                        this.A0O.A0P = 1;
                        return;
                    case 15:
                        this.A0O.A0P = 3;
                        return;
                    default:
                        return;
                }
            case 21680:
                this.A0O.A0I = (int) j10;
                return;
            case 21682:
                this.A0O.A0H = (int) j10;
                return;
            case 21690:
                this.A0O.A0G = (int) j10;
                return;
            case 21930:
                this.A0O.A0a = j10 == 1;
                return;
            case 21945:
                switch ((int) j10) {
                    case 1:
                        this.A0O.A0C = 2;
                        return;
                    case 2:
                        this.A0O.A0C = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                switch ((int) j10) {
                    case 1:
                    case 6:
                    case 7:
                        CJ cj4 = this.A0O;
                        if (A0q[7].length() == 30) {
                            A0q[3] = "o21GLcMPNJMcED1O2vXu5w77jIlJ8guS";
                            cj4.A0E = 3;
                            return;
                        }
                        break;
                    case 16:
                        CJ cj5 = this.A0O;
                        if (A0q[7].length() != 30) {
                            A0q[7] = "mXidLWW1i3yrNrPwlFzzUTQJav29FK";
                            cj5.A0E = 6;
                            return;
                        }
                        A0q[7] = "3moLrrg0xEs1nAkmqBQAqsfn8DUGij";
                        cj5.A0E = 6;
                        return;
                    case 18:
                        this.A0O.A0E = 7;
                        return;
                    default:
                        return;
                }
            case 21947:
                this.A0O.A0b = true;
                switch ((int) j10) {
                    case 1:
                        CJ cj6 = this.A0O;
                        String[] strArr8 = A0q;
                        if (strArr8[4].length() != strArr8[1].length()) {
                            A0q[7] = "vpjfNkBO6dSnn0S8dhvELD276wtN1F";
                            cj6.A0D = 1;
                            return;
                        }
                        A0q[7] = "pQF6ELdXf0Obpj4fRq0XGpi3v3f9Nm";
                        cj6.A0D = 1;
                        return;
                    case 2:
                    case 3:
                    case 8:
                    default:
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        CJ cj7 = this.A0O;
                        if (A0q[7].length() == 30) {
                            A0q[3] = "JSeo3PWHalgHTbM2IhwBsXhqeEuSwt71";
                            cj7.A0D = 2;
                            return;
                        }
                        break;
                    case 9:
                        this.A0O.A0D = 6;
                        return;
                }
            case 21948:
                this.A0O.A0K = (int) j10;
                return;
            case 21949:
                this.A0O.A0L = (int) j10;
                return;
            case 22186:
                this.A0O.A0S = j10;
                return;
            case 22203:
                this.A0O.A0T = j10;
                return;
            case 25188:
                this.A0O.A0A = (int) j10;
                return;
            case 2352003:
                this.A0O.A0F = (int) j10;
                return;
            case 2807729:
                this.A0M = j10;
                return;
            default:
                return;
        }
        throw new RuntimeException();
    }

    public final void A0M(int i10, long j10, long j11) throws A0 {
        switch (i10) {
            case 160:
                this.A0W = false;
                return;
            case ShapeTypes.GEAR_9 /* 174 */:
                this.A0O = new CJ(null);
                return;
            case ShapeTypes.CHART_PLUS /* 187 */:
                this.A0Z = false;
                return;
            case 19899:
                this.A0B = -1;
                this.A0I = -1L;
                return;
            case 20533:
                this.A0O.A0c = true;
                return;
            case 21968:
                this.A0O.A0b = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                if (this.A0K == -1 || this.A0K == j10) {
                    this.A0K = j10;
                    this.A0L = j11;
                    return;
                }
                throw new A0(A03(717, 39, 35));
            case 475249515:
                this.A0Q = new C0859Hu();
                this.A0P = new C0859Hu();
                return;
            case 524531317:
                if (this.A0a) {
                    return;
                }
                if (this.A0o && this.A0F != -1) {
                    this.A0Y = true;
                    return;
                }
                this.A0N.AG8(new C1284Yo(this.A0H));
                this.A0a = true;
                return;
        }
    }

    public final void A0N(int i10, String str) throws A0 {
        switch (i10) {
            case ShapeTypes.FLOW_CHART_INPUT_OUTPUT /* 134 */:
                this.A0O.A0Y = str;
                return;
            case 17026:
                if (A03(1034, 4, 120).equals(str) || A03(1016, 8, 120).equals(str)) {
                    return;
                }
                throw new A0(A03(369, 8, 3) + str + A03(0, 14, 36));
            case 2274716:
                CJ.A02(this.A0O, str);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        this.A0N = interfaceC0725Bz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        this.A0V = false;
        boolean z10 = true;
        while (z10 && !this.A0V) {
            z10 = this.A0d.AEm(interfaceC0724By);
            if (z10 && A0E(c42, interfaceC0724By.A86())) {
                if (A0q[3].charAt(1) != 'J') {
                    String[] strArr = A0q;
                    strArr[2] = "se170HPsCtciHjkeTQyW7DT5ObsxAmwx";
                    strArr[6] = "URe0kLdIOILeikJhTJE89Pmrza1tWgxy";
                    return 1;
                }
                throw new RuntimeException();
            }
        }
        if (z10) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            SparseArray<CJ> sparseArray = this.A0c;
            String[] strArr2 = A0q;
            String str = strArr2[4];
            String str2 = strArr2[1];
            int length = str.length();
            int i11 = str2.length();
            if (length == i11) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0q;
            strArr3[2] = "BBxvBeLNC3LYTmo5ThGzIX5hnTuY03sZ";
            strArr3[6] = "mExXYWe8H7ZKtLInTkLjkcCrXDoIOUkG";
            int i12 = sparseArray.size();
            if (i10 < i12) {
                this.A0c.valueAt(i10).A07();
                i10++;
            } else {
                return -1;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x001e */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AG7(long r3, long r5) {
        /*
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.A0E = r0
            r0 = 0
            r2.A04 = r0
            com.facebook.ads.redexgen.X.CF r0 = r2.A0d
            r0.reset()
            com.facebook.ads.redexgen.X.CM r0 = r2.A0e
            r0.A06()
            r2.A05()
            r1 = 0
        L18:
            android.util.SparseArray<com.facebook.ads.redexgen.X.CJ> r0 = r2.A0c
            int r0 = r0.size()
            if (r1 >= r0) goto L2e
            android.util.SparseArray<com.facebook.ads.redexgen.X.CJ> r0 = r2.A0c
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.CJ r0 = (com.facebook.ads.redexgen.X.CJ) r0
            r0.A08()
            int r1 = r1 + 1
            goto L18
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1272Yc.AG7(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final boolean AGs(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        return new CL().A01(interfaceC0724By);
    }
}
