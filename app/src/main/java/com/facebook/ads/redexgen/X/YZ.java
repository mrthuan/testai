package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class YZ implements InterfaceC0723Bx {
    public static byte[] A0E;
    public static String[] A0F = {"gDm2H1R3m6yZ3T7V59CZPndmLoiqHRQj", "YSWu78fDKIpmvI0F4t4nR2Q3czKooreS", "12WKKiTRAgVXDyndmQKPSMB1OWZuMVMS", "RRcKBVagkGMLXlkVdQcqgvrWfP2Vnh6L", "1", "PIbxLRQ24m9lmu6H9QUm2hoYxLQCtqJ9", "Ogtu3pi4aRA4nU43PccgmX4SJllkopYZ", "F8bPDucd7xmw9lysYZ4"};
    public static final C0 A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC0725Bz A04;
    public C9 A05;
    public InterfaceC1270Ya A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C1 A0A;
    public final C2 A0B;
    public final C3 A0C;
    public final I4 A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        if (A0F[4].length() != 1) {
            throw new RuntimeException();
        }
        A0F[4] = "A";
        A0E = new byte[]{Field.FORMCHECKBOX, 96, 104, 97, 96, 86, 82, Field.SECTION, 80, Field.HTMLCONTROL, 86, Field.CONTROL, 19, Field.FORMCHECKBOX, Field.BIDIOUTLINE, Field.BIDIOUTLINE, 19, Field.GREETINGLINE, 82, Field.ADDRESSBLOCK, 74, 19, Field.ADDIN, 74, Field.FORMCHECKBOX, 86, 64, 29, Field.LISTNUM, 78, Field.GREETINGLINE, Field.FILESIZE, Field.NUMCHARS, Field.DDE, 42, Field.QUOTE};
    }

    static {
        A05();
        A0G = new C1271Yb();
        A0J = IK.A08(A04(32, 4, 48));
        A0H = IK.A08(A04(0, 4, 122));
        A0I = IK.A08(A04(28, 4, 120));
    }

    public YZ() {
        this(0);
    }

    public YZ(int i10) {
        this(i10, -9223372036854775807L);
    }

    public YZ(int i10, long j10) {
        this.A08 = i10;
        this.A09 = j10;
        this.A0D = new I4(10);
        this.A0C = new C3();
        this.A0A = new C1();
        this.A02 = -9223372036854775807L;
        this.A0B = new C2();
    }

    private int A00(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            interfaceC0724By.AFq();
            if (interfaceC0724By.AEP(this.A0D.A00, 0, 4, true)) {
                this.A0D.A0Y(0);
                int A08 = this.A0D.A08();
                int sampleHeaderData = this.A01;
                if (A06(A08, sampleHeaderData)) {
                    int sampleHeaderData2 = C3.A00(A08);
                    if (sampleHeaderData2 != -1) {
                        C3.A04(A08, this.A0C);
                        if (this.A02 == -9223372036854775807L) {
                            this.A02 = this.A06.A8W(interfaceC0724By.A86());
                            if (this.A09 != -9223372036854775807L) {
                                this.A02 += this.A09 - this.A06.A8W(0L);
                            }
                        }
                        int sampleHeaderData3 = this.A0C.A02;
                        this.A00 = sampleHeaderData3;
                    }
                }
                interfaceC0724By.AGq(1);
                this.A01 = 0;
                return 0;
            }
            return -1;
        }
        int AFu = this.A05.AFu(interfaceC0724By, this.A00, true);
        if (AFu == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AFu;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        long j10 = this.A02;
        int bytesAppended3 = this.A0C.A03;
        this.A05.AFw(j10 + ((this.A03 * 1000000) / bytesAppended3), 1, this.A0C.A02, 0, null);
        long j11 = this.A03;
        int bytesAppended4 = this.A0C.A04;
        this.A03 = j11 + bytesAppended4;
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r4 == r3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.facebook.ads.redexgen.X.I4 r5, int r6) {
        /*
            int r1 = r5.A07()
            int r0 = r6 + 4
            if (r1 < r0) goto L36
            r5.A0Y(r6)
            int r4 = r5.A08()
            int r0 = com.facebook.ads.redexgen.X.YZ.A0J
            if (r4 == r0) goto L35
            int r3 = com.facebook.ads.redexgen.X.YZ.A0H
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.YZ.A0F
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L27
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L27:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YZ.A0F
            java.lang.String r1 = "4CmTESmhzVSPcPiVjQG1aJL4QuOhOvuP"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "QBRZbVrwma52PJOV3OuwYxyYzHl6wY0l"
            r0 = 3
            r2[r0] = r1
            if (r4 != r3) goto L36
        L35:
            return r4
        L36:
            int r1 = r5.A07()
            r0 = 40
            if (r1 < r0) goto L4e
            r0 = 36
            r5.A0Y(r0)
            int r1 = r5.A08()
            int r0 = com.facebook.ads.redexgen.X.YZ.A0I
            if (r1 != r0) goto L4e
            int r0 = com.facebook.ads.redexgen.X.YZ.A0I
            return r0
        L4e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YZ.A01(com.facebook.ads.redexgen.X.I4, int):int");
    }

    private C0776Ea A02(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        interfaceC0724By.AEO(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        C3.A04(this.A0D.A08(), this.A0C);
        return new C0776Ea(interfaceC0724By.A7g(), interfaceC0724By.A86(), this.A0C);
    }

    private InterfaceC1270Ya A03(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        I4 i42 = new I4(this.A0C.A02);
        interfaceC0724By.AEO(i42.A00, 0, this.A0C.A02);
        int i10 = 21;
        if ((this.A0C.A05 & 1) != 0) {
            if (this.A0C.A01 != 1) {
                i10 = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i10 = 13;
        }
        int xingBase = A01(i42, i10);
        if (xingBase == A0J || xingBase == A0H) {
            EY A01 = EY.A01(interfaceC0724By.A7g(), interfaceC0724By.A86(), this.A0C, i42);
            if (A01 != null && !this.A0A.A03()) {
                interfaceC0724By.AFq();
                interfaceC0724By.A3s(i10 + ShapeTypes.FLOW_CHART_MANUAL_INPUT);
                I4 frame = this.A0D;
                interfaceC0724By.AEO(frame.A00, 0, 3);
                I4 frame2 = this.A0D;
                frame2.A0Y(0);
                C1 c12 = this.A0A;
                I4 frame3 = this.A0D;
                c12.A04(frame3.A0G());
            }
            interfaceC0724By.AGq(this.A0C.A02);
            if (A01 != null && !A01.A9h() && xingBase == A0H) {
                return A02(interfaceC0724By);
            }
            return A01;
        } else if (xingBase == A0I) {
            EZ A00 = EZ.A00(interfaceC0724By.A7g(), interfaceC0724By.A86(), this.A0C, i42);
            interfaceC0724By.AGq(this.A0C.A02);
            return A00;
        } else {
            interfaceC0724By.AFq();
            return null;
        }
    }

    public static boolean A06(int i10, long j10) {
        return ((long) ((-128000) & i10)) == ((-128000) & j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r15 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        r14.AGq(r6 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        r13.A01 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
        r14.AFq();
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07(com.facebook.ads.redexgen.X.InterfaceC0724By r14, boolean r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YZ.A07(com.facebook.ads.redexgen.X.By, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        this.A04 = interfaceC0725Bz;
        this.A05 = this.A04.AHA(0, 1);
        this.A04.A5u();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC0724By, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(interfaceC0724By);
            if (this.A06 == null || (!this.A06.A9h() && (this.A08 & 1) != 0)) {
                this.A06 = A02(interfaceC0724By);
            }
            this.A04.AG8(this.A06);
            this.A05.A69(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC0724By);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void AG7(long j10, long j11) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final boolean AGs(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        return A07(interfaceC0724By, true);
    }
}
