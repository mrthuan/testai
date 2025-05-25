package com.bytedance.adsdk.lottie.ac;

/* compiled from: Marker.java */
/* loaded from: classes.dex */
public class ROR {
    public final float Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final String f7782ac;
    public final float cJ;

    public ROR(String str, float f10, float f11) {
        this.f7782ac = str;
        this.cJ = f11;
        this.Qhi = f10;
    }

    public boolean Qhi(String str) {
        if (this.f7782ac.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f7782ac.endsWith("\r")) {
            String str2 = this.f7782ac;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
