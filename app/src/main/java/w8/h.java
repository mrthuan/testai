package w8;

import android.view.SubMenu;

/* compiled from: NavigationMenu.java */
/* loaded from: classes2.dex */
public final class h extends androidx.appcompat.view.menu.h {
    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        androidx.appcompat.view.menu.j a10 = a(i10, i11, i12, charSequence);
        k kVar = new k(this.f2051a, this, a10);
        a10.f2089o = kVar;
        kVar.setHeaderTitle(a10.f2079e);
        return kVar;
    }
}
