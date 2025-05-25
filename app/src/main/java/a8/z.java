package a8;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzge;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class z extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final Object f391a;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue f392b;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzgb f393d;

    public z(zzgb zzgbVar, String str, BlockingQueue blockingQueue) {
        this.f393d = zzgbVar;
        Preconditions.j(blockingQueue);
        this.f391a = new Object();
        this.f392b = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f391a) {
            this.f391a.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.f393d.f11770i) {
            try {
                if (!this.c) {
                    this.f393d.f11771j.release();
                    this.f393d.f11770i.notifyAll();
                    zzgb zzgbVar = this.f393d;
                    if (this == zzgbVar.c) {
                        zzgbVar.c = null;
                    } else if (this == zzgbVar.f11765d) {
                        zzgbVar.f11765d = null;
                    } else {
                        zzeu zzeuVar = ((zzge) zzgbVar.f3529a).f11780i;
                        zzge.f(zzeuVar);
                        zzeuVar.f11712f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        zzeu zzeuVar = ((zzge) this.f393d.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11715i.b(interruptedException, String.valueOf(getName()).concat(" was interrupted"));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i10;
        boolean z10 = false;
        while (!z10) {
            try {
                this.f393d.f11771j.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                y yVar = (y) this.f392b.poll();
                if (yVar != null) {
                    if (true != yVar.f384b) {
                        i10 = 10;
                    } else {
                        i10 = threadPriority;
                    }
                    Process.setThreadPriority(i10);
                    yVar.run();
                } else {
                    synchronized (this.f391a) {
                        if (this.f392b.peek() == null) {
                            zzgb zzgbVar = this.f393d;
                            AtomicLong atomicLong = zzgb.f11764k;
                            zzgbVar.getClass();
                            try {
                                this.f391a.wait(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f393d.f11770i) {
                        if (this.f392b.peek() == null) {
                            b();
                            return;
                        }
                    }
                }
            }
        } finally {
            b();
        }
    }
}
