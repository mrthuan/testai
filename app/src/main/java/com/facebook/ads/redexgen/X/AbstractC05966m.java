package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.6m  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05966m extends AbstractC0780Ee {
    public static byte[] A0d;
    public static String[] A0e = {"Ge6L00ZjjOeYHDl50zGOOqrmdGovIqOu", "cZwDGWYiz", "7CqInds9V1jaFSNLfCM07V3", "b7rrbxwR0Y2sYL3PAoER7xvxvxjYzaQU", "wmBwCsiUZd1Ya1BvurlHvY1RuH3FyZYs", "2ZpOIbX2LW06otFhCB4sq8DtxFPNNyvf", "JjLmntNee2XyXIifQDqG0Yu", "8KAQonnGP"};
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public InterfaceC0706Bg<FrameworkMediaCrypto> A08;
    public InterfaceC0706Bg<FrameworkMediaCrypto> A09;
    public DL A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public BH A0U;
    public final MediaCodec.BufferInfo A0V;
    public final C06709u A0W;
    public final C1292Yw A0X;
    public final C1292Yw A0Y;
    public final InterfaceC0707Bh<FrameworkMediaCrypto> A0Z;
    public final DR A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0Z(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A0j() {
        A0d = new byte[]{-60, -72, -6, 13, 12, -72, 6, 7, -72, 11, -3, -5, 13, 10, -3, -72, -4, -3, -5, 7, -4, -3, 10, -72, -7, 14, -7, 1, 4, -7, -6, 4, -3, -58, -72, -20, 10, 17, 1, 6, -1, -72, 12, 7, -72, 8, 10, 7, -5, -3, -3, -4, -72, 15, 1, 12, 0, -72, -90, -117, -117, -117, -117, -117, -116, -111, -110, -113, -115, -98, -117, -117, -99, -97, -100, -115, -112, -108, -117, -117, -117, -117, -117, -117, -116, -111, -109, -98, -96, -117, -95, -116, -114, -115, -117, -117, -117, -117, -117, -117, -116, -111, -112, -109, -109, -109, -113, -117, -97, -98, -96, -110, -116, -116, -109, -100, -117, -117, -117, -115, -95, -99, -95, -116, -98, -114, -116, -98, -114, -115, -110, -112, -97, -110, -109, -44, -39, -25, -26, -23, 21, 9, 34, 23, 22, -70, -24, -29, -106, -23, -37, -23, -23, -33, -27, -28, -106, -24, -37, -25, -21, -33, -24, -37, -23, -106, -23, -37, -39, -21, -24, -37, -106, -38, -37, -39, -27, -38, -37, -24, -106, -36, -27, -24, -106, -12, 12, 11, 16, 8, -57, 25, 12, 24, Field.NUMCHARS, 16, 25, 12, 26, -57, 8, -57, -21, 25, 20, -6, 12, 26, 26, 16, 22, 21, -12, 8, 21, 8, 14, 12, 25, -66, -42, -43, -38, -46, -76, -32, -43, -42, -44, -61, -42, -33, -43, -42, -29, -42, -29, -50, -52, -41, -83, -60, -9, -8, -19, -18, -14, -83, -32, -11, -30, -83, -29, -28, -30, -103, -105, -94, 120, -113, -62, -61, -72, -71, -67, 120, -85, -64, -83, 120, -82, -81, -83, 120, -67, -81, -83, -65, -68, -81, 12, 10, 21, -21, 10, 17, 8, -21, -2, 18, 1, 6, 12, -21, 1, 2, 0, 12, 1, 2, 15, -21, 10, 13, -16, -42, -44, -33, -75, -44, -37, -46, -75, -35, -48, -53, -52, -42, -75, -53, -52, -54, -42, -53, -52, -39, -75, -56, -35, -54, 2, 0, 11, -31, 1, 41, Field.NUMCHARS, 23, Field.NUMCHARS, 20, -31, Field.NUMWORDS, -27, -23, -25, -31, 23, 24, 22, 34, 23, 24, -35, -37, -26, -68, -36, 4, -9, -14, -9, -17, -68, -10, -64, -60, -62, -68, -14, -13, -15, -3, -14, -13, -68, 1, -13, -15, 3, 0, -13, -28, -30, -19, -61, -24, -38, -40, -61, -10, 11, -8, -61, -7, -6, -8, -66, -68, -57, -99, -62, -76, -78, -99, -48, -27, -46, -99, -45, -44, -46, -99, -30, -44, -46, -28, -31, -44, 3, 1, 12, -30, 21, 32, 32, 43, 29, 34, 34, 25, Field.ASK, -30, 42, 29, 24, 25, Field.QUOTE, -30, 24, 25, 23, Field.QUOTE, 24, 25, Field.ASK, -30, 21, 42, 23, -72, -74, -63, -105, -54, -42, -43, -40, -48, -46, -52, -105, -54, -33, -52, -105, -51, -50, -52, -40, -51, -50, -37, -105, -54, -32, -50, -36, -40, -42, -50, -17, -19, -8, -50, 1, 13, 12, 15, 7, 9, 3, -50, 1, 22, 3, -50, 4, 5, 3, 15, 4, 5, 18, -50, 1, 23, 5, 19, 15, 13, 5, -50, 19, 5, 3, 21, 18, 5, -60, -62, -51, -93, -36, -28, -28, -36, -31, -38, -93, -42, -42, -40, -93, -39, -38, -40, -28, -39, -38, -25, -44, -46, -35, -77, -20, -12, -12, -20, -15, -22, -77, -5, -12, -9, -25, -18, -8, -77, -23, -22, -24, -12, -23, -22, -9, -56, -58, -47, -89, -21, -28, -89, -17, -30, -35, -34, -24, -40, -35, -34, -36, -24, -35, -34, -21, -89, -38, -17, -36, -9, -15, -47, -27, -39, -43, -44, -12, -18, -50, -30, -42, -45, -47, -53, -59, -91, -65, -80, -88, -88, -34, -40, -72, -43, -62, -69, -69, -95, -101, 123, -94, -125, -122, -125, -65, -63, -49, -45, -57, -48, -61, -79, -61, -47, -47, -57, -51, -52, -61, -56, -63, -50, -50, -59, -52, -115, -61, -49, -43, -50, -44, 13, 25, 24, 16, 19, 17, 31, Field.NUMCHARS, 15, -19, 25, 14, 15, 13, 30, Field.DDE, 32, Field.NUMCHARS, Field.GLOSSARY, 32, -2, 42, 31, 32, 30, -11, -86, -72, -89, -81, -76, -121, -76, -86, -116, -85, -85, -86, -72, -66, -63, -57, -64, -74, -73, -60, -82, -76, -73, -67, -74, -84, -83, -70, -89, -76, -68, -83, -65, -67, -52, -91, -67, -68, -63, -71, -101, -54, -47, -56, -52, -57, -41, -43, -28, -61, -28, -47, -28, -43, -42, -31, -34, -28, -33, -44, -31, -41, -47, -95, -97, -97, -97, -10, -13, -9, -11, -10, 2, 9, -4, 3, -4, -8, 10, -4, -22, -4, 10, 10, 0, 6, 5, -60, -59, -78, -61, -59, -108, -64, -75, -74, -76, 31, 20, 23, 12, Field.NUMWORDS, 20, 12, -54, -68, -73, -57, -69};
    }

    public abstract int A1B(MediaCodec mediaCodec, DL dl2, Format format, Format format2);

    public abstract int A1C(DR dr, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, Format format) throws DU;

    public abstract void A1L(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C06589h;

    public abstract void A1N(C1292Yw c1292Yw);

    public abstract void A1O(DL dl2, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws DU;

    public abstract void A1P(String str, long j10, long j11);

    public abstract boolean A1Q(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws C06589h;

    static {
        A0j();
        A0f = IK.A0h(A0Z(59, 76, 29));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public AbstractC05966m(int i10, DR dr, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, boolean z10) {
        super(i10);
        AbstractC0844Hf.A04(IK.A02 >= 16);
        this.A0a = (DR) AbstractC0844Hf.A01(dr);
        this.A0Z = interfaceC0707Bh;
        this.A0c = z10;
        this.A0X = new C1292Yw(0);
        this.A0Y = C1292Yw.A02();
        this.A0W = new C06709u();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0W(String str) {
        if (IK.A02 <= 25 && A0Z(FunctionEval.FunctionID.EXTERNAL_FUNC, 25, 12).equals(str) && (IK.A06.startsWith(A0Z(617, 7, 16)) || IK.A06.startsWith(A0Z(589, 7, 102)) || IK.A06.startsWith(A0Z(596, 7, 99)) || IK.A06.startsWith(A0Z(610, 7, 77)))) {
            return 2;
        }
        if (IK.A02 < 24) {
            if (A0Z(330, 22, 117).equals(str) || A0Z(352, 29, 80).equals(str)) {
                if (!A0Z(689, 8, 20).equals(IK.A03)) {
                    if (!A0Z(697, 12, 10).equals(IK.A03)) {
                        if (A0Z(731, 7, 49).equals(IK.A03)) {
                            return 1;
                        }
                        String str2 = IK.A03;
                        String[] strArr = A0e;
                        if (strArr[6].length() != strArr[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0e;
                        strArr2[3] = "43oznx1K6tCWccJtXh9NlXjZt23I2ujy";
                        strArr2[5] = "jAN4QtnmbEUtPK1QH8WvPT0xHUSBcaS7";
                        if (A0Z(774, 7, 109).equals(str2)) {
                            return 1;
                        }
                        return 0;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private final long A0X() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Y(C1292Yw c1292Yw, int i10) {
        MediaCodec.CryptoInfo A02 = c1292Yw.A02.A02();
        if (i10 == 0) {
            return A02;
        }
        if (A02.numBytesOfClearData == null) {
            int[] iArr = new int[1];
            String[] strArr = A0e;
            if (strArr[1].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[3] = "onz7wliqp2XHHKkpQRZifpXAce3CX6Fj";
            strArr2[5] = "Cbb9E5A8AJ3RRtQIFMKO1cbLALBvOm0W";
            A02.numBytesOfClearData = iArr;
        }
        int[] iArr2 = A02.numBytesOfClearData;
        String[] strArr3 = A0e;
        if (strArr3[0].charAt(11) != strArr3[4].charAt(11)) {
            String[] strArr4 = A0e;
            strArr4[0] = "V8kNlZfFrOKYWg4XKudgCI5cCGlMDu3O";
            strArr4[4] = "pHzAarahmuxYCg6YLY7OHuu6gmd0r2pS";
            iArr2[0] = iArr2[0] + i10;
            return A02;
        }
        String[] strArr5 = A0e;
        strArr5[3] = "bMCkxjPsyY31VLvavBARR2r8FlYARPlk";
        strArr5[5] = "GfpaQbDO32ffC6mv5qdHc7m8OEvdxJfK";
        iArr2[0] = iArr2[0] + i10;
        return A02;
    }

    private ByteBuffer A0a(int i10) {
        if (IK.A02 >= 21) {
            return this.A06.getInputBuffer(i10);
        }
        return this.A0S[i10];
    }

    private ByteBuffer A0b(int i10) {
        if (IK.A02 >= 21) {
            return this.A06.getOutputBuffer(i10);
        }
        ByteBuffer byteBuffer = this.A0T[i10];
        String[] strArr = A0e;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[6] = "Q1Mn8yvPCAsyenBcYQo9bc0";
        strArr2[2] = "s1CLkHC4BsHt65fSKCGpIac";
        return byteBuffer;
    }

    private void A0c() {
        if (IK.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0d() throws C06589h {
        if (this.A02 == 2) {
            A1H();
            A1J();
            return;
        }
        this.A0N = true;
        A1I();
    }

    private void A0e() {
        if (IK.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws C06589h {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0Z(781, 5, 21)) == 32 && outputFormat.getInteger(A0Z(744, 6, 80)) == 32) {
            this.A0O = true;
            return;
        }
        boolean z10 = this.A0I;
        String[] strArr = A0e;
        if (strArr[0].charAt(11) != strArr[4].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[3] = "V1ANh4pRI8qXsXATmIh4DpaxZ3qun5MS";
        strArr2[5] = "hhvMepvRH7Mwz24exxX4ZNsDPU6bsVl4";
        if (z10) {
            outputFormat.setInteger(A0Z(638, 13, 34), 1);
        }
        A1L(this.A06, outputFormat);
    }

    private void A0g() {
        if (IK.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(DN dn2) throws C06589h {
        throw C06589h.A01(dn2, A0z());
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x022d, code lost:
        if (r8 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0230, code lost:
        r13.A0D = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0232, code lost:
        r8 = r13.A0X.A00;
        r3 = r13.A0X.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023c, code lost:
        if (r3 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023e, code lost:
        r13.A0b.add(java.lang.Long.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0247, code lost:
        r13.A0X.A08();
        A1N(r13.A0X);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0251, code lost:
        if (r6 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0253, code lost:
        r13.A06.queueSecureInputBuffer(r13.A03, 0, A0Y(r13.A0X, r7), r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0263, code lost:
        r13.A06.queueInputBuffer(r13.A03, 0, r13.A0X.A01.limit(), r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0274, code lost:
        A0h();
        r13.A0J = true;
        r13.A01 = 0;
        r13.A0U.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0282, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0283, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x028c, code lost:
        throw com.facebook.ads.redexgen.X.C06589h.A01(r1, A0z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
        if (r6 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0154, code lost:
        if (r6 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0191, code lost:
        if (r13.A0G == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0194, code lost:
        r13.A0K = true;
        r13.A06.queueInputBuffer(r13.A03, 0, 0, 0, 4);
        A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a5, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01af, code lost:
        throw com.facebook.ads.redexgen.X.C06589h.A01(r1, A0z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020b, code lost:
        if (r8 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020d, code lost:
        if (r6 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020f, code lost:
        com.facebook.ads.redexgen.X.I0.A0A(r13.A0X.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021e, code lost:
        if (r13.A0X.A01.position() != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0220, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0l() throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC05966m.A0l():boolean");
    }

    private boolean A0m() {
        return this.A04 >= 0;
    }

    private boolean A0n(long j10) {
        int size = this.A0b.size();
        for (int i10 = 0; i10 < size; i10++) {
            int size2 = (this.A0b.get(i10).longValue() > j10 ? 1 : (this.A0b.get(i10).longValue() == j10 ? 0 : -1));
            if (size2 == 0) {
                this.A0b.remove(i10);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x015b, code lost:
        if ((r4.flags & 4) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0174, code lost:
        if ((r4.flags & 4) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0177, code lost:
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0o(long r21, long r23) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC05966m.A0o(long, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r3.equals(r4) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0p(com.facebook.ads.redexgen.X.DL r5) {
        /*
            java.lang.String r4 = r5.A02
            int r1 = com.facebook.ads.redexgen.X.IK.A02
            r0 = 17
            if (r1 > r0) goto L48
            r2 = 565(0x235, float:7.92E-43)
            r1 = 24
            r0 = 59
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L8e
            r2 = 418(0x1a2, float:5.86E-43)
            r1 = 31
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r3 = A0Z(r2, r1, r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e
            r0 = 3
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L95
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e
            java.lang.String r1 = "T6E03jzw5"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "yprIxAfnT"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r3.equals(r4)
            if (r0 != 0) goto L8e
        L48:
            java.lang.String r3 = com.facebook.ads.redexgen.X.IK.A05
            r2 = 139(0x8b, float:1.95E-43)
            r1 = 6
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L93
            r2 = 135(0x87, float:1.89E-43)
            r1 = 4
            r0 = 85
            java.lang.String r1 = A0Z(r2, r1, r0)
            java.lang.String r0 = com.facebook.ads.redexgen.X.IK.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L93
            boolean r3 = r5.A05
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e
            r0 = 3
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L90
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e
            java.lang.String r1 = "BJGPxEdVUzMLNtirl91eFhgnBGweQDs4"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "zlX9yGsKra4NhbpSqGzMUztPzbxTVPIW"
            r0 = 5
            r2[r0] = r1
            if (r3 == 0) goto L93
        L8e:
            r0 = 1
        L8f:
            return r0
        L90:
            if (r3 == 0) goto L93
            goto L8e
        L93:
            r0 = 0
            goto L8f
        L95:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC05966m.A0p(com.facebook.ads.redexgen.X.DL):boolean");
    }

    public static boolean A0q(String str) {
        if (IK.A02 > 23 || !A0Z(540, 25, 71).equals(str)) {
            int i10 = IK.A02;
            String[] strArr = A0e;
            if (strArr[3].charAt(27) != strArr[5].charAt(27)) {
                String[] strArr2 = A0e;
                strArr2[6] = "9RImieNhPQC6RsB3uCQpNzq";
                strArr2[2] = "LbY4QmV7JG8OGYeLFRPqX8R";
                if (i10 <= 19) {
                    if (!A0Z(738, 6, 49).equals(IK.A03) || (!A0Z(449, 31, 43).equals(str) && !A0Z(480, 38, 98).equals(str))) {
                    }
                }
                return false;
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean A0r(String str) {
        return IK.A02 == 21 && A0Z(518, 22, 55).equals(str);
    }

    public static boolean A0s(String str) {
        return IK.A02 < 18 || (IK.A02 == 18 && (A0Z(381, 15, 87).equals(str) || A0Z(396, 22, 49).equals(str))) || (IK.A02 == 19 && IK.A06.startsWith(A0Z(603, 7, 58)) && (A0Z(237, 18, 65).equals(str) || A0Z(FunctionEval.FunctionID.EXTERNAL_FUNC, 25, 12).equals(str)));
    }

    public static boolean A0t(String str, Format format) {
        if (IK.A02 < 21 && format.A0P.isEmpty()) {
            boolean equals = A0Z(305, 25, 73).equals(str);
            String[] strArr = A0e;
            if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[6] = "MfUpXDWwlgjpIzkQpGQ69jh";
            strArr2[2] = "6M28L7pIoNUbygZ8mQEy8q1";
            if (equals) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0u(String str, Format format) {
        return IK.A02 <= 18 && format.A05 == 1 && A0Z(280, 25, ShapeTypes.VERTICAL_SCROLL).equals(str);
    }

    private boolean A0v(boolean z10) throws C06589h {
        if (0 == 0 || (!z10 && this.A0c)) {
            return false;
        }
        throw new NullPointerException(A0Z(723, 8, 50));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee
    public void A13() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee
    public void A14() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee
    public void A15() {
        this.A07 = null;
        try {
            A1H();
            if (0 != 0) {
                try {
                    throw new NullPointerException(A0Z(750, 14, 89));
                } catch (Throwable th2) {
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new NullPointerException(A0Z(750, 14, 89));
                        } finally {
                        }
                    }
                    throw th2;
                }
            } else if (0 != 0 && 0 != 0) {
                try {
                    throw new NullPointerException(A0Z(750, 14, 89));
                } finally {
                }
            } else {
                this.A08 = null;
                String[] strArr = A0e;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0e;
                strArr2[6] = "grBGXm61Y9KpFOsllqLilTu";
                strArr2[2] = "sgN5ocMNWUzsZlDnPC4yFnx";
                this.A09 = null;
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                try {
                    throw new NullPointerException(A0Z(750, 14, 89));
                } catch (Throwable th4) {
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new NullPointerException(A0Z(750, 14, 89));
                        } finally {
                        }
                    }
                    throw th4;
                }
            } else if (0 != 0 && 0 != 0) {
                try {
                    throw new NullPointerException(A0Z(750, 14, 89));
                } finally {
                }
            } else {
                throw th3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee
    public void A16(long j10, boolean z10) throws C06589h {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee
    public void A17(boolean z10) throws C06589h {
        this.A0U = new BH();
    }

    public final MediaCodec A1D() {
        return this.A06;
    }

    public final DL A1E() {
        return this.A0A;
    }

    public DL A1F(DR dr, Format format, boolean z10) throws DU {
        return dr.A7A(format.A0O, z10);
    }

    public void A1G() throws C06589h {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (!this.A0H) {
            boolean z10 = this.A0E;
            String[] strArr = A0e;
            if (strArr[1].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[3] = "AcAf7FDebpG1tI2m1dN3Mb3j6Ch0chZ8";
            strArr2[5] = "r6t4NoBnkCgbgPTEJXdySK25KRKv5vPZ";
            if (!z10 || !this.A0K) {
                if (this.A02 != 0) {
                    A1H();
                    A1J();
                } else {
                    this.A06.flush();
                    this.A0J = false;
                }
                if (!this.A0L && this.A07 != null) {
                    this.A01 = 1;
                    return;
                }
            }
        }
        A1H();
        A1J();
        if (!this.A0L) {
        }
    }

    public void A1H() {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0g();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    if (0 != 0) {
                        String[] strArr = A0e;
                        if (strArr[6].length() != strArr[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0e;
                        strArr2[0] = "0w4YqF15pbfYhi8hBAmOHeRcKTIYDC15";
                        strArr2[4] = "pbmkRjY64OMYpYUCMjYZppA8YisD1A9o";
                        if (0 != 0) {
                            try {
                                throw new NullPointerException(A0Z(750, 14, 89));
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th2) {
                    this.A06 = null;
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new NullPointerException(A0Z(750, 14, 89));
                        } finally {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new NullPointerException(A0Z(750, 14, 89));
                        } finally {
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    this.A06 = null;
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new NullPointerException(A0Z(750, 14, 89));
                        } finally {
                        }
                    }
                    throw th4;
                }
            }
        }
    }

    public void A1I() throws C06589h {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r7 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r7 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
        r14.A0A = A1F(r14.A0a, r14.A07, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r14.A0A != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
        if (0 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
        r14.A0A = A1F(r14.A0a, r14.A07, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
        if (r14.A0A == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
        r1 = A0Z(219, 18, 51);
        r8 = new java.lang.StringBuilder();
        r0 = A0Z(lib.zj.office.fc.ss.usermodel.ShapeTypes.FLOW_CHART_PUNCHED_TAPE, 40, 56);
        r7 = r8.append(r0).append(r6);
        r0 = A0Z(0, 58, 90);
        r2 = r7.append(r0);
        r0 = r14.A0A.A02;
        r7 = r2.append(r0);
        r0 = A0Z(58, 1, 58);
        android.util.Log.w(r1, r7.append(r0).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
        if (r14.A0A != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
        A0k(new com.facebook.ads.redexgen.X.DN(r14.A07, (java.lang.Throwable) null, false, -49999));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fb, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fc, code lost:
        r6 = A1R(r14.A0A);
        r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e;
        r1 = r2[6];
        r0 = r2[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
        if (r1.length() == r0.length()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0116, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
        A0k(new com.facebook.ads.redexgen.X.DN(r14.A07, (java.lang.Throwable) r3, false, -49998));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0125, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0126, code lost:
        r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e;
        r2[1] = "T0kOg2K1f";
        r2[7] = "P8Drvnvfp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0132, code lost:
        if (r6 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0134, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0135, code lost:
        r9 = r14.A0A.A02;
        r14.A00 = A0W(r9);
        r14.A0D = A0t(r9, r14.A07);
        r14.A0H = A0s(r9);
        r14.A0G = A0p(r14.A0A);
        r14.A0E = A0q(r9);
        r14.A0F = A0r(r9);
        r14.A0I = A0u(r9, r14.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0169, code lost:
        r7 = android.os.SystemClock.elapsedRealtime();
        r6 = new java.lang.StringBuilder();
        r0 = A0Z(665, 12, 125);
        com.facebook.ads.redexgen.X.IH.A02(r6.append(r0).append(r9).toString());
        r14.A06 = android.media.MediaCodec.createByCodecName(r9);
        com.facebook.ads.redexgen.X.IH.A00();
        r0 = A0Z(651, 14, 108);
        com.facebook.ads.redexgen.X.IH.A02(r0);
        A1O(r14.A0A, r14.A06, r14.A07, null);
        com.facebook.ads.redexgen.X.IH.A00();
        r0 = A0Z(764, 10, 19);
        com.facebook.ads.redexgen.X.IH.A02(r0);
        r14.A06.start();
        com.facebook.ads.redexgen.X.IH.A00();
        r10 = android.os.SystemClock.elapsedRealtime();
        A1P(r9, r10, r10 - r7);
        A0c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d4, code lost:
        if (A8P() != 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d6, code lost:
        r4 = android.os.SystemClock.elapsedRealtime() + 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01dd, code lost:
        r14.A05 = r4;
        A0h();
        A0i();
        r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e;
        r1 = r2[6];
        r0 = r2[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f5, code lost:
        if (r1.length() == r0.length()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fc, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01fd, code lost:
        r4 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0203, code lost:
        r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e;
        r2[6] = "lPLsFaGBdunuftytlmVmE5U";
        r2[2] = "1oPCWqlNg5GTRHTUlg1n75L";
        r14.A0Q = true;
        r14.A0U.A00++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0218, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0219, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021a, code lost:
        A0k(new com.facebook.ads.redexgen.X.DN(r14.A07, (java.lang.Throwable) r2, false, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0225, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1J() throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC05966m.A1J():void");
    }

    public void A1K(long j10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
        if (r0.A08 == r4.A08) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1M(com.facebook.ads.internal.exoplayer2.thirdparty.Format r8) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            r7 = this;
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r4 = r7.A07
            r7.A07 = r8
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r7.A07
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r2 = r0.A0H
            r1 = 0
            if (r4 != 0) goto L30
            r0 = r1
        Lc:
            boolean r0 = com.facebook.ads.redexgen.X.IK.A0g(r2, r0)
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L4d
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r7.A07
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r0 = r0.A0H
            if (r0 == 0) goto L4b
            r0 = 0
            if (r0 == 0) goto L33
            android.os.Looper.myLooper()
            r2 = 624(0x270, float:8.74E-43)
            r1 = 14
            r0 = 32
            java.lang.String r1 = A0Z(r2, r1, r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L30:
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r0 = r4.A0H
            goto Lc
        L33:
            r2 = 185(0xb9, float:2.59E-43)
            r1 = 34
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = A0Z(r2, r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            int r0 = r7.A0z()
            com.facebook.ads.redexgen.X.9h r0 = com.facebook.ads.redexgen.X.C06589h.A01(r1, r0)
            throw r0
        L4b:
            r7.A09 = r1
        L4d:
            r6 = 0
            r1 = 0
            r0 = 0
            if (r1 != r0) goto Lb4
            android.media.MediaCodec r5 = r7.A06
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 11
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L6e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC05966m.A0e
            java.lang.String r1 = "PyaEaLonZ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QvQAspLXO"
            r0 = 7
            r2[r0] = r1
            if (r5 == 0) goto Lb4
            android.media.MediaCodec r2 = r7.A06
            com.facebook.ads.redexgen.X.DL r1 = r7.A0A
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r7.A07
            int r0 = r7.A1B(r2, r1, r4, r0)
            switch(r0) {
                case 0: goto Lb4;
                case 1: goto Lb3;
                case 2: goto L89;
                case 3: goto L8f;
                default: goto L89;
            }
        L89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L8f:
            r6 = 1
            r7.A0L = r3
            r7.A01 = r3
            int r1 = r7.A00
            r0 = 2
            if (r1 == r0) goto Lad
            int r0 = r7.A00
            if (r0 != r3) goto Lb1
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r7.A07
            int r1 = r0.A0F
            int r0 = r4.A0F
            if (r1 != r0) goto Lb1
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r7.A07
            int r1 = r0.A08
            int r0 = r4.A08
            if (r1 != r0) goto Lb1
        Lad:
            r0 = 1
        Lae:
            r7.A0C = r0
            goto Lb4
        Lb1:
            r0 = 0
            goto Lae
        Lb3:
            r6 = 1
        Lb4:
            if (r6 != 0) goto Lbc
            boolean r0 = r7.A0J
            if (r0 == 0) goto Lbd
            r7.A02 = r3
        Lbc:
            return
        Lbd:
            r7.A1H()
            r7.A1J()
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC05966m.A1M(com.facebook.ads.internal.exoplayer2.thirdparty.Format):void");
    }

    public boolean A1R(DL dl2) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public boolean A9Q() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public boolean A9b() {
        return (this.A07 == null || this.A0R || (!A19() && !A0m() && (this.A05 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.A05))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r0 == (-5)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        A1M(r6.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (r0 == (-5)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
        if (r0 != (-4)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
        com.facebook.ads.redexgen.X.AbstractC0844Hf.A04(r6.A0Y.A04());
        r6.A0M = true;
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        return;
     */
    @Override // com.facebook.ads.redexgen.X.ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFe(long r7, long r9) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC05966m.AFe(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final int AH6(Format format) throws C06589h {
        try {
            return A1C(this.A0a, null, format);
        } catch (DU e10) {
            throw C06589h.A01(e10, A0z());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee, com.facebook.ads.redexgen.X.AF
    public final int AH8() {
        return 8;
    }
}
