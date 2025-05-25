package com.google.firebase.crashlytics.ndk;

/* loaded from: classes2.dex */
public class CrashpadMain {
    public static native void crashpadMain(String[] strArr);

    public static void main(String[] strArr) {
        try {
            String str = strArr[1];
            System.load(str + "libcrashlytics-handler.so");
            crashpadMain(strArr);
        } catch (UnsatisfiedLinkError e10) {
            throw new RuntimeException(e10);
        }
    }
}
