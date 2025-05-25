package lib.zj.office.fc.hssf.formula.eval;

import b.a;
import lib.zj.office.fc.hssf.formula.function.Address;
import lib.zj.office.fc.hssf.formula.function.AggregateFunction;
import lib.zj.office.fc.hssf.formula.function.Averagea;
import lib.zj.office.fc.hssf.formula.function.BooleanFunction;
import lib.zj.office.fc.hssf.formula.function.CalendarFieldFunction;
import lib.zj.office.fc.hssf.formula.function.Choose;
import lib.zj.office.fc.hssf.formula.function.Column;
import lib.zj.office.fc.hssf.formula.function.Columns;
import lib.zj.office.fc.hssf.formula.function.Count;
import lib.zj.office.fc.hssf.formula.function.Counta;
import lib.zj.office.fc.hssf.formula.function.Countblank;
import lib.zj.office.fc.hssf.formula.function.Countif;
import lib.zj.office.fc.hssf.formula.function.DateFunc;
import lib.zj.office.fc.hssf.formula.function.Days360;
import lib.zj.office.fc.hssf.formula.function.Errortype;
import lib.zj.office.fc.hssf.formula.function.Even;
import lib.zj.office.fc.hssf.formula.function.FinanceFunction;
import lib.zj.office.fc.hssf.formula.function.Function;
import lib.zj.office.fc.hssf.formula.function.FunctionMetadata;
import lib.zj.office.fc.hssf.formula.function.FunctionMetadataRegistry;
import lib.zj.office.fc.hssf.formula.function.Hlookup;
import lib.zj.office.fc.hssf.formula.function.Hyperlink;
import lib.zj.office.fc.hssf.formula.function.IfFunc;
import lib.zj.office.fc.hssf.formula.function.Index;
import lib.zj.office.fc.hssf.formula.function.Irr;
import lib.zj.office.fc.hssf.formula.function.LogicalFunction;
import lib.zj.office.fc.hssf.formula.function.Lookup;
import lib.zj.office.fc.hssf.formula.function.Match;
import lib.zj.office.fc.hssf.formula.function.MinaMaxa;
import lib.zj.office.fc.hssf.formula.function.Mode;
import lib.zj.office.fc.hssf.formula.function.Na;
import lib.zj.office.fc.hssf.formula.function.NotImplementedFunction;
import lib.zj.office.fc.hssf.formula.function.Now;
import lib.zj.office.fc.hssf.formula.function.Npv;
import lib.zj.office.fc.hssf.formula.function.NumericFunction;
import lib.zj.office.fc.hssf.formula.function.Odd;
import lib.zj.office.fc.hssf.formula.function.Offset;
import lib.zj.office.fc.hssf.formula.function.Replace;
import lib.zj.office.fc.hssf.formula.function.RowFunc;
import lib.zj.office.fc.hssf.formula.function.Rows;
import lib.zj.office.fc.hssf.formula.function.Substitute;
import lib.zj.office.fc.hssf.formula.function.Subtotal;
import lib.zj.office.fc.hssf.formula.function.Sumif;
import lib.zj.office.fc.hssf.formula.function.Sumproduct;
import lib.zj.office.fc.hssf.formula.function.Sumx2my2;
import lib.zj.office.fc.hssf.formula.function.Sumx2py2;
import lib.zj.office.fc.hssf.formula.function.Sumxmy2;
import lib.zj.office.fc.hssf.formula.function.T;
import lib.zj.office.fc.hssf.formula.function.TextFunction;
import lib.zj.office.fc.hssf.formula.function.TimeFunc;
import lib.zj.office.fc.hssf.formula.function.Today;
import lib.zj.office.fc.hssf.formula.function.Value;
import lib.zj.office.fc.hssf.formula.function.Vlookup;
import lib.zj.office.fc.hssf.formula.function.Weekday;

/* loaded from: classes3.dex */
public final class FunctionEval {
    private static final FunctionID ID = null;
    protected static final Function[] functions = produceFunctions();

    /* loaded from: classes3.dex */
    public static final class FunctionID {
        public static final int CHOOSE = 100;
        public static final int EXTERNAL_FUNC = 255;
        public static final int IF = 1;
        public static final int INDIRECT = 148;
        public static final int OFFSET = 78;
        public static final int SUM = 4;

        private FunctionID() {
        }
    }

    public static Function getBasicFunction(int i10) {
        if (i10 != 148 && i10 != 255) {
            Function function = functions[i10];
            if (function != null) {
                return function;
            }
            throw new NotImplementedException(a.c("FuncIx=", i10));
        }
        return null;
    }

    private static Function[] produceFunctions() {
        FunctionMetadata functionByIndex;
        Function[] functionArr = new Function[368];
        functionArr[0] = new Count();
        functionArr[1] = new IfFunc();
        functionArr[2] = LogicalFunction.ISNA;
        functionArr[3] = LogicalFunction.ISERROR;
        functionArr[4] = AggregateFunction.SUM;
        functionArr[5] = AggregateFunction.AVERAGE;
        functionArr[6] = AggregateFunction.MIN;
        functionArr[7] = AggregateFunction.MAX;
        functionArr[8] = new RowFunc();
        functionArr[9] = new Column();
        functionArr[10] = new Na();
        functionArr[11] = new Npv();
        functionArr[12] = AggregateFunction.STDEV;
        functionArr[13] = NumericFunction.DOLLAR;
        functionArr[15] = NumericFunction.SIN;
        functionArr[16] = NumericFunction.COS;
        functionArr[17] = NumericFunction.TAN;
        functionArr[18] = NumericFunction.ATAN;
        functionArr[19] = NumericFunction.PI;
        functionArr[20] = NumericFunction.SQRT;
        functionArr[21] = NumericFunction.EXP;
        functionArr[22] = NumericFunction.LN;
        functionArr[23] = NumericFunction.LOG10;
        functionArr[24] = NumericFunction.ABS;
        functionArr[25] = NumericFunction.INT;
        functionArr[26] = NumericFunction.SIGN;
        functionArr[27] = NumericFunction.ROUND;
        functionArr[28] = new Lookup();
        functionArr[29] = new Index();
        functionArr[31] = TextFunction.MID;
        functionArr[32] = TextFunction.LEN;
        functionArr[33] = new Value();
        functionArr[34] = BooleanFunction.TRUE;
        functionArr[35] = BooleanFunction.FALSE;
        functionArr[36] = BooleanFunction.AND;
        functionArr[37] = BooleanFunction.OR;
        functionArr[38] = BooleanFunction.NOT;
        functionArr[39] = NumericFunction.MOD;
        functionArr[46] = AggregateFunction.VAR;
        functionArr[48] = TextFunction.TEXT;
        functionArr[56] = FinanceFunction.PV;
        functionArr[57] = FinanceFunction.FV;
        functionArr[58] = FinanceFunction.NPER;
        functionArr[59] = FinanceFunction.PMT;
        functionArr[62] = new Irr();
        functionArr[63] = NumericFunction.RAND;
        functionArr[64] = new Match();
        functionArr[65] = DateFunc.instance;
        functionArr[66] = new TimeFunc();
        functionArr[67] = CalendarFieldFunction.DAY;
        functionArr[68] = CalendarFieldFunction.MONTH;
        functionArr[69] = CalendarFieldFunction.YEAR;
        functionArr[70] = new Weekday();
        functionArr[71] = CalendarFieldFunction.HOUR;
        functionArr[72] = CalendarFieldFunction.MINUTE;
        functionArr[73] = CalendarFieldFunction.SECOND;
        functionArr[74] = new Now();
        functionArr[76] = new Rows();
        functionArr[77] = new Columns();
        Function function = TextFunction.SEARCH;
        functionArr[82] = function;
        functionArr[78] = new Offset();
        functionArr[82] = function;
        functionArr[97] = NumericFunction.ATAN2;
        functionArr[98] = NumericFunction.ASIN;
        functionArr[99] = NumericFunction.ACOS;
        functionArr[100] = new Choose();
        functionArr[101] = new Hlookup();
        functionArr[102] = new Vlookup();
        functionArr[105] = LogicalFunction.ISREF;
        functionArr[109] = NumericFunction.LOG;
        functionArr[111] = TextFunction.CHAR;
        functionArr[112] = TextFunction.LOWER;
        functionArr[113] = TextFunction.UPPER;
        functionArr[115] = TextFunction.LEFT;
        functionArr[116] = TextFunction.RIGHT;
        functionArr[117] = TextFunction.EXACT;
        functionArr[118] = TextFunction.TRIM;
        functionArr[119] = new Replace();
        functionArr[120] = new Substitute();
        functionArr[121] = TextFunction.CODE;
        functionArr[124] = TextFunction.FIND;
        functionArr[127] = LogicalFunction.ISTEXT;
        functionArr[128] = LogicalFunction.ISNUMBER;
        functionArr[129] = LogicalFunction.ISBLANK;
        functionArr[130] = new T();
        functionArr[144] = AggregateFunction.DDB;
        functionArr[148] = null;
        functionArr[162] = TextFunction.CLEAN;
        functionArr[169] = new Counta();
        functionArr[183] = AggregateFunction.PRODUCT;
        functionArr[184] = NumericFunction.FACT;
        functionArr[190] = LogicalFunction.ISNONTEXT;
        functionArr[194] = AggregateFunction.VARP;
        functionArr[197] = NumericFunction.TRUNC;
        functionArr[198] = LogicalFunction.ISLOGICAL;
        functionArr[212] = NumericFunction.ROUNDUP;
        functionArr[213] = NumericFunction.ROUNDDOWN;
        functionArr[219] = new Address();
        functionArr[220] = new Days360();
        functionArr[221] = new Today();
        functionArr[227] = AggregateFunction.MEDIAN;
        functionArr[228] = new Sumproduct();
        functionArr[229] = NumericFunction.SINH;
        functionArr[230] = NumericFunction.COSH;
        functionArr[231] = NumericFunction.TANH;
        functionArr[232] = NumericFunction.ASINH;
        functionArr[233] = NumericFunction.ACOSH;
        functionArr[234] = NumericFunction.ATANH;
        functionArr[247] = AggregateFunction.DB;
        functionArr[255] = null;
        functionArr[261] = new Errortype();
        functionArr[269] = AggregateFunction.AVEDEV;
        functionArr[276] = NumericFunction.COMBIN;
        functionArr[279] = new Even();
        functionArr[285] = NumericFunction.FLOOR;
        functionArr[288] = NumericFunction.CEILING;
        functionArr[298] = new Odd();
        functionArr[300] = NumericFunction.POISSON;
        functionArr[303] = new Sumxmy2();
        functionArr[304] = new Sumx2my2();
        functionArr[305] = new Sumx2py2();
        functionArr[318] = AggregateFunction.DEVSQ;
        functionArr[321] = AggregateFunction.SUMSQ;
        functionArr[325] = AggregateFunction.LARGE;
        functionArr[326] = AggregateFunction.SMALL;
        functionArr[330] = new Mode();
        functionArr[336] = TextFunction.CONCATENATE;
        functionArr[337] = NumericFunction.POWER;
        functionArr[342] = NumericFunction.RADIANS;
        functionArr[343] = NumericFunction.DEGREES;
        functionArr[344] = new Subtotal();
        functionArr[345] = new Sumif();
        functionArr[346] = new Countif();
        functionArr[347] = new Countblank();
        functionArr[359] = new Hyperlink();
        functionArr[361] = new Averagea();
        functionArr[362] = MinaMaxa.MAXA;
        functionArr[363] = MinaMaxa.MINA;
        for (int i10 = 0; i10 < 368; i10++) {
            if (functionArr[i10] == null && (functionByIndex = FunctionMetadataRegistry.getFunctionByIndex(i10)) != null) {
                functionArr[i10] = new NotImplementedFunction(functionByIndex.getName());
            }
        }
        return functionArr;
    }
}
