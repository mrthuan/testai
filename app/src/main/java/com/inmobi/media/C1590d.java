package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1590d extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ X f15009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1790r9 f15010b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590d(X x4, InterfaceC1790r9 interfaceC1790r9) {
        super(0);
        this.f15009a = x4;
        this.f15010b = interfaceC1790r9;
    }

    @Override // cg.a
    public final Object invoke() {
        try {
            Object a10 = this.f15009a.a();
            InterfaceC1790r9 interfaceC1790r9 = this.f15010b;
            if (interfaceC1790r9 != null) {
                interfaceC1790r9.a(a10);
            }
        } catch (Exception e10) {
            InterfaceC1790r9 interfaceC1790r92 = this.f15010b;
            if (interfaceC1790r92 != null) {
                interfaceC1790r92.onError(e10);
            }
        }
        return tf.d.f30009a;
    }
}
