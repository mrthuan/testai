package pi;

import java.util.Timer;
import java.util.TimerTask;
import lib.zj.office.system.k;

/* compiled from: ATimer.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f28961a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28962b;
    public Timer c;

    /* renamed from: d  reason: collision with root package name */
    public k f28963d;

    /* compiled from: ATimer.java */
    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            try {
                cVar.c.schedule(new a(), cVar.f28962b);
                cVar.f28963d.a();
            } catch (Exception unused) {
            }
        }
    }

    public c(int i10, k kVar) {
        this.f28962b = i10;
        this.f28963d = kVar;
    }

    public final void a() {
        if (this.f28961a) {
            return;
        }
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new a(), this.f28962b);
        this.f28961a = true;
    }

    public final void b() {
        if (this.f28961a) {
            this.c.cancel();
            this.c.purge();
            this.f28961a = false;
        }
    }
}
