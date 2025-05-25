package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@Deprecated
/* loaded from: classes.dex */
public final class NativeAdOptions {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10076a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10077b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10078d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10079e;

    /* renamed from: f  reason: collision with root package name */
    public final VideoOptions f10080f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10081g;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: e  reason: collision with root package name */
        public VideoOptions f10085e;

        /* renamed from: a  reason: collision with root package name */
        public boolean f10082a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f10083b = -1;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f10084d = false;

        /* renamed from: f  reason: collision with root package name */
        public int f10086f = 1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10087g = false;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    /* loaded from: classes.dex */
    public @interface NativeMediaAspectRatio {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f10076a = builder.f10082a;
        this.f10077b = builder.f10083b;
        this.c = builder.c;
        this.f10078d = builder.f10084d;
        this.f10079e = builder.f10086f;
        this.f10080f = builder.f10085e;
        this.f10081g = builder.f10087g;
    }
}
