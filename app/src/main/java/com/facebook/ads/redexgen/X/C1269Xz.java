package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.IOException;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* renamed from: com.facebook.ads.redexgen.X.Xz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1269Xz implements InterfaceC0723Bx {
    public static String[] A08 = {"TOwSaeopWt9RIXmRrRQZwDuesIPAjimN", "m0YfCnzLjOMwBkPVrsGxjCiWTjg4eRpW", "OSs4RcvEx1fqe6WQBFkQnVWQQo5eEQ5g", "d1b9lbTXuFgKm0nY", "40KeqNYkGIg2lKcWJqrJfIqB2UKZ02Df", "7BwS2S40JWuyc5xmMzDJ", "w0DKA7VvSD5aMvU9byhgHeDf3SsHODBV", "AZ8mKiYMDCexUwniF0cO0Lykq6xa72Qc"};
    public static final C0 A09 = new Y0();
    public long A00;
    public InterfaceC0725Bz A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<DA> A05;
    public final I4 A06;
    public final IG A07;

    public C1269Xz() {
        this(new IG(0L));
    }

    public C1269Xz(IG ig2) {
        this.A07 = ig2;
        this.A06 = new I4(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        this.A01 = interfaceC0725Bz;
        interfaceC0725Bz.AG8(new C1284Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        long j10;
        if (interfaceC0724By.AEP(this.A06.A00, 0, 4, true)) {
            this.A06.A0Y(0);
            int A082 = this.A06.A08();
            if (A082 == 441) {
                return -1;
            }
            if (A082 == 442) {
                interfaceC0724By.AEO(this.A06.A00, 0, 10);
                this.A06.A0Y(9);
                int nextStartCode = this.A06.A0E();
                interfaceC0724By.AGq((nextStartCode & 7) + 14);
                return 0;
            } else if (A082 == 443) {
                interfaceC0724By.AEO(this.A06.A00, 0, 2);
                this.A06.A0Y(0);
                int nextStartCode2 = this.A06.A0I();
                interfaceC0724By.AGq(nextStartCode2 + 6);
                return 0;
            } else {
                int nextStartCode3 = A082 & (-256);
                if ((nextStartCode3 >> 8) != 1) {
                    interfaceC0724By.AGq(1);
                    return 0;
                }
                int i10 = A082 & FunctionEval.FunctionID.EXTERNAL_FUNC;
                DA da2 = this.A05.get(i10);
                if (!this.A02) {
                    if (da2 == null) {
                        D3 elementaryStreamReader = null;
                        if (i10 == 189) {
                            elementaryStreamReader = new YE();
                            this.A03 = true;
                            this.A00 = interfaceC0724By.A86();
                        } else if ((i10 & 224) == 192) {
                            elementaryStreamReader = new Y2();
                            this.A03 = true;
                            this.A00 = interfaceC0724By.A86();
                        } else if ((i10 & 240) == 224) {
                            elementaryStreamReader = new Y7();
                            this.A04 = true;
                            this.A00 = interfaceC0724By.A86();
                        }
                        if (elementaryStreamReader != null) {
                            elementaryStreamReader.A5B(this.A01, new DH(i10, 256));
                            da2 = new DA(elementaryStreamReader, this.A07);
                            this.A05.put(i10, da2);
                        }
                    }
                    if (this.A03 && this.A04) {
                        j10 = this.A00 + 8192;
                    } else {
                        j10 = 1048576;
                    }
                    if (interfaceC0724By.A86() > j10) {
                        this.A02 = true;
                        this.A01.A5u();
                    }
                }
                interfaceC0724By.AEO(this.A06.A00, 0, 2);
                this.A06.A0Y(0);
                int nextStartCode4 = this.A06.A0I();
                int i11 = nextStartCode4 + 6;
                if (da2 == null) {
                    interfaceC0724By.AGq(i11);
                } else {
                    I4 i42 = this.A06;
                    if (A08[3].length() != 16) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A08;
                    strArr[1] = "j5TposUyMNBjvJQv7fBjXCxPICHPLvzQ";
                    strArr[4] = "7epKzrJqV329mASYJ56vhWx8nQlYd13J";
                    i42.A0W(i11);
                    interfaceC0724By.readFully(this.A06.A00, 0, i11);
                    this.A06.A0Y(6);
                    da2.A03(this.A06);
                    I4 i43 = this.A06;
                    int nextStartCode5 = this.A06.A05();
                    i43.A0X(nextStartCode5);
                }
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AG7(long r6, long r8) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.IG r0 = r5.A07
            r0.A08()
            r4 = 0
        L6:
            android.util.SparseArray<com.facebook.ads.redexgen.X.DA> r0 = r5.A05
            int r0 = r0.size()
            if (r4 >= r0) goto L3b
            android.util.SparseArray<com.facebook.ads.redexgen.X.DA> r0 = r5.A05
            java.lang.Object r3 = r0.valueAt(r4)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1269Xz.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1269Xz.A08
            java.lang.String r1 = "i2l135vnIgvDI5cE6wxXd3NswI9xNsO1"
            r0 = 0
            r2[r0] = r1
            com.facebook.ads.redexgen.X.DA r3 = (com.facebook.ads.redexgen.X.DA) r3
            r3.A02()
            int r4 = r4 + 1
            goto L6
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1269Xz.AG7(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final boolean AGs(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        interfaceC0724By.AEO(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        int packStuffingLength = bArr[13] & 7;
        interfaceC0724By.A3s(packStuffingLength);
        interfaceC0724By.AEO(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i10 = (packStuffingLength2 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 16;
        int packStuffingLength3 = bArr[1];
        int i11 = i10 | ((packStuffingLength3 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & FunctionEval.FunctionID.EXTERNAL_FUNC) | i11);
    }
}
