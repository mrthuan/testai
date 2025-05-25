package dh;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.activity.r;
import java.util.ArrayList;
import lh.e;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import sg.e;
import tg.b;

/* compiled from: WedgeCalloutDrawing.java */
/* loaded from: classes.dex */
public final class a {
    public static ArrayList a(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = a0.a.b(fArr[0], rect.width(), rect.left);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                height = a0.a.b(fArr[1], rect.height(), rect.top);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                width2 = a0.a.b(fArr[2], rect.width(), rect.left);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                height2 = a0.a.b(fArr[3], rect.height(), rect.top);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        bVar2.b(eVar.f20610k);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width2, rect.top);
        pathHolder2.lineTo(width2, rect.bottom);
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList b(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.08333f)) + rect.left;
        float height3 = (rect.height() * 0.1875f) + rect.top;
        float width3 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = a0.a.b(fArr[0], rect.width(), rect.left);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                height = a0.a.b(fArr[1], rect.height(), rect.top);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                width2 = a0.a.b(fArr[2], rect.width(), rect.left);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                height2 = a0.a.b(fArr[3], rect.height(), rect.top);
            }
            if (fArr.length >= 5 && fArr[4] != null) {
                width3 = a0.a.b(fArr[4], rect.width(), rect.left);
            }
            if (fArr.length >= 6 && fArr[5] != null) {
                height3 = a0.a.b(fArr[5], rect.height(), rect.top);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        bVar2.b(eVar.f20610k);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width3, rect.top);
        pathHolder2.lineTo(width3, rect.bottom);
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList c(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.38333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 4) {
            if (fArr[0] != null) {
                width = a0.a.b(fArr[0], rect.width(), rect.left);
            }
            if (fArr[1] != null) {
                height = a0.a.b(fArr[1], rect.height(), rect.top);
            }
            if (fArr[2] != null) {
                width2 = a0.a.b(fArr[2], rect.width(), rect.left);
            }
            if (fArr[3] != null) {
                height2 = a0.a.b(fArr[3], rect.height(), rect.top);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        bVar3.b(eVar.f20610k);
        bVar3.c(pathHolder2);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList d(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = a0.a.b(fArr[0], rect.width(), rect.left);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                height = a0.a.b(fArr[1], rect.height(), rect.top);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                width2 = a0.a.b(fArr[2], rect.width(), rect.left);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                height2 = a0.a.b(fArr[3], rect.height(), rect.top);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width2, rect.top);
        pathHolder2.lineTo(width2, rect.bottom);
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList e(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.08333f)) + rect.left;
        float height3 = (rect.height() * 0.1875f) + rect.top;
        float width3 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = a0.a.b(fArr[0], rect.width(), rect.left);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                height = a0.a.b(fArr[1], rect.height(), rect.top);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                width2 = a0.a.b(fArr[2], rect.width(), rect.left);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                height2 = a0.a.b(fArr[3], rect.height(), rect.top);
            }
            if (fArr.length >= 5 && fArr[4] != null) {
                width3 = a0.a.b(fArr[4], rect.width(), rect.left);
            }
            if (fArr.length >= 6 && fArr[5] != null) {
                height3 = a0.a.b(fArr[5], rect.height(), rect.top);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width3, rect.top);
        pathHolder2.lineTo(width3, rect.bottom);
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList f(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = a0.a.b(fArr[0], rect.width(), rect.left);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                height = a0.a.b(fArr[1], rect.height(), rect.top);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                width2 = a0.a.b(fArr[2], rect.width(), rect.left);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                height2 = a0.a.b(fArr[3], rect.height(), rect.top);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        bVar2.b(eVar.f20610k);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList g(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.08333f)) + rect.left;
        float height3 = (rect.height() * 0.1875f) + rect.top;
        float width3 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = a0.a.b(fArr[0], rect.width(), rect.left);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                height = a0.a.b(fArr[1], rect.height(), rect.top);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                width2 = a0.a.b(fArr[2], rect.width(), rect.left);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                height2 = a0.a.b(fArr[3], rect.height(), rect.top);
            }
            if (fArr.length >= 5 && fArr[4] != null) {
                width3 = a0.a.b(fArr[4], rect.width(), rect.left);
            }
            if (fArr.length >= 6 && fArr[5] != null) {
                height3 = a0.a.b(fArr[5], rect.height(), rect.top);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        bVar2.b(eVar.f20610k);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList h(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = a0.a.b(fArr[0], rect.width(), rect.left);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                height = a0.a.b(fArr[1], rect.height(), rect.top);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                width2 = a0.a.b(fArr[2], rect.width(), rect.left);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                height2 = a0.a.b(fArr[3], rect.height(), rect.top);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList i(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.08333f)) + rect.left;
        float height3 = (rect.height() * 0.1875f) + rect.top;
        float width3 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = a0.a.b(fArr[0], rect.width(), rect.left);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                height = a0.a.b(fArr[1], rect.height(), rect.top);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                width2 = a0.a.b(fArr[2], rect.width(), rect.left);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                height2 = a0.a.b(fArr[3], rect.height(), rect.top);
            }
            if (fArr.length >= 5 && fArr[4] != null) {
                width3 = a0.a.b(fArr[4], rect.width(), rect.left);
            }
            if (fArr.length >= 6 && fArr[5] != null) {
                height3 = a0.a.b(fArr[5], rect.height(), rect.top);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static Path j(e eVar, Rect rect) {
        Path w7 = w();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 1.125f) + rect.top;
        float width2 = (rect.width() * (-0.38333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 4) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
        }
        float f10 = width;
        w7.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        w7.moveTo(f10, rect.top);
        w7.lineTo(f10, rect.bottom);
        w7.moveTo(f10, height);
        w7.lineTo(width2, height2);
        return w7;
    }

    public static ArrayList k(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.16667f)) + rect.left;
        float height3 = (rect.height() * 1.125f) + rect.top;
        float width3 = (rect.width() * (-0.46667f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 6) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
            if (fArr[4] != null) {
                height3 = a0.a.b(fArr[4], rect.height(), rect.top);
            }
            if (fArr[5] != null) {
                width3 = a0.a.b(fArr[5], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        float f10 = height3;
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        bVar2.b(eVar.f20610k);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, rect.top);
        pathHolder2.lineTo(width, rect.bottom);
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, f10);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList l(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.16667f)) + rect.left;
        float height3 = (rect.height() * 1.0f) + rect.top;
        float width3 = (rect.width() * (-0.16667f)) + rect.left;
        float height4 = (rect.height() * 1.12963f) + rect.top;
        float width4 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 8) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
            if (fArr[4] != null) {
                height3 = a0.a.b(fArr[4], rect.height(), rect.top);
            }
            if (fArr[5] != null) {
                width3 = a0.a.b(fArr[5], rect.width(), rect.left);
            }
            if (fArr[6] != null) {
                height4 = a0.a.b(fArr[6], rect.height(), rect.top);
            }
            if (fArr[7] != null) {
                width4 = a0.a.b(fArr[7], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        bVar2.b(eVar.f20610k);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, rect.top);
        pathHolder2.lineTo(width, rect.bottom);
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        pathHolder2.lineTo(width4, height4);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList m(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 1.125f) + rect.top;
        float width2 = (rect.width() * (-0.38333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 4) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, rect.top);
        pathHolder2.lineTo(width, rect.bottom);
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList n(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.16667f)) + rect.left;
        float height3 = (rect.height() * 1.125f) + rect.top;
        float width3 = (rect.width() * (-0.46667f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 6) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
            if (fArr[4] != null) {
                height3 = a0.a.b(fArr[4], rect.height(), rect.top);
            }
            if (fArr[5] != null) {
                width3 = a0.a.b(fArr[5], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.c(pathHolder);
        bVar2.f30011b = bVar;
        b i10 = r.i(x4, bVar2);
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, rect.top);
        pathHolder2.lineTo(width, rect.bottom);
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        i10.c(pathHolder2);
        i10.b(eVar.f20610k);
        x4.add(i10);
        return x4;
    }

    public static ArrayList o(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.16667f)) + rect.left;
        float height3 = (rect.height() * 1.0f) + rect.top;
        float width3 = (rect.width() * (-0.16667f)) + rect.left;
        float height4 = (rect.height() * 1.12963f) + rect.top;
        float width4 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 8) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
            if (fArr[4] != null) {
                height3 = a0.a.b(fArr[4], rect.height(), rect.top);
            }
            if (fArr[5] != null) {
                width3 = a0.a.b(fArr[5], rect.width(), rect.left);
            }
            if (fArr[6] != null) {
                height4 = a0.a.b(fArr[6], rect.height(), rect.top);
            }
            if (fArr[7] != null) {
                width4 = a0.a.b(fArr[7], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.c(pathHolder);
        bVar2.f30011b = bVar;
        b i10 = r.i(x4, bVar2);
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, rect.top);
        pathHolder2.lineTo(width, rect.bottom);
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        pathHolder2.lineTo(width4, height4);
        i10.c(pathHolder2);
        i10.b(eVar.f20610k);
        x4.add(i10);
        return x4;
    }

    public static Path p(e eVar, Rect rect) {
        Path w7 = w();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 1.125f) + rect.top;
        float width2 = (rect.width() * (-0.38333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 4) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
        }
        w7.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        w7.moveTo(width, height);
        w7.lineTo(width2, height2);
        return w7;
    }

    public static ArrayList q(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.16667f)) + rect.left;
        float height3 = (rect.height() * 1.125f) + rect.top;
        float width3 = (rect.width() * (-0.46667f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 6) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
            if (fArr[4] != null) {
                height3 = a0.a.b(fArr[4], rect.height(), rect.top);
            }
            if (fArr[5] != null) {
                width3 = a0.a.b(fArr[5], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        bVar2.b(eVar.f20610k);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList r(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.16667f)) + rect.left;
        float height3 = (rect.height() * 1.0f) + rect.top;
        float width3 = (rect.width() * (-0.16667f)) + rect.left;
        float height4 = (rect.height() * 1.12963f) + rect.top;
        float width4 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 8) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
            if (fArr[4] != null) {
                height3 = a0.a.b(fArr[4], rect.height(), rect.top);
            }
            if (fArr[5] != null) {
                width3 = a0.a.b(fArr[5], rect.width(), rect.left);
            }
            if (fArr[6] != null) {
                height4 = a0.a.b(fArr[6], rect.height(), rect.top);
            }
            if (fArr[7] != null) {
                width4 = a0.a.b(fArr[7], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.f30011b = bVar;
        bVar2.c(pathHolder);
        bVar2.b(eVar.f20610k);
        x4.add(bVar2);
        b bVar3 = new b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        pathHolder2.lineTo(width4, height4);
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        x4.add(bVar3);
        return x4;
    }

    public static ArrayList s(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 1.125f) + rect.top;
        float width2 = (rect.width() * (-0.38333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 4) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.c(pathHolder);
        bVar2.f30011b = bVar;
        b i10 = r.i(x4, bVar2);
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        i10.c(pathHolder2);
        i10.b(eVar.f20610k);
        x4.add(i10);
        return x4;
    }

    public static ArrayList t(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.16667f)) + rect.left;
        float height3 = (rect.height() * 1.125f) + rect.top;
        float width3 = (rect.width() * (-0.46667f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 6) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
            if (fArr[4] != null) {
                height3 = a0.a.b(fArr[4], rect.height(), rect.top);
            }
            if (fArr[5] != null) {
                width3 = a0.a.b(fArr[5], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.c(pathHolder);
        bVar2.f30011b = bVar;
        b i10 = r.i(x4, bVar2);
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        i10.c(pathHolder2);
        i10.b(eVar.f20610k);
        x4.add(i10);
        return x4;
    }

    public static ArrayList u(e eVar, Rect rect) {
        ArrayList<b> x4 = x();
        float height = (rect.height() * 0.1875f) + rect.top;
        float width = (rect.width() * (-0.08333f)) + rect.left;
        float height2 = (rect.height() * 0.1875f) + rect.top;
        float width2 = (rect.width() * (-0.16667f)) + rect.left;
        float height3 = (rect.height() * 1.0f) + rect.top;
        float width3 = (rect.width() * (-0.16667f)) + rect.left;
        float height4 = (rect.height() * 1.12963f) + rect.top;
        float width4 = (rect.width() * (-0.08333f)) + rect.left;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 8) {
            if (fArr[0] != null) {
                height = a0.a.b(fArr[0], rect.height(), rect.top);
            }
            if (fArr[1] != null) {
                width = a0.a.b(fArr[1], rect.width(), rect.left);
            }
            if (fArr[2] != null) {
                height2 = a0.a.b(fArr[2], rect.height(), rect.top);
            }
            if (fArr[3] != null) {
                width2 = a0.a.b(fArr[3], rect.width(), rect.left);
            }
            if (fArr[4] != null) {
                height3 = a0.a.b(fArr[4], rect.height(), rect.top);
            }
            if (fArr[5] != null) {
                width3 = a0.a.b(fArr[5], rect.width(), rect.left);
            }
            if (fArr[6] != null) {
                height4 = a0.a.b(fArr[6], rect.height(), rect.top);
            }
            if (fArr[7] != null) {
                width4 = a0.a.b(fArr[7], rect.width(), rect.left);
            }
        }
        eh.b bVar = eVar.f20603d;
        b bVar2 = new b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        bVar2.c(pathHolder);
        bVar2.f30011b = bVar;
        b i10 = r.i(x4, bVar2);
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(width, height);
        pathHolder2.lineTo(width2, height2);
        pathHolder2.lineTo(width3, height3);
        pathHolder2.lineTo(width4, height4);
        i10.c(pathHolder2);
        i10.b(eVar.f20610k);
        x4.add(i10);
        return x4;
    }

    public static Path v(e eVar, Rect rect) {
        int round;
        int width;
        int height;
        Path w7 = w();
        RectF f10 = e.a.f29807a.f("WedgeCalloutDrawing");
        f10.set(0.0f, 160.0f, 90.0f, 285.0f);
        w7.arcTo(f10, 120.0f, 148.0f);
        f10.set(41.0f, 44.0f, 188.0f, 250.0f);
        w7.arcTo(f10, 172.5f, 127.5f);
        f10.set(140.0f, 14.0f, 264.0f, 220.0f);
        w7.arcTo(f10, 218.0f, 90.0f);
        f10.set(230.0f, 0.0f, 340.0f, 210.0f);
        w7.arcTo(f10, 219.0f, 92.0f);
        f10.set(296.0f, 0.0f, 428.0f, 246.0f);
        w7.arcTo(f10, 232.0f, 101.0f);
        f10.set(342.0f, 60.0f, 454.0f, 214.0f);
        w7.arcTo(f10, 293.0f, 89.0f);
        f10.set(324.0f, 130.0f, 468.0f, 327.0f);
        w7.arcTo(f10, 319.0f, 119.0f);
        f10.set(280.0f, 240.0f, 405.0f, 412.0f);
        w7.arcTo(f10, 1.0f, 122.0f);
        f10.set(168.0f, 274.0f, 312.0f, 468.0f);
        w7.arcTo(f10, 16.0f, 130.0f);
        f10.set(57.0f, 249.0f, 213.0f, 441.0f);
        w7.arcTo(f10, 56.0f, 74.0f);
        f10.set(11.0f, 259.0f, 99.0f, 386.0f);
        w7.arcTo(f10, 84.0f, 140.0f);
        w7.close();
        Matrix matrix = new Matrix();
        matrix.postScale(rect.width() / 468.0f, rect.height() / 468.0f);
        w7.transform(matrix);
        w7.offset(rect.left, rect.top);
        Float[] fArr = eVar.f20616n;
        int i10 = 0;
        if (eVar.f20617o) {
            if (fArr != null && fArr.length >= 2) {
                if (fArr[0] != null) {
                    round = a0.a.c(fArr[0], rect.width());
                } else {
                    round = 0;
                }
                if (fArr[1] != null) {
                    i10 = a0.a.c(fArr[1], rect.height());
                }
            } else {
                round = Math.round(rect.width() * (-0.2f));
                i10 = Math.round(rect.height() * 0.6f);
            }
        } else if (fArr != null && fArr.length >= 2) {
            if (fArr[0] != null) {
                round = Math.round((fArr[0].floatValue() * rect.width()) - (rect.width() / 2));
            } else {
                round = 0;
            }
            if (fArr[1] != null) {
                i10 = Math.round((fArr[1].floatValue() * rect.height()) - (rect.height() / 2));
            }
        } else {
            round = Math.round(rect.width() * (-0.433f));
            i10 = Math.round(rect.height() * 0.7f);
        }
        double d10 = round;
        double d11 = i10;
        double acos = (Math.acos(d10 / Math.sqrt((d11 * d11) + (d10 * d10))) * 180.0d) / 3.141592653589793d;
        if (d11 < 0.0d) {
            acos = 360.0d - acos;
        }
        double d12 = (3.141592653589793d * acos) / 180.0d;
        float sqrt = (float) ((width * height) / Math.sqrt(Math.pow((rect.width() / 2) * Math.tan(d12), 2.0d) + Math.pow(rect.height() / 2, 2.0d)));
        if (acos > 90.0d && acos < 270.0d) {
            sqrt = -sqrt;
        }
        double tan = Math.tan(d12);
        float centerX = rect.centerX() + round;
        float centerY = rect.centerY() + i10;
        float centerX2 = rect.centerX() + sqrt;
        float centerY2 = rect.centerY() + ((float) (tan * sqrt));
        float min = Math.min(rect.width(), rect.height()) / 468.0f;
        w7.addCircle(centerX, centerY, 16.0f * min, Path.Direction.CW);
        float f11 = centerX - centerX2;
        float f12 = centerY - centerY2;
        w7.addCircle((f11 * 0.7f) + centerX2, (0.7f * f12) + centerY2, 24.0f * min, Path.Direction.CW);
        w7.addCircle((f11 * 0.3f) + centerX2, (f12 * 0.3f) + centerY2, min * 40.0f, Path.Direction.CW);
        return w7;
    }

    public static Path w() {
        return e.a.f29807a.d("WedgeCalloutDrawing");
    }

    public static ArrayList<b> x() {
        return e.a.f29807a.b("WedgeCalloutDrawing");
    }

    public static Object y(lh.e eVar, Rect rect) {
        float f10;
        float f11;
        ArrayList<b> x4 = x();
        Path w7 = w();
        x4.clear();
        w7.reset();
        int i10 = eVar.f20615m;
        if (i10 != 106) {
            switch (i10) {
                case 41:
                    if (eVar.f20617o) {
                        return t(eVar, rect);
                    }
                    return h(eVar, rect);
                case 42:
                    if (eVar.f20617o) {
                        return u(eVar, rect);
                    }
                    return i(eVar, rect);
                case 43:
                    ArrayList<b> x10 = x();
                    float height = (rect.height() * 0.1875f) + rect.top;
                    float width = (rect.width() * (-0.08333f)) + rect.left;
                    float height2 = (rect.height() * 0.1875f) + rect.top;
                    float width2 = (rect.width() * (-0.16667f)) + rect.left;
                    float height3 = (rect.height() * 0.1875f) + rect.top;
                    float width3 = (rect.width() * 1.08333f) + rect.left;
                    float height4 = (rect.height() * 0.1875f) + rect.top;
                    float width4 = (rect.width() * 1.08333f) + rect.left;
                    Float[] fArr = eVar.f20616n;
                    if (fArr != null && fArr.length >= 1) {
                        if (fArr[0] != null) {
                            width = a0.a.b(fArr[0], rect.width(), rect.left);
                        }
                        if (fArr.length >= 2 && fArr[1] != null) {
                            height = a0.a.b(fArr[1], rect.height(), rect.top);
                        }
                        if (fArr.length >= 3 && fArr[2] != null) {
                            width2 = a0.a.b(fArr[2], rect.width(), rect.left);
                        }
                        if (fArr.length >= 4 && fArr[3] != null) {
                            height2 = a0.a.b(fArr[3], rect.height(), rect.top);
                        }
                        if (fArr.length >= 5 && fArr[4] != null) {
                            width3 = a0.a.b(fArr[4], rect.width(), rect.left);
                        }
                        if (fArr.length >= 6 && fArr[5] != null) {
                            height3 = a0.a.b(fArr[5], rect.height(), rect.top);
                        }
                        if (fArr.length >= 7 && fArr[6] != null) {
                            width4 = a0.a.b(fArr[6], rect.width(), rect.left);
                        }
                        if (fArr.length >= 8 && fArr[7] != null) {
                            height4 = a0.a.b(fArr[7], rect.height(), rect.top);
                        }
                    }
                    eh.b bVar = eVar.f20603d;
                    b bVar2 = new b();
                    PathHolder pathHolder = new PathHolder();
                    pathHolder.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
                    bVar2.f30011b = bVar;
                    bVar2.c(pathHolder);
                    x10.add(bVar2);
                    b bVar3 = new b();
                    PathHolder pathHolder2 = new PathHolder();
                    pathHolder2.moveTo(width, height);
                    pathHolder2.lineTo(width2, height2);
                    pathHolder2.lineTo(width3, height3);
                    pathHolder2.lineTo(width4, height4);
                    bVar3.c(pathHolder2);
                    bVar3.b(eVar.f20610k);
                    x10.add(bVar3);
                    return x10;
                case 44:
                    if (eVar.f20617o) {
                        return n(eVar, rect);
                    }
                    return d(eVar, rect);
                case 45:
                    if (eVar.f20617o) {
                        return o(eVar, rect);
                    }
                    return e(eVar, rect);
                case 46:
                    ArrayList<b> x11 = x();
                    float height5 = (rect.height() * 0.1875f) + rect.top;
                    float width5 = (rect.width() * (-0.08333f)) + rect.left;
                    float height6 = (rect.height() * 0.1875f) + rect.top;
                    float width6 = (rect.width() * (-0.16667f)) + rect.left;
                    float height7 = (rect.height() * 0.1875f) + rect.top;
                    float width7 = (rect.width() * 1.08333f) + rect.left;
                    float height8 = (rect.height() * 0.1875f) + rect.top;
                    float width8 = (rect.width() * 1.08333f) + rect.left;
                    Float[] fArr2 = eVar.f20616n;
                    if (fArr2 != null && fArr2.length >= 1) {
                        if (fArr2[0] != null) {
                            width5 = a0.a.b(fArr2[0], rect.width(), rect.left);
                        }
                        if (fArr2.length >= 2 && fArr2[1] != null) {
                            height5 = a0.a.b(fArr2[1], rect.height(), rect.top);
                        }
                        if (fArr2.length >= 3 && fArr2[2] != null) {
                            width6 = a0.a.b(fArr2[2], rect.width(), rect.left);
                        }
                        if (fArr2.length >= 4 && fArr2[3] != null) {
                            height6 = a0.a.b(fArr2[3], rect.height(), rect.top);
                        }
                        if (fArr2.length >= 5 && fArr2[4] != null) {
                            width7 = a0.a.b(fArr2[4], rect.width(), rect.left);
                        }
                        if (fArr2.length >= 6 && fArr2[5] != null) {
                            height7 = a0.a.b(fArr2[5], rect.height(), rect.top);
                        }
                        if (fArr2.length >= 7 && fArr2[6] != null) {
                            width8 = a0.a.b(fArr2[6], rect.width(), rect.left);
                        }
                        if (fArr2.length >= 8 && fArr2[7] != null) {
                            height8 = a0.a.b(fArr2[7], rect.height(), rect.top);
                        }
                    }
                    eh.b bVar4 = eVar.f20603d;
                    b bVar5 = new b();
                    PathHolder pathHolder3 = new PathHolder();
                    pathHolder3.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
                    bVar5.f30011b = bVar4;
                    bVar5.c(pathHolder3);
                    x11.add(bVar5);
                    b bVar6 = new b();
                    PathHolder pathHolder4 = new PathHolder();
                    pathHolder4.moveTo(width8, rect.top);
                    pathHolder4.lineTo(width8, rect.bottom);
                    pathHolder4.moveTo(width5, height5);
                    pathHolder4.lineTo(width6, height6);
                    pathHolder4.lineTo(width7, height7);
                    pathHolder4.lineTo(width8, height8);
                    bVar6.c(pathHolder4);
                    bVar6.b(eVar.f20610k);
                    x11.add(bVar6);
                    return x11;
                case 47:
                    if (eVar.f20617o) {
                        return q(eVar, rect);
                    }
                    return f(eVar, rect);
                case 48:
                    if (eVar.f20617o) {
                        return r(eVar, rect);
                    }
                    return g(eVar, rect);
                case 49:
                    ArrayList<b> x12 = x();
                    float height9 = (rect.height() * 0.1875f) + rect.top;
                    float width9 = (rect.width() * (-0.08333f)) + rect.left;
                    float height10 = (rect.height() * 0.1875f) + rect.top;
                    float width10 = (rect.width() * (-0.16667f)) + rect.left;
                    float height11 = (rect.height() * 0.1875f) + rect.top;
                    float width11 = (rect.width() * 1.08333f) + rect.left;
                    float height12 = (rect.height() * 0.1875f) + rect.top;
                    float width12 = (rect.width() * 1.08333f) + rect.left;
                    Float[] fArr3 = eVar.f20616n;
                    if (fArr3 != null && fArr3.length >= 1) {
                        if (fArr3[0] != null) {
                            width9 = a0.a.b(fArr3[0], rect.width(), rect.left);
                        }
                        if (fArr3.length >= 2 && fArr3[1] != null) {
                            height9 = a0.a.b(fArr3[1], rect.height(), rect.top);
                        }
                        if (fArr3.length >= 3 && fArr3[2] != null) {
                            width10 = a0.a.b(fArr3[2], rect.width(), rect.left);
                        }
                        if (fArr3.length >= 4 && fArr3[3] != null) {
                            height10 = a0.a.b(fArr3[3], rect.height(), rect.top);
                        }
                        if (fArr3.length >= 5 && fArr3[4] != null) {
                            width11 = a0.a.b(fArr3[4], rect.width(), rect.left);
                        }
                        if (fArr3.length >= 6 && fArr3[5] != null) {
                            height11 = a0.a.b(fArr3[5], rect.height(), rect.top);
                        }
                        if (fArr3.length >= 7 && fArr3[6] != null) {
                            width12 = a0.a.b(fArr3[6], rect.width(), rect.left);
                        }
                        if (fArr3.length >= 8 && fArr3[7] != null) {
                            height12 = a0.a.b(fArr3[7], rect.height(), rect.top);
                        }
                    }
                    eh.b bVar7 = eVar.f20603d;
                    b bVar8 = new b();
                    PathHolder pathHolder5 = new PathHolder();
                    pathHolder5.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
                    bVar8.f30011b = bVar7;
                    bVar8.c(pathHolder5);
                    bVar8.b(eVar.f20610k);
                    x12.add(bVar8);
                    b bVar9 = new b();
                    PathHolder pathHolder6 = new PathHolder();
                    pathHolder6.moveTo(width9, height9);
                    pathHolder6.lineTo(width10, height10);
                    pathHolder6.lineTo(width11, height11);
                    pathHolder6.lineTo(width12, height12);
                    bVar9.c(pathHolder6);
                    bVar9.b(eVar.f20610k);
                    x12.add(bVar9);
                    return x12;
                case 50:
                    if (eVar.f20617o) {
                        return k(eVar, rect);
                    }
                    return a(eVar, rect);
                case 51:
                    if (eVar.f20617o) {
                        return l(eVar, rect);
                    }
                    return b(eVar, rect);
                case 52:
                    ArrayList<b> x13 = x();
                    float height13 = (rect.height() * 0.1875f) + rect.top;
                    float width13 = (rect.width() * (-0.08333f)) + rect.left;
                    float height14 = (rect.height() * 0.1875f) + rect.top;
                    float width14 = (rect.width() * (-0.16667f)) + rect.left;
                    float height15 = (rect.height() * 0.1875f) + rect.top;
                    float width15 = (rect.width() * 1.08333f) + rect.left;
                    float height16 = (rect.height() * 0.1875f) + rect.top;
                    float width16 = (rect.width() * 1.08333f) + rect.left;
                    Float[] fArr4 = eVar.f20616n;
                    if (fArr4 != null && fArr4.length >= 1) {
                        if (fArr4[0] != null) {
                            width13 = a0.a.b(fArr4[0], rect.width(), rect.left);
                        }
                        if (fArr4.length >= 2 && fArr4[1] != null) {
                            height13 = a0.a.b(fArr4[1], rect.height(), rect.top);
                        }
                        if (fArr4.length >= 3 && fArr4[2] != null) {
                            width14 = a0.a.b(fArr4[2], rect.width(), rect.left);
                        }
                        if (fArr4.length >= 4 && fArr4[3] != null) {
                            height14 = a0.a.b(fArr4[3], rect.height(), rect.top);
                        }
                        if (fArr4.length >= 5 && fArr4[4] != null) {
                            width15 = a0.a.b(fArr4[4], rect.width(), rect.left);
                        }
                        if (fArr4.length >= 6 && fArr4[5] != null) {
                            height15 = a0.a.b(fArr4[5], rect.height(), rect.top);
                        }
                        if (fArr4.length >= 7 && fArr4[6] != null) {
                            width16 = a0.a.b(fArr4[6], rect.width(), rect.left);
                        }
                        if (fArr4.length >= 8 && fArr4[7] != null) {
                            height16 = a0.a.b(fArr4[7], rect.height(), rect.top);
                        }
                    }
                    eh.b bVar10 = eVar.f20603d;
                    b bVar11 = new b();
                    PathHolder pathHolder7 = new PathHolder();
                    pathHolder7.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
                    bVar11.f30011b = bVar10;
                    bVar11.c(pathHolder7);
                    bVar11.b(eVar.f20610k);
                    x13.add(bVar11);
                    b bVar12 = new b();
                    PathHolder pathHolder8 = new PathHolder();
                    pathHolder8.moveTo(width16, rect.top);
                    pathHolder8.lineTo(width16, rect.bottom);
                    pathHolder8.moveTo(width13, height13);
                    pathHolder8.lineTo(width14, height14);
                    pathHolder8.lineTo(width15, height15);
                    pathHolder8.lineTo(width16, height16);
                    bVar12.c(pathHolder8);
                    bVar12.b(eVar.f20610k);
                    x13.add(bVar12);
                    return x13;
                default:
                    switch (i10) {
                        case 61:
                            Path w10 = w();
                            float f12 = (-rect.width()) * 0.2f;
                            float height17 = rect.height() * 0.6f;
                            float width17 = rect.width() / 12.0f;
                            Float[] fArr5 = eVar.f20616n;
                            if (eVar.f20617o) {
                                if (fArr5 != null && fArr5.length >= 2) {
                                    if (fArr5[0] != null) {
                                        f12 = fArr5[0].floatValue() * rect.width();
                                    }
                                    if (fArr5[1] != null) {
                                        height17 = fArr5[1].floatValue() * rect.height();
                                    }
                                }
                            } else {
                                f12 = (-rect.width()) * 0.433f;
                                height17 = rect.height() * 0.7f;
                                if (fArr5 != null && fArr5.length >= 2) {
                                    if (fArr5[0] != null) {
                                        f12 = (fArr5[0].floatValue() * rect.width()) - (rect.width() / 2);
                                    }
                                    if (fArr5[1] != null) {
                                        height17 = (fArr5[1].floatValue() * rect.height()) - (rect.height() / 2);
                                    }
                                }
                            }
                            if (Math.abs(height17 / f12) < rect.height() / rect.width()) {
                                float height18 = rect.height() / 12.0f;
                                if (f12 >= 0.0f) {
                                    w10.moveTo(rect.left, rect.top);
                                    w10.lineTo(rect.right, rect.top);
                                    if (height17 >= 0.0f) {
                                        w10.lineTo(rect.right, rect.exactCenterY() + height18);
                                        w10.lineTo(rect.exactCenterX() + f12, rect.exactCenterY() + height17);
                                        w10.lineTo(rect.right, rect.bottom - (height18 * 2.0f));
                                    } else {
                                        w10.lineTo(rect.right, (2.0f * height18) + rect.top);
                                        w10.lineTo(rect.exactCenterX() + f12, rect.exactCenterY() + height17);
                                        w10.lineTo(rect.right, rect.exactCenterY() - height18);
                                    }
                                    w10.lineTo(rect.right, rect.bottom);
                                    w10.lineTo(rect.left, rect.bottom);
                                } else {
                                    w10.moveTo(rect.left, rect.top);
                                    w10.lineTo(rect.right, rect.top);
                                    w10.lineTo(rect.right, rect.bottom);
                                    w10.lineTo(rect.left, rect.bottom);
                                    if (height17 >= 0.0f) {
                                        w10.lineTo(rect.left, rect.bottom - (2.0f * height18));
                                        w10.lineTo(rect.exactCenterX() + f12, rect.exactCenterY() + height17);
                                        w10.lineTo(rect.left, rect.exactCenterY() + height18);
                                    } else {
                                        w10.lineTo(rect.left, rect.exactCenterY() - height18);
                                        w10.lineTo(rect.exactCenterX() + f12, rect.exactCenterY() + height17);
                                        w10.lineTo(rect.left, (height18 * 2.0f) + rect.top);
                                    }
                                }
                            } else if (height17 >= 0.0f) {
                                w10.moveTo(rect.left, rect.top);
                                w10.lineTo(rect.right, rect.top);
                                w10.lineTo(rect.right, rect.bottom);
                                if (f12 >= 0.0f) {
                                    w10.lineTo(rect.right - (2.0f * width17), rect.bottom);
                                    w10.lineTo(rect.exactCenterX() + f12, rect.exactCenterY() + height17);
                                    w10.lineTo(rect.exactCenterX() + width17, rect.bottom);
                                } else {
                                    w10.lineTo(rect.exactCenterX() - width17, rect.bottom);
                                    w10.lineTo(rect.exactCenterX() + f12, rect.exactCenterY() + height17);
                                    w10.lineTo((width17 * 2.0f) + rect.left, rect.bottom);
                                }
                                w10.lineTo(rect.left, rect.bottom);
                            } else {
                                w10.moveTo(rect.left, rect.top);
                                if (f12 >= 0.0f) {
                                    w10.lineTo(rect.exactCenterX() + width17, rect.top);
                                    w10.lineTo(rect.exactCenterX() + f12, rect.exactCenterY() + height17);
                                    w10.lineTo(rect.right - (width17 * 2.0f), rect.top);
                                } else {
                                    w10.lineTo((2.0f * width17) + rect.left, rect.top);
                                    w10.lineTo(rect.exactCenterX() + f12, rect.exactCenterY() + height17);
                                    w10.lineTo(rect.exactCenterX() - width17, rect.top);
                                }
                                w10.lineTo(rect.right, rect.top);
                                w10.lineTo(rect.right, rect.bottom);
                                w10.lineTo(rect.left, rect.bottom);
                            }
                            w10.close();
                            return w10;
                        case 62:
                            return z(eVar, rect);
                        case 63:
                            Path w11 = w();
                            RectF f13 = e.a.f29807a.f("WedgeCalloutDrawing");
                            float f14 = (-rect.width()) * 0.2f;
                            float height19 = rect.height() * 0.6f;
                            Float[] fArr6 = eVar.f20616n;
                            if (eVar.f20617o) {
                                if (fArr6 != null && fArr6.length >= 2) {
                                    if (fArr6[0] != null) {
                                        f14 = fArr6[0].floatValue() * rect.width();
                                    }
                                    if (fArr6[1] != null) {
                                        height19 = fArr6[1].floatValue() * rect.height();
                                    }
                                }
                            } else {
                                f14 = (-rect.width()) * 0.433f;
                                height19 = rect.height() * 0.7f;
                                if (fArr6 != null && fArr6.length >= 2) {
                                    if (fArr6[0] != null) {
                                        f14 = (fArr6[0].floatValue() * rect.width()) - (rect.width() / 2);
                                    }
                                    if (fArr6[1] != null) {
                                        height19 = (fArr6[1].floatValue() * rect.height()) - (rect.height() / 2);
                                    }
                                }
                            }
                            float degrees = ((float) Math.toDegrees(Math.atan2(rect.width(), rect.height()))) / 2.0f;
                            float degrees2 = (float) Math.toDegrees(Math.atan2(Math.abs(height19), Math.abs(f14)));
                            w11.moveTo(rect.exactCenterX() + f14, rect.exactCenterY() + height19);
                            f13.set(rect.left, rect.top, rect.right, rect.bottom);
                            if (height19 >= 0.0f) {
                                if (f14 >= 0.0f) {
                                    f11 = (degrees / 2.0f) + degrees2;
                                } else {
                                    f11 = (degrees / 2.0f) + (180.0f - degrees2);
                                }
                                w11.arcTo(f13, f11, 360.0f - degrees);
                            } else {
                                if (f14 >= 0.0f) {
                                    f10 = (360.0f - degrees2) - (degrees / 2.0f);
                                } else {
                                    f10 = (degrees2 + 180.0f) - (degrees / 2.0f);
                                }
                                w11.arcTo(f13, f10, degrees - 360.0f);
                            }
                            w11.close();
                            return w11;
                        default:
                            switch (i10) {
                                case ShapeTypes.MATH_MULTIPLY /* 178 */:
                                    if (eVar.f20617o) {
                                        return s(eVar, rect);
                                    }
                                    return c(eVar, rect);
                                case ShapeTypes.MATH_DIVIDE /* 179 */:
                                    if (eVar.f20617o) {
                                        return m(eVar, rect);
                                    }
                                    return c(eVar, rect);
                                case ShapeTypes.MATH_EQUAL /* 180 */:
                                    if (eVar.f20617o) {
                                        return p(eVar, rect);
                                    }
                                    return f(eVar, rect);
                                case ShapeTypes.MATH_NOT_EQUAL /* 181 */:
                                    if (eVar.f20617o) {
                                        return j(eVar, rect);
                                    }
                                    return f(eVar, rect);
                                default:
                                    return null;
                            }
                    }
            }
        }
        return v(eVar, rect);
    }

    public static Path z(lh.e eVar, Rect rect) {
        Path w7 = w();
        RectF f10 = e.a.f29807a.f("WedgeCalloutDrawing");
        float f11 = (-rect.width()) * 0.2f;
        float height = rect.height() * 0.6f;
        float width = rect.width() / 12.0f;
        float min = Math.min(rect.width(), rect.height()) * 0.16667f;
        Float[] fArr = eVar.f20616n;
        if (eVar.f20617o) {
            if (fArr != null && fArr.length >= 3) {
                if (fArr[0] != null) {
                    f11 = fArr[0].floatValue() * rect.width();
                }
                if (fArr[1] != null) {
                    height = fArr[1].floatValue() * rect.height();
                }
                if (fArr[2] != null) {
                    min = fArr[2].floatValue() * Math.min(rect.width(), rect.height());
                }
            }
        } else {
            f11 = 0.433f * (-rect.width());
            height = 0.7f * rect.height();
            if (fArr != null && fArr.length >= 2) {
                if (fArr[0] != null) {
                    f11 = (fArr[0].floatValue() * rect.width()) - (rect.width() / 2);
                }
                if (fArr[1] != null) {
                    height = (fArr[1].floatValue() * rect.height()) - (rect.height() / 2);
                }
            }
        }
        if (Math.abs(height / f11) < rect.height() / rect.width()) {
            float height2 = rect.height() / 12.0f;
            if (f11 >= 0.0f) {
                float f12 = rect.left;
                float f13 = rect.top;
                float f14 = min * 2.0f;
                f10.set(f12, f13, f12 + f14, f13 + f14);
                w7.arcTo(f10, 180.0f, 90.0f);
                float f15 = rect.right;
                float f16 = rect.top;
                f10.set(f15 - f14, f16, f15, f16 + f14);
                w7.arcTo(f10, 270.0f, 90.0f);
                if (height >= 0.0f) {
                    w7.lineTo(rect.right, rect.exactCenterY() + height2);
                    w7.lineTo(rect.exactCenterX() + f11, rect.exactCenterY() + height);
                    w7.lineTo(rect.right, rect.bottom - (height2 * 2.0f));
                } else {
                    w7.lineTo(rect.right, (2.0f * height2) + rect.top);
                    w7.lineTo(rect.exactCenterX() + f11, rect.exactCenterY() + height);
                    w7.lineTo(rect.right, rect.exactCenterY() - height2);
                }
                float f17 = rect.right;
                float f18 = rect.bottom;
                f10.set(f17 - f14, f18 - f14, f17, f18);
                w7.arcTo(f10, 0.0f, 90.0f);
                float f19 = rect.left;
                float f20 = rect.bottom;
                f10.set(f19, f20 - f14, f14 + f19, f20);
                w7.arcTo(f10, 90.0f, 90.0f);
            } else {
                float f21 = rect.left;
                float f22 = rect.top;
                float f23 = min * 2.0f;
                f10.set(f21, f22, f21 + f23, f22 + f23);
                w7.arcTo(f10, 180.0f, 90.0f);
                float f24 = rect.right;
                float f25 = rect.top;
                f10.set(f24 - f23, f25, f24, f25 + f23);
                w7.arcTo(f10, 270.0f, 90.0f);
                float f26 = rect.right;
                float f27 = rect.bottom;
                f10.set(f26 - f23, f27 - f23, f26, f27);
                w7.arcTo(f10, 0.0f, 90.0f);
                float f28 = rect.left;
                float f29 = rect.bottom;
                f10.set(f28, f29 - f23, f23 + f28, f29);
                w7.arcTo(f10, 90.0f, 90.0f);
                if (height >= 0.0f) {
                    w7.lineTo(rect.left, rect.bottom - (2.0f * height2));
                    w7.lineTo(rect.exactCenterX() + f11, rect.exactCenterY() + height);
                    w7.lineTo(rect.left, rect.exactCenterY() + height2);
                } else {
                    w7.lineTo(rect.left, rect.exactCenterY() - height2);
                    w7.lineTo(rect.exactCenterX() + f11, rect.exactCenterY() + height);
                    w7.lineTo(rect.left, (height2 * 2.0f) + rect.top);
                }
            }
        } else if (height >= 0.0f) {
            float f30 = rect.left;
            float f31 = rect.top;
            float f32 = min * 2.0f;
            f10.set(f30, f31, f30 + f32, f31 + f32);
            w7.arcTo(f10, 180.0f, 90.0f);
            float f33 = rect.right;
            float f34 = rect.top;
            f10.set(f33 - f32, f34, f33, f34 + f32);
            w7.arcTo(f10, 270.0f, 90.0f);
            float f35 = rect.right;
            float f36 = rect.bottom;
            f10.set(f35 - f32, f36 - f32, f35, f36);
            w7.arcTo(f10, 0.0f, 90.0f);
            if (f11 >= 0.0f) {
                w7.lineTo(rect.right - (2.0f * width), rect.bottom);
                w7.lineTo(rect.exactCenterX() + f11, rect.exactCenterY() + height);
                w7.lineTo(rect.exactCenterX() + width, rect.bottom);
            } else {
                w7.lineTo(rect.exactCenterX() - width, rect.bottom);
                w7.lineTo(rect.exactCenterX() + f11, rect.exactCenterY() + height);
                w7.lineTo((width * 2.0f) + rect.left, rect.bottom);
            }
            float f37 = rect.left;
            float f38 = rect.bottom;
            f10.set(f37, f38 - f32, f32 + f37, f38);
            w7.arcTo(f10, 90.0f, 90.0f);
        } else {
            float f39 = rect.left;
            float f40 = rect.top;
            float f41 = min * 2.0f;
            f10.set(f39, f40, f39 + f41, f40 + f41);
            w7.arcTo(f10, 180.0f, 90.0f);
            if (f11 >= 0.0f) {
                w7.lineTo(rect.exactCenterX() + width, rect.top);
                w7.lineTo(rect.exactCenterX() + f11, rect.exactCenterY() + height);
                w7.lineTo(rect.right - (width * 2.0f), rect.top);
            } else {
                w7.lineTo((2.0f * width) + rect.left, rect.top);
                w7.lineTo(rect.exactCenterX() + f11, rect.exactCenterY() + height);
                w7.lineTo(rect.exactCenterX() - width, rect.top);
            }
            float f42 = rect.right;
            float f43 = rect.top;
            f10.set(f42 - f41, f43, f42, f43 + f41);
            w7.arcTo(f10, 270.0f, 90.0f);
            float f44 = rect.right;
            float f45 = rect.bottom;
            f10.set(f44 - f41, f45 - f41, f44, f45);
            w7.arcTo(f10, 0.0f, 90.0f);
            float f46 = rect.left;
            float f47 = rect.bottom;
            f10.set(f46, f47 - f41, f41 + f46, f47);
            w7.arcTo(f10, 90.0f, 90.0f);
        }
        w7.close();
        return w7;
    }
}
