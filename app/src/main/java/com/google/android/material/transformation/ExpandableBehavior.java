package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f13131a;

    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f13132a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f13133b;
        public final /* synthetic */ u8.a c;

        public a(View view, int i10, u8.a aVar) {
            this.f13132a = view;
            this.f13133b = i10;
            this.c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f13132a;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f13131a == this.f13133b) {
                u8.a aVar = this.c;
                expandableBehavior.s((View) aVar, view, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f13131a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z10;
        int i10;
        u8.a aVar = (u8.a) view2;
        int i11 = 2;
        if (!aVar.a() ? this.f13131a != 1 : (i10 = this.f13131a) != 0 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (aVar.a()) {
            i11 = 1;
        }
        this.f13131a = i11;
        s((View) aVar, view, aVar.a(), true);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        u8.a aVar;
        boolean z10;
        int i11;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (!f0.g.c(view)) {
            ArrayList i12 = coordinatorLayout.i(view);
            int size = i12.size();
            int i13 = 0;
            while (true) {
                if (i13 < size) {
                    View view2 = (View) i12.get(i13);
                    if (b(view, view2)) {
                        aVar = (u8.a) view2;
                        break;
                    }
                    i13++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                int i14 = 2;
                if (!aVar.a() ? this.f13131a != 1 : (i11 = this.f13131a) != 0 && i11 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (aVar.a()) {
                        i14 = 1;
                    }
                    this.f13131a = i14;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i14, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13131a = 0;
    }
}
