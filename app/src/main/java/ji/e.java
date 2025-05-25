package ji;

import android.graphics.Color;
import com.google.android.play.core.assetpacks.b1;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: TableStyleKit.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f19274k = {"accent1", "accent2", "accent3", "accent4", "accent5", "accent6"};

    /* renamed from: a  reason: collision with root package name */
    public c f19275a;

    /* renamed from: b  reason: collision with root package name */
    public c f19276b;
    public c c;

    /* renamed from: d  reason: collision with root package name */
    public c f19277d;

    /* renamed from: e  reason: collision with root package name */
    public c f19278e;

    /* renamed from: f  reason: collision with root package name */
    public c f19279f;

    /* renamed from: g  reason: collision with root package name */
    public c f19280g;

    /* renamed from: h  reason: collision with root package name */
    public c f19281h;

    /* renamed from: i  reason: collision with root package name */
    public c f19282i;

    /* renamed from: j  reason: collision with root package name */
    public c f19283j;

    public static int a(int i10, Map map) {
        int i11 = i10 % 7;
        if (i11 == 1) {
            return -16777216;
        }
        return ((Integer) map.get(f19274k[((i11 - 2) + 7) % 7])).intValue();
    }

    public final c b(int i10) {
        int rgb;
        int rgb2;
        int rgb3;
        int rgb4;
        if (this.f19281h == null) {
            this.f19281h = new c();
            b bVar = new b(-16777216);
            bVar.f19264a = -1;
            bVar.a(-1);
            this.f19281h.f19271g = bVar;
            int i11 = i10 & 16777215;
            if (i11 == 0) {
                rgb3 = Color.rgb(b1.o(0.15000000596046448d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.15000000596046448d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.15000000596046448d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else {
                rgb3 = Color.rgb(b1.o(-0.5d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            }
            b bVar2 = new b(rgb3);
            bVar2.f19264a = -1;
            bVar2.a(-1);
            this.f19281h.f19272h = bVar2;
            if (i11 == 0) {
                rgb4 = Color.rgb(b1.o(0.25d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.25d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.25d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else {
                rgb4 = Color.rgb(b1.o(-0.25d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.25d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.25d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            }
            b bVar3 = new b(rgb4);
            bVar3.f19264a = -1;
            c cVar = this.f19281h;
            cVar.f19266a = bVar3;
            cVar.c = bVar3;
            if (i11 == 0) {
                i10 = Color.rgb(b1.o(0.5d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.5d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.5d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            }
            b bVar4 = new b(i10);
            bVar4.f19264a = -1;
            c cVar2 = this.f19281h;
            cVar2.f19267b = bVar4;
            cVar2.f19268d = bVar4;
        } else {
            int i12 = i10 & 16777215;
            if (i12 == 0) {
                rgb = Color.rgb(b1.o(0.15000000596046448d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.15000000596046448d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.15000000596046448d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else {
                rgb = Color.rgb(b1.o(-0.5d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.5d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            }
            b bVar5 = this.f19281h.f19272h;
            bVar5.b(rgb);
            this.f19281h.f19272h = bVar5;
            if (i12 == 0) {
                rgb2 = Color.rgb(b1.o(0.25d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.25d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.25d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else {
                rgb2 = Color.rgb(b1.o(-0.25d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.25d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.25d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            }
            b bVar6 = this.f19281h.f19266a;
            bVar6.b(rgb2);
            c cVar3 = this.f19281h;
            cVar3.f19266a = bVar6;
            cVar3.c = bVar6;
            if (i12 == 0) {
                i10 = Color.rgb(b1.o(0.5d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.5d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.5d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            }
            b bVar7 = this.f19281h.f19267b;
            bVar7.b(i10);
            c cVar4 = this.f19281h;
            cVar4.f19267b = bVar7;
            cVar4.f19268d = bVar7;
        }
        return this.f19281h;
    }

    public final c c() {
        if (this.f19282i == null) {
            this.f19282i = new c();
            b bVar = new b(-16777216);
            bVar.f19264a = -1;
            this.f19282i.f19271g = bVar;
            b bVar2 = new b(-5921371);
            c cVar = this.f19282i;
            cVar.f19266a = bVar2;
            cVar.c = bVar2;
            b bVar3 = new b(-2565928);
            c cVar2 = this.f19282i;
            cVar2.f19267b = bVar3;
            cVar2.f19268d = bVar3;
        }
        return this.f19282i;
    }

    public final c d(int i10, int i11) {
        c cVar = this.f19283j;
        if (cVar == null) {
            this.f19283j = new c();
            b bVar = new b(i10);
            bVar.f19264a = -1;
            this.f19283j.f19271g = bVar;
            b bVar2 = new b(b1.y(0.6000000238418579d, i11));
            c cVar2 = this.f19283j;
            cVar2.f19266a = bVar2;
            cVar2.c = bVar2;
            b bVar3 = new b(b1.y(0.800000011920929d, i11));
            c cVar3 = this.f19283j;
            cVar3.f19267b = bVar3;
            cVar3.f19268d = bVar3;
        } else {
            b bVar4 = cVar.f19271g;
            bVar4.b(i10);
            this.f19283j.f19271g = bVar4;
            int y10 = b1.y(0.6000000238418579d, i11);
            b bVar5 = this.f19283j.f19266a;
            bVar5.b(y10);
            c cVar4 = this.f19283j;
            cVar4.f19266a = bVar5;
            cVar4.c = bVar5;
            int y11 = b1.y(0.800000011920929d, i11);
            b bVar6 = this.f19283j.f19267b;
            bVar6.b(y11);
            c cVar5 = this.f19283j;
            cVar5.f19267b = bVar6;
            cVar5.f19268d = bVar6;
        }
        return this.f19283j;
    }

    public final c e(int i10) {
        c cVar = this.c;
        if (cVar == null) {
            this.c = new c();
            b bVar = new b(-1);
            bVar.a(i10);
            c cVar2 = this.c;
            cVar2.f19271g = bVar;
            cVar2.f19272h = bVar;
            b bVar2 = new b(Color.rgb(b1.o(0.800000011920929d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC)));
            bVar2.a(i10);
            c cVar3 = this.c;
            cVar3.f19266a = bVar2;
            cVar3.c = bVar2;
            b bVar3 = new b(-1);
            bVar3.a(i10);
            c cVar4 = this.c;
            cVar4.f19267b = bVar3;
            cVar4.f19268d = bVar3;
        } else {
            b bVar4 = cVar.f19271g;
            bVar4.a(i10);
            c cVar5 = this.c;
            cVar5.f19271g = bVar4;
            cVar5.f19272h = bVar4;
            int rgb = Color.rgb(b1.o(0.800000011920929d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            b bVar5 = this.c.f19266a;
            bVar5.b(rgb);
            bVar5.a(i10);
            c cVar6 = this.c;
            cVar6.f19266a = bVar5;
            cVar6.c = bVar5;
            b bVar6 = cVar6.f19267b;
            bVar6.a(i10);
            c cVar7 = this.c;
            cVar7.f19267b = bVar6;
            cVar7.f19268d = bVar6;
        }
        return this.c;
    }

    public final c f(int i10) {
        c cVar = this.f19275a;
        if (cVar == null) {
            this.f19275a = new c();
            b bVar = new b(-1);
            bVar.f19264a = i10;
            bVar.a(i10);
            c cVar2 = this.f19275a;
            cVar2.f19271g = bVar;
            cVar2.f19272h = bVar;
            b bVar2 = new b(Color.rgb(b1.o(0.800000011920929d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC)));
            bVar2.f19264a = i10;
            c cVar3 = this.f19275a;
            cVar3.f19266a = bVar2;
            cVar3.c = bVar2;
            b bVar3 = new b(-1);
            bVar3.f19264a = i10;
            c cVar4 = this.f19275a;
            cVar4.f19267b = bVar3;
            cVar4.f19268d = bVar3;
        } else {
            b bVar4 = cVar.f19271g;
            bVar4.f19264a = i10;
            bVar4.a(i10);
            c cVar5 = this.f19275a;
            cVar5.f19271g = bVar4;
            cVar5.f19272h = bVar4;
            int rgb = Color.rgb(b1.o(0.800000011920929d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            b bVar5 = this.f19275a.f19266a;
            bVar5.b(rgb);
            bVar5.f19264a = i10;
            c cVar6 = this.f19275a;
            cVar6.f19266a = bVar5;
            cVar6.c = bVar5;
            b bVar6 = cVar6.f19267b;
            bVar6.f19264a = i10;
            cVar6.f19267b = bVar6;
            cVar6.f19268d = bVar6;
        }
        return this.f19275a;
    }

    public final c g(int i10) {
        c cVar = this.f19276b;
        if (cVar == null) {
            this.f19276b = new c();
            b bVar = new b(i10);
            bVar.f19264a = -1;
            bVar.a(i10);
            this.f19276b.f19271g = bVar;
            b bVar2 = new b(-1);
            bVar2.a(i10);
            c cVar2 = this.f19276b;
            cVar2.f19272h = bVar2;
            cVar2.f19266a = bVar2;
            cVar2.c = bVar2;
            cVar2.f19267b = bVar2;
            cVar2.f19268d = bVar2;
        } else {
            b bVar3 = cVar.f19271g;
            bVar3.b(i10);
            bVar3.a(i10);
            c cVar3 = this.f19276b;
            cVar3.f19271g = bVar3;
            b bVar4 = cVar3.f19266a;
            bVar4.a(i10);
            c cVar4 = this.f19276b;
            cVar4.f19272h = bVar4;
            cVar4.f19266a = bVar4;
            cVar4.c = bVar4;
            cVar4.f19267b = bVar4;
            cVar4.f19268d = bVar4;
        }
        return this.f19276b;
    }

    public final c h(int i10) {
        c cVar = this.f19279f;
        if (cVar == null) {
            this.f19279f = new c();
            b bVar = new b(i10);
            bVar.f19264a = -1;
            c cVar2 = this.f19279f;
            cVar2.f19271g = bVar;
            cVar2.f19269e = bVar;
            cVar2.f19270f = bVar;
            b bVar2 = new b(-2565928);
            c cVar3 = this.f19279f;
            cVar3.f19266a = bVar2;
            cVar3.c = bVar2;
            b bVar3 = new b(-1);
            c cVar4 = this.f19279f;
            cVar4.f19267b = bVar3;
            cVar4.f19268d = bVar3;
        } else {
            b bVar4 = cVar.f19271g;
            bVar4.b(i10);
            c cVar5 = this.f19279f;
            cVar5.f19269e = bVar4;
            cVar5.f19270f = bVar4;
        }
        return this.f19279f;
    }

    public final c i(int i10) {
        c cVar = this.f19277d;
        if (cVar == null) {
            this.f19277d = new c();
            b bVar = new b(i10);
            bVar.f19264a = -1;
            bVar.a(i10);
            this.f19277d.f19271g = bVar;
            b bVar2 = new b(Color.rgb(b1.o(0.800000011920929d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC)));
            bVar2.a(i10);
            c cVar2 = this.f19277d;
            cVar2.f19266a = bVar2;
            cVar2.c = bVar2;
            b bVar3 = new b(-1);
            bVar3.a(i10);
            c cVar3 = this.f19277d;
            cVar3.f19267b = bVar3;
            cVar3.f19268d = bVar3;
        } else {
            b bVar4 = cVar.f19271g;
            bVar4.b(i10);
            bVar4.a(i10);
            bVar4.f19264a = -1;
            this.f19277d.f19271g = bVar4;
            int rgb = Color.rgb(b1.o(0.800000011920929d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.800000011920929d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            b bVar5 = this.f19277d.f19266a;
            bVar5.b(rgb);
            bVar5.a(i10);
            c cVar4 = this.f19277d;
            cVar4.f19266a = bVar5;
            cVar4.c = bVar5;
            b bVar6 = cVar4.f19267b;
            bVar6.a(i10);
            c cVar5 = this.f19277d;
            cVar5.f19267b = bVar6;
            cVar5.f19268d = bVar6;
        }
        return this.f19277d;
    }

    public final c j(int i10) {
        if (this.f19280g == null) {
            this.f19280g = new c();
            b bVar = new b(b1.y(0.6000000238418579d, i10));
            bVar.a(i10);
            c cVar = this.f19280g;
            cVar.f19266a = bVar;
            cVar.c = bVar;
            b bVar2 = new b(b1.y(0.800000011920929d, i10));
            bVar2.a(i10);
            c cVar2 = this.f19280g;
            cVar2.f19271g = bVar2;
            cVar2.f19272h = bVar2;
            cVar2.f19267b = bVar2;
            cVar2.f19268d = bVar2;
        } else {
            int y10 = b1.y(0.6000000238418579d, i10);
            b bVar3 = this.f19280g.f19266a;
            bVar3.b(y10);
            bVar3.a(i10);
            c cVar3 = this.f19280g;
            cVar3.f19266a = bVar3;
            cVar3.c = bVar3;
            int y11 = b1.y(0.800000011920929d, i10);
            b bVar4 = this.f19280g.f19271g;
            bVar4.b(y11);
            bVar4.a(i10);
            c cVar4 = this.f19280g;
            cVar4.f19271g = bVar4;
            cVar4.f19272h = bVar4;
            cVar4.f19267b = bVar4;
            cVar4.f19268d = bVar4;
        }
        return this.f19280g;
    }

    public final c k(int i10) {
        c cVar = this.f19278e;
        if (cVar == null) {
            this.f19278e = new c();
            b bVar = new b(i10);
            bVar.a(-1);
            bVar.f19264a = -1;
            c cVar2 = this.f19278e;
            cVar2.f19271g = bVar;
            cVar2.f19269e = bVar;
            cVar2.f19270f = bVar;
            cVar2.f19272h = bVar;
            b bVar2 = new b(b1.y(0.6000000238418579d, i10));
            bVar2.a(-1);
            c cVar3 = this.f19278e;
            cVar3.f19266a = bVar2;
            cVar3.c = bVar2;
            b bVar3 = new b(b1.y(0.800000011920929d, i10));
            bVar3.a(-1);
            c cVar4 = this.f19278e;
            cVar4.f19267b = bVar3;
            cVar4.f19268d = bVar3;
        } else {
            b bVar4 = cVar.f19271g;
            bVar4.b(i10);
            bVar4.a(-1);
            bVar4.f19264a = -1;
            c cVar5 = this.f19278e;
            cVar5.f19271g = bVar4;
            cVar5.f19269e = bVar4;
            cVar5.f19270f = bVar4;
            cVar5.f19272h = bVar4;
            int y10 = b1.y(0.6000000238418579d, i10);
            b bVar5 = this.f19278e.f19266a;
            bVar5.b(y10);
            bVar5.a(-1);
            c cVar6 = this.f19278e;
            cVar6.f19266a = bVar5;
            cVar6.c = bVar5;
            int y11 = b1.y(0.800000011920929d, i10);
            b bVar6 = this.f19278e.f19267b;
            bVar6.b(y11);
            bVar6.a(-1);
            c cVar7 = this.f19278e;
            cVar7.f19267b = bVar6;
            cVar7.f19268d = bVar6;
        }
        return this.f19278e;
    }
}
