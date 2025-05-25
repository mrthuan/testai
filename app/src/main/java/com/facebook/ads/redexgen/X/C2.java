package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class C2 {
    public final I4 A00 = new I4(10);

    public final Metadata A00(InterfaceC0724By interfaceC0724By, InterfaceC0764Dn interfaceC0764Dn) throws IOException, InterruptedException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC0724By.AEO(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int A0G = this.A00.A0G();
                int peekedId3Bytes = C1253Xi.A03;
                if (A0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int framesLength = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    interfaceC0724By.AEO(bArr, 10, A0D);
                    metadata = new C1253Xi(interfaceC0764Dn).A0O(bArr, framesLength);
                } else {
                    interfaceC0724By.A3s(A0D);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC0724By.AFq();
        interfaceC0724By.A3s(tagLength);
        return metadata;
    }
}
