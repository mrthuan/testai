package com.inmobi.media;

import android.view.View;

/* loaded from: classes2.dex */
public final class H6 implements pc {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M6 f14315a;

    public H6(M6 m62) {
        this.f14315a = m62;
    }

    @Override // com.inmobi.media.pc
    public final void a(View view, boolean z10) {
        F0 f02;
        kotlin.jvm.internal.g.e(view, "view");
        M6 m62 = this.f14315a;
        if (z10) {
            m62.q();
            return;
        }
        C1866x7 h10 = m62.h();
        if (h10 != null && (f02 = h10.f15645l) != null) {
            f02.b();
        }
    }
}
