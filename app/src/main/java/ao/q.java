package ao;

import android.view.KeyEvent;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f5123b;

    public /* synthetic */ q(KeyEvent.Callback callback, int i10) {
        this.f5122a = i10;
        this.f5123b = callback;
    }

    @Override // cg.a
    public final Object invoke() {
        int i10 = this.f5122a;
        KeyEvent.Callback callback = this.f5123b;
        switch (i10) {
            case 0:
                ReaderPreviewActivity readerPreviewActivity = (ReaderPreviewActivity) callback;
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.O5 = false;
                pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new pdf.pdfreader.viewer.editor.free.pdfview.f(readerPreviewActivity));
                readerPreviewActivity.O5 = false;
                return null;
            default:
                ReaderPreviewActivity readerPreviewActivity2 = ReaderPreviewActivity.this;
                String string = readerPreviewActivity2.getString(R.string.arg_res_0x7f1301b4);
                ExecutorService executorService2 = ReaderPreviewActivity.U5;
                readerPreviewActivity2.E4(string);
                return null;
        }
    }
}
