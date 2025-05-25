package sp;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import lib.zj.office.PathHolder;

/* compiled from: LayoutCanvas.java */
/* loaded from: classes3.dex */
public final class c extends Canvas implements rg.a {

    /* renamed from: a  reason: collision with root package name */
    public final qp.b f29843a;

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f29844b;
    public qp.c c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedList<Matrix> f29845d;

    static {
        ea.a.p("A2FIbwx0dGE0ditz", "EhfzcZTM");
    }

    public c(Bitmap bitmap, qp.b bVar) {
        super(bitmap);
        this.f29844b = new Matrix();
        LinkedList<Matrix> linkedList = new LinkedList<>();
        this.f29845d = linkedList;
        this.f29843a = bVar;
        linkedList.push(new Matrix());
    }

    @Override // rg.a
    public final void a(int i10, float f10, float f11) {
        qp.b bVar = this.f29843a;
        this.c = new qp.c(bVar, f10, f11);
        bVar.f29418g++;
    }

    @Override // rg.a
    public final void b() {
        qp.c cVar = this.c;
        if (cVar != null) {
            this.f29843a.a(cVar, true);
            this.c = null;
        }
    }

    public final Matrix c() {
        LinkedList<Matrix> linkedList = this.f29845d;
        Matrix peek = linkedList.peek();
        if (peek == null) {
            Matrix matrix = new Matrix();
            linkedList.push(matrix);
            return matrix;
        }
        return peek;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        boolean clipPath = super.clipPath(path);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null && (path instanceof PathHolder)) {
            try {
                cVar.f29423d.add(new rp.d((PathHolder) path, matrix));
            } catch (Exception e10) {
                ea.a.p("LGxYcClhQ2hgIA==", "zDUMjIgo");
                e10.getMessage();
            }
        } else {
            ea.a.p("LGxYcClhQ2go", "Yuk3NGPL");
            Objects.toString(path);
            ea.a.p("ZixcIA==", "whnMJkUr");
            matrix.toShortString();
        }
        return clipPath;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        boolean clipRect = super.clipRect(f10, f11, f12, f13);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.a(f10, f11, f12, f13, matrix);
        } else {
            ea.a.p("LGxYcCtlVHQo", "QzeQxvnw");
            ea.a.p("HyA=", "GsSblsQg");
            ea.a.p("HyA=", "54I7qbYN");
            ea.a.p("WyA=", "dYwyQ99H");
            ea.a.p("GiwmIA==", "89S5lFs1");
            matrix.toShortString();
        }
        return clipRect;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        super.concat(matrix);
        c().preConcat(matrix);
    }

    public final void d(Matrix matrix) {
        matrix.set(c());
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        super.drawARGB(i10, i11, i12, i13);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdzJSJUIo", "lbyEYPSh");
        ea.a.p("HyA=", "zWSYWEeF");
        ea.a.p("HyA=", "T8tm0K08");
        ea.a.p("HyA=", "5P6gNsRG");
        ea.a.p("ZixcIA==", "Qin6QdjR");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        super.drawArc(rectF, f10, f11, z10, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        if (this.c != null) {
            PathHolder pathHolder = new PathHolder();
            pathHolder.addArc(rectF, f10, f11);
            if (z10) {
                pathHolder.lineTo(rectF.centerX(), rectF.centerY());
                pathHolder.close();
            }
            this.c.c(pathHolder, paint, matrix);
            return;
        }
        ea.a.p("K3JQdzhyVCg=", "n2UrvQnw");
        Objects.toString(rectF);
        ea.a.p("eCA=", "Q9TJNFqp");
        ea.a.p("VSA=", "gtyfrQ7P");
        ea.a.p("WyA=", "qTwcdWYH");
        ea.a.p("GiwmIA==", "eSqCsBrI");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        super.drawBitmap(bitmap, matrix, paint);
        Matrix matrix2 = this.f29844b;
        d(matrix2);
        if (this.c != null) {
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            matrix2.preConcat(matrix);
            this.c.b(bitmap, rectF, paint, matrix2);
            return;
        }
        ea.a.p("V3IqdzFpFm0TcCg=", "eva4aCaD");
        Objects.toString(bitmap);
        ea.a.p("LA==", "qOIMCioI");
        matrix.toShortString();
        ea.a.p("KQ==", "nXsfOWuE");
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        super.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdzFpFm0TcHllGmgo", "P5Uy4lRl");
        Objects.toString(bitmap);
        ea.a.p("HiA=", "7W2RsZMr");
        ea.a.p("SyA=", "yPg9CCne");
        ea.a.p("HyA=", "SO3sygpA");
        ea.a.p("SCA=", "yId988NG");
        ea.a.p("ayA=", "4mG7lE8Z");
        ea.a.p("YyA=", "VmJkpgLz");
        ea.a.p("QiwrIA==", "7PkF4OyI");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        super.drawCircle(f10, f11, f12, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("MXJWdw5pGWMkZSg=", "7lU7MknM");
        ea.a.p("YyA=", "ngzTorCC");
        ea.a.p("HyA=", "k569N0Pz");
        ea.a.p("ZiwJIA==", "BqOdbNGo");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10) {
        super.drawColor(i10);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.getClass();
            try {
                cVar.f29423d.add(new rp.g(0.0f, 0.0f, cVar.f29421a, cVar.f29422b, 2, 0.0f, i10, new Matrix()));
                return;
            } catch (Exception e10) {
                ea.a.p("K3JQdzpvW28oOiA=", "yGeBKirW");
                e10.getMessage();
                return;
            }
        }
        ea.a.p("KHI4dxRvK286KA==", "MHLYWGp8");
        ea.a.p("HywoIA==", "Lt6EVb9e");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        super.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("DXIQdylvGmIkZTRvQW4zUl1jJig=", "Heiqmob3");
        Objects.toString(rectF);
        ea.a.p("YyA=", "JTv2GDE1");
        ea.a.p("ZCA=", "nWHLgdji");
        ea.a.p("HyA=", "ThQa9ayL");
        Objects.toString(rectF2);
        ea.a.p("HyA=", "S6gMQ7ry");
        ea.a.p("HyA=", "2jy5jPRE");
        ea.a.p("GiwmIA==", "Y5iShcAV");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        super.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdz5sTnAycyg=", "yZLrhkdd");
        ea.a.p("FSA=", "ce9eNkzo");
        ea.a.p("RSA=", "lrizR1E7");
        ea.a.p("YyA=", "ivmLsfUB");
        ea.a.p("YyA=", "ZdonrXmN");
        ea.a.p("RiA=", "cqj36niP");
        Objects.toString(font);
        ea.a.p("GiwmIA==", "ESoWtIM5");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        super.drawLine(f10, f11, f12, f13, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.getClass();
            try {
                cVar.f29423d.add(new rp.c(f10, f11, f12, f13, paint.getStrokeWidth(), paint.getColor(), matrix));
                return;
            } catch (Exception e10) {
                ea.a.p("K3JQdzVpWWVgIA==", "vxObOrxi");
                e10.getMessage();
                return;
            }
        }
        ea.a.p("MnIndwhpB2Uo", "mOVFDiTH");
        ea.a.p("HyA=", "kbNUa640");
        ea.a.p("HyA=", "nhGq2j5q");
        ea.a.p("HyA=", "P5eRZQqc");
        ea.a.p("GiwmIA==", "hMPbKd0C");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        super.drawLines(fArr, i10, i11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3Iqdz9pDGUBKA==", "iyyGwwO5");
        ea.a.p("fiA=", "qHRkXnJM");
        ea.a.p("FSA=", "bz9jHzWq");
        ea.a.p("ZixcIA==", "6bsLUt8e");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        super.drawOval(rectF, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdzZ2Vmwo", "mpCTD6tK");
        Objects.toString(rectF);
        ea.a.p("XSxZIA==", "AJt4MNEq");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        super.drawPaint(paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdyNhC24GKA==", "Zguj1S8Q");
        Objects.toString(paint);
        ea.a.p("GiwmIA==", "D47anrXS");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        super.drawPatch(ninePatch, rect, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdylhQ2MyKA==", "6ypcRRud");
        Objects.toString(ninePatch);
        ea.a.p("YyA=", "v7OiTtCq");
        Objects.toString(rect);
        ea.a.p("GiwmIA==", "gm6SkXRO");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        super.drawPath(path, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null && (path instanceof PathHolder)) {
            cVar.c((PathHolder) path, paint, matrix);
            return;
        }
        ea.a.p("K3JQdylhQ2go", "FTMOZvNu");
        Objects.toString(path);
        ea.a.p("ZixcIA==", "VsC4crsJ");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        super.drawPicture(picture);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("UHIMd2NpFnQ9cgMo", "9e4m3uGo");
        Objects.toString(picture);
        ea.a.p("GiwmIA==", "WyPZES6g");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f10, float f11, Paint paint) {
        super.drawPoint(f10, f11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdyNvC24GKA==", "gB29YMST");
        ea.a.p("HyA=", "wa5601PR");
        ea.a.p("GiwmIA==", "GS2qqvWo");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        super.drawPoints(fArr, i10, i11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("KXIWdx5vW248cyg=", "87MwN2ns");
        ea.a.p("WSA=", "97utrFVb");
        ea.a.p("YyA=", "nGO4jmif");
        ea.a.p("GiwmIA==", "ah83Ca0G");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        super.drawPosText(cArr, i10, i11, fArr, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdyNvEVQXeEAo", "UbEWrayO");
        ea.a.p("TiA=", "9FbYqCpM");
        ea.a.p("HyA=", "cqOVaxhY");
        ea.a.p("aSA=", "rcE8CHDt");
        ea.a.p("GiwmIA==", "IzpaNkfS");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i10, int i11, int i12) {
        super.drawRGB(i10, i11, i12);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdytHdSg=", "tXAFIGyi");
        ea.a.p("XSA=", "wnqYOW4B");
        ea.a.p("HyA=", "wUbSUHYn");
        ea.a.p("ZixcIA==", "eczmGy6s");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        super.drawRect(rect, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.d(rect.left, rect.top, rect.right, rect.bottom, paint, matrix);
            return;
        }
        ea.a.p("C3IUdxhlVHQo", "NFouJ7so");
        Objects.toString(rect);
        ea.a.p("GiwmIA==", "YEZRS3qi");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        super.drawRenderNode(renderNode);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("L3Izd2RlJmQtcihvUGUo", "t8KR6HjU");
        Objects.toString(renderNode);
        ea.a.p("SiwqIA==", "RzcGxzhq");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        super.drawRoundRect(rectF, f10, f11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdyFvF24WUlFjHSg=", "i054sfs2");
        Objects.toString(rectF);
        ea.a.p("YyA=", "MveR1jCF");
        ea.a.p("XSA=", "MTqdCV44");
        ea.a.p("HywrIA==", "676FmgcW");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        super.drawText(str, i10, i11, f10, f11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        String substring = str.substring(i10, i11);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.e(substring, f10, f11, paint, matrix);
            return;
        }
        ea.a.p("V3IqdydlGnQo", "y0HvddX7");
        ea.a.p("HyA=", "2SGrubIx");
        ea.a.p("HyA=", "eebzTx56");
        ea.a.p("GiwmIA==", "Hj3Tn0Iw");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        super.drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdydlGnQ9bmRhHWgo", "ZYHyUv08");
        ea.a.p("HyA=", "5QRs1HFz");
        ea.a.p("YyA=", "KUh8eDij");
        ea.a.p("HyA=", "5atSw3qo");
        Objects.toString(path);
        ea.a.p("YyA=", "M2QPPDmW");
        ea.a.p("QSA=", "oImMv922");
        ea.a.p("GiwmIA==", "sDIK7VaC");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        super.drawTextRun(cArr, i10, i11, i12, i13, f10, f11, z10, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdydlGnQgdVoo", "posSYzbR");
        ea.a.p("YyA=", "ppKWl8De");
        ea.a.p("YyA=", "vtgQoIx3");
        ea.a.p("SCA=", "t9dmFmMM");
        ea.a.p("ZiA=", "PIJi7dAO");
        ea.a.p("YyA=", "ooCZGWXE");
        ea.a.p("eCA=", "FwT3gHXK");
        ea.a.p("HyA=", "YMfHaGIk");
        ea.a.p("ZixcIA==", "eJjXhVEY");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        super.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("AnIQdwRlEHQhYwNzKA==", "L1fqRb1B");
        Objects.toString(vertexMode);
        ea.a.p("HyA=", "s5O4pttq");
        ea.a.p("YyA=", "QzDcIPYI");
        ea.a.p("HyA=", "twlSBAf6");
        ea.a.p("YyA=", "t6hrIpFv");
        ea.a.p("YyA=", "4kXAVodd");
        ea.a.p("HiA=", "A12N7tbo");
        ea.a.p("HyA=", "QQvJSdhw");
        ea.a.p("YyA=", "WWzgbwud");
        ea.a.p("VCA=", "oexvGZqX");
        ea.a.p("HyA=", "7c5sp9cm");
        ea.a.p("GiwmIA==", "lSNjumcj");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        super.restore();
        this.f29845d.pop();
        ea.a.p("PWVCdBZyUiA3YT5yHHhSIA==", "pRPi88sd");
        this.f29844b.toShortString();
        qp.c cVar = this.c;
        if (cVar != null) {
            LinkedList<Integer> linkedList = cVar.f29424e;
            ArrayList<qp.a> arrayList = cVar.f29423d;
            linkedList.add(Integer.valueOf((-arrayList.size()) - 1));
            Iterator<Integer> descendingIterator = linkedList.descendingIterator();
            int i10 = 0;
            do {
                int i11 = -1;
                while (descendingIterator.hasNext()) {
                    int intValue = descendingIterator.next().intValue();
                    if (intValue < 0) {
                        i10++;
                    } else {
                        i10--;
                    }
                    int abs = Math.abs(intValue) - 1;
                    if (i10 == 1) {
                        i11 = abs;
                    } else if (i10 == 0 || i10 == 2) {
                        if (i11 > 0) {
                            while (abs < i11) {
                                qp.a aVar = arrayList.get(abs);
                                if ((aVar instanceof rp.f) || (aVar instanceof rp.d)) {
                                    arrayList.add(new rp.b());
                                }
                                abs++;
                            }
                        }
                    }
                }
                return;
            } while (i10 != 0);
            return;
        }
        ea.a.p("cj4g", "yUoIQB3d");
        getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i10) {
        super.restoreToCount(i10);
        ea.a.p("SmU5dFZyNVQnQwl1WnQo", "kb8J9PUk");
        ea.a.p("KQ==", "igLl6EJu");
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f10) {
        super.rotate(f10);
        c().preRotate(f10);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        int save = super.save();
        Matrix matrix = new Matrix(c());
        this.f29845d.push(matrix);
        ea.a.p("BGEfZRltKHQ6aR46IA==", "pRwi9I4h");
        matrix.toShortString();
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.f29424e.add(Integer.valueOf(cVar.f29423d.size() + 1));
        } else {
            ea.a.p("Dz0g", "oA3p95HY");
        }
        return save;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f10, float f11) {
        super.scale(f10, f11);
        c().preScale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        super.setMatrix(matrix);
        c().set(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f10, float f11) {
        super.skew(f10, f11);
        c().preSkew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f10, float f11) {
        super.translate(f10, f11);
        c().preTranslate(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        super.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdzdvF2IeZWZvHG4yUiFjRig=", "vVCm0HLf");
        Objects.toString(rectF);
        ea.a.p("YyA=", "GnZgelnx");
        ea.a.p("YyA=", "J3IldXNn");
        Objects.toString(rectF2);
        ea.a.p("GyA=", "Kv7gZgRj");
        ea.a.p("aiwIIA==", "qlCe3OWJ");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        super.drawLines(fArr, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdzVpWWUpKA==", "bhoGbvMg");
        ea.a.p("ZixcIA==", "DpZugrVV");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        super.drawOval(f10, f11, f12, f13, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdzZ2Vmwo", "1jglTVlL");
        ea.a.p("YyA=", "frhQp4tZ");
        ea.a.p("YyA=", "dcUkFwzG");
        ea.a.p("YyA=", "Ru2lD1WM");
        ea.a.p("RSwFIA==", "3tlhh7bu");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        super.drawPatch(ninePatch, rectF, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("MXIrd2FhLGMgKA==", "1iUJ1XH9");
        Objects.toString(ninePatch);
        ea.a.p("YyA=", "yFFIIcrv");
        Objects.toString(rectF);
        ea.a.p("ZixcIA==", "2G1MT16R");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        super.drawPicture(picture, rectF);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdyNpAXQHclEo", "5ZBucCm9");
        Objects.toString(picture);
        ea.a.p("HyA=", "DX3GlL9Y");
        Objects.toString(rectF);
        ea.a.p("ZixcIA==", "1Jv2MsQj");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        super.drawPoints(fArr, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdyNvC24Gcyg=", "r4vazmzL");
        ea.a.p("cSwcIA==", "XeXqybTK");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        super.drawPosText(str, fArr, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdyNvEVQXeEAo", "ic1T5LpC");
        ea.a.p("WCA=", "9LtMOEYJ");
        ea.a.p("RCw9IA==", "yImPb7kV");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        super.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("LnIjdxpvI24sUgNjQCg=", "VGJBHVyO");
        ea.a.p("HyA=", "nnLxJlSD");
        ea.a.p("FCA=", "Ht8s6zQK");
        ea.a.p("HyA=", "9WLOwAN0");
        ea.a.p("HyA=", "brFSNYfK");
        ea.a.p("YyA=", "1ZPDNO1p");
        ea.a.p("ZixcIA==", "MiIfdCPD");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        super.drawTextOnPath(str, path, f10, f11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdy1lT3QVbhphAWgo", "QCCe8oIC");
        ea.a.p("YyA=", "vNdiypvZ");
        Objects.toString(path);
        ea.a.p("HSA=", "uf17DgB2");
        ea.a.p("YyA=", "vELfkedt");
        ea.a.p("ZixcIA==", "2DQAWPIm");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        super.drawTextRun(charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdy1lT3QIdSQo", "Ru2pFzr6");
        Objects.toString(charSequence);
        ea.a.p("SCA=", "nWd7Nbr9");
        ea.a.p("YCA=", "mzLo7BbR");
        ea.a.p("YyA=", "4gY1ydvp");
        ea.a.p("HyA=", "2a2zGgBW");
        ea.a.p("YyA=", "OMCeodvL");
        ea.a.p("HyA=", "QStQJheN");
        ea.a.p("YyA=", "vVtRz1hm");
        ea.a.p("UCwcIA==", "hjyqW9GB");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        boolean clipRect = super.clipRect(rectF);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom, matrix);
        } else {
            ea.a.p("LGxYcCtlVHQo", "LIOdfgNC");
            Objects.toString(rectF);
            ea.a.p("GiwmIA==", "jgH9v5AZ");
            matrix.toShortString();
        }
        return clipRect;
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        super.drawRect(rectF, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.d(rectF.left, rectF.top, rectF.right, rectF.bottom, paint, matrix);
            return;
        }
        ea.a.p("K3JQdytlVHQo", "k1pswCtP");
        Objects.toString(rectF);
        ea.a.p("GiwmIA==", "QgQ0t7vu");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        super.drawPicture(picture, rect);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdylpVHQvci8o", "V8WhMQBT");
        Objects.toString(picture);
        ea.a.p("HyA=", "Mn5CeEiE");
        Objects.toString(rect);
        ea.a.p("ZixcIA==", "nO4ZnWTQ");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f10, float f11, Paint paint) {
        super.drawText(str, f10, f11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.e(str, f10, f11, paint, matrix);
            return;
        }
        ea.a.p("V3IqdydlGnQo", "Fpbjyagg");
        ea.a.p("YyA=", "4ngQvTbG");
        ea.a.p("HyA=", "fgO6auP2");
        ea.a.p("Ryw9IA==", "i7nPXM8B");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        super.drawTextRun(measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdydlGnQgdVoo", "242daQt9");
        Objects.toString(measuredText);
        ea.a.p("YyA=", "1ZWiNBVC");
        ea.a.p("fCA=", "RsP2YHOz");
        ea.a.p("SCA=", "G6dtlA76");
        ea.a.p("HyA=", "REqOaCQS");
        ea.a.p("RiA=", "lBj7nbvm");
        ea.a.p("biA=", "lzBkn7gP");
        ea.a.p("HyA=", "waRtuMUy");
        ea.a.p("WiwUIA==", "2xsyrJAq");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op2) {
        boolean clipPath = super.clipPath(path, op2);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null && (path instanceof PathHolder)) {
            try {
                cVar.f29423d.add(new rp.d((PathHolder) path, matrix));
            } catch (Exception e10) {
                ea.a.p("LGxYcClhQ2hgIA==", "zDUMjIgo");
                e10.getMessage();
            }
        } else {
            ea.a.p("LGxYcClhQ2go", "6skNV8gz");
            Objects.toString(path);
            ea.a.p("HyA=", "Kc0lP3eZ");
            Objects.toString(op2);
            ea.a.p("GiwmIA==", "SburEeHp");
            matrix.toShortString();
        }
        return clipPath;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        super.drawBitmap(bitmap, f10, f11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        if (this.c != null) {
            this.c.b(bitmap, new RectF(f10, f11, bitmap.getWidth(), bitmap.getHeight()), paint, matrix);
            return;
        }
        ea.a.p("K3JQdztpQ207cCg=", "cAGLtRQ8");
        Objects.toString(bitmap);
        ea.a.p("FSA=", "m79GQEP7");
        ea.a.p("HyA=", "5fP6d5rq");
        ea.a.p("GiwLIA==", "xA3fFmL9");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10) {
        super.drawColor(j10);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdzBvDm8ATCg=", "aovC1Wcc");
        ea.a.p("ZixcIA==", "RGovBxGA");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        super.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdzhyVCg=", "FGjLxbBd");
        ea.a.p("YSA=", "nqMimktd");
        ea.a.p("HyA=", "DdJXCaco");
        ea.a.p("HyA=", "50d7eSNe");
        ea.a.p("HyA=", "HlBdbaQu");
        ea.a.p("HyA=", "a2FqJQF8");
        ea.a.p("ayA=", "VuGHnQQm");
        ea.a.p("ZixcIA==", "AwUBcgiP");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        boolean clipRect = super.clipRect(rect);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.a(rect.left, rect.top, rect.right, rect.bottom, matrix);
        } else {
            ea.a.p("UGwicCFlAXQo", "SuzV1RqP");
            Objects.toString(rect);
            ea.a.p("GiwmIA==", "3GlV25eR");
            matrix.toShortString();
        }
        return clipRect;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        super.drawColor(i10, mode);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdzBvDm8AKA==", "aPi8S6dc");
        ea.a.p("HyA=", "MnI7Z0l6");
        Objects.toString(mode);
        ea.a.p("GiwmIA==", "bgSU3ZF4");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        super.drawRect(f10, f11, f12, f13, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.d(f10, f11, f12, f13, paint, matrix);
            return;
        }
        ea.a.p("V3IqdyFlAXQo", "tbu55uM3");
        ea.a.p("HyA=", "5QfvxM1c");
        ea.a.p("HyA=", "K2SABCbA");
        ea.a.p("YyA=", "WrTdntkI");
        ea.a.p("GiwmIA==", "A6awuE4i");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        super.drawText(cArr, i10, i11, f10, f11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        String str = new String(cArr, i10, i11);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.e(str, f10, f11, paint, matrix);
            return;
        }
        ea.a.p("V3IqdydlGnQo", "moI57WmN");
        ea.a.p("YyA=", "PFkGTALX");
        ea.a.p("HyA=", "jbmumpSz");
        ea.a.p("ZixcIA==", "gTX4AowN");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        super.drawBitmap(bitmap, rect, rectF, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        if (this.c != null) {
            if (rect != null && (rect.left != 0 || rect.top != 0 || rect.right != bitmap.getWidth() || rect.bottom != bitmap.getHeight())) {
                ea.a.p("K3JQdztpQ207cGpzB2NIZUdyAXJlMV8g", "R3o232fP");
                rect.toString();
                ea.a.p("byEMIA==", "FK2niP3d");
                bitmap.getWidth();
                ea.a.p("eA==", "Mr4S6EY4");
                bitmap.getHeight();
            }
            this.c.b(bitmap, rectF, paint, matrix);
            return;
        }
        ea.a.p("K3JQdztpQ207cCg=", "IrjRc8jG");
        Objects.toString(bitmap);
        ea.a.p("eyA=", "sJWHwxnk");
        Objects.toString(rect);
        ea.a.p("YyA=", "K2iLVmfJ");
        Objects.toString(rectF);
        ea.a.p("GiwmIA==", "554ijtui");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, BlendMode blendMode) {
        super.drawColor(i10, blendMode);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("K3JQdzpvW28oKA==", "uknJgbzW");
        ea.a.p("bSA=", "FfAHzZPJ");
        Objects.toString(blendMode);
        ea.a.p("HiwaIA==", "Qe7wJPTt");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        boolean clipRect = super.clipRect(i10, i11, i12, i13);
        Matrix matrix = this.f29844b;
        d(matrix);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13, matrix);
        } else {
            ea.a.p("LGxYcCtlVHQo", "eRDeWJ6A");
            ea.a.p("YyA=", "pFfErc3U");
            ea.a.p("SiA=", "9KfGp48i");
            ea.a.p("GyA=", "467wT19r");
            ea.a.p("HiwIIA==", "7w7eEobQ");
            matrix.toShortString();
        }
        return clipRect;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10, BlendMode blendMode) {
        super.drawColor(j10, blendMode);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("DXImd3JvPW86TCg=", "CgiG1Q9d");
        ea.a.p("GCA=", "AZ4D7Uns");
        Objects.toString(blendMode);
        ea.a.p("GiwmIA==", "tSSQcKiZ");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        super.drawText(charSequence, i10, i11, f10, f11, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        String substring = charSequence.toString().substring(i10, i11);
        qp.c cVar = this.c;
        if (cVar != null) {
            cVar.e(substring, f10, f11, paint, matrix);
            return;
        }
        ea.a.p("U3JWdw1lEHRgQw5hRiA=", "CZ77Yhxb");
        ea.a.p("YyA=", "MVheIczB");
        ea.a.p("ZCA=", "EbHQR4u1");
        ea.a.p("YSwbIA==", "R1HvTuVV");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        super.drawBitmap(bitmap, rect, rect2, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        if (this.c != null) {
            RectF rectF = new RectF(rect2.left, rect2.top, rect2.right, rect2.bottom);
            if (rect != null && (rect.left != 0 || rect.top != 0 || rect.right != bitmap.getWidth() || rect.bottom != bitmap.getHeight())) {
                ea.a.p("V3IqdzFpFm0TcBRzG2N2ZTZyXXJmMnkg", "Q9qC04zJ");
                rect.toString();
                ea.a.p("RCFWIA==", "h7dkeKFg");
                bitmap.getWidth();
                ea.a.p("eA==", "GQ7OPkSq");
                bitmap.getHeight();
            }
            this.c.b(bitmap, rectF, paint, matrix);
            return;
        }
        ea.a.p("V3IqdzFpFm0TcCg=", "OELYQSKw");
        Objects.toString(bitmap);
        ea.a.p("HSA=", "EW1H7IZk");
        Objects.toString(rect);
        ea.a.p("YyA=", "JuuKpl8N");
        Objects.toString(rect2);
        ea.a.p("ZixcIA==", "drT6T1yO");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        super.drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z10, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("CHIudxNpHG0pcCg=", "BQlOQh9w");
        ea.a.p("YyA=", "XDvze38g");
        ea.a.p("VCA=", "v9xJyP7p");
        ea.a.p("YyA=", "FmvOCDGU");
        ea.a.p("QSA=", "VhmnD7xL");
        ea.a.p("YyA=", "b3yb2NeY");
        ea.a.p("HyA=", "cXdanjm1");
        ea.a.p("HyA=", "dn5f2xhf");
        ea.a.p("ZixcIA==", "OBeiBvyd");
        matrix.toShortString();
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        super.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
        Matrix matrix = this.f29844b;
        d(matrix);
        ea.a.p("V3IqdzFpFm0TcCg=", "ysKsQNSd");
        ea.a.p("YyA=", "FixXogK4");
        ea.a.p("biA=", "14BHlQFR");
        ea.a.p("HyA=", "K0ZyQhjK");
        ea.a.p("YyA=", "YDCUUudY");
        ea.a.p("QyA=", "1qoCsymv");
        ea.a.p("YyA=", "itw8NPfy");
        ea.a.p("YyA=", "zrv4o3Xc");
        ea.a.p("YCwvIA==", "OWIBtU9O");
        matrix.toShortString();
    }
}
