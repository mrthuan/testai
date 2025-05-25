package com.bytedance.sdk.openadsdk;

/* loaded from: classes.dex */
public class TTImage {
    private double CJ;
    private final int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final String f8513ac;
    private final int cJ;

    public TTImage(int i10, int i11, String str, double d10) {
        this.Qhi = i10;
        this.cJ = i11;
        this.f8513ac = str;
        this.CJ = d10;
    }

    public double getDuration() {
        return this.CJ;
    }

    public int getHeight() {
        return this.Qhi;
    }

    public String getImageUrl() {
        return this.f8513ac;
    }

    public int getWidth() {
        return this.cJ;
    }

    public boolean isValid() {
        String str;
        if (this.Qhi > 0 && this.cJ > 0 && (str = this.f8513ac) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }
}
