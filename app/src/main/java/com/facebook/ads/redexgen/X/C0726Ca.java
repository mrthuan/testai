package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* renamed from: com.facebook.ads.redexgen.X.Ca  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0726Ca {
    public static String[] A0A = {"tKMEQyvluzQ1Nn3ykuVdzNZ8vb4kdT8m", "GeKfs2sJ6nbbQhem6v82VjejoG5jBsB7", "AfmYZYeI1Y00emk9wBvDzFPL2v9SQ7vS", "qVzzKcDVUoFZFts2UpxZp90t7lN0aiYH", "rWkFrnOBw96ebPrEG0IMfbHNXRTUH8t0", "U5tUtJMHZjXCJdFBhHSSQmrZPEv5F3Ni", "CMETZJr0lHowFtN3K41q19SzNF1CjRpv", "lrsJQP2RFV9f4UsQyKTnoj893IObLugA"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public CU A04;
    public C0735Cj A05;
    public final C9 A06;
    public final C0737Cl A07 = new C0737Cl();
    public final I4 A09 = new I4(1);
    public final I4 A08 = new I4();

    public C0726Ca(C9 c92) {
        this.A06 = c92;
    }

    private C0736Ck A00() {
        int i10 = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            return this.A07.A08;
        }
        return this.A05.A00(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        I4 i42 = this.A07.A09;
        C0736Ck encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            i42.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            int A0I = i42.A0I() * 6;
            if (A0A[6].charAt(17) == 'S') {
                throw new RuntimeException();
            }
            A0A[0] = "Dkat9NH7bKSE7Rzb8B6OLbAVLJtjjf4Q";
            i42.A0Z(A0I);
        }
    }

    public final int A03() {
        I4 i42;
        int vectorSize;
        if (this.A07.A0A) {
            C0736Ck A00 = A00();
            if (A00.A00 != 0) {
                i42 = this.A07.A09;
                vectorSize = A00.A00;
            } else {
                byte[] initVectorData = A00.A04;
                this.A08.A0b(initVectorData, initVectorData.length);
                i42 = this.A08;
                vectorSize = initVectorData.length;
            }
            boolean z10 = this.A07.A0H[this.A01];
            this.A09.A00[0] = (byte) ((z10 ? 128 : 0) | vectorSize);
            this.A09.A0Y(0);
            C9 c92 = this.A06;
            I4 initializationVectorData = this.A09;
            c92.AFv(initializationVectorData, 1);
            this.A06.AFv(i42, vectorSize);
            if (!z10) {
                return vectorSize + 1;
            }
            I4 i43 = this.A07.A09;
            int A0I = i43.A0I();
            i43.A0Z(-2);
            int i10 = (A0I * 6) + 2;
            this.A06.AFv(i43, i10);
            return vectorSize + 1 + i10;
        }
        return 0;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j10) {
        long A01 = AbstractC06529b.A01(j10);
        for (int i10 = this.A01; i10 < this.A07.A00 && this.A07.A00(i10) < A01; i10++) {
            if (this.A07.A0I[i10]) {
                this.A03 = i10;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        C0736Ck encryptionBox = this.A05.A00(this.A07.A07.A02);
        String str = encryptionBox != null ? encryptionBox.A02 : null;
        C9 c92 = this.A06;
        Format format = this.A05.A07;
        String[] strArr = A0A;
        String schemeType = strArr[5];
        if (schemeType.charAt(25) == strArr[2].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[1] = "9VKvmNGI1pKEwb6BSF19djXm8kYtnzgK";
        strArr2[7] = "KanRAdK5lExnEnkfSh4wHj8L33fZCYqk";
        c92.A69(format.A0I(drmInitData.A02(str)));
    }

    public final void A07(C0735Cj c0735Cj, CU cu) {
        this.A05 = (C0735Cj) AbstractC0844Hf.A01(c0735Cj);
        this.A04 = (CU) AbstractC0844Hf.A01(cu);
        this.A06.A69(c0735Cj.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        this.A00++;
        if (this.A00 == this.A07.A0E[this.A02]) {
            this.A02++;
            this.A00 = 0;
            return false;
        }
        return true;
    }
}
