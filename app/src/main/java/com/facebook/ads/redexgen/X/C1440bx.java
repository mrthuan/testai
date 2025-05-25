package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.bx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1440bx implements InterfaceC04540x {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ C0800Fj A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Field.GREETINGLINE, Field.HYPERLINK, 14, 14, 8, 10, 13, 8, 32, 3, 12, 12, 7, 16, Field.SECTIONPAGES, 11, 15, 18, 16, 7, 17, 17, 11, 13, 12, Field.SECTIONPAGES, 4, 11, 16, 7, 6, Field.NUMCHARS, 29, Field.EQ, 18, 29, 29, 22, 1, Field.BARCODE, Field.NUMCHARS, 20, 20, 26, 29, 20, 58, 30, 3, 1, 22, 0, 0, 26, Field.NUMCHARS, 29};
    }

    static {
        A01();
    }

    public C1440bx(C0800Fj c0800Fj, Runnable runnable) {
        this.A00 = c0800Fj;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04540x
    public final void ABN(InterfaceC1484cf interfaceC1484cf) {
        C0783Ei c0783Ei;
        c0783Ei = this.A00.A02;
        c0783Ei.A0E().A4G();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04540x
    public final void ABO(InterfaceC1484cf interfaceC1484cf, View view) {
        C0783Ei c0783Ei;
        c0783Ei = this.A00.A02;
        c0783Ei.A0E().A4F(interfaceC1484cf == ((AbstractC1437bu) this.A00).A00);
        if (interfaceC1484cf != ((AbstractC1437bu) this.A00).A00) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        InterfaceC04460p interfaceC04460p = ((AbstractC1437bu) this.A00).A01;
        C0800Fj c0800Fj = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC1437bu) c0800Fj).A01 = interfaceC1484cf;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC1484cf);
            return;
        }
        this.A00.A07.A0E(view);
        this.A00.A0P(interfaceC04460p);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04540x
    public final void ABP(InterfaceC1484cf interfaceC1484cf) {
        C0783Ei c0783Ei;
        AbstractC0907Ju.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        c0783Ei = this.A00.A02;
        c0783Ei.A0E().A4I();
        this.A00.A07.A0D();
        this.A00.A0N();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04540x
    public final void ACN(InterfaceC1484cf interfaceC1484cf, C0894Jg c0894Jg) {
        C0783Ei c0783Ei;
        c0783Ei = this.A00.A02;
        c0783Ei.A0E().A4H(interfaceC1484cf == ((AbstractC1437bu) this.A00).A00, c0894Jg.A03().getErrorCode());
        if (interfaceC1484cf != ((AbstractC1437bu) this.A00).A00) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0P(interfaceC1484cf);
        this.A00.ABs(c0894Jg);
    }
}
