package hi;

import java.util.ArrayList;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: Palette.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f18347a;

    /* compiled from: Palette.java */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f18348a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18349b;
        public final int c;

        public a(int i10, int i11, int i12) {
            this.f18348a = i10;
            this.f18349b = i11;
            this.c = i12;
        }
    }

    public b() {
        a[] aVarArr = {new a(0, 0, 0), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, 0, 0), new a(0, FunctionEval.FunctionID.EXTERNAL_FUNC, 0), new a(0, 0, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, 0), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, 0, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(0, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(128, 0, 0), new a(0, 128, 0), new a(0, 0, 128), new a(128, 128, 0), new a(128, 0, 128), new a(0, 128, 128), new a(192, 192, 192), new a(128, 128, 128), new a(153, 153, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(153, 51, 102), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, 204), new a(204, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(102, 0, 102), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, 128, 128), new a(0, 102, 204), new a(204, 204, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(0, 0, 128), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, 0, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, 0), new a(0, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(128, 0, 128), new a(128, 0, 0), new a(0, 128, 128), new a(0, 0, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(0, 204, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(204, FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(204, FunctionEval.FunctionID.EXTERNAL_FUNC, 204), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, FunctionEval.FunctionID.EXTERNAL_FUNC, 153), new a(153, 204, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, 153, 204), new a(204, 153, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, 204, 153), new a(51, 102, FunctionEval.FunctionID.EXTERNAL_FUNC), new a(51, 204, 204), new a(153, 204, 0), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, 204, 0), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, 153, 0), new a(FunctionEval.FunctionID.EXTERNAL_FUNC, 102, 0), new a(102, 102, 153), new a(ShapeTypes.FLOW_CHART_EXTRACT, ShapeTypes.FLOW_CHART_EXTRACT, ShapeTypes.FLOW_CHART_EXTRACT), new a(0, 51, 102), new a(51, 153, 102), new a(0, 51, 0), new a(51, 51, 0), new a(153, 51, 0), new a(153, 51, 102), new a(51, 51, 153), new a(51, 51, 51)};
        this.f18347a = new ArrayList(56);
        for (int i10 = 0; i10 < 56; i10++) {
            this.f18347a.add(aVarArr[i10]);
        }
    }

    public final byte[] a(int i10) {
        int i11 = i10 - 8;
        if (i11 >= 0) {
            ArrayList arrayList = this.f18347a;
            if (i11 < arrayList.size()) {
                a aVar = (a) arrayList.get(i11);
                return new byte[]{(byte) aVar.f18348a, (byte) aVar.f18349b, (byte) aVar.c};
            }
            return null;
        }
        return null;
    }
}
