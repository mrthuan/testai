package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.u4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1824u4 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f15490a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PublisherCallbacks f15491b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824u4(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z10) {
        super(0);
        this.f15490a = inMobiBanner;
        this.f15491b = publisherCallbacks;
        this.c = z10;
    }

    @Override // cg.a
    public final Object invoke() {
        C1834v1 mAdManager$media_release;
        String frameSizeString;
        this.f15490a.a();
        if (InMobiBanner.access$checkForRefreshRate(this.f15490a) && (mAdManager$media_release = this.f15490a.getMAdManager$media_release()) != null) {
            PublisherCallbacks publisherCallbacks = this.f15491b;
            frameSizeString = this.f15490a.getFrameSizeString();
            mAdManager$media_release.a(publisherCallbacks, frameSizeString, this.c);
        }
        return tf.d.f30009a;
    }
}
