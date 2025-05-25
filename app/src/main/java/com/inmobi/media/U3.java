package com.inmobi.media;

import android.view.View;

/* loaded from: classes2.dex */
public final class U3 implements InterfaceC1623f4 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W3 f14729a;

    public U3(W3 w32) {
        this.f14729a = w32;
    }

    @Override // com.inmobi.media.InterfaceC1623f4
    public final void a(View view, Object obj) {
        if (view instanceof S9) {
            A4 a42 = this.f14729a.f14777f;
            if (a42 != null) {
                ((B4) a42).a("HtmlAdTracker", "fireImpression");
            }
            ((S9) view).j();
        }
    }
}
