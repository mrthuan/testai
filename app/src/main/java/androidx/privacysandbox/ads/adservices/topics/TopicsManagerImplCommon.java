package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;

/* compiled from: TopicsManagerImplCommon.kt */
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class TopicsManagerImplCommon extends d {

    /* renamed from: a  reason: collision with root package name */
    public final TopicsManager f4154a;

    public TopicsManagerImplCommon(TopicsManager mTopicsManager) {
        kotlin.jvm.internal.g.e(mTopicsManager, "mTopicsManager");
        this.f4154a = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[LOOP:0: B:18:0x0079->B:20:0x007f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object j(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r7, androidx.privacysandbox.ads.adservices.topics.a r8, kotlin.coroutines.c<? super androidx.privacysandbox.ads.adservices.topics.b> r9) {
        /*
            boolean r0 = r9 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r7 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) r7
            androidx.activity.s.u0(r9)
            goto L60
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            androidx.activity.s.u0(r9)
            android.adservices.topics.GetTopicsRequest r8 = r7.i(r8)
            r0.L$0 = r7
            r0.label = r3
            kotlinx.coroutines.h r9 = new kotlinx.coroutines.h
            kotlin.coroutines.c r0 = com.google.android.play.core.assetpacks.b1.L(r0)
            r9.<init>(r3, r0)
            r9.s()
            androidx.privacysandbox.ads.adservices.topics.o r0 = new androidx.privacysandbox.ads.adservices.topics.o
            r2 = 0
            r0.<init>(r2)
            android.os.OutcomeReceiver r2 = androidx.core.os.a.a(r9)
            android.adservices.topics.TopicsManager r3 = r7.f4154a
            androidx.privacysandbox.ads.adservices.topics.n.a(r3, r8, r0, r2)
            java.lang.Object r9 = r9.r()
            if (r9 != r1) goto L60
            return r1
        L60:
            android.adservices.topics.GetTopicsResponse r8 = androidx.privacysandbox.ads.adservices.topics.m.a(r9)
            r7.getClass()
            java.lang.String r7 = "response"
            kotlin.jvm.internal.g.e(r8, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = androidx.privacysandbox.ads.adservices.topics.e.b(r8)
            java.util.Iterator r8 = r8.iterator()
        L79:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9d
            java.lang.Object r9 = r8.next()
            android.adservices.topics.Topic r9 = androidx.privacysandbox.ads.adservices.topics.f.a(r9)
            androidx.privacysandbox.ads.adservices.topics.c r6 = new androidx.privacysandbox.ads.adservices.topics.c
            long r1 = androidx.privacysandbox.ads.adservices.topics.h.a(r9)
            long r3 = androidx.privacysandbox.ads.adservices.topics.i.a(r9)
            int r5 = androidx.privacysandbox.ads.adservices.topics.j.a(r9)
            r0 = r6
            r0.<init>(r1, r3, r5)
            r7.add(r6)
            goto L79
        L9d:
            androidx.privacysandbox.ads.adservices.topics.b r8 = new androidx.privacysandbox.ads.adservices.topics.b
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.j(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.a, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d
    public Object g(a aVar, kotlin.coroutines.c<? super b> cVar) {
        return j(this, aVar, cVar);
    }

    public GetTopicsRequest i(a request) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        kotlin.jvm.internal.g.e(request, "request");
        adsSdkName = h.b().setAdsSdkName(request.f4155a);
        build = adsSdkName.build();
        kotlin.jvm.internal.g.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }
}
