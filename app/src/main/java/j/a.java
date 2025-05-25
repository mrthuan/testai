package j;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.io.Serializable;
import kotlin.jvm.internal.g;

/* compiled from: ActivityResultContract.kt */
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: j.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0256a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f18971a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0256a(Serializable serializable) {
            this.f18971a = serializable;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public C0256a b(ComponentActivity context, Object obj) {
        g.e(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
