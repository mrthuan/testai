package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.material.progressindicator.BaseProgressIndicator;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public Object f2009a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2010b;
    public Object c;

    public c(Context context) {
        this.f2009a = context;
    }

    public abstract void c();

    public final MenuItem d(MenuItem menuItem) {
        if (menuItem instanceof q0.b) {
            q0.b bVar = (q0.b) menuItem;
            if (((y.i) this.f2010b) == null) {
                this.f2010b = new y.i();
            }
            MenuItem menuItem2 = (MenuItem) ((y.i) this.f2010b).getOrDefault(bVar, null);
            if (menuItem2 == null) {
                k kVar = new k((Context) this.f2009a, bVar);
                ((y.i) this.f2010b).put(bVar, kVar);
                return kVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu e(SubMenu subMenu) {
        if (subMenu instanceof q0.c) {
            q0.c cVar = (q0.c) subMenu;
            if (((y.i) this.c) == null) {
                this.c = new y.i();
            }
            SubMenu subMenu2 = (SubMenu) ((y.i) this.c).getOrDefault(cVar, null);
            if (subMenu2 == null) {
                t tVar = new t((Context) this.f2009a, cVar);
                ((y.i) this.c).put(cVar, tVar);
                return tVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public abstract void f();

    public abstract void g(BaseProgressIndicator.c cVar);

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public c(int i10) {
        this.f2010b = new float[i10 * 2];
        this.c = new int[i10];
    }
}
