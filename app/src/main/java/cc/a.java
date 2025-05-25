package cc;

import android.graphics.PointF;
import android.view.View;
import dc.b;

/* compiled from: SimpleBoundaryDecider.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public PointF f5672a;

    /* renamed from: b  reason: collision with root package name */
    public a f5673b;
    public boolean c = true;

    public final boolean a(View view) {
        a aVar = this.f5673b;
        if (aVar != null) {
            return aVar.a(view);
        }
        return b.a(view, this.f5672a, this.c);
    }

    public final boolean b(View view) {
        a aVar = this.f5673b;
        if (aVar != null) {
            return aVar.b(view);
        }
        return b.b(view, this.f5672a);
    }
}
