package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.b0;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class r extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    public final Context f2125b;
    public final h c;

    /* renamed from: d  reason: collision with root package name */
    public final MenuAdapter f2126d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2127e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2128f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2129g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2130h;

    /* renamed from: i  reason: collision with root package name */
    public final MenuPopupWindow f2131i;

    /* renamed from: l  reason: collision with root package name */
    public PopupWindow.OnDismissListener f2134l;

    /* renamed from: m  reason: collision with root package name */
    public View f2135m;

    /* renamed from: n  reason: collision with root package name */
    public View f2136n;

    /* renamed from: o  reason: collision with root package name */
    public n.a f2137o;

    /* renamed from: p  reason: collision with root package name */
    public ViewTreeObserver f2138p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2139q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2140r;

    /* renamed from: s  reason: collision with root package name */
    public int f2141s;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2143u;

    /* renamed from: j  reason: collision with root package name */
    public final a f2132j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final b f2133k = new b();

    /* renamed from: t  reason: collision with root package name */
    public int f2142t = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            r rVar = r.this;
            if (rVar.a() && !rVar.f2131i.f2336y) {
                View view = rVar.f2136n;
                if (view != null && view.isShown()) {
                    rVar.f2131i.show();
                } else {
                    rVar.dismiss();
                }
            }
        }
    }

    public r(int i10, int i11, Context context, View view, h hVar, boolean z10) {
        this.f2125b = context;
        this.c = hVar;
        this.f2127e = z10;
        this.f2126d = new MenuAdapter(hVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f2129g = i10;
        this.f2130h = i11;
        Resources resources = context.getResources();
        this.f2128f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2135m = view;
        this.f2131i = new MenuPopupWindow(context, i10, i11);
        hVar.b(this, context);
    }

    @Override // androidx.appcompat.view.menu.q
    public final boolean a() {
        if (!this.f2139q && this.f2131i.a()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void b(h hVar, boolean z10) {
        if (hVar != this.c) {
            return;
        }
        dismiss();
        n.a aVar = this.f2137o;
        if (aVar != null) {
            aVar.b(hVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void c(boolean z10) {
        this.f2140r = false;
        MenuAdapter menuAdapter = this.f2126d;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.q
    public final void dismiss() {
        if (a()) {
            this.f2131i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void e(n.a aVar) {
        this.f2137o = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public final b0 i() {
        return this.f2131i.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // androidx.appcompat.view.menu.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(androidx.appcompat.view.menu.s r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.m r0 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r9.f2125b
            android.view.View r6 = r9.f2136n
            boolean r8 = r9.f2127e
            int r3 = r9.f2129g
            int r4 = r9.f2130h
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.n$a r2 = r9.f2137o
            r0.f2119i = r2
            androidx.appcompat.view.menu.l r3 = r0.f2120j
            if (r3 == 0) goto L23
            r3.e(r2)
        L23:
            boolean r2 = androidx.appcompat.view.menu.l.v(r10)
            r0.f2118h = r2
            androidx.appcompat.view.menu.l r3 = r0.f2120j
            if (r3 == 0) goto L30
            r3.p(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f2134l
            r0.f2121k = r2
            r2 = 0
            r9.f2134l = r2
            androidx.appcompat.view.menu.h r2 = r9.c
            r2.c(r1)
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.f2131i
            int r3 = r2.f2317f
            int r2 = r2.m()
            int r4 = r9.f2142t
            android.view.View r5 = r9.f2135m
            java.util.WeakHashMap<android.view.View, x0.n0> r6 = x0.f0.f31435a
            int r5 = x0.f0.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.f2135m
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f2116f
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.d(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.n$a r0 = r9.f2137o
            if (r0 == 0) goto L79
            r0.c(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.r.j(androidx.appcompat.view.menu.s):boolean");
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable k() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void o(View view) {
        this.f2135m = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2139q = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2138p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2138p = this.f2136n.getViewTreeObserver();
            }
            this.f2138p.removeGlobalOnLayoutListener(this.f2132j);
            this.f2138p = null;
        }
        this.f2136n.removeOnAttachStateChangeListener(this.f2133k);
        PopupWindow.OnDismissListener onDismissListener = this.f2134l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void p(boolean z10) {
        this.f2126d.setForceShowIcon(z10);
    }

    @Override // androidx.appcompat.view.menu.l
    public final void q(int i10) {
        this.f2142t = i10;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void r(int i10) {
        this.f2131i.f2317f = i10;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f2134l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.q
    public final void show() {
        View view;
        boolean z10;
        Rect rect;
        boolean z11 = true;
        if (!a()) {
            if (!this.f2139q && (view = this.f2135m) != null) {
                this.f2136n = view;
                MenuPopupWindow menuPopupWindow = this.f2131i;
                menuPopupWindow.f2337z.setOnDismissListener(this);
                menuPopupWindow.f2327p = this;
                menuPopupWindow.f2336y = true;
                androidx.appcompat.widget.l lVar = menuPopupWindow.f2337z;
                lVar.setFocusable(true);
                View view2 = this.f2136n;
                if (this.f2138p == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f2138p = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f2132j);
                }
                view2.addOnAttachStateChangeListener(this.f2133k);
                menuPopupWindow.f2326o = view2;
                menuPopupWindow.f2323l = this.f2142t;
                boolean z12 = this.f2140r;
                Context context = this.f2125b;
                MenuAdapter menuAdapter = this.f2126d;
                if (!z12) {
                    this.f2141s = l.n(menuAdapter, context, this.f2128f);
                    this.f2140r = true;
                }
                menuPopupWindow.p(this.f2141s);
                lVar.setInputMethodMode(2);
                Rect rect2 = this.f2111a;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                menuPopupWindow.f2335x = rect;
                menuPopupWindow.show();
                b0 b0Var = menuPopupWindow.c;
                b0Var.setOnKeyListener(this);
                if (this.f2143u) {
                    h hVar = this.c;
                    if (hVar.f2062m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) b0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(hVar.f2062m);
                        }
                        frameLayout.setEnabled(false);
                        b0Var.addHeaderView(frameLayout, null, false);
                    }
                }
                menuPopupWindow.n(menuAdapter);
                menuPopupWindow.show();
            } else {
                z11 = false;
            }
        }
        if (z11) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.l
    public final void t(boolean z10) {
        this.f2143u = z10;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void u(int i10) {
        this.f2131i.j(i10);
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            r rVar = r.this;
            ViewTreeObserver viewTreeObserver = rVar.f2138p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    rVar.f2138p = view.getViewTreeObserver();
                }
                rVar.f2138p.removeGlobalOnLayoutListener(rVar.f2132j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void h(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.l
    public final void m(h hVar) {
    }
}
