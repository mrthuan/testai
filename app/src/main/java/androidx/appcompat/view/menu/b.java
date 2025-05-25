package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.n;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2001a;

    /* renamed from: b  reason: collision with root package name */
    public Context f2002b;
    public h c;

    /* renamed from: d  reason: collision with root package name */
    public final LayoutInflater f2003d;

    /* renamed from: e  reason: collision with root package name */
    public n.a f2004e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2005f = R.layout.abc_action_menu_layout;

    /* renamed from: g  reason: collision with root package name */
    public final int f2006g = R.layout.abc_action_menu_item_layout;

    /* renamed from: h  reason: collision with root package name */
    public o f2007h;

    /* renamed from: i  reason: collision with root package name */
    public int f2008i;

    public b(Context context) {
        this.f2001a = context;
        this.f2003d = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.n
    public final void e(n.a aVar) {
        this.f2004e = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean f(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final int getId() {
        return this.f2008i;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean l(j jVar) {
        return false;
    }
}
