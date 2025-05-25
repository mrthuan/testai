package com.scwang.smart.refresh.layout.simple;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import yb.a;
import yb.c;
import yb.e;
import zb.b;

/* loaded from: classes2.dex */
public abstract class SimpleComponent extends RelativeLayout implements a {

    /* renamed from: a  reason: collision with root package name */
    public final View f15971a;

    /* renamed from: b  reason: collision with root package name */
    public b f15972b;
    public final a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleComponent(View view) {
        super(view.getContext(), null, 0);
        a aVar;
        if (view instanceof a) {
            aVar = (a) view;
        } else {
            aVar = null;
        }
        this.f15971a = view;
        this.c = aVar;
        boolean z10 = this instanceof yb.b;
        b bVar = b.f32342g;
        if (z10 && (aVar instanceof c) && aVar.getSpinnerStyle() == bVar) {
            aVar.getView().setScaleY(-1.0f);
        } else if ((this instanceof c) && (aVar instanceof yb.b) && aVar.getSpinnerStyle() == bVar) {
            aVar.getView().setScaleY(-1.0f);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public boolean a(boolean z10) {
        a aVar = this.c;
        if ((aVar instanceof yb.b) && ((yb.b) aVar).a(z10)) {
            return true;
        }
        return false;
    }

    @Override // yb.a
    public final void b(float f10, int i10, int i11) {
        a aVar = this.c;
        if (aVar != null && aVar != this) {
            aVar.b(f10, i10, i11);
        }
    }

    @Override // yb.a
    public final void c(float f10, int i10, int i11, int i12, boolean z10) {
        a aVar = this.c;
        if (aVar != null && aVar != this) {
            aVar.c(f10, i10, i11, i12, z10);
        }
    }

    @Override // yb.a
    public final boolean d() {
        a aVar = this.c;
        if (aVar != null && aVar != this && aVar.d()) {
            return true;
        }
        return false;
    }

    public void e(e eVar, int i10, int i11) {
        a aVar = this.c;
        if (aVar != null && aVar != this) {
            aVar.e(eVar, i10, i11);
        }
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if ((obj instanceof a) && getView() == ((a) obj).getView()) {
            return true;
        }
        return false;
    }

    public void f(e eVar, int i10, int i11) {
        a aVar = this.c;
        if (aVar != null && aVar != this) {
            aVar.f(eVar, i10, i11);
        }
    }

    public void g(e eVar, RefreshState refreshState, RefreshState refreshState2) {
        a aVar = this.c;
        if (aVar != null && aVar != this) {
            if ((this instanceof yb.b) && (aVar instanceof c)) {
                if (refreshState.isFooter) {
                    refreshState = refreshState.toHeader();
                }
                if (refreshState2.isFooter) {
                    refreshState2 = refreshState2.toHeader();
                }
            } else if ((this instanceof c) && (aVar instanceof yb.b)) {
                if (refreshState.isHeader) {
                    refreshState = refreshState.toFooter();
                }
                if (refreshState2.isHeader) {
                    refreshState2 = refreshState2.toFooter();
                }
            }
            aVar.g(eVar, refreshState, refreshState2);
        }
    }

    @Override // yb.a
    public b getSpinnerStyle() {
        int i10;
        b bVar = this.f15972b;
        if (bVar != null) {
            return bVar;
        }
        a aVar = this.c;
        if (aVar != null && aVar != this) {
            return aVar.getSpinnerStyle();
        }
        View view = this.f15971a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.g) {
                b bVar2 = ((SmartRefreshLayout.g) layoutParams).f15968b;
                this.f15972b = bVar2;
                if (bVar2 != null) {
                    return bVar2;
                }
            }
            if (layoutParams != null && ((i10 = layoutParams.height) == 0 || i10 == -1)) {
                b[] bVarArr = b.f32343h;
                for (int i11 = 0; i11 < 5; i11++) {
                    b bVar3 = bVarArr[i11];
                    if (bVar3.c) {
                        this.f15972b = bVar3;
                        return bVar3;
                    }
                }
            }
        }
        b bVar4 = b.f32339d;
        this.f15972b = bVar4;
        return bVar4;
    }

    @Override // yb.a
    public View getView() {
        View view = this.f15971a;
        if (view == null) {
            return this;
        }
        return view;
    }

    public void h(SmartRefreshLayout.h hVar, int i10, int i11) {
        a aVar = this.c;
        if (aVar != null && aVar != this) {
            aVar.h(hVar, i10, i11);
            return;
        }
        View view = this.f15971a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.g) {
                hVar.c(this, ((SmartRefreshLayout.g) layoutParams).f15967a);
            }
        }
    }

    public int i(e eVar, boolean z10) {
        a aVar = this.c;
        if (aVar != null && aVar != this) {
            return aVar.i(eVar, z10);
        }
        return 0;
    }

    public void setPrimaryColors(int... iArr) {
        a aVar = this.c;
        if (aVar != null && aVar != this) {
            aVar.setPrimaryColors(iArr);
        }
    }
}
