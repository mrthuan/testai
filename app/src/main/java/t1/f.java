package t1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.topics.i;
import androidx.privacysandbox.ads.adservices.topics.j;
import com.google.android.play.core.assetpacks.b1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: MeasurementManager.kt */
/* loaded from: classes.dex */
public abstract class f {

    /* compiled from: MeasurementManager.kt */
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final d.a f29911a;

        public a(Context context) {
            Object systemService = context.getSystemService(d.a.class);
            kotlin.jvm.internal.g.d(systemService, "context.getSystemService…:class.java\n            )");
            this.f29911a = (d.a) systemService;
        }

        @Override // t1.f
        public Object a(kotlin.coroutines.c<? super Integer> cVar) {
            kotlinx.coroutines.h hVar = new kotlinx.coroutines.h(1, b1.L(cVar));
            hVar.s();
            this.f29911a.getMeasurementApiStatus(new b(0), androidx.core.os.a.a(hVar));
            Object r4 = hVar.r();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return r4;
        }

        @Override // t1.f
        public Object b(Uri uri, InputEvent inputEvent, kotlin.coroutines.c<? super tf.d> cVar) {
            kotlinx.coroutines.h hVar = new kotlinx.coroutines.h(1, b1.L(cVar));
            hVar.s();
            this.f29911a.registerSource(uri, inputEvent, new d(0), androidx.core.os.a.a(hVar));
            Object r4 = hVar.r();
            if (r4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return r4;
            }
            return tf.d.f30009a;
        }

        @Override // t1.f
        public Object c(Uri uri, kotlin.coroutines.c<? super tf.d> cVar) {
            kotlinx.coroutines.h hVar = new kotlinx.coroutines.h(1, b1.L(cVar));
            hVar.s();
            androidx.core.os.a.a(hVar);
            this.f29911a.getClass();
            throw new RuntimeException("Stub!");
        }

        public Object d(t1.a aVar, kotlin.coroutines.c<? super tf.d> cVar) {
            new kotlinx.coroutines.h(1, b1.L(cVar)).s();
            androidx.privacysandbox.ads.adservices.topics.h.c();
            throw null;
        }

        public Object e(g gVar, kotlin.coroutines.c<? super tf.d> cVar) {
            new kotlinx.coroutines.h(1, b1.L(cVar)).s();
            i.c();
            throw null;
        }

        public Object f(h hVar, kotlin.coroutines.c<? super tf.d> cVar) {
            new kotlinx.coroutines.h(1, b1.L(cVar)).s();
            j.c();
            throw null;
        }
    }

    public abstract Object a(kotlin.coroutines.c<? super Integer> cVar);

    public abstract Object b(Uri uri, InputEvent inputEvent, kotlin.coroutines.c<? super tf.d> cVar);

    public abstract Object c(Uri uri, kotlin.coroutines.c<? super tf.d> cVar);
}
