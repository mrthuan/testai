package ek;

import okio.ByteString;

/* compiled from: Header.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final ByteString f16642d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteString f16643e;

    /* renamed from: f  reason: collision with root package name */
    public static final ByteString f16644f;

    /* renamed from: g  reason: collision with root package name */
    public static final ByteString f16645g;

    /* renamed from: h  reason: collision with root package name */
    public static final ByteString f16646h;

    /* renamed from: i  reason: collision with root package name */
    public static final ByteString f16647i;

    /* renamed from: a  reason: collision with root package name */
    public final ByteString f16648a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteString f16649b;
    public final int c;

    static {
        ByteString.Companion.getClass();
        f16642d = ByteString.a.c(":");
        f16643e = ByteString.a.c(":status");
        f16644f = ByteString.a.c(":method");
        f16645g = ByteString.a.c(":path");
        f16646h = ByteString.a.c(":scheme");
        f16647i = ByteString.a.c(":authority");
    }

    public a(ByteString name, ByteString value) {
        kotlin.jvm.internal.g.e(name, "name");
        kotlin.jvm.internal.g.e(value, "value");
        this.f16648a = name;
        this.f16649b = value;
        this.c = value.size() + name.size() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.g.a(this.f16648a, aVar.f16648a) && kotlin.jvm.internal.g.a(this.f16649b, aVar.f16649b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16649b.hashCode() + (this.f16648a.hashCode() * 31);
    }

    public final String toString() {
        return this.f16648a.utf8() + ": " + this.f16649b.utf8();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String name, String value) {
        this(ByteString.a.c(name), ByteString.a.c(value));
        kotlin.jvm.internal.g.e(name, "name");
        kotlin.jvm.internal.g.e(value, "value");
        ByteString.Companion.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String value, ByteString name) {
        this(name, ByteString.a.c(value));
        kotlin.jvm.internal.g.e(name, "name");
        kotlin.jvm.internal.g.e(value, "value");
        ByteString.Companion.getClass();
    }
}
