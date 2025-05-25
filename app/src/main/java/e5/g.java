package e5;

import androidx.activity.r;

/* compiled from: UpdateInfo.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f16464a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16465b;

    public g() {
        this(0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f16464a == gVar.f16464a && kotlin.jvm.internal.g.a(this.f16465b, gVar.f16465b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16465b.hashCode() + (this.f16464a * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateItemA(id=");
        sb2.append(this.f16464a);
        sb2.append(", content=");
        return r.f(sb2, this.f16465b, ')');
    }

    public g(int i10, String content) {
        kotlin.jvm.internal.g.e(content, "content");
        this.f16464a = i10;
        this.f16465b = content;
    }
}
