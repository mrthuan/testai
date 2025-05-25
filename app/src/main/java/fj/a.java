package fj;

import java.util.Iterator;
import zh.e;
import zh.h;

/* compiled from: CellElement.java */
/* loaded from: classes3.dex */
public final class a extends zh.a implements Iterable<h> {

    /* renamed from: e  reason: collision with root package name */
    public final zh.e f17297e = new zh.e(10);

    @Override // zh.a, zh.h
    public final short getType() {
        return (short) 4;
    }

    @Override // java.lang.Iterable
    public final Iterator<h> iterator() {
        zh.e eVar = this.f17297e;
        return new e.a(eVar.f32385b, eVar.f32384a);
    }
}
