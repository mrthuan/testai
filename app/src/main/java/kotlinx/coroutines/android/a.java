package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.k;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes.dex */
public final class a implements k {
    @Override // kotlinx.coroutines.internal.k
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.k
    public f1 b(List<? extends k> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.k
    public int c() {
        return 1073741823;
    }
}
