package org.tensorflow.lite;

/* loaded from: classes3.dex */
public final class TensorFlowLite {

    /* renamed from: a  reason: collision with root package name */
    public static final UnsatisfiedLinkError f23581a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f23582b = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_jni");
            e = null;
        } catch (UnsatisfiedLinkError e10) {
            e = e10;
        }
        f23581a = e;
    }

    public static void a() {
        if (f23582b) {
            return;
        }
        try {
            nativeRuntimeVersion();
            f23582b = true;
        } catch (UnsatisfiedLinkError e10) {
            e = e10;
            UnsatisfiedLinkError unsatisfiedLinkError = f23581a;
            if (unsatisfiedLinkError != null) {
                e = unsatisfiedLinkError;
            }
            throw new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + e);
        }
    }

    public static native String nativeRuntimeVersion();

    public static native String nativeSchemaVersion();
}
