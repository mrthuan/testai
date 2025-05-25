package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o2.h;
import x2.p;
import x2.r;
import y2.m;
import y2.s;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public final class c implements t2.c, p2.a, s.b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4940a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4941b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4942d;

    /* renamed from: e  reason: collision with root package name */
    public final t2.d f4943e;

    /* renamed from: h  reason: collision with root package name */
    public PowerManager.WakeLock f4946h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4947i = false;

    /* renamed from: g  reason: collision with root package name */
    public int f4945g = 0;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4944f = new Object();

    static {
        h.e("DelayMetCommandHandler");
    }

    public c(Context context, int i10, String str, d dVar) {
        this.f4940a = context;
        this.f4941b = i10;
        this.f4942d = dVar;
        this.c = str;
        this.f4943e = new t2.d(context, dVar.f4950b, this);
    }

    @Override // y2.s.b
    public final void a(String str) {
        h c = h.c();
        String.format("Exceeded time limits on execution for %s", str);
        c.a(new Throwable[0]);
        g();
    }

    @Override // p2.a
    public final void b(String str, boolean z10) {
        h c = h.c();
        String.format("onExecuted %s, %s", str, Boolean.valueOf(z10));
        c.a(new Throwable[0]);
        c();
        int i10 = this.f4941b;
        d dVar = this.f4942d;
        Context context = this.f4940a;
        if (z10) {
            dVar.f(new d.b(i10, a.c(context, this.c), dVar));
        }
        if (this.f4947i) {
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            dVar.f(new d.b(i10, intent, dVar));
        }
    }

    public final void c() {
        synchronized (this.f4944f) {
            this.f4943e.d();
            this.f4942d.c.b(this.c);
            PowerManager.WakeLock wakeLock = this.f4946h;
            if (wakeLock != null && wakeLock.isHeld()) {
                h c = h.c();
                String.format("Releasing wakelock %s for WorkSpec %s", this.f4946h, this.c);
                c.a(new Throwable[0]);
                this.f4946h.release();
            }
        }
    }

    @Override // t2.c
    public final void d(ArrayList arrayList) {
        g();
    }

    public final void e() {
        String str = this.c;
        this.f4946h = m.a(this.f4940a, String.format("%s (%s)", str, Integer.valueOf(this.f4941b)));
        h c = h.c();
        String.format("Acquiring wakelock %s for WorkSpec %s", this.f4946h, str);
        c.a(new Throwable[0]);
        this.f4946h.acquire();
        p i10 = ((r) this.f4942d.f4952e.c.p()).i(str);
        if (i10 == null) {
            g();
            return;
        }
        boolean b10 = i10.b();
        this.f4947i = b10;
        if (!b10) {
            h c10 = h.c();
            String.format("No constraints for %s", str);
            c10.a(new Throwable[0]);
            f(Collections.singletonList(str));
            return;
        }
        this.f4943e.c(Collections.singletonList(i10));
    }

    @Override // t2.c
    public final void f(List<String> list) {
        if (!list.contains(this.c)) {
            return;
        }
        synchronized (this.f4944f) {
            if (this.f4945g == 0) {
                this.f4945g = 1;
                h c = h.c();
                String.format("onAllConstraintsMet for %s", this.c);
                c.a(new Throwable[0]);
                if (this.f4942d.f4951d.h(this.c, null)) {
                    this.f4942d.c.a(this.c, this);
                } else {
                    c();
                }
            } else {
                h c10 = h.c();
                String.format("Already started work for %s", this.c);
                c10.a(new Throwable[0]);
            }
        }
    }

    public final void g() {
        synchronized (this.f4944f) {
            if (this.f4945g < 2) {
                this.f4945g = 2;
                h c = h.c();
                String.format("Stopping work for WorkSpec %s", this.c);
                c.a(new Throwable[0]);
                Context context = this.f4940a;
                String str = this.c;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str);
                d dVar = this.f4942d;
                dVar.f(new d.b(this.f4941b, intent, dVar));
                if (this.f4942d.f4951d.e(this.c)) {
                    h c10 = h.c();
                    String.format("WorkSpec %s needs to be rescheduled", this.c);
                    c10.a(new Throwable[0]);
                    Intent c11 = a.c(this.f4940a, this.c);
                    d dVar2 = this.f4942d;
                    dVar2.f(new d.b(this.f4941b, c11, dVar2));
                } else {
                    h c12 = h.c();
                    String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.c);
                    c12.a(new Throwable[0]);
                }
            } else {
                h c13 = h.c();
                String.format("Already stopped work for %s", this.c);
                c13.a(new Throwable[0]);
            }
        }
    }
}
