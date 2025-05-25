package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.Adapter f4392a;

    public b(RecyclerView.Adapter adapter) {
        this.f4392a = adapter;
    }

    @Override // androidx.recyclerview.widget.w
    public final void a(int i10, int i11) {
        this.f4392a.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.w
    public final void b(int i10, int i11) {
        this.f4392a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.w
    public final void c(int i10, int i11) {
        this.f4392a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.w
    public final void d(int i10, int i11, Object obj) {
        this.f4392a.notifyItemRangeChanged(i10, i11, obj);
    }
}
