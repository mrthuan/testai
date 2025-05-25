package i6;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.g;
import org.json.JSONArray;

/* compiled from: ANRDetector.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f18467a;

    /* renamed from: b  reason: collision with root package name */
    public static final ScheduledExecutorService f18468b;
    public static String c;

    /* renamed from: d  reason: collision with root package name */
    public static final d6.b f18469d;

    static {
        new a();
        f18467a = Process.myUid();
        f18468b = Executors.newSingleThreadScheduledExecutor();
        c = "";
        f18469d = new d6.b(1);
    }

    public static final void a(ActivityManager activityManager) {
        if (k6.a.b(a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f18467a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        g.d(thread, "getMainLooper().thread");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        g.d(stackTrace, "stackTrace");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String jSONArray2 = jSONArray.toString();
                        if (!g.a(jSONArray2, c) && h6.d.d(thread)) {
                            c = jSONArray2;
                            new InstrumentData(processErrorStateInfo.shortMsg, jSONArray2).c();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            k6.a.a(a.class, th2);
        }
    }
}
