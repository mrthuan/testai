package ol;

import android.text.TextUtils;
import androidx.activity.r;

/* compiled from: YearCouponSubscriptionPlan.kt */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f23493a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23494b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23495d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23496e;

    /* renamed from: f  reason: collision with root package name */
    public final String f23497f;

    public j(String str, String str2, String str3, String str4, String str5, String str6) {
        ea.a.p("DGYOZQtJZA==", "C9chy7AP");
        ea.a.p("XGYtZQFJBlQda1Fu", "YC2aVgCB");
        kotlin.jvm.internal.g.e(str3, ea.a.p("Om5YdA==", "bKhfGy8N"));
        ea.a.p("V2k4Yxx1DHQicl1jDFc_dCxvR3QTbip0", "P01teYfT");
        ea.a.p("LmZFZQtEXnM5bz9uAVAaaVZl", "4VklPRAd");
        ea.a.p("XHIiZxpuMnIbY2U=", "Yy57TaZA");
        this.f23493a = str;
        this.f23494b = str2;
        this.c = str3;
        this.f23495d = str4;
        this.f23496e = str5;
        this.f23497f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (kotlin.jvm.internal.g.a(this.f23493a, jVar.f23493a) && kotlin.jvm.internal.g.a(this.f23494b, jVar.f23494b) && kotlin.jvm.internal.g.a(this.c, jVar.c) && kotlin.jvm.internal.g.a(this.f23495d, jVar.f23495d) && kotlin.jvm.internal.g.a(this.f23496e, jVar.f23496e) && kotlin.jvm.internal.g.a(this.f23497f, jVar.f23497f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23497f.hashCode() + androidx.activity.f.h(this.f23496e, androidx.activity.f.h(this.f23495d, androidx.activity.f.h(this.c, androidx.activity.f.h(this.f23494b, this.f23493a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (TextUtils.isEmpty(this.f23493a)) {
            str = "Km1BdHk=";
            str2 = "iPJrhEnI";
        } else {
            str = "GW8WIDNtOHR5";
            str2 = "kDwbVHju";
        }
        String p10 = ea.a.p(str, str2);
        if (TextUtils.isEmpty(this.f23494b)) {
            str3 = "XG0hdHk=";
            str4 = "KX9QAeTV";
        } else {
            str3 = "XW8_IBZtEnR5";
            str4 = "Uv0OnZsg";
        }
        StringBuilder f10 = android.support.v4.media.session.h.f("YearCouponSubscriptionPlan(offerId='", p10, "', offerIdToken='", ea.a.p(str3, str4), "', unit='");
        f10.append(this.c);
        f10.append("', discountPrice='");
        f10.append(this.f23495d);
        f10.append("', afterDiscountPrice='");
        f10.append(this.f23496e);
        f10.append("', originPrice='");
        return r.g(f10, this.f23497f, "')");
    }
}
