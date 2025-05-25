package pdf.pdfreader.viewer.editor.free.pdfview;

import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import gn.b;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.single_choose.SingleImageChooseActivity;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class l implements ViewStub.OnInflateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f26442a;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l lVar = l.this;
            lVar.f26442a.f26229o1 = ea.a.p("VmQidCxhBmQGZUx0", "04JPV89Q");
            if (lVar.f26442a.f26168d2.isSelected()) {
                lVar.f26442a.u2(PDFTextEditorMode.NONE);
                return;
            }
            ReaderPreviewActivity readerPreviewActivity = lVar.f26442a;
            if (readerPreviewActivity.f26277w2) {
                readerPreviewActivity.L4();
            } else {
                readerPreviewActivity.u2(PDFTextEditorMode.TEXT_AND_IMG);
            }
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l lVar = l.this;
            lVar.f26442a.f26223n1 = ea.a.p("VmQidCxhBmQGZUx0", "TRGXSwIj");
            lVar.f26442a.Z4(ea.a.p("VmQidCxwBmYtYVBkHWUudBtjXmklaw==", "b5I4pNVw"));
            if (lVar.f26442a.f26173e2.isSelected()) {
                lVar.f26442a.u2(PDFTextEditorMode.NONE);
                return;
            }
            ReaderPreviewActivity readerPreviewActivity = lVar.f26442a;
            if (readerPreviewActivity.f26277w2) {
                readerPreviewActivity.L4();
            } else {
                readerPreviewActivity.u2(PDFTextEditorMode.ADD_TEXT);
            }
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class c extends l0 {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            l lVar = l.this;
            ReaderPreviewActivity readerPreviewActivity = lVar.f26442a;
            if (readerPreviewActivity.f26277w2) {
                readerPreviewActivity.L4();
                return;
            }
            readerPreviewActivity.u2(PDFTextEditorMode.TEXT_AND_IMG);
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.f();
            String p10 = ea.a.p("ImQCdCdwB2YXYQJkXW0wX1tsO2Nr", "hoGkxcVH");
            ReaderPreviewActivity readerPreviewActivity2 = lVar.f26442a;
            readerPreviewActivity2.Z4(p10);
            b.a aVar = gn.b.f17937a;
            String p11 = ea.a.p("Jm1WXxhkZA==", "MlkxYvLP");
            aVar.getClass();
            gn.b.c.add(p11);
            SingleImageChooseActivity.a aVar2 = SingleImageChooseActivity.f26980o1;
            String p12 = ea.a.p("Q2QtRRdpFkkcc1FydA==", "yaRCEFkf");
            String p13 = ea.a.p("Wm44ZQF0", "0etkL2sU");
            aVar2.getClass();
            SingleImageChooseActivity.a.a(readerPreviewActivity2, false, p12, p13, true);
        }
    }

    public l(ReaderPreviewActivity readerPreviewActivity) {
        this.f26442a = readerPreviewActivity;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        ReaderPreviewActivity readerPreviewActivity = this.f26442a;
        readerPreviewActivity.f26152a2 = view;
        readerPreviewActivity.f26168d2 = (AppCompatImageView) view.findViewById(R.id.editTextModeIv);
        readerPreviewActivity.f26173e2 = (AppCompatImageView) view.findViewById(R.id.editAddTextIv);
        readerPreviewActivity.f26178f2 = (AppCompatImageView) view.findViewById(R.id.editAddImageIv);
        AppCompatImageView appCompatImageView = readerPreviewActivity.f26168d2;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new a());
        }
        AppCompatImageView appCompatImageView2 = readerPreviewActivity.f26173e2;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new b());
        }
        AppCompatImageView appCompatImageView3 = readerPreviewActivity.f26178f2;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setOnClickListener(new c());
        }
    }
}
