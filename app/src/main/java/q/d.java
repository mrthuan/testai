package q;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q.a;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public final class d extends a implements h.a {
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final ActionBarContextView f29001d;

    /* renamed from: e  reason: collision with root package name */
    public final a.InterfaceC0365a f29002e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<View> f29003f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f29004g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.appcompat.view.menu.h f29005h;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0365a interfaceC0365a) {
        this.c = context;
        this.f29001d = actionBarContextView;
        this.f29002e = interfaceC0365a;
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(actionBarContextView.getContext());
        hVar.f2061l = 1;
        this.f29005h = hVar;
        hVar.f2054e = this;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        return this.f29002e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final void b(androidx.appcompat.view.menu.h hVar) {
        i();
        androidx.appcompat.widget.c cVar = this.f29001d.f2481d;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // q.a
    public final void c() {
        if (this.f29004g) {
            return;
        }
        this.f29004g = true;
        this.f29002e.a(this);
    }

    @Override // q.a
    public final View d() {
        WeakReference<View> weakReference = this.f29003f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // q.a
    public final androidx.appcompat.view.menu.h e() {
        return this.f29005h;
    }

    @Override // q.a
    public final MenuInflater f() {
        return new f(this.f29001d.getContext());
    }

    @Override // q.a
    public final CharSequence g() {
        return this.f29001d.getSubtitle();
    }

    @Override // q.a
    public final CharSequence h() {
        return this.f29001d.getTitle();
    }

    @Override // q.a
    public final void i() {
        this.f29002e.b(this, this.f29005h);
    }

    @Override // q.a
    public final boolean j() {
        return this.f29001d.f2167s;
    }

    @Override // q.a
    public final void k(View view) {
        WeakReference<View> weakReference;
        this.f29001d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f29003f = weakReference;
    }

    @Override // q.a
    public final void l(int i10) {
        m(this.c.getString(i10));
    }

    @Override // q.a
    public final void m(CharSequence charSequence) {
        this.f29001d.setSubtitle(charSequence);
    }

    @Override // q.a
    public final void n(int i10) {
        o(this.c.getString(i10));
    }

    @Override // q.a
    public final void o(CharSequence charSequence) {
        this.f29001d.setTitle(charSequence);
    }

    @Override // q.a
    public final void p(boolean z10) {
        this.f28995b = z10;
        this.f29001d.setTitleOptional(z10);
    }
}
