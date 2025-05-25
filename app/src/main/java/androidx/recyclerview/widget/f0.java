package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class f0 extends x0.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f4420d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4421e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends x0.a {

        /* renamed from: d  reason: collision with root package name */
        public final f0 f4422d;

        /* renamed from: e  reason: collision with root package name */
        public final WeakHashMap f4423e = new WeakHashMap();

        public a(f0 f0Var) {
            this.f4422d = f0Var;
        }

        @Override // x0.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            x0.a aVar = (x0.a) this.f4423e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // x0.a
        public final y0.g b(View view) {
            x0.a aVar = (x0.a) this.f4423e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        @Override // x0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            x0.a aVar = (x0.a) this.f4423e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // x0.a
        public final void d(View view, y0.f fVar) {
            boolean z10;
            f0 f0Var = this.f4422d;
            RecyclerView recyclerView = f0Var.f4420d;
            if (recyclerView.f4254u && !recyclerView.D && !recyclerView.f4220d.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            View.AccessibilityDelegate accessibilityDelegate = this.f31416a;
            if (!z10) {
                RecyclerView recyclerView2 = f0Var.f4420d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().g0(view, fVar);
                    x0.a aVar = (x0.a) this.f4423e.get(view);
                    if (aVar != null) {
                        aVar.d(view, fVar);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // x0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            x0.a aVar = (x0.a) this.f4423e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // x0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            x0.a aVar = (x0.a) this.f4423e.get(viewGroup);
            if (aVar != null) {
                return aVar.f(viewGroup, view, accessibilityEvent);
            }
            return super.f(viewGroup, view, accessibilityEvent);
        }

        @Override // x0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            boolean z10;
            f0 f0Var = this.f4422d;
            RecyclerView recyclerView = f0Var.f4420d;
            if (recyclerView.f4254u && !recyclerView.D && !recyclerView.f4220d.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                RecyclerView recyclerView2 = f0Var.f4420d;
                if (recyclerView2.getLayoutManager() != null) {
                    x0.a aVar = (x0.a) this.f4423e.get(view);
                    if (aVar != null) {
                        if (aVar.g(view, i10, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i10, bundle)) {
                        return true;
                    }
                    RecyclerView.t tVar = recyclerView2.getLayoutManager().f4286b.f4217b;
                    return false;
                }
            }
            return super.g(view, i10, bundle);
        }

        @Override // x0.a
        public final void h(View view, int i10) {
            x0.a aVar = (x0.a) this.f4423e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        @Override // x0.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            x0.a aVar = (x0.a) this.f4423e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public f0(RecyclerView recyclerView) {
        this.f4420d = recyclerView;
        a aVar = this.f4421e;
        if (aVar != null) {
            this.f4421e = aVar;
        } else {
            this.f4421e = new a(this);
        }
    }

    @Override // x0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f4420d;
            if (recyclerView.f4254u && !recyclerView.D && !recyclerView.f4220d.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().e0(accessibilityEvent);
                }
            }
        }
    }

    @Override // x0.a
    public void d(View view, y0.f fVar) {
        boolean z10;
        this.f31416a.onInitializeAccessibilityNodeInfo(view, fVar.f31951a);
        RecyclerView recyclerView = this.f4420d;
        if (recyclerView.f4254u && !recyclerView.D && !recyclerView.f4220d.g()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && recyclerView.getLayoutManager() != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f4286b;
            layoutManager.f0(recyclerView2.f4217b, recyclerView2.f4229h0, fVar);
        }
    }

    @Override // x0.a
    public final boolean g(View view, int i10, Bundle bundle) {
        boolean z10 = true;
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f4420d;
        if (recyclerView.f4254u && !recyclerView.D && !recyclerView.f4220d.g()) {
            z10 = false;
        }
        if (z10 || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f4286b;
        return layoutManager.t0(recyclerView2.f4217b, recyclerView2.f4229h0, i10, bundle);
    }
}
