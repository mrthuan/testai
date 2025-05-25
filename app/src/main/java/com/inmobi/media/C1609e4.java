package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.inmobi.media.e4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1609e4 implements sc {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1665i4 f15026a;

    public C1609e4(C1665i4 c1665i4) {
        this.f15026a = c1665i4;
    }

    @Override // com.inmobi.media.sc
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        Object obj;
        kotlin.jvm.internal.g.e(visibleViews, "visibleViews");
        kotlin.jvm.internal.g.e(invisibleViews, "invisibleViews");
        kotlin.jvm.internal.g.d(this.f15026a.f15184d, "access$getTAG$p(...)");
        Objects.toString(visibleViews);
        Objects.toString(invisibleViews);
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            C1637g4 c1637g4 = (C1637g4) this.f15026a.f15182a.get(view);
            if (c1637g4 == null) {
                this.f15026a.a(view);
            } else {
                C1637g4 c1637g42 = (C1637g4) this.f15026a.f15183b.get(view);
                Object obj2 = c1637g4.f15092a;
                if (c1637g42 != null) {
                    obj = c1637g42.f15092a;
                } else {
                    obj = null;
                }
                if (!kotlin.jvm.internal.g.a(obj2, obj)) {
                    c1637g4.f15094d = SystemClock.uptimeMillis();
                    this.f15026a.f15183b.put(view, c1637g4);
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            this.f15026a.f15183b.remove((View) it2.next());
        }
        C1665i4 c1665i4 = this.f15026a;
        if (!c1665i4.f15185e.hasMessages(0)) {
            c1665i4.f15185e.postDelayed(c1665i4.f15186f, c1665i4.f15187g);
        }
    }
}
