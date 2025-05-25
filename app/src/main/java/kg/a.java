package kg;

import androidx.activity.s;
import cg.p;
import com.google.android.play.core.assetpacks.b1;
import kotlin.Result;
import kotlin.coroutines.c;
import tf.d;

/* compiled from: Cancellable.kt */
/* loaded from: classes.dex */
public final class a {
    public static void a(p pVar, Object obj, c cVar) {
        try {
            ge.a.O(b1.L(b1.t(pVar, obj, cVar)), Result.m13constructorimpl(d.f30009a), null);
        } catch (Throwable th2) {
            cVar.resumeWith(Result.m13constructorimpl(s.v(th2)));
            throw th2;
        }
    }
}
