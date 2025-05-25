package ug;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import lh.d;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.dom4j.Element;

/* compiled from: LineArrowPathBuilder.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final PointF f30370a = new PointF();

    public static PathHolder a(float f10, float f11, float f12, float f13, float f14, float f15, byte b10) {
        float f16;
        float f17;
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            return new PathHolder();
                        }
                        PathHolder pathHolder = new PathHolder();
                        if (f13 == f11) {
                            float f18 = f14 / 2.0f;
                            pathHolder.moveTo(f10, f11 - f18);
                            pathHolder.lineTo(f12, f13);
                            pathHolder.lineTo(f10, f11 + f18);
                        } else if (f12 == f10) {
                            float f19 = f14 / 2.0f;
                            pathHolder.moveTo(f10 - f19, f11);
                            pathHolder.lineTo(f12, f13);
                            pathHolder.lineTo(f10 + f19, f11);
                        } else {
                            double atan = Math.atan((-1.0f) / ((f13 - f11) / (f12 - f10)));
                            double d10 = f14 / 2.0f;
                            float cos = (float) (Math.cos(atan) * d10);
                            float sin = (float) (Math.sin(atan) * d10);
                            pathHolder.moveTo(f10 + cos, f11 + sin);
                            pathHolder.lineTo(f12, f13);
                            pathHolder.lineTo(f10 - cos, f11 - sin);
                        }
                        return pathHolder;
                    }
                    PathHolder pathHolder2 = new PathHolder();
                    float f20 = f15 / 2.0f;
                    float f21 = f14 / 2.0f;
                    pathHolder2.addOval(new RectF(f12 - f20, f13 - f21, f12 + f20, f13 + f21), Path.Direction.CCW);
                    return pathHolder2;
                }
                PathHolder pathHolder3 = new PathHolder();
                if (f13 != f11 && f12 != f10) {
                    float f22 = f12 - f10;
                    double atan2 = Math.atan((-1.0f) / (f17 / f22));
                    float cos2 = (float) (Math.cos(atan2) * (f15 / 2.0f));
                    float sin2 = (float) (Math.sin(atan2) * (f14 / 2.0f));
                    pathHolder3.moveTo(f10, f11);
                    pathHolder3.lineTo(f12 + cos2, f13 + sin2);
                    pathHolder3.lineTo(f22 + f12, (f13 - f11) + f13);
                    pathHolder3.lineTo(f12 - cos2, f13 - sin2);
                } else {
                    float f23 = f15 / 2.0f;
                    pathHolder3.moveTo(f12 - f23, f13);
                    float f24 = f14 / 2.0f;
                    pathHolder3.lineTo(f12, f13 - f24);
                    pathHolder3.lineTo(f23 + f12, f13);
                    pathHolder3.lineTo(f12, f13 + f24);
                }
                pathHolder3.close();
                return pathHolder3;
            }
            PathHolder pathHolder4 = new PathHolder();
            pathHolder4.moveTo(f12, f13);
            if (f13 == f11) {
                float f25 = f14 / 2.0f;
                pathHolder4.lineTo(f10, f11 - f25);
                pathHolder4.lineTo(((f12 - f10) / 4.0f) + f10, f13);
                pathHolder4.lineTo(f10, f11 + f25);
            } else if (f12 == f10) {
                float f26 = f14 / 2.0f;
                pathHolder4.lineTo(f10 - f26, f11);
                pathHolder4.lineTo(f10, ((f13 - f11) / 4.0f) + f11);
                pathHolder4.lineTo(f10 + f26, f11);
            } else {
                float f27 = f12 - f10;
                double atan3 = Math.atan((-1.0f) / (f16 / f27));
                float cos3 = (float) (Math.cos(atan3) * (f15 / 2.0f));
                float sin3 = (float) (Math.sin(atan3) * (f14 / 2.0f));
                pathHolder4.lineTo(f10 + cos3, f11 + sin3);
                pathHolder4.lineTo((f27 / 4.0f) + f10, ((f13 - f11) / 4.0f) + f11);
                pathHolder4.lineTo(f10 - cos3, f11 - sin3);
            }
            pathHolder4.close();
            return pathHolder4;
        }
        PathHolder pathHolder5 = new PathHolder();
        pathHolder5.moveTo(f12, f13);
        if (f13 == f11) {
            float f28 = f14 / 2.0f;
            pathHolder5.lineTo(f10, f11 - f28);
            pathHolder5.lineTo(f10, f11 + f28);
        } else if (f12 == f10) {
            float f29 = f14 / 2.0f;
            pathHolder5.lineTo(f10 - f29, f11);
            pathHolder5.lineTo(f10 + f29, f11);
        } else {
            double atan4 = Math.atan((-1.0f) / ((f13 - f11) / (f12 - f10)));
            double d11 = f14 / 2.0f;
            float cos4 = (float) (Math.cos(atan4) * d11);
            float sin4 = (float) (Math.sin(atan4) * d11);
            pathHolder5.lineTo(f10 + cos4, f11 + sin4);
            pathHolder5.lineTo(f10 - cos4, f11 - sin4);
        }
        pathHolder5.close();
        return pathHolder5;
    }

    public static PointF b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        PointF pointF = new PointF();
        float f19 = 1.0f - f18;
        float f20 = f19 * f19 * f19;
        float f21 = f10 * f20;
        float f22 = f20 * f11;
        float f23 = 3.0f * f18;
        float f24 = f23 * f19 * f19;
        float f25 = f23 * f18 * f19;
        float f26 = f14 * f25;
        float f27 = f18 * f18 * f18;
        pointF.x = (f16 * f27) + f26 + (f12 * f24) + f21;
        float f28 = f27 * f17;
        pointF.y = f28 + (f25 * f15) + (f24 * f13) + f22;
        return pointF;
    }

    public static int c(int i10) {
        if (i10 < 3) {
            return 9;
        }
        return i10 * 3;
    }

    public static a d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, d dVar, int i10) {
        int i11;
        float f18;
        Boolean bool;
        a aVar = new a();
        if (i10 < 3) {
            i11 = 9;
        } else {
            i11 = i10 * 3;
        }
        int i12 = i11;
        int c = c(i10);
        float f19 = 0.9f;
        PointF b10 = b(f10, f11, f12, f13, f14, f15, f16, f17, 0.9f);
        int round = (int) Math.round(Math.sqrt(Math.pow(b10.y - f17, 2.0d) + Math.pow(b10.x - f16, 2.0d)));
        float f20 = 0.01f;
        Boolean bool2 = null;
        PointF pointF = b10;
        while (true) {
            int i13 = round - c;
            if (Math.abs(i13) <= 1 || f19 >= 1.0f || f19 <= 0.0f) {
                break;
            }
            if (i13 > 1) {
                f18 = f19 + f20;
                if (bool2 != null && !bool2.booleanValue()) {
                    f20 = (float) (f20 * 0.1d);
                    f18 -= f20;
                }
                bool = Boolean.TRUE;
            } else {
                f18 = f19 - f20;
                if (bool2 != null && bool2.booleanValue()) {
                    f20 = (float) (f20 * 0.1d);
                    f18 += f20;
                }
                bool = Boolean.FALSE;
            }
            Boolean bool3 = bool;
            float f21 = f18;
            pointF = b(f10, f11, f12, f13, f14, f15, f16, f17, f21);
            float f22 = pointF.x - f16;
            float f23 = pointF.y - f17;
            round = (int) Math.round(Math.sqrt((f23 * f23) + (f22 * f22)));
            f20 = f20;
            bool2 = bool3;
            f19 = f21;
        }
        aVar.f30368a = a(pointF.x, pointF.y, f16, f17, i12, c, dVar.c);
        aVar.f30369b = new PointF(pointF.x, pointF.y);
        return aVar;
    }

    public static a e(float f10, float f11, float f12, float f13, d dVar, int i10) {
        return f(f10, f11, f12, f13, dVar, i10, 1.0f);
    }

    public static a f(float f10, float f11, float f12, float f13, d dVar, int i10, float f14) {
        int i11;
        a aVar = new a();
        if (i10 < 3) {
            i11 = 9;
        } else {
            i11 = i10 * 3;
        }
        float c = c(i10) * f14;
        float f15 = f12 - f10;
        float f16 = f13 - f11;
        float sqrt = (float) (c / Math.sqrt(Math.pow(f16, 2.0d) + Math.pow(f15, 2.0d)));
        float f17 = f13 - (f16 * sqrt);
        float f18 = f12 - (f15 * sqrt);
        aVar.f30368a = a(f18, f17, f12, f13, i11 * f14, c, dVar.c);
        aVar.f30369b = new PointF(f18, f17);
        return aVar;
    }

    public static a g(float f10, float f11, float f12, float f13, float f14, float f15, d dVar, int i10, float f16) {
        int i11;
        PointF pointF;
        float f17;
        Boolean bool;
        a aVar = new a();
        if (i10 < 3) {
            i11 = 9;
        } else {
            i11 = i10 * 3;
        }
        float f18 = i11 * f16;
        float c = c(i10) * f16;
        float f19 = 0.9f;
        PointF j10 = j(f10, f11, f12, f13, f14, f15, 0.9f);
        int round = (int) Math.round(Math.sqrt(Math.pow(j10.y - f15, 2.0d) + Math.pow(j10.x - f14, 2.0d)));
        float f20 = 0.01f;
        Boolean bool2 = null;
        while (true) {
            float f21 = f19;
            pointF = j10;
            float f22 = round - c;
            if (Math.abs(f22) <= 1.0f || f21 >= 1.0f || f21 <= 0.0f) {
                break;
            }
            if (f22 > 1.0f) {
                f17 = f21 + f20;
                if (bool2 != null && !bool2.booleanValue()) {
                    f20 = (float) (f20 * 0.1d);
                    f17 -= f20;
                }
                bool = Boolean.TRUE;
            } else {
                f17 = f21 - f20;
                if (bool2 != null && bool2.booleanValue()) {
                    f20 = (float) (f20 * 0.1d);
                    f17 += f20;
                }
                bool = Boolean.FALSE;
            }
            f19 = f17;
            Boolean bool3 = bool;
            float f23 = f20;
            j10 = j(f10, f11, f12, f13, f14, f15, f19);
            float f24 = j10.x - f14;
            float f25 = j10.y - f15;
            round = (int) Math.round(Math.sqrt((f25 * f25) + (f24 * f24)));
            f20 = f23;
            bool2 = bool3;
        }
        aVar.f30368a = a(pointF.x, pointF.y, f14, f15, f18, c, dVar.c);
        aVar.f30369b = new PointF(pointF.x, pointF.y);
        return aVar;
    }

    public static PointF h(float f10, float f11, float f12, float f13, byte b10) {
        float f14;
        float f15;
        float f16;
        if (b10 != 1) {
            if (b10 == 2) {
                f14 = 0.3f;
                f15 = f10 * 0.3f;
                f16 = 0.7f;
            }
            return new PointF(f10, f11);
        }
        f14 = 0.2f;
        f15 = f10 * 0.2f;
        f16 = 0.8f;
        f10 = f15 + (f12 * f16);
        f11 = (f11 * f14) + (f13 * f16);
        return new PointF(f10, f11);
    }

    public static PointF i(Element element, PointF pointF, byte b10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float parseInt = (Integer.parseInt(element.attributeValue("x")) * 96.0f) / 914400.0f;
        float parseInt2 = (Integer.parseInt(element.attributeValue(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT)) * 96.0f) / 914400.0f;
        if (b10 != 1) {
            if (b10 == 2) {
                f10 = 0.7f;
                f11 = (pointF.x * 0.7f) + (parseInt * 0.3f);
                f12 = parseInt2 * 0.3f;
                f13 = pointF.y;
            }
            return new PointF(parseInt, parseInt2);
        }
        f10 = 0.8f;
        f11 = (pointF.x * 0.8f) + (parseInt * 0.2f);
        f12 = parseInt2 * 0.2f;
        f13 = pointF.y;
        parseInt = f11;
        parseInt2 = f12 + (f13 * f10);
        return new PointF(parseInt, parseInt2);
    }

    public static PointF j(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = 1.0f - f16;
        float f18 = f17 * f17;
        PointF pointF = f30370a;
        float f19 = f10 * f18;
        pointF.x = f19;
        float f20 = f18 * f11;
        float f21 = 2.0f * f16 * f17;
        float f22 = f16 * f16;
        pointF.x = (f14 * f22) + (f12 * f21) + f19;
        pointF.y = (f22 * f15) + (f21 * f13) + f20;
        return pointF;
    }
}
