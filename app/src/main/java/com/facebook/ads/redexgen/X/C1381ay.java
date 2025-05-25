package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ay  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1381ay implements InterfaceC05333z {
    public final /* synthetic */ FV A00;
    public final /* synthetic */ C05293u A01;

    public C1381ay(FV fv, C05293u c05293u) {
        this.A00 = fv;
        this.A01 = c05293u;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05333z
    public final Object A4s(int i10) {
        C05273s compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05333z
    public final List<Object> A63(String str, int i10) {
        List<C05273s> A03 = this.A01.A03(str, i10);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i11 = 0; i11 < infoCount; i11++) {
            arrayList.add(A03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05333z
    public final Object A64(int i10) {
        C05273s compatInfo = this.A01.A01(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05333z
    public final boolean AEQ(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
