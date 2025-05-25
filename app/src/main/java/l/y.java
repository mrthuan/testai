package l;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.a;
import l.f;
import pdf.pdfreader.viewer.editor.free.R;
import q.a;
import x0.f0;
import x0.n0;
import x0.p0;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public final class y extends l.a implements ActionBarOverlayLayout.d {
    public static final AccelerateInterpolator A = new AccelerateInterpolator();
    public static final DecelerateInterpolator B = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f20403a;

    /* renamed from: b  reason: collision with root package name */
    public Context f20404b;
    public final Activity c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarOverlayLayout f20405d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f20406e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.appcompat.widget.x f20407f;

    /* renamed from: g  reason: collision with root package name */
    public ActionBarContextView f20408g;

    /* renamed from: h  reason: collision with root package name */
    public final View f20409h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f20410i;

    /* renamed from: j  reason: collision with root package name */
    public d f20411j;

    /* renamed from: k  reason: collision with root package name */
    public d f20412k;

    /* renamed from: l  reason: collision with root package name */
    public a.InterfaceC0365a f20413l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f20414m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<a.b> f20415n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f20416o;

    /* renamed from: p  reason: collision with root package name */
    public int f20417p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f20418q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f20419r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f20420s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f20421t;

    /* renamed from: u  reason: collision with root package name */
    public q.g f20422u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f20423v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f20424w;

    /* renamed from: x  reason: collision with root package name */
    public final a f20425x;

    /* renamed from: y  reason: collision with root package name */
    public final b f20426y;

    /* renamed from: z  reason: collision with root package name */
    public final c f20427z;

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.s {
        public a() {
        }

        @Override // x0.o0
        public final void a() {
            View view;
            y yVar = y.this;
            if (yVar.f20418q && (view = yVar.f20409h) != null) {
                view.setTranslationY(0.0f);
                yVar.f20406e.setTranslationY(0.0f);
            }
            yVar.f20406e.setVisibility(8);
            yVar.f20406e.setTransitioning(false);
            yVar.f20422u = null;
            a.InterfaceC0365a interfaceC0365a = yVar.f20413l;
            if (interfaceC0365a != null) {
                interfaceC0365a.a(yVar.f20412k);
                yVar.f20412k = null;
                yVar.f20413l = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = yVar.f20405d;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class b extends androidx.activity.s {
        public b() {
        }

        @Override // x0.o0
        public final void a() {
            y yVar = y.this;
            yVar.f20422u = null;
            yVar.f20406e.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class c implements p0 {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends q.a implements h.a {
        public final Context c;

        /* renamed from: d  reason: collision with root package name */
        public final androidx.appcompat.view.menu.h f20431d;

        /* renamed from: e  reason: collision with root package name */
        public a.InterfaceC0365a f20432e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<View> f20433f;

        public d(Context context, f.e eVar) {
            this.c = context;
            this.f20432e = eVar;
            androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
            hVar.f2061l = 1;
            this.f20431d = hVar;
            hVar.f2054e = this;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            a.InterfaceC0365a interfaceC0365a = this.f20432e;
            if (interfaceC0365a != null) {
                return interfaceC0365a.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void b(androidx.appcompat.view.menu.h hVar) {
            if (this.f20432e == null) {
                return;
            }
            i();
            androidx.appcompat.widget.c cVar = y.this.f20408g.f2481d;
            if (cVar != null) {
                cVar.o();
            }
        }

        @Override // q.a
        public final void c() {
            boolean z10;
            y yVar = y.this;
            if (yVar.f20411j != this) {
                return;
            }
            if (yVar.f20419r) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                yVar.f20412k = this;
                yVar.f20413l = this.f20432e;
            } else {
                this.f20432e.a(this);
            }
            this.f20432e = null;
            yVar.s(false);
            ActionBarContextView actionBarContextView = yVar.f20408g;
            if (actionBarContextView.f2159k == null) {
                actionBarContextView.h();
            }
            yVar.f20405d.setHideOnContentScrollEnabled(yVar.f20424w);
            yVar.f20411j = null;
        }

        @Override // q.a
        public final View d() {
            WeakReference<View> weakReference = this.f20433f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // q.a
        public final androidx.appcompat.view.menu.h e() {
            return this.f20431d;
        }

        @Override // q.a
        public final MenuInflater f() {
            return new q.f(this.c);
        }

        @Override // q.a
        public final CharSequence g() {
            return y.this.f20408g.getSubtitle();
        }

        @Override // q.a
        public final CharSequence h() {
            return y.this.f20408g.getTitle();
        }

        @Override // q.a
        public final void i() {
            if (y.this.f20411j != this) {
                return;
            }
            androidx.appcompat.view.menu.h hVar = this.f20431d;
            hVar.y();
            try {
                this.f20432e.b(this, hVar);
            } finally {
                hVar.x();
            }
        }

        @Override // q.a
        public final boolean j() {
            return y.this.f20408g.f2167s;
        }

        @Override // q.a
        public final void k(View view) {
            y.this.f20408g.setCustomView(view);
            this.f20433f = new WeakReference<>(view);
        }

        @Override // q.a
        public final void l(int i10) {
            m(y.this.f20403a.getResources().getString(i10));
        }

        @Override // q.a
        public final void m(CharSequence charSequence) {
            y.this.f20408g.setSubtitle(charSequence);
        }

        @Override // q.a
        public final void n(int i10) {
            o(y.this.f20403a.getResources().getString(i10));
        }

        @Override // q.a
        public final void o(CharSequence charSequence) {
            y.this.f20408g.setTitle(charSequence);
        }

        @Override // q.a
        public final void p(boolean z10) {
            this.f28995b = z10;
            y.this.f20408g.setTitleOptional(z10);
        }
    }

    public y(Activity activity, boolean z10) {
        new ArrayList();
        this.f20415n = new ArrayList<>();
        this.f20417p = 0;
        this.f20418q = true;
        this.f20421t = true;
        this.f20425x = new a();
        this.f20426y = new b();
        this.f20427z = new c();
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        t(decorView);
        if (z10) {
            return;
        }
        this.f20409h = decorView.findViewById(16908290);
    }

    @Override // l.a
    public final boolean b() {
        androidx.appcompat.widget.x xVar = this.f20407f;
        if (xVar != null && xVar.j()) {
            this.f20407f.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // l.a
    public final void c(boolean z10) {
        if (z10 == this.f20414m) {
            return;
        }
        this.f20414m = z10;
        ArrayList<a.b> arrayList = this.f20415n;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
    }

    @Override // l.a
    public final int d() {
        return this.f20407f.p();
    }

    @Override // l.a
    public final Context e() {
        if (this.f20404b == null) {
            TypedValue typedValue = new TypedValue();
            this.f20403a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f20404b = new ContextThemeWrapper(this.f20403a, i10);
            } else {
                this.f20404b = this.f20403a;
            }
        }
        return this.f20404b;
    }

    @Override // l.a
    public final void g() {
        u(this.f20403a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // l.a
    public final boolean i(int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.h hVar;
        int i11;
        d dVar = this.f20411j;
        if (dVar == null || (hVar = dVar.f20431d) == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        hVar.setQwertyMode(z10);
        return hVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // l.a
    public final void l(ColorDrawable colorDrawable) {
        this.f20406e.setPrimaryBackground(colorDrawable);
    }

    @Override // l.a
    public final void m(boolean z10) {
        if (!this.f20410i) {
            n(z10);
        }
    }

    @Override // l.a
    public final void n(boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        int p10 = this.f20407f.p();
        this.f20410i = true;
        this.f20407f.k((i10 & 4) | ((-5) & p10));
    }

    @Override // l.a
    public final void o(boolean z10) {
        q.g gVar;
        this.f20423v = z10;
        if (!z10 && (gVar = this.f20422u) != null) {
            gVar.a();
        }
    }

    @Override // l.a
    public final void p(CharSequence charSequence) {
        this.f20407f.setWindowTitle(charSequence);
    }

    @Override // l.a
    public final q.a r(f.e eVar) {
        d dVar = this.f20411j;
        if (dVar != null) {
            dVar.c();
        }
        this.f20405d.setHideOnContentScrollEnabled(false);
        this.f20408g.h();
        d dVar2 = new d(this.f20408g.getContext(), eVar);
        androidx.appcompat.view.menu.h hVar = dVar2.f20431d;
        hVar.y();
        try {
            if (dVar2.f20432e.d(dVar2, hVar)) {
                this.f20411j = dVar2;
                dVar2.i();
                this.f20408g.f(dVar2);
                s(true);
                return dVar2;
            }
            return null;
        } finally {
            hVar.x();
        }
    }

    public final void s(boolean z10) {
        n0 o10;
        n0 e10;
        long j10;
        if (z10) {
            if (!this.f20420s) {
                this.f20420s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20405d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                v(false);
            }
        } else if (this.f20420s) {
            this.f20420s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20405d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            v(false);
        }
        ActionBarContainer actionBarContainer = this.f20406e;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.g.c(actionBarContainer)) {
            if (z10) {
                e10 = this.f20407f.o(4, 100L);
                o10 = this.f20408g.e(0, 200L);
            } else {
                o10 = this.f20407f.o(0, 200L);
                e10 = this.f20408g.e(8, 100L);
            }
            q.g gVar = new q.g();
            ArrayList<n0> arrayList = gVar.f29043a;
            arrayList.add(e10);
            View view = e10.f31469a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = o10.f31469a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(o10);
            gVar.b();
        } else if (z10) {
            this.f20407f.setVisibility(4);
            this.f20408g.setVisibility(0);
        } else {
            this.f20407f.setVisibility(0);
            this.f20408g.setVisibility(8);
        }
    }

    public final void t(View view) {
        String str;
        androidx.appcompat.widget.x wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f20405d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof androidx.appcompat.widget.x) {
            wrapper = (androidx.appcompat.widget.x) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f20407f = wrapper;
        this.f20408g = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f20406e = actionBarContainer;
        androidx.appcompat.widget.x xVar = this.f20407f;
        if (xVar != null && this.f20408g != null && actionBarContainer != null) {
            this.f20403a = xVar.getContext();
            if ((this.f20407f.p() & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f20410i = true;
            }
            Context context = this.f20403a;
            if (context.getApplicationInfo().targetSdkVersion < 14) {
            }
            this.f20407f.i();
            u(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f20403a.obtainStyledAttributes(null, k.a.f19429a, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20405d;
                if (actionBarOverlayLayout2.f2176h) {
                    this.f20424w = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f20406e;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.i.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(y.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void u(boolean z10) {
        this.f20416o = z10;
        if (!z10) {
            this.f20407f.l();
            this.f20406e.setTabContainer(null);
        } else {
            this.f20406e.setTabContainer(null);
            this.f20407f.l();
        }
        this.f20407f.n();
        androidx.appcompat.widget.x xVar = this.f20407f;
        boolean z11 = this.f20416o;
        xVar.s(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f20405d;
        boolean z12 = this.f20416o;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void v(boolean z10) {
        boolean z11;
        int[] iArr;
        int[] iArr2;
        boolean z12 = this.f20419r;
        if (this.f20420s || !z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.f20409h;
        final c cVar = this.f20427z;
        if (z11) {
            if (!this.f20421t) {
                this.f20421t = true;
                q.g gVar = this.f20422u;
                if (gVar != null) {
                    gVar.a();
                }
                this.f20406e.setVisibility(0);
                int i10 = this.f20417p;
                b bVar = this.f20426y;
                if (i10 == 0 && (this.f20423v || z10)) {
                    this.f20406e.setTranslationY(0.0f);
                    float f10 = -this.f20406e.getHeight();
                    if (z10) {
                        this.f20406e.getLocationInWindow(new int[]{0, 0});
                        f10 -= iArr2[1];
                    }
                    this.f20406e.setTranslationY(f10);
                    q.g gVar2 = new q.g();
                    n0 a10 = f0.a(this.f20406e);
                    a10.e(0.0f);
                    final View view2 = a10.f31469a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: x0.l0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) l.y.this.f20406e.getParent()).invalidate();
                                }
                            };
                        }
                        n0.a.a(view2.animate(), animatorUpdateListener);
                    }
                    boolean z13 = gVar2.f29046e;
                    ArrayList<n0> arrayList = gVar2.f29043a;
                    if (!z13) {
                        arrayList.add(a10);
                    }
                    if (this.f20418q && view != null) {
                        view.setTranslationY(f10);
                        n0 a11 = f0.a(view);
                        a11.e(0.0f);
                        if (!gVar2.f29046e) {
                            arrayList.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = B;
                    boolean z14 = gVar2.f29046e;
                    if (!z14) {
                        gVar2.c = decelerateInterpolator;
                    }
                    if (!z14) {
                        gVar2.f29044b = 250L;
                    }
                    if (!z14) {
                        gVar2.f29045d = bVar;
                    }
                    this.f20422u = gVar2;
                    gVar2.b();
                } else {
                    this.f20406e.setAlpha(1.0f);
                    this.f20406e.setTranslationY(0.0f);
                    if (this.f20418q && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    bVar.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20405d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f20421t) {
            this.f20421t = false;
            q.g gVar3 = this.f20422u;
            if (gVar3 != null) {
                gVar3.a();
            }
            int i11 = this.f20417p;
            a aVar = this.f20425x;
            if (i11 == 0 && (this.f20423v || z10)) {
                this.f20406e.setAlpha(1.0f);
                this.f20406e.setTransitioning(true);
                q.g gVar4 = new q.g();
                float f11 = -this.f20406e.getHeight();
                if (z10) {
                    this.f20406e.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr[1];
                }
                n0 a12 = f0.a(this.f20406e);
                a12.e(f11);
                final View view3 = a12.f31469a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: x0.l0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) l.y.this.f20406e.getParent()).invalidate();
                            }
                        };
                    }
                    n0.a.a(view3.animate(), animatorUpdateListener);
                }
                boolean z15 = gVar4.f29046e;
                ArrayList<n0> arrayList2 = gVar4.f29043a;
                if (!z15) {
                    arrayList2.add(a12);
                }
                if (this.f20418q && view != null) {
                    n0 a13 = f0.a(view);
                    a13.e(f11);
                    if (!gVar4.f29046e) {
                        arrayList2.add(a13);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = A;
                boolean z16 = gVar4.f29046e;
                if (!z16) {
                    gVar4.c = accelerateInterpolator;
                }
                if (!z16) {
                    gVar4.f29044b = 250L;
                }
                if (!z16) {
                    gVar4.f29045d = aVar;
                }
                this.f20422u = gVar4;
                gVar4.b();
                return;
            }
            aVar.a();
        }
    }

    public y(Dialog dialog) {
        new ArrayList();
        this.f20415n = new ArrayList<>();
        this.f20417p = 0;
        this.f20418q = true;
        this.f20421t = true;
        this.f20425x = new a();
        this.f20426y = new b();
        this.f20427z = new c();
        t(dialog.getWindow().getDecorView());
    }

    @Override // l.a
    public final void q() {
    }
}
