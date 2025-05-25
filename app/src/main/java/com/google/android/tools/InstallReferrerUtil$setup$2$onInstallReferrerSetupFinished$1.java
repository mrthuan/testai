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

/* compiled from: InstallReferrerUtil.kt */
@wf.c(c = "com.google.android.tools.InstallReferrerUtil$setup$2$onInstallReferrerSetupFinished$1", f = "InstallReferrerUtil.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InstallReferrerUtil$setup$2$onInstallReferrerSetupFinished$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ InstallReferrerClient $referrerClient;
    final /* synthetic */ int $responseCode;
    int label;

    /* compiled from: InstallReferrerUtil.kt */
    @wf.c(c = "com.google.android.tools.InstallReferrerUtil$setup$2$onInstallReferrerSetupFinished$1$1", f = "InstallReferrerUtil.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.google.android.tools.InstallReferrerUtil$setup$2$onInstallReferrerSetupFinished$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ InstallReferrerClient $referrerClient;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InstallReferrerClient installReferrerClient, Context context, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$referrerClient = installReferrerClient;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$referrerClient, this.$context, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                s.u0(obj);
                try {
                    String installReferrer = this.$referrerClient.getInstallReferrer().getInstallReferrer();
                    String str = "";
                    if (installReferrer == null) {
                        installReferrer = "";
                    }
                    if ("".length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        str = installReferrer;
                    }
                    tf.c cVar = InstallReferrerUtil.f13468a;
                    Context context = this.$context;
                    kotlin.jvm.internal.g.d(context, "context");
                    InstallReferrerUtil.a(context, str);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return tf.d.f30009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // cg.p
        public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
            return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerUtil$setup$2$onInstallReferrerSetupFinished$1(int i10, InstallReferrerClient installReferrerClient, Context context, kotlin.coroutines.c<? super InstallReferrerUtil$setup$2$onInstallReferrerSetupFinished$1> cVar) {
        super(2, cVar);
        this.$responseCode = i10;
        this.$referrerClient = installReferrerClient;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new InstallReferrerUtil$setup$2$onInstallReferrerSetupFinished$1(this.$responseCode, this.$referrerClient, this.$context, cVar);
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$referrerClient, this.$context, null);
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
        return ((InstallReferrerUtil$setup$2$onInstallReferrerSetupFinished$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
