package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class X5 implements InterfaceC0838Gz {
    public static byte[] A0A;
    public InterfaceC0838Gz A00;
    public InterfaceC0838Gz A01;
    public InterfaceC0838Gz A02;
    public InterfaceC0838Gz A03;
    public InterfaceC0838Gz A04;
    public InterfaceC0838Gz A05;
    public InterfaceC0838Gz A06;
    public final Context A07;
    public final InterfaceC0838Gz A08;
    public final HL<? super InterfaceC0838Gz> A09;

    static {
        A07();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-105, -55, -42, -52, -38, -41, -47, -52, -57, -55, -37, -37, -51, -36, -105, 1, Field.AUTONUMOUT, Field.AUTONUMOUT, Field.PAGEREF, Field.DDE, 48, Field.AUTONUMOUT, 41, Field.DDEAUTO, Field.FILLIN, -32, Field.AUTONUMOUT, Field.GLOSSARY, -32, 48, 44, 33, Field.SYMBOL, -32, 18, 20, 13, 16, -32, Field.MACROBUTTON, Field.AUTONUMOUT, Field.GOTOBUTTON, Field.PAGEREF, 33, Field.DDE, -32, Field.IMPORT, 41, Field.AUTONUMOUT, Field.DATA, Field.GLOSSARY, Field.AUTONUMLGL, Field.AUTONUMOUT, -32, 36, Field.PAGEREF, 48, Field.PAGEREF, Field.DDEAUTO, 36, 41, Field.DDEAUTO, Field.FILLIN, -32, Field.GLOSSARY, Field.DDEAUTO, -32, Field.AUTONUMOUT, Field.DATA, Field.PAGEREF, -32, 18, 20, 13, 16, -32, Field.PAGEREF, 56, Field.AUTONUMOUT, Field.PAGEREF, Field.DDEAUTO, Field.MACROBUTTON, 41, Field.GLOSSARY, Field.DDEAUTO, -54, -21, -20, -25, -5, -14, -6, -54, -25, -6, -25, -39, -11, -5, -8, -23, -21, -73, -28, -28, -31, -28, -110, -37, -32, -27, -26, -45, -32, -26, -37, -45, -26, -37, -32, -39, -110, -60, -58, -65, -62, -110, -41, -22, -26, -41, -32, -27, -37, -31, -32, -14, 4, 4, -10, 5, -15, -3, -5, -68, -12, -17, -15, -13, -16, -3, -3, -7, -68, -17, -14, 1, -68, -9, -4, 2, -13, 0, -4, -17, -6, -68, -13, 6, -3, -2, -6, -17, 7, -13, 0, -64, -68, -13, 6, 2, -68, 0, 2, -5, -2, -68, -32, 2, -5, -2, -46, -17, 2, -17, -31, -3, 3, 0, -15, -13, -75, -63, -64, -58, -73, -64, -58, -52, -55, -36, -55, Field.AUTONUMOUT, Field.QUOTE, Field.SYMBOL, Field.AUTONUMOUT, Field.FILLIN, Field.AUTONUMLGL, Field.EQ, Field.IMPORT, Field.AUTONUMOUT, Field.PAGEREF, Field.FILLIN, -36, -34, -41, -38};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public X5(Context context, HL<? super InterfaceC0838Gz> hl2, InterfaceC0838Gz interfaceC0838Gz) {
        this.A07 = context.getApplicationContext();
        this.A09 = hl2;
        this.A08 = (InterfaceC0838Gz) AbstractC0844Hf.A01(interfaceC0838Gz);
    }

    private InterfaceC0838Gz A00() {
        if (this.A00 == null) {
            this.A00 = new XA(this.A07, this.A09);
        }
        return this.A00;
    }

    private InterfaceC0838Gz A01() {
        if (this.A01 == null) {
            this.A01 = new X9(this.A07, this.A09);
        }
        return this.A01;
    }

    private InterfaceC0838Gz A02() {
        if (this.A02 == null) {
            this.A02 = new X8();
        }
        return this.A02;
    }

    private InterfaceC0838Gz A03() {
        if (this.A04 == null) {
            this.A04 = new X1(this.A09);
        }
        return this.A04;
    }

    private InterfaceC0838Gz A04() {
        if (this.A05 == null) {
            this.A05 = new C1240Wt(this.A07, this.A09);
        }
        return this.A05;
    }

    private InterfaceC0838Gz A05() {
        if (this.A06 == null) {
            try {
                this.A06 = (InterfaceC0838Gz) Class.forName(A06(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 60, 64)).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(A06(85, 17, 56), A06(15, 70, 114));
            } catch (Exception e10) {
                throw new RuntimeException(A06(102, 34, 36), e10);
            }
            if (this.A06 == null) {
                this.A06 = this.A08;
            }
        }
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final Uri A8c() {
        if (this.A03 == null) {
            return null;
        }
        return this.A03.A8c();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final long AEE(H3 h32) throws IOException {
        AbstractC0844Hf.A04(this.A03 == null);
        String scheme = h32.A04.getScheme();
        if (IK.A0e(h32.A04)) {
            String path = h32.A04.getPath();
            String scheme2 = A06(0, 15, 26);
            if (path.startsWith(scheme2)) {
                this.A03 = A00();
            } else {
                this.A03 = A03();
            }
        } else {
            String scheme3 = A06(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 5, 67);
            if (scheme3.equals(scheme)) {
                this.A03 = A00();
            } else {
                String scheme4 = A06(201, 7, 4);
                if (scheme4.equals(scheme)) {
                    this.A03 = A01();
                } else {
                    String scheme5 = A06(223, 4, 28);
                    if (scheme5.equals(scheme)) {
                        this.A03 = A05();
                    } else {
                        String scheme6 = A06(208, 4, 26);
                        if (scheme6.equals(scheme)) {
                            this.A03 = A02();
                        } else {
                            String scheme7 = A06(212, 11, 116);
                            if (scheme7.equals(scheme)) {
                                this.A03 = A04();
                            } else {
                                this.A03 = this.A08;
                            }
                        }
                    }
                }
            }
        }
        return this.A03.AEE(h32);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final void close() throws IOException {
        if (this.A03 != null) {
            try {
                this.A03.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0838Gz
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.A03.read(bArr, i10, i11);
    }
}
