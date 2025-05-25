package lib.zj.pdfeditor;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* loaded from: classes3.dex */
public class PDFReflowAdapter extends BaseAdapter {
    private final Context mContext;
    private final ReaderPDFCore mCore;

    public PDFReflowAdapter(Context context, ReaderPDFCore readerPDFCore) {
        this.mContext = context;
        this.mCore = readerPDFCore;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mCore.countPages();
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
        PDFReflowView pDFReflowView;
        if (view == null) {
            pDFReflowView = new PDFReflowView(this.mContext, this.mCore, new Point(viewGroup.getWidth(), viewGroup.getHeight()));
        } else {
            pDFReflowView = (PDFReflowView) view;
        }
        new PointF();
        pDFReflowView.c = i10;
        y yVar = pDFReflowView.f21264f;
        if (yVar != null) {
            yVar.a();
        }
        y yVar2 = new y(pDFReflowView);
        pDFReflowView.f21264f = yVar2;
        yVar2.c(new Void[0]);
        return pDFReflowView;
    }
}
