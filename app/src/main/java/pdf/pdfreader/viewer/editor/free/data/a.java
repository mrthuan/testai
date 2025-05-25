package pdf.pdfreader.viewer.editor.free.data;

import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f24203b;

    public /* synthetic */ a(PdfPreviewEntity pdfPreviewEntity, int i10) {
        this.f24202a = i10;
        this.f24203b = pdfPreviewEntity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24202a) {
            case 0:
                PdfPreviewEntity pdfPreviewEntity = this.f24203b;
                g.e(pdfPreviewEntity, ea.a.p("b2UpdD90eQ==", "tfKGVH7d"));
                FileRepository.f24155a.getClass();
                if (t0.v0(FileRepository.r(), pdfPreviewEntity)) {
                    FileRepository.q().setValue(m.E0(FileRepository.r()));
                    synchronized (FileRepository.j()) {
                        ((List) FileRepository.F.getValue()).add(pdfPreviewEntity);
                    }
                    RecentAddRepository.s(pdfPreviewEntity);
                    FileRepository.f(pdfPreviewEntity);
                    if (!FileRepository.i().get()) {
                        FileRepository.o().execute(new a6.c(4));
                        return;
                    }
                    return;
                }
                return;
            default:
                pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
                tf.c cVar = StorageFileObserver.f25905h;
                boolean isEmpty = ((List) cVar.getValue()).isEmpty();
                PdfPreviewEntity pdfPreviewEntity2 = this.f24203b;
                if (isEmpty) {
                    g.d(pdfPreviewEntity2, ea.a.p("K2J0bg1pQ3k=", "XEmh31BA"));
                    FileRepository.c(pdfPreviewEntity2);
                } else {
                    for (zn.a aVar2 : (List) cVar.getValue()) {
                        g.d(pdfPreviewEntity2, ea.a.p("K2J0bg1pQ3k=", "KtyW4VYT"));
                        aVar2.a(pdfPreviewEntity2);
                    }
                }
                StorageFileObserver.f25903f.j(Boolean.TRUE);
                return;
        }
    }
}
