package com.apm.insight.runtime;

import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import java.util.Comparator;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<a> f6763a = new Comparator<a>() { // from class: com.apm.insight.runtime.g.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(a aVar, a aVar2) {
            int i10 = aVar.f6766b + aVar.c;
            int i11 = aVar2.f6766b + aVar2.c;
            if (i10 != i11) {
                if (i10 > i11) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f6764b = new byte[4096];

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6765a = "unknown";

        /* renamed from: b  reason: collision with root package name */
        public int f6766b;
        public int c;
    }

    public static long a(int i10) {
        return q.a.a() * NativeImpl.c(i10);
    }
}
