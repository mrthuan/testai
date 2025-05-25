package pdf.pdfreader.viewer.editor.free.ui.widget.act;

/* compiled from: ReaderEditSearchActivity.java */
/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderEditSearchActivity f28332a;

    public g(ReaderEditSearchActivity readerEditSearchActivity) {
        this.f28332a = readerEditSearchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = ReaderEditChooserActivity.B;
        ReaderEditSearchActivity readerEditSearchActivity = this.f28332a;
        readerEditSearchActivity.setResult(100);
        readerEditSearchActivity.finish();
    }
}
