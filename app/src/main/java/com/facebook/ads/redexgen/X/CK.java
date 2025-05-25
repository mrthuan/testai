package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CK {
    public static String[] A06 = {"ASrRCYsKepDTUmzFsC2sW3QzilFSgfPw", "pk2aHy5Gwagx08DT23n03plQM468sRYy", "xOM6LRz9nNuHtWN", "TvyhqxunvhStLR7Kd", "aVtXkPwucpWHbVIgTuViY5Suu", "ZnIfrZLnsjfgp1sFLfOTBH8y8Mk5lEFn", "0lbnIxGi57zCIaJmDAHnbRN3bazOyET0", "5wZWnu4zbKghJljNFYmlUiyghG2Nmbcr"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(InterfaceC0724By interfaceC0724By, int i10, int i11) throws IOException, InterruptedException {
        if (!this.A04) {
            interfaceC0724By.AEO(this.A05, 0, 10);
            interfaceC0724By.AFq();
            if (AV.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            if (A06[4].length() != 25) {
                throw new RuntimeException();
            }
            A06[3] = "JjREElMDljsf0pPk3";
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i10;
            this.A01 = 0;
        }
        this.A01 += i11;
    }

    public final void A02(CJ cj2) {
        if (this.A04) {
            int i10 = this.A02;
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[3] = "G4r0EfytzI47OGcaJ";
            if (i10 > 0) {
                cj2.A0W.AFw(this.A03, this.A00, this.A01, 0, cj2.A0V);
                this.A02 = 0;
            }
        }
    }

    public final void A03(CJ cj2, long j10) {
        if (!this.A04) {
            return;
        }
        int i10 = this.A02;
        this.A02 = i10 + 1;
        if (i10 == 0) {
            this.A03 = j10;
        }
        if (this.A02 < 16) {
            return;
        }
        cj2.A0W.AFw(this.A03, this.A00, this.A01, 0, cj2.A0V);
        this.A02 = 0;
    }
}
