package ud;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import be.a;
import com.google.android.gms.ads.nativead.NativeAd;
import pdf.pdfreader.viewer.editor.free.R;
import qb.i0;
import zd.d;

/* compiled from: AdManagerNativeCard.kt */
/* loaded from: classes2.dex */
public final class m extends be.d {
    public a.InterfaceC0036a c;

    /* renamed from: d  reason: collision with root package name */
    public j3.h f30334d;

    /* renamed from: e  reason: collision with root package name */
    public NativeAd f30335e;

    /* renamed from: h  reason: collision with root package name */
    public boolean f30338h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f30339i;

    /* renamed from: j  reason: collision with root package name */
    public String f30340j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f30342l;

    /* renamed from: n  reason: collision with root package name */
    public float f30344n;

    /* renamed from: b  reason: collision with root package name */
    public final String f30333b = "AdManagerNativeCard";

    /* renamed from: f  reason: collision with root package name */
    public int f30336f = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f30337g = R.layout.ad_native_card;

    /* renamed from: k  reason: collision with root package name */
    public String f30341k = "";

    /* renamed from: m  reason: collision with root package name */
    public float f30343m = 1.7758986f;

    /* compiled from: AdManagerNativeCard.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ViewGroup.OnHierarchyChangeListener {
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View parent, View child) {
            kotlin.jvm.internal.g.e(parent, "parent");
            kotlin.jvm.internal.g.e(child, "child");
            if (child instanceof ImageView) {
                ((ImageView) child).setAdjustViewBounds(true);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View parent, View child) {
            kotlin.jvm.internal.g.e(parent, "parent");
            kotlin.jvm.internal.g.e(child, "child");
        }
    }

    @Override // be.a
    public final synchronized void a(Activity activity) {
        try {
            NativeAd nativeAd = this.f30335e;
            if (nativeAd != null) {
                nativeAd.destroy();
            }
            this.f30335e = null;
        } catch (Throwable th2) {
            fe.a.a().c(th2);
        }
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30333b);
        sb2.append('@');
        return b.a.d(this.f30341k, sb2);
    }

    @Override // be.a
    public final void d(final Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30333b;
        a6.h.k(sb2, str, ":load", a10);
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.c = interfaceC0036a;
            this.f30334d = hVar;
            Bundle bundle = (Bundle) hVar.c;
            if (bundle != null) {
                this.f30339i = bundle.getBoolean("ad_for_child");
                j3.h hVar2 = this.f30334d;
                if (hVar2 != null) {
                    this.f30336f = ((Bundle) hVar2.c).getInt("ad_choices_position", 1);
                    j3.h hVar3 = this.f30334d;
                    if (hVar3 != null) {
                        this.f30337g = ((Bundle) hVar3.c).getInt("layout_id", R.layout.ad_native_card);
                        j3.h hVar4 = this.f30334d;
                        if (hVar4 != null) {
                            this.f30340j = ((Bundle) hVar4.c).getString("common_config", "");
                            j3.h hVar5 = this.f30334d;
                            if (hVar5 != null) {
                                this.f30342l = ((Bundle) hVar5.c).getBoolean("ban_video", this.f30342l);
                                j3.h hVar6 = this.f30334d;
                                if (hVar6 != null) {
                                    this.f30344n = ((Bundle) hVar6.c).getFloat("cover_width", activity.getResources().getDisplayMetrics().widthPixels * 0.9f);
                                    j3.h hVar7 = this.f30334d;
                                    if (hVar7 != null) {
                                        this.f30338h = ((Bundle) hVar7.c).getBoolean("skip_init");
                                    } else {
                                        kotlin.jvm.internal.g.i("adConfig");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.g.i("adConfig");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.g.i("adConfig");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i("adConfig");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.g.i("adConfig");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.g.i("adConfig");
                    throw null;
                }
            }
            if (this.f30339i) {
                ud.a.a();
            }
            final d.a aVar = (d.a) interfaceC0036a;
            wd.a.b(activity, this.f30338h, new wd.d() { // from class: ud.l
                @Override // wd.d
                public final void a(boolean z10) {
                    Activity activity2 = activity;
                    a.InterfaceC0036a interfaceC0036a2 = aVar;
                    m this$0 = this;
                    kotlin.jvm.internal.g.e(this$0, "this$0");
                    activity2.runOnUiThread(new i0(z10, this$0, activity2, interfaceC0036a2, 2));
                }
            });
        } else if (interfaceC0036a != null) {
            ((d.a) interfaceC0036a).a(activity, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
        } else {
            throw new IllegalArgumentException(a6.h.c(str, ":Please check MediationListener is right."));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
        if (r4 != false) goto L58;
     */
    @Override // be.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.view.View j(android.app.Activity r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.m.j(android.app.Activity, int, int):android.view.View");
    }
}
