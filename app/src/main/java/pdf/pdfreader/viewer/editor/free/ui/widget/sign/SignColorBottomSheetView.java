package pdf.pdfreader.viewer.editor.free.ui.widget.sign;

import am.z2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.assetpacks.c;
import java.util.ArrayList;
import nl.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import xk.g;

/* loaded from: classes3.dex */
public class SignColorBottomSheetView extends BaseBottomSheetView<z2> {
    public g.b B;
    public g C;

    /* loaded from: classes3.dex */
    public class a implements g.b {
        public a() {
        }

        @Override // xk.g.b
        public final void a(f fVar) {
            g.b bVar = SignColorBottomSheetView.this.B;
            if (bVar != null) {
                bVar.a(fVar);
            }
        }
    }

    public SignColorBottomSheetView(Context context) {
        super(context);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final z2 D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_sign_color_bottom_sheet, viewGroup, false);
        viewGroup.addView(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i10 = R.id.sign_color_rv_content;
        RecyclerView recyclerView = (RecyclerView) c.u(inflate, R.id.sign_color_rv_content);
        if (recyclerView != null) {
            i10 = R.id.sign_color_tv_title;
            TextView textView = (TextView) c.u(inflate, R.id.sign_color_tv_title);
            if (textView != null) {
                return new z2(linearLayout, recyclerView, textView);
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpB2hESSw6IA==", "ycwbsdhK").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void F(Context context) {
        this.C = new g(context);
        ((z2) this.f28172y).f1698b.setLayoutManager(new LinearLayoutManager(0));
        ((z2) this.f28172y).f1698b.setAdapter(this.C);
        g gVar = this.C;
        ArrayList M = t0.M(context);
        ArrayList arrayList = gVar.f31880g;
        arrayList.clear();
        arrayList.addAll(M);
        gVar.notifyDataSetChanged();
        this.C.f31879f = new a();
    }

    public void setOnColorItemClickListener(g.b bVar) {
        this.B = bVar;
    }

    public void setSelectColor(int i10) {
        g gVar = this.C;
        gVar.f31878e = i10;
        gVar.notifyDataSetChanged();
    }

    public SignColorBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SignColorBottomSheetView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.BaseBottomSheetView
    public final void E() {
    }
}
