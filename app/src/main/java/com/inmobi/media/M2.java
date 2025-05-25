package com.inmobi.media;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class M2 extends u.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N2 f14453a;

    public M2(N2 n22) {
        this.f14453a = n22;
    }

    @Override // u.b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        I1 i12;
        super.onNavigationEvent(i10, bundle);
        K2 k22 = this.f14453a.c;
        if (k22 != null) {
            M1 m12 = (M1) k22;
            if (i10 != 5) {
                if (i10 == 6 && (i12 = m12.f14449b) != null) {
                    i12.a();
                    return;
                }
                return;
            }
            I1 i13 = m12.f14449b;
            if (i13 != null) {
                i13.b();
            }
        }
    }
}
