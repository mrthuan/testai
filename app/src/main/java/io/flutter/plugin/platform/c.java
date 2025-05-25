package io.flutter.plugin.platform;

import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import java.util.Arrays;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderEncryptionAndDecryptionHelper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18803a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f18804b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, int i10, int i11) {
        this.f18803a = i11;
        this.c = obj;
        this.f18804b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f18803a;
        int i11 = this.f18804b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                int i12 = i11 & 4;
                b bVar = ((d) obj).f18806b;
                if (i12 == 0) {
                    PlatformChannel platformChannel = bVar.f18798b;
                    platformChannel.getClass();
                    platformChannel.f18661a.a(Arrays.asList(Boolean.TRUE), "SystemChrome.systemUIChange");
                    return;
                }
                PlatformChannel platformChannel2 = bVar.f18798b;
                platformChannel2.getClass();
                platformChannel2.f18661a.a(Arrays.asList(Boolean.FALSE), "SystemChrome.systemUIChange");
                return;
            default:
                ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper = (ReaderEncryptionAndDecryptionHelper) obj;
                readerEncryptionAndDecryptionHelper.getClass();
                readerEncryptionAndDecryptionHelper.w0(new Throwable(ea.a.p("CnJDbwsg", "YWkX8XzY") + i11));
                return;
        }
    }
}
