package pdf.pdfreader.viewer.editor.free.cvlib;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import ea.a;

/* compiled from: DocFilter.kt */
/* loaded from: classes3.dex */
public final class DocFilter {
    static {
        new DocFilter();
        new HandlerThread(a.p("YWUlZBZyNmgAZVVk", "CQaKsxmI"));
        System.loadLibrary(a.p("DnYiaWI=", "gqmNqsZJ"));
    }

    public final native void nativeDestroy();

    public final native void nativeDocEffectProcess();

    public final native void nativeDraw();

    public final native Bitmap nativeGetDocProcessResult();

    public final native Bitmap nativeGetImageProcessResult();

    public final native void nativeImageEffectProcess();

    public final native void nativeInitRenderPipeline(Bitmap bitmap);

    public final native void nativeInitRenderView();

    public final native void nativeRenderViewSizeChanged(int i10, int i11);
}
