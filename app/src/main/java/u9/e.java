package u9;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import d8.o;
import q9.b0;

/* compiled from: com.google.android.play:review@@2.0.1 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final h f30266a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f30267b = new Handler(Looper.getMainLooper());

    public e(h hVar) {
        this.f30266a = hVar;
    }

    public final o a() {
        h hVar = this.f30266a;
        v9.f fVar = h.c;
        fVar.a("requestInAppReview (%s)", hVar.f30272b);
        if (hVar.f30271a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                v9.f.b(fVar.f30779a, "Play Store app is either not installed or not the official version", objArr);
            }
            return Tasks.d(new ReviewException(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        v9.o oVar = hVar.f30271a;
        f fVar2 = new f(hVar, taskCompletionSource, taskCompletionSource);
        synchronized (oVar.f30792f) {
            oVar.f30791e.add(taskCompletionSource);
            taskCompletionSource.f11978a.b(new b0(oVar, taskCompletionSource, 1));
        }
        synchronized (oVar.f30792f) {
            if (oVar.f30797k.getAndIncrement() > 0) {
                v9.f fVar3 = oVar.f30789b;
                Object[] objArr2 = new Object[0];
                fVar3.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    v9.f.b(fVar3.f30779a, "Already connected to the service.", objArr2);
                }
            }
        }
        oVar.a().post(new v9.i(oVar, taskCompletionSource, fVar2));
        return taskCompletionSource.f11978a;
    }
}
