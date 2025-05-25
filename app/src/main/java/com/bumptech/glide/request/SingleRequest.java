package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import l4.b;
import l4.c;
import m4.f;
import m4.g;
import n4.e;
import p4.j;
import q4.d;
import v3.l;

/* loaded from: classes.dex */
public final class SingleRequest<R> implements b, f, l4.f {
    public static final boolean B = Log.isLoggable("Request", 2);
    public final RuntimeException A;

    /* renamed from: a  reason: collision with root package name */
    public final d.a f7072a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7073b;
    public final l4.d<R> c;

    /* renamed from: d  reason: collision with root package name */
    public final RequestCoordinator f7074d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f7075e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bumptech.glide.d f7076f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7077g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<R> f7078h;

    /* renamed from: i  reason: collision with root package name */
    public final l4.a<?> f7079i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7080j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7081k;

    /* renamed from: l  reason: collision with root package name */
    public final Priority f7082l;

    /* renamed from: m  reason: collision with root package name */
    public final g<R> f7083m;

    /* renamed from: n  reason: collision with root package name */
    public final List<l4.d<R>> f7084n;

    /* renamed from: o  reason: collision with root package name */
    public final e<? super R> f7085o;

    /* renamed from: p  reason: collision with root package name */
    public final Executor f7086p;

    /* renamed from: q  reason: collision with root package name */
    public l<R> f7087q;

    /* renamed from: r  reason: collision with root package name */
    public e.d f7088r;

    /* renamed from: s  reason: collision with root package name */
    public volatile com.bumptech.glide.load.engine.e f7089s;

    /* renamed from: t  reason: collision with root package name */
    public Status f7090t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f7091u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f7092v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f7093w;

    /* renamed from: x  reason: collision with root package name */
    public int f7094x;

    /* renamed from: y  reason: collision with root package name */
    public int f7095y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7096z;

    /* loaded from: classes.dex */
    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, l4.a aVar, int i10, int i11, Priority priority, g gVar, c cVar, ArrayList arrayList, a aVar2, com.bumptech.glide.load.engine.e eVar, n4.e eVar2, Executor executor) {
        if (B) {
            String.valueOf(hashCode());
        }
        this.f7072a = new d.a();
        this.f7073b = obj;
        this.f7075e = context;
        this.f7076f = dVar;
        this.f7077g = obj2;
        this.f7078h = cls;
        this.f7079i = aVar;
        this.f7080j = i10;
        this.f7081k = i11;
        this.f7082l = priority;
        this.f7083m = gVar;
        this.c = cVar;
        this.f7084n = arrayList;
        this.f7074d = aVar2;
        this.f7089s = eVar;
        this.f7085o = eVar2;
        this.f7086p = executor;
        this.f7090t = Status.PENDING;
        if (this.A == null && dVar.f6847h) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // l4.b
    public final boolean a() {
        boolean z10;
        synchronized (this.f7073b) {
            if (this.f7090t == Status.COMPLETE) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // m4.f
    public final void b(int i10, int i11) {
        Object obj;
        int round;
        int i12 = i10;
        this.f7072a.a();
        Object obj2 = this.f7073b;
        synchronized (obj2) {
            try {
                boolean z10 = B;
                if (z10) {
                    int i13 = p4.f.f23697a;
                    SystemClock.elapsedRealtimeNanos();
                }
                if (this.f7090t == Status.WAITING_FOR_SIZE) {
                    Status status = Status.RUNNING;
                    this.f7090t = status;
                    float f10 = this.f7079i.f20480b;
                    if (i12 != Integer.MIN_VALUE) {
                        i12 = Math.round(i12 * f10);
                    }
                    this.f7094x = i12;
                    if (i11 == Integer.MIN_VALUE) {
                        round = i11;
                    } else {
                        round = Math.round(f10 * i11);
                    }
                    this.f7095y = round;
                    if (z10) {
                        int i14 = p4.f.f23697a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    com.bumptech.glide.load.engine.e eVar = this.f7089s;
                    com.bumptech.glide.d dVar = this.f7076f;
                    Object obj3 = this.f7077g;
                    l4.a<?> aVar = this.f7079i;
                    try {
                        obj = obj2;
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                    try {
                        this.f7088r = eVar.b(dVar, obj3, aVar.f20489l, this.f7094x, this.f7095y, aVar.f20496s, this.f7078h, this.f7082l, aVar.c, aVar.f20495r, aVar.f20490m, aVar.f20502y, aVar.f20494q, aVar.f20486i, aVar.f20500w, aVar.f20503z, aVar.f20501x, this, this.f7086p);
                        if (this.f7090t != status) {
                            this.f7088r = null;
                        }
                        if (z10) {
                            int i15 = p4.f.f23697a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    @Override // l4.b
    public final boolean c(b bVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        l4.a<?> aVar;
        Priority priority;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        l4.a<?> aVar2;
        Priority priority2;
        int i15;
        boolean equals;
        if (!(bVar instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f7073b) {
            i10 = this.f7080j;
            i11 = this.f7081k;
            obj = this.f7077g;
            cls = this.f7078h;
            aVar = this.f7079i;
            priority = this.f7082l;
            List<l4.d<R>> list = this.f7084n;
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
        }
        SingleRequest singleRequest = (SingleRequest) bVar;
        synchronized (singleRequest.f7073b) {
            i13 = singleRequest.f7080j;
            i14 = singleRequest.f7081k;
            obj2 = singleRequest.f7077g;
            cls2 = singleRequest.f7078h;
            aVar2 = singleRequest.f7079i;
            priority2 = singleRequest.f7082l;
            List<l4.d<R>> list2 = singleRequest.f7084n;
            if (list2 != null) {
                i15 = list2.size();
            } else {
                i15 = 0;
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = j.f23703a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else if (obj instanceof z3.l) {
                equals = ((z3.l) obj).a();
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2) && aVar.equals(aVar2) && priority == priority2 && i12 == i15) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[Catch: all -> 0x004f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0012, B:10:0x0014, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:22:0x0030, B:23:0x0039, B:24:0x003b, B:28:0x0047, B:29:0x004e), top: B:33:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // l4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7073b
            monitor-enter(r0)
            boolean r1 = r5.f7096z     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L47
            q4.d$a r1 = r5.f7072a     // Catch: java.lang.Throwable -> L4f
            r1.a()     // Catch: java.lang.Throwable -> L4f
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f7090t     // Catch: java.lang.Throwable -> L4f
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch: java.lang.Throwable -> L4f
            if (r1 != r2) goto L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return
        L14:
            r5.d()     // Catch: java.lang.Throwable -> L4f
            v3.l<R> r1 = r5.f7087q     // Catch: java.lang.Throwable -> L4f
            r3 = 0
            if (r1 == 0) goto L1f
            r5.f7087q = r3     // Catch: java.lang.Throwable -> L4f
            goto L20
        L1f:
            r1 = r3
        L20:
            com.bumptech.glide.request.RequestCoordinator r3 = r5.f7074d     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L2d
            boolean r3 = r3.i(r5)     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L2b
            goto L2d
        L2b:
            r3 = 0
            goto L2e
        L2d:
            r3 = 1
        L2e:
            if (r3 == 0) goto L39
            m4.g<R> r3 = r5.f7083m     // Catch: java.lang.Throwable -> L4f
            android.graphics.drawable.Drawable r4 = r5.e()     // Catch: java.lang.Throwable -> L4f
            r3.i(r4)     // Catch: java.lang.Throwable -> L4f
        L39:
            r5.f7090t = r2     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L46
            com.bumptech.glide.load.engine.e r0 = r5.f7089s
            r0.getClass()
            com.bumptech.glide.load.engine.e.f(r1)
        L46:
            return
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            throw r1     // Catch: java.lang.Throwable -> L4f
        L4f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.clear():void");
    }

    public final void d() {
        if (!this.f7096z) {
            this.f7072a.a();
            this.f7083m.d(this);
            e.d dVar = this.f7088r;
            if (dVar != null) {
                synchronized (com.bumptech.glide.load.engine.e.this) {
                    dVar.f6981a.j(dVar.f6982b);
                }
                this.f7088r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable e() {
        int i10;
        if (this.f7092v == null) {
            l4.a<?> aVar = this.f7079i;
            Drawable drawable = aVar.f20484g;
            this.f7092v = drawable;
            if (drawable == null && (i10 = aVar.f20485h) > 0) {
                this.f7092v = i(i10);
            }
        }
        return this.f7092v;
    }

    public final boolean f() {
        RequestCoordinator requestCoordinator = this.f7074d;
        if (requestCoordinator != null && requestCoordinator.b().a()) {
            return false;
        }
        return true;
    }

    @Override // l4.b
    public final boolean g() {
        boolean z10;
        synchronized (this.f7073b) {
            if (this.f7090t == Status.CLEARED) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[Catch: all -> 0x00b6, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x001f, B:11:0x0027, B:13:0x002b, B:15:0x0033, B:17:0x0037, B:18:0x003d, B:22:0x0044, B:23:0x004e, B:25:0x0050, B:27:0x0056, B:29:0x005a, B:30:0x0061, B:32:0x0063, B:34:0x0071, B:36:0x007e, B:48:0x009d, B:50:0x00a1, B:51:0x00a4, B:39:0x0084, B:41:0x0088, B:47:0x0094, B:35:0x0079, B:53:0x00a6, B:54:0x00ad, B:55:0x00ae, B:56:0x00b5), top: B:60:0x0003 }] */
    @Override // l4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7073b
            monitor-enter(r0)
            boolean r1 = r5.f7096z     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto Lae
            q4.d$a r1 = r5.f7072a     // Catch: java.lang.Throwable -> Lb6
            r1.a()     // Catch: java.lang.Throwable -> Lb6
            int r1 = p4.f.f23697a     // Catch: java.lang.Throwable -> Lb6
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r1 = r5.f7077g     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L50
            int r1 = r5.f7080j     // Catch: java.lang.Throwable -> Lb6
            int r2 = r5.f7081k     // Catch: java.lang.Throwable -> Lb6
            boolean r1 = p4.j.g(r1, r2)     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L27
            int r1 = r5.f7080j     // Catch: java.lang.Throwable -> Lb6
            r5.f7094x = r1     // Catch: java.lang.Throwable -> Lb6
            int r1 = r5.f7081k     // Catch: java.lang.Throwable -> Lb6
            r5.f7095y = r1     // Catch: java.lang.Throwable -> Lb6
        L27:
            android.graphics.drawable.Drawable r1 = r5.f7093w     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L3d
            l4.a<?> r1 = r5.f7079i     // Catch: java.lang.Throwable -> Lb6
            android.graphics.drawable.Drawable r2 = r1.f20492o     // Catch: java.lang.Throwable -> Lb6
            r5.f7093w = r2     // Catch: java.lang.Throwable -> Lb6
            if (r2 != 0) goto L3d
            int r1 = r1.f20493p     // Catch: java.lang.Throwable -> Lb6
            if (r1 <= 0) goto L3d
            android.graphics.drawable.Drawable r1 = r5.i(r1)     // Catch: java.lang.Throwable -> Lb6
            r5.f7093w = r1     // Catch: java.lang.Throwable -> Lb6
        L3d:
            android.graphics.drawable.Drawable r1 = r5.f7093w     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L43
            r1 = 5
            goto L44
        L43:
            r1 = 3
        L44:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb6
            r5.k(r2, r1)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        L50:
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f7090t     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch: java.lang.Throwable -> Lb6
            if (r1 == r2) goto La6
            com.bumptech.glide.request.SingleRequest$Status r3 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Lb6
            if (r1 != r3) goto L63
            v3.l<R> r1 = r5.f7087q     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch: java.lang.Throwable -> Lb6
            r5.l(r2, r1)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        L63:
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> Lb6
            r5.f7090t = r1     // Catch: java.lang.Throwable -> Lb6
            int r3 = r5.f7080j     // Catch: java.lang.Throwable -> Lb6
            int r4 = r5.f7081k     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = p4.j.g(r3, r4)     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L79
            int r3 = r5.f7080j     // Catch: java.lang.Throwable -> Lb6
            int r4 = r5.f7081k     // Catch: java.lang.Throwable -> Lb6
            r5.b(r3, r4)     // Catch: java.lang.Throwable -> Lb6
            goto L7e
        L79:
            m4.g<R> r3 = r5.f7083m     // Catch: java.lang.Throwable -> Lb6
            r3.j(r5)     // Catch: java.lang.Throwable -> Lb6
        L7e:
            com.bumptech.glide.request.SingleRequest$Status r3 = r5.f7090t     // Catch: java.lang.Throwable -> Lb6
            if (r3 == r2) goto L84
            if (r3 != r1) goto L9d
        L84:
            com.bumptech.glide.request.RequestCoordinator r1 = r5.f7074d     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L91
            boolean r1 = r1.e(r5)     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L8f
            goto L91
        L8f:
            r1 = 0
            goto L92
        L91:
            r1 = 1
        L92:
            if (r1 == 0) goto L9d
            m4.g<R> r1 = r5.f7083m     // Catch: java.lang.Throwable -> Lb6
            android.graphics.drawable.Drawable r2 = r5.e()     // Catch: java.lang.Throwable -> Lb6
            r1.g(r2)     // Catch: java.lang.Throwable -> Lb6
        L9d:
            boolean r1 = com.bumptech.glide.request.SingleRequest.B     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto La4
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lb6
        La4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        La6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb6
            throw r1     // Catch: java.lang.Throwable -> Lb6
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb6
            throw r1     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.h():void");
    }

    public final Drawable i(int i10) {
        Resources.Theme theme = this.f7079i.f20498u;
        if (theme == null) {
            theme = this.f7075e.getTheme();
        }
        com.bumptech.glide.d dVar = this.f7076f;
        return e4.a.a(dVar, dVar, i10, theme);
    }

    @Override // l4.b
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f7073b) {
            Status status = this.f7090t;
            if (status != Status.RUNNING && status != Status.WAITING_FOR_SIZE) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // l4.b
    public final boolean j() {
        boolean z10;
        synchronized (this.f7073b) {
            if (this.f7090t == Status.COMPLETE) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void k(GlideException glideException, int i10) {
        int i11;
        int i12;
        this.f7072a.a();
        synchronized (this.f7073b) {
            glideException.setOrigin(this.A);
            int i13 = this.f7076f.f6848i;
            if (i13 <= i10) {
                Objects.toString(this.f7077g);
                if (i13 <= 4) {
                    glideException.logRootCauses("Glide");
                }
            }
            Drawable drawable = null;
            this.f7088r = null;
            this.f7090t = Status.FAILED;
            boolean z10 = true;
            this.f7096z = true;
            List<l4.d<R>> list = this.f7084n;
            if (list != null) {
                for (l4.d<R> dVar : list) {
                    f();
                    dVar.a(glideException);
                }
            }
            l4.d<R> dVar2 = this.c;
            if (dVar2 != null) {
                f();
                dVar2.a(glideException);
            }
            RequestCoordinator requestCoordinator = this.f7074d;
            if (requestCoordinator != null && !requestCoordinator.e(this)) {
                z10 = false;
            }
            if (this.f7077g == null) {
                if (this.f7093w == null) {
                    l4.a<?> aVar = this.f7079i;
                    Drawable drawable2 = aVar.f20492o;
                    this.f7093w = drawable2;
                    if (drawable2 == null && (i12 = aVar.f20493p) > 0) {
                        this.f7093w = i(i12);
                    }
                }
                drawable = this.f7093w;
            }
            if (drawable == null) {
                if (this.f7091u == null) {
                    l4.a<?> aVar2 = this.f7079i;
                    Drawable drawable3 = aVar2.f20482e;
                    this.f7091u = drawable3;
                    if (drawable3 == null && (i11 = aVar2.f20483f) > 0) {
                        this.f7091u = i(i11);
                    }
                }
                drawable = this.f7091u;
            }
            if (drawable == null) {
                drawable = e();
            }
            this.f7083m.f(drawable);
            this.f7096z = false;
            RequestCoordinator requestCoordinator2 = this.f7074d;
            if (requestCoordinator2 != null) {
                requestCoordinator2.d(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(DataSource dataSource, l lVar) {
        SingleRequest singleRequest;
        Object obj;
        String str;
        boolean z10;
        this.f7072a.a();
        l lVar2 = null;
        try {
            synchronized (this.f7073b) {
                try {
                    this.f7088r = null;
                    if (lVar == null) {
                        k(new GlideException("Expected to receive a Resource<R> with an object of " + this.f7078h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = lVar.get();
                    try {
                        if (obj2 != null && this.f7078h.isAssignableFrom(obj2.getClass())) {
                            RequestCoordinator requestCoordinator = this.f7074d;
                            if (requestCoordinator != null && !requestCoordinator.f(this)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                this.f7087q = null;
                                this.f7090t = Status.COMPLETE;
                                this.f7089s.getClass();
                                com.bumptech.glide.load.engine.e.f(lVar);
                            }
                            m(lVar, obj2, dataSource);
                            return;
                        }
                        this.f7087q = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f7078h);
                        sb2.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb2.append(obj);
                        sb2.append("{");
                        sb2.append(obj2);
                        sb2.append("} inside Resource{");
                        sb2.append(lVar);
                        sb2.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb2.append(str);
                        k(new GlideException(sb2.toString()), 5);
                        this.f7089s.getClass();
                        com.bumptech.glide.load.engine.e.f(lVar);
                    } catch (Throwable th2) {
                        th = th2;
                        singleRequest = this;
                        while (true) {
                            try {
                                try {
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                    lVar2 = lVar;
                                    if (lVar2 != null) {
                                        singleRequest.f7089s.getClass();
                                        com.bumptech.glide.load.engine.e.f(lVar2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    singleRequest = this;
                    lVar = null;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            singleRequest = this;
        }
    }

    public final void m(l<R> lVar, R r4, DataSource dataSource) {
        f();
        this.f7090t = Status.COMPLETE;
        this.f7087q = lVar;
        if (this.f7076f.f6848i <= 3) {
            Objects.toString(dataSource);
            Objects.toString(this.f7077g);
            int i10 = p4.f.f23697a;
            SystemClock.elapsedRealtimeNanos();
        }
        this.f7096z = true;
        try {
            List<l4.d<R>> list = this.f7084n;
            if (list != null) {
                for (l4.d<R> dVar : list) {
                    dVar.b(r4, dataSource);
                }
            }
            l4.d<R> dVar2 = this.c;
            if (dVar2 != null) {
                dVar2.b(r4, dataSource);
            }
            this.f7083m.c(r4, this.f7085o.a(dataSource));
            this.f7096z = false;
            RequestCoordinator requestCoordinator = this.f7074d;
            if (requestCoordinator != null) {
                requestCoordinator.k(this);
            }
        } catch (Throwable th2) {
            this.f7096z = false;
            throw th2;
        }
    }

    @Override // l4.b
    public final void pause() {
        synchronized (this.f7073b) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
