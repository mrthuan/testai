package vg;

import a6.h;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.activity.f;
import androidx.activity.r;
import com.google.android.play.core.assetpacks.b1;
import java.util.ArrayList;
import lh.e;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import sg.e;
import tg.b;

/* compiled from: ActionButtonPathBuilder.java */
/* loaded from: classes.dex */
public final class a {
    public static ArrayList a(e eVar, Rect rect) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int min;
        int min2;
        c().clear();
        switch (eVar.f20615m) {
            case 189:
                ArrayList<b> c = c();
                RectF d10 = d();
                b bVar = new b();
                PathHolder pathHolder = new PathHolder();
                d10.set(rect);
                pathHolder.addRect(d10, Path.Direction.CW);
                bVar.c(pathHolder);
                bVar.f30011b = eVar.f20603d;
                c.add(bVar);
                return c;
            case 190:
                ArrayList<b> c10 = c();
                RectF d11 = d();
                b bVar2 = new b();
                PathHolder pathHolder2 = new PathHolder();
                d11.set(rect);
                pathHolder2.addRect(d11, Path.Direction.CW);
                bVar2.c(pathHolder2);
                bVar2.f30011b = eVar.f20603d;
                b i10 = r.i(c10, bVar2);
                PathHolder pathHolder3 = new PathHolder();
                float min3 = Math.min(rect.width(), rect.height());
                float f15 = 0.28f * min3;
                float f16 = min3 * 0.375f;
                pathHolder3.addRect(rect.centerX() - f15, rect.centerY(), rect.centerX() + f15, rect.centerY() + f16, Path.Direction.CW);
                float f17 = 0.14f * min3;
                pathHolder3.moveTo(rect.centerX() + f17, rect.centerY() - (0.33f * min3));
                pathHolder3.lineTo(f.f(rect.centerY(), f10, pathHolder3, rect.centerX() + f11, rect) + (0.24f * min3), rect.centerY() - (0.135f * min3));
                pathHolder3.lineTo(rect.centerX() + f17, rect.centerY() - (0.235f * min3));
                pathHolder3.close();
                i10.c(pathHolder3);
                eh.b bVar3 = new eh.b();
                bVar3.c = (byte) 0;
                eh.b bVar4 = eVar.f20603d;
                if (bVar4 != null && bVar4.c == 0) {
                    int i11 = bVar4.f16571d;
                    bVar3.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar3.f16571d = -1890233003;
                }
                i10.f30011b = bVar3;
                b i12 = r.i(c10, i10);
                PathHolder pathHolder4 = new PathHolder();
                pathHolder4.moveTo(rect.centerX() - f16, rect.centerY());
                pathHolder4.lineTo(f.f(rect.centerY(), f16, pathHolder4, rect.centerX(), rect) + f16, rect.centerY());
                pathHolder4.close();
                float f18 = 0.05f * min3;
                pathHolder4.addRect(rect.centerX() - f18, (min3 * 0.18f) + rect.centerY(), rect.centerX() + f18, rect.centerY() + f16, Path.Direction.CW);
                i12.c(pathHolder4);
                eh.b bVar5 = new eh.b();
                bVar5.c = (byte) 0;
                if (bVar4 != null && bVar4.c == 0) {
                    int i13 = bVar4.f16571d;
                    bVar5.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i13) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i13) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i13) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar5.f16571d = -1891351484;
                }
                i12.f30011b = bVar5;
                c10.add(i12);
                return c10;
            case 191:
                ArrayList<b> c11 = c();
                RectF d12 = d();
                b bVar6 = new b();
                PathHolder pathHolder5 = new PathHolder();
                d12.set(rect);
                pathHolder5.addRect(d12, Path.Direction.CW);
                bVar6.c(pathHolder5);
                bVar6.f30011b = eVar.f20603d;
                c11.add(bVar6);
                int min4 = Math.min(rect.width(), rect.height());
                b bVar7 = new b();
                PathHolder pathHolder6 = new PathHolder();
                float f19 = min4;
                float f20 = 0.2f * f19;
                pathHolder6.moveTo(rect.centerX() - f20, rect.centerY() - (0.16f * f19));
                d12.set(rect.centerX() - f20, rect.centerY() - (0.36f * f19), rect.centerX() + f20, (0.04f * f19) + rect.centerY());
                pathHolder6.arcTo(d12, 180.0f, 240.0f);
                float f21 = f19 * 0.05f;
                float f22 = 0.15f * f19;
                d12.set(rect.centerX() + f21, (0.012f * f19) + rect.centerY(), rect.centerX() + f22, (0.112f * f19) + rect.centerY());
                pathHolder6.arcTo(d12, 270.0f, -90.0f);
                float centerY = rect.centerY();
                float f23 = 0.18f * f19;
                float centerY2 = rect.centerY();
                float f24 = 0.1f * f19;
                d12.set(h.b(rect.centerY(), f24, pathHolder6, h.b(centerY2, f23, pathHolder6, h.b(centerY, f23, pathHolder6, rect.centerX() + f21, rect) - f21, rect) - f21, rect) - f21, rect.centerY() - (0.073f * f19), rect.centerX() + f22, (0.273f * f19) + rect.centerY());
                pathHolder6.arcTo(d12, 180.0f, 90.0f);
                d12.set(rect.centerX() - f24, rect.centerY() - (0.26f * f19), rect.centerX() + f24, rect.centerY() - (0.06f * f19));
                pathHolder6.arcTo(d12, 60.0f, -240.0f);
                pathHolder6.close();
                pathHolder6.addCircle(rect.centerX(), (0.28f * f19) + rect.centerY(), f19 * 0.08f, Path.Direction.CW);
                bVar7.c(pathHolder6);
                eh.b bVar8 = new eh.b();
                bVar8.c = (byte) 0;
                eh.b bVar9 = eVar.f20603d;
                if (bVar9 != null && bVar9.c == 0) {
                    int i14 = bVar9.f16571d;
                    bVar8.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i14) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i14) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i14) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar8.f16571d = -1890233003;
                }
                bVar7.f30011b = bVar8;
                c11.add(bVar7);
                return c11;
            case 192:
                ArrayList<b> c12 = c();
                RectF d13 = d();
                b bVar10 = new b();
                PathHolder pathHolder7 = new PathHolder();
                d13.set(rect);
                pathHolder7.addRect(d13, Path.Direction.CW);
                bVar10.c(pathHolder7);
                bVar10.f30011b = eVar.f20603d;
                b i15 = r.i(c12, bVar10);
                PathHolder pathHolder8 = new PathHolder();
                float min5 = Math.min(rect.width(), rect.height());
                pathHolder8.addCircle(rect.centerX(), rect.centerY(), min5 * 0.375f, Path.Direction.CW);
                i15.c(pathHolder8);
                eh.b bVar11 = new eh.b();
                bVar11.c = (byte) 0;
                eh.b bVar12 = eVar.f20603d;
                if (bVar12 != null && bVar12.c == 0) {
                    int i16 = bVar12.f16571d;
                    bVar11.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i16) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i16) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i16) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar11.f16571d = -1891351484;
                }
                i15.f30011b = bVar11;
                b i17 = r.i(c12, i15);
                PathHolder pathHolder9 = new PathHolder();
                pathHolder9.addCircle(rect.centerX(), rect.centerY() - (0.22f * min5), 0.06f * min5, Path.Direction.CW);
                float f25 = 0.12f * min5;
                pathHolder9.moveTo(rect.centerX() - f25, rect.centerY() - (0.11f * min5));
                float centerY3 = rect.centerY();
                float centerY4 = rect.centerY();
                float f26 = 0.16f * min5;
                float centerY5 = rect.centerY();
                float centerY6 = rect.centerY();
                float f27 = 0.2f * min5;
                float centerY7 = rect.centerY();
                float centerY8 = rect.centerY();
                pathHolder9.lineTo(f.f(rect.centerY(), f14, pathHolder9, h.b(rect.centerY(), f26, pathHolder9, h.b(centerY8, f26, pathHolder9, h.b(centerY7, f27, pathHolder9, h.b(centerY6, f27, pathHolder9, h.b(centerY5, f26, pathHolder9, h.b(centerY4, f26, pathHolder9, f.f(centerY3, f13, pathHolder9, rect.centerX() + f12, rect) + f12, rect) + f25, rect) + f25, rect) - f25, rect) - f25, rect) - f12, rect) - f12, rect) - f25, rect.centerY() - (min5 * 0.08f));
                pathHolder9.close();
                i17.c(pathHolder9);
                eh.b bVar13 = new eh.b();
                bVar13.c = (byte) 0;
                if (bVar12 != null && bVar12.c == 0) {
                    int i18 = bVar12.f16571d;
                    bVar13.f16571d = Color.rgb(b1.o(0.6000000238418579d, Color.red(i18) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.6000000238418579d, Color.green(i18) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.6000000238418579d, Color.blue(i18) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar13.f16571d = -1882337843;
                }
                i17.f30011b = bVar13;
                c12.add(i17);
                return c12;
            case 193:
                ArrayList<b> c13 = c();
                RectF d14 = d();
                b bVar14 = new b();
                PathHolder pathHolder10 = new PathHolder();
                d14.set(rect);
                pathHolder10.addRect(d14, Path.Direction.CW);
                bVar14.c(pathHolder10);
                bVar14.f30011b = eVar.f20603d;
                b i19 = r.i(c13, bVar14);
                PathHolder pathHolder11 = new PathHolder();
                int round = Math.round(Math.min(rect.width(), rect.height()) * 0.75f);
                float round2 = (float) Math.round((Math.sqrt(3.0d) / 4.0d) * round);
                pathHolder11.moveTo(rect.centerX() + round2, rect.centerY());
                int i20 = round / 2;
                pathHolder11.lineTo(rect.centerX() - round2, rect.centerY() + i20);
                pathHolder11.lineTo(rect.centerX() - round2, rect.centerY() - i20);
                pathHolder11.close();
                i19.c(pathHolder11);
                eh.b bVar15 = new eh.b();
                bVar15.c = (byte) 0;
                eh.b bVar16 = eVar.f20603d;
                if (bVar16 != null && bVar16.c == 0) {
                    int i21 = bVar16.f16571d;
                    bVar15.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i21) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i21) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i21) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar15.f16571d = -1891351484;
                }
                i19.f30011b = bVar15;
                c13.add(i19);
                return c13;
            case 194:
                ArrayList<b> c14 = c();
                RectF d15 = d();
                b bVar17 = new b();
                PathHolder pathHolder12 = new PathHolder();
                d15.set(rect);
                pathHolder12.addRect(d15, Path.Direction.CW);
                bVar17.c(pathHolder12);
                bVar17.f30011b = eVar.f20603d;
                b i22 = r.i(c14, bVar17);
                PathHolder pathHolder13 = new PathHolder();
                int round3 = Math.round(Math.min(rect.width(), rect.height()) * 0.75f);
                float round4 = (float) Math.round((Math.sqrt(3.0d) / 4.0d) * round3);
                pathHolder13.moveTo(rect.centerX() - round4, rect.centerY());
                int i23 = round3 / 2;
                pathHolder13.lineTo(rect.centerX() + round4, rect.centerY() - i23);
                pathHolder13.lineTo(rect.centerX() + round4, rect.centerY() + i23);
                pathHolder13.close();
                eh.b bVar18 = new eh.b();
                bVar18.c = (byte) 0;
                eh.b bVar19 = eVar.f20603d;
                if (bVar19 != null && bVar19.c == 0) {
                    int i24 = bVar19.f16571d;
                    bVar18.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i24) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i24) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i24) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar18.f16571d = -1891351484;
                }
                i22.f30011b = bVar18;
                i22.c(pathHolder13);
                c14.add(i22);
                return c14;
            case 195:
                ArrayList<b> c15 = c();
                RectF d16 = d();
                b bVar20 = new b();
                PathHolder pathHolder14 = new PathHolder();
                d16.set(rect);
                pathHolder14.addRect(d16, Path.Direction.CW);
                bVar20.c(pathHolder14);
                bVar20.f30011b = eVar.f20603d;
                b i25 = r.i(c15, bVar20);
                PathHolder pathHolder15 = new PathHolder();
                float min6 = Math.min(rect.width(), rect.height());
                float f28 = min6 * 0.375f;
                pathHolder15.addRect((0.275f * min6) + rect.centerX(), rect.centerY() - f28, rect.centerX() + f28, rect.centerY() + f28, Path.Direction.CW);
                pathHolder15.moveTo(((min * 3) / 16.0f) + rect.centerX(), rect.centerY());
                pathHolder15.lineTo(h.b(rect.centerY(), f28, pathHolder15, rect.centerX() - f28, rect) - f28, rect.centerY() - f28);
                pathHolder15.close();
                i25.c(pathHolder15);
                eh.b bVar21 = new eh.b();
                bVar21.c = (byte) 0;
                eh.b bVar22 = eVar.f20603d;
                if (bVar22 != null && bVar22.c == 0) {
                    int i26 = bVar22.f16571d;
                    bVar21.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i26) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i26) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i26) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar21.f16571d = -1891351484;
                }
                i25.f30011b = bVar21;
                c15.add(i25);
                return c15;
            case 196:
                ArrayList<b> c16 = c();
                RectF d17 = d();
                b bVar23 = new b();
                PathHolder pathHolder16 = new PathHolder();
                d17.set(rect);
                pathHolder16.addRect(d17, Path.Direction.CW);
                bVar23.c(pathHolder16);
                bVar23.f30011b = eVar.f20603d;
                b i27 = r.i(c16, bVar23);
                PathHolder pathHolder17 = new PathHolder();
                float min7 = Math.min(rect.width(), rect.height());
                float f29 = min7 * 0.375f;
                pathHolder17.addRect(rect.centerX() - f29, rect.centerY() - f29, rect.centerX() - (min7 * 0.275f), rect.centerY() + f29, Path.Direction.CW);
                pathHolder17.moveTo(rect.centerX() - ((min2 * 3) / 16.0f), rect.centerY());
                pathHolder17.lineTo(f.f(rect.centerY(), f29, pathHolder17, rect.centerX() + f29, rect) + f29, rect.centerY() + f29);
                pathHolder17.close();
                i27.c(pathHolder17);
                eh.b bVar24 = new eh.b();
                bVar24.c = (byte) 0;
                eh.b bVar25 = eVar.f20603d;
                if (bVar25 != null && bVar25.c == 0) {
                    int i28 = bVar25.f16571d;
                    bVar24.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i28) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i28) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i28) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar24.f16571d = -1891351484;
                }
                i27.f30011b = bVar24;
                c16.add(i27);
                return c16;
            case 197:
                ArrayList<b> c17 = c();
                RectF d18 = d();
                b bVar26 = new b();
                PathHolder pathHolder18 = new PathHolder();
                d18.set(rect);
                pathHolder18.addRect(d18, Path.Direction.CW);
                bVar26.c(pathHolder18);
                bVar26.f30011b = eVar.f20603d;
                c17.add(bVar26);
                int min8 = Math.min(rect.width(), rect.height());
                b bVar27 = new b();
                PathHolder pathHolder19 = new PathHolder();
                float f30 = min8;
                float f31 = 0.4f * f30;
                float f32 = 0.2f * f30;
                pathHolder19.moveTo(rect.centerX() - f31, rect.centerY() - f32);
                float centerY9 = rect.centerY();
                float f33 = 0.1f * f30;
                d18.set(h.b(rect.centerY(), f33, pathHolder19, f.f(centerY9, f32, pathHolder19, rect.centerX() - f32, rect) - f32, rect) - f32, rect.centerY(), rect.centerX(), rect.centerY() + f32);
                pathHolder19.arcTo(d18, 180.0f, -90.0f);
                d18.set(h.b(rect.centerY(), f32, pathHolder19, rect.centerX(), rect) - f33, rect.centerY(), rect.centerX() + f33, rect.centerY() + f32);
                pathHolder19.arcTo(d18, 90.0f, -90.0f);
                float centerY10 = rect.centerY();
                float centerY11 = rect.centerY();
                float centerY12 = rect.centerY();
                float centerY13 = rect.centerY();
                float f34 = f30 * 0.3f;
                d18.set(f.f(rect.centerY(), f32, pathHolder19, f.f(centerY13, f32, pathHolder19, f.f(centerY12, f31, pathHolder19, f.f(centerY11, f32, pathHolder19, f.f(centerY10, f32, pathHolder19, rect.centerX() + f33, rect), rect) + f32, rect) + f31, rect) + f34, rect) - f34, rect.centerY() - f32, rect.centerX() + f34, rect.centerY() + f31);
                pathHolder19.arcTo(d18, 0.0f, 90.0f);
                d18.set(rect.centerX() - f31, rect.centerY() - f32, rect.centerX() + f32, rect.centerY() + f31);
                pathHolder19.arcTo(d18, 90.0f, 90.0f);
                pathHolder19.close();
                bVar27.c(pathHolder19);
                eh.b bVar28 = new eh.b();
                bVar28.c = (byte) 0;
                eh.b bVar29 = eVar.f20603d;
                if (bVar29 != null && bVar29.c == 0) {
                    int i29 = bVar29.f16571d;
                    bVar28.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i29) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i29) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i29) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar28.f16571d = -1891351484;
                }
                bVar27.f30011b = bVar28;
                c17.add(bVar27);
                return c17;
            case 198:
                ArrayList<b> c18 = c();
                RectF d19 = d();
                b bVar30 = new b();
                PathHolder pathHolder20 = new PathHolder();
                d19.set(rect);
                pathHolder20.addRect(d19, Path.Direction.CW);
                bVar30.c(pathHolder20);
                bVar30.f30011b = eVar.f20603d;
                c18.add(bVar30);
                int min9 = Math.min(rect.width(), rect.height());
                b bVar31 = new b();
                PathHolder pathHolder21 = new PathHolder();
                float f35 = min9;
                float f36 = 0.28f * f35;
                float f37 = f35 * 0.38f;
                pathHolder21.moveTo(rect.centerX() - f36, rect.centerY() - f37);
                float f38 = 0.1f * f35;
                float centerY14 = rect.centerY();
                float centerY15 = rect.centerY();
                float f39 = f35 * 0.18f;
                float centerY16 = rect.centerY();
                pathHolder21.lineTo(h.b(rect.centerY(), f37, pathHolder21, f.f(centerY16, f39, pathHolder21, f.f(centerY15, f39, pathHolder21, f.f(centerY14, f37, pathHolder21, rect.centerX() + f38, rect) + f38, rect) + f36, rect) + f36, rect) - f36, rect.centerY() + f37);
                pathHolder21.close();
                bVar31.c(pathHolder21);
                eh.b bVar32 = new eh.b();
                bVar32.c = (byte) 0;
                eh.b bVar33 = eVar.f20603d;
                if (bVar33 != null && bVar33.c == 0) {
                    int i30 = bVar33.f16571d;
                    bVar32.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i30) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i30) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i30) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar32.f16571d = -1890233003;
                }
                bVar31.f30011b = bVar32;
                b i31 = r.i(c18, bVar31);
                PathHolder pathHolder22 = new PathHolder();
                pathHolder22.moveTo(rect.centerX() + f38, rect.centerY() - f37);
                pathHolder22.lineTo(f.f(rect.centerY(), f39, pathHolder22, rect.centerX() + f38, rect) + f36, rect.centerY() - f39);
                pathHolder22.close();
                i31.c(pathHolder22);
                eh.b bVar34 = new eh.b();
                bVar34.c = (byte) 0;
                if (bVar33 != null && bVar33.c == 0) {
                    int i32 = bVar33.f16571d;
                    bVar34.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i32) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i32) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i32) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    bVar34.f16571d = -1891351484;
                }
                i31.f30011b = bVar34;
                c18.add(i31);
                return c18;
            case 199:
                return e(eVar, rect);
            case 200:
                return b(eVar, rect);
            default:
                return null;
        }
    }

    public static ArrayList b(e eVar, Rect rect) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        ArrayList<b> c = c();
        RectF d10 = d();
        b bVar = new b();
        PathHolder pathHolder = new PathHolder();
        d10.set(rect);
        pathHolder.addRect(d10, Path.Direction.CW);
        bVar.c(pathHolder);
        bVar.f30011b = eVar.f20603d;
        c.add(bVar);
        int min = Math.min(rect.width(), rect.height());
        b bVar2 = new b();
        PathHolder pathHolder2 = new PathHolder();
        float f15 = min;
        float f16 = 0.38f * f15;
        pathHolder2.moveTo(rect.centerX() - f16, rect.centerY() - (0.2f * f15));
        float f17 = 0.31f * f15;
        float f18 = f.f(rect.centerY(), f10, pathHolder2, rect.centerX() - f17, rect) - (0.3f * f15);
        float f19 = 0.18f * f15;
        float centerY = rect.centerY();
        float centerY2 = rect.centerY();
        float f20 = 0.15f * f15;
        float centerY3 = rect.centerY();
        float f21 = 0.12f * f15;
        float centerY4 = rect.centerY();
        float centerY5 = rect.centerY();
        float f22 = 0.37f * f15;
        float b10 = h.b(rect.centerY(), f20, pathHolder2, f.f(rect.centerY(), f20, pathHolder2, f.f(centerY5, f20, pathHolder2, f.f(centerY4, f21, pathHolder2, f.f(centerY3, f21, pathHolder2, f.f(centerY2, f20, pathHolder2, f.f(centerY, f19, pathHolder2, f.f(rect.centerY(), f19, pathHolder2, f18, rect) + f19, rect) + f11, rect) + f11, rect) + f17, rect) + f12, rect) + f22, rect) + f22, rect) + (0.34f * f15);
        float centerY6 = rect.centerY();
        float b11 = h.b(rect.centerY(), f21, pathHolder2, h.b(centerY6, f21, pathHolder2, h.b(rect.centerY(), f20, pathHolder2, b10, rect) + f13, rect) + f11, rect) + (0.22f * f15);
        float f23 = 0.16f * f15;
        float b12 = h.b(rect.centerY(), f23, pathHolder2, h.b(rect.centerY(), f23, pathHolder2, b11, rect) - f13, rect) - (0.29f * f15);
        float f24 = 0.06f * f15;
        float f25 = f.f(rect.centerY(), f24, pathHolder2, f.f(rect.centerY(), f24, pathHolder2, b12, rect) - f17, rect) - (0.32f * f15);
        pathHolder2.lineTo(f.f(rect.centerY(), f14, pathHolder2, f25, rect) - f16, rect.centerY() - (f15 * 0.04f));
        pathHolder2.close();
        bVar2.c(pathHolder2);
        eh.b bVar3 = new eh.b();
        bVar3.c = (byte) 0;
        eh.b bVar4 = eVar.f20603d;
        if (bVar4 != null && bVar4.c == 0) {
            int i10 = bVar4.f16571d;
            bVar3.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else {
            bVar3.f16571d = -1891351484;
        }
        bVar2.f30011b = bVar3;
        c.add(bVar2);
        return c;
    }

    public static ArrayList<b> c() {
        return e.a.f29807a.b("ActionButtonPathBuilder");
    }

    public static RectF d() {
        return e.a.f29807a.f("ActionButtonPathBuilder");
    }

    public static ArrayList e(lh.e eVar, Rect rect) {
        float f10;
        ArrayList<b> c = c();
        RectF d10 = d();
        b bVar = new b();
        PathHolder pathHolder = new PathHolder();
        d10.set(rect);
        pathHolder.addRect(d10, Path.Direction.CW);
        bVar.c(pathHolder);
        bVar.f30011b = eVar.f20603d;
        c.add(bVar);
        int min = Math.min(rect.width(), rect.height());
        b bVar2 = new b();
        PathHolder pathHolder2 = new PathHolder();
        float f11 = min;
        float f12 = 0.38f * f11;
        float f13 = 0.14f * f11;
        pathHolder2.moveTo(rect.centerX() - f12, rect.centerY() - f13);
        float centerY = rect.centerY();
        float f14 = f.f(rect.centerY(), f12, pathHolder2, f.f(centerY, f13, pathHolder2, rect.centerX() - f13, rect) + f10, rect) + (0.1f * f11);
        pathHolder2.lineTo(h.b(rect.centerY(), f13, pathHolder2, h.b(rect.centerY(), f12, pathHolder2, f14, rect) - f13, rect) - f12, rect.centerY() + f13);
        pathHolder2.close();
        float min2 = Math.min(5.0f, 0.01f * f11);
        float f15 = 0.18f * f11;
        pathHolder2.moveTo(rect.centerX() + f15, rect.centerY() - f13);
        float f16 = f11 * 0.28f;
        pathHolder2.lineTo(f.f(rect.centerY(), f16, pathHolder2, rect.centerX() + f12, rect) + f12, (rect.centerY() - f16) + min2);
        pathHolder2.lineTo(rect.centerX() + f15, (rect.centerY() - f13) + min2);
        pathHolder2.close();
        pathHolder2.moveTo(rect.centerX() + f15, rect.centerY());
        pathHolder2.lineTo(rect.centerX() + f12, rect.centerY());
        pathHolder2.lineTo(h.b(rect.centerY(), min2, pathHolder2, rect.centerX() + f12, rect) + f15, rect.centerY() + min2);
        pathHolder2.close();
        pathHolder2.moveTo(rect.centerX() + f15, rect.centerY() + f13);
        pathHolder2.lineTo(h.b(rect.centerY(), f16, pathHolder2, rect.centerX() + f12, rect) + f12, rect.centerY() + f16 + min2);
        pathHolder2.lineTo(rect.centerX() + f15, rect.centerY() + f13 + min2);
        pathHolder2.close();
        bVar2.c(pathHolder2);
        eh.b bVar3 = new eh.b();
        bVar3.c = (byte) 0;
        eh.b bVar4 = eVar.f20603d;
        if (bVar4 != null && bVar4.c == 0) {
            int i10 = bVar4.f16571d;
            bVar3.f16571d = Color.rgb(b1.o(-0.5d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else {
            bVar3.f16571d = -1890233003;
        }
        bVar2.f30011b = bVar3;
        c.add(bVar2);
        return c;
    }
}
