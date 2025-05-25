package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p0.a;
import x0.b;

/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class j implements q0.b {
    public x0.b A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a  reason: collision with root package name */
    public final int f2076a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2077b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2078d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f2079e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f2080f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f2081g;

    /* renamed from: h  reason: collision with root package name */
    public char f2082h;

    /* renamed from: j  reason: collision with root package name */
    public char f2084j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f2086l;

    /* renamed from: n  reason: collision with root package name */
    public final h f2088n;

    /* renamed from: o  reason: collision with root package name */
    public s f2089o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2090p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f2091q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f2092r;

    /* renamed from: y  reason: collision with root package name */
    public int f2099y;

    /* renamed from: z  reason: collision with root package name */
    public View f2100z;

    /* renamed from: i  reason: collision with root package name */
    public int f2083i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f2085k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f2087m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f2093s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f2094t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2095u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2096v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2097w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f2098x = 16;
    public boolean C = false;

    /* compiled from: MenuItemImpl.java */
    /* loaded from: classes.dex */
    public class a implements b.InterfaceC0400b {
        public a() {
        }
    }

    public j(h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f2088n = hVar;
        this.f2076a = i11;
        this.f2077b = i10;
        this.c = i12;
        this.f2078d = i13;
        this.f2079e = charSequence;
        this.f2099y = i14;
    }

    public static void c(StringBuilder sb2, String str, int i10, int i11) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // q0.b
    public final q0.b a(x0.b bVar) {
        x0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.getClass();
            bVar2.f31420b = null;
        }
        this.f2100z = null;
        this.A = bVar;
        this.f2088n.p(true);
        x0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // q0.b
    public final x0.b b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2099y & 8) == 0) {
            return false;
        }
        if (this.f2100z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f2088n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2097w && (this.f2095u || this.f2096v)) {
            drawable = drawable.mutate();
            if (this.f2095u) {
                a.b.h(drawable, this.f2093s);
            }
            if (this.f2096v) {
                a.b.i(drawable, this.f2094t);
            }
            this.f2097w = false;
        }
        return drawable;
    }

    public final boolean e() {
        x0.b bVar;
        if ((this.f2099y & 8) == 0) {
            return false;
        }
        if (this.f2100z == null && (bVar = this.A) != null) {
            this.f2100z = bVar.d(this);
        }
        if (this.f2100z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f2088n.f(this);
    }

    public final void f(boolean z10) {
        int i10;
        int i11 = this.f2098x & (-5);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        this.f2098x = i10 | i11;
    }

    public final void g(boolean z10) {
        if (z10) {
            this.f2098x |= 32;
        } else {
            this.f2098x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2100z;
        if (view != null) {
            return view;
        }
        x0.b bVar = this.A;
        if (bVar != null) {
            View d10 = bVar.d(this);
            this.f2100z = d10;
            return d10;
        }
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2085k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2084j;
    }

    @Override // q0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2091q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2077b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2086l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f2087m;
        if (i10 != 0) {
            Drawable a10 = m.a.a(this.f2088n.f2051a, i10);
            this.f2087m = 0;
            this.f2086l = a10;
            return d(a10);
        }
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2093s;
    }

    @Override // q0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2094t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2081g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f2076a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2083i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2082h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2089o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f2079e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2080f;
        if (charSequence == null) {
            return this.f2079e;
        }
        return charSequence;
    }

    @Override // q0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2092r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f2089o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f2098x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f2098x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f2098x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        x0.b bVar = this.A;
        if (bVar != null && bVar.g()) {
            if ((this.f2098x & 8) == 0 && this.A.b()) {
                return true;
            }
            return false;
        } else if ((this.f2098x & 8) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f2100z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f2076a) > 0) {
            view.setId(i10);
        }
        h hVar = this.f2088n;
        hVar.f2060k = true;
        hVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f2084j == c) {
            return this;
        }
        this.f2084j = Character.toLowerCase(c);
        this.f2088n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f2098x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f2098x = i11;
        if (i10 != i11) {
            this.f2088n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f2098x;
        int i12 = i11 & 4;
        h hVar = this.f2088n;
        int i13 = 2;
        if (i12 != 0) {
            hVar.getClass();
            ArrayList<j> arrayList = hVar.f2055f;
            int size = arrayList.size();
            hVar.y();
            for (int i14 = 0; i14 < size; i14++) {
                j jVar = arrayList.get(i14);
                if (jVar.f2077b == this.f2077b) {
                    boolean z12 = true;
                    if ((jVar.f2098x & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && jVar.isCheckable()) {
                        if (jVar != this) {
                            z12 = false;
                        }
                        int i15 = jVar.f2098x;
                        int i16 = i15 & (-3);
                        if (z12) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i17 = i10 | i16;
                        jVar.f2098x = i17;
                        if (i15 != i17) {
                            jVar.f2088n.p(false);
                        }
                    }
                }
            }
            hVar.x();
        } else {
            int i18 = i11 & (-3);
            if (!z10) {
                i13 = 0;
            }
            int i19 = i13 | i18;
            this.f2098x = i19;
            if (i11 != i19) {
                hVar.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f2098x |= 16;
        } else {
            this.f2098x &= -17;
        }
        this.f2088n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2087m = 0;
        this.f2086l = drawable;
        this.f2097w = true;
        this.f2088n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2093s = colorStateList;
        this.f2095u = true;
        this.f2097w = true;
        this.f2088n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2094t = mode;
        this.f2096v = true;
        this.f2097w = true;
        this.f2088n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2081g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f2082h == c) {
            return this;
        }
        this.f2082h = c;
        this.f2088n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2090p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c10) {
        this.f2082h = c;
        this.f2084j = Character.toLowerCase(c10);
        this.f2088n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2099y = i10;
        h hVar = this.f2088n;
        hVar.f2060k = true;
        hVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2079e = charSequence;
        this.f2088n.p(false);
        s sVar = this.f2089o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2080f = charSequence;
        this.f2088n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f2098x;
        int i12 = i11 & (-9);
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f2098x = i13;
        if (i11 != i13) {
            z11 = true;
        }
        if (z11) {
            h hVar = this.f2088n;
            hVar.f2057h = true;
            hVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2079e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final q0.b setContentDescription(CharSequence charSequence) {
        this.f2091q = charSequence;
        this.f2088n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final q0.b setTooltipText(CharSequence charSequence) {
        this.f2092r = charSequence;
        this.f2088n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i10) {
        if (this.f2084j == c && this.f2085k == i10) {
            return this;
        }
        this.f2084j = Character.toLowerCase(c);
        this.f2085k = KeyEvent.normalizeMetaState(i10);
        this.f2088n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i10) {
        if (this.f2082h == c && this.f2083i == i10) {
            return this;
        }
        this.f2082h = c;
        this.f2083i = KeyEvent.normalizeMetaState(i10);
        this.f2088n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c10, int i10, int i11) {
        this.f2082h = c;
        this.f2083i = KeyEvent.normalizeMetaState(i10);
        this.f2084j = Character.toLowerCase(c10);
        this.f2085k = KeyEvent.normalizeMetaState(i11);
        this.f2088n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f2086l = null;
        this.f2087m = i10;
        this.f2097w = true;
        this.f2088n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f2088n.f2051a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        h hVar = this.f2088n;
        Context context = hVar.f2051a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f2100z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f2076a) > 0) {
            inflate.setId(i11);
        }
        hVar.f2060k = true;
        hVar.p(true);
        return this;
    }
}
