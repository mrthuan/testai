package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.ndk.g;
import java.io.File;
import oa.b0;

/* compiled from: SessionFilesProvider.java */
/* loaded from: classes2.dex */
public final class h implements ja.e {

    /* renamed from: a  reason: collision with root package name */
    public final g f13570a;

    public h(g gVar) {
        this.f13570a = gVar;
    }

    @Override // ja.e
    public final File a() {
        return this.f13570a.f13560d;
    }

    @Override // ja.e
    public final File b() {
        return this.f13570a.f13562f;
    }

    @Override // ja.e
    public final File c() {
        return this.f13570a.f13561e;
    }

    @Override // ja.e
    public final b0.a d() {
        g.b bVar = this.f13570a.f13558a;
        if (bVar != null) {
            return bVar.f13569b;
        }
        return null;
    }

    @Override // ja.e
    public final File e() {
        return this.f13570a.f13558a.f13568a;
    }

    @Override // ja.e
    public final File f() {
        return this.f13570a.c;
    }

    @Override // ja.e
    public final File g() {
        return this.f13570a.f13559b;
    }
}
