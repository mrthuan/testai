package ep;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import kotlin.jvm.internal.g;

/* compiled from: SortAiFileTouchHelperCallback.kt */
/* loaded from: classes3.dex */
public final class b extends r.d {
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16833d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16834e;

    public b(a aVar, int i10) {
        g.e(aVar, ea.a.p("I2lCdBxuUnI=", "ppwMPAOV"));
        this.c = aVar;
        this.f16833d = i10;
        this.f16834e = false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void a(RecyclerView recyclerView, RecyclerView.b0 viewHolder) {
        g.e(recyclerView, "recyclerView");
        g.e(viewHolder, "viewHolder");
        super.a(recyclerView, viewHolder);
        this.c.f();
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setScaleX(1.0f);
        viewHolder.itemView.setScaleY(1.0f);
        viewHolder.itemView.setElevation(0.0f);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final int b(RecyclerView recyclerView, RecyclerView.b0 viewHolder) {
        int i10;
        g.e(recyclerView, "recyclerView");
        g.e(viewHolder, "viewHolder");
        int i11 = this.f16833d;
        if (i11 != 1) {
            if (i11 != 2) {
                i10 = 15;
            } else {
                i10 = 3;
            }
        } else {
            i10 = 12;
        }
        return (i10 << 16) | 0 | ((0 | i10) << 0);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean d() {
        return this.f16834e;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void e(Canvas c, RecyclerView recyclerView, RecyclerView.b0 viewHolder, float f10, float f11, int i10, boolean z10) {
        g.e(c, "c");
        g.e(recyclerView, "recyclerView");
        g.e(viewHolder, "viewHolder");
        if (i10 == 1) {
            viewHolder.itemView.setAlpha(1.0f - (Math.abs(f10) / viewHolder.itemView.getWidth()));
            viewHolder.itemView.setTranslationX(f10);
            viewHolder.itemView.setScaleX(1.5f);
            viewHolder.itemView.setScaleY(1.5f);
            return;
        }
        super.e(c, recyclerView, viewHolder, f10, f11, i10, z10);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean f(RecyclerView recyclerView, RecyclerView.b0 viewHolder, RecyclerView.b0 b0Var) {
        g.e(recyclerView, "recyclerView");
        g.e(viewHolder, "viewHolder");
        if (viewHolder.getItemViewType() != b0Var.getItemViewType()) {
            return false;
        }
        this.c.d(viewHolder.getAdapterPosition(), b0Var.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void g(RecyclerView.b0 b0Var, int i10) {
        View view;
        View view2;
        View view3;
        if (i10 == 2) {
            this.c.g();
            View view4 = null;
            if (b0Var != null) {
                view = b0Var.itemView;
            } else {
                view = null;
            }
            if (view != null) {
                view.setAlpha(0.9f);
            }
            if (b0Var != null) {
                view2 = b0Var.itemView;
            } else {
                view2 = null;
            }
            if (view2 != null) {
                view2.setScaleX(1.05f);
            }
            if (b0Var != null) {
                view3 = b0Var.itemView;
            } else {
                view3 = null;
            }
            if (view3 != null) {
                view3.setScaleY(1.05f);
            }
            if (b0Var != null) {
                view4 = b0Var.itemView;
            }
            if (view4 != null) {
                view4.setElevation(1000.0f);
            }
        }
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void h(RecyclerView.b0 viewHolder) {
        g.e(viewHolder, "viewHolder");
    }
}
