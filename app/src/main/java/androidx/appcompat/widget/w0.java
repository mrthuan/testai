package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import l.f;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class w0 implements x {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f2691a;

    /* renamed from: b  reason: collision with root package name */
    public int f2692b;
    public ScrollingTabContainerView c;

    /* renamed from: d  reason: collision with root package name */
    public View f2693d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f2694e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f2695f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f2696g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2697h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f2698i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f2699j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2700k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f2701l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2702m;

    /* renamed from: n  reason: collision with root package name */
    public c f2703n;

    /* renamed from: o  reason: collision with root package name */
    public int f2704o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f2705p;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.s {

        /* renamed from: x  reason: collision with root package name */
        public boolean f2706x = false;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f2707y;

        public a(int i10) {
            this.f2707y = i10;
        }

        @Override // x0.o0
        public final void a() {
            if (!this.f2706x) {
                w0.this.f2691a.setVisibility(this.f2707y);
            }
        }

        @Override // androidx.activity.s, x0.o0
        public final void d(View view) {
            this.f2706x = true;
        }

        @Override // androidx.activity.s, x0.o0
        public final void f() {
            w0.this.f2691a.setVisibility(0);
        }
    }

    public w0(Toolbar toolbar, boolean z10) {
        boolean z11;
        Drawable drawable;
        this.f2704o = 0;
        this.f2691a = toolbar;
        this.f2698i = toolbar.getTitle();
        this.f2699j = toolbar.getSubtitle();
        if (this.f2698i != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f2697h = z11;
        this.f2696g = toolbar.getNavigationIcon();
        u0 m10 = u0.m(toolbar.getContext(), null, k.a.f19429a, R.attr.actionBarStyle, 0);
        int i10 = 15;
        this.f2705p = m10.e(15);
        if (z10) {
            CharSequence k10 = m10.k(27);
            if (!TextUtils.isEmpty(k10)) {
                this.f2697h = true;
                this.f2698i = k10;
                if ((this.f2692b & 8) != 0) {
                    toolbar.setTitle(k10);
                    if (this.f2697h) {
                        x0.f0.p(toolbar.getRootView(), k10);
                    }
                }
            }
            CharSequence k11 = m10.k(25);
            if (!TextUtils.isEmpty(k11)) {
                this.f2699j = k11;
                if ((this.f2692b & 8) != 0) {
                    toolbar.setSubtitle(k11);
                }
            }
            Drawable e10 = m10.e(20);
            if (e10 != null) {
                this.f2695f = e10;
                t();
            }
            Drawable e11 = m10.e(17);
            if (e11 != null) {
                setIcon(e11);
            }
            if (this.f2696g == null && (drawable = this.f2705p) != null) {
                this.f2696g = drawable;
                if ((this.f2692b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            k(m10.h(10, 0));
            int i11 = m10.i(9, 0);
            if (i11 != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i11, (ViewGroup) toolbar, false);
                View view = this.f2693d;
                if (view != null && (this.f2692b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f2693d = inflate;
                if (inflate != null && (this.f2692b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                k(this.f2692b | 16);
            }
            int layoutDimension = m10.f2688b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int c = m10.c(7, -1);
            int c10 = m10.c(3, -1);
            if (c >= 0 || c10 >= 0) {
                int max = Math.max(c, 0);
                int max2 = Math.max(c10, 0);
                if (toolbar.f2461t == null) {
                    toolbar.f2461t = new i0();
                }
                toolbar.f2461t.a(max, max2);
            }
            int i12 = m10.i(28, 0);
            if (i12 != 0) {
                Context context = toolbar.getContext();
                toolbar.f2453l = i12;
                AppCompatTextView appCompatTextView = toolbar.f2444b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, i12);
                }
            }
            int i13 = m10.i(26, 0);
            if (i13 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f2454m = i13;
                AppCompatTextView appCompatTextView2 = toolbar.c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, i13);
                }
            }
            int i14 = m10.i(22, 0);
            if (i14 != 0) {
                toolbar.setPopupTheme(i14);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f2705p = toolbar.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f2692b = i10;
        }
        m10.n();
        if (R.string.arg_res_0x7f130002 != this.f2704o) {
            this.f2704o = R.string.arg_res_0x7f130002;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i15 = this.f2704o;
                String string = i15 != 0 ? getContext().getString(i15) : null;
                this.f2700k = string;
                if ((this.f2692b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f2704o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f2700k);
                    }
                }
            }
        }
        this.f2700k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new v0(this));
    }

    @Override // androidx.appcompat.widget.x
    public final boolean a() {
        boolean z10;
        ActionMenuView actionMenuView = this.f2691a.f2443a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.f2202t;
        if (cVar != null && cVar.m()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.x
    public final void b() {
        this.f2702m = true;
    }

    @Override // androidx.appcompat.widget.x
    public final void c(androidx.appcompat.view.menu.h hVar, f.d dVar) {
        c cVar = this.f2703n;
        Toolbar toolbar = this.f2691a;
        if (cVar == null) {
            c cVar2 = new c(toolbar.getContext());
            this.f2703n = cVar2;
            cVar2.f2008i = R.id.action_menu_presenter;
        }
        c cVar3 = this.f2703n;
        cVar3.f2004e = dVar;
        if (hVar != null || toolbar.f2443a != null) {
            toolbar.e();
            androidx.appcompat.view.menu.h hVar2 = toolbar.f2443a.f2198p;
            if (hVar2 != hVar) {
                if (hVar2 != null) {
                    hVar2.r(toolbar.L);
                    hVar2.r(toolbar.M);
                }
                if (toolbar.M == null) {
                    toolbar.M = new Toolbar.f();
                }
                cVar3.f2538r = true;
                if (hVar != null) {
                    hVar.b(cVar3, toolbar.f2451j);
                    hVar.b(toolbar.M, toolbar.f2451j);
                } else {
                    cVar3.g(toolbar.f2451j, null);
                    toolbar.M.g(toolbar.f2451j, null);
                    cVar3.c(true);
                    toolbar.M.c(true);
                }
                toolbar.f2443a.setPopupTheme(toolbar.f2452k);
                toolbar.f2443a.setPresenter(cVar3);
                toolbar.L = cVar3;
                toolbar.s();
            }
        }
    }

    @Override // androidx.appcompat.widget.x
    public final void collapseActionView() {
        androidx.appcompat.view.menu.j jVar;
        Toolbar.f fVar = this.f2691a.M;
        if (fVar == null) {
            jVar = null;
        } else {
            jVar = fVar.f2473b;
        }
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.x
    public final boolean d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f2691a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f2443a) != null && actionMenuView.f2201s) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f2691a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f2443a
            r1 = 0
            if (r0 == 0) goto L22
            androidx.appcompat.widget.c r0 = r0.f2202t
            r2 = 1
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.c$c r3 = r0.f2542v
            if (r3 != 0) goto L19
            boolean r0 = r0.m()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L1e
            r0 = r2
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L22
            r1 = r2
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w0.e():boolean");
    }

    @Override // androidx.appcompat.widget.x
    public final boolean f() {
        boolean z10;
        ActionMenuView actionMenuView = this.f2691a.f2443a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.f2202t;
        if (cVar != null && cVar.i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.x
    public final boolean g() {
        boolean z10;
        ActionMenuView actionMenuView = this.f2691a.f2443a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.f2202t;
        if (cVar != null && cVar.o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.x
    public final Context getContext() {
        return this.f2691a.getContext();
    }

    @Override // androidx.appcompat.widget.x
    public final CharSequence getTitle() {
        return this.f2691a.getTitle();
    }

    @Override // androidx.appcompat.widget.x
    public final void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f2691a.f2443a;
        if (actionMenuView != null && (cVar = actionMenuView.f2202t) != null) {
            cVar.i();
            c.a aVar = cVar.f2541u;
            if (aVar != null && aVar.b()) {
                aVar.f2120j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.x
    public final boolean j() {
        Toolbar.f fVar = this.f2691a.M;
        if (fVar != null && fVar.f2473b != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.x
    public final void k(int i10) {
        View view;
        int i11 = this.f2692b ^ i10;
        this.f2692b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            Toolbar toolbar = this.f2691a;
            if (i12 != 0) {
                if ((i10 & 4) != 0 && (i10 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f2700k)) {
                        toolbar.setNavigationContentDescription(this.f2704o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f2700k);
                    }
                }
                if ((this.f2692b & 4) != 0) {
                    Drawable drawable = this.f2696g;
                    if (drawable == null) {
                        drawable = this.f2705p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                t();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f2698i);
                    toolbar.setSubtitle(this.f2699j);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f2693d) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.x
    public final void l() {
        ScrollingTabContainerView scrollingTabContainerView = this.c;
        if (scrollingTabContainerView != null) {
            ViewParent parent = scrollingTabContainerView.getParent();
            Toolbar toolbar = this.f2691a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = null;
    }

    @Override // androidx.appcompat.widget.x
    public final void m(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = m.a.a(getContext(), i10);
        } else {
            drawable = null;
        }
        this.f2695f = drawable;
        t();
    }

    @Override // androidx.appcompat.widget.x
    public final x0.n0 o(int i10, long j10) {
        float f10;
        x0.n0 a10 = x0.f0.a(this.f2691a);
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        a10.a(f10);
        a10.c(j10);
        a10.d(new a(i10));
        return a10;
    }

    @Override // androidx.appcompat.widget.x
    public final int p() {
        return this.f2692b;
    }

    @Override // androidx.appcompat.widget.x
    public final void s(boolean z10) {
        this.f2691a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.x
    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? m.a.a(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.x
    public final void setVisibility(int i10) {
        this.f2691a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.x
    public final void setWindowCallback(Window.Callback callback) {
        this.f2701l = callback;
    }

    @Override // androidx.appcompat.widget.x
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f2697h) {
            this.f2698i = charSequence;
            if ((this.f2692b & 8) != 0) {
                Toolbar toolbar = this.f2691a;
                toolbar.setTitle(charSequence);
                if (this.f2697h) {
                    x0.f0.p(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void t() {
        Drawable drawable;
        int i10 = this.f2692b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f2695f;
                if (drawable == null) {
                    drawable = this.f2694e;
                }
            } else {
                drawable = this.f2694e;
            }
        } else {
            drawable = null;
        }
        this.f2691a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.x
    public final void setIcon(Drawable drawable) {
        this.f2694e = drawable;
        t();
    }

    @Override // androidx.appcompat.widget.x
    public final void i() {
    }

    @Override // androidx.appcompat.widget.x
    public final void n() {
    }

    @Override // androidx.appcompat.widget.x
    public final void q() {
    }

    @Override // androidx.appcompat.widget.x
    public final void r() {
    }
}
