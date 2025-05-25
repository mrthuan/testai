package lib.zj.office.fc.hssf.formula.udf;

import lib.zj.office.fc.hssf.formula.atp.AnalysisToolPak;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;

/* loaded from: classes3.dex */
public interface UDFFinder {
    public static final UDFFinder DEFAULT = new AggregatingUDFFinder(AnalysisToolPak.instance);

    FreeRefFunction findFunction(String str);
}
