package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Jt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0906Jt implements InterfaceC1109Rr {
    public final /* synthetic */ AnonymousClass71 A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C0906Jt(AnonymousClass71 anonymousClass71, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = anonymousClass71;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1109Rr
    public final void ABa(InterfaceC1107Rp interfaceC1107Rp) {
        AnonymousClass71.A06(interfaceC1107Rp.A6X(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1109Rr
    public final void ABt(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
