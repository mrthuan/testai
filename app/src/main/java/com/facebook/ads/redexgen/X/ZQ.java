package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class ZQ implements InterfaceC06157l {
    public static ZQ A07;
    public static byte[] A08;
    public C0W A00;
    public InterfaceC05946j A01;
    public InterfaceC06147k A02;
    public AnonymousClass80 A03;
    public C06328h A04;
    public JJ A05;
    public InterfaceC0909Jw A06;

    static {
        A07();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{11, 11, 17, 61, 58, 14, 59, 10, 13, 31, Field.DDE, Field.DDE, Field.QUOTE, 41, Field.DATA, -38, 30, Field.NUMWORDS, Field.DDEAUTO, Field.NUMWORDS, -38, Field.QUOTE, Field.DATA, Field.QUOTE, Field.DDEAUTO, Field.QUOTE, Field.NUMWORDS, Field.ASK, Field.QUOTE, Field.AUTONUMOUT, 31, 30, Field.NUMCHARS, 15, 26, 25, Field.NUMCHARS, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1313Zr c1313Zr) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1313Zr);
        this.A06 = A05(c1313Zr, this.A03, A03(c1313Zr));
        A09(c1313Zr, A00(c1313Zr, this.A06));
        A0A(c1313Zr, this.A06);
        A0B(c1313Zr, this.A06);
        if (this.A06 != null) {
            this.A06.A68();
        }
    }

    public static AnonymousClass69 A00(C1313Zr c1313Zr, InterfaceC0909Jw interfaceC0909Jw) {
        if (!C0877Im.A1h(c1313Zr) || interfaceC0909Jw == null) {
            return null;
        }
        return C6A.A00().A00(interfaceC0909Jw);
    }

    public static AnonymousClass80 A01(C1313Zr c1313Zr) {
        return AnonymousClass81.A00().A00(c1313Zr, new ZX());
    }

    public static synchronized ZQ A02() {
        ZQ zq;
        synchronized (ZQ.class) {
            if (A07 == null) {
                A07 = new ZQ();
            }
            zq = A07;
        }
        return zq;
    }

    public static InterfaceC1108Rq A03(C1313Zr c1313Zr) {
        if (!C0877Im.A1d(c1313Zr)) {
            return null;
        }
        return S8.A01(c1313Zr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    /* renamed from: A04 */
    public final synchronized InterfaceC0909Jw A8U() {
        return this.A06;
    }

    public static InterfaceC0909Jw A05(C1313Zr c1313Zr, AnonymousClass80 anonymousClass80, InterfaceC1108Rq interfaceC1108Rq) {
        if (!C0877Im.A2Z(c1313Zr) || interfaceC1108Rq == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return SV.A00().A00(c1313Zr, anonymousClass80, interfaceC1108Rq, KE.A04(c1313Zr), new ZR(new K6(c1313Zr, A06(0, 0, 9), null, EnumC0898Jl.A08, 0, new C0903Jq(), AbstractC0947Ll.A01(C0877Im.A0L(c1313Zr)), null, null, new C1424bh()), c1313Zr), ST.A00().A00());
    }

    public static void A08() {
        AbstractC0907Ju.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C1313Zr c1313Zr, AnonymousClass69 anonymousClass69) {
        if (!C0877Im.A1h(c1313Zr) || anonymousClass69 == null) {
            return;
        }
        AnonymousClass67.A00().A00(anonymousClass69, c1313Zr);
    }

    public static void A0A(C1313Zr c1313Zr, InterfaceC0909Jw interfaceC0909Jw) {
        if (!C0877Im.A0j(c1313Zr) || interfaceC0909Jw == null) {
            return;
        }
        new C6U(c1313Zr, interfaceC0909Jw, new C6V(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1313Zr c1313Zr, InterfaceC0909Jw interfaceC0909Jw) {
        if (interfaceC0909Jw == null) {
            return;
        }
        AbstractC0880Iq.A00(c1313Zr, interfaceC0909Jw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final J7 A6H(C1313Zr c1313Zr) {
        return WV.A01(c1313Zr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final synchronized InterfaceC06147k A6Y(C7j c7j) {
        if (this.A02 == null) {
            this.A02 = new ZS(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final synchronized InterfaceC05946j A6j() {
        if (this.A01 == null) {
            this.A01 = new C1315Zt();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final synchronized AnonymousClass80 A77(C7j c7j) {
        if (this.A03 == null) {
            this.A03 = A01(c7j.A01());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final synchronized C8D A79(C7j c7j) {
        return new C1302Zg(c7j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final synchronized InterfaceC06167m A7J(C7j c7j) {
        return new C0782Eg(this, c7j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final synchronized C0W A7V(C7j c7j) {
        if (C0877Im.A0z(c7j)) {
            if (this.A00 == null) {
                this.A00 = C0X.A00().A00(new ZV(c7j));
            }
            return this.A00;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final synchronized InterfaceC06177o A8E(C7j c7j) {
        return new ZT(c7j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final C1313Zr A8F(Context context) {
        C1313Zr sdkContext = AbstractC06137i.A00();
        if (sdkContext == null) {
            C1313Zr sdkContext2 = new C1313Zr(context, this);
            AbstractC06137i.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final synchronized JJ A8G(C1313Zr c1313Zr) {
        if (this.A05 == null) {
            this.A05 = new C1224Wd(c1313Zr);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06157l
    public final synchronized C06328h A8M() {
        if (this.A04 == null) {
            this.A04 = new C06328h();
            A08();
        }
        return this.A04;
    }
}
