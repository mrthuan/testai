package fj;

import java.util.HashMap;
import zh.h;
import zh.i;
import zh.j;

/* compiled from: TableElement.java */
/* loaded from: classes3.dex */
public final class d extends j {

    /* renamed from: f  reason: collision with root package name */
    public final zh.e f17301f = new zh.e(10);

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f17302g = new HashMap();

    @Override // zh.j, zh.a, zh.h
    public final void dispose() {
        super.dispose();
        HashMap hashMap = this.f17302g;
        if (hashMap != null) {
            hashMap.clear();
        }
        zh.e eVar = this.f17301f;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // zh.j
    public final h f(int i10) {
        return this.f17301f.d(i10);
    }

    @Override // zh.j
    public final h g(long j10) {
        return null;
    }

    @Override // zh.j, zh.a, zh.h
    public final String getText() {
        return "";
    }

    @Override // zh.a, zh.h
    public final short getType() {
        return (short) 2;
    }

    @Override // zh.j
    public final void e(i iVar) {
    }
}
