package com.inmobi.media;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.m7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1724m7 extends W6 {

    /* renamed from: x  reason: collision with root package name */
    public final String f15316x;

    /* renamed from: y  reason: collision with root package name */
    public final tf.c f15317y;

    public /* synthetic */ C1724m7(String str, String str2, X6 x62, String str3, String str4, JSONObject jSONObject) {
        this(str, str2, x62, str3, new ArrayList(), str4, jSONObject);
    }

    public static final P3 a(C1724m7 c1724m7, String str) {
        c1724m7.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            return new Q3(str);
        }
        return new B0(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1724m7(String assetId, String assetName, X6 assetStyle, String url, List trackers, String interactionMode, JSONObject jSONObject) {
        super(assetId, assetName, "GIF", assetStyle, trackers);
        kotlin.jvm.internal.g.e(assetId, "assetId");
        kotlin.jvm.internal.g.e(assetName, "assetName");
        kotlin.jvm.internal.g.e(assetStyle, "assetStyle");
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(trackers, "trackers");
        kotlin.jvm.internal.g.e(interactionMode, "interactionMode");
        this.f15316x = "m7";
        this.f15317y = kotlin.a.a(new C1710l7(this, url));
        Ha.a(new qb.e0(url, this, jSONObject, interactionMode));
    }

    public static final void a(String url, C1724m7 this$0, JSONObject jSONObject, String interactionMode) {
        kotlin.jvm.internal.g.e(url, "$url");
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(interactionMode, "$interactionMode");
        C1674j b10 = AbstractC1882ya.a().b(url);
        this$0.f14789e = b10 != null ? b10.c : null;
        if (jSONObject != null) {
            this$0.f14791g = interactionMode;
        }
    }
}
