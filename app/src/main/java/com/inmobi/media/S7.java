package com.inmobi.media;

import android.view.View;

/* loaded from: classes2.dex */
public final class S7 implements pc {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U7 f14647a;

    public S7(U7 u7) {
        this.f14647a = u7;
    }

    @Override // com.inmobi.media.pc
    public final void a(View view, boolean z10) {
        F0 f02;
        kotlin.jvm.internal.g.e(view, "view");
        U7 u7 = this.f14647a;
        if (z10) {
            u7.q();
        } else {
            C1866x7 h10 = u7.h();
            if (h10 != null && (f02 = h10.f15645l) != null) {
                f02.b();
            }
        }
        this.f14647a.a(view, z10);
    }
}
