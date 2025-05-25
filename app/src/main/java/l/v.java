package l;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.w0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.a;
import l.f;
import x0.f0;
import x0.n0;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public final class v extends l.a {

    /* renamed from: a  reason: collision with root package name */
    public final w0 f20382a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f20383b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20384d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20385e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f20386f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<a.b> f20387g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final a f20388h = new a();

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.h hVar;
            v vVar = v.this;
            Window.Callback callback = vVar.f20383b;
            Menu s4 = vVar.s();
            if (s4 instanceof androidx.appcompat.view.menu.h) {
                hVar = (androidx.appcompat.view.menu.h) s4;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                hVar.y();
            }
            try {
                s4.clear();
                if (!callback.onCreatePanelMenu(0, s4) || !callback.onPreparePanel(0, null, s4)) {
                    s4.clear();
                }
            } finally {
                if (hVar != null) {
                    hVar.x();
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class b implements Toolbar.h {
        public b() {
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements n.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f20391a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
            if (this.f20391a) {
                return;
            }
            this.f20391a = true;
            v vVar = v.this;
            vVar.f20382a.h();
            vVar.f20383b.onPanelClosed(108, hVar);
            this.f20391a = false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            v.this.f20383b.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements h.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void b(androidx.appcompat.view.menu.h hVar) {
            v vVar = v.this;
            boolean a10 = vVar.f20382a.a();
            Window.Callback callback = vVar.f20383b;
            if (a10) {
                callback.onPanelClosed(108, hVar);
            } else if (callback.onPreparePanel(0, null, hVar)) {
                callback.onMenuOpened(108, hVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class e implements f.c {
        public e() {
        }
    }

    public v(Toolbar toolbar, CharSequence charSequence, f.j jVar) {
        b bVar = new b();
        toolbar.getClass();
        w0 w0Var = new w0(toolbar, false);
        this.f20382a = w0Var;
        jVar.getClass();
        this.f20383b = jVar;
        w0Var.f2701l = jVar;
        toolbar.setOnMenuItemClickListener(bVar);
        w0Var.setWindowTitle(charSequence);
        this.c = new e();
    }

    @Override // l.a
    public final boolean a() {
        return this.f20382a.f();
    }

    @Override // l.a
    public final boolean b() {
        w0 w0Var = this.f20382a;
        if (w0Var.j()) {
            w0Var.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // l.a
    public final void c(boolean z10) {
        if (z10 == this.f20386f) {
            return;
        }
        this.f20386f = z10;
        ArrayList<a.b> arrayList = this.f20387g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
    }

    @Override // l.a
    public final int d() {
        return this.f20382a.f2692b;
    }

    @Override // l.a
    public final Context e() {
        return this.f20382a.getContext();
    }

    @Override // l.a
    public final boolean f() {
        w0 w0Var = this.f20382a;
        Toolbar toolbar = w0Var.f2691a;
        a aVar = this.f20388h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = w0Var.f2691a;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.m(toolbar2, aVar);
        return true;
    }

    @Override // l.a
    public final void h() {
        this.f20382a.f2691a.removeCallbacks(this.f20388h);
    }

    @Override // l.a
    public final boolean i(int i10, KeyEvent keyEvent) {
        int i11;
        Menu s4 = s();
        if (s4 == null) {
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
        s4.setQwertyMode(z10);
        return s4.performShortcut(i10, keyEvent, 0);
    }

    @Override // l.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // l.a
    public final boolean k() {
        return this.f20382a.g();
    }

    @Override // l.a
    public final void l(ColorDrawable colorDrawable) {
        w0 w0Var = this.f20382a;
        w0Var.getClass();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.q(w0Var.f2691a, colorDrawable);
    }

    @Override // l.a
    public final void n(boolean z10) {
        w0 w0Var = this.f20382a;
        w0Var.k((w0Var.f2692b & (-5)) | 4);
    }

    @Override // l.a
    public final void p(CharSequence charSequence) {
        this.f20382a.setWindowTitle(charSequence);
    }

    @Override // l.a
    public final void q() {
        this.f20382a.setVisibility(0);
    }

    public final Menu s() {
        boolean z10 = this.f20385e;
        w0 w0Var = this.f20382a;
        if (!z10) {
            c cVar = new c();
            d dVar = new d();
            Toolbar toolbar = w0Var.f2691a;
            toolbar.N = cVar;
            toolbar.O = dVar;
            ActionMenuView actionMenuView = toolbar.f2443a;
            if (actionMenuView != null) {
                actionMenuView.f2203u = cVar;
                actionMenuView.f2204v = dVar;
            }
            this.f20385e = true;
        }
        return w0Var.f2691a.getMenu();
    }

    @Override // l.a
    public final void g() {
    }

    @Override // l.a
    public final void m(boolean z10) {
    }

    @Override // l.a
    public final void o(boolean z10) {
    }
}
