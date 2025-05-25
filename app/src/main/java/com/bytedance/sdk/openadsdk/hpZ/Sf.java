package com.bytedance.sdk.openadsdk.hpZ;

/* compiled from: PlayableLog.java */
/* loaded from: classes.dex */
public class Sf {
    private static Qhi Qhi;

    /* compiled from: PlayableLog.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(String str, String str2, Throwable th2);
    }

    public static void Qhi(Qhi qhi) {
        Qhi = qhi;
    }

    public static boolean Qhi() {
        return Qhi != null;
    }

    public static void Qhi(String str, String str2, Throwable th2) {
        if (Qhi == null) {
            return;
        }
        if (th2 == null) {
            th2 = new Throwable();
        }
        Qhi.Qhi(str, str2, th2);
    }
}
