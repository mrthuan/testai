package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;

/* compiled from: WidgetAdapter.kt */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final List<Integer> f24830d;

    /* compiled from: WidgetAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "U2px08Up");
        }
    }

    public b(ArrayList arrayList) {
        ea.a.p("KWlKdA==", "fEE9sucl");
        this.f24830d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f24830d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        switch (this.f24830d.get(i10).intValue()) {
            case 1:
            default:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        a holder = aVar;
        g.e(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        int i11;
        int i12;
        int i13;
        g.e(parent, "parent");
        Context context = parent.getContext();
        switch (i10) {
            case 1:
                View i14 = f.i(parent, R.layout.list_item_widget_tools01, parent, false);
                g.d(i14, ea.a.p("UXIAbVFwFXItbhIuV285dF14JilnaVhmloDXdA50LW9bc18xVSAEYTplCHQYIDFhVHM3KQ==", "Ij7oytOj"));
                return new a(i14);
            case 2:
                View i15 = f.i(parent, R.layout.list_item_widget_tools02, parent, false);
                g.d(i15, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1m14D1dDV0CW9fc3syXyASYQBlWnRFIDBhKHNXKQ==", "5SjfLN1S"));
                return new a(i15);
            case 3:
                View i16 = f.i(parent, R.layout.list_item_widget_img2pdf_large, parent, false);
                g.d(i16, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmkIDWcAlmPWwuclZlVSBHYShlJHRZIA5hWXMLKQ==", "tbndrpmb"));
                a aVar = new a(i16);
                ImageView imageView = (ImageView) aVar.itemView.findViewById(R.id.widget_large_img2pdf);
                g.d(context, ea.a.p("UG8ldBZ4dA==", "x7yBBm5M"));
                if (c.j(context)) {
                    i11 = R.drawable.ic_widget_single_img2pdf_large_rtl;
                } else {
                    i11 = R.drawable.ic_widget_single_img2pdf_large;
                }
                imageView.setImageResource(i11);
                return aVar;
            case 4:
                View i17 = f.i(parent, R.layout.list_item_widget_pdf_scanner_large, parent, false);
                g.d(i17, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1m0YDVbgByBmxScixlXyASYQBlWnRFIDBhKHNXKQ==", "3seYSjUQ"));
                a aVar2 = new a(i17);
                ImageView imageView2 = (ImageView) aVar2.itemView.findViewById(R.id.widget_large_pdf_scanner);
                g.d(context, ea.a.p("UG8ldBZ4dA==", "Z8FTDP5N"));
                if (c.j(context)) {
                    i12 = R.drawable.ic_widget_single_pdf_scanner_large_rtl;
                } else {
                    i12 = R.drawable.ic_widget_single_pdf_scanner_large;
                }
                imageView2.setImageResource(i12);
                return aVar2;
            case 5:
                View i18 = f.i(parent, R.layout.list_item_widget_pdf_editor_large, parent, false);
                g.d(i18, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmm4CXdC1yFmwuclZlVSBHYShlJHRZIA5hWXMLKQ==", "iiAxy1BI"));
                a aVar3 = new a(i18);
                ImageView imageView3 = (ImageView) aVar3.itemView.findViewById(R.id.widget_large_pdf_editor);
                g.d(context, ea.a.p("UG8ldBZ4dA==", "2LhNzUaR"));
                if (c.j(context)) {
                    i13 = R.drawable.ic_widget_single_edit_pdf_large_rtl;
                } else {
                    i13 = R.drawable.ic_widget_single_edit_pdf_large;
                }
                imageView3.setImageResource(i13);
                return aVar3;
            case 6:
                View i19 = f.i(parent, R.layout.list_item_widget_img2pdf, parent, false);
                g.d(i19, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1mtYDFdAxpI2cBcC9mXyASYQBlWnRFIDBhKHNXKQ==", "WcSNtOq6"));
                return new a(i19);
            case 7:
                View i20 = f.i(parent, R.layout.list_item_widget_pdf_scanner, parent, false);
                g.d(i20, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmlIDvZh5zUWEhblRyVSBHYShlJHRZIA5hWXMLKQ==", "tNdMvIA2"));
                return new a(i20);
            case 8:
                View i21 = f.i(parent, R.layout.list_item_widget_pdf_editor, parent, false);
                g.d(i21, ea.a.p("VXIkbVtwA3IXbkAuCm84dCF4RiloaS1mqYCXZCRfVGRadCRyXyASYQBlWnRFIDBhKHNXKQ==", "K1B1c4S9"));
                return new a(i21);
            default:
                View i22 = f.i(parent, R.layout.list_item_widget_tools01, parent, false);
                g.d(i22, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmuoDQdBV0WW8jcwExVSBHYShlJHRZIA5hWXMLKQ==", "6w2iXvJ6"));
                return new a(i22);
        }
    }
}
