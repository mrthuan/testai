package pdf.pdfreader.viewer.editor.free.decrypt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24258a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderEncryptionAndDecryptionHelper f24259b;

    public /* synthetic */ g(ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper, int i10) {
        this.f24258a = i10;
        this.f24259b = readerEncryptionAndDecryptionHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24258a) {
            case 0:
                this.f24259b.f24242i = false;
                return;
            default:
                this.f24259b.g();
                return;
        }
    }
}
