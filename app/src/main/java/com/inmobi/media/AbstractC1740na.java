package com.inmobi.media;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.na  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1740na extends G8 {
    public final Map A;
    public final AtomicBoolean B;

    /* renamed from: y  reason: collision with root package name */
    public final int f15350y;

    /* renamed from: z  reason: collision with root package name */
    public final int f15351z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1740na(String url, Ib ib2, String str, int i10, int i11) {
        super("POST", url, ib2, M3.a(M3.f14454a, false, 1, null), (A4) null, "application/x-www-form-urlencoded", 64);
        kotlin.jvm.internal.g.e(url, "url");
        this.f15350y = i10;
        this.f15351z = i11;
        this.A = null;
        this.f14286m = str;
        this.B = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.G8
    public void f() {
        Set<Map.Entry> entrySet;
        super.f();
        Map map = this.A;
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (Map.Entry entry : entrySet) {
                if (!this.f14282i.containsKey(entry.getKey())) {
                    this.f14282i.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
