package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class R6 implements sc {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S6 f14612a;

    public R6(S6 s62) {
        this.f14612a = s62;
    }

    @Override // com.inmobi.media.sc
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        kotlin.jvm.internal.g.e(visibleViews, "visibleViews");
        kotlin.jvm.internal.g.e(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            pc pcVar = (pc) this.f14612a.f14643f.get(view);
            if (pcVar != null) {
                pcVar.a(view, true);
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            pc pcVar2 = (pc) this.f14612a.f14643f.get(view2);
            if (pcVar2 != null) {
                pcVar2.a(view2, false);
            }
        }
    }
}
