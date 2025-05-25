package ao;

import android.view.View;
import lj.b;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class r0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5128a;

    public r0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5128a = readerPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b.a aVar = this.f5128a.N4;
        if (aVar != null) {
            aVar.call();
        }
    }
}
