package gj;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.List;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: LeafView.java */
/* loaded from: classes3.dex */
public class f extends ai.a {

    /* renamed from: w  reason: collision with root package name */
    public static final StringBuffer f17826w = new StringBuffer();

    /* renamed from: q  reason: collision with root package name */
    public ai.b f17828q;

    /* renamed from: r  reason: collision with root package name */
    public Paint f17829r;

    /* renamed from: s  reason: collision with root package name */
    public lib.zj.office.system.f f17830s;

    /* renamed from: p  reason: collision with root package name */
    public boolean f17827p = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f17831t = false;

    /* renamed from: u  reason: collision with root package name */
    public int f17832u = -1;

    /* renamed from: v  reason: collision with root package name */
    public final int f17833v = 1073772287;

    public f() {
    }

    public static String I(int i10, String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            StringBuffer stringBuffer = f17826w;
            stringBuffer.delete(0, stringBuffer.length());
            for (int i11 = 0; i11 < charArray.length; i11++) {
                if (Character.isDigit(charArray[i11])) {
                    stringBuffer.append(charArray[i11]);
                }
            }
            if (stringBuffer.length() > 0) {
                return str.replace(stringBuffer.toString(), String.valueOf(i10));
            }
        }
        return str;
    }

    @Override // ai.a, ai.e
    public Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        if (this.f17829r == null) {
            return rectangle;
        }
        rectangle.f20688x = ((int) this.f17829r.measureText(this.f479a.getText().substring((int) (this.f487j - this.f479a.b()), (int) (j10 - this.f479a.b())))) + this.f480b;
        rectangle.f20689y += this.c;
        rectangle.height = e((byte) 1);
        return rectangle;
    }

    @Override // ai.a, ai.e
    public long C(int i10, int i11, boolean z10) {
        if (this.f17829r == null) {
            return this.f487j;
        }
        int i12 = i10 - this.f480b;
        String text = this.f479a.getText();
        int b10 = (int) (this.f487j - this.f479a.b());
        int b11 = (int) (this.f488k - this.f479a.b());
        if (text != null && b10 >= 0 && b10 <= b11 && b11 <= text.length()) {
            String substring = text.substring(b10, b11);
            float[] fArr = new float[substring.length()];
            this.f17829r.getTextWidths(substring, fArr);
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= substring.length()) {
                    break;
                }
                float f10 = fArr[i13];
                i12 = (int) (i12 - f10);
                if (i12 <= 0) {
                    if (i12 + f10 >= f10 / 2.0f) {
                        i14++;
                    }
                } else {
                    i14++;
                    i13++;
                }
            }
            return this.f487j + i14;
        }
        return this.f487j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
        r15 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int G(ai.c r12, ai.f r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.f.G(ai.c, ai.f, int, int):int");
    }

    public int H() {
        if (this.f17829r == null || "\n".equals(this.f479a.getText())) {
            return 0;
        }
        return (int) (-this.f17829r.ascent());
    }

    public final int J() {
        try {
            ai.e j10 = this.f489l.j().j();
            if (j10 instanceof c) {
                j10 = j10.j().j().j();
            }
            if (j10 instanceof k) {
                return ((k) j10).f17858q;
            }
            if (j10 instanceof q) {
                return -1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public float K() {
        float f10 = 0.0f;
        if (this.f17829r == null) {
            return 0.0f;
        }
        String substring = this.f479a.getText().substring((int) (this.f487j - this.f479a.b()), (int) (this.f488k - this.f479a.b()));
        float[] fArr = new float[substring.length()];
        this.f17829r.getTextWidths(substring, fArr);
        for (int i10 = 0; i10 < substring.length(); i10++) {
            f10 += fArr[i10];
        }
        return f10;
    }

    public void L(zh.h hVar, zh.h hVar2) {
        String str;
        Paint paint = this.f17829r;
        if (paint == null) {
            this.f17829r = new Paint();
        } else {
            paint.reset();
        }
        sg.d.b(this.f17829r);
        this.f17829r.setAntiAlias(true);
        if (this.f17828q == null) {
            this.f17828q = new ai.b();
        }
        zh.b bVar = zh.b.f32374b;
        ai.b bVar2 = this.f17828q;
        zh.f d10 = hVar2.d();
        zh.f d11 = hVar.d();
        bVar.getClass();
        zh.b.a(bVar2, d10, d11);
        if (!hVar.getText().matches("[\\s\\S]*[\\u0600-\\u06ff\\u0750-\\u077f][\\s\\S]*") && !this.f17828q.f497f) {
            this.f17827p = false;
        } else {
            this.f17827p = true;
            lib.zj.office.system.f fVar = this.f17830s;
            if (fVar != null && fVar.s() != null) {
                this.f17830s.s().H0();
            }
        }
        if (!androidx.activity.s.f1865t && !TextUtils.isEmpty(hVar.getText()) && !TextUtils.equals(hVar.getText(), "\n")) {
            androidx.activity.s.f1865t = true;
            lib.zj.office.system.f fVar2 = this.f17830s;
            if (fVar2 != null && fVar2.s() != null) {
                this.f17830s.s().k0();
            }
        }
        if (this.f17827p) {
            this.f479a = hVar2;
        } else {
            this.f479a = hVar;
        }
        ai.b bVar3 = this.f17828q;
        boolean z10 = bVar3.f496e;
        if (z10 && bVar3.f498g) {
            this.f17829r.setTextSkewX(-0.2f);
            this.f17829r.setFakeBoldText(true);
        } else if (z10) {
            this.f17829r.setFakeBoldText(true);
        } else if (bVar3.f498g) {
            this.f17829r.setTextSkewX(-0.25f);
        }
        Paint paint2 = this.f17829r;
        w1.f b10 = w1.f.b();
        int i10 = this.f17828q.f494b;
        if (((LinkedHashMap) b10.c) == null) {
            b10.c = new LinkedHashMap();
        }
        String str2 = "sans-serif";
        if (i10 < 0) {
            str = "sans-serif";
        } else {
            str = (String) ((List) b10.f30907b).get(i10);
        }
        if (str != null) {
            str2 = str;
        }
        Typeface typeface = (Typeface) ((LinkedHashMap) b10.c).get(str2);
        if (typeface == null) {
            typeface = Typeface.create(str2, 0);
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            ((LinkedHashMap) b10.c).put(str2, typeface);
        }
        paint2.setTypeface(typeface);
        ai.b bVar4 = this.f17828q;
        if (bVar4.f503l > 0) {
            this.f17829r.setTextSize((((bVar4.c / 100.0f) * bVar4.f493a) * 1.3333334f) / 2.0f);
        } else {
            this.f17829r.setTextSize((bVar4.c / 100.0f) * bVar4.f493a * 1.3333334f);
        }
        this.f17829r.setColor(this.f17828q.f495d);
    }

    public final Object clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // ai.a, ai.e
    public void dispose() {
        super.dispose();
        this.f17829r = null;
        this.f17828q = null;
        this.f17830s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01e8 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000b, B:10:0x0031, B:19:0x0062, B:21:0x0066, B:23:0x006a, B:24:0x008d, B:26:0x00a1, B:27:0x00b6, B:30:0x00d8, B:33:0x00e6, B:35:0x00ea, B:37:0x00f0, B:48:0x011b, B:49:0x0121, B:59:0x014a, B:61:0x0159, B:63:0x016e, B:125:0x0262, B:127:0x0288, B:129:0x028c, B:138:0x02da, B:130:0x02b6, B:137:0x02cc, B:66:0x0182, B:70:0x018e, B:71:0x0195, B:77:0x01a6, B:79:0x01aa, B:81:0x01b0, B:83:0x01b8, B:85:0x01be, B:89:0x01d5, B:91:0x01dd, B:93:0x01e8, B:110:0x020c, B:112:0x0213, B:115:0x021a, B:116:0x021f, B:118:0x022f, B:120:0x0248, B:124:0x025b, B:123:0x0257, B:86:0x01ca, B:76:0x01a3, B:38:0x00f7, B:40:0x00fb, B:41:0x00fe, B:43:0x0102, B:44:0x0113, B:55:0x0135, B:57:0x0139, B:12:0x0035, B:14:0x0039, B:16:0x003d, B:18:0x0048, B:17:0x0043), top: B:146:0x0005 }] */
    @Override // ai.a, ai.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void g(android.graphics.Canvas r26, int r27, int r28, float r29) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.f.g(android.graphics.Canvas, int, int, float):void");
    }

    @Override // ai.e
    public short getType() {
        return (short) 7;
    }

    public f(lib.zj.office.system.f fVar, zh.h hVar, zh.h hVar2) {
        this.f17830s = fVar;
        L(hVar2, hVar);
    }
}
