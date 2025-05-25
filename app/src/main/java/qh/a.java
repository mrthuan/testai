package qh;

import qh.d;

/* compiled from: Animation.java */
/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final e f29336a;

    /* renamed from: b  reason: collision with root package name */
    public float f29337b;
    public final int c = 15;

    /* renamed from: d  reason: collision with root package name */
    public final int f29338d = 66;

    /* renamed from: e  reason: collision with root package name */
    public byte f29339e = 0;

    /* renamed from: f  reason: collision with root package name */
    public d.a f29340f;

    /* renamed from: g  reason: collision with root package name */
    public d.a f29341g;

    /* renamed from: h  reason: collision with root package name */
    public d.a f29342h;

    public a(e eVar, int i10) {
        this.f29336a = eVar;
        this.f29337b = i10;
    }

    @Override // qh.d
    public final int a() {
        return this.c;
    }

    @Override // qh.d
    public final byte b() {
        return this.f29339e;
    }

    @Override // qh.d
    public final e d() {
        return this.f29336a;
    }

    @Override // qh.d
    public final void dispose() {
        d.a aVar = this.f29340f;
        if (aVar != null) {
            aVar.getClass();
        }
        d.a aVar2 = this.f29341g;
        if (aVar2 != null) {
            aVar2.getClass();
        }
        d.a aVar3 = this.f29342h;
        if (aVar3 != null) {
            aVar3.getClass();
        }
    }

    @Override // qh.d
    public final d.a e() {
        return this.f29342h;
    }

    @Override // qh.d
    public final int getDuration() {
        return (int) this.f29337b;
    }
}
