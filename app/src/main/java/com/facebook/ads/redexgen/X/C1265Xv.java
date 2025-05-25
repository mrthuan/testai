package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Xv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1265Xv implements DB {
    public static String[] A02 = {"P6LxKoX3hqiFMmAIVR7OeJXIbWgxygGh", "pjME3bsyRopZ", "UEFZUDYTuEaf1GJh0Avn4lO8zugM0IPU", "QWMZsQufQnd6YIT4vE0", "2ZdVdRUPEYe784hkDnclgg", "W0NJjabFUAVEfXxfEuVWrnE41t6CnKuf", "UPQ2VibD02RiukY0QWB9ET1KfDzYUrsx", "MLswwOzvsn6Vmil0MDYnNWAJpg07qpL1"};
    public final I3 A00 = new I3(new byte[4]);
    public final /* synthetic */ C1263Xt A01;

    public C1265Xv(C1263Xt c1263Xt) {
        this.A01 = c1263Xt;
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final void A4n(I4 i42) {
        int programCount;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int tableId = i42.A0E();
        if (tableId != 0) {
            return;
        }
        i42.A0Z(7);
        int A04 = i42.A04();
        if (A02[5].charAt(15) == 'T') {
            throw new RuntimeException();
        }
        A02[5] = "xK6ZRV35PXGEsGGPsJooK7TgqadUik0x";
        int i10 = A04 / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            i42.A0a(this.A00, 4);
            int i12 = this.A00.A04(16);
            this.A00.A08(3);
            if (i12 == 0) {
                this.A00.A08(13);
            } else {
                int A042 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(A042, new C1268Xy(new C1264Xu(this.A01, A042)));
                C1263Xt.A01(this.A01);
            }
        }
        programCount = this.A01.A05;
        if (programCount != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final void A9F(IG ig2, InterfaceC0725Bz interfaceC0725Bz, DH dh2) {
    }
}
