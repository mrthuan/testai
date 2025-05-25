package com.google.android.tools;

import android.content.Context;
import android.net.Uri;
import androidx.activity.s;
import cg.p;
import com.facebook.applinks.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InstallReferrerUtil.kt */
@wf.c(c = "com.google.android.tools.InstallReferrerUtil$fetchDeferredAppLinkData$1", f = "InstallReferrerUtil.kt", l = {236}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InstallReferrerUtil$fetchDeferredAppLinkData$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerUtil$fetchDeferredAppLinkData$1(Context context, kotlin.coroutines.c<? super InstallReferrerUtil$fetchDeferredAppLinkData$1> cVar) {
        super(2, cVar);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new InstallReferrerUtil$fetchDeferredAppLinkData$1(this.$context, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
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
            this.label = 1;
            if (e0.a(2500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if ("".length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            tf.c cVar = InstallReferrerUtil.f13468a;
            Context context = this.$context;
            Uri parse = Uri.parse("");
            kotlin.jvm.internal.g.d(parse, "parse(ReferrerConfig.debugMetaDeeplink)");
            InstallReferrerUtil.b(context, parse);
        }
        try {
            com.facebook.d.k();
            com.facebook.d.f9700q = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            final Context context2 = this.$context;
            com.facebook.applinks.b.c(context2, new b.a() { // from class: com.google.android.tools.g
                @Override // com.facebook.applinks.b.a
                public final void a(com.facebook.applinks.b bVar) {
                    Uri uri;
                    if (bVar != null) {
                        uri = bVar.f9672a;
                    } else {
                        uri = null;
                    }
                    if (uri != null) {
                        tf.c cVar2 = InstallReferrerUtil.f13468a;
                        InstallReferrerUtil.b(context2, uri);
                    }
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((InstallReferrerUtil$fetchDeferredAppLinkData$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
