package pdf.pdfreader.viewer.editor.free.cvlib.deshadow;

import android.graphics.Bitmap;

/* compiled from: NativeLib.kt */
/* loaded from: classes3.dex */
public final class NativeLibKt {
    public static final native Bitmap getResultBitmap();

    public static final native int loadBitmap(Bitmap bitmap);

    public static final native int processDeblurWithMNN(String str);

    public static final native int processFourBlocksDeblurWithMNN(String str);

    public static final native int processImageWithMNN(String str, String str2);

    public static final native int releaseBitmap();
}
