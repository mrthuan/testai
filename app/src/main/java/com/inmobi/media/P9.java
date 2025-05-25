package com.inmobi.media;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* loaded from: classes2.dex */
public final class P9 implements InterfaceC1768q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S9 f14583a;

    public P9(S9 s92) {
        this.f14583a = s92;
    }

    @Override // com.inmobi.media.InterfaceC1768q
    public final void a() {
        A4 a42 = this.f14583a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
            ((B4) a42).a(str, "onAdScreenDisplayFailed");
        }
        this.f14583a.getListener().c();
    }

    @Override // com.inmobi.media.InterfaceC1768q
    public final void b(Object obj) {
        A4 a42 = this.f14583a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
            ((B4) a42).a(str, "onAdScreenDismissed");
        }
        S9 s92 = this.f14583a;
        if (s92.f14650b == 0) {
            s92.setAndUpdateViewState("Default");
            S9 originalRenderView = this.f14583a.getOriginalRenderView();
            if (originalRenderView != null) {
                originalRenderView.setAndUpdateViewState("Default");
            }
        } else if (kotlin.jvm.internal.g.a("Default", s92.getViewState())) {
            this.f14583a.setAndUpdateViewState(PDLayoutAttributeObject.BORDER_STYLE_HIDDEN);
        }
        this.f14583a.u();
    }

    @Override // com.inmobi.media.InterfaceC1768q
    public final void a(Object obj) {
        A4 a42 = this.f14583a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
            ((B4) a42).a(str, "onAdScreenDisplayed");
        }
        S9 s92 = this.f14583a;
        if (s92.f14650b == 0) {
            if (s92.getOriginalRenderView() != null) {
                S9 originalRenderView = this.f14583a.getOriginalRenderView();
                if (originalRenderView != null) {
                    originalRenderView.setAndUpdateViewState("Expanded");
                }
            } else {
                this.f14583a.setAndUpdateViewState("Expanded");
            }
            this.f14583a.L = false;
        }
        this.f14583a.getListener().e(this.f14583a);
    }
}
