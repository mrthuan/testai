package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh;

import am.n0;
import am.q0;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRBlockFlatten;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25163a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25164b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f25163a = i10;
        this.f25164b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f25163a;
        boolean z10 = true;
        Object obj = this.c;
        Object obj2 = this.f25164b;
        switch (i10) {
            case 0:
                OCRBlockFlatten oCRBlockFlatten = (OCRBlockFlatten) obj2;
                c cVar = (c) obj;
                g.e(oCRBlockFlatten, ea.a.p("a2JdbxprcWw7dD5lbg==", "G8IXDcKP"));
                g.e(cVar, ea.a.p("O2hYc10w", "fN2kMVsr"));
                oCRBlockFlatten.setSelected(!oCRBlockFlatten.isSelected());
                ((TextView) cVar.f25165b.c).setSelected(oCRBlockFlatten.isSelected());
                cVar.c.invoke();
                return;
            case 1:
                h.a aVar = (h.a) obj2;
                h hVar = (h) obj;
                int i11 = h.a.f27204g;
                g.e(aVar, ea.a.p("Emgbc2Iw", "kxfrFh7p"));
                g.e(hVar, ea.a.p("R2gic1cx", "XKSODC8Y"));
                Integer valueOf = Integer.valueOf(aVar.getAdapterPosition());
                int intValue = valueOf.intValue();
                if (intValue < 0 || intValue >= hVar.getItemCount()) {
                    z10 = false;
                }
                if (!z10) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue2 = valueOf.intValue();
                    int i12 = hVar.f27203h;
                    if (i12 == intValue2) {
                        hVar.notifyItemChanged(intValue2, ge.a.H(""));
                        return;
                    }
                    hVar.f27203h = intValue2;
                    hVar.notifyItemChanged(i12, ge.a.H(""));
                    hVar.notifyItemChanged(intValue2, ge.a.H(""));
                    return;
                }
                return;
            case 2:
                n nVar = (n) obj2;
                Context context = (Context) obj;
                int i13 = n.f27916d0;
                g.e(nVar, ea.a.p("R2gic1cw", "amNjn0YV"));
                g.e(context, ea.a.p("F2MkbgdlGnQ=", "mH5T6aVz"));
                try {
                    VB vb2 = nVar.Y;
                    g.b(vb2);
                    pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("G3AVbghhC18kbwdka2UvcFFyN2QWdF9tEV9COA==", "A7tpWo7b"), Integer.parseInt(((n0) vb2).D.getText().toString())).apply();
                    Toast.makeText(context, ea.a.p("pr_q5u250ojY5eyf", "QWBDy4v9"), 0).show();
                    return;
                } catch (Exception unused) {
                    pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("G3AVbghhC18kbwdka2UvcFFyN2QWdF9tEV9COA==", "A7tpWo7b"), 240).apply();
                    return;
                }
            default:
                DebugNotificationFragment debugNotificationFragment = (DebugNotificationFragment) obj2;
                Context context2 = (Context) obj;
                int i14 = DebugNotificationFragment.f27859d0;
                g.e(debugNotificationFragment, ea.a.p("R2gic1cw", "YEl8Gpja"));
                g.e(context2, ea.a.p("VWMGbhZlKXQ=", "xPqibQUC"));
                try {
                    VB vb3 = debugNotificationFragment.Y;
                    g.b(vb3);
                    int parseInt = Integer.parseInt(((q0) vb3).f1332g.getText().toString());
                    VB vb4 = debugNotificationFragment.Y;
                    g.b(vb4);
                    int parseInt2 = Integer.parseInt(((q0) vb4).f1333h.getText().toString());
                    SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
                    sharedPreferences.edit().putInt(ea.a.p("K2VTdR5fWW8uXzxpEHc3blB3AnkaZgxsM18gbz9pVGksYUVpFm5oaDV1cg==", "YcunVNK2"), parseInt).apply();
                    sharedPreferences.edit().putInt(ea.a.p("V2UpdRRfDG8GX0JpDHcJbiF3XnkZZipsPF8UbzhpHGlQYT9pHG49bRtuQXRl", "YzLzIalK"), parseInt2).apply();
                    Context context3 = view.getContext();
                    g.d(context3, ea.a.p("JnQfYxZuQ2UidA==", "D4pxZFWX"));
                    pp.a.c(context3);
                    Toast.makeText(context2, ea.a.p("2671586uhIji5b6f", "2Qz7aCkO"), 0).show();
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
