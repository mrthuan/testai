package com.inmobi.media;

/* renamed from: com.inmobi.media.la  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1713la {
    public static final C1699ka Companion = new C1699ka();
    public static final String DEFAULT_POSITION = "top-right";
    private static final String TAG = "la";
    private boolean allowOffscreen;
    private String customClosePosition;
    private int height;
    private int offsetX;
    private int offsetY;
    private int width;

    public C1713la(String str, boolean z10) {
        this.customClosePosition = str;
        this.allowOffscreen = z10;
    }

    public final boolean a() {
        return this.allowOffscreen;
    }

    public final String b() {
        return this.customClosePosition;
    }

    public final int c() {
        return this.height;
    }

    public final int d() {
        return this.offsetX;
    }

    public final int e() {
        return this.offsetY;
    }

    public final int f() {
        return this.width;
    }

    public final void a(boolean z10) {
        this.allowOffscreen = z10;
    }

    public final void a(String str) {
        this.customClosePosition = str;
    }
}
