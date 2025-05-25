package ol;

import android.text.TextUtils;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;

/* compiled from: SubscriptionPlan.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final SubscriptionType f23489a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23490b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23491d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23492e;

    public i(SubscriptionType subscriptionType, String str, String str2, String str3, long j10) {
        kotlin.jvm.internal.g.e(subscriptionType, ea.a.p("GnknZQ==", "7MnWlXyu"));
        ea.a.p("JGZSZUpJEFQnawNu", "qsK48trA");
        ea.a.p("VG8qbTl0A2UsUBRpV2U=", "Up2XXwsH");
        ea.a.p("F3IjZThyPWEkUANyXW9k", "rcqFlTp9");
        this.f23489a = subscriptionType;
        this.f23490b = str;
        this.c = str2;
        this.f23491d = str3;
        this.f23492e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f23489a == iVar.f23489a && kotlin.jvm.internal.g.a(this.f23490b, iVar.f23490b) && kotlin.jvm.internal.g.a(this.c, iVar.c) && kotlin.jvm.internal.g.a(this.f23491d, iVar.f23491d) && this.f23492e == iVar.f23492e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int h10 = androidx.activity.f.h(this.f23491d, androidx.activity.f.h(this.c, androidx.activity.f.h(this.f23490b, this.f23489a.hashCode() * 31, 31), 31), 31);
        long j10 = this.f23492e;
        return h10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        String str2;
        if (TextUtils.isEmpty(this.f23490b)) {
            str = "Vm07dHk=";
            str2 = "hC1cq527";
        } else {
            str = "XW8_IBZtEnR5";
            str2 = "GxsK90IU";
        }
        String p10 = ea.a.p(str, str2);
        StringBuilder sb2 = new StringBuilder("SubscriptionPlan(type=");
        sb2.append(this.f23489a);
        sb2.append(", offerIdToken='");
        sb2.append(p10);
        sb2.append("', formattedPrice='");
        sb2.append(this.c);
        sb2.append("', freeTrialPeriod='");
        sb2.append(this.f23491d);
        sb2.append("', yearPriceMillion='");
        return android.support.v4.media.session.h.e(sb2, this.f23492e, "')");
    }
}
