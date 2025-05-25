package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f14033a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f14034b;
    private final ArrayDeque<b> c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f14035d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f14033a = linkedBlockingQueue;
        this.f14034b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.c.poll();
        this.f14035d = poll;
        if (poll != null) {
            poll.a(this.f14034b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.c.add(bVar);
        if (this.f14035d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.a
    public void a(b bVar) {
        this.f14035d = null;
        a();
    }
}
