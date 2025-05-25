package bk;

import kotlin.jvm.internal.g;

/* compiled from: Task.kt */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f5442a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5443b;
    public c c;

    /* renamed from: d  reason: collision with root package name */
    public long f5444d;

    public /* synthetic */ a() {
        throw null;
    }

    public a(String name, boolean z10) {
        g.e(name, "name");
        this.f5442a = name;
        this.f5443b = z10;
        this.f5444d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f5442a;
    }
}
