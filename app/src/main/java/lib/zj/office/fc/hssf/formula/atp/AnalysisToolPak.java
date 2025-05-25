package lib.zj.office.fc.hssf.formula.atp;

import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.OperationEvaluationContext;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;

/* loaded from: classes3.dex */
public final class AnalysisToolPak implements UDFFinder {
    public static final UDFFinder instance = new AnalysisToolPak();
    private final Map<String, FreeRefFunction> _functionsByName = createFunctionsMap();

    /* loaded from: classes3.dex */
    public static final class NotImplemented implements FreeRefFunction {
        private final String _functionName;

        public NotImplemented(String str) {
            this._functionName = str;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.FreeRefFunction
        public ValueEval evaluate(ValueEval[] valueEvalArr, OperationEvaluationContext operationEvaluationContext) {
            return null;
        }
    }

    private AnalysisToolPak() {
    }

    private Map<String, FreeRefFunction> createFunctionsMap() {
        HashMap hashMap = new HashMap(108);
        r(hashMap, "ACCRINT", null);
        r(hashMap, "ACCRINTM", null);
        r(hashMap, "AMORDEGRC", null);
        r(hashMap, "AMORLINC", null);
        r(hashMap, "AVERAGEIF", null);
        r(hashMap, "AVERAGEIFS", null);
        r(hashMap, "BAHTTEXT", null);
        r(hashMap, "BESSELI", null);
        r(hashMap, "BESSELJ", null);
        r(hashMap, "BESSELK", null);
        r(hashMap, "BESSELY", null);
        r(hashMap, "BIN2DEC", null);
        r(hashMap, "BIN2HEX", null);
        r(hashMap, "BIN2OCT", null);
        r(hashMap, "COMPLEX", null);
        r(hashMap, "CONVERT", null);
        r(hashMap, "COUNTIFS", null);
        r(hashMap, "COUPDAYBS", null);
        r(hashMap, "COUPDAYS", null);
        r(hashMap, "COUPDAYSNC", null);
        r(hashMap, "COUPNCD", null);
        r(hashMap, "COUPNUM", null);
        r(hashMap, "COUPPCD", null);
        r(hashMap, "CUBEKPIMEMBER", null);
        r(hashMap, "CUBEMEMBER", null);
        r(hashMap, "CUBEMEMBERPROPERTY", null);
        r(hashMap, "CUBERANKEDMEMBER", null);
        r(hashMap, "CUBESET", null);
        r(hashMap, "CUBESETCOUNT", null);
        r(hashMap, "CUBEVALUE", null);
        r(hashMap, "CUMIPMT", null);
        r(hashMap, "CUMPRINC", null);
        r(hashMap, "DEC2BIN", null);
        r(hashMap, "DEC2HEX", null);
        r(hashMap, "DEC2OCT", null);
        r(hashMap, "DELTA", null);
        r(hashMap, "DISC", null);
        r(hashMap, "DOLLARDE", null);
        r(hashMap, "DOLLARFR", null);
        r(hashMap, "DURATION", null);
        r(hashMap, "EDATE", null);
        r(hashMap, "EFFECT", null);
        r(hashMap, "EOMONTH", null);
        r(hashMap, "ERF", null);
        r(hashMap, "ERFC", null);
        r(hashMap, "FACTDOUBLE", null);
        r(hashMap, "FVSCHEDULE", null);
        r(hashMap, "GCD", null);
        r(hashMap, "GESTEP", null);
        r(hashMap, "HEX2BIN", null);
        r(hashMap, "HEX2DEC", null);
        r(hashMap, "HEX2OCT", null);
        r(hashMap, "IFERROR", null);
        r(hashMap, "IMABS", null);
        r(hashMap, "IMAGINARY", null);
        r(hashMap, "IMARGUMENT", null);
        r(hashMap, "IMCONJUGATE", null);
        r(hashMap, "IMCOS", null);
        r(hashMap, "IMDIV", null);
        r(hashMap, "IMEXP", null);
        r(hashMap, "IMLN", null);
        r(hashMap, "IMLOG10", null);
        r(hashMap, "IMLOG2", null);
        r(hashMap, "IMPOWER", null);
        r(hashMap, "IMPRODUCT", null);
        r(hashMap, "IMREAL", null);
        r(hashMap, "IMSIN", null);
        r(hashMap, "IMSQRT", null);
        r(hashMap, "IMSUB", null);
        r(hashMap, "IMSUM", null);
        r(hashMap, "INTRATE", null);
        r(hashMap, "ISEVEN", ParityFunction.IS_EVEN);
        r(hashMap, "ISODD", ParityFunction.IS_ODD);
        r(hashMap, "JIS", null);
        r(hashMap, "LCM", null);
        r(hashMap, "MDURATION", null);
        r(hashMap, "MROUND", MRound.instance);
        r(hashMap, "MULTINOMIAL", null);
        r(hashMap, "NETWORKDAYS", null);
        r(hashMap, "NOMINAL", null);
        r(hashMap, "OCT2BIN", null);
        r(hashMap, "OCT2DEC", null);
        r(hashMap, "OCT2HEX", null);
        r(hashMap, "ODDFPRICE", null);
        r(hashMap, "ODDFYIELD", null);
        r(hashMap, "ODDLPRICE", null);
        r(hashMap, "ODDLYIELD", null);
        r(hashMap, "PRICE", null);
        r(hashMap, "PRICEDISC", null);
        r(hashMap, "PRICEMAT", null);
        r(hashMap, "QUOTIENT", null);
        r(hashMap, "RANDBETWEEN", RandBetween.instance);
        r(hashMap, "RECEIVED", null);
        r(hashMap, "RTD", null);
        r(hashMap, "SERIESSUM", null);
        r(hashMap, "SQRTPI", null);
        r(hashMap, "SUMIFS", null);
        r(hashMap, "TBILLEQ", null);
        r(hashMap, "TBILLPRICE", null);
        r(hashMap, "TBILLYIELD", null);
        r(hashMap, "WEEKNUM", null);
        r(hashMap, "WORKDAY", null);
        r(hashMap, "XIRR", null);
        r(hashMap, "XNPV", null);
        r(hashMap, "YEARFRAC", YearFrac.instance);
        r(hashMap, "YIELD", null);
        r(hashMap, "YIELDDISC", null);
        r(hashMap, "YIELDMAT", null);
        return hashMap;
    }

    private static void r(Map<String, FreeRefFunction> map, String str, FreeRefFunction freeRefFunction) {
        if (freeRefFunction == null) {
            freeRefFunction = new NotImplemented(str);
        }
        map.put(str, freeRefFunction);
    }

    @Override // lib.zj.office.fc.hssf.formula.udf.UDFFinder
    public FreeRefFunction findFunction(String str) {
        return this._functionsByName.get(str);
    }
}
