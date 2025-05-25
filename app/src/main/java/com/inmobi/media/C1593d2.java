package com.inmobi.media;

import java.util.concurrent.FutureTask;

/* renamed from: com.inmobi.media.d2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1593d2 extends FutureTask implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public volatile EnumC1765p9 f15011a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593d2(Runnable runnable, EnumC1765p9 priority) {
        super(runnable, null);
        kotlin.jvm.internal.g.e(priority, "priority");
        this.f15011a = priority;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1593d2 other = (C1593d2) obj;
        kotlin.jvm.internal.g.e(other, "other");
        return kotlin.jvm.internal.g.f(this.f15011a.f15381a, other.f15011a.f15381a);
    }
}
