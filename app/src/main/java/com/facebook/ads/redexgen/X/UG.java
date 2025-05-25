package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public class UG implements InterfaceC1040Pa {
    public static byte[] A01;
    public static String[] A02 = {"j0Llx0J1MSgFmdDCajgZS", "WqPPZqRc0dX4AocYH9RDHKNy8FKfctFv", "x4SSjhhb9i0sKdnf0Wf5s", "xtX3gCAokrJDAeXWoUYA8plxhmXwCeOm", "uRKBJqZuIeGTpbClJ99Pe9ZmQekDyja2", "rD1ESZhEMARN2moY0NiI8P2eIcx2KKt8", "vMF11DxP2anc735da3YXnRmNGLge", "xeUiMncNmqcgkFgn7eafy8FxNu3C"};
    public final /* synthetic */ BN A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "mcgN6rOfJkIrJEn9BPtko0s6E0JP";
            strArr2[7] = "7NujJgKdrQLNFT4Mmbwt8V3uSlrM";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 20);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{Field.GLOSSARY, Field.DDEAUTO, Field.HYPERLINK, Field.NUMWORDS, 10, 25, 11, 16, 29, Field.NUMCHARS, Field.NUMCHARS, 14, 9, Field.AUTONUMOUT, 29, 2, 14, Field.NUMCHARS};
    }

    static {
        A01();
    }

    public UG(BN bn2) {
        this.A00 = bn2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1040Pa
    public final void ADE() {
        C1313Zr context = AbstractC06137i.A00();
        if (context != null) {
            context.A07().AA0(A00(10, 8, ShapeTypes.VERTICAL_SCROLL), C8E.A2g, new C8F(A00(0, 10, 108)));
        }
    }
}
