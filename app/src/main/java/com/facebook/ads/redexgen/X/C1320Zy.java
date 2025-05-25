package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Zy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1320Zy extends KY {
    public static byte[] A02;
    public final /* synthetic */ C1319Zx A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{14, 44, Field.DDEAUTO, Field.MACROBUTTON, 48, -21, Field.EQ, 44, Field.AUTONUMOUT, Field.IMPORT, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C1320Zy(C1319Zx c1319Zx, AtomicBoolean atomicBoolean) {
        this.A00 = c1319Zx;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C7j c7j;
        long j10;
        C7j c7j2;
        long j11;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(JE.A0H);
                c7j2 = this.A00.A02.A04;
                C6Y c6y = this.A00.A01;
                int i10 = C05936i.A00;
                j11 = this.A00.A02.A00;
                C05936i.A02(c7j2, c6y, i10, A00(11, 14, 1), j11);
                this.A00.A02.A0T();
                this.A00.A00.ABc();
                return;
            }
            this.A00.A02.A0I(JE.A0G);
            c7j = this.A00.A02.A04;
            C6Y c6y2 = this.A00.A01;
            int i11 = C05936i.A04;
            j10 = this.A00.A02.A00;
            C05936i.A02(c7j, c6y2, i11, A00(0, 11, 125), j10);
            this.A00.A02.A0U();
            this.A00.A00.ABT();
        }
    }
}
