package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3u  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05293u {
    public static final InterfaceC05283t A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new FV();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new FW();
        } else {
            A01 = new C1380ax();
        }
    }

    public C05293u() {
        this.A00 = A01.AAw(this);
    }

    public C05293u(Object obj) {
        this.A00 = obj;
    }

    public final C05273s A00(int i10) {
        return null;
    }

    public final C05273s A01(int i10) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C05273s> A03(String str, int i10) {
        return null;
    }

    public final boolean A04(int i10, int i11, Bundle bundle) {
        return false;
    }
}
