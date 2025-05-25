package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: MenuPopup.java */
/* loaded from: classes.dex */
public abstract class l implements q, n, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Rect f2111a;

    public static int n(MenuAdapter menuAdapter, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = menuAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = menuAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = menuAdapter.getView(i13, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean v(h hVar) {
        int size = hVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = hVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean f(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean l(j jVar) {
        return false;
    }

    public abstract void m(h hVar);

    public abstract void o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        MenuAdapter menuAdapter;
        int i11;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            menuAdapter = (MenuAdapter) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            menuAdapter = (MenuAdapter) listAdapter;
        }
        h hVar = menuAdapter.mAdapterMenu;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i10);
        if (!(this instanceof e)) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        hVar.q(menuItem, this, i11);
    }

    public abstract void p(boolean z10);

    public abstract void q(int i10);

    public abstract void r(int i10);

    public abstract void s(PopupWindow.OnDismissListener onDismissListener);

    public abstract void t(boolean z10);

    public abstract void u(int i10);

    @Override // androidx.appcompat.view.menu.n
    public final void g(Context context, h hVar) {
    }
}
