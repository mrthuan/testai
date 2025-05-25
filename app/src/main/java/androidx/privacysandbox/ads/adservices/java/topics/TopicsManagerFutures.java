package androidx.privacysandbox.ads.adservices.java.topics;

import androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon;
import androidx.privacysandbox.ads.adservices.topics.b;
import androidx.privacysandbox.ads.adservices.topics.d;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import y9.a;

/* compiled from: TopicsManagerFutures.kt */
/* loaded from: classes.dex */
public abstract class TopicsManagerFutures {

    /* compiled from: TopicsManagerFutures.kt */
    /* loaded from: classes.dex */
    public static final class Api33Ext4JavaImpl extends TopicsManagerFutures {

        /* renamed from: a  reason: collision with root package name */
        public final d f4153a;

        public Api33Ext4JavaImpl(TopicsManagerImplCommon topicsManagerImplCommon) {
            this.f4153a = topicsManagerImplCommon;
        }

        public a<b> a(androidx.privacysandbox.ads.adservices.topics.a request) {
            g.e(request, "request");
            lg.b bVar = j0.f20206a;
            return androidx.privacysandbox.ads.adservices.java.internal.b.a(t0.o(x.a(l.f20194a), new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, request, null)));
        }
    }
}
