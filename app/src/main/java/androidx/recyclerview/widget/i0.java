package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class i0 extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f4459a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4460b = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.r {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4461a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i10, RecyclerView recyclerView) {
            if (i10 == 0 && this.f4461a) {
                this.f4461a = false;
                i0.this.d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f4461a = true;
            }
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4459a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f4460b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f4233j0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            this.f4459a.setOnFlingListener(null);
        }
        this.f4459a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.f4459a.s(aVar);
                this.f4459a.setOnFlingListener(this);
                new Scroller(this.f4459a.getContext(), new DecelerateInterpolator());
                d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.m mVar, View view);

    public abstract View c(RecyclerView.m mVar);

    public final void d() {
        RecyclerView.m layoutManager;
        View c;
        RecyclerView recyclerView = this.f4459a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c = c(layoutManager)) == null) {
            return;
        }
        int[] b10 = b(layoutManager, c);
        int i10 = b10[0];
        if (i10 != 0 || b10[1] != 0) {
            this.f4459a.s0(i10, b10[1]);
        }
    }
}
