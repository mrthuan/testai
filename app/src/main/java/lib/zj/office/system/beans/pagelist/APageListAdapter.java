package lib.zj.office.system.beans.pagelist;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* loaded from: classes3.dex */
public class APageListAdapter extends BaseAdapter {
    private APageListView listView;

    public APageListAdapter(APageListView aPageListView) {
        this.listView = aPageListView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.listView.getPageCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        APageListItem aPageListItem = (APageListItem) view;
        Rect g10 = this.listView.getPageListViewListener().g(i10);
        if (view == null && (aPageListItem = this.listView.f21008g.b(i10)) == null) {
            g10.right = 794;
            g10.bottom = 1124;
            aPageListItem = new APageListItem(this.listView, g10.width(), g10.height());
        }
        aPageListItem.g(i10, g10.width(), g10.height());
        return aPageListItem;
    }

    public void dispose() {
    }
}
