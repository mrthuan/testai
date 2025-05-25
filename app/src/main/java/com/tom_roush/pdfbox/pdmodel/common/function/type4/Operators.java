package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ArithmeticOperators;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.BitwiseOperators;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.ConditionalOperators;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.StackOperators;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Operators {
    private final Map<String, Operator> operators;
    private static final Operator ABS = new ArithmeticOperators.Abs();
    private static final Operator ADD = new ArithmeticOperators.Add();
    private static final Operator ATAN = new ArithmeticOperators.Atan();
    private static final Operator CEILING = new ArithmeticOperators.Ceiling();
    private static final Operator COS = new ArithmeticOperators.Cos();
    private static final Operator CVI = new ArithmeticOperators.Cvi();
    private static final Operator CVR = new ArithmeticOperators.Cvr();
    private static final Operator DIV = new ArithmeticOperators.Div();
    private static final Operator EXP = new ArithmeticOperators.Exp();
    private static final Operator FLOOR = new ArithmeticOperators.Floor();
    private static final Operator IDIV = new ArithmeticOperators.IDiv();
    private static final Operator LN = new ArithmeticOperators.Ln();
    private static final Operator LOG = new ArithmeticOperators.Log();
    private static final Operator MOD = new ArithmeticOperators.Mod();
    private static final Operator MUL = new ArithmeticOperators.Mul();
    private static final Operator NEG = new ArithmeticOperators.Neg();
    private static final Operator ROUND = new ArithmeticOperators.Round();
    private static final Operator SIN = new ArithmeticOperators.Sin();
    private static final Operator SQRT = new ArithmeticOperators.Sqrt();
    private static final Operator SUB = new ArithmeticOperators.Sub();
    private static final Operator TRUNCATE = new ArithmeticOperators.Truncate();
    private static final Operator AND = new BitwiseOperators.And();
    private static final Operator BITSHIFT = new BitwiseOperators.Bitshift();
    private static final Operator EQ = new RelationalOperators.Eq();
    private static final Operator FALSE = new BitwiseOperators.False();
    private static final Operator GE = new RelationalOperators.Ge();
    private static final Operator GT = new RelationalOperators.Gt();
    private static final Operator LE = new RelationalOperators.Le();
    private static final Operator LT = new RelationalOperators.Lt();
    private static final Operator NE = new RelationalOperators.Ne();
    private static final Operator NOT = new BitwiseOperators.Not();
    private static final Operator OR = new BitwiseOperators.Or();
    private static final Operator TRUE = new BitwiseOperators.True();
    private static final Operator XOR = new BitwiseOperators.Xor();
    private static final Operator IF = new ConditionalOperators.If();
    private static final Operator IFELSE = new ConditionalOperators.IfElse();
    private static final Operator COPY = new StackOperators.Copy();
    private static final Operator DUP = new StackOperators.Dup();
    private static final Operator EXCH = new StackOperators.Exch();
    private static final Operator INDEX = new StackOperators.Index();
    private static final Operator POP = new StackOperators.Pop();
    private static final Operator ROLL = new StackOperators.Roll();

    public Operators() {
        HashMap hashMap = new HashMap();
        this.operators = hashMap;
        hashMap.put("add", ADD);
        hashMap.put("abs", ABS);
        hashMap.put("atan", ATAN);
        hashMap.put("ceiling", CEILING);
        hashMap.put("cos", COS);
        hashMap.put("cvi", CVI);
        hashMap.put("cvr", CVR);
        hashMap.put("div", DIV);
        hashMap.put("exp", EXP);
        hashMap.put("floor", FLOOR);
        hashMap.put("idiv", IDIV);
        hashMap.put("ln", LN);
        hashMap.put("log", LOG);
        hashMap.put("mod", MOD);
        hashMap.put("mul", MUL);
        hashMap.put("neg", NEG);
        hashMap.put("round", ROUND);
        hashMap.put("sin", SIN);
        hashMap.put("sqrt", SQRT);
        hashMap.put("sub", SUB);
        hashMap.put("truncate", TRUNCATE);
        hashMap.put("and", AND);
        hashMap.put("bitshift", BITSHIFT);
        hashMap.put("eq", EQ);
        hashMap.put("false", FALSE);
        hashMap.put("ge", GE);
        hashMap.put("gt", GT);
        hashMap.put("le", LE);
        hashMap.put("lt", LT);
        hashMap.put("ne", NE);
        hashMap.put("not", NOT);
        hashMap.put("or", OR);
        hashMap.put("true", TRUE);
        hashMap.put("xor", XOR);
        hashMap.put("if", IF);
        hashMap.put("ifelse", IFELSE);
        hashMap.put("copy", COPY);
        hashMap.put("dup", DUP);
        hashMap.put("exch", EXCH);
        hashMap.put("index", INDEX);
        hashMap.put("pop", POP);
        hashMap.put("roll", ROLL);
    }

    public Operator getOperator(String str) {
        return this.operators.get(str);
    }
}
