package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.content.Context;
import bm.c;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;

/* compiled from: PDFCreatorActivity.kt */
/* loaded from: classes3.dex */
public final class o implements sn.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFCreatorActivity f25334a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25335b;
    public final /* synthetic */ File c;

    public o(PDFCreatorActivity pDFCreatorActivity, int i10, File file) {
        this.f25334a = pDFCreatorActivity;
        this.f25335b = i10;
        this.c = file;
    }

    @Override // sn.a
    public final void a(Exception exc) {
        this.f25334a.D.sendEmptyMessage(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
        try {
            this.c.delete();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // sn.a
    public final void b(String str) {
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        if (str == null) {
            str = "";
        }
        StorageFileObserver.b(str);
    }

    @Override // sn.a
    public final void c(String str) {
        File file = new File(str);
        if (file.exists()) {
            PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
            pdfPreviewEntity.setDate(file.lastModified());
            pdfPreviewEntity.setPath(file.getAbsolutePath());
            pdfPreviewEntity.setSize(file.length());
            pdfPreviewEntity.setName(bg.b.B0(file));
            pdfPreviewEntity.setOtherStrOne(ea.a.p("GERG", "qfHOBluO"));
            pdfPreviewEntity.setPage(this.f25335b);
            PDFCreatorActivity pDFCreatorActivity = this.f25334a;
            bm.c.b(pDFCreatorActivity).f(ge.a.H(pdfPreviewEntity), new a(str, pDFCreatorActivity, pdfPreviewEntity));
        }
    }

    /* compiled from: PDFCreatorActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a implements c.InterfaceC0042c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25336a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PDFCreatorActivity f25337b;
        public final /* synthetic */ PdfPreviewEntity c;

        public a(String str, PDFCreatorActivity pDFCreatorActivity, PdfPreviewEntity pdfPreviewEntity) {
            this.f25336a = str;
            this.f25337b = pDFCreatorActivity;
            this.c = pdfPreviewEntity;
        }

        @Override // bm.c.InterfaceC0042c
        public final void b(ArrayList arrayList) {
            String str;
            PdfPreviewEntity pdfPreviewEntity = this.c;
            PDFCreatorActivity pDFCreatorActivity = this.f25337b;
            if (!arrayList.isEmpty()) {
                str = ((PdfPreviewEntity) arrayList.get(0)).getPath();
            } else {
                str = this.f25336a;
            }
            pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
            Context m10 = ReaderPdfApplication.m();
            kotlin.jvm.internal.g.d(m10, ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "P4dgmTKZ"));
            kotlin.jvm.internal.g.d(str, ea.a.p("Q2E_aDVvEERi", "0HZXwRgt"));
            StorageFileObserver.c(m10, str, true);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FileRepository.I((PdfPreviewEntity) it.next());
            }
            try {
                pdf.pdfreader.viewer.editor.free.utils.v.b();
            } finally {
                pDFCreatorActivity.D.obtainMessage(200, pdfPreviewEntity).sendToTarget();
            }
        }

        @Override // bm.c.InterfaceC0042c
        public final void a() {
        }
    }
}
