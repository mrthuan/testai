package o9;

import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.TaskCompletionSource;
import p9.r;
import p9.x;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public final m f22764a;

    /* renamed from: b  reason: collision with root package name */
    public final e f22765b;
    public final Context c;

    public f(m mVar, e eVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f22764a = mVar;
        this.f22765b = eVar;
        this.c = context;
    }

    @Override // o9.b
    public final boolean a(a aVar, androidx.activity.result.c cVar, p pVar) {
        boolean z10;
        if (aVar != null && cVar != null) {
            if (aVar.b(pVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !aVar.f22757m) {
                aVar.f22757m = true;
                IntentSender intentSender = aVar.b(pVar).getIntentSender();
                kotlin.jvm.internal.g.e(intentSender, "intentSender");
                cVar.a(new androidx.activity.result.h(intentSender, null, 0, 0));
                return true;
            }
        }
        return false;
    }

    @Override // o9.b
    public final d8.o b() {
        String packageName = this.c.getPackageName();
        m mVar = this.f22764a;
        x xVar = mVar.f22776a;
        if (xVar == null) {
            return m.c();
        }
        m.f22774e.c("completeUpdate(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        xVar.a().post(new r(xVar, taskCompletionSource, taskCompletionSource, new i(taskCompletionSource, taskCompletionSource, mVar, packageName)));
        return taskCompletionSource.f11978a;
    }

    @Override // o9.b
    public final d8.o c() {
        String packageName = this.c.getPackageName();
        m mVar = this.f22764a;
        x xVar = mVar.f22776a;
        if (xVar == null) {
            return m.c();
        }
        m.f22774e.c("requestUpdateInfo(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        xVar.a().post(new r(xVar, taskCompletionSource, taskCompletionSource, new r(taskCompletionSource, taskCompletionSource, mVar, packageName)));
        return taskCompletionSource.f11978a;
    }

    @Override // o9.b
    public final synchronized void d(com.google.android.play.core.install.a aVar) {
        this.f22765b.a(aVar);
    }

    @Override // o9.b
    public final synchronized void e(com.google.android.play.core.install.a aVar) {
        this.f22765b.b(aVar);
    }
}
