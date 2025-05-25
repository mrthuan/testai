package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class MenuAdapter extends BaseAdapter {
    h mAdapterMenu;
    private int mExpandedIndex = -1;
    private boolean mForceShowIcon;
    private final LayoutInflater mInflater;
    private final int mItemLayoutRes;
    private final boolean mOverflowOnly;

    public MenuAdapter(h hVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.mOverflowOnly = z10;
        this.mInflater = layoutInflater;
        this.mAdapterMenu = hVar;
        this.mItemLayoutRes = i10;
        findExpandedIndex();
    }

    public void findExpandedIndex() {
        h hVar = this.mAdapterMenu;
        j jVar = hVar.f2071v;
        if (jVar != null) {
            hVar.i();
            ArrayList<j> arrayList = hVar.f2059j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == jVar) {
                    this.mExpandedIndex = i10;
                    return;
                }
            }
        }
        this.mExpandedIndex = -1;
    }

    public h getAdapterMenu() {
        return this.mAdapterMenu;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<j> l10;
        if (this.mOverflowOnly) {
            h hVar = this.mAdapterMenu;
            hVar.i();
            l10 = hVar.f2059j;
        } else {
            l10 = this.mAdapterMenu.l();
        }
        if (this.mExpandedIndex < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    public boolean getForceShowIcon() {
        return this.mForceShowIcon;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10 = false;
        if (view == null) {
            view = this.mInflater.inflate(this.mItemLayoutRes, viewGroup, false);
        }
        int i12 = getItem(i10).f2077b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f2077b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.mAdapterMenu.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        o.a aVar = (o.a) view;
        if (this.mForceShowIcon) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        findExpandedIndex();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean z10) {
        this.mForceShowIcon = z10;
    }

    @Override // android.widget.Adapter
    public j getItem(int i10) {
        ArrayList<j> l10;
        if (this.mOverflowOnly) {
            h hVar = this.mAdapterMenu;
            hVar.i();
            l10 = hVar.f2059j;
        } else {
            l10 = this.mAdapterMenu.l();
        }
        int i11 = this.mExpandedIndex;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return l10.get(i10);
    }
}
