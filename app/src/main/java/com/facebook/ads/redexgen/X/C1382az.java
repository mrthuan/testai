package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.az  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1382az implements InterfaceC05313w {
    public static String[] A02 = {"BxeCSXrFaRj", "IWeOsMGsO3rBvyiTuJXWjMqB2n5POdot", "NGgDVvJhpCyddRCxf5O6", "v7dseD2N", "b08ux26", "fg5WsruxE6pK3fVhNLQH97P2VsWOQFn1", "RDjE3tUyFXCJEzmAXOjq2W6VFZ2zcAes", "Fn45yaemrdjcOolPakoXMsDmphHClKxa"};
    public final /* synthetic */ FW A00;
    public final /* synthetic */ C05293u A01;

    public C1382az(FW fw, C05293u c05293u) {
        this.A00 = fw;
        this.A01 = c05293u;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05313w
    public final Object A4s(int i10) {
        C05273s compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05313w
    public final List<Object> A63(String str, int i10) {
        List<C05273s> A03 = this.A01.A03(str, i10);
        if (A03 != null) {
            ArrayList arrayList = new ArrayList();
            int size = A03.size();
            for (int i11 = 0; i11 < size; i11++) {
                C05273s c05273s = A03.get(i11);
                String[] strArr = A02;
                if (strArr[5].charAt(23) != strArr[1].charAt(23)) {
                    String[] strArr2 = A02;
                    strArr2[5] = "3GGS2FgfxS9PdCMsSIgMeheOLZnf3MlZ";
                    strArr2[1] = "aJbfA8b3NLiXQBSk9lndmf25pj9B4jE7";
                    arrayList.add(c05273s.A0M());
                }
            }
            return arrayList;
        } else if (A02[0].length() == 11) {
            String[] strArr3 = A02;
            strArr3[5] = "atS9tmOPh4Y1RWGDtCP1b0ECIDkAYM0P";
            strArr3[1] = "WZrNDLg8WSJodQHinSBZlHZp62izmcoM";
            return null;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05313w
    public final boolean AEQ(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
