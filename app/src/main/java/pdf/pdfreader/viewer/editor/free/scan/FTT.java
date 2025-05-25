package pdf.pdfreader.viewer.editor.free.scan;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import ea.a;

/* loaded from: classes3.dex */
public class FTT {
    static {
        try {
            System.loadLibrary(a.p("KXR0", "BDwoQDWY"));
        } catch (Throwable unused) {
        }
    }

    public static native int checkColorful(Context context, Bitmap bitmap);

    private native String decode(Context context, String str);

    private native String encode(Context context, String str);

    public static boolean filterBitmap(Context context, Bitmap bitmap, int i10) {
        try {
            if (filterDocument(context, bitmap, i10) != 1) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static native int filterDocument(Context context, Bitmap bitmap, int i10);

    public static String getSinger(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr.length > 0) {
                return signatureArr[0].toCharsString();
            }
            return "";
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static native void init(String str);

    public static native int isGoodPolygon(int[] iArr);

    public static native int isValidPolygon(int[] iArr, int i10, int i11);

    public String decodeData(Context context, String str) {
        return decode(context, str);
    }

    public String encodeData(Context context, String str) {
        return encode(context, str);
    }
}
