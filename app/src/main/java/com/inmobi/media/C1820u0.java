package com.inmobi.media;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.inmobi.media.u0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1820u0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1846w0 f15485a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WeakReference f15486b;

    public C1820u0(AbstractC1846w0 abstractC1846w0, WeakReference weakReference) {
        this.f15485a = abstractC1846w0;
        this.f15486b = weakReference;
    }

    public static final void b(AbstractC1846w0 this$0, WeakReference listenerWeakReference) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(listenerWeakReference, "$listenerWeakReference");
        A4 a42 = this$0.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).a(e10, "callback- onAdDisplayed");
        }
        this$0.b((AbstractC1689k0) listenerWeakReference.get());
    }

    public final void a() {
        A4 a42 = this.f15485a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            StringBuilder a10 = A5.a(e10, "<get-TAG>(...)", "Ad interaction for placement id: ");
            a10.append(this.f15485a.I());
            ((B4) a42).a(e10, a10.toString());
        }
        if (this.f15485a.Z()) {
            A4 a43 = this.f15485a.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).b(e11, "ad unit is destroyed");
                return;
            }
            return;
        }
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) this.f15486b.get();
        if (abstractC1689k0 != null) {
            A4 a44 = this.f15485a.f15531j;
            if (a44 != null) {
                String e12 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e12, "<get-TAG>(...)");
                ((B4) a44).a(e12, "callback - onAdInteraction");
            }
            abstractC1689k0.a(new HashMap());
            return;
        }
        A4 a45 = this.f15485a.f15531j;
        if (a45 != null) {
            String e13 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e13, "<get-TAG>(...)");
            ((B4) a45).b(e13, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void c() {
        A4 a42 = this.f15485a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).a(e10, "onAdDisplayFailed native interaction callback");
        }
        if (this.f15485a.Z()) {
            A4 a43 = this.f15485a.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).b(e11, "callback onAdDisplayFailed failed. already destroyed.");
                return;
            }
            return;
        }
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) this.f15486b.get();
        if (abstractC1689k0 != null) {
            A4 a44 = this.f15485a.f15531j;
            if (a44 != null) {
                String e12 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e12, "<get-TAG>(...)");
                ((B4) a44).a(e12, "callback - onAdShowFailed");
            }
            this.f15485a.a(abstractC1689k0, (short) 91);
            return;
        }
        A4 a45 = this.f15485a.f15531j;
        if (a45 != null) {
            String e13 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e13, "<get-TAG>(...)");
            ((B4) a45).b(e13, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void d() {
        A4 a42 = this.f15485a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).c(e10, "onAdDisplay ");
        }
        this.f15485a.b((byte) 4);
        if (this.f15485a.Z()) {
            A4 a43 = this.f15485a.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).b(e11, "onAdDisplay callback failed. adunit destroyed.");
                return;
            }
            return;
        }
        Handler D = this.f15485a.D();
        if (D != null) {
            D.post(new n0.g(19, this.f15485a, this.f15486b));
        }
    }

    public final void e() {
        A4 a42 = this.f15485a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).c(e10, "onAdFullScreenWillDisplay");
        }
        if (this.f15485a.Z()) {
            A4 a43 = this.f15485a.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).a(e11, "onAdFullScreenWillDisplay callback failed. adunit destroyed");
                return;
            }
            return;
        }
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) this.f15486b.get();
        if (abstractC1689k0 != null) {
            A4 a44 = this.f15485a.f15531j;
            if (a44 != null) {
                String e12 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e12, "<get-TAG>(...)");
                ((B4) a44).a(e12, "callback - onAdScreenWillDisplay");
            }
            abstractC1689k0.e();
            return;
        }
        A4 a45 = this.f15485a.f15531j;
        if (a45 != null) {
            String e13 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e13, "<get-TAG>(...)");
            ((B4) a45).b(e13, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void f() {
        A4 a42 = this.f15485a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            StringBuilder a10 = A5.a(e10, "<get-TAG>(...)", "Successfully impressed ad for placement id: ");
            a10.append(this.f15485a.I());
            ((B4) a42).a(e10, a10.toString());
        }
        if (this.f15485a.Z()) {
            A4 a43 = this.f15485a.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).b(e11, "ad unit is destroyed");
                return;
            }
            return;
        }
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) this.f15486b.get();
        if (abstractC1689k0 != null) {
            A4 a44 = this.f15485a.f15531j;
            if (a44 != null) {
                String e12 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e12, "<get-TAG>(...)");
                ((B4) a44).a(e12, "callback - onAdImpressed");
            }
            abstractC1689k0.c();
            return;
        }
        A4 a45 = this.f15485a.f15531j;
        if (a45 != null) {
            String e13 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e13, "<get-TAG>(...)");
            ((B4) a45).b(e13, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void g() {
        A4 a42 = this.f15485a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).a(e10, "onUserLeftApplication");
        }
        if (this.f15485a.Z()) {
            return;
        }
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) this.f15486b.get();
        if (abstractC1689k0 != null) {
            abstractC1689k0.h();
            return;
        }
        A4 a43 = this.f15485a.f15531j;
        if (a43 != null) {
            ((B4) a43).b("InMobi", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void h() {
        A4 a42 = this.f15485a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).a(e10, "onUserSkippedMedia");
        }
        if (this.f15485a.Z()) {
            return;
        }
        AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) this.f15486b.get();
        if (abstractC1689k0 != null) {
            abstractC1689k0.i();
            return;
        }
        A4 a43 = this.f15485a.f15531j;
        if (a43 != null) {
            ((B4) a43).b("InMobi", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void b() {
        A4 a42 = this.f15485a.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).a(e10, "onAdDismissed");
        }
        if (this.f15485a.Z()) {
            return;
        }
        A4 a43 = this.f15485a.f15531j;
        if (a43 != null) {
            ((B4) a43).a("InMobi", "Ad dismissed for placement id: " + this.f15485a.I());
        }
        Handler D = this.f15485a.D();
        if (D != null) {
            D.post(new androidx.fragment.app.g(10, this.f15485a, this.f15486b));
        }
    }

    public static final void a(AbstractC1846w0 this$0, WeakReference listenerWeakReference) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(listenerWeakReference, "$listenerWeakReference");
        this$0.a((AbstractC1689k0) listenerWeakReference.get());
    }
}
