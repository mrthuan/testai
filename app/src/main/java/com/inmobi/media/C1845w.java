package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* renamed from: com.inmobi.media.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1845w extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final InMobiAdRequestStatus f15521a;

    /* renamed from: b  reason: collision with root package name */
    public final short f15522b;

    public C1845w(InMobiAdRequestStatus status, short s4) {
        kotlin.jvm.internal.g.e(status, "status");
        this.f15521a = status;
        this.f15522b = s4;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f15521a.getMessage();
    }
}
