package qb;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.inmobi.media.C1866x7;
import com.inmobi.media.W6;
import en.a;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.Pdf2ImagePicPreviewAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ChooseCropTypeDialog;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.ConfirmImageAdapter;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter;
import pdf.pdfreader.viewer.editor.free.ui.dialog.c3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.m;
import pdf.pdfreader.viewer.editor.free.ui.dialog.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29233a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29234b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1(int i10, Object obj, Object obj2) {
        this.f29233a = i10;
        this.f29234b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        n.a aVar;
        int i11 = this.f29233a;
        boolean z10 = true;
        Object obj = this.c;
        Object obj2 = this.f29234b;
        switch (i11) {
            case 0:
                C1866x7.a((C1866x7) obj2, (W6) obj, view);
                return;
            case 1:
                Pdf2ImagePicPreviewAdapter.ImageViewHolder imageViewHolder = (Pdf2ImagePicPreviewAdapter.ImageViewHolder) obj2;
                Pdf2ImagePicPreviewAdapter pdf2ImagePicPreviewAdapter = (Pdf2ImagePicPreviewAdapter) obj;
                int i12 = Pdf2ImagePicPreviewAdapter.ImageViewHolder.f25440n;
                kotlin.jvm.internal.g.e(imageViewHolder, ea.a.p("R2gic1cw", "UE53mUi8"));
                kotlin.jvm.internal.g.e(pdf2ImagePicPreviewAdapter, ea.a.p("O2gDc0Yx", "ZlOjbgX7"));
                bn.a aVar2 = (bn.a) kotlin.collections.m.t0(imageViewHolder.getAdapterPosition(), pdf2ImagePicPreviewAdapter.f25429e);
                if (aVar2 != null) {
                    kotlin.jvm.internal.g.d(view.getContext(), ea.a.p("RWkud11jDW4GZUx0", "N090BONI"));
                    boolean z11 = aVar2.f5492f;
                    en.b bVar = pdf2ImagePicPreviewAdapter.f25428d;
                    if (z11) {
                        bVar.getClass();
                        androidx.lifecycle.w<ArrayList<bn.a>> wVar = en.a.f16815a;
                        a.C0215a.d(aVar2);
                        return;
                    }
                    if (pdf2ImagePicPreviewAdapter.f25432h) {
                        bVar.getClass();
                        if (en.b.d() >= 24) {
                            cg.a<tf.d> aVar3 = pdf2ImagePicPreviewAdapter.f25437m;
                            if (aVar3 != null) {
                                aVar3.invoke();
                                return;
                            }
                            return;
                        }
                    }
                    bVar.getClass();
                    androidx.lifecycle.w<ArrayList<bn.a>> wVar2 = en.a.f16815a;
                    ArrayList<bn.a> b10 = a.C0215a.b();
                    aVar2.f5492f = true;
                    aVar2.f5493g = b10.size() + 1;
                    b10.add(aVar2);
                    en.a.c.j(b10);
                    return;
                }
                return;
            case 2:
                ChooseCropTypeDialog chooseCropTypeDialog = (ChooseCropTypeDialog) obj2;
                ImageView imageView = (ImageView) obj;
                int i13 = ChooseCropTypeDialog.E;
                kotlin.jvm.internal.g.e(chooseCropTypeDialog, ea.a.p("MmgAc2gw", "91FiLG6i"));
                boolean z12 = !chooseCropTypeDialog.C;
                chooseCropTypeDialog.C = z12;
                if (z12) {
                    imageView.setImageResource(R.drawable.ic_scan_ask_checkbox_checked);
                    return;
                } else {
                    imageView.setImageResource(R.drawable.ic_scan_ask_checkbox);
                    return;
                }
            case 3:
                ConfirmImageAdapter.a aVar4 = (ConfirmImageAdapter.a) obj2;
                ConfirmImageAdapter confirmImageAdapter = (ConfirmImageAdapter) obj;
                int i14 = ConfirmImageAdapter.a.f27141g;
                kotlin.jvm.internal.g.e(aVar4, ea.a.p("R2gic1cw", "sVvw0h9y"));
                kotlin.jvm.internal.g.e(confirmImageAdapter, ea.a.p("R2gic1cx", "7PJyM0vd"));
                int bindingAdapterPosition = aVar4.getBindingAdapterPosition();
                ArrayList<ul.b> arrayList = confirmImageAdapter.f27132e;
                if ((bindingAdapterPosition < 0 || bindingAdapterPosition >= arrayList.size() - 1) ? false : false) {
                    ul.b remove = arrayList.remove(bindingAdapterPosition);
                    kotlin.jvm.internal.g.d(remove, ea.a.p("UHQWbQIuGWUlbxBldXR_cFdzKQ==", "DY9sqkEE"));
                    ul.b bVar2 = remove;
                    ImageConvertDataRepository.f26536a.getClass();
                    int i15 = bVar2.f30408f;
                    bVar2.b(false);
                    androidx.lifecycle.w<ArrayList<ul.b>> wVar3 = ImageConvertDataRepository.f26549o;
                    ArrayList<ul.b> d10 = wVar3.d();
                    if (d10 == null) {
                        d10 = new ArrayList<>();
                    }
                    d10.remove(bVar2);
                    for (ul.b bVar3 : d10) {
                        if (bVar3.f30407e && i15 != -1 && (i10 = bVar3.f30408f) > i15) {
                            bVar3.c(i10 - 1);
                        }
                    }
                    wVar3.j(d10);
                    confirmImageAdapter.notifyItemRemoved(bindingAdapterPosition);
                    confirmImageAdapter.notifyItemRangeChanged(bindingAdapterPosition, confirmImageAdapter.getItemCount() - bindingAdapterPosition, ge.a.j(""));
                    confirmImageAdapter.f27131d.U();
                    return;
                }
                return;
            case 4:
                SelectGalleryAdapter selectGalleryAdapter = (SelectGalleryAdapter) obj2;
                SelectGalleryAdapter.b bVar4 = (SelectGalleryAdapter.b) obj;
                int i16 = SelectGalleryAdapter.b.f27177f;
                kotlin.jvm.internal.g.e(selectGalleryAdapter, ea.a.p("OmgOc0ww", "1nNgh67e"));
                kotlin.jvm.internal.g.e(bVar4, ea.a.p("R2gic1cx", "2HvRl51F"));
                ul.b bVar5 = (ul.b) kotlin.collections.m.t0(bVar4.getAdapterPosition(), selectGalleryAdapter.f27173i);
                if (bVar5 != null) {
                    selectGalleryAdapter.f27168d.b(bVar5, bVar4.getAdapterPosition());
                    return;
                }
                return;
            case 5:
                pdf.pdfreader.viewer.editor.free.ui.dialog.m mVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.m) obj2;
                m.a aVar5 = (m.a) obj;
                int i17 = m.a.f27657f;
                kotlin.jvm.internal.g.e(mVar, ea.a.p("O2hYc10w", "QxYO8BFu"));
                kotlin.jvm.internal.g.e(aVar5, ea.a.p("I2gmcxIx", "XnWO6iwH"));
                ul.a aVar6 = (ul.a) kotlin.collections.m.t0(aVar5.getAdapterPosition(), mVar.f27655e);
                if (aVar6 != null && (aVar = mVar.f27656f) != null) {
                    aVar.a(aVar6);
                    return;
                }
                return;
            case 6:
                c3.a aVar7 = (c3.a) obj2;
                aVar7.getClass();
                int adapterPosition = ((c3.c) obj).getAdapterPosition();
                int i18 = aVar7.f27516e;
                if (i18 != adapterPosition) {
                    aVar7.notifyItemChanged(i18);
                    aVar7.notifyItemChanged(adapterPosition);
                    aVar7.f27516e = adapterPosition;
                    return;
                }
                return;
            case 7:
                pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n nVar = (pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n) obj2;
                Context context = (Context) obj;
                int i19 = pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n.f27916d0;
                kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "LgWkXQE8"));
                kotlin.jvm.internal.g.e(context, ea.a.p("HWMKbgdlFXQ=", "nC9esm3i"));
                try {
                    VB vb2 = nVar.Y;
                    kotlin.jvm.internal.g.b(vb2);
                    pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfEWMTbmtiCG44ZTZfQGUgciZzJl86bkBlBXZSbBQxRzk=", "NS4w24vm"), Long.parseLong(((am.n0) vb2).R.getText().toString())).apply();
                    Toast.makeText(context, ea.a.p("k7_m5uy5j4jY5eyf", "t2wHxi7w"), 0).show();
                    return;
                } catch (Exception unused) {
                    androidx.appcompat.view.menu.d.h("V2UpdRRfEWMTbmtiCG44ZTZfQGUgciZzJl86bkBlBXZSbBQxRzk=", "NS4w24vm", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60000L);
                    return;
                }
            default:
                Context context2 = (Context) obj2;
                pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e1 e1Var = (pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e1) obj;
                int i20 = pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e1.f27886d0;
                kotlin.jvm.internal.g.e(context2, ea.a.p("F2MkbgdlGnQ=", "wk8KUPY5"));
                kotlin.jvm.internal.g.e(e1Var, ea.a.p("PGgPcxIw", "6oHf648f"));
                pdf.pdfreader.viewer.editor.free.utils.j1.e(context2, e1Var.v().getString(R.string.arg_res_0x7f1301ac), true, null, -1);
                return;
        }
    }
}
