package com.inmobi.media;

import java.util.Iterator;

/* renamed from: com.inmobi.media.m4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1721m4 extends eg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1734n4 f15303a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721m4(EnumC1586c9 enumC1586c9, C1734n4 c1734n4) {
        super(enumC1586c9);
        this.f15303a = c1734n4;
    }

    @Override // eg.a
    public final void afterChange(ig.h property, Object obj, Object obj2) {
        kotlin.jvm.internal.g.e(property, "property");
        EnumC1586c9 enumC1586c9 = (EnumC1586c9) obj2;
        if (AbstractC1600d9.a((EnumC1586c9) obj) != AbstractC1600d9.a(enumC1586c9)) {
            Iterator it = this.f15303a.f15343b.iterator();
            while (it.hasNext()) {
                ((InterfaceC1628f9) it.next()).a(enumC1586c9);
            }
        }
    }
}
