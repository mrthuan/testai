package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import java.nio.ByteBuffer;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.3G */
/* loaded from: assets/audience_network.dex */
public final class C3G extends AbstractC05966m implements InterfaceC0860Hv {
    public static byte[] A0E;
    public static String[] A0F = {"L3tWfB", "F", "EhmjBoqWglyFdQALN75wPmPOVrs4sx1V", "uULe", "m", "RQeZ6095wSpXx7VlLYK0RIZgP3RCEpJD", "T11R5eeuDEJdKCYsxGC1ZLgakYf", "g49TrngkoNyO86UN189kQplFANk"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final C0689An A0C;
    public final InterfaceC0695At A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{Field.GLOSSARY, Field.DDE, 56, 78, Field.MACROBUTTON, Field.PAGEREF, Field.QUOTE, 78, 1, 1, 3, 78, 4, 5, 3, Field.IMPORT, Field.AUTONUMLGL, 32, 86, 31, 23, 23, 31, 20, 29, 86, 10, 25, 15, 86, Field.NUMCHARS, 29, Field.NUMWORDS, 23, Field.NUMCHARS, 29, 10, Field.AUTONUMLGL, 58, 48, Field.ASK, 59, 61, 48, 122, Field.FILLIN, 59, Field.GOTOBUTTON, 32, Field.QUOTE, Field.AUTONUMLGL, Field.ASK, Field.EQ, 122, 56, Field.EQ, Field.AUTONUMLGL, 58, Field.AUTONUM, Field.AUTONUMLGL, Field.IMPORT, Field.BARCODE, 117, 97, 112, 125, 123, 59, 102, 117, 99, 13, 6, 15, 0, 0, 11, 2, Field.INCLUDEPICTURE, 13, 1, Field.NUMWORDS, 0, 26, 14, 3, 20, 9, 10, 18, 3, 102, 107, 124, 97, Byte.MAX_VALUE, 98, 122, 107, Field.ADVANCE, Field.HYPERLINK, Field.SECTION, 20, 80, Field.CONTROL, Field.TOA, 76, 77, 20, 74, 80, Field.INCLUDEPICTURE, Field.BIDIOUTLINE, 5, 1, 5, 13, Field.MACROBUTTON, Field.EQ, 42, 44, Field.EQ, 42, Field.IMPORT, 58, 36, Field.AUTONUM, 58, Field.FILLIN, 59, Field.GOTOBUTTON, 122, Field.PAGEREF, Field.AUTONUM, Field.QUOTE, Field.GOTOBUTTON, 30, 12, 0, 30, 24, 3, 10, 98, 125, 106, 119, 126, 116, 108, 125};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(Context context, DR dr, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, boolean z10, Handler handler, InterfaceC0690Ao interfaceC0690Ao, AZ az, InterfaceC0682Ag... interfaceC0682AgArr) {
        this(context, dr, interfaceC0707Bh, z10, handler, interfaceC0690Ao, new Z3(az, interfaceC0682AgArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(Context context, DR dr, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, boolean z10, Handler handler, InterfaceC0690Ao interfaceC0690Ao, InterfaceC0695At interfaceC0695At) {
        super(1, dr, interfaceC0707Bh, z10);
        this.A0B = context.getApplicationContext();
        this.A0D = interfaceC0695At;
        this.A0C = new C0689An(handler, interfaceC0690Ao);
        interfaceC0695At.AGU(new Z1(this));
    }

    private int A00(DL dl2, Format format) {
        PackageManager packageManager;
        if (IK.A02 < 24 && A04(15, 22, 57).equals(dl2.A02)) {
            boolean z10 = true;
            if (IK.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null) {
                boolean needsRawDecoderWorkaround = packageManager.hasSystemFeature(A04(37, 25, 21));
                if (needsRawDecoderWorkaround) {
                    z10 = false;
                }
            }
            if (z10) {
                return -1;
            }
        }
        int i10 = format.A09;
        if (A0F[4].length() != 17) {
            A0F[2] = "fXqyV5kw6OT7Wtv8kj4AmKP3XzDFjN9J";
            return i10;
        }
        throw new RuntimeException();
    }

    private final int A01(DL dl2, Format format, Format[] formatArr) {
        int maxInputSize = A00(dl2, format);
        return maxInputSize;
    }

    private final MediaFormat A02(Format format, String str, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 41), str);
        mediaFormat.setInteger(A04(71, 13, 47), format.A05);
        mediaFormat.setInteger(A04(125, 11, 22), format.A0C);
        DX.A06(mediaFormat, format.A0P);
        DX.A04(mediaFormat, A04(99, 14, 120), i10);
        if (IK.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 2), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long A72 = this.A0D.A72(A9Q());
        if (A72 != Long.MIN_VALUE) {
            if (!this.A08) {
                long newCurrentPositionUs = this.A05;
                A72 = Math.max(newCurrentPositionUs, A72);
            }
            this.A05 = A72;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (IK.A02 < 24 && A04(0, 15, 33).equals(str)) {
            if (A04(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 7, 44).equals(IK.A05) && (IK.A03.startsWith(A04(ShapeTypes.FLOW_CHART_CONNECTOR, 8, 89)) || IK.A03.startsWith(A04(84, 7, 39)) || IK.A03.startsWith(A04(91, 8, 79)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int A00 = AbstractC0862Hx.A00(str);
        return A00 != 0 && this.A0D.A9P(A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A13() {
        super.A13();
        this.A0D.AEV();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A15() {
        try {
            this.A0D.AEy();
            try {
                super.A15();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.A15();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A16(long j10, boolean z10) throws C06589h {
        super.A16(j10, z10);
        this.A0D.reset();
        this.A05 = j10;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A17(boolean z10) throws C06589h {
        super.A17(z10);
        this.A0C.A05(this.A0U);
        int i10 = A12().A00;
        if (i10 != 0) {
            this.A0D.A5s(i10);
        } else {
            this.A0D.A5V();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final int A1B(MediaCodec mediaCodec, DL dl2, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final int A1C(DR dr, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, Format format) throws DU {
        String str = format.A0O;
        boolean z10 = false;
        if (AbstractC0862Hx.A09(str)) {
            int i10 = IK.A02 >= 21 ? 32 : 0;
            boolean A0y = AbstractC0780Ee.A0y(interfaceC0707Bh, format.A0H);
            int i11 = 4;
            if (A0y && A09(str) && dr.A80() != null) {
                return i10 | 8 | 4;
            }
            String mimeType = A04(62, 9, 85);
            if ((!mimeType.equals(str) || this.A0D.A9P(format.A0A)) && this.A0D.A9P(2)) {
                boolean supportsFormatDrm = false;
                DrmInitData drmInitData = format.A0H;
                if (drmInitData != null) {
                    for (int tunnelingSupport = 0; tunnelingSupport < drmInitData.A01; tunnelingSupport++) {
                        supportsFormatDrm |= drmInitData.A01(tunnelingSupport).A03;
                    }
                }
                DL A7A = dr.A7A(str, supportsFormatDrm);
                if (A7A == null) {
                    return (!supportsFormatDrm || dr.A7A(str, false) == null) ? 1 : 2;
                } else if (!A0y) {
                    return 2;
                } else {
                    if (IK.A02 < 21 || ((format.A0C == -1 || A7A.A0G(format.A0C)) && (format.A05 == -1 || A7A.A0F(format.A05)))) {
                        z10 = true;
                    }
                    if (!z10) {
                        i11 = 3;
                    }
                    return i10 | 8 | i11;
                }
            }
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final DL A1F(DR dr, Format format, boolean z10) throws DU {
        if (A09(format.A0O)) {
            DL A80 = dr.A80();
            if (A0F[4].length() == 17) {
                throw new RuntimeException();
            }
            A0F[5] = "METof3tp25mzHZV7OR2UQ1qqc32h0eLf";
            if (A80 != null) {
                return A80;
            }
        }
        DL passthroughDecoderInfo = super.A1F(dr, format, z10);
        return passthroughDecoderInfo;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1I() throws C06589h {
        try {
            this.A0D.AEW();
        } catch (C0694As e10) {
            throw C06589h.A01(e10, A0z());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:37:0x0047 */
    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1L(android.media.MediaCodec r11, android.media.MediaFormat r12) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            r10 = this;
            android.media.MediaFormat r0 = r10.A06
            if (r0 == 0) goto L4e
            android.media.MediaFormat r3 = r10.A06
            r2 = 113(0x71, float:1.58E-43)
            r1 = 4
            r0 = 41
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r0 = r3.getString(r0)
            int r3 = com.facebook.ads.redexgen.X.AbstractC0862Hx.A00(r0)
            android.media.MediaFormat r12 = r10.A06
        L19:
            r2 = 71
            r1 = 13
            r0 = 47
            java.lang.String r0 = A04(r2, r1, r0)
            int r4 = r12.getInteger(r0)
            r2 = 125(0x7d, float:1.75E-43)
            r1 = 11
            r0 = 22
            java.lang.String r0 = A04(r2, r1, r0)
            int r5 = r12.getInteger(r0)
            boolean r0 = r10.A09
            if (r0 == 0) goto L51
            r1 = 6
            if (r4 != r1) goto L51
            int r0 = r10.A00
            if (r0 >= r1) goto L51
            int r0 = r10.A00
            int[] r7 = new int[r0]
            r1 = 0
        L45:
            int r0 = r10.A00
            if (r1 >= r0) goto L52
            r7[r1] = r1
            int r1 = r1 + 1
            goto L45
        L4e:
            int r3 = r10.A04
            goto L19
        L51:
            r7 = 0
        L52:
            com.facebook.ads.redexgen.X.At r2 = r10.A0D     // Catch: com.facebook.ads.redexgen.X.C0691Ap -> L5d
            int r8 = r10.A02     // Catch: com.facebook.ads.redexgen.X.C0691Ap -> L5d
            int r9 = r10.A03     // Catch: com.facebook.ads.redexgen.X.C0691Ap -> L5d
            r6 = 0
            r2.A4l(r3, r4, r5, r6, r7, r8, r9)     // Catch: com.facebook.ads.redexgen.X.C0691Ap -> L5d
            return
        L5d:
            r1 = move-exception
            int r0 = r10.A0z()
            com.facebook.ads.redexgen.X.9h r0 = com.facebook.ads.redexgen.X.C06589h.A01(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3G.A1L(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1M(Format format) throws C06589h {
        int i10;
        super.A1M(format);
        this.A0C.A03(format);
        if (A04(62, 9, 85).equals(format.A0O)) {
            i10 = format.A0A;
        } else {
            i10 = 2;
        }
        this.A04 = i10;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1N(C1292Yw c1292Yw) {
        if (this.A07 && !c1292Yw.A03()) {
            if (Math.abs(c1292Yw.A00 - this.A05) > 500000) {
                this.A05 = c1292Yw.A00;
            }
            if (A0F[2].charAt(22) != 'P') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "FWwhG0BBvDuToIoVEugJsm3ERbG";
            strArr[7] = "3ppC0HmXHA3R3HDH3tVsAea2i0b";
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1O(DL dl2, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(dl2, format, A1A());
        this.A09 = A08(dl2.A02);
        this.A0A = dl2.A04;
        MediaFormat A02 = A02(format, dl2.A01 == null ? A04(62, 9, 85) : dl2.A01, this.A01);
        mediaCodec.configure(A02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = A02;
            MediaFormat mediaFormat = this.A06;
            String A04 = A04(113, 4, 41);
            String codecMimeType = format.A0O;
            mediaFormat.setString(A04, codecMimeType);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1P(String str, long j10, long j11) {
        this.A0C.A06(str, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final boolean A1Q(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws C06589h {
        if (this.A0A && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        } else if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.A0U.A08++;
            this.A0D.A8s();
            return true;
        } else {
            try {
                if (this.A0D.A8p(byteBuffer, j12)) {
                    mediaCodec.releaseOutputBuffer(i10, false);
                    this.A0U.A06++;
                    return true;
                }
                return false;
            } catch (C0692Aq | C0694As e10) {
                throw C06589h.A01(e10, A0z());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee, com.facebook.ads.redexgen.X.ZA
    public final InterfaceC0860Hv A7l() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Hv
    public final A2 A85() {
        return this.A0D.A85();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Hv
    public final long A88() {
        if (A8P() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee, com.facebook.ads.redexgen.X.AC
    public final void A8t(int i10, Object obj) throws C06589h {
        switch (i10) {
            case 2:
                this.A0D.setVolume(((Float) obj).floatValue());
                return;
            case 3:
                this.A0D.AGI((AY) obj);
                return;
            default:
                super.A8t(i10, obj);
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.ZA
    public final boolean A9Q() {
        return super.A9Q() && this.A0D.A9Q();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.ZA
    public final boolean A9b() {
        if (!this.A0D.A8y()) {
            boolean A9b = super.A9b();
            if (A0F[2].charAt(22) != 'P') {
                throw new RuntimeException();
            }
            A0F[4] = "YoWTwZwJQMw1hShhdJ";
            if (!A9b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Hv
    public final A2 AGa(A2 a22) {
        return this.A0D.AGa(a22);
    }
}
