package lib.zj.pdfeditor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class OutlineAdapter extends BaseAdapter {
    private final LayoutInflater mInflater;
    private final OutlineItem[] mItems;

    public OutlineAdapter(LayoutInflater layoutInflater, OutlineItem[] outlineItemArr) {
        this.mInflater = layoutInflater;
        this.mItems = outlineItemArr;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mItems.length;
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
        if (view == null) {
            view = this.mInflater.inflate(R.layout.outline_entry, (ViewGroup) null);
        }
        int i11 = this.mItems[i10].level;
        if (i11 > 8) {
            i11 = 8;
        }
        String str = "";
        for (int i12 = 0; i12 < i11; i12++) {
            str = a6.h.c(str, "   ");
        }
        StringBuilder k10 = a0.a.k(str);
        k10.append(this.mItems[i10].title);
        ((TextView) view.findViewById(R.id.title)).setText(k10.toString());
        ((TextView) view.findViewById(R.id.page)).setText(String.valueOf(this.mItems[i10].page + 1));
        return view;
    }
}
