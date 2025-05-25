package pdf.pdfreader.viewer.editor.free.ui.act;

import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderHomeActivity.java */
/* loaded from: classes3.dex */
public final class a0 extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f26886o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f26887p;

    public a0(ReaderHomeActivity readerHomeActivity, boolean z10) {
        this.f26887p = readerHomeActivity;
        this.f26886o = z10;
    }

    @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
    public final void b(List<PdfPreviewEntity> list) {
        ReaderHomeActivity readerHomeActivity = this.f26887p;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerHomeActivity)) {
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(readerHomeActivity)) {
                FileRepository.C(readerHomeActivity, new d0(readerHomeActivity));
                return;
            }
            return;
        }
        if (list != null) {
            ArrayList<PdfPreviewEntity> arrayList = readerHomeActivity.V;
            arrayList.clear();
            arrayList.addAll(list);
        }
        if (this.f26886o) {
            readerHomeActivity.f26698w1 = FileRepository.f24171r;
        }
        if (readerHomeActivity.N.hasMessages(2)) {
            readerHomeActivity.N.removeMessages(2);
        }
        readerHomeActivity.N.sendEmptyMessage(2);
    }
}
