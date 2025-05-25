package tg;

import android.graphics.Path;
import lib.zj.office.PathHolder;

/* compiled from: ExtendPath.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Path f30010a;

    /* renamed from: b  reason: collision with root package name */
    public eh.b f30011b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public gh.b f30012d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30013e;

    public b() {
        this.f30010a = new PathHolder();
        this.f30011b = null;
    }

    public final synchronized Path a() {
        return this.f30010a;
    }

    public final void b(gh.b bVar) {
        this.f30012d = bVar;
        if (bVar != null) {
            this.c = true;
        } else {
            this.c = false;
        }
    }

    public final synchronized void c(Path path) {
        boolean z10 = path instanceof PathHolder;
        this.f30010a = path;
    }

    public b(b bVar) {
        if (bVar != null) {
            this.f30010a = new PathHolder(bVar.a());
            this.f30011b = bVar.f30011b;
            this.c = bVar.c;
            this.f30012d = bVar.f30012d;
            this.f30013e = bVar.f30013e;
        }
    }
}
