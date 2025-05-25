package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes.dex */
public class PAGImageItem {
    private float CJ;
    private final int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final String f8593ac;
    private final int cJ;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.Qhi = i10;
        this.cJ = i11;
        this.f8593ac = str;
        this.CJ = f10;
    }

    public float getDuration() {
        return this.CJ;
    }

    public int getHeight() {
        return this.Qhi;
    }

    public String getImageUrl() {
        return this.f8593ac;
    }

    public int getWidth() {
        return this.cJ;
    }

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }
}
