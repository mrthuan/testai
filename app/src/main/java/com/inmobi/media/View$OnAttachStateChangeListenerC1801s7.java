package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.inmobi.media.s7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class View$OnAttachStateChangeListenerC1801s7 implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1866x7 f15445a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f15446b;
    public final /* synthetic */ W6 c;

    public View$OnAttachStateChangeListenerC1801s7(C1866x7 c1866x7, ArrayList arrayList, W6 w62) {
        this.f15445a = c1866x7;
        this.f15446b = arrayList;
        this.c = w62;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.g.e(v10, "v");
        this.f15445a.f15645l.a(this.f15446b);
        M6 m62 = this.f15445a.f15636b;
        C1682j7 c1682j7 = m62.f14461b;
        if (!(c1682j7 instanceof C1682j7)) {
            c1682j7 = null;
        }
        W6 a10 = m62.a(c1682j7, this.c);
        W6 w62 = this.c;
        M6 m63 = this.f15445a.f15636b;
        if (a10 == null) {
            a10 = w62;
        }
        w62.a("creativeView", m63.a(a10), (F6) null, this.f15445a.f15639f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.g.e(v10, "v");
        v10.removeOnAttachStateChangeListener(this);
        F0 f02 = this.f15445a.f15645l;
        List<E0> list = this.f15446b;
        f02.getClass();
        if (list != null) {
            for (E0 e02 : list) {
                e02.f14209a.cancel();
            }
            f02.f14243b.removeAll(list);
        }
    }
}
