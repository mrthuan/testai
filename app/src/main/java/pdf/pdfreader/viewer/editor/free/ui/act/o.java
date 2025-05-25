package pdf.pdfreader.viewer.editor.free.ui.act;

import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26962a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f26963b;

    public /* synthetic */ o(ReaderHomeActivity readerHomeActivity, int i10) {
        this.f26962a = i10;
        this.f26963b = readerHomeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26962a;
        ReaderHomeActivity readerHomeActivity = this.f26963b;
        switch (i10) {
            case 0:
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.getClass();
                j1.e(ReaderPdfApplication.m(), readerHomeActivity.getString(R.string.arg_res_0x7f130172), true, null, -1);
                return;
            default:
                String str2 = ReaderHomeActivity.Y1;
                readerHomeActivity.W2();
                readerHomeActivity.R1 = -1;
                return;
        }
    }
}
