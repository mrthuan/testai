package industries.deepthought.decode;

import android.content.res.AssetManager;

/* loaded from: classes.dex */
public class Decoder {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18572a;

    static {
        try {
            System.loadLibrary("dtcore");
            f18572a = true;
        } catch (Throwable th2) {
            f18572a = false;
            th2.printStackTrace();
        }
    }

    public static native String dcs(String str);

    public static native void decodeAudioNative(byte[] bArr, int i10, int i11, long j10);

    public static native byte[] decodeBytesNative(String str, String str2);

    public static native void decodeNative(byte[] bArr, int i10, int i11, long j10);

    public static native String decodeStringNative(String str);

    public static native String decodeStringServer(String str);

    public static native byte[] decodeZipNative(byte[] bArr);

    public static native String getAllJsonNative(AssetManager assetManager, String str);

    public static native int openAt(String str);

    public static native String readFileNative(String str);

    public static native String stringTwistNative(String str, char[] cArr);
}
