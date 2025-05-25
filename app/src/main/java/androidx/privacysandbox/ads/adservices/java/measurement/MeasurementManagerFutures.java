package androidx.privacysandbox.ads.adservices.java.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.internal.b;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import t1.f;
import t1.h;
import tf.d;
import y9.a;

/* compiled from: MeasurementManagerFutures.kt */
/* loaded from: classes.dex */
public abstract class MeasurementManagerFutures {

    /* compiled from: MeasurementManagerFutures.kt */
    /* loaded from: classes.dex */
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {

        /* renamed from: a  reason: collision with root package name */
        public final f f4152a;

        public Api33Ext5JavaImpl(f.a aVar) {
            this.f4152a = aVar;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public a<d> a(Uri attributionSource, InputEvent inputEvent) {
            g.e(attributionSource, "attributionSource");
            return b.a(t0.o(x.a(j0.f20206a), new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, attributionSource, inputEvent, null)));
        }

        public a<d> b(t1.a deletionRequest) {
            g.e(deletionRequest, "deletionRequest");
            throw null;
        }

        public a<Integer> c() {
            return b.a(t0.o(x.a(j0.f20206a), new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null)));
        }

        public a<d> d(Uri trigger) {
            g.e(trigger, "trigger");
            return b.a(t0.o(x.a(j0.f20206a), new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, trigger, null)));
        }

        public a<d> e(t1.g request) {
            g.e(request, "request");
            throw null;
        }

        public a<d> f(h request) {
            g.e(request, "request");
            throw null;
        }
    }

    public abstract a<d> a(Uri uri, InputEvent inputEvent);
}
