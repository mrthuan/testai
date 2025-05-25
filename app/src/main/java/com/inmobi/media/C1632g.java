package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1632g extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1646h f15079a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1632g(C1646h c1646h) {
        super(0);
        this.f15079a = c1646h;
    }

    @Override // cg.a
    public final Object invoke() {
        return new AdMetaInfo(this.f15079a.o(), this.f15079a.E());
    }
}
