package com.inmobi.ads;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.A4;
import com.inmobi.media.B4;
import com.inmobi.media.C1834v1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class d extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f14086a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte[] f14087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InMobiBanner inMobiBanner, byte[] bArr) {
        super(0);
        this.f14086a = inMobiBanner;
        this.f14087b = bArr;
    }

    @Override // cg.a
    public final Object invoke() {
        InMobiBanner.a aVar;
        A4 p10;
        C1834v1 mAdManager$media_release = this.f14086a.getMAdManager$media_release();
        if (mAdManager$media_release != null && (p10 = mAdManager$media_release.p()) != null) {
            String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
            g.d(access$getTAG$cp, "access$getTAG$cp(...)");
            ((B4) p10).c(access$getTAG$cp, "load with response");
        }
        C1834v1 mAdManager$media_release2 = this.f14086a.getMAdManager$media_release();
        if (mAdManager$media_release2 != null) {
            byte[] bArr = this.f14087b;
            aVar = this.f14086a.f14054e;
            mAdManager$media_release2.a(bArr, aVar);
        }
        return tf.d.f30009a;
    }
}
