package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import l.f;

/* compiled from: DecorToolbar.java */
/* loaded from: classes.dex */
public interface x {
    boolean a();

    void b();

    void c(androidx.appcompat.view.menu.h hVar, f.d dVar);

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i();

    boolean j();

    void k(int i10);

    void l();

    void m(int i10);

    void n();

    x0.n0 o(int i10, long j10);

    int p();

    void q();

    void r();

    void s(boolean z10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
