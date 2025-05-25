package com.inmobi.media;

/* loaded from: classes2.dex */
public class R4 extends AbstractC1873y1 {

    /* renamed from: e  reason: collision with root package name */
    public final String f14609e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14610f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R4(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        kotlin.jvm.internal.g.e(eventId, "eventId");
        kotlin.jvm.internal.g.e(componentType, "componentType");
        kotlin.jvm.internal.g.e(eventType, "eventType");
        this.f14609e = eventId;
        this.f14610f = componentType;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15672a);
        sb2.append('@');
        return androidx.activity.r.f(sb2, this.f14610f, ' ');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public R4(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g.d(r0, r1)
            r2.<init>(r0, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.R4.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
