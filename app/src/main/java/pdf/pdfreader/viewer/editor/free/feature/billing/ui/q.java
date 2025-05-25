package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.content.Context;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.t;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24946a;

    public /* synthetic */ q(int i10) {
        this.f24946a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24946a) {
            case 0:
                String str = SubscriptionRetainFragment.f24912f0;
                return;
            case 1:
                int i10 = Pdf2ImagePicPreviewActivity.I0;
                return;
            case 2:
                ReaderImg2PDFChooseActivity.a aVar = ReaderImg2PDFChooseActivity.M0;
                return;
            case 3:
                ReaderImg2PDFConvertActivity.a aVar2 = ReaderImg2PDFConvertActivity.f27381i0;
                return;
            case 4:
                int i11 = DebugPageAndDialogFragment.f27860g0;
                Context context = view.getContext();
                pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a aVar3 = new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a(context, a0.a.i("RS4obx10B3h0", "T2MJyv95", context, "Nw==", "QIxaftii"), ea.a.p("HTZ0Lgg5", "3R9M1nqP"), 69990000L);
                aVar3.f23542t = new r0();
                aVar3.show();
                return;
            default:
                int i12 = DebugPageAndDialogFragment.f27860g0;
                new t(view.getContext()).show();
                return;
        }
    }
}
