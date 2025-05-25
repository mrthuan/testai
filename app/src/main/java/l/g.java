package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.d1;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;
import x0.s0;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class g implements x0.u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f20350a;

    public g(f fVar) {
        this.f20350a = fVar;
    }

    @Override // x0.u
    public final s0 m(View view, s0 s0Var) {
        boolean z10;
        View view2;
        s0 s0Var2;
        int c;
        int d10;
        boolean z11;
        int color;
        int e10 = s0Var.e();
        f fVar = this.f20350a;
        fVar.getClass();
        int e11 = s0Var.e();
        ActionBarContextView actionBarContextView = fVar.f20314v;
        int i10 = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.f20314v.getLayoutParams();
            boolean z12 = true;
            if (fVar.f20314v.isShown()) {
                if (fVar.f20297d0 == null) {
                    fVar.f20297d0 = new Rect();
                    fVar.f20298e0 = new Rect();
                }
                Rect rect = fVar.f20297d0;
                Rect rect2 = fVar.f20298e0;
                rect.set(s0Var.c(), s0Var.e(), s0Var.d(), s0Var.b());
                ViewGroup viewGroup = fVar.B;
                Method method = d1.f2566a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                ViewGroup viewGroup2 = fVar.B;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                s0 a10 = f0.j.a(viewGroup2);
                if (a10 == null) {
                    c = 0;
                } else {
                    c = a10.c();
                }
                if (a10 == null) {
                    d10 = 0;
                } else {
                    d10 = a10.d();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                Context context = fVar.f20303k;
                if (i11 > 0 && fVar.D == null) {
                    View view3 = new View(context);
                    fVar.D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c;
                    layoutParams.rightMargin = d10;
                    fVar.B.addView(fVar.D, -1, layoutParams);
                } else {
                    View view4 = fVar.D;
                    if (view4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != c || marginLayoutParams2.rightMargin != d10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = c;
                            marginLayoutParams2.rightMargin = d10;
                            fVar.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view5 = fVar.D;
                if (view5 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && view5.getVisibility() != 0) {
                    View view6 = fVar.D;
                    if ((f0.d.g(view6) & 8192) == 0) {
                        z12 = false;
                    }
                    if (z12) {
                        color = androidx.core.content.a.getColor(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = androidx.core.content.a.getColor(context, R.color.abc_decor_view_status_guard);
                    }
                    view6.setBackgroundColor(color);
                }
                if (!fVar.I && z10) {
                    e11 = 0;
                }
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z12 = false;
                z10 = false;
            }
            if (z12) {
                fVar.f20314v.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view7 = fVar.D;
        if (view7 != null) {
            if (!z10) {
                i10 = 8;
            }
            view7.setVisibility(i10);
        }
        if (e10 != e11) {
            s0Var2 = s0Var.g(s0Var.c(), e11, s0Var.d(), s0Var.b());
            view2 = view;
        } else {
            view2 = view;
            s0Var2 = s0Var;
        }
        return f0.j(view2, s0Var2);
    }
}
