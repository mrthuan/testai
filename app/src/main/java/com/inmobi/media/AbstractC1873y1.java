package com.inmobi.media;

/* renamed from: com.inmobi.media.y1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1873y1 {

    /* renamed from: a  reason: collision with root package name */
    public String f15672a;

    /* renamed from: b  reason: collision with root package name */
    public long f15673b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public String f15674d;

    public AbstractC1873y1(String eventType, String str) {
        kotlin.jvm.internal.g.e(eventType, "eventType");
        this.f15672a = eventType;
        this.f15674d = str;
        this.f15673b = System.currentTimeMillis();
    }

    public final String a() {
        String str = this.f15674d;
        if (str == null) {
            return "";
        }
        return str;
    }
}
