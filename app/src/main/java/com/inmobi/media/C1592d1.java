package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.inmobi.media.d1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1592d1 extends C1770q1 {
    public final C1620f1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592d1(Context context, J placement, C1662i1 c1662i1) {
        super(context, placement, c1662i1);
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(placement, "placement");
        this.R = new C1620f1();
    }

    @Override // com.inmobi.media.C1770q1
    public final boolean C0() {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).c(e10, "canProceedToLoad");
        }
        if (f0()) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).b(e11, "Some of the dependency libraries for Banner not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        } else if (1 != Q() && 2 != Q()) {
            if (7 == Q()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
                Z5.a((byte) 1, "InMobi", Kb.f14404j + I().l());
                A4 a44 = this.f15531j;
                if (a44 != null) {
                    String e12 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e12, "<get-TAG>(...)");
                    ((B4) a44).b(e12, "Ad is active. ignore load");
                }
                return false;
            }
            if (Q() == 4) {
                if (W()) {
                    A4 a45 = this.f15531j;
                    if (a45 != null) {
                        String e13 = AbstractC1846w0.e();
                        kotlin.jvm.internal.g.d(e13, "<get-TAG>(...)");
                        ((B4) a45).b(e13, "ad is expired, clearing");
                    }
                    g();
                } else {
                    A4 a46 = this.f15531j;
                    if (a46 != null) {
                        String e14 = AbstractC1846w0.e();
                        kotlin.jvm.internal.g.d(e14, "<get-TAG>(...)");
                        ((B4) a46).c(e14, "signalCanShowForStateReady");
                    }
                    A4 a47 = this.f15531j;
                    if (a47 != null) {
                        String e15 = AbstractC1846w0.e();
                        kotlin.jvm.internal.g.d(e15, "<get-TAG>(...)");
                        ((B4) a47).a(e15, "An ad is ready with the ad unit. Signaling ad load success ...");
                    }
                    AbstractC1689k0 r4 = r();
                    if (r4 == null) {
                        Z5.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                        A4 a48 = this.f15531j;
                        if (a48 != null) {
                            String e16 = AbstractC1846w0.e();
                            kotlin.jvm.internal.g.d(e16, "<get-TAG>(...)");
                            ((B4) a48).b(e16, "listener is null. load show callback missed");
                        }
                    } else {
                        A4 a49 = this.f15531j;
                        if (a49 != null) {
                            String e17 = AbstractC1846w0.e();
                            kotlin.jvm.internal.g.d(e17, "<get-TAG>(...)");
                            ((B4) a49).a(e17, "callback - onLoadSuccess");
                        }
                        f(r4);
                    }
                    return false;
                }
            }
            e0();
            return true;
        } else {
            String e18 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e18, "<get-TAG>(...)");
            Z5.a((byte) 1, e18, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            A4 a410 = this.f15531j;
            if (a410 != null) {
                String e19 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e19, "<get-TAG>(...)");
                ((B4) a410).b(e19, "ad load in progress. ignore load");
            }
            a((short) 53);
            return false;
        }
    }

    @Override // com.inmobi.media.C1770q1, com.inmobi.media.U9
    public final void a(EnumC1648h1 audioStatusInternal) {
        kotlin.jvm.internal.g.e(audioStatusInternal, "audioStatusInternal");
        AbstractC1689k0 r4 = r();
        if (r4 != null) {
            r4.a(audioStatusInternal);
        }
        C1620f1 c1620f1 = this.R;
        c1620f1.getClass();
        if (!c1620f1.f15044a && audioStatusInternal == EnumC1648h1.f15116e) {
            c1620f1.f15044a = true;
            C1798s4 c1798s4 = C1798s4.c;
            c1798s4.f15548a = System.currentTimeMillis();
            c1798s4.f15549b++;
        }
    }

    public final void d(short s4) {
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).c(e10, "onShowFailure");
        }
        AbstractC1689k0 r4 = r();
        if (r4 == null) {
            Z5.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            A4 a43 = this.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).b(e11, "listener is null. show fail callback missed. ");
            }
        } else {
            A4 a44 = this.f15531j;
            if (a44 != null) {
                String e12 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e12, "<get-TAG>(...)");
                ((B4) a44).b(e12, "callback - onAdShowFailed");
            }
            r4.d();
        }
        if (s4 != 0) {
            A4 a45 = this.f15531j;
            if (a45 != null) {
                String e13 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e13, "<get-TAG>(...)");
                ((B4) a45).b(e13, "show failed - " + ((int) s4));
            }
            c(s4);
        }
    }

    @Override // com.inmobi.media.C1770q1, com.inmobi.media.AbstractC1846w0, com.inmobi.media.U9
    public final void i(S9 renderView) {
        AbstractC1689k0 r4;
        kotlin.jvm.internal.g.e(renderView, "renderView");
        A4 a42 = this.f15531j;
        if (a42 != null) {
            String e10 = AbstractC1846w0.e();
            kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
            ((B4) a42).c(e10, "onRenderViewVisible");
        }
        if (Q() == 4 && (r4 = r()) != null) {
            A4 a43 = this.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).a(e11, "callback - onAdDisplayed");
            }
            d(r4);
        }
        super.i(renderView);
    }

    @Override // com.inmobi.media.C1770q1, com.inmobi.media.AbstractC1846w0
    public final String q() {
        return "audio";
    }

    @Override // com.inmobi.media.C1770q1, com.inmobi.media.U9
    public final void a(boolean z10) {
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        C1851w5 a10 = AbstractC1838v5.a(d10, "audio_pref_file");
        int i10 = a10.f15579a.getInt("user_mute_count", 0);
        a10.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1);
    }
}
