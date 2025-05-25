package oj;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PDFReflowInfo.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, Integer> f23098a = new ConcurrentHashMap<>();

    /* compiled from: PDFReflowInfo.java */
    /* renamed from: oj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0318a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23099a = new a();
    }

    public final int a(int i10) {
        Integer num = this.f23098a.get(Integer.valueOf(i10));
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }
}
