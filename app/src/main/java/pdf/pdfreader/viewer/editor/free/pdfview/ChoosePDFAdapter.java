package pdf.pdfreader.viewer.editor.free.pdfview;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.LinkedList;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.pdfeditor.ChoosePDFItem;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class ChoosePDFAdapter extends BaseAdapter {
    private final LayoutInflater mInflater;
    private final LinkedList<ChoosePDFItem> mItems = new LinkedList<>();

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26149a;

        static {
            int[] iArr = new int[ChoosePDFItem.Type.values().length];
            f26149a = iArr;
            try {
                iArr[ChoosePDFItem.Type.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26149a[ChoosePDFItem.Type.DIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26149a[ChoosePDFItem.Type.DOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ChoosePDFAdapter(LayoutInflater layoutInflater) {
        this.mInflater = layoutInflater;
    }

    private int iconForType(ChoosePDFItem.Type type) {
        int i10 = a.f26149a[type.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return 0;
                }
                return R.drawable.ic_doc;
            }
            return R.drawable.ic_dir;
        }
        return R.drawable.ic_arrow_up;
    }

    public void add(ChoosePDFItem choosePDFItem) {
        this.mItems.add(choosePDFItem);
        notifyDataSetChanged();
    }

    public void clear() {
        this.mItems.clear();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mItems.size();
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
            view = this.mInflater.inflate(R.layout.picker_entry, (ViewGroup) null);
        }
        this.mItems.get(i10).getClass();
        ((TextView) view.findViewById(R.id.name)).setText((CharSequence) null);
        ((ImageView) view.findViewById(R.id.icon)).setImageResource(iconForType(null));
        ((ImageView) view.findViewById(R.id.icon)).setColorFilter(Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0, 0));
        return view;
    }
}
