package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class R7 extends C1646h {

    /* renamed from: a  reason: collision with root package name */
    public final String f14613a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14614b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final List f14615d;

    /* renamed from: e  reason: collision with root package name */
    public final List f14616e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(C1646h ad2, JSONArray jSONArray, String videoUrl, String videoDuration, String str, ArrayList trackers, ArrayList companionAds) {
        super(ad2, jSONArray);
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(videoUrl, "videoUrl");
        kotlin.jvm.internal.g.e(videoDuration, "videoDuration");
        kotlin.jvm.internal.g.e(trackers, "trackers");
        kotlin.jvm.internal.g.e(companionAds, "companionAds");
        this.f14613a = videoUrl;
        this.f14614b = videoDuration;
        this.c = str;
        this.f14615d = trackers;
        this.f14616e = companionAds;
    }
}
