package gj;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.Hashtable;
import lh.t;
import lib.zj.office.java.awt.Rectangle;
import sg.e;

/* compiled from: ShapeView.java */
/* loaded from: classes3.dex */
public final class n extends f {
    public final Hashtable A;

    /* renamed from: x  reason: collision with root package name */
    public ai.f f17863x;

    /* renamed from: y  reason: collision with root package name */
    public final lh.p f17864y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f17865z;

    public n() {
    }

    @Override // gj.f, ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        rectangle.f20688x += this.f480b;
        rectangle.f20689y += this.c;
        return rectangle;
    }

    @Override // gj.f, ai.a, ai.e
    public final long C(int i10, int i11, boolean z10) {
        return this.f487j;
    }

    @Override // gj.f
    public final int G(ai.c cVar, ai.f fVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        short s4;
        this.f17863x = fVar;
        byte b10 = cVar.f508a;
        lh.p pVar = this.f17864y;
        if (b10 != 1 && ((s4 = pVar.A) == 3 || s4 == 6)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f17865z = z10;
        pVar.getClass();
        boolean z13 = pVar instanceof t;
        if (z13) {
            this.f17865z = false;
        } else {
            long j10 = (this.f487j + 1) & (-1152921504606846976L);
            if (j10 == 1152921504606846976L || j10 == 2305843009213693952L) {
                if (pVar.A != 6) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f17865z = z11;
            }
        }
        Rectangle bounds = pVar.getBounds();
        Rect e10 = e.a.f29807a.e("ShapeView");
        if (this.f17865z) {
            i12 = bounds.width;
            int i13 = bounds.height;
            this.f481d = i12;
            this.f482e = i13;
        } else {
            if (z13) {
                t tVar = (t) pVar;
                Paint paint = new Paint();
                this.f17829r = paint;
                paint.setAntiAlias(true);
                sg.d.b(this.f17829r);
                String str = tVar.F;
                if (str != null && str.length() > 0) {
                    int length = str.length();
                    int i14 = (fVar.f509a - fVar.f512e) - fVar.f513f;
                    if (tVar.G) {
                        int i15 = i14 / length;
                        this.f17829r.setTextSize(i15);
                        this.f17829r.getTextBounds(str, 0, length, e10);
                        if (e10.width() < i14) {
                            int i16 = i15;
                            while (e10.width() < i14) {
                                int i17 = i16 + 1;
                                this.f17829r.setTextSize(i17);
                                this.f17829r.getTextBounds(str, 0, length, e10);
                                int i18 = i16;
                                i16 = i17;
                                i15 = i18;
                            }
                        } else if (e10.width() > i14) {
                            int i19 = i15;
                            while (e10.width() > i14) {
                                int i20 = i19 - 1;
                                this.f17829r.setTextSize(i20);
                                this.f17829r.getTextBounds(str, 0, length, e10);
                                int i21 = i19;
                                i19 = i20;
                                i15 = i21;
                            }
                        }
                        tVar.H = i15;
                        this.f17829r.setTextSize(i15);
                    } else {
                        this.f17829r.setTextSize(tVar.H);
                    }
                    this.f17829r.setColor(tVar.I);
                    this.f17829r.setAlpha(Math.round(tVar.M * 255.0f));
                    this.f17829r.getTextBounds(str, 0, length, e10);
                    this.f480b = (fVar.f509a - e10.width()) / 2;
                    this.c = (fVar.f510b - e10.height()) / 2;
                }
            } else {
                ge.a.M(this, pVar, fVar);
            }
            i12 = 0;
        }
        this.f488k = this.f487j + 1;
        if (((i11 >>> 0) & 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && i12 > i10) {
            return 1;
        }
        O(pVar, pVar.D);
        return 0;
    }

    @Override // gj.f
    public final int H() {
        if (this.f17865z) {
            return (int) this.f17864y.getBounds().getHeight();
        }
        return 0;
    }

    @Override // gj.f
    public final float K() {
        if (this.f17865z) {
            return this.f17864y.getBounds().width;
        }
        return 0.0f;
    }

    public final void M(Canvas canvas, int i10, int i11, float f10) {
        int i12;
        s sVar;
        lh.p pVar = this.f17864y;
        try {
            int i13 = ((int) (this.f480b * f10)) + i10;
            int i14 = ((int) (this.c * f10)) + i11;
            Rectangle bounds = pVar.getBounds();
            Rect e10 = e.a.f29807a.e("ShapeView");
            if (pVar instanceof t) {
                String str = ((t) pVar).F;
                if (str != null && str.length() > 0) {
                    canvas.save();
                    float textSize = this.f17829r.getTextSize();
                    this.f17829r.setTextSize(((t) pVar).H * f10);
                    float f11 = pVar.f20607h;
                    ai.f fVar = this.f17863x;
                    int i15 = fVar.f509a;
                    int i16 = fVar.f512e;
                    int i17 = (i15 - i16) - fVar.f513f;
                    int i18 = fVar.f510b;
                    int i19 = fVar.c;
                    canvas.translate((((i17 / 2.0f) + i16) * f10) + i10, (((((i18 - i19) - fVar.f511d) / 2.0f) + i19) * f10) + i11);
                    canvas.rotate(f11, 0.0f, 0.0f);
                    canvas.drawText(str, ((-e10.width()) * f10) / 2.0f, 0.0f, this.f17829r);
                    this.f17829r.setTextSize(textSize);
                    canvas.restore();
                    return;
                }
            } else {
                e10.set(i13, i14, (int) ((bounds.width * f10) + i13), (int) ((bounds.height * f10) + i14));
                if (pVar.D != null) {
                    tg.a.a(canvas, getControl(), J(), this.f17864y, e10, f10);
                    N(canvas, pVar.D, e10, f10);
                } else if (pVar.getType() == 2) {
                    tg.a.a(canvas, getControl(), J(), this.f17864y, e10, f10);
                } else if (pVar.getType() == 5) {
                    ui.a aVar = ((lh.q) pVar).E;
                    aVar.l(f10);
                    aVar.a(canvas, getControl(), e10.left, e10.top, e10.width(), e10.height(), sg.d.f29801b.a());
                }
            }
            Hashtable hashtable = this.A;
            if (hashtable.size() > 0 && (i12 = pVar.B) >= 0 && (sVar = (s) hashtable.get(Integer.valueOf(i12))) != null) {
                canvas.save();
                canvas.rotate(pVar.f20607h, e10.exactCenterX(), e10.exactCenterY());
                sVar.g(canvas, i13, i14, f10);
                canvas.restore();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void N(Canvas canvas, lh.f fVar, Rect rect, float f10) {
        lh.g[] r4;
        int i10;
        int i11;
        Rect rect2;
        Rect rect3;
        s sVar;
        if (fVar != null && (r4 = fVar.r()) != null) {
            Rect rect4 = new Rect();
            int length = r4.length;
            int i12 = 0;
            while (i12 < length) {
                lh.g gVar = r4[i12];
                if (gVar.getType() == 7) {
                    N(canvas, (lh.f) gVar, rect, f10);
                    i10 = i12;
                    i11 = length;
                    rect3 = rect4;
                } else {
                    if (gVar.getType() == 0) {
                        rect4.setEmpty();
                        Rectangle bounds = gVar.getBounds();
                        int i13 = rect.left + ((int) (bounds.f20688x * f10));
                        rect4.left = i13;
                        int i14 = rect.top + ((int) (bounds.f20689y * f10));
                        rect4.top = i14;
                        rect4.right = (int) ((bounds.width * f10) + i13);
                        rect4.bottom = (int) ((bounds.height * f10) + i14);
                        if (gVar instanceof lh.s) {
                            gVar = ((lh.s) gVar).E;
                        }
                        lh.i iVar = (lh.i) gVar;
                        sg.a.d(canvas, getControl(), J(), iVar, rect, f10);
                        jh.a q5 = iVar.q(getControl());
                        q5.f19232d = gVar.getRotation();
                        i10 = i12;
                        i11 = length;
                        rect2 = rect4;
                        jh.c.f19238d.f(canvas, getControl(), J(), q5, rect4.left, rect4.top, f10, gVar.getBounds().width * f10, gVar.getBounds().height * f10, ((lh.i) gVar).f20625o);
                    } else {
                        i10 = i12;
                        i11 = length;
                        rect2 = rect4;
                        if (gVar.getType() == 2) {
                            rect2.setEmpty();
                            Rectangle bounds2 = gVar.getBounds();
                            int i15 = rect.left + ((int) (bounds2.f20688x * f10));
                            rect3 = rect2;
                            rect3.left = i15;
                            int i16 = rect.top + ((int) (bounds2.f20689y * f10));
                            rect3.top = i16;
                            rect3.right = (int) ((bounds2.width * f10) + i15);
                            rect3.bottom = (int) ((bounds2.height * f10) + i16);
                            tg.a.a(canvas, getControl(), J(), (lh.e) gVar, rect3, f10);
                            int i17 = ((lh.p) gVar).B;
                            if (i17 >= 0 && (sVar = (s) this.A.get(Integer.valueOf(i17))) != null) {
                                sVar.g(canvas, rect3.left, rect3.top, f10);
                            }
                        }
                    }
                    rect3 = rect2;
                }
                i12 = i10 + 1;
                rect4 = rect3;
                length = i11;
            }
        }
    }

    public final void O(lh.p pVar, lh.r rVar) {
        zh.h hVar;
        int i10;
        boolean z10;
        int i11;
        int i12;
        l lVar;
        ai.g gVar;
        ai.g gVar2;
        int i13;
        ai.f fVar;
        int i14;
        ai.f fVar2;
        int i15;
        int i16;
        long j10;
        int i17;
        l lVar2;
        zh.g gVar3;
        short s4;
        Object obj;
        l lVar3;
        if (rVar != null) {
            lh.g[] r4 = rVar.r();
            if (r4 != null) {
                for (lh.g gVar4 : r4) {
                    if (gVar4.getType() == 7) {
                        O(null, (lh.r) gVar4);
                    } else if (gVar4 instanceof lh.p) {
                        lh.p pVar2 = (lh.p) gVar4;
                        O(pVar2, pVar2.D);
                    }
                }
            }
        } else if (pVar.B >= 0) {
            xh.e n10 = n();
            zh.g document = getDocument();
            int i18 = pVar.B;
            s sVar = new s(n10, document, i18);
            sVar.f17890p = pVar.C;
            zh.e eVar = ((fj.e) document).f17303b[5];
            if (eVar != null) {
                hVar = eVar.d(i18);
            } else {
                hVar = null;
            }
            zh.b bVar = zh.b.f32374b;
            zh.f d10 = hVar.d();
            bVar.getClass();
            ai.f fVar3 = sVar.f17892r;
            zh.b.c(fVar3, d10);
            zh.f d11 = document.i().d();
            int p10 = (int) (((zh.b.p(d11) - zh.b.m(d11)) - zh.b.n(d11)) * 0.06666667f);
            o oVar = s.f17889w;
            oVar.a();
            int i19 = fVar3.f512e;
            int i20 = fVar3.c;
            sVar.f483f = i20;
            sVar.f485h = i19;
            if (sVar.f17890p) {
                i10 = fVar3.f509a;
            } else {
                i10 = p10;
            }
            int max = Math.max(5, (i10 - i19) - fVar3.f513f);
            if (sVar.f17890p && fVar3.f515h != 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i11 = 1;
            } else {
                i11 = -2;
            }
            int i21 = ((i11 >>> 3) | 1) << 3;
            if (z10) {
                i12 = i21 | 1;
            } else {
                i12 = (~i21) & 1;
            }
            int i22 = i12;
            long a10 = hVar.a();
            int i23 = i19;
            long b10 = hVar.b();
            if (document.e(a10) == 0) {
                fVar2 = fVar3;
            } else {
                zh.h g10 = document.g(b10);
                short s10 = 9;
                if (zh.b.u(g10.d(), (short) 4107)) {
                    g10 = ((fj.e) document).n(b10);
                    lVar = (l) com.google.android.play.core.assetpacks.c.t(sVar.getControl(), g10, null, 9);
                } else {
                    lVar = (l) com.google.android.play.core.assetpacks.c.t(sVar.getControl(), g10, null, 5);
                }
                sVar.D(lVar);
                lVar.f487j = b10;
                ai.f fVar4 = fVar3;
                lVar.f488k = g10.a();
                zh.h hVar2 = g10;
                l lVar4 = lVar;
                long j11 = b10;
                int i24 = Integer.MAX_VALUE;
                int i25 = 0;
                int i26 = 0;
                int i27 = i20;
                while (true) {
                    gVar = sVar.f17893s;
                    if (i24 <= 0 || j11 >= a10 || i25 == 1) {
                        break;
                    }
                    int i28 = i23;
                    lVar4.f480b = i28;
                    lVar4.c = i27;
                    if (lVar4.getType() == s10) {
                        j10 = a10;
                        gVar2 = gVar;
                        i16 = i28;
                        i13 = p10;
                        i17 = i27;
                        lVar2 = lVar4;
                        fVar = fVar4;
                        gVar3 = document;
                        i25 = s.f17889w.f(sVar.getControl(), sVar.f17891q, sVar, sVar.f17894t, sVar.f17892r, sVar.f17893s, (p) lVar4, j11, max, i24, i22, false);
                    } else {
                        i16 = i28;
                        j10 = a10;
                        gVar2 = gVar;
                        i13 = p10;
                        i17 = i27;
                        lVar2 = lVar4;
                        gVar3 = document;
                        fVar = fVar4;
                        oVar.a();
                        zh.b bVar2 = zh.b.f32374b;
                        lib.zj.office.system.f control = sVar.getControl();
                        zh.f d12 = hVar2.d();
                        bVar2.getClass();
                        zh.b.d(control, gVar2, d12);
                        i25 = b.b.L(sVar.getControl(), sVar.f17891q, sVar.f17894t, sVar.f17892r, sVar.f17893s, lVar2, j11, max, i24, i22);
                    }
                    l lVar5 = lVar2;
                    int e10 = lVar5.e((byte) 1);
                    i27 = i17 + e10;
                    long j12 = lVar5.f488k;
                    i24 -= e10;
                    i26 += e10;
                    i14 = 0;
                    sVar.f17896v = Math.max(sVar.f17896v, lVar5.e((byte) 0));
                    if (i24 > 0 && j12 < j10) {
                        zh.h g11 = gVar3.g(j12);
                        if (g11 == null) {
                            break;
                        }
                        zh.b bVar3 = zh.b.f32374b;
                        zh.f d13 = g11.d();
                        bVar3.getClass();
                        if (zh.b.u(d13, (short) 4107)) {
                            g11 = ((fj.e) gVar3).n(j12);
                            s4 = 9;
                            obj = null;
                            lVar3 = (l) com.google.android.play.core.assetpacks.c.t(sVar.getControl(), g11, null, 9);
                        } else {
                            s4 = 9;
                            obj = null;
                            lVar3 = (l) com.google.android.play.core.assetpacks.c.t(sVar.getControl(), g11, null, 5);
                        }
                        lVar3.f487j = j12;
                        sVar.D(lVar3);
                        hVar2 = g11;
                    } else {
                        s4 = 9;
                        obj = null;
                        lVar3 = lVar5;
                    }
                    document = gVar3;
                    j11 = j12;
                    a10 = j10;
                    i23 = i16;
                    fVar4 = fVar;
                    lVar4 = lVar3;
                    s10 = s4;
                    p10 = i13;
                }
                gVar2 = gVar;
                i13 = p10;
                fVar = fVar4;
                i14 = 0;
                if (!sVar.f17890p) {
                    int i29 = sVar.f17896v;
                    for (ai.e eVar2 = sVar.f490m; eVar2 != null; eVar2 = eVar2.o()) {
                        zh.b bVar4 = zh.b.f32374b;
                        zh.f d14 = eVar2.r().d();
                        bVar4.getClass();
                        gVar2.f526h = (byte) zh.b.q(d14);
                        for (ai.e w7 = eVar2.w(); w7 != null; w7 = w7.o()) {
                            if (w7.getType() == 6) {
                                ((g) w7).H(sVar.f17892r, sVar.f17893s, ((l) eVar2).f17862p, i29, 0, false);
                            }
                        }
                    }
                }
                int i30 = sVar.f17896v;
                fVar2 = fVar;
                int i31 = (fVar2.f510b - fVar2.c) - fVar2.f511d;
                byte b11 = fVar2.f514g;
                if (b11 != 1) {
                    if (b11 != 2) {
                        i15 = i14;
                    } else {
                        i15 = i31 - i26;
                    }
                } else {
                    i15 = (i31 - i26) / 2;
                }
                if (i15 >= 0) {
                    sVar.c = i15;
                    sVar.f483f = i15;
                    if (fVar2.f515h == 1) {
                        int i32 = (((fVar2.f509a - fVar2.f512e) - fVar2.f513f) - i30) / 2;
                        for (ai.e eVar3 = sVar.f490m; eVar3 != null; eVar3 = eVar3.o()) {
                            zh.b bVar5 = zh.b.f32374b;
                            zh.f d15 = eVar3.r().d();
                            bVar5.getClass();
                            gVar2.f526h = (byte) zh.b.q(d15);
                            ai.e w10 = eVar3.w();
                            while (w10 != null && w10.getType() == 6) {
                                ai.e eVar4 = w10;
                                ((g) w10).H(sVar.f17892r, sVar.f17893s, ((l) eVar3).f17862p, i30, 0, false);
                                eVar4.x(eVar4.getX() + i32);
                                w10 = eVar4.o();
                            }
                        }
                    }
                }
                if (!sVar.f17890p) {
                    fVar2.f509a = i13;
                }
            }
            sVar.f489l = this;
            this.A.put(Integer.valueOf(pVar.B), sVar);
            if (!pVar.C) {
                pVar.getBounds().width = sVar.f17896v + fVar2.f512e + fVar2.f513f;
            }
        }
    }

    @Override // gj.f, ai.a, ai.e
    public final void dispose() {
        super.dispose();
        Hashtable hashtable = this.A;
        if (hashtable != null) {
            for (Integer num : hashtable.keySet()) {
                s sVar = (s) hashtable.get(num);
                if (sVar != null) {
                    sVar.dispose();
                }
            }
            hashtable.clear();
        }
    }

    @Override // gj.f, ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        int i12;
        s sVar;
        if (this.f17865z) {
            int i13 = ((int) (this.f480b * f10)) + i10;
            int i14 = ((int) (this.c * f10)) + i11;
            lh.p pVar = this.f17864y;
            Rectangle bounds = pVar.getBounds();
            Rect e10 = e.a.f29807a.e("ShapeView");
            e10.set(i13, i14, (int) ((bounds.width * f10) + i13), (int) ((bounds.height * f10) + i14));
            lh.r rVar = pVar.D;
            if (rVar != null) {
                N(canvas, rVar, e10, f10);
            } else if (pVar.getType() == 2) {
                tg.a.a(canvas, getControl(), J(), this.f17864y, e10, f10);
            } else if (pVar.getType() == 5) {
                ui.a aVar = ((lh.q) pVar).E;
                aVar.l(f10);
                aVar.a(canvas, getControl(), e10.left, e10.top, e10.width(), e10.height(), sg.d.f29801b.a());
            }
            Hashtable hashtable = this.A;
            if (hashtable.size() > 0 && (i12 = pVar.B) >= 0 && (sVar = (s) hashtable.get(Integer.valueOf(i12))) != null) {
                canvas.save();
                canvas.rotate(pVar.f20607h, e10.exactCenterX(), e10.exactCenterY());
                sVar.g(canvas, i13, i14, f10);
                canvas.restore();
            }
        }
    }

    @Override // gj.f, ai.e
    public final short getType() {
        return (short) 13;
    }

    public n(lib.zj.office.system.f fVar, zh.h hVar, zh.h hVar2, lh.e eVar) {
        super(fVar, hVar, hVar2);
        this.f17864y = (lh.p) eVar;
        this.A = new Hashtable();
    }
}
