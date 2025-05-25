package com.inmobi.media;

/* renamed from: com.inmobi.media.mb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1728mb extends AbstractC1873y1 {

    /* renamed from: e  reason: collision with root package name */
    public final String f15323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728mb(String eventType, String str, String eventSource) {
        super(eventType, str);
        kotlin.jvm.internal.g.e(eventType, "eventType");
        kotlin.jvm.internal.g.e(eventSource, "eventSource");
        this.f15323e = eventSource;
    }

    public final String toString() {
        return androidx.activity.r.f(new StringBuilder(), this.f15672a, ' ');
    }
}
