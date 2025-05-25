package lh;

import lib.zj.office.java.awt.Rectangle;

/* compiled from: AbstractShape.java */
/* loaded from: classes.dex */
public class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public g f20601a;

    /* renamed from: b  reason: collision with root package name */
    public int f20602b = -1;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public eh.b f20603d;

    /* renamed from: e  reason: collision with root package name */
    public Rectangle f20604e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f20605f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f20606g;

    /* renamed from: h  reason: collision with root package name */
    public float f20607h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f20608i;

    /* renamed from: j  reason: collision with root package name */
    public qh.d f20609j;

    /* renamed from: k  reason: collision with root package name */
    public gh.b f20610k;

    /* renamed from: l  reason: collision with root package name */
    public int f20611l;

    @Override // lh.g
    public final boolean a() {
        return this.f20608i;
    }

    @Override // lh.g
    public final void b(Rectangle rectangle) {
        this.f20604e = rectangle;
    }

    @Override // lh.g
    public final boolean c() {
        return this.f20605f;
    }

    @Override // lh.g
    public final boolean d() {
        return this.f20606g;
    }

    @Override // lh.g
    public void dispose() {
        eh.a aVar;
        g gVar = this.f20601a;
        if (gVar != null) {
            gVar.dispose();
        }
        qh.d dVar = this.f20609j;
        if (dVar != null) {
            dVar.dispose();
        }
        eh.b bVar = this.f20603d;
        if (bVar != null && (aVar = bVar.f16573f) != null) {
            aVar.b();
        }
    }

    @Override // lh.g
    public final int e() {
        return this.c;
    }

    @Override // lh.g
    public final int f() {
        return this.f20602b;
    }

    @Override // lh.g
    public final int g() {
        return this.f20611l;
    }

    @Override // lh.g
    public Rectangle getBounds() {
        return this.f20604e;
    }

    @Override // lh.g
    public final float getRotation() {
        return this.f20607h;
    }

    @Override // lh.g
    public short getType() {
        return (short) -1;
    }

    @Override // lh.g
    public final void h() {
        this.f20605f = true;
    }

    @Override // lh.g
    public final void i(int i10) {
        this.f20602b = i10;
    }

    @Override // lh.g
    public final void j(float f10) {
        this.f20607h = f10;
    }

    @Override // lh.g
    public final void k() {
        this.f20606g = true;
    }

    @Override // lh.g
    public final void l(int i10) {
        this.c = i10;
    }

    @Override // lh.g
    public final void m(qh.a aVar) {
        this.f20609j = aVar;
    }

    @Override // lh.g
    public final void n(k kVar) {
        this.f20601a = kVar;
    }

    @Override // lh.g
    public final qh.d o() {
        return this.f20609j;
    }

    public final boolean p() {
        if (this.f20610k != null) {
            return true;
        }
        return false;
    }
}
