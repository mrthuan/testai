package pdf.pdfreader.viewer.editor.free.cvlib.deshadow;

import android.graphics.Bitmap;
import ea.a;

/* loaded from: classes3.dex */
public class MNNDeShadowNativeHelper {
    static {
        System.loadLibrary(a.p("LHZdaWI=", "GKspnKAj"));
    }

    public static native long createImageLoader();

    public static native Bitmap getResultBitmap(long j10);

    public static native int loadBitmap(long j10, Bitmap bitmap);

    public static native int processImageWithMNN(long j10, String str, String str2);

    public static native int processThumbnailWithMNN(long j10, String str, String str2);

    public static native int releaseBitmap(long j10);
}
