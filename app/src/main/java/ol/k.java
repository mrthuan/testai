package ol;

import android.text.TextUtils;
import androidx.activity.r;

/* compiled from: YearSaveSubscriptionPlan.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f23498a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23499b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23500d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23501e;

    public k(String str, String str2, String str3, String str4, String str5) {
        ea.a.p("IGZXZQtJZA==", "4Nx6unFV");
        ea.a.p("OWYwZShJKVQnawNu", "c9VVZMUw");
        ea.a.p("XWkdYxt1NHQYcg9jZQ==", "o19ntZyE");
        ea.a.p("IHJYZxBuZ3IzY2U=", "e2XuPvbi");
        kotlin.jvm.internal.g.e(str5, ea.a.p("K2FIUAtpVGU=", "uyO1MPMQ"));
        this.f23498a = str;
        this.f23499b = str2;
        this.c = str3;
        this.f23500d = str4;
        this.f23501e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kotlin.jvm.internal.g.a(this.f23498a, kVar.f23498a) && kotlin.jvm.internal.g.a(this.f23499b, kVar.f23499b) && kotlin.jvm.internal.g.a(this.c, kVar.c) && kotlin.jvm.internal.g.a(this.f23500d, kVar.f23500d) && kotlin.jvm.internal.g.a(this.f23501e, kVar.f23501e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23501e.hashCode() + androidx.activity.f.h(this.f23500d, androidx.activity.f.h(this.c, androidx.activity.f.h(this.f23499b, this.f23498a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (TextUtils.isEmpty(this.f23498a)) {
            str = "Km1BdHk=";
            str2 = "2vTOgDd6";
        } else {
            str = "IW9FIBxtR3R5";
            str2 = "KyzAyCsn";
        }
        String p10 = ea.a.p(str, str2);
        if (TextUtils.isEmpty(this.f23499b)) {
            str3 = "Vm07dHk=";
            str4 = "xsP10qPY";
        } else {
            str3 = "Im81IBJtGHR5";
            str4 = "O9LAwhVb";
        }
        StringBuilder f10 = android.support.v4.media.session.h.f("YearSaveSubscriptionPlan(offerId='", p10, "', offerIdToken='", ea.a.p(str3, str4), "', discountPrice='");
        f10.append(this.c);
        f10.append("', originPrice='");
        f10.append(this.f23500d);
        f10.append("', dayPrice=");
        return r.g(f10, this.f23501e, ")");
    }
}
