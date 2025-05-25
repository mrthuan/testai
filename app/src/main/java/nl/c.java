package nl;

import androidx.activity.r;

/* compiled from: ManagerFilesPermission.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f22597a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22598b;
    public final String c;

    public c(String str, String str2, String str3) {
        ea.a.p("UXIqbmQ=", "df5v0YLW");
        ea.a.p("UnA7bBpjA3Qbb1pDBWElcwphX2U=", "ShwCD8AU");
        ea.a.p("LmNFaQ9pQ3kUYSdl", "82zOmVhk");
        this.f22597a = str;
        this.f22598b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.g.a(this.f22597a, cVar.f22597a) && kotlin.jvm.internal.g.a(this.f22598b, cVar.f22598b) && kotlin.jvm.internal.g.a(this.c, cVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.activity.f.h(this.f22598b, this.f22597a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ManagerFilesPermission(brand=");
        sb2.append(this.f22597a);
        sb2.append(", applicationClassName=");
        sb2.append(this.f22598b);
        sb2.append(", activityName=");
        return r.g(sb2, this.c, ")");
    }
}
