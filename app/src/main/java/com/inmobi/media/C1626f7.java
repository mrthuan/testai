package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.inmobi.media.f7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1626f7 extends I7 {
    public /* synthetic */ C1626f7(String str, String str2, C1612e7 c1612e7, String str3, String str4) {
        this(str, str2, c1612e7, str3, new ArrayList(), str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626f7(String assetId, String assetName, C1612e7 assetStyle, String str, List trackers, String interactionMode) {
        super(assetId, assetName, "CTA", assetStyle, str);
        kotlin.jvm.internal.g.e(assetId, "assetId");
        kotlin.jvm.internal.g.e(assetName, "assetName");
        kotlin.jvm.internal.g.e(assetStyle, "assetStyle");
        kotlin.jvm.internal.g.e(trackers, "trackers");
        kotlin.jvm.internal.g.e(interactionMode, "interactionMode");
        this.f14803s.addAll(trackers);
        this.f14791g = interactionMode;
    }
}
