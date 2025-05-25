package we;

import android.os.Trace;
import androidx.activity.i;
import androidx.activity.s;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import gf.c;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DartMessenger.java */
/* loaded from: classes.dex */
public final class c implements gf.c, we.d {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f31191a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f31192b;
    public final HashMap c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f31193d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f31194e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f31195f;

    /* renamed from: g  reason: collision with root package name */
    public int f31196g;

    /* renamed from: h  reason: collision with root package name */
    public final we.e f31197h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakHashMap<c.InterfaceC0236c, b> f31198i;

    /* renamed from: j  reason: collision with root package name */
    public final g f31199j;

    /* compiled from: DartMessenger.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f31200a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31201b;
        public final long c;

        public a(long j10, ByteBuffer byteBuffer, int i10) {
            this.f31200a = byteBuffer;
            this.f31201b = i10;
            this.c = j10;
        }
    }

    /* compiled from: DartMessenger.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(we.b bVar);
    }

    /* compiled from: DartMessenger.java */
    /* renamed from: we.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0397c implements g {

        /* renamed from: a  reason: collision with root package name */
        public final ExecutorService f31202a = te.b.a().c;
    }

    /* compiled from: DartMessenger.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final c.a f31203a;

        /* renamed from: b  reason: collision with root package name */
        public final b f31204b;

        public d(c.a aVar, b bVar) {
            this.f31203a = aVar;
            this.f31204b = bVar;
        }
    }

    /* compiled from: DartMessenger.java */
    /* loaded from: classes.dex */
    public static class e implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public final FlutterJNI f31205a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31206b;
        public final AtomicBoolean c = new AtomicBoolean(false);

        public e(FlutterJNI flutterJNI, int i10) {
            this.f31205a = flutterJNI;
            this.f31206b = i10;
        }

        @Override // gf.c.b
        public final void a(ByteBuffer byteBuffer) {
            if (!this.c.getAndSet(true)) {
                int i10 = this.f31206b;
                FlutterJNI flutterJNI = this.f31205a;
                if (byteBuffer == null) {
                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i10);
                    return;
                } else {
                    flutterJNI.invokePlatformMessageResponseCallback(i10, byteBuffer, byteBuffer.position());
                    return;
                }
            }
            throw new IllegalStateException("Reply already submitted");
        }
    }

    /* compiled from: DartMessenger.java */
    /* loaded from: classes.dex */
    public static class f implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ExecutorService f31207a;

        /* renamed from: b  reason: collision with root package name */
        public final ConcurrentLinkedQueue<Runnable> f31208b = new ConcurrentLinkedQueue<>();
        public final AtomicBoolean c = new AtomicBoolean(false);

        public f(ExecutorService executorService) {
            this.f31207a = executorService;
        }

        @Override // we.c.b
        public final void a(we.b bVar) {
            this.f31208b.add(bVar);
            this.f31207a.execute(new y0(this, 15));
        }

        public final void b() {
            ExecutorService executorService = this.f31207a;
            ConcurrentLinkedQueue<Runnable> concurrentLinkedQueue = this.f31208b;
            AtomicBoolean atomicBoolean = this.c;
            if (atomicBoolean.compareAndSet(false, true)) {
                try {
                    Runnable poll = concurrentLinkedQueue.poll();
                    if (poll != null) {
                        poll.run();
                    }
                    atomicBoolean.set(false);
                    if (!concurrentLinkedQueue.isEmpty()) {
                        executorService.execute(new z0(this, 15));
                    }
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    if (!concurrentLinkedQueue.isEmpty()) {
                        executorService.execute(new i(this, 17));
                    }
                    throw th2;
                }
            }
        }
    }

    /* compiled from: DartMessenger.java */
    /* loaded from: classes.dex */
    public interface g {
    }

    /* compiled from: DartMessenger.java */
    /* loaded from: classes.dex */
    public static class h implements c.InterfaceC0236c {
    }

    public c(FlutterJNI flutterJNI) {
        C0397c c0397c = new C0397c();
        this.f31192b = new HashMap();
        this.c = new HashMap();
        this.f31193d = new Object();
        this.f31194e = new AtomicBoolean(false);
        this.f31195f = new HashMap();
        this.f31196g = 1;
        this.f31197h = new we.e();
        this.f31198i = new WeakHashMap<>();
        this.f31191a = flutterJNI;
        this.f31199j = c0397c;
    }

    @Override // gf.c
    public final void a(String str, ByteBuffer byteBuffer, c.b bVar) {
        Trace.beginSection(s.w("DartMessenger#send on " + str));
        try {
            int i10 = this.f31196g;
            this.f31196g = i10 + 1;
            if (bVar != null) {
                this.f31195f.put(Integer.valueOf(i10), bVar);
            }
            FlutterJNI flutterJNI = this.f31191a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i10);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i10);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // gf.c
    public final c.InterfaceC0236c b() {
        return e(new c.d());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(1:3)(1:31)|4|5|6|(7:8|9|10|11|(1:13)|14|15)|28|19|20|21|(1:23)|24|11|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        e2.a.a(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Type inference failed for: r0v2, types: [we.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final int r15, final long r16, final we.c.d r18, final java.lang.String r19, final java.nio.ByteBuffer r20) {
        /*
            r14 = this;
            r5 = r18
            r0 = 0
            if (r5 == 0) goto L9
            we.c$b r1 = r5.f31204b
            r9 = r1
            goto La
        L9:
            r9 = r0
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PlatformChannel ScheduleHandler on "
            r1.<init>(r2)
            r3 = r19
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = androidx.activity.s.w(r1)
            java.lang.reflect.Method r2 = e2.a.c     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L27
            r4 = r15
            e2.b.a(r15, r1)     // Catch: java.lang.Throwable -> L28
            goto L64
        L27:
            r4 = r15
        L28:
            java.lang.String r2 = "asyncTraceBegin"
            java.lang.reflect.Method r6 = e2.a.c     // Catch: java.lang.Exception -> L60
            r7 = 2
            r8 = 1
            r10 = 0
            r11 = 3
            if (r6 != 0) goto L48
            java.lang.Class<android.os.Trace> r6 = android.os.Trace.class
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch: java.lang.Exception -> L60
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L60
            r12[r10] = r13     // Catch: java.lang.Exception -> L60
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r12[r8] = r13     // Catch: java.lang.Exception -> L60
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L60
            r12[r7] = r13     // Catch: java.lang.Exception -> L60
            java.lang.reflect.Method r2 = r6.getMethod(r2, r12)     // Catch: java.lang.Exception -> L60
            e2.a.c = r2     // Catch: java.lang.Exception -> L60
        L48:
            java.lang.reflect.Method r2 = e2.a.c     // Catch: java.lang.Exception -> L60
            java.lang.Object[] r6 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> L60
            long r11 = e2.a.f16334a     // Catch: java.lang.Exception -> L60
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Exception -> L60
            r6[r10] = r11     // Catch: java.lang.Exception -> L60
            r6[r8] = r1     // Catch: java.lang.Exception -> L60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Exception -> L60
            r6[r7] = r1     // Catch: java.lang.Exception -> L60
            r2.invoke(r0, r6)     // Catch: java.lang.Exception -> L60
            goto L64
        L60:
            r0 = move-exception
            e2.a.a(r0)
        L64:
            we.b r0 = new we.b
            r1 = r0
            r2 = r14
            r3 = r19
            r4 = r15
            r5 = r18
            r6 = r20
            r7 = r16
            r1.<init>()
            r1 = r14
            if (r9 != 0) goto L79
            we.e r9 = r1.f31197h
        L79:
            r9.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we.c.c(int, long, we.c$d, java.lang.String, java.nio.ByteBuffer):void");
    }

    @Override // gf.c
    public final void d(String str, c.a aVar, c.InterfaceC0236c interfaceC0236c) {
        b bVar;
        if (aVar == null) {
            synchronized (this.f31193d) {
                this.f31192b.remove(str);
            }
            return;
        }
        if (interfaceC0236c != null) {
            bVar = this.f31198i.get(interfaceC0236c);
            if (bVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            bVar = null;
        }
        synchronized (this.f31193d) {
            this.f31192b.put(str, new d(aVar, bVar));
            List<a> list = (List) this.c.remove(str);
            if (list == null) {
                return;
            }
            for (a aVar2 : list) {
                ByteBuffer byteBuffer = aVar2.f31200a;
                c(aVar2.f31201b, aVar2.c, (d) this.f31192b.get(str), str, byteBuffer);
            }
        }
    }

    public final c.InterfaceC0236c e(c.d dVar) {
        C0397c c0397c = (C0397c) this.f31199j;
        c0397c.getClass();
        f fVar = new f(c0397c.f31202a);
        h hVar = new h();
        this.f31198i.put(hVar, fVar);
        return hVar;
    }

    @Override // gf.c
    public final void f(String str, c.a aVar) {
        d(str, aVar, null);
    }
}
