package com.apm.insight.g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.b.g;
import com.apm.insight.b.k;
import com.apm.insight.i;
import com.apm.insight.l.h;
import com.apm.insight.l.n;
import com.apm.insight.l.q;
import com.apm.insight.l.u;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private Context f6504a;

    public d(Context context) {
        this.f6504a = context;
    }

    public static int a() {
        return 6;
    }

    @Override // com.apm.insight.g.c
    public void a(final long j10, final Thread thread, final Throwable th2, final String str, File file, final String str2, final boolean z10) {
        final File file2 = new File(n.a(this.f6504a), str);
        a.a().a(file2.getName());
        file2.mkdirs();
        h.f(file2);
        final boolean c = u.c(th2);
        com.apm.insight.entity.a a10 = f.a().a(CrashType.JAVA, null, new c.a() { // from class: com.apm.insight.g.d.1

            /* renamed from: a  reason: collision with root package name */
            long f6505a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
                String str3;
                String valueOf;
                this.f6505a = SystemClock.uptimeMillis();
                if (i10 == 0) {
                    aVar.a("data", (Object) u.a(th2));
                    aVar.a("isOOM", Boolean.valueOf(c));
                    aVar.a("isJava", (Object) 1);
                    aVar.a("crash_time", Long.valueOf(j10));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str4 = str2;
                    if (str4 != null) {
                        aVar.a("crash_md5", (Object) str4);
                        aVar.a("crash_md5", str2);
                        boolean z11 = z10;
                        if (z11) {
                            str3 = "has_ignore";
                            valueOf = String.valueOf(z11);
                            aVar.a(str3, valueOf);
                        }
                    }
                } else if (i10 == 1) {
                    Thread thread2 = thread;
                    aVar.a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                    aVar.a("tid", Integer.valueOf(Process.myTid()));
                    aVar.a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? "true" : "false");
                    aVar.a("crash_after_native", NativeImpl.d() ? "true" : "false");
                    a.a().a(thread, th2, false, aVar);
                } else if (i10 == 2) {
                    if (c) {
                        com.apm.insight.l.a.a(d.this.f6504a, aVar.h());
                    }
                    JSONArray c10 = g.b().c();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    JSONObject a11 = g.b().a(uptimeMillis).a();
                    JSONArray a12 = k.a(100, uptimeMillis);
                    aVar.a("history_message", (Object) c10);
                    aVar.a("current_message", a11);
                    aVar.a("pending_messages", (Object) a12);
                    aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                    valueOf = String.valueOf(com.apm.insight.c.b.a());
                    str3 = "npth_force_apm_crash";
                    aVar.a(str3, valueOf);
                } else if (i10 == 3) {
                    JSONObject b10 = u.b(Thread.currentThread().getName());
                    if (b10 != null) {
                        aVar.a("all_thread_stacks", b10);
                    }
                    aVar.a("logcat", (Object) com.apm.insight.runtime.k.b(i.f()));
                } else if (i10 != 4) {
                    if (i10 == 5) {
                        aVar.a("crash_uuid", (Object) str);
                    }
                } else if (!c) {
                    com.apm.insight.l.a.a(d.this.f6504a, aVar.h());
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar, boolean z11) {
                if (q.a(q.b(i10))) {
                    return aVar;
                }
                try {
                    File file3 = file2;
                    h.a(new File(file3, file2.getName() + "." + i10), aVar.h(), false);
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public void a(Throwable th3) {
            }
        }, true);
        long currentTimeMillis = System.currentTimeMillis() - j10;
        try {
            a10.a("crash_type", Constants.NORMAL);
            a10.b("crash_cost", String.valueOf(currentTimeMillis));
            a10.a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        } catch (Throwable th3) {
            com.apm.insight.c.a().a("NPTH_CATCH", th3);
        }
        if (q.a(4)) {
            return;
        }
        q.a(2048);
    }

    @Override // com.apm.insight.g.c
    public boolean a(Throwable th2) {
        return true;
    }
}
