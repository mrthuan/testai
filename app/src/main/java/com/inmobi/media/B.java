package com.inmobi.media;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.RelativeLayout;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class B {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f14135a;

    /* renamed from: b  reason: collision with root package name */
    public EnumC1586c9 f14136b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14137d;

    public B(RelativeLayout adBackgroundView) {
        kotlin.jvm.internal.g.e(adBackgroundView, "adBackgroundView");
        this.f14135a = adBackgroundView;
        this.f14136b = AbstractC1600d9.a(AbstractC1692k3.g());
        this.c = 1.0f;
    }

    public abstract void a();

    public void a(EnumC1586c9 orientation) {
        kotlin.jvm.internal.g.e(orientation, "orientation");
        this.f14136b = orientation;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final void e() {
        C1678j3 c1678j3;
        RelativeLayout.LayoutParams layoutParams;
        if (this.c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f14135a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.f14137d) {
            C1706l3 c1706l3 = AbstractC1692k3.f15250a;
            Context context = this.f14135a.getContext();
            kotlin.jvm.internal.g.d(context, "getContext(...)");
            c1678j3 = AbstractC1692k3.b(context);
        } else {
            C1706l3 c1706l32 = AbstractC1692k3.f15250a;
            Context context2 = this.f14135a.getContext();
            kotlin.jvm.internal.g.d(context2, "getContext(...)");
            Display a10 = AbstractC1692k3.a(context2);
            if (a10 == null) {
                c1678j3 = AbstractC1692k3.f15251b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                a10.getMetrics(displayMetrics);
                c1678j3 = new C1678j3(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        Objects.toString(this.f14136b);
        if (AbstractC1600d9.b(this.f14136b)) {
            layoutParams = new RelativeLayout.LayoutParams(pdf.pdfreader.viewer.editor.free.utils.t0.o0(c1678j3.f15209a * this.c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, pdf.pdfreader.viewer.editor.free.utils.t0.o0(c1678j3.f15210b * this.c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f14135a.setLayoutParams(layoutParams);
    }

    public abstract void f();

    public abstract void g();
}
