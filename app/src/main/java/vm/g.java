package vm;

import am.n0;
import am.o0;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import cg.l;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter;
import pdf.pdfreader.viewer.editor.free.ui.adapter.t;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e1;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import vm.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30860a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f30861b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f30860a = i10;
        this.f30861b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f30860a;
        Object obj = this.c;
        Object obj2 = this.f30861b;
        switch (i10) {
            case 0:
                i.a aVar = (i.a) obj2;
                i iVar = (i) obj;
                kotlin.jvm.internal.g.e(aVar, ea.a.p("R2gic1cw", "eBCSnaa0"));
                kotlin.jvm.internal.g.e(iVar, ea.a.p("R2gic1cx", "0DJPjnrk"));
                int bindingAdapterPosition = aVar.getBindingAdapterPosition();
                bn.a aVar2 = (bn.a) m.t0(bindingAdapterPosition, iVar.f30865e);
                if (aVar2 != null) {
                    kotlin.jvm.internal.g.d(view.getContext(), ea.a.p("RWkud11jDW4GZUx0", "2Q5t4ICH"));
                    boolean z10 = iVar.f30876p;
                    an.b bVar = iVar.f30864d;
                    if (z10) {
                        if (aVar2.f5492f) {
                            bVar.g(aVar2);
                            return;
                        } else {
                            bVar.d(aVar2);
                            return;
                        }
                    } else if (!aVar2.f5492f) {
                        bVar.f();
                        bVar.d(aVar2);
                        return;
                    } else {
                        l<? super Integer, tf.d> lVar = iVar.f30871k;
                        if (lVar != null) {
                            lVar.invoke(Integer.valueOf(bindingAdapterPosition));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                t tVar = (t) obj2;
                String str = (String) obj;
                kotlin.jvm.internal.g.e(tVar, ea.a.p("O2hYc10w", "IEAcZzcZ"));
                kotlin.jvm.internal.g.e(str, ea.a.p("T3QvdFpl", "7gkF6Vtd"));
                l<String, tf.d> lVar2 = tVar.f27306e;
                if (lVar2 != null) {
                    lVar2.invoke(str);
                    return;
                }
                return;
            case 2:
                SelectGalleryAdapter.b bVar2 = (SelectGalleryAdapter.b) obj2;
                SelectGalleryAdapter selectGalleryAdapter = (SelectGalleryAdapter) obj;
                int i11 = SelectGalleryAdapter.b.f27177f;
                kotlin.jvm.internal.g.e(bVar2, ea.a.p("QGhec2Uw", "zh47Aw1U"));
                kotlin.jvm.internal.g.e(selectGalleryAdapter, ea.a.p("R2gic1cx", "iaPzlvwe"));
                int adapterPosition = bVar2.getAdapterPosition();
                ul.b bVar3 = (ul.b) m.t0(adapterPosition, selectGalleryAdapter.f27173i);
                if (bVar3 != null) {
                    selectGalleryAdapter.f27168d.a(bVar3, adapterPosition);
                    return;
                }
                return;
            case 3:
                n nVar = (n) obj2;
                Context context = (Context) obj;
                int i12 = n.f27916d0;
                kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "FQVjgYcA"));
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "8vTpJgCr"));
                try {
                    VB vb2 = nVar.Y;
                    kotlin.jvm.internal.g.b(vb2);
                    pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("EGUKdS9fVm88dAlta2I2blZlIF87ZVByEXMZXzhuNmUGdglsFzEAOQ==", "BpthH4RN"), Long.parseLong(((n0) vb2).f1153n.getText().toString())).apply();
                    Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "qaSGGIsy"), 0).show();
                    return;
                } catch (Exception unused) {
                    androidx.appcompat.view.menu.d.h("EGUKdS9fVm88dAlta2I2blZlIF87ZVByEXMZXzhuNmUGdglsFzEAOQ==", "BpthH4RN", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60000L);
                    return;
                }
            case 4:
                DebugAppConfigFragment debugAppConfigFragment = (DebugAppConfigFragment) obj2;
                Context context2 = (Context) obj;
                int i13 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "tFvVuaSf"));
                kotlin.jvm.internal.g.e(context2, ea.a.p("S2MebjJlNnQ=", "PIoqFNhD"));
                try {
                    VB vb3 = debugAppConfigFragment.Y;
                    kotlin.jvm.internal.g.b(vb3);
                    String obj3 = ((o0) vb3).N.getText().toString();
                    wm.a aVar3 = wm.a.c;
                    long parseLong = Long.parseLong(obj3);
                    aVar3.getClass();
                    wm.a.f31374f.c(wm.a.f31372d[1], Long.valueOf(parseLong));
                    Toast.makeText(context2, ea.a.p("q7-f5u250YjK5cCf", "OE4ORDpt"), 0).show();
                    return;
                } catch (Exception unused2) {
                    Toast.makeText(context2, ea.a.p("q7-f5u250qTr6P6l", "cMthGTWJ"), 0).show();
                    return;
                }
            case 5:
                DebugPageAndDialogFragment.v0((Context) obj, (DebugPageAndDialogFragment) obj2);
                return;
            default:
                Context context3 = (Context) obj2;
                e1 e1Var = (e1) obj;
                int i14 = e1.f27886d0;
                kotlin.jvm.internal.g.e(context3, ea.a.p("F2MkbgdlGnQ=", "vl10M7zM"));
                kotlin.jvm.internal.g.e(e1Var, ea.a.p("O2hYc10w", "OewmBNNb"));
                j1.a(context3, e1Var.x(R.string.arg_res_0x7f1303c0));
                return;
        }
    }
}
