package qm;

import androidx.activity.f;
import java.util.List;
import kotlin.jvm.internal.g;

/* compiled from: InquiryAfterGuideEntity.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f29384a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29385b;
    public final List<b> c;

    public a(String str, String str2, List<b> list) {
        ea.a.p("R2k_bGU=", "XmKKNyat");
        ea.a.p("PHVTdBB0W2U=", "Z1nywYdm");
        g.e(list, ea.a.p("JnRUbXM=", "ABCLPuem"));
        this.f29384a = str;
        this.f29385b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (g.a(this.f29384a, aVar.f29384a) && g.a(this.f29385b, aVar.f29385b) && g.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + f.h(this.f29385b, this.f29384a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InquiryAfterGuideEntity(title=" + this.f29384a + ", subtitle=" + this.f29385b + ", items=" + this.c + ")";
    }
}
