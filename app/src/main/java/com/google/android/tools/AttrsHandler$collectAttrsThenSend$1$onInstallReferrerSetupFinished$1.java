package com.google.android.tools;

import android.content.Context;
import androidx.activity.s;
import cg.p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: AttrsHandler.kt */
@wf.c(c = "com.google.android.tools.AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1", f = "AttrsHandler.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fbAppId;
    final /* synthetic */ InstallReferrerClient $referrerClient;
    final /* synthetic */ int $responseCode;
    int label;
    final /* synthetic */ c this$0;

    /* compiled from: AttrsHandler.kt */
    @wf.c(c = "com.google.android.tools.AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1$1", f = "AttrsHandler.kt", l = {107, 108}, m = "invokeSuspend")
    /* renamed from: com.google.android.tools.AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fbAppId;
        final /* synthetic */ InstallReferrerClient $referrerClient;
        Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InstallReferrerClient installReferrerClient, c cVar, String str, Context context, kotlin.coroutines.c<? super AnonymousClass1> cVar2) {
            super(2, cVar2);
            this.$referrerClient = installReferrerClient;
            this.this$0 = cVar;
            this.$fbAppId = str;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$referrerClient, this.this$0, this.$fbAppId, this.$context, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00ae A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:7:0x0012, B:49:0x00aa, B:51:0x00ae, B:52:0x00ba, B:12:0x0023, B:45:0x009a, B:15:0x002b, B:19:0x003a, B:25:0x0047, B:27:0x0060, B:34:0x006e, B:38:0x007a, B:40:0x0080, B:41:0x008c), top: B:58:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 3
                r3 = 0
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L28
                if (r1 == r5) goto L1f
                if (r1 != r4) goto L17
                java.lang.Object r0 = r10.L$0
                org.json.JSONArray r0 = (org.json.JSONArray) r0
                androidx.activity.s.u0(r11)     // Catch: java.lang.Throwable -> Ld0
                goto Laa
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                java.lang.Object r1 = r10.L$0
                org.json.JSONArray r1 = (org.json.JSONArray) r1
                androidx.activity.s.u0(r11)     // Catch: java.lang.Throwable -> Ld0
                goto L9a
            L28:
                androidx.activity.s.u0(r11)
                com.android.installreferrer.api.InstallReferrerClient r11 = r10.$referrerClient     // Catch: java.lang.Throwable -> Ld0
                com.android.installreferrer.api.ReferrerDetails r11 = r11.getInstallReferrer()     // Catch: java.lang.Throwable -> Ld0
                java.lang.String r11 = r11.getInstallReferrer()     // Catch: java.lang.Throwable -> Ld0
                java.lang.String r1 = ""
                if (r11 != 0) goto L3a
                r11 = r1
            L3a:
                int r6 = r1.length()     // Catch: java.lang.Throwable -> Ld0
                r7 = 0
                if (r6 <= 0) goto L43
                r6 = r5
                goto L44
            L43:
                r6 = r7
            L44:
                if (r6 == 0) goto L47
                r11 = r1
            L47:
                org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld0
                r6.<init>()     // Catch: java.lang.Throwable -> Ld0
                int r8 = androidx.activity.s.t(r11)     // Catch: java.lang.Throwable -> Ld0
                com.google.android.tools.c r9 = r10.this$0     // Catch: java.lang.Throwable -> Ld0
                r9.getClass()     // Catch: java.lang.Throwable -> Ld0
                org.json.JSONObject r11 = com.google.android.tools.c.c(r8, r7, r11, r3)     // Catch: java.lang.Throwable -> Ld0
                r6.put(r11)     // Catch: java.lang.Throwable -> Ld0
                java.lang.String r11 = r10.$fbAppId     // Catch: java.lang.Throwable -> Ld0
                if (r11 == 0) goto L6c
                int r11 = r11.length()     // Catch: java.lang.Throwable -> Ld0
                if (r11 <= 0) goto L68
                r11 = r5
                goto L69
            L68:
                r11 = r7
            L69:
                if (r11 != r5) goto L6c
                r7 = r5
            L6c:
                if (r7 == 0) goto L8c
                android.content.Context r11 = r10.$context     // Catch: java.lang.Throwable -> Ld0
                java.lang.String r7 = r10.$fbAppId     // Catch: java.lang.Throwable -> Ld0
                java.lang.String r11 = b.b.y(r11, r7)     // Catch: java.lang.Throwable -> Ld0
                if (r11 != 0) goto L79
                goto L7a
            L79:
                r1 = r11
            L7a:
                boolean r11 = androidx.activity.s.k0(r1)     // Catch: java.lang.Throwable -> Ld0
                if (r11 == 0) goto L8c
                com.google.android.tools.c r11 = r10.this$0     // Catch: java.lang.Throwable -> Ld0
                r11.getClass()     // Catch: java.lang.Throwable -> Ld0
                org.json.JSONObject r11 = com.google.android.tools.c.c(r2, r5, r1, r3)     // Catch: java.lang.Throwable -> Ld0
                r6.put(r11)     // Catch: java.lang.Throwable -> Ld0
            L8c:
                r10.L$0 = r6     // Catch: java.lang.Throwable -> Ld0
                r10.label = r5     // Catch: java.lang.Throwable -> Ld0
                r7 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r11 = kotlinx.coroutines.e0.a(r7, r10)     // Catch: java.lang.Throwable -> Ld0
                if (r11 != r0) goto L99
                return r0
            L99:
                r1 = r6
            L9a:
                com.google.android.tools.c r11 = r10.this$0     // Catch: java.lang.Throwable -> Ld0
                android.content.Context r5 = r10.$context     // Catch: java.lang.Throwable -> Ld0
                r10.L$0 = r1     // Catch: java.lang.Throwable -> Ld0
                r10.label = r4     // Catch: java.lang.Throwable -> Ld0
                java.lang.Object r11 = com.google.android.tools.c.a(r11, r5, r10)     // Catch: java.lang.Throwable -> Ld0
                if (r11 != r0) goto La9
                return r0
            La9:
                r0 = r1
            Laa:
                java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Ld0
                if (r11 == 0) goto Lba
                com.google.android.tools.c r1 = r10.this$0     // Catch: java.lang.Throwable -> Ld0
                r1.getClass()     // Catch: java.lang.Throwable -> Ld0
                org.json.JSONObject r11 = com.google.android.tools.c.c(r2, r4, r11, r3)     // Catch: java.lang.Throwable -> Ld0
                r0.put(r11)     // Catch: java.lang.Throwable -> Ld0
            Lba:
                com.lib.flutter.encrypt.EngineHelper r11 = com.lib.flutter.encrypt.EngineHelper.f15726a     // Catch: java.lang.Throwable -> Ld0
                com.google.android.tools.c r1 = r10.this$0     // Catch: java.lang.Throwable -> Ld0
                java.lang.String r1 = r1.f13483a     // Catch: java.lang.Throwable -> Ld0
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld0
                java.lang.String r2 = "jsonArray.toString()"
                kotlin.jvm.internal.g.d(r0, r2)     // Catch: java.lang.Throwable -> Ld0
                r11.getClass()     // Catch: java.lang.Throwable -> Ld0
                com.lib.flutter.encrypt.EngineHelper.f(r1, r0)     // Catch: java.lang.Throwable -> Ld0
                goto Ld4
            Ld0:
                r11 = move-exception
                r11.printStackTrace()
            Ld4:
                tf.d r11 = tf.d.f30009a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.tools.AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1(int i10, InstallReferrerClient installReferrerClient, c cVar, String str, Context context, kotlin.coroutines.c<? super AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1> cVar2) {
        super(2, cVar2);
        this.$responseCode = i10;
        this.$referrerClient = installReferrerClient;
        this.this$0 = cVar;
        this.$fbAppId = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1(this.$responseCode, this.$referrerClient, this.this$0, this.$fbAppId, this.$context, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            if (this.$responseCode == 0) {
                lg.a aVar = j0.f20207b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$referrerClient, this.this$0, this.$fbAppId, this.$context, null);
                this.label = 1;
                if (t0.w0(aVar, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        this.$referrerClient.endConnection();
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((AttrsHandler$collectAttrsThenSend$1$onInstallReferrerSetupFinished$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
