package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import eh.g;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.f;

/* compiled from: BackgroundDrawer.java */
/* loaded from: classes.dex */
public final class a {
    public static boolean a(Canvas canvas, f fVar, int i10, eh.b bVar, Rect rect, float f10) {
        return b(canvas, fVar, i10, bVar, rect, f10, d.f29801b.a());
    }

    public static boolean b(Canvas canvas, f fVar, int i10, eh.b bVar, Rect rect, float f10, Paint paint) {
        float f11;
        float f12;
        float f13;
        float f14;
        if (bVar != null) {
            canvas.save();
            if (bVar.f16569a && fVar != null && (fVar.getView() instanceof Presentation)) {
                canvas.clipRect(rect);
                canvas.rotate(0.0f);
                Dimension dimension = ((Presentation) fVar.getView()).getPGModel().c;
                rect.set(0, 0, (int) (dimension.width * f10), (int) (dimension.height * f10));
            }
            switch (bVar.c) {
                case 0:
                    int color = paint.getColor();
                    paint.setColor(bVar.f16571d);
                    canvas.drawRect(rect, paint);
                    paint.setColor(color);
                    canvas.restore();
                    return true;
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                    c(canvas, fVar, i10, bVar, rect, null, f10, null, paint);
                    canvas.restore();
                    return true;
                case 3:
                    float f15 = rect.left;
                    float f16 = rect.top;
                    float width = rect.width();
                    float height = rect.height();
                    kh.c cVar = bVar.f16570b;
                    if (cVar != null) {
                        float f17 = cVar.f19759a;
                        float f18 = (f17 * width) + f15;
                        float f19 = cVar.c;
                        float f20 = ((1.0f - f17) - cVar.f19760b) * width;
                        f14 = f18;
                        f11 = (f19 * height) + f16;
                        f12 = ((1.0f - f19) - cVar.f19761d) * height;
                        f13 = f20;
                    } else {
                        f11 = f16;
                        f12 = height;
                        f13 = width;
                        f14 = f15;
                    }
                    jh.c.f19238d.g(canvas, fVar, i10, bVar.a(fVar), f14, f11, f10, f13, f12, null, null);
                    canvas.restore();
                    return true;
                default:
                    canvas.restore();
                    break;
            }
        }
        return false;
    }

    public static synchronized void c(Canvas canvas, f fVar, int i10, eh.b bVar, Rect rect, qh.d dVar, float f10, Path path, Paint paint) {
        float f11;
        float f12;
        synchronized (a.class) {
            eh.a b10 = bVar.b();
            if (b10 != null) {
                if (b10 instanceof eh.d) {
                    float strokeWidth = paint.getStrokeWidth();
                    if (Math.abs(rect.left - rect.right) <= strokeWidth) {
                        float f13 = strokeWidth / 2.0f;
                        rect.set(Math.round(rect.left - f13), Math.round(rect.top), Math.round(rect.right + f13), Math.round(rect.bottom));
                    } else if (Math.abs(rect.top - rect.bottom) <= strokeWidth) {
                        float f14 = strokeWidth / 2.0f;
                        rect.set(Math.round(rect.left), Math.round(rect.top - f14), Math.round(rect.right), Math.round(rect.bottom + f14));
                    }
                }
                Shader shader = b10.f16568b;
                if (shader == null) {
                    float f15 = 1.0f / f10;
                    shader = b10.a(fVar, i10, new Rect(Math.round(rect.left * f15), Math.round(rect.top * f15), Math.round(rect.right * f15), Math.round(rect.bottom * f15)));
                    if (shader == null) {
                        return;
                    }
                }
                Matrix matrix = new Matrix();
                float f16 = rect.left;
                float f17 = rect.top;
                if (b10 instanceof g) {
                    g gVar = (g) b10;
                    f16 += gVar.f16585h * f10;
                    f17 += gVar.f16586i * f10;
                    matrix.postScale(f10, f10);
                } else if (!(b10 instanceof eh.e)) {
                    if (b10 instanceof eh.d) {
                        eh.d dVar2 = (eh.d) b10;
                        if (((int) dVar2.f16576f) == 90) {
                            int i11 = dVar2.f16575e;
                            if (i11 != -50) {
                                if (i11 != 0) {
                                    if (i11 != 50) {
                                        if (i11 != 100) {
                                        }
                                        f11 = 0.0f;
                                        f12 = 0.0f;
                                        f16 = (f11 * rect.width()) + f16;
                                        f17 = (f12 * rect.height()) + f17;
                                    }
                                    f11 = -0.5f;
                                    f12 = f11;
                                    f16 = (f11 * rect.width()) + f16;
                                    f17 = (f12 * rect.height()) + f17;
                                }
                                f11 = 1.0f;
                                f12 = 1.0f;
                                f16 = (f11 * rect.width()) + f16;
                                f17 = (f12 * rect.height()) + f17;
                            }
                            f11 = 0.5f;
                            f12 = f11;
                            f16 = (f11 * rect.width()) + f16;
                            f17 = (f12 * rect.height()) + f17;
                        } else {
                            int i12 = dVar2.f16575e;
                            if (i12 != -50) {
                                if (i12 != 0) {
                                    if (i12 != 50) {
                                        if (i12 != 100) {
                                        }
                                        f11 = 0.0f;
                                        f12 = 0.0f;
                                        f16 = (f11 * rect.width()) + f16;
                                        f17 = (f12 * rect.height()) + f17;
                                    }
                                    f11 = 0.5f;
                                    f12 = f11;
                                    f16 = (f11 * rect.width()) + f16;
                                    f17 = (f12 * rect.height()) + f17;
                                }
                                f11 = 1.0f;
                                f12 = 1.0f;
                                f16 = (f11 * rect.width()) + f16;
                                f17 = (f12 * rect.height()) + f17;
                            }
                            f11 = -0.5f;
                            f12 = f11;
                            f16 = (f11 * rect.width()) + f16;
                            f17 = (f12 * rect.height()) + f17;
                        }
                    }
                    matrix.postScale(rect.width() / 100.0f, rect.height() / 100.0f);
                }
                matrix.postTranslate(f16, f17);
                shader.setLocalMatrix(matrix);
                paint.setShader(shader);
                int i13 = b10.f16567a;
                if (dVar != null) {
                    i13 = (int) ((dVar.e().f29343a / 255.0f) * i13);
                }
                paint.setAlpha(i13);
                Shader shader2 = paint.getShader();
                if (shader2 != null) {
                    float f18 = rect.right - rect.left;
                    float f19 = rect.bottom - rect.top;
                    if (f18 > 0.0f && f19 > 0.0f) {
                        Bitmap createBitmap = Bitmap.createBitmap((int) Math.ceil(f18), (int) Math.ceil(f19), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        Paint paint2 = new Paint();
                        paint2.setShader(shader2);
                        canvas2.drawRect(0.0f, 0.0f, f18, f19, paint2);
                        Matrix matrix2 = new Matrix();
                        matrix2.postScale(1.0f, 1.0f);
                        matrix2.postTranslate(rect.left, rect.top);
                        canvas.drawBitmap(createBitmap, matrix2, paint);
                    }
                } else if (path != null) {
                    canvas.drawPath(path, paint);
                } else {
                    canvas.drawRect(rect, paint);
                }
                paint.setShader(null);
            }
        }
    }

    public static void d(Canvas canvas, f fVar, int i10, lh.b bVar, Rect rect, float f10) {
        if (bVar == null) {
            return;
        }
        if (bVar.p()) {
            Paint a10 = d.f29801b.a();
            a10.setStyle(Paint.Style.STROKE);
            a10.setStrokeWidth(bVar.f20610k.f17806a * f10);
            b(canvas, fVar, i10, bVar.f20610k.f17807b, rect, f10, a10);
        }
        eh.b bVar2 = bVar.f20603d;
        if (bVar2 != null) {
            a(canvas, fVar, i10, bVar2, rect, f10);
        }
    }

    public static void e(Canvas canvas, f fVar, int i10, eh.b bVar, Rect rect, qh.d dVar, float f10, Path path, Paint paint) {
        float f11;
        float f12;
        float f13;
        float f14;
        if (bVar == null) {
            return;
        }
        canvas.save();
        if (bVar.f16569a && fVar != null && (fVar.getView() instanceof Presentation)) {
            canvas.clipRect(rect);
            canvas.rotate(0.0f);
            Dimension dimension = ((Presentation) fVar.getView()).getPGModel().c;
            rect.set(0, 0, (int) (dimension.width * f10), (int) (dimension.height * f10));
        }
        switch (bVar.c) {
            case 0:
                paint.setColor(bVar.f16571d);
                if (dVar != null) {
                    paint.setAlpha((int) ((dVar.e().f29343a / 255.0f) * ((bVar.f16571d >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC)));
                }
                canvas.drawPath(path, paint);
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                c(canvas, fVar, i10, bVar, rect, dVar, f10, path, paint);
                break;
            case 3:
                canvas.clipPath(path);
                float f15 = rect.left;
                float f16 = rect.top;
                float width = rect.width();
                float height = rect.height();
                kh.c cVar = bVar.f16570b;
                if (cVar != null) {
                    float f17 = cVar.f19759a;
                    float f18 = (f17 * width) + f15;
                    float f19 = cVar.c;
                    float f20 = ((1.0f - f17) - cVar.f19760b) * width;
                    f14 = f18;
                    f12 = (f19 * height) + f16;
                    f11 = ((1.0f - f19) - cVar.f19761d) * height;
                    f13 = f20;
                } else {
                    f11 = height;
                    f12 = f16;
                    f13 = width;
                    f14 = f15;
                }
                jh.c.f19238d.g(canvas, fVar, i10, bVar.a(fVar), f14, f12, f10, f13, f11, null, dVar);
                break;
        }
        canvas.restore();
    }
}
