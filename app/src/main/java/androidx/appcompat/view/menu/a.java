package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p0.a;

/* compiled from: ActionMenuItem.java */
/* loaded from: classes.dex */
public final class a implements q0.b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f1986a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f1987b;
    public Intent c;

    /* renamed from: d  reason: collision with root package name */
    public char f1988d;

    /* renamed from: f  reason: collision with root package name */
    public char f1990f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1992h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f1993i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1994j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1995k;

    /* renamed from: e  reason: collision with root package name */
    public int f1989e = 4096;

    /* renamed from: g  reason: collision with root package name */
    public int f1991g = 4096;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1996l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f1997m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1998n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1999o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f2000p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f1993i = context;
        this.f1986a = charSequence;
    }

    @Override // q0.b
    public final q0.b a(x0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // q0.b
    public final x0.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f1992h;
        if (drawable != null) {
            if (this.f1998n || this.f1999o) {
                this.f1992h = drawable;
                Drawable mutate = drawable.mutate();
                this.f1992h = mutate;
                if (this.f1998n) {
                    a.b.h(mutate, this.f1996l);
                }
                if (this.f1999o) {
                    a.b.i(this.f1992h, this.f1997m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1991g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1990f;
    }

    @Override // q0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f1994j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f1992h;
    }

    @Override // q0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f1996l;
    }

    @Override // q0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1997m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f1989e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f1988d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f1986a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1987b;
        if (charSequence == null) {
            return this.f1986a;
        }
        return charSequence;
    }

    @Override // q0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f1995k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f2000p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f2000p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f2000p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f2000p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f1990f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f2000p = (z10 ? 1 : 0) | (this.f2000p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f2000p & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f2000p = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f1994j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f2000p & (-17);
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f2000p = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1992h = drawable;
        c();
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1996l = colorStateList;
        this.f1998n = true;
        c();
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1997m = mode;
        this.f1999o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f1988d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c10) {
        this.f1988d = c;
        this.f1990f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1986a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1987b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f1995k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f2000p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f2000p = i11 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i10) {
        this.f1990f = Character.toLowerCase(c);
        this.f1991g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final q0.b setContentDescription(CharSequence charSequence) {
        this.f1994j = charSequence;
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i10) {
        this.f1988d = c;
        this.f1989e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f1986a = this.f1993i.getResources().getString(i10);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final q0.b setTooltipText(CharSequence charSequence) {
        this.f1995k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f1992h = androidx.core.content.a.getDrawable(this.f1993i, i10);
        c();
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c10, int i10, int i11) {
        this.f1988d = c;
        this.f1989e = KeyEvent.normalizeMetaState(i10);
        this.f1990f = Character.toLowerCase(c10);
        this.f1991g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
