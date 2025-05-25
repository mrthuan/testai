package cn;

import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Pdf2ImageConvertTask.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f5722a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5723b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public ReaderPDFCore.BaseCookie f5724d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f5725e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f5726f;

    /* renamed from: g  reason: collision with root package name */
    public final a f5727g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f5728h;

    /* renamed from: i  reason: collision with root package name */
    public dn.a f5729i;

    /* renamed from: j  reason: collision with root package name */
    public final float f5730j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5731k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5732l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5733m;

    /* renamed from: n  reason: collision with root package name */
    public final int f5734n;

    /* renamed from: o  reason: collision with root package name */
    public Paint f5735o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5736p;

    /* renamed from: q  reason: collision with root package name */
    public final int f5737q;

    /* renamed from: r  reason: collision with root package name */
    public final int f5738r;

    /* renamed from: s  reason: collision with root package name */
    public final int f5739s;

    /* renamed from: t  reason: collision with root package name */
    public final int f5740t;

    /* renamed from: u  reason: collision with root package name */
    public final int f5741u;

    /* compiled from: Pdf2ImageConvertTask.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            ArrayList<ImageFileInfo> arrayList;
            g.e(msg, "msg");
            super.handleMessage(msg);
            int i10 = msg.what;
            b bVar = b.this;
            int i11 = bVar.f5722a;
            AtomicBoolean atomicBoolean = bVar.f5725e;
            if (i10 == i11) {
                if (atomicBoolean.get()) {
                    return;
                }
                int max = Math.max(msg.arg1, 0);
                dn.a aVar = bVar.f5729i;
                if (aVar != null) {
                    aVar.c(max);
                }
            } else if (i10 == bVar.f5723b) {
                if (atomicBoolean.get()) {
                    return;
                }
                ea.a.p("JEQfMhFNFT52PgVhV2gyIF5pPGk6aFNk", "DttYXRqb");
                String str = n0.f28727a;
                Object obj = msg.obj;
                if (obj instanceof ArrayList) {
                    arrayList = (ArrayList) obj;
                } else {
                    arrayList = null;
                }
                dn.a aVar2 = bVar.f5729i;
                if (aVar2 != null) {
                    aVar2.b(arrayList);
                }
            } else if (i10 != bVar.c || atomicBoolean.get()) {
            } else {
                ea.a.p("ZkQ1MntNfz52PgVhV2gyIF1yIG9y", "wJ6s287o");
                String str2 = n0.f28727a;
                dn.a aVar3 = bVar.f5729i;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
        }
    }

    public b() {
        ea.a.p("NmQyMnhtIGctQwluQmUldGxhIWs=", "NgfT1Av7");
        this.f5722a = 101;
        this.f5723b = 102;
        this.c = 103;
        this.f5725e = new AtomicBoolean(false);
        this.f5726f = new AtomicBoolean(false);
        this.f5727g = new a(Looper.getMainLooper());
        this.f5728h = new AtomicBoolean(false);
        this.f5730j = 4.0f;
        this.f5731k = 2480;
        this.f5732l = 3507;
        this.f5733m = 50;
        this.f5734n = 50;
        this.f5736p = 1920;
        this.f5737q = 1560;
        this.f5738r = 1080;
        this.f5739s = 720;
        this.f5740t = 480;
        this.f5741u = 320;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b7, code lost:
        if (r42 < r9) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b9, code lost:
        r0 = (r0 * r9) / r12;
        r14 = (r14 * r9) / r13;
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01be, code lost:
        r23 = r0;
        r24 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c5, code lost:
        if (r42 < r8) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c7, code lost:
        r0 = (r0 * r8) / r12;
        r14 = (r14 * r8) / r13;
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01cd, code lost:
        if (r42 < r6) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01cf, code lost:
        r0 = (r0 * r6) / r12;
        r14 = (r14 * r6) / r13;
        r13 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d5, code lost:
        if (r42 < r5) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d7, code lost:
        r0 = (r0 * r5) / r12;
        r14 = (r14 * r5) / r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01db, code lost:
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01dd, code lost:
        r35 = r5;
        r36 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e6, code lost:
        r0 = (r0 * r11) / r12;
        r14 = (r14 * r11) / r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e9, code lost:
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01eb, code lost:
        r13 = (r13 * r37.f5730j) / r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f0, code lost:
        r0 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        cn.e.f5754a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01fb, code lost:
        r13 = cn.e.d(r38, r13);
        r0 = r23;
        r12 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0200, code lost:
        r14 = new android.graphics.BitmapFactory.Options();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0205, code lost:
        r35 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0207, code lost:
        r14.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        r14.inJustDecodeBounds = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0212, code lost:
        r36 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0214, code lost:
        r14.inSampleSize = b(r26.getImgWidth(), r26.getImgHeight());
        r3 = android.graphics.BitmapFactory.decodeFile(r3.getAbsolutePath(), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0226, code lost:
        if (r3 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0228, code lost:
        r5 = android.graphics.Bitmap.createScaledBitmap(r3, r15, (int) (r26.getImgHeight() * r26.getScale()), true);
        kotlin.jvm.internal.g.d(r5, ea.a.p("UHIuYQdlMWMTbFFkK2kibSVwGm80aSRplIDKICh0YnNQYSdlWi4WbztuQChALHZ0NnVXKQ==", "vlALZJpa"));
        r3.recycle();
        r3 = r30;
        r4.drawBitmap(r5, 0.0f, r3, (android.graphics.Paint) null);
        r30 = r3 + r5.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0257, code lost:
        if (r37.f5735o != null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0259, code lost:
        r3 = new android.graphics.Paint(1);
        r37.f5735o = r3;
        r3.setStrokeWidth(20);
        r3 = r37.f5735o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0269, code lost:
        if (r3 != null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x026d, code lost:
        r3.setAntiAlias(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0271, code lost:
        r3 = r37.f5735o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0273, code lost:
        if (r3 != null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0276, code lost:
        r3.setColor(androidx.core.content.a.getColor(r38, pdf.pdfreader.viewer.editor.free.R.color.color_F0F2F5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0282, code lost:
        r3 = r37.f5735o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0284, code lost:
        if (r3 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0286, code lost:
        r4.drawRect(0.0f, r30, r5.getWidth(), r30, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x029a, code lost:
        r3 = 20;
        r30 = r30 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x029f, code lost:
        if (r41 == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a1, code lost:
        if (r13 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a3, code lost:
        r23 = r0;
        r4.drawBitmap(r13, (r5.getWidth() - r13.getWidth()) - r0, ((r30 - r13.getHeight()) - r12) - r3, (android.graphics.Paint) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c1, code lost:
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c3, code lost:
        r5.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02c7, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02c9, code lost:
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02cd, code lost:
        r24 = r12;
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d2, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02d4, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02d5, code lost:
        r35 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02d7, code lost:
        r36 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02d9, code lost:
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02df, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02e0, code lost:
        r35 = r5;
        r36 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e8, code lost:
        r34 = r0;
        r35 = r5;
        r36 = r6;
        r33 = r12;
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f4, code lost:
        r39.size();
        r0 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        r14 = r31;
        r13 = r32;
        r12 = r33;
        r0 = r34;
        r5 = r35;
        r6 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0307, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0308, code lost:
        r35 = r5;
        r36 = r6;
        r33 = r12;
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0311, code lost:
        r34 = r0;
        r35 = r5;
        r36 = r6;
        r33 = r12;
        r32 = r13;
        r0 = new java.io.File(pdf.pdfreader.viewer.editor.free.utils.v.D(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m()));
        r0.mkdirs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0339, code lost:
        if (kotlin.jvm.internal.g.a(r40, ea.a.p("Q25n", "nxU3SQi5")) == false) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x033b, code lost:
        r3 = ea.a.p("YXBfZw==", "fWeBUrPK");
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0345, code lost:
        r3 = ea.a.p("ampHZw==", "96D7dEwr");
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x034e, code lost:
        r0 = r0.getAbsolutePath();
        r5 = java.io.File.separator;
        cn.e.f5754a.getClass();
        r3 = r0 + r5 + cn.e.c(r38) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0372, code lost:
        r5 = new java.io.FileOutputStream(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0377, code lost:
        if (r14 == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0379, code lost:
        r0 = android.graphics.Bitmap.CompressFormat.PNG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x037c, code lost:
        r0 = android.graphics.Bitmap.CompressFormat.JPEG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x037e, code lost:
        r6 = r34.compress(r0, 80, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0386, code lost:
        r34.recycle();
        r5.flush();
        r5.close();
        r0 = tf.d.f30009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0392, code lost:
        o9.d.l(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0395, code lost:
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0399, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x039a, code lost:
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x039d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x039e, code lost:
        r18 = r6;
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a3, code lost:
        r6 = r0;
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a6, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03a9, code lost:
        o9.d.l(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ac, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03ad, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03ae, code lost:
        r14 = r3;
        r5 = r15;
        r15 = r25;
        r3 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03b6, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03b7, code lost:
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03b9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03bb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03be, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03c1, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03c2, code lost:
        r35 = r5;
        r36 = r6;
        r33 = r12;
        r32 = r13;
        r12 = null;
        r5 = r15;
        r14 = r20;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03d5, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03d6, code lost:
        r29 = r3;
        r35 = r5;
        r36 = r6;
        r33 = r12;
        r32 = r13;
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03e5, code lost:
        r14 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03e7, code lost:
        r5 = r15;
        r15 = r25;
        r3 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03ed, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03ee, code lost:
        r35 = r5;
        r36 = r6;
        r33 = r12;
        r32 = r13;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
        r22 = r3;
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (r15 != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r15 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
        r0 = r39.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
        if (r0.hasNext() == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r4 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
        if (r12.get() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
        java.lang.Thread.sleep(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
        if (r13.get() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
        r23 = r0;
        r4.setScale(r15 / r4.getImgWidth());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
        r3 = r3 + (((int) (r4.getImgHeight() * r4.getScale())) + 20);
        r0 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
        r3 = r3 - 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0100, code lost:
        r0 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        r0 = android.graphics.Bitmap.createBitmap(r15, r3, android.graphics.Bitmap.Config.RGB_565);
        kotlin.jvm.internal.g.d(r0, ea.a.p("LHJUYQ1ldWkubStwXXUbZWJpCnQtLEV0l4DQdGcgCWk7bVBwV0NYbjxpLS4nRypfADZbKQ==", "6XyXuvKK"));
        r4 = new android.graphics.Canvas(r0);
        r4.drawColor(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011c, code lost:
        r14 = r39.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
        r29 = r3;
        r23 = 50;
        r24 = 50;
        r25 = null;
        r30 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012e, code lost:
        if (r14.hasNext() == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
        r26 = (pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo) r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013a, code lost:
        if (r12.get() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013e, code lost:
        java.lang.Thread.sleep(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0148, code lost:
        if (r13.get() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014a, code lost:
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014d, code lost:
        if (r25 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014f, code lost:
        r25.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0153, code lost:
        r35 = r5;
        r36 = r6;
        r33 = r12;
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
        r27 = r26.getFilePath();
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0167, code lost:
        if (r27 != null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0169, code lost:
        r14 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016c, code lost:
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016e, code lost:
        r3 = new java.io.File(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0175, code lost:
        if (r3.exists() == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0177, code lost:
        if (r25 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017d, code lost:
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0180, code lost:
        if (r25.isRecycled() != true) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0182, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0184, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0185, code lost:
        if (r13 == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0188, code lost:
        r34 = r0;
        r33 = r12;
        r0 = r23;
        r12 = r24;
        r13 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0195, code lost:
        r32 = r13;
        r35 = r5;
        r36 = r6;
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a1, code lost:
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a3, code lost:
        r13 = r37.f5732l;
        r14 = r37.f5734n;
        r33 = r12;
        r12 = r37.f5731k;
        r34 = r0;
        r0 = r37.f5733m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01af, code lost:
        if (r42 < r10) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b2, code lost:
        r0 = (r0 * r10) / r12;
        r14 = (r14 * r10) / r13;
        r13 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x044e A[LOOP:2: B:219:0x0448->B:221:0x044e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0460  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r38, java.util.ArrayList r39, java.lang.String r40, boolean r41, int r42) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.b.a(android.content.Context, java.util.ArrayList, java.lang.String, boolean, int):void");
    }

    public final int b(int i10, int i11) {
        int i12 = this.f5732l;
        int i13 = this.f5731k;
        if (i10 < i13 && i11 < i12) {
            return 1;
        }
        int o02 = t0.o0(i10 / i13);
        int o03 = t0.o0(i11 / i12);
        if (o02 < o03) {
            return o03;
        }
        return o02;
    }

    public final void c() {
        this.f5726f.set(false);
        this.f5725e.set(true);
        try {
            ReaderPDFCore.BaseCookie baseCookie = this.f5724d;
            if (baseCookie != null) {
                baseCookie.a();
            }
            ea.a.p("H0R3MjBNcD5kPilhG2MNbBVjAW4zZRd0eWMabyhpNyAuYl5ydA==", "pUvEYuCR");
            String str = n0.f28727a;
        } catch (Exception e10) {
            e10.printStackTrace();
            ea.a.p("H0R3MjBNcD5kPilhG2MNbBVjAW4zZRd0FmNbbzJpIyAuYl5yDSBScihvcg==", "IFdM64YF");
            String str2 = n0.f28727a;
        }
    }
}
