package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.inmobi.media.kb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1700kb {

    /* renamed from: a  reason: collision with root package name */
    public static final C1851w5 f15269a;

    /* renamed from: b  reason: collision with root package name */
    public static int f15270b;
    public static Integer c;

    static {
        C1851w5 c1851w5;
        Context d10 = Ha.d();
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            c1851w5 = AbstractC1838v5.a(d10, "imtelemetrydboverflow");
        } else {
            c1851w5 = null;
        }
        f15269a = c1851w5;
        f15270b = -1;
    }

    public static int a() {
        if (f15270b == -1) {
            C1851w5 c1851w5 = f15269a;
            int i10 = 0;
            if (c1851w5 != null) {
                i10 = c1851w5.f15579a.getInt("count", 0);
            }
            f15270b = i10;
        }
        return f15270b;
    }
}
