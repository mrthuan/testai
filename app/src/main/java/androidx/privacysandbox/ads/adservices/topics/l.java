package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;

/* compiled from: TopicsManagerApi33Ext5Impl.kt */
@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class l extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.Class r0 = androidx.privacysandbox.ads.adservices.topics.e.a()
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "context.getSystemService…opicsManager::class.java)"
            kotlin.jvm.internal.g.d(r2, r0)
            android.adservices.topics.TopicsManager r2 = androidx.privacysandbox.ads.adservices.topics.f.b(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.l.<init>(android.content.Context):void");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public final GetTopicsRequest i(a request) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        kotlin.jvm.internal.g.e(request, "request");
        adsSdkName = h.b().setAdsSdkName(request.f4155a);
        shouldRecordObservation = adsSdkName.setShouldRecordObservation(request.f4156b);
        build = shouldRecordObservation.build();
        kotlin.jvm.internal.g.d(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}
