package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.g;

/* compiled from: RecyclerView.java */
/* loaded from: classes.dex */
public final class d0 implements g.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4406a;

    public d0(RecyclerView recyclerView) {
        this.f4406a = recyclerView;
    }

    public final int a() {
        return this.f4406a.getChildCount();
    }

    public final void b(int i10) {
        RecyclerView recyclerView = this.f4406a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.z(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
