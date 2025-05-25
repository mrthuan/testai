package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.j6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1681j6 implements InterfaceC1667i6 {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1667i6 f15213a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f15214b;

    public C1681j6(InterfaceC1667i6 mediaChangeReceiver) {
        kotlin.jvm.internal.g.e(mediaChangeReceiver, "mediaChangeReceiver");
        this.f15213a = mediaChangeReceiver;
        this.f15214b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC1667i6
    public final void a() {
        if (this.f15214b.getAndSet(false)) {
            this.f15213a.a();
        }
    }

    @Override // com.inmobi.media.InterfaceC1667i6
    public final void b() {
        if (!this.f15214b.getAndSet(true)) {
            this.f15213a.b();
        }
    }
}
