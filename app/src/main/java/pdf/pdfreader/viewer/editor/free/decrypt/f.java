package pdf.pdfreader.viewer.editor.free.decrypt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24256a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderDecryptAndCopyExecutor f24257b;

    public /* synthetic */ f(ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor, int i10) {
        this.f24256a = i10;
        this.f24257b = readerDecryptAndCopyExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24256a;
        ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = this.f24257b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.g.e(readerDecryptAndCopyExecutor, ea.a.p("O2hYc10w", "xg2rY6PJ"));
                readerDecryptAndCopyExecutor.f24234i = false;
                return;
            default:
                kotlin.jvm.internal.g.e(readerDecryptAndCopyExecutor, ea.a.p("O2hYc10w", "ZMDUesVB"));
                readerDecryptAndCopyExecutor.f24228b.c(readerDecryptAndCopyExecutor.f24230e);
                return;
        }
    }
}
