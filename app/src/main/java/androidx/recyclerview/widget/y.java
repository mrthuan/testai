package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class y extends a0 {
    @Override // androidx.recyclerview.widget.a0
    public final int b(View view) {
        this.f4390a.getClass();
        return RecyclerView.m.R(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f4390a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f4305b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f4390a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f4305b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int e(View view) {
        this.f4390a.getClass();
        return (view.getLeft() - RecyclerView.m.O(view)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int f() {
        return this.f4390a.f4297n;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int g() {
        RecyclerView.m mVar = this.f4390a;
        return mVar.f4297n - mVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int h() {
        return this.f4390a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int i() {
        return this.f4390a.f4295l;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int j() {
        return this.f4390a.f4296m;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int k() {
        return this.f4390a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int l() {
        RecyclerView.m mVar = this.f4390a;
        return (mVar.f4297n - mVar.getPaddingLeft()) - mVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.a0
    public final int n(View view) {
        RecyclerView.m mVar = this.f4390a;
        Rect rect = this.c;
        mVar.U(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int o(View view) {
        RecyclerView.m mVar = this.f4390a;
        Rect rect = this.c;
        mVar.U(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.a0
    public final void p(int i10) {
        this.f4390a.Y(i10);
    }
}
