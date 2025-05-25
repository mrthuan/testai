package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9S extends C1132So {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C1074Qi A01;
    public boolean A02;
    public final AbstractC06488x<C9R> A03;
    public final AbstractC06488x<C9P> A04;
    public final AbstractC06488x<SZ> A05;
    public final AbstractC06488x<C9O> A06;
    public final AbstractC06488x<R6> A07;
    public final AbstractC06488x<R0> A08;
    public final AbstractC06488x<C1091Qz> A09;
    public final AbstractC06488x<QQ> A0A;
    public final AbstractC06488x<QP> A0B;
    public final T7 A0C;
    public final R9 A0D;
    public final AbstractC1071Qf A0E;

    public C9S(C1314Zs c1314Zs, J7 j72, T7 t72, String str) {
        this(c1314Zs, j72, t72, str, 0, 0, false, null, null);
    }

    public C9S(C1314Zs c1314Zs, J7 j72, T7 t72, String str, int i10, int i11, boolean z10, Bundle bundle, Map<String, String> map) {
        super(c1314Zs, j72, t72, str, !t72.A0i(), i10, i11, z10, bundle, map, new C1131Sn(c1314Zs, t72));
        this.A0E = new AbstractC1071Qf() { // from class: com.facebook.ads.redexgen.X.9T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C1088Qw c1088Qw) {
                C9S.this.A0e();
            }
        };
        this.A08 = new C1142Sy(this);
        this.A04 = new C1141Sx(this);
        this.A05 = new C1140Sw(this);
        this.A06 = new C1139Sv(this);
        this.A03 = new C1138Su(this);
        this.A07 = new C1137St(this);
        this.A0A = new C1136Ss(this);
        this.A0B = new C1135Sr(this);
        this.A09 = new T6(this);
        this.A0D = new R9() { // from class: com.facebook.ads.redexgen.X.9U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC06488x
            /* renamed from: A00 */
            public final void A03(C1098Rg c1098Rg) {
                T7 t73;
                C9S c9s = C9S.this;
                t73 = C9S.this.A0C;
                c9s.A00 = t73.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = t72;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (C0877Im.A2h(c1314Zs)) {
            this.A01 = new C1074Qi(t72, str, null);
        }
    }

    public C9S(C1314Zs c1314Zs, J7 j72, T7 t72, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c1314Zs, j72, t72, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.X.C1132So
    public final void A0m(EnumC1078Qm enumC1078Qm, Map<String, String> map) {
        super.A0m(enumC1078Qm, map);
        if (this.A01 != null && enumC1078Qm == EnumC1078Qm.A09) {
            Map<String, String> params = this.A01.A05();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0o() {
        C1143Sz c1143Sz = new C1143Sz(this);
        if (this.A0C.A0m()) {
            ExecutorC0959Lx.A00(c1143Sz);
            return;
        }
        T7 t72 = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        t72.getStateHandler().post(c1143Sz);
    }
}
