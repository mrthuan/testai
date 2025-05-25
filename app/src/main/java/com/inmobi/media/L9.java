package com.inmobi.media;

import android.view.View;

/* loaded from: classes2.dex */
public final class L9 implements pc {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S9 f14435a;

    public L9(S9 s92) {
        this.f14435a = s92;
    }

    @Override // com.inmobi.media.pc
    public final void a(View view, boolean z10) {
        kotlin.jvm.internal.g.e(view, "view");
        if (!(view instanceof S9)) {
            return;
        }
        if (this.f14435a.hasWindowFocus()) {
            this.f14435a.c(z10);
        } else {
            this.f14435a.c(false);
        }
    }
}
