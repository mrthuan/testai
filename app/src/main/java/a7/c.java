package a7;

import b7.i;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import s6.g;
import v6.h;
import v6.j;
import v6.w;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f91f = Logger.getLogger(w.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final i f92a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f93b;
    public final w6.d c;

    /* renamed from: d  reason: collision with root package name */
    public final c7.d f94d;

    /* renamed from: e  reason: collision with root package name */
    public final d7.a f95e;

    public c(Executor executor, w6.d dVar, i iVar, c7.d dVar2, d7.a aVar) {
        this.f93b = executor;
        this.c = dVar;
        this.f92a = iVar;
        this.f94d = dVar2;
        this.f95e = aVar;
    }

    @Override // a7.e
    public final void a(g gVar, h hVar, j jVar) {
        this.f93b.execute(new a(0, this, jVar, gVar, hVar));
    }
}
