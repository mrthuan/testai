package ao;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignAction;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignActionInfo;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import yo.c;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class z extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5153b;

    public z(ReaderPreviewActivity readerPreviewActivity) {
        this.f5153b = readerPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5153b;
        readerPreviewActivity.v3();
        SignActionInfo signActionInfo = new SignActionInfo(readerPreviewActivity.q5);
        signActionInfo.setAction(SignAction.Add);
        SignActionInfo signActionInfo2 = new SignActionInfo(readerPreviewActivity.q5);
        signActionInfo2.setAction(SignAction.Remove);
        c.a.f32211a.a(signActionInfo, signActionInfo2);
        readerPreviewActivity.q5 = new SignActionInfo(signActionInfo2);
        SignPathActionInfo signPathActionInfo = signActionInfo2.getSignPathActionInfo();
        kj.b stampAnnotData = signActionInfo2.getStampAnnotData();
        if (signPathActionInfo != null && stampAnnotData != null) {
            readerPreviewActivity.f26259t5.remove(Long.valueOf(stampAnnotData.f19799a));
            readerPreviewActivity.f26266u5.remove(Long.valueOf(stampAnnotData.f19799a));
        }
        readerPreviewActivity.U3();
        readerPreviewActivity.a4(readerPreviewActivity.f26215l5);
    }
}
