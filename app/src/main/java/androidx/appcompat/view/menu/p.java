package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: MenuWrapperICS.java */
/* loaded from: classes.dex */
public class p extends c implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final q0.a f2124d;

    public p(Context context, q0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f2124d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return d(this.f2124d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f2124d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = d(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return e(this.f2124d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        y.i iVar = (y.i) this.f2010b;
        if (iVar != null) {
            iVar.clear();
        }
        y.i iVar2 = (y.i) this.c;
        if (iVar2 != null) {
            iVar2.clear();
        }
        this.f2124d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f2124d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return d(this.f2124d.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return d(this.f2124d.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f2124d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f2124d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f2124d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f2124d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((y.i) this.f2010b) != null) {
            int i11 = 0;
            while (true) {
                y.i iVar = (y.i) this.f2010b;
                if (i11 >= iVar.c) {
                    break;
                }
                if (((q0.b) iVar.h(i11)).getGroupId() == i10) {
                    ((y.i) this.f2010b).j(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f2124d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((y.i) this.f2010b) != null) {
            int i11 = 0;
            while (true) {
                y.i iVar = (y.i) this.f2010b;
                if (i11 >= iVar.c) {
                    break;
                } else if (((q0.b) iVar.h(i11)).getItemId() == i10) {
                    ((y.i) this.f2010b).j(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f2124d.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f2124d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f2124d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f2124d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f2124d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2124d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return d(this.f2124d.add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return e(this.f2124d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f2124d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return e(this.f2124d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return d(this.f2124d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return e(this.f2124d.addSubMenu(i10, i11, i12, i13));
    }
}
