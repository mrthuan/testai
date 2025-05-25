package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f13922a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f13923b;
    private final ArrayDeque<b> c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f13924d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f13922a = linkedBlockingQueue;
        this.f13923b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.c.poll();
        this.f13924d = poll;
        if (poll != null) {
            poll.a(this.f13923b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.c.add(bVar);
        if (this.f13924d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.a
    public void a(b bVar) {
        this.f13924d = null;
        a();
    }
}
