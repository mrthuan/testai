package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import am.o0;
import am.p2;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.w;
import en.a;
import java.util.ArrayList;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter;
import pdf.pdfreader.viewer.editor.free.ui.adapter.u;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25149b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f25148a = i10;
        this.f25149b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i10;
        ul.c cVar;
        ho.b bVar;
        ImageAdjustFiltersAdapter imageAdjustFiltersAdapter;
        int i11 = this.f25148a;
        Integer num = null;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.f25149b;
        switch (i11) {
            case 0:
                OCRSelectPDFPageAdapter.ImageViewHolder imageViewHolder = (OCRSelectPDFPageAdapter.ImageViewHolder) obj2;
                OCRSelectPDFPageAdapter oCRSelectPDFPageAdapter = (OCRSelectPDFPageAdapter) obj;
                kotlin.jvm.internal.g.e(imageViewHolder, ea.a.p("O2hYc10w", "IGo4lFIB"));
                kotlin.jvm.internal.g.e(oCRSelectPDFPageAdapter, ea.a.p("O2hYc10x", "NkVQln64"));
                bn.a aVar = (bn.a) m.t0(imageViewHolder.getAdapterPosition(), oCRSelectPDFPageAdapter.f25117e);
                if (aVar != null) {
                    kotlin.jvm.internal.g.d(view.getContext(), ea.a.p("OWlUd1djWG4uZTJ0", "YN6gbfrt"));
                    boolean z11 = aVar.f5492f;
                    en.b bVar2 = oCRSelectPDFPageAdapter.f25116d;
                    if (z11) {
                        bVar2.getClass();
                        w<ArrayList<bn.a>> wVar = en.a.f16815a;
                        a.C0215a.d(aVar);
                        return;
                    }
                    bVar2.getClass();
                    if (en.b.d() >= 40) {
                        cg.a<tf.d> aVar2 = oCRSelectPDFPageAdapter.f25124l;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            return;
                        }
                        return;
                    }
                    w<ArrayList<bn.a>> wVar2 = en.a.f16815a;
                    ArrayList<bn.a> b10 = a.C0215a.b();
                    aVar.f5492f = true;
                    aVar.f5493g = b10.size() + 1;
                    b10.add(aVar);
                    en.a.c.j(b10);
                    return;
                }
                return;
            case 1:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj2;
                p2 p2Var = (p2) obj;
                ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("BWhQc2Iw", "iFq9FUdJ"));
                kotlin.jvm.internal.g.e(p2Var, ea.a.p("VnQ7bzhze2kmZA9uZw==", "98rTT9v2"));
                imageAdjustActivity.w2();
                ul.b i13 = imageAdjustActivity.C2().i();
                if (i13 != null && (cVar = i13.f30420r) != null && (bVar = cVar.c) != null && (imageAdjustFiltersAdapter = imageAdjustActivity.f25743b0) != null) {
                    imageAdjustActivity.r2(imageAdjustFiltersAdapter, bVar, p2Var);
                    return;
                }
                return;
            case 2:
                u.a aVar4 = (u.a) obj2;
                u uVar = (u) obj;
                int i14 = u.a.c;
                kotlin.jvm.internal.g.e(aVar4, ea.a.p("R2gic1cw", "SpDXAVvz"));
                kotlin.jvm.internal.g.e(uVar, ea.a.p("G2gfc1cx", "6Movsp7v"));
                Integer valueOf = Integer.valueOf(aVar4.getAdapterPosition());
                if (valueOf.intValue() == -1) {
                    i12 = 0;
                }
                if (i12 != 0) {
                    num = valueOf;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    uVar.f27310e.remove(intValue);
                    if (uVar.getItemCount() != 0) {
                        uVar.notifyItemRemoved(intValue);
                        uVar.notifyItemRangeChanged(intValue, uVar.getItemCount() - intValue);
                    } else {
                        uVar.notifyDataSetChanged();
                    }
                    uVar.f27309d.remove();
                    return;
                }
                return;
            case 3:
                ConfirmImageAdapter confirmImageAdapter = (ConfirmImageAdapter) obj2;
                ConfirmImageAdapter.a aVar5 = (ConfirmImageAdapter.a) obj;
                int i15 = ConfirmImageAdapter.a.f27141g;
                kotlin.jvm.internal.g.e(confirmImageAdapter, ea.a.p("R2gic1cw", "zJtsK5Bo"));
                kotlin.jvm.internal.g.e(aVar5, ea.a.p("R2gic1cx", "2ayERCsx"));
                boolean z12 = confirmImageAdapter.f27134g;
                ConfirmImageAdapter.b bVar3 = confirmImageAdapter.f27131d;
                if (z12) {
                    bVar3.b(aVar5.getBindingAdapterPosition() - 1);
                    return;
                } else {
                    bVar3.b(aVar5.getBindingAdapterPosition());
                    return;
                }
            case 4:
                DebugAppConfigFragment debugAppConfigFragment = (DebugAppConfigFragment) obj2;
                Context context = (Context) obj;
                int i16 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "mtijNE8j"));
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "gODly6dY"));
                try {
                    VB vb2 = debugAppConfigFragment.Y;
                    kotlin.jvm.internal.g.b(vb2);
                    pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfA2ktcUFlG3kJciFzR2wyXzdpXmUBdXQ=", "3n5ziyvh"), Long.parseLong(((o0) vb2).K.getText().toString())).apply();
                    Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "QJdQ7mdS"), 0).show();
                    return;
                } catch (Exception unused) {
                    androidx.appcompat.view.menu.d.h("V2UpdRRfA2ktcUFlG3kJciFzR2wyXzdpXmUBdXQ=", "3n5ziyvh", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 120L);
                    return;
                }
            case 5:
                Context context2 = (Context) obj2;
                DebugPageAndDialogFragment debugPageAndDialogFragment = (DebugPageAndDialogFragment) obj;
                int i17 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context2, ea.a.p("F2MkbgdlGnQ=", "0Udcs4cR"));
                kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("JGg9cx0w", "LoPT97jM"));
                new x(context2, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1302ad), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304da), debugPageAndDialogFragment.x(R.string.arg_res_0x7f130421)).show();
                return;
            default:
                a.C0356a c0356a = (a.C0356a) obj2;
                pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a aVar6 = (pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a) obj;
                int i18 = a.C0356a.f28346h;
                kotlin.jvm.internal.g.e(c0356a, ea.a.p("R2gic1cw", "8765IJjI"));
                kotlin.jvm.internal.g.e(aVar6, ea.a.p("O2hYc10x", "RMWey1Wf"));
                Integer valueOf2 = Integer.valueOf(c0356a.getAdapterPosition());
                int intValue2 = valueOf2.intValue();
                if (intValue2 >= 0 && intValue2 < aVar6.getItemCount()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    int intValue3 = valueOf2.intValue();
                    pdf.pdfreader.viewer.editor.free.ui.widget.adapter.a aVar7 = c0356a.f28351g;
                    PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) m.t0(intValue3, aVar7.f28342f);
                    if (pdfPreviewEntity != null) {
                        boolean a10 = kotlin.jvm.internal.g.a(aVar7.f28343g, pdfPreviewEntity);
                        ArrayList arrayList = aVar7.f28342f;
                        if (a10) {
                            aVar7.f28343g = null;
                            aVar7.notifyItemChanged(arrayList.indexOf(pdfPreviewEntity));
                        } else {
                            PdfPreviewEntity pdfPreviewEntity2 = aVar7.f28343g;
                            if (pdfPreviewEntity2 != null) {
                                kotlin.jvm.internal.g.e(arrayList, "<this>");
                                i10 = arrayList.indexOf(pdfPreviewEntity2);
                            } else {
                                i10 = -1;
                            }
                            aVar7.f28343g = pdfPreviewEntity;
                            if (i10 != -1) {
                                aVar7.notifyItemChanged(i10);
                            }
                            PdfPreviewEntity pdfPreviewEntity3 = aVar7.f28343g;
                            kotlin.jvm.internal.g.e(arrayList, "<this>");
                            aVar7.notifyItemChanged(arrayList.indexOf(pdfPreviewEntity3));
                        }
                        if (aVar7.f28343g == null) {
                            i12 = 0;
                        }
                        a.b bVar4 = aVar7.f28341e;
                        bVar4.a(i12);
                        bVar4.E0(aVar7.f28343g);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
