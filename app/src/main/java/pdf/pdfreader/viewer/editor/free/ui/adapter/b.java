package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27119a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f27120b;
    public final /* synthetic */ RecyclerView.Adapter c;

    public /* synthetic */ b(int i10, c cVar) {
        this.c = cVar;
        this.f27120b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f27119a;
        int i11 = this.f27120b;
        RecyclerView.Adapter adapter = this.c;
        switch (i10) {
            case 0:
                c cVar = (c) adapter;
                kotlin.jvm.internal.g.e(cVar, ea.a.p("FmgMcx0w", "Pybe9HdI"));
                cVar.f27127e.Z(i11);
                return;
            default:
                t tVar = (t) adapter;
                kotlin.jvm.internal.g.e(tVar, ea.a.p("O2hYc10w", "QCFftMwZ"));
                ArrayList<String> arrayList = tVar.f27305d;
                int size = arrayList.size();
                t1.b("position:" + i11 + ",size:" + size);
                if (i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                cg.l<Boolean, tf.d> lVar = tVar.f27307f;
                if (lVar != null) {
                    if (arrayList.size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lVar.invoke(Boolean.valueOf(z10));
                }
                tVar.notifyDataSetChanged();
                return;
        }
    }

    public /* synthetic */ b(int i10, t tVar) {
        this.f27120b = i10;
        this.c = tVar;
    }
}
