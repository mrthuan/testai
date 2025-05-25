package androidx.core.os;

import android.os.OutcomeReceiver;
import com.google.android.gms.common.internal.i;
import kotlinx.coroutines.h;

/* compiled from: OutcomeReceiver.kt */
/* loaded from: classes.dex */
public final class a {
    public static final OutcomeReceiver a(h hVar) {
        return i.g(new ContinuationOutcomeReceiver(hVar));
    }
}
