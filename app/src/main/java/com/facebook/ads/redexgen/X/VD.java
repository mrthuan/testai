package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class VD implements MP {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ VA A00;

    public VD(VA va2) {
        this.A00 = va2;
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final void ABX() {
        boolean A0W;
        boolean z10;
        JF jf2;
        MR mr;
        N9 n92;
        AtomicBoolean atomicBoolean;
        boolean A0V;
        AtomicBoolean atomicBoolean2;
        OS os;
        A0W = this.A00.A0W();
        if (A0W) {
            atomicBoolean2 = this.A00.A0V;
            if (!atomicBoolean2.get()) {
                os = this.A00.A0T;
                os.A07(this.A00);
                return;
            }
        }
        z10 = this.A00.A0X;
        if (z10) {
            atomicBoolean = this.A00.A0V;
            if (!atomicBoolean.get()) {
                A0V = this.A00.A0V();
                if (A0V) {
                    this.A00.A0a.setToolbarActionMode(0);
                    this.A00.A0L();
                    return;
                }
            }
        }
        jf2 = this.A00.A0N;
        JE je2 = JE.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(15) != strArr[7].charAt(15)) {
            throw new RuntimeException();
        }
        A01[6] = "5WAARogjuXxHEWvmKD2XevOhgNSOEUJc";
        jf2.A04(je2, null);
        mr = this.A00.A0Q;
        n92 = this.A00.A0R;
        mr.A4P(n92.A7I());
    }
}
