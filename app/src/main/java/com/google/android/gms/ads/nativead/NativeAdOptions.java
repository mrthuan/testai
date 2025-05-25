package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class NativeAdOptions {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10599a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10600b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10601d;

    /* renamed from: e  reason: collision with root package name */
    public final VideoOptions f10602e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10603f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10604g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10605h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10606i;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: d  reason: collision with root package name */
        public VideoOptions f10609d;

        /* renamed from: a  reason: collision with root package name */
        public boolean f10607a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f10608b = 0;
        public boolean c = false;

        /* renamed from: e  reason: collision with root package name */
        public int f10610e = 1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10611f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10612g = false;

        /* renamed from: h  reason: collision with root package name */
        public int f10613h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f10614i = 1;

        public final NativeAdOptions a() {
            return new NativeAdOptions(this);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public @interface NativeMediaAspectRatio {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f10599a = builder.f10607a;
        this.f10600b = builder.f10608b;
        this.c = builder.c;
        this.f10601d = builder.f10610e;
        this.f10602e = builder.f10609d;
        this.f10603f = builder.f10611f;
        this.f10604g = builder.f10612g;
        this.f10605h = builder.f10613h;
        this.f10606i = builder.f10614i;
    }
}
