package com.bykv.vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.d.b.b.f;
import com.bykv.vk.openvk.preload.geckox.d.d;
import com.bykv.vk.openvk.preload.geckox.d.e;
import com.bykv.vk.openvk.preload.geckox.d.g;
import com.bykv.vk.openvk.preload.geckox.d.h;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: GeckoClient.java */
/* loaded from: classes.dex */
public final class a {
    b c;

    /* renamed from: d  reason: collision with root package name */
    File f7483d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f7484e = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    com.bykv.vk.openvk.preload.geckox.e.b f7481a = new com.bykv.vk.openvk.preload.geckox.e.b();

    /* renamed from: b  reason: collision with root package name */
    Queue<String> f7482b = new LinkedBlockingQueue();

    public a(b bVar) {
        this.c = bVar;
        File file = bVar.f7521n;
        this.f7483d = file;
        file.mkdirs();
        b bVar2 = this.c;
        a(e.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2));
        a(d.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2));
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class, com.bykv.vk.openvk.preload.geckox.statistic.b.b(bVar2.f7509a));
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7634i = false;
                a10.f7637l = SystemClock.uptimeMillis();
                a10.f7644s = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel()).f7634i = true;
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7635j = false;
                a10.f7638m = SystemClock.uptimeMillis();
                a10.f7645t = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7635j = true;
                a10.f7638m = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7635j = false;
                a10.f7639n = SystemClock.uptimeMillis();
                a10.f7645t = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7635j = true;
                a10.f7639n = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.11
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7636k = false;
                a10.f7646u = th2.getMessage();
                a10.f7640o = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7636k = true;
                a10.f7640o = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2.f7509a));
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a10.C = false;
                a10.f7651z = SystemClock.uptimeMillis();
                a10.E = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a10.C = true;
                a10.f7651z = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.10
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a10.D = false;
                a10.A = SystemClock.uptimeMillis();
                a10.F = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a10.D = true;
                a10.A = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class, com.bykv.vk.openvk.preload.geckox.statistic.b.b(bVar2.f7509a));
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7634i = false;
                a10.f7637l = SystemClock.uptimeMillis();
                a10.f7644s = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel()).f7634i = true;
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7635j = false;
                a10.f7638m = SystemClock.uptimeMillis();
                a10.f7645t = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7635j = true;
                a10.f7638m = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7635j = false;
                a10.f7639n = SystemClock.uptimeMillis();
                a10.f7645t = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7635j = true;
                a10.f7639n = SystemClock.uptimeMillis();
            }
        });
        a(f.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.3
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7636k = false;
                a10.f7640o = SystemClock.uptimeMillis();
                a10.f7646u = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7636k = true;
                a10.f7640o = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.b(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a10.f7636k = false;
                a10.f7640o = SystemClock.uptimeMillis();
                a10.F = th2.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2.f7509a));
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a10.C = false;
                a10.f7651z = SystemClock.uptimeMillis();
                a10.E = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a10.C = true;
                a10.f7651z = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.2
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a10.D = false;
                a10.A = SystemClock.uptimeMillis();
                a10.F = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.b(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a10.D = false;
                a10.A = SystemClock.uptimeMillis();
                a10.F = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a10 = a.a(dVar.f7457f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a10.D = true;
                a10.A = SystemClock.uptimeMillis();
            }
        });
    }

    public final boolean a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map.isEmpty()) {
            return true;
        }
        List<String> list = this.c.f7512e;
        for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
            boolean z10 = false;
            for (String str : list) {
                if (TextUtils.equals(str, entry.getKey())) {
                    z10 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final boolean a() {
        b bVar = this.c;
        List<String> list = bVar.f7513f;
        List<String> list2 = bVar.f7512e;
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            boolean z10 = false;
            for (String str2 : list) {
                if (TextUtils.equals(str, str2)) {
                    z10 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    private void a(Class<? extends com.bykv.vk.openvk.preload.b.d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        this.f7481a.a(cls, aVar);
    }
}
