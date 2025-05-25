package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.inmobi.media.C1720m3;

/* renamed from: com.inmobi.media.m3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1720m3 extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f15298a;

    /* renamed from: b  reason: collision with root package name */
    public C1797s3 f15299b;
    public InterfaceC1759p3 c;

    /* renamed from: d  reason: collision with root package name */
    public Tb f15300d;

    /* renamed from: e  reason: collision with root package name */
    public L5 f15301e;

    /* renamed from: f  reason: collision with root package name */
    public A4 f15302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720m3(Activity context) {
        super(context);
        kotlin.jvm.internal.g.e(context, "context");
        this.f15298a = -1;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, "getContext(...)");
        P2 p22 = new P2(context, (byte) 4, this.f15302f);
        p22.setId(65503);
        p22.setOnTouchListener(new View.OnTouchListener() { // from class: qb.w0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C1720m3.a(C1720m3.this, view, motionEvent);
            }
        });
        linearLayout.addView(p22, layoutParams);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, "getContext(...)");
        P2 p22 = new P2(context, (byte) 2, this.f15302f);
        p22.setId(65516);
        p22.setOnTouchListener(new pb.b(this, 1));
        linearLayout.addView(p22, layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, "getContext(...)");
        P2 p22 = new P2(context, (byte) 6, this.f15302f);
        p22.setId(1048283);
        p22.setOnTouchListener(new pb.a(this, 1));
        linearLayout.addView(p22, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, "getContext(...)");
        P2 p22 = new P2(context, (byte) 3, this.f15302f);
        p22.setId(65502);
        p22.setOnTouchListener(new d9.c(this, 1));
        linearLayout.addView(p22, layoutParams);
    }

    public final L5 getLandingPageTelemetryMetaData() {
        return this.f15301e;
    }

    public final Tb getUserLeftApplicationListener() {
        return this.f15300d;
    }

    public final void setEmbeddedBrowserUpdateListener(InterfaceC1759p3 browserUpdateListener) {
        kotlin.jvm.internal.g.e(browserUpdateListener, "browserUpdateListener");
        this.c = browserUpdateListener;
    }

    public final void setLandingPageTelemetryMetaData(L5 l52) {
        this.f15301e = l52;
    }

    public final void setLogger(A4 logger) {
        kotlin.jvm.internal.g.e(logger, "logger");
        this.f15302f = logger;
    }

    public final void setUserLeftApplicationListener(Tb tb2) {
        this.f15300d = tb2;
    }

    public static final boolean a(C1720m3 this$0, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        C1797s3 c1797s3 = this$0.f15299b;
        if (c1797s3 == null) {
            InterfaceC1759p3 interfaceC1759p3 = this$0.c;
            if (interfaceC1759p3 != null) {
                C1707l4.a(((C1693k4) interfaceC1759p3).f15258a);
            }
            return true;
        } else if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c1797s3.canGoBack()) {
                c1797s3.goBack();
            } else {
                InterfaceC1759p3 interfaceC1759p32 = this$0.c;
                if (interfaceC1759p32 != null) {
                    C1707l4.a(((C1693k4) interfaceC1759p32).f15258a);
                }
            }
            return true;
        } else {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
    }

    public static final boolean b(C1720m3 this$0, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C1797s3 c1797s3 = this$0.f15299b;
            if (c1797s3 != null) {
                C1772q3 c1772q3 = c1797s3.f15433g;
                if (c1772q3 != null) {
                    c1772q3.a("userclickClose");
                } else {
                    kotlin.jvm.internal.g.i("embeddedBrowserViewClient");
                    throw null;
                }
            }
            InterfaceC1759p3 interfaceC1759p3 = this$0.c;
            if (interfaceC1759p3 != null) {
                C1707l4.a(((C1693k4) interfaceC1759p3).f15258a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(C1720m3 this$0, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        C1797s3 c1797s3 = this$0.f15299b;
        if (c1797s3 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c1797s3.canGoForward()) {
                c1797s3.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(C1720m3 this$0, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C1797s3 c1797s3 = this$0.f15299b;
            if (c1797s3 != null) {
                C1772q3 c1772q3 = c1797s3.f15433g;
                if (c1772q3 != null) {
                    c1772q3.a("userclickReload");
                } else {
                    kotlin.jvm.internal.g.i("embeddedBrowserViewClient");
                    throw null;
                }
            }
            C1797s3 c1797s32 = this$0.f15299b;
            if (c1797s32 != null) {
                c1797s32.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
