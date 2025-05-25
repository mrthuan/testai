package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import lib.zj.office.java.awt.Rectangle;
import net.lingala.zip4j.exception.ZipException;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class j1 implements q9.l, p9.c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13274a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13275b;
    public final Object c;

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3) {
        this.f13274a = obj;
        this.f13275b = obj2;
        this.c = obj3;
    }

    public static void d(Canvas canvas, lh.g gVar, Rect rect) {
        float rotation = gVar.getRotation();
        if (gVar.d()) {
            rotation += 180.0f;
        }
        if (rotation != 0.0f) {
            canvas.rotate(rotation, rect.centerX(), rect.centerY());
        }
    }

    public static void e(PushbackInputStream pushbackInputStream, byte[] bArr, int i10) {
        if (pdf.pdfreader.viewer.editor.free.utils.t0.k0(pushbackInputStream, bArr, 0, i10) == i10) {
            return;
        }
        throw new ZipException("Could not fill buffer");
    }

    public static int f(int i10, byte[] bArr) {
        return ((((bArr[i10 + 3] & 255) << 8) | (bArr[i10 + 2] & 255)) << 16) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8);
    }

    public static int k(int i10, byte[] bArr) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    @Override // q9.m
    public /* bridge */ /* synthetic */ Object a() {
        return new i1((g1) ((q9.m) this.f13274a).a(), (d0) ((q9.m) this.f13275b).a(), (m0) ((q9.m) this.c).a());
    }

    public void b(Canvas canvas) {
        Rect clipBounds = canvas.getClipBounds();
        oi.f fVar = (oi.f) this.f13274a;
        clipBounds.left = fVar.c.f23072b;
        clipBounds.top = fVar.f23077d.f23069b;
        int size = fVar.f23076b.f16617r.size();
        lib.zj.office.system.f control = fVar.f23078e.getControl();
        for (int i10 = 0; i10 < size && !fVar.f23078e.c; i10++) {
            c(canvas, clipBounds, control, null, fVar.f23076b.i(i10));
        }
    }

    public void c(Canvas canvas, Rect rect, lib.zj.office.system.f fVar, lh.g gVar, lh.g gVar2) {
        lh.g[] r4;
        canvas.save();
        Rectangle bounds = gVar2.getBounds();
        Object obj = this.f13274a;
        if (bounds == null && gVar2.getType() == 5) {
            DisplayMetrics displayMetrics = ((oi.f) obj).f23078e.getControl().s().m().getResources().getDisplayMetrics();
            Rectangle rectangle = new Rectangle(0, 0, Math.round(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels)), Math.round(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)));
            gVar2.b(rectangle);
            bounds = rectangle;
        }
        oi.f fVar2 = (oi.f) obj;
        float f10 = fVar2.f23079f;
        Object obj2 = this.f13275b;
        if (gVar != null && (gVar instanceof lh.k)) {
            Rect rect2 = (Rect) obj2;
            rect2.left = Math.round(bounds.f20688x * f10);
            rect2.right = Math.round((bounds.f20688x + bounds.width) * f10);
            rect2.top = Math.round(bounds.f20689y * f10);
            rect2.bottom = Math.round((bounds.f20689y + bounds.height) * f10);
        } else {
            int i10 = fVar2.c.f23072b;
            int i11 = fVar2.f23077d.f23069b;
            float f11 = fVar2.f23081h;
            float f12 = fVar2.f23082i;
            Rect rect3 = (Rect) obj2;
            rect3.left = Math.round((bounds.f20688x - f11) * f10) + i10;
            rect3.right = Math.round(((bounds.f20688x + bounds.width) - f11) * f10) + i10;
            rect3.top = Math.round((bounds.f20689y - f12) * f10) + i11;
            rect3.bottom = Math.round(((bounds.f20689y + bounds.height) - f12) * f10) + i11;
        }
        Rect rect4 = (Rect) this.c;
        Rect rect5 = (Rect) obj2;
        rect4.set(rect5.left, rect5.top, rect5.right, rect5.bottom);
        if (!rect4.intersect(rect) && gVar == null) {
            return;
        }
        if (gVar2 instanceof lh.f) {
            if (gVar2.d()) {
                canvas.translate(rect5.left, rect5.bottom);
                canvas.scale(1.0f, -1.0f);
                canvas.translate(-rect5.left, -rect5.top);
            }
            if (gVar2.c()) {
                canvas.translate(rect5.right, rect5.top);
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(-rect5.left, -rect5.top);
            }
            for (lh.g gVar3 : ((lh.f) gVar2).r()) {
                if (!gVar2.a()) {
                    c(canvas, rect, fVar, gVar2, gVar3);
                }
            }
        } else {
            short type = gVar2.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 2 && type != 4) {
                        if (type != 5) {
                            if (type == 8) {
                                lh.k kVar = (lh.k) gVar2;
                                sg.a.d(canvas, fVar, fVar2.h(), kVar, rect5, fVar2.f23079f);
                                canvas.translate(rect5.left, rect5.top);
                                for (lh.g gVar4 : kVar.q()) {
                                    c(canvas, rect, fVar, kVar, gVar4);
                                }
                            }
                        } else {
                            lh.a aVar = (lh.a) gVar2;
                            if (aVar.f20600m != null) {
                                d(canvas, gVar2, rect5);
                                aVar.f20600m.l(fVar2.f23079f);
                                aVar.f20600m.a(canvas, fVar, rect5.left, rect5.top, rect5.width(), rect5.height(), sg.d.f29801b.a());
                            }
                        }
                    } else {
                        tg.a.a(canvas, fVar, fVar2.h(), (lh.e) gVar2, rect5, fVar2.f23079f);
                    }
                } else {
                    lh.n nVar = (lh.n) gVar2;
                    zh.l lVar = nVar.f20643n;
                    if (lVar.f32372b - lVar.f32371a != 0) {
                        d(canvas, nVar, rect5);
                        ai.h hVar = nVar.f20644o;
                        if (hVar == null) {
                            zh.k kVar2 = new zh.k();
                            kVar2.f32390a = lVar;
                            zh.f fVar3 = lVar.c;
                            zh.b.f32374b.getClass();
                            zh.b.K(fVar3, (int) Math.round(nVar.f20604e.getWidth() * 15.0d));
                            zh.b.E(fVar3, (int) Math.round(nVar.f20604e.getHeight() * 15.0d));
                            ai.h hVar2 = new ai.h(fVar2.f23078e.getEditor(), kVar2);
                            hVar2.f532p = nVar.f20642m;
                            hVar2.G();
                            nVar.f20644o = hVar2;
                            hVar = hVar2;
                        }
                        hVar.g(canvas, rect5.left, rect5.top, fVar2.f23079f);
                    }
                }
            } else {
                lh.i iVar = (lh.i) gVar2;
                d(canvas, iVar, rect5);
                sg.a.d(canvas, fVar, fVar2.h(), iVar, rect5, fVar2.f23079f);
                jh.a j10 = fVar.o().g().j(iVar.f20623m);
                j10.f19232d = iVar.f20607h;
                jh.c.f19238d.f(canvas, fVar2.f23078e.getControl(), fVar2.h(), j10, rect5.left, rect5.top, fVar2.f23079f, rect5.width(), rect5.height(), iVar.f20625o);
            }
        }
        canvas.restore();
    }

    public int g(PushbackInputStream pushbackInputStream) {
        byte[] bArr = (byte[]) this.f13275b;
        e(pushbackInputStream, bArr, 4);
        return f(0, bArr);
    }

    public int h(RandomAccessFile randomAccessFile) {
        byte[] bArr = (byte[]) this.f13275b;
        randomAccessFile.readFully(bArr);
        return f(0, bArr);
    }

    public long i(int i10, byte[] bArr) {
        int length = bArr.length - i10;
        Object obj = this.c;
        if (length < 8) {
            Arrays.fill((byte[]) obj, (byte) 0);
        }
        System.arraycopy(bArr, i10, (byte[]) obj, 0, Math.min(bArr.length - i10, 8));
        return (((((((((((((((((byte[]) obj)[7] & 255) | 0) << 8) | (((byte[]) obj)[6] & 255)) << 8) | (((byte[]) obj)[5] & 255)) << 8) | (((byte[]) obj)[4] & 255)) << 8) | (((byte[]) obj)[3] & 255)) << 8) | (((byte[]) obj)[2] & 255)) << 8) | (((byte[]) obj)[1] & 255)) << 8) | (((byte[]) obj)[0] & 255);
    }

    public long j(RandomAccessFile randomAccessFile) {
        byte[] bArr = (byte[]) this.c;
        randomAccessFile.readFully(bArr);
        return i(0, bArr);
    }

    public int l(PushbackInputStream pushbackInputStream) {
        byte[] bArr = (byte[]) this.f13274a;
        e(pushbackInputStream, bArr, bArr.length);
        return k(0, bArr);
    }

    public int m(RandomAccessFile randomAccessFile) {
        byte[] bArr = (byte[]) this.f13274a;
        randomAccessFile.readFully(bArr);
        return k(0, bArr);
    }

    @Override // p9.c
    public Object zza() {
        Object zza = ((p9.c) this.f13274a).zza();
        o9.e eVar = (o9.e) ((p9.c) this.f13275b).zza();
        Context context = (Context) ((o9.h) ((p9.c) this.c)).f22768a.f17514a;
        if (context != null) {
            return new o9.f((o9.m) zza, eVar, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public j1() {
        this.f13274a = new byte[2];
        this.f13275b = new byte[4];
        this.c = new byte[8];
    }

    public j1(oi.f fVar) {
        this.f13274a = fVar;
        this.f13275b = new Rect();
        this.c = new Rect();
    }
}
