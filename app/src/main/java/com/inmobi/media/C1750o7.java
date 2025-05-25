package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.o7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1750o7 extends W6 {
    public /* synthetic */ C1750o7(String str, String str2, X6 x62, String str3, String str4, JSONObject jSONObject) {
        this(str, str2, x62, str3, new ArrayList(), str4, jSONObject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750o7(String assetId, String assetName, X6 assetStyle, String url, List trackers, String interactionMode, JSONObject jSONObject) {
        super(assetId, assetName, "IMAGE", assetStyle, trackers);
        kotlin.jvm.internal.g.e(assetId, "assetId");
        kotlin.jvm.internal.g.e(assetName, "assetName");
        kotlin.jvm.internal.g.e(assetStyle, "assetStyle");
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(trackers, "trackers");
        kotlin.jvm.internal.g.e(interactionMode, "interactionMode");
        this.f14789e = url;
        if (jSONObject != null) {
            this.f14791g = interactionMode;
        }
    }
}
