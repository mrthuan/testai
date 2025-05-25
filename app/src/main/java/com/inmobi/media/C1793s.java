package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;

/* renamed from: com.inmobi.media.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1793s {

    /* renamed from: a  reason: collision with root package name */
    public final AdEvents f15425a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaEvents f15426b;

    public C1793s(AdSession adSession, String str) {
        kotlin.jvm.internal.g.e(adSession, "adSession");
        if (kotlin.jvm.internal.g.a(str, "native_video_ad")) {
            this.f15426b = MediaEvents.createMediaEvents(adSession);
            this.f15425a = AdEvents.createAdEvents(adSession);
            return;
        }
        this.f15425a = AdEvents.createAdEvents(adSession);
    }
}
