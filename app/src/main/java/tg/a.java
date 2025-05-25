package tg;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import lh.e;
import lib.zj.office.system.f;
import qh.d;

/* compiled from: AutoShapeKit.java */
/* loaded from: classes.dex */
public final class a {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static void a(android.graphics.Canvas r30, lib.zj.office.system.f r31, int r32, lh.e r33, android.graphics.Rect r34, float r35) {
        /*
            Method dump skipped, instructions count: 3810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.a.a(android.graphics.Canvas, lib.zj.office.system.f, int, lh.e, android.graphics.Rect, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r1 == (-2)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r1 == (-1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.graphics.Canvas r9, lib.zj.office.system.f r10, int r11, lh.e r12, android.graphics.Path r13, android.graphics.Rect r14, float r15) {
        /*
            qh.d r0 = r12.f20609j
            if (r0 == 0) goto L17
            qh.e r1 = r0.d()
            int r2 = r1.c
            r3 = -2
            int r1 = r1.f29347d
            if (r2 != r3) goto L11
            if (r1 == r3) goto L18
        L11:
            r3 = -1
            if (r2 != r3) goto L17
            if (r1 != r3) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r7 = r0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r15
            c(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.a.b(android.graphics.Canvas, lib.zj.office.system.f, int, lh.e, android.graphics.Path, android.graphics.Rect, float):void");
    }

    public static void c(Canvas canvas, f fVar, int i10, e eVar, Path path, Rect rect, d dVar, float f10) {
        if (path == null) {
            return;
        }
        canvas.save();
        Paint a10 = sg.d.f29801b.a();
        int color = a10.getColor();
        Paint.Style style = a10.getStyle();
        int alpha = a10.getAlpha();
        e(canvas, rect, eVar.f20607h, eVar.f20605f, eVar.f20606g, dVar);
        eh.b bVar = eVar.f20603d;
        if (bVar != null) {
            a10.setStyle(Paint.Style.FILL);
            sg.a.e(canvas, fVar, i10, bVar, rect, dVar, f10, path, a10);
            a10.setAlpha(alpha);
        }
        if (eVar.p()) {
            a10.setStyle(Paint.Style.STROKE);
            a10.setStrokeWidth(eVar.f20610k.f17806a * f10);
            if (eVar.f20610k.c) {
                float f11 = 5.0f * f10;
                a10.setPathEffect(new DashPathEffect(new float[]{f11, f11}, 10.0f));
            }
            sg.a.e(canvas, fVar, i10, eVar.f20610k.f17807b, rect, dVar, f10, path, a10);
            a10.setAlpha(alpha);
        }
        a10.setAlpha(alpha);
        a10.setColor(color);
        a10.setStyle(style);
        canvas.restore();
    }

    public static void d(Canvas canvas, f fVar, int i10, e eVar, b bVar, Rect rect, d dVar, float f10) {
        canvas.save();
        Paint a10 = sg.d.f29801b.a();
        e(canvas, rect, eVar.f20607h, eVar.f20605f, eVar.f20606g, dVar);
        int alpha = a10.getAlpha();
        eh.b bVar2 = bVar.f30011b;
        if (bVar2 != null) {
            a10.setStyle(Paint.Style.FILL);
            sg.a.e(canvas, fVar, i10, bVar2, rect, dVar, f10, bVar.a(), a10);
            a10.setAlpha(alpha);
        }
        if (bVar.c) {
            a10.setStyle(Paint.Style.STROKE);
            a10.setStrokeWidth(bVar.f30012d.f17806a * f10);
            if (bVar.f30012d.c && !bVar.f30013e) {
                float f11 = 5.0f * f10;
                a10.setPathEffect(new DashPathEffect(new float[]{f11, f11}, 10.0f));
            }
            sg.a.e(canvas, fVar, i10, bVar.f30012d.f17807b, rect, dVar, f10, bVar.a(), a10);
            a10.setAlpha(alpha);
        }
        canvas.restore();
    }

    public static void e(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11, d dVar) {
        if (dVar != null) {
            f10 += dVar.e().f29344b;
        }
        if (z11) {
            canvas.translate(rect.left, rect.bottom);
            canvas.scale(1.0f, -1.0f);
            canvas.translate(-rect.left, -rect.top);
            f10 = -f10;
        }
        if (z10) {
            canvas.translate(rect.right, rect.top);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-rect.left, -rect.top);
            f10 = -f10;
        }
        if (f10 != 0.0f) {
            canvas.rotate(f10, rect.centerX(), rect.centerY());
        }
    }
}
