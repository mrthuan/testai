package pdf.pdfreader.viewer.editor.free.ui.adapter;

import am.o0;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.data.ImageChooseWorkFlow;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter;
import pdf.pdfreader.viewer.editor.free.ui.adapter.u;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27255a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f27256b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f27255a = i10;
        this.f27256b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.f27255a;
        Integer num = null;
        boolean z10 = false;
        int i12 = -1;
        boolean z11 = true;
        Object obj = this.c;
        Object obj2 = this.f27256b;
        switch (i11) {
            case 0:
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj;
                kotlin.jvm.internal.g.e((MergePdfAdapter) obj2, ea.a.p("Fmg7c30w", "HrbRYFZP"));
                kotlin.jvm.internal.g.e(pdfPreviewEntity, ea.a.p("SGUMdFB0eQ==", "ORlb9pB2"));
                pdfPreviewEntity.getName();
                String str = n0.f28727a;
                return;
            case 1:
                u.a aVar = (u.a) obj2;
                u uVar = (u) obj;
                int i13 = u.a.c;
                kotlin.jvm.internal.g.e(aVar, ea.a.p("O2hYc10w", "63uMRvmP"));
                kotlin.jvm.internal.g.e(uVar, ea.a.p("O2hYc10x", "k8vdMDe2"));
                int itemViewType = aVar.getItemViewType();
                v vVar = uVar.f27309d;
                if (itemViewType == 1) {
                    Integer valueOf = Integer.valueOf(aVar.getAdapterPosition());
                    if (valueOf.intValue() != -1) {
                        z10 = true;
                    }
                    if (z10) {
                        num = valueOf;
                    }
                    if (num != null) {
                        vVar.b((String) uVar.f27310e.get(num.intValue()));
                        return;
                    }
                    return;
                } else if (aVar.getItemViewType() == 2) {
                    vVar.a();
                    return;
                } else {
                    return;
                }
            case 2:
                GalleryAdapter.ImageViewHolder imageViewHolder = (GalleryAdapter.ImageViewHolder) obj2;
                GalleryAdapter galleryAdapter = (GalleryAdapter) obj;
                int i14 = GalleryAdapter.ImageViewHolder.f27157m;
                kotlin.jvm.internal.g.e(imageViewHolder, ea.a.p("AGgwc28w", "IktYK7Ut"));
                kotlin.jvm.internal.g.e(galleryAdapter, ea.a.p("O2hYc10x", "ZfrZ3Ehk"));
                int adapterPosition = imageViewHolder.getAdapterPosition();
                ArrayList<ul.b> arrayList = galleryAdapter.f27149f;
                ul.b bVar = (ul.b) kotlin.collections.m.t0(adapterPosition, arrayList);
                if (bVar != null) {
                    Context context = view.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("FWk8d3xjGW48ZR50", "7OcYRv8e"));
                    boolean z12 = bVar.f30407e;
                    tf.c cVar = galleryAdapter.f27151h;
                    uo.a aVar2 = galleryAdapter.f27147d;
                    if (z12) {
                        aVar2.getClass();
                        ImageConvertDataRepository imageConvertDataRepository = ImageConvertDataRepository.f26536a;
                        imageConvertDataRepository.getClass();
                        ImageConvertDataRepository.l(bVar);
                        imageConvertDataRepository.getClass();
                        ArrayList arrayList2 = (ArrayList) ImageConvertDataRepository.f26546l.d();
                        if ((arrayList2 == null || arrayList2.size() != 0) ? false : false) {
                            galleryAdapter.notifyItemChanged(adapterPosition, (ArrayList) cVar.getValue());
                            return;
                        } else {
                            galleryAdapter.notifyItemRangeChanged(0, galleryAdapter.getItemCount(), (ArrayList) cVar.getValue());
                            return;
                        }
                    } else if (!bVar.a()) {
                        ImageChooseWorkFlow imageChooseWorkFlow = galleryAdapter.f27152i;
                        if (imageChooseWorkFlow == ImageChooseWorkFlow.SingleChoose) {
                            ArrayList arrayList3 = new ArrayList();
                            ImageConvertDataRepository.f26536a.getClass();
                            ArrayList arrayList4 = (ArrayList) ImageConvertDataRepository.f26546l.d();
                            if (arrayList4 != null) {
                                arrayList3.addAll(arrayList4);
                            }
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                int indexOf = arrayList.indexOf((ul.b) it.next());
                                if (indexOf >= 0) {
                                    galleryAdapter.notifyItemChanged(indexOf, (ArrayList) cVar.getValue());
                                }
                            }
                            aVar2.getClass();
                            ImageConvertDataRepository.f26536a.getClass();
                            androidx.lifecycle.w<ArrayList<ul.b>> wVar = ImageConvertDataRepository.f26545k;
                            ArrayList<ul.b> d10 = wVar.d();
                            if (d10 != null) {
                                for (ul.b bVar2 : d10) {
                                    bVar2.b(false);
                                }
                            }
                            ArrayList<ul.b> h10 = ImageConvertDataRepository.h();
                            h10.clear();
                            bVar.b(true);
                            bVar.c(1);
                            h10.add(bVar);
                            wVar.j(h10);
                            galleryAdapter.notifyItemChanged(adapterPosition, (ArrayList) cVar.getValue());
                            return;
                        }
                        if ((imageChooseWorkFlow == ImageChooseWorkFlow.OCR || imageChooseWorkFlow == ImageChooseWorkFlow.PageManger) && (i10 = galleryAdapter.f27155l) > 0) {
                            ImageConvertDataRepository.f26536a.getClass();
                            if (ImageConvertDataRepository.e(i10)) {
                                cg.a<tf.d> aVar3 = galleryAdapter.f27154k;
                                if (aVar3 != null) {
                                    aVar3.invoke();
                                    return;
                                }
                                return;
                            }
                        }
                        aVar2.getClass();
                        ImageConvertDataRepository.f26536a.getClass();
                        ImageConvertDataRepository.i(bVar);
                        galleryAdapter.notifyItemChanged(adapterPosition, (ArrayList) cVar.getValue());
                        return;
                    } else {
                        j1.h(context.getResources().getString(R.string.arg_res_0x7f1304d0), context, true, R.drawable.ic_fail_warning);
                        return;
                    }
                }
                return;
            case 3:
                DebugAppConfigFragment debugAppConfigFragment = (DebugAppConfigFragment) obj2;
                Context context2 = (Context) obj;
                int i15 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "kjbWMLTY"));
                kotlin.jvm.internal.g.e(context2, ea.a.p("SWMNbhFlHnQ=", "x9mbefZY"));
                try {
                    VB vb2 = debugAppConfigFragment.Y;
                    kotlin.jvm.internal.g.b(vb2);
                    int parseInt = Integer.parseInt(((o0) vb2).f1255z0.getText().toString());
                    Toast.makeText(context2, ea.a.p("q7-f5u250YjK5cCf", "WbMvNJWB"), 0).show();
                    i12 = parseInt;
                } catch (Exception unused) {
                    Toast.makeText(context2, ea.a.p("qoa05de50r_f6eu7kbjS5qCwi63S79mMir3H5fyNrLf95I6un5SO5OK6ZzE=", "6cLAoTuI"), 0).show();
                }
                pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("V2UpdRRTCWkCSVpxHGkkeRRhVWUTcyZyO3kbZSJvAWZaZw==", "okaoPSxE"), i12).apply();
                return;
            default:
                Context context3 = (Context) obj2;
                e1 e1Var = (e1) obj;
                int i16 = e1.f27886d0;
                kotlin.jvm.internal.g.e(context3, ea.a.p("VWMhbhhlMHQ=", "EqqNlHWW"));
                kotlin.jvm.internal.g.e(e1Var, ea.a.p("O2hYc10w", "ysyLjEl1"));
                j1.e(context3, e1Var.v().getString(R.string.arg_res_0x7f130323), true, null, -1);
                return;
        }
    }
}
