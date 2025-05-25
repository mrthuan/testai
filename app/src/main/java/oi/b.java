package oi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: CellView.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final f f23058a;

    /* renamed from: b  reason: collision with root package name */
    public final a f23059b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f23060d;

    /* renamed from: g  reason: collision with root package name */
    public ki.a f23063g;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23065i;

    /* renamed from: e  reason: collision with root package name */
    public ki.d f23061e = new ki.d();

    /* renamed from: f  reason: collision with root package name */
    public final a2.a f23062f = new a2.a(8);

    /* renamed from: j  reason: collision with root package name */
    public final StringBuilder f23066j = new StringBuilder();

    /* renamed from: k  reason: collision with root package name */
    public final ji.e f23067k = new ji.e();

    /* renamed from: h  reason: collision with root package name */
    public final RectF f23064h = new RectF();

    public b(f fVar) {
        this.f23058a = null;
        this.f23058a = fVar;
        this.f23059b = new a(fVar);
    }

    public static String a(String str) {
        int indexOf = str.indexOf(46);
        if (indexOf > 0) {
            char[] charArray = str.toCharArray();
            int length = charArray.length - 1;
            while (length > indexOf && charArray[length] == '9') {
                length--;
            }
            if (length > indexOf) {
                charArray[length] = (char) (charArray[length] + 1);
                return String.valueOf(charArray, 0, length + 1);
            }
            return String.valueOf(((int) Double.parseDouble(str)) + 1);
        } else if (str.length() == 1) {
            return String.valueOf(((int) Double.parseDouble(str)) + 1);
        } else {
            return str;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getParentInsn()" because "arg" is null
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.argInLoop(LoopRegionVisitor.java:436)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.assignOnlyInLoop(LoopRegionVisitor.java:411)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:132)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
        */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0795, code lost:
        if (r3 != 3) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x084f, code lost:
        if (r9 != 3) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0b07, code lost:
        if (r6 != 3) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015c, code lost:
        if (r5 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a3, code lost:
        if (r1 != 100) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ae, code lost:
        if (r1 != 100) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b1, code lost:
        r1 = 0.0f;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0297  */
    /* JADX WARN: Type inference failed for: r12v3, types: [zh.j, zh.a] */
    /* JADX WARN: Type inference failed for: r13v20, types: [zh.l, zh.a] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [zh.i, zh.a] */
    /* JADX WARN: Type inference failed for: r4v41, types: [zh.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r26, ei.a r27, ki.a r28) {
        /*
            Method dump skipped, instructions count: 2982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.b.b(android.graphics.Canvas, ei.a, ki.a):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0616, code lost:
        if (r6 != 3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0741, code lost:
        if (r6 != 3) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d6, code lost:
        if (r2 != 3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0655 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.graphics.Canvas r21, ei.a r22, java.lang.String r23, android.graphics.Paint r24) {
        /*
            Method dump skipped, instructions count: 2128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.b.c(android.graphics.Canvas, ei.a, java.lang.String, android.graphics.Paint):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x00dd -> B:39:0x00dd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ji.b d(ji.a r10, ei.d r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.b.d(ji.a, ei.d, int, int):ji.b");
    }

    public final void e(Canvas canvas, ci.a aVar) {
        int i10;
        canvas.save();
        float f10 = this.c;
        float f11 = this.f23060d;
        ki.d dVar = this.f23061e;
        float f12 = (dVar.f19774a + f10) - dVar.f19777e;
        ki.a aVar2 = this.f23063g;
        canvas.clipRect(f10, f11, f12 - (aVar2.f19765e - aVar2.f19767g), ((dVar.f19775b + f11) - dVar.f19778f) - (aVar2.f19766f - aVar2.f19768h));
        if (rg.c.c) {
            canvas.drawColor(-16777216);
        } else {
            canvas.drawColor(-1);
        }
        Paint a10 = sg.d.f29801b.a();
        int color = a10.getColor();
        Paint.Style style = a10.getStyle();
        a10.setColor(-2763307);
        a10.setStyle(Paint.Style.STROKE);
        float f13 = this.c;
        float f14 = this.f23060d;
        ki.d dVar2 = this.f23061e;
        canvas.drawRect(f13, f14, (dVar2.f19774a + f13) - dVar2.f19777e, (dVar2.f19775b + f14) - dVar2.f19778f, a10);
        a10.setStyle(style);
        ki.e eVar = this.f23058a.f23086m;
        int i11 = eVar.f19779a;
        int i12 = eVar.f19780b;
        ki.d dVar3 = this.f23061e;
        if (dVar3.c) {
            i11 = 0;
        }
        if (dVar3.f19776d) {
            i10 = 0;
        } else {
            i10 = i12;
        }
        if (i11 >= aVar.f5690a) {
            a10.setColor(-2763307);
            a10.setStyle(Paint.Style.FILL_AND_STROKE);
            a10.setStrokeWidth(1.0f);
            float f15 = this.c;
            float f16 = this.f23060d;
            ki.d dVar4 = this.f23061e;
            canvas.drawRect(f15, f16, (dVar4.f19774a + f15) - dVar4.f19777e, f16 + 1.0f, a10);
        }
        if (i10 >= aVar.f5691b) {
            a10.setColor(-2763307);
            a10.setStyle(Paint.Style.FILL_AND_STROKE);
            a10.setStrokeWidth(1.0f);
            float f17 = this.c;
            float f18 = this.f23060d;
            ki.d dVar5 = this.f23061e;
            canvas.drawRect(f17, f18, f17 + 1.0f, (dVar5.f19775b + f18) - dVar5.f19778f, a10);
        }
        a10.setColor(color);
        canvas.restore();
    }
}
