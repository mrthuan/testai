package com.inmobi.media;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.util.HashMap;
import lib.zj.office.fc.hssf.record.FeatRecord;

/* renamed from: com.inmobi.media.i1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1662i1 extends Kb {

    /* renamed from: o  reason: collision with root package name */
    public C1592d1 f15160o;

    /* renamed from: p  reason: collision with root package name */
    public C1592d1 f15161p;

    /* renamed from: q  reason: collision with root package name */
    public C1592d1 f15162q;

    /* renamed from: r  reason: collision with root package name */
    public C1592d1 f15163r;

    public C1662i1(InMobiAudio.a callbacks) {
        kotlin.jvm.internal.g.e(callbacks, "callbacks");
        b(callbacks);
    }

    @Override // com.inmobi.media.Kb
    public final void a(byte[] bArr, PublisherCallbacks callbacks) {
        kotlin.jvm.internal.g.e(callbacks, "callbacks");
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public final void b(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).c(str, "onAdFetchSuccess " + this);
        }
        C1592d1 c1592d1 = this.f15163r;
        if ((c1592d1 != null ? c1592d1.m() : null) == null) {
            A4 p11 = p();
            if (p11 != null) {
                String str2 = AbstractC1676j1.f15207a;
                kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
                ((B4) p11).b(str2, "adObject is null, fetch failed");
            }
            a((AbstractC1846w0) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        A4 p12 = p();
        if (p12 != null) {
            String str3 = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) p12).a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(info);
        s().post(new f0.s(10, this, info));
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public final void c(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).c(str, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        a((byte) 0);
        A4 p11 = p();
        if (p11 != null) {
            String str2 = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) p11).d(str2, "AdManager state - CREATED");
        }
        A4 p12 = p();
        if (p12 != null) {
            String str3 = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
            ((B4) p12).a(str3, "Ad load successful, providing callback");
        }
        s().post(new androidx.fragment.app.g(8, this, info));
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public final void d() {
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).a(str, "onAdShowFailed " + this);
        }
        s().post(new androidx.activity.b(this, 13));
    }

    @Override // com.inmobi.media.Kb
    public final AbstractC1846w0 j() {
        Byte b10;
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).c(str, "shouldUseForegroundUnit " + this);
        }
        C1592d1 c1592d1 = this.f15162q;
        if (c1592d1 != null) {
            b10 = Byte.valueOf(c1592d1.Q());
        } else {
            b10 = null;
        }
        A4 p11 = p();
        if (p11 != null) {
            String str2 = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) p11).d(str2, "State - " + b10);
        }
        if ((b10 != null && b10.byteValue() == 4) || ((b10 != null && b10.byteValue() == 7) || (b10 != null && b10.byteValue() == 6))) {
            return this.f15162q;
        }
        return this.f15163r;
    }

    @Override // com.inmobi.media.Kb
    public final void w() {
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).a(str, "submitAdLoadCalled " + this);
        }
        C1592d1 c1592d1 = this.f15163r;
        if (c1592d1 != null) {
            c1592d1.t0();
        }
    }

    public final void x() {
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).c(str, "registerLifeCycleCallbacks " + this);
        }
        C1592d1 c1592d1 = this.f15160o;
        if (c1592d1 != null) {
            c1592d1.G0();
        }
        C1592d1 c1592d12 = this.f15161p;
        if (c1592d12 != null) {
            c1592d12.G0();
        }
    }

    public final void y() {
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).a(str, "loadIntoView " + this);
        }
        C1592d1 c1592d1 = this.f15163r;
        if (c1592d1 != null) {
            if (a("InMobi", c1592d1.I().toString())) {
                a((byte) 8);
                A4 p11 = p();
                if (p11 != null) {
                    String str2 = AbstractC1676j1.f15207a;
                    kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
                    ((B4) p11).d(str2, "AdManager state - LOADING_INTO_VIEW");
                }
                c1592d1.j0();
                return;
            }
            return;
        }
        throw new IllegalStateException(Kb.f14407m.toString());
    }

    public static final void a(C1662i1 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(info, "$info");
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdFetchSuccessful(info);
        }
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public final void a(AbstractC1846w0 abstractC1846w0, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).b(str, "onAdLoadFailed");
        }
        A4 p11 = p();
        if (p11 != null) {
            ((B4) p11).a();
        }
    }

    public static final void a(C1662i1 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 p10 = this$0.p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdDisplayFailed();
        }
        A4 p11 = this$0.p();
        if (p11 != null) {
            ((B4) p11).a();
        }
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public final void a(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).a(str, "onAdDisplayed");
        }
        super.a(info);
        AbstractC1846w0 j10 = j();
        if (j10 != null) {
            j10.x0();
        }
    }

    public static final void b(C1662i1 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(info, "$info");
        PublisherCallbacks l10 = this$0.l();
        if (l10 != null) {
            l10.onAdLoadSucceeded(info);
        }
    }

    @Override // com.inmobi.media.Kb, com.inmobi.media.AbstractC1689k0
    public final void b() {
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).a(str, "onAdDismissed " + this);
        }
        a((byte) 0);
        A4 p11 = p();
        if (p11 != null) {
            String str2 = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            ((B4) p11).d(str2, "AdManager state - CREATED");
        }
        A4 p12 = p();
        if (p12 != null) {
            ((B4) p12).a();
        }
        super.b();
    }

    public final void a(RelativeLayout audio) {
        kotlin.jvm.internal.g.e(audio, "audio");
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                b(audio);
            } else {
                s().post(new n0.g(13, this, audio));
            }
        } catch (Exception e10) {
            C1592d1 c1592d1 = this.f15163r;
            if (c1592d1 != null) {
                c1592d1.d((short) 26);
            }
            String str2 = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            Z5.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            A4 p11 = p();
            if (p11 != null) {
                ((B4) p11).b(str2, Cc.a(e10, A5.a(str2, "access$getTAG$p(...)", "Show failed with unexpected error: ")));
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final void b(String adSize) {
        kotlin.jvm.internal.g.e(adSize, "adSize");
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).a(str, "load 1 " + this);
        }
        C1592d1 c1592d1 = this.f15163r;
        if (c1592d1 != null && a("InMobi", c1592d1.I().toString(), l()) && c1592d1.e((byte) 1)) {
            a((byte) 1);
            A4 p11 = p();
            if (p11 != null) {
                String str2 = AbstractC1676j1.f15207a;
                kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
                ((B4) p11).d(str2, "AdManager state - LOADING");
            }
            d(null);
            c1592d1.e(adSize);
            c1592d1.d(false);
        }
    }

    public final void b(RelativeLayout relativeLayout) {
        r k10;
        J I;
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).a(str, "showAudioAd");
        }
        C1592d1 c1592d1 = this.f15162q;
        if (c1592d1 != null ? c1592d1.D0() : false) {
            String str2 = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str2, "access$getTAG$p(...)");
            Z5.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            A4 p11 = p();
            if (p11 != null) {
                ((B4) p11).b(str2, "ad is active");
            }
            C1592d1 c1592d12 = this.f15163r;
            if (c1592d12 != null) {
                c1592d12.d((short) 15);
                return;
            }
            return;
        }
        C1592d1 c1592d13 = this.f15163r;
        if (c1592d13 != null) {
            A4 a42 = c1592d13.f15531j;
            if (a42 != null) {
                String e10 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
                ((B4) a42).c(e10, "canProceedToShow");
            }
            if (c1592d13.W()) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                Z5.a((byte) 1, e11, "Ad Show has failed because current ad is expired. Please call load() again.");
                A4 a43 = c1592d13.f15531j;
                if (a43 != null) {
                    String e12 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e12, "<get-TAG>(...)");
                    ((B4) a43).b(e12, "ad is expired");
                }
                A4 a44 = c1592d13.f15531j;
                if (a44 != null) {
                    String e13 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e13, "<get-TAG>(...)");
                    ((B4) a44).d(e13, "AdUnit " + c1592d13 + " state - CREATED");
                }
                c1592d13.d((byte) 0);
                c1592d13.d((short) 2153);
                return;
            }
            byte Q = c1592d13.Q();
            if (Q == 1 || Q == 2) {
                Z5.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                A4 a45 = c1592d13.f15531j;
                if (a45 != null) {
                    String e14 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e14, "<get-TAG>(...)");
                    ((B4) a45).b(e14, "ad is not ready");
                }
                A4 a46 = c1592d13.f15531j;
                if (a46 != null) {
                    String e15 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e15, "<get-TAG>(...)");
                    ((B4) a46).a(e15, "callback - onShowFailure");
                }
                c1592d13.d(FeatRecord.sid);
            } else if (Q == 3) {
                Z5.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                c1592d13.d((short) 0);
                A4 a47 = c1592d13.f15531j;
                if (a47 != null) {
                    String e16 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e16, "<get-TAG>(...)");
                    ((B4) a47).a(e16, "callback - onShowFailure");
                }
                A4 a48 = c1592d13.f15531j;
                if (a48 != null) {
                    String e17 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e17, "<get-TAG>(...)");
                    ((B4) a48).b(e17, "ad is failed");
                }
            } else if (Q == 0) {
                Z5.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                c1592d13.d((short) 0);
                A4 a49 = c1592d13.f15531j;
                if (a49 != null) {
                    String e18 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e18, "<get-TAG>(...)");
                    ((B4) a49).a(e18, "callback - onShowFailure");
                }
                A4 a410 = c1592d13.f15531j;
                if (a410 != null) {
                    String e19 = AbstractC1846w0.e();
                    kotlin.jvm.internal.g.d(e19, "<get-TAG>(...)");
                    ((B4) a410).b(e19, "show called before load");
                }
            } else {
                A4 p12 = p();
                if (p12 != null) {
                    String str3 = AbstractC1676j1.f15207a;
                    kotlin.jvm.internal.g.d(str3, "access$getTAG$p(...)");
                    ((B4) p12).a(str3, "swapAdUnits " + this);
                }
                C1592d1 c1592d14 = this.f15162q;
                if (kotlin.jvm.internal.g.a(c1592d14, this.f15160o)) {
                    this.f15162q = this.f15161p;
                    this.f15163r = this.f15160o;
                } else if (kotlin.jvm.internal.g.a(c1592d14, this.f15161p) || c1592d14 == null) {
                    this.f15162q = this.f15160o;
                    this.f15163r = this.f15161p;
                }
                A4 p13 = p();
                if (p13 != null) {
                    String str4 = AbstractC1676j1.f15207a;
                    kotlin.jvm.internal.g.d(str4, "access$getTAG$p(...)");
                    ((B4) p13).a(str4, "displayAd " + this);
                }
                C1592d1 c1592d15 = this.f15162q;
                if (c1592d15 == null || (k10 = c1592d15.k()) == null) {
                    return;
                }
                S9 s92 = (S9) k10;
                AbstractC1701kc viewableAd = s92.getViewableAd();
                C1592d1 c1592d16 = this.f15162q;
                if (c1592d16 != null && (I = c1592d16.I()) != null && I.p()) {
                    s92.e();
                }
                ViewParent parent = s92.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View d10 = viewableAd.d();
                viewableAd.a((HashMap) null);
                C1592d1 c1592d17 = this.f15163r;
                if (c1592d17 != null) {
                    c1592d17.E0();
                }
                if (viewGroup == null) {
                    relativeLayout.addView(d10, layoutParams);
                } else {
                    viewGroup.removeAllViews();
                    viewGroup.addView(d10, layoutParams);
                }
                C1592d1 c1592d18 = this.f15163r;
                if (c1592d18 != null) {
                    c1592d18.g();
                }
            }
        }
    }

    public static final void a(C1662i1 this$0, RelativeLayout audio) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(audio, "$audio");
        this$0.b(audio);
    }

    @Override // com.inmobi.media.Kb
    public final void a(short s4) {
        A4 p10 = p();
        if (p10 != null) {
            String str = AbstractC1676j1.f15207a;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) p10).b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        C1592d1 c1592d1 = this.f15163r;
        if (c1592d1 != null) {
            c1592d1.a(s4);
        }
    }
}
