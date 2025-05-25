package gj;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: LineView.java */
/* loaded from: classes3.dex */
public final class g extends ai.a {

    /* renamed from: p  reason: collision with root package name */
    public int f17834p;

    public g() {
    }

    @Override // ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        ai.e u7 = u(j10, 7, z10);
        if (u7 != null) {
            u7.A(j10, rectangle, z10);
        }
        rectangle.f20688x += this.f480b;
        rectangle.f20689y += this.c;
        return rectangle;
    }

    @Override // ai.a, ai.e
    public final long C(int i10, int i11, boolean z10) {
        int i12 = i10 - this.f480b;
        int i13 = i11 - this.c;
        ai.e f10 = f(i12, i13, z10);
        if (f10 == null) {
            if (i12 > this.f481d) {
                f10 = F();
            } else {
                f10 = this.f490m;
            }
        }
        if (f10 != null) {
            return f10.C(i12, i13, z10);
        }
        return -1L;
    }

    public final float G(float f10) {
        float f11 = f10 * 2.3f;
        if (f11 < 3.0f) {
            f11 = 3.0f;
        }
        if (f11 > 6.0f) {
            return 6.0f;
        }
        return f11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
        if (r9 != 5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(ai.f r6, ai.g r7, gj.a r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.g.H(ai.f, ai.g, gj.a, int, int, boolean):void");
    }

    @Override // ai.a, ai.e
    public final void dispose() {
        super.dispose();
    }

    @Override // ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        xh.b bVar;
        ai.e eVar;
        int i12;
        long j10;
        int i13;
        Paint paint;
        Rectangle rectangle;
        int i14;
        int i15;
        int i16;
        int textSize;
        int i17;
        int i18;
        g gVar = this;
        canvas.save();
        xh.e n10 = n();
        int i19 = ((int) (gVar.f480b * f10)) + i10;
        int i20 = ((int) (gVar.c * f10)) + i11;
        Rect clipBounds = canvas.getClipBounds();
        int i21 = 0;
        if (gVar.f483f < 0 && n10 != null && n10.getEditType() == 0) {
            float f11 = i19;
            float f12 = i20;
            canvas.clipRect(f11, f12 - (gVar.f483f * f10), (gVar.e((byte) 0) * f10) + f11, (gVar.e((byte) 1) * f10) + (f12 - (gVar.f483f * f10)));
        }
        for (ai.e eVar2 = gVar.f490m; eVar2 != null; eVar2 = eVar2.o()) {
            if (eVar2.h(clipBounds, i19, i20, f10)) {
                eVar2.g(canvas, i19, i20, f10);
            }
        }
        canvas.restore();
        Paint paint2 = new Paint();
        sg.d.b(paint2);
        int i22 = ((int) (gVar.f480b * f10)) + i10;
        int i23 = (int) ((gVar.f483f * f10) + (gVar.c * f10) + i11);
        f fVar = (f) gVar.f490m;
        int i24 = 0;
        int i25 = 0;
        int i26 = Integer.MAX_VALUE;
        while (fVar != null) {
            ai.b bVar2 = fVar.f17828q;
            if (bVar2 == null) {
                fVar = (f) fVar.f492o;
            } else {
                if (bVar2.f499h <= 0) {
                    if (i26 != Integer.MAX_VALUE) {
                        paint2.setColor(i26);
                        int i27 = i25 + i22;
                        canvas.drawRect(i22, i18 + 1, i27, gVar.G(f10) + i24 + i23, paint2);
                        i24 = i21;
                        i25 = i24;
                        i22 = i27;
                    }
                    i22 += (int) (fVar.f481d * f10);
                    i26 = Integer.MAX_VALUE;
                } else {
                    int i28 = bVar2.f500i;
                    if (i26 != Integer.MAX_VALUE && i26 != i28) {
                        paint2.setColor(i26);
                        int i29 = i25 + i22;
                        canvas.drawRect(i22, i17 + 1, i29, gVar.G(f10) + i24 + i23, paint2);
                        i26 = bVar2.f500i;
                        i22 = i29;
                        i24 = 0;
                        i25 = 0;
                    } else if (i26 == Integer.MAX_VALUE) {
                        i26 = i28;
                    }
                    i25 += (int) (fVar.f481d * f10);
                    Paint paint3 = fVar.f17829r;
                    if (paint3 == null) {
                        textSize = fVar.c;
                    } else {
                        int i30 = fVar.c;
                        textSize = (int) ((i30 + i16) - (fVar.f482e - paint3.getTextSize()));
                    }
                    i24 = Math.max(i24, (int) (textSize * f10));
                }
                fVar = (f) fVar.f492o;
                i21 = 0;
            }
        }
        if (i26 != Integer.MAX_VALUE) {
            paint2.setColor(i26);
            canvas.drawRect(i22, i15 + 1, i22 + i25, gVar.G(f10) + i23 + i24, paint2);
        }
        if (n10 != null && n10.getHighlight() != null) {
            xh.d highlight = n10.getHighlight();
            long j11 = gVar.f487j;
            long j12 = gVar.f488k;
            xh.b bVar3 = (xh.b) highlight;
            if (bVar3.c() && bVar3.c) {
                int i31 = 0;
                while (true) {
                    ArrayList<xh.c> arrayList = bVar3.f31654a;
                    if (i31 < arrayList.size()) {
                        xh.c cVar = arrayList.get(i31);
                        long j13 = cVar.f31658a;
                        if (j12 > j13) {
                            long j14 = cVar.f31659b;
                            if (j11 < j14) {
                                int i32 = bVar3.f31655b;
                                Paint paint4 = bVar3.f31657e;
                                if (i31 == i32) {
                                    paint4.setColor(-1713561558);
                                } else {
                                    paint4.setColor(1256005674);
                                }
                                long max = Math.max(j11, j13);
                                Paint paint5 = paint4;
                                ai.e u7 = gVar.u(max, 7, false);
                                if (u7 != null) {
                                    Rectangle rectangle2 = new Rectangle();
                                    xh.e eVar3 = bVar3.f31656d;
                                    eVar3.c(max, rectangle2);
                                    long a10 = u7.a();
                                    long min = Math.min(j12, j14);
                                    bVar = bVar3;
                                    int i33 = rectangle2.f20688x;
                                    int width = u7.getWidth();
                                    if (max == j13) {
                                        Rectangle rectangle3 = new Rectangle();
                                        rectangle3.setBounds(0, 0, 0, 0);
                                        for (ai.e eVar4 = u7; eVar4 != null && eVar4.getType() != 0; eVar4 = eVar4.j()) {
                                            rectangle3.f20688x = eVar4.getX() + rectangle3.f20688x;
                                            rectangle3.f20689y = eVar4.getY() + rectangle3.f20689y;
                                        }
                                        eVar = u7;
                                        if (eVar3.getEditType() == 2 && eVar3.getTextBox() != null) {
                                            rectangle3.f20688x += eVar3.getTextBox().getBounds().f20688x;
                                            rectangle3.f20689y += eVar3.getTextBox().getBounds().f20689y;
                                        }
                                        width -= rectangle2.f20688x - rectangle3.f20688x;
                                    } else {
                                        eVar = u7;
                                    }
                                    ai.e eVar5 = gVar.f489l;
                                    if (eVar5 != null) {
                                        if (gVar.f491n == null) {
                                            i14 = (int) (i20 - (eVar5.s() * f10));
                                            eVar5.s();
                                        } else {
                                            i14 = i20;
                                        }
                                        if (gVar.f492o == null) {
                                            eVar5.t();
                                        }
                                        i12 = i14;
                                    } else {
                                        i12 = i20;
                                    }
                                    int i34 = i33;
                                    ai.e eVar6 = eVar;
                                    while (true) {
                                        if (a10 <= min) {
                                            eVar3.c(max, new Rectangle());
                                            float max2 = Math.max(i12, rectangle.f20689y * f10);
                                            int i35 = i34 + width;
                                            j10 = max;
                                            float f13 = (rectangle.height * f10) + max2;
                                            i13 = i12;
                                            paint = paint5;
                                            canvas.drawRect(i34 * f10, max2, i35 * f10, f13, paint);
                                            eVar6 = eVar6.o();
                                            if (eVar6 == null) {
                                                i34 = i35;
                                                break;
                                            }
                                            width = eVar6.getWidth();
                                            i12 = i13;
                                            paint5 = paint;
                                            i34 = i35;
                                            max = j10;
                                            a10 = eVar6.a();
                                        } else {
                                            j10 = max;
                                            i13 = i12;
                                            paint = paint5;
                                            break;
                                        }
                                    }
                                    if (j12 >= j14) {
                                        Rectangle rectangle4 = new Rectangle();
                                        eVar3.c(j14, rectangle4);
                                        if (rectangle4.f20688x > i34) {
                                            float max3 = Math.max(i13, rectangle4.f20689y * f10);
                                            canvas.drawRect(i34 * f10, max3, rectangle4.f20688x * f10, (rectangle4.height * f10) + max3, paint);
                                        }
                                    }
                                    j11 = j10;
                                    i31++;
                                    gVar = this;
                                    bVar3 = bVar;
                                } else {
                                    return;
                                }
                            }
                        }
                        bVar = bVar3;
                        i31++;
                        gVar = this;
                        bVar3 = bVar;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // ai.e
    public final short getType() {
        return (short) 6;
    }

    public g(zh.h hVar) {
        this.f479a = hVar;
    }
}
