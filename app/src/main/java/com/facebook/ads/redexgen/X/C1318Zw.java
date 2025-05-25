package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1318Zw implements C0L {
    public static byte[] A01;
    public static String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ C1313Zr A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-89, -85, -97, -91, -93};
        String[] strArr = A02;
        if (strArr[4].charAt(11) == strArr[0].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "8YVOAkqjlCZIfPO923uAjm7vB9HJVDjx";
        strArr2[0] = "zjuPMStvlm1D7VGZIKzQB2odE0473uv0";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1318Zw(C1313Zr c1313Zr) {
        this.A00 = c1313Zr;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void A9u(Throwable th2) {
        this.A00.A07().AA0(A00(0, 5, 39), C8E.A1e, new C8F(th2));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void AA5(Throwable th2) {
        this.A00.A07().AA0(A00(0, 5, 39), C8E.A1g, new C8F(th2));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void AEs(String str, int i10, String str2, Long l10, Long l11, AnonymousClass06 anonymousClass06) {
        C05936i.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i10, str2, l10, l11, null);
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void AEt(String str, boolean z10, AnonymousClass06 anonymousClass06) {
        C05936i.A04(this.A00, new C05926h(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z10);
    }
}
