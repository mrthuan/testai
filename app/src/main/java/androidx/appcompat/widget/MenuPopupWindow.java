package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class MenuPopupWindow extends ListPopupWindow implements f0 {
    public static final Method E;
    public f0 D;

    /* loaded from: classes.dex */
    public static class MenuDropDownListView extends b0 {

        /* renamed from: m  reason: collision with root package name */
        public final int f2347m;

        /* renamed from: n  reason: collision with root package name */
        public final int f2348n;

        /* renamed from: o  reason: collision with root package name */
        public f0 f2349o;

        /* renamed from: p  reason: collision with root package name */
        public androidx.appcompat.view.menu.j f2350p;

        /* loaded from: classes.dex */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f2347m = 21;
                this.f2348n = 22;
                return;
            }
            this.f2347m = 22;
            this.f2348n = 21;
        }

        @Override // androidx.appcompat.widget.b0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            MenuAdapter menuAdapter;
            int i10;
            androidx.appcompat.view.menu.j jVar;
            int pointToPosition;
            int i11;
            if (this.f2349o != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (MenuAdapter) adapter;
                    i10 = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < menuAdapter.getCount()) {
                    jVar = menuAdapter.getItem(i11);
                } else {
                    jVar = null;
                }
                androidx.appcompat.view.menu.j jVar2 = this.f2350p;
                if (jVar2 != jVar) {
                    androidx.appcompat.view.menu.h adapterMenu = menuAdapter.getAdapterMenu();
                    if (jVar2 != null) {
                        this.f2349o.f(adapterMenu, jVar2);
                    }
                    this.f2350p = jVar;
                    if (jVar != null) {
                        this.f2349o.c(adapterMenu, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            MenuAdapter menuAdapter;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f2347m) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i10 == this.f2348n) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    menuAdapter = (MenuAdapter) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    menuAdapter = (MenuAdapter) adapter;
                }
                menuAdapter.getAdapterMenu().c(false);
                return true;
            } else {
                return super.onKeyDown(i10, keyEvent);
            }
        }

        public void setHoverListener(f0 f0Var) {
            this.f2349o = f0Var;
        }

        @Override // androidx.appcompat.widget.b0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(Context context, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // androidx.appcompat.widget.f0
    public final void c(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
        f0 f0Var = this.D;
        if (f0Var != null) {
            f0Var.c(hVar, jVar);
        }
    }

    @Override // androidx.appcompat.widget.f0
    public final void f(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        f0 f0Var = this.D;
        if (f0Var != null) {
            f0Var.f(hVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public final b0 o(Context context, boolean z10) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z10);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
