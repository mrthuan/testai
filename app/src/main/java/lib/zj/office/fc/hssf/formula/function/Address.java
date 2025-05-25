package lib.zj.office.fc.hssf.formula.function;

/* loaded from: classes3.dex */
public class Address implements Function {
    public static final int REF_ABSOLUTE = 1;
    public static final int REF_RELATIVE = 4;
    public static final int REF_ROW_ABSOLUTE_COLUMN_RELATIVE = 2;
    public static final int REF_ROW_RELATIVE_RELATIVE_ABSOLUTE = 3;

    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[Catch: EvaluationException -> 0x0094, TryCatch #0 {EvaluationException -> 0x0094, blocks: (B:8:0x000b, B:10:0x001d, B:24:0x0042, B:26:0x0045, B:29:0x0050, B:30:0x0057, B:32:0x005b, B:35:0x0066, B:36:0x006b, B:38:0x007b, B:39:0x0083, B:18:0x0032, B:19:0x0039), top: B:46:0x000b }] */
    @Override // lib.zj.office.fc.hssf.formula.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lib.zj.office.fc.hssf.formula.eval.ValueEval evaluate(lib.zj.office.fc.hssf.formula.eval.ValueEval[] r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r11.length
            r1 = 2
            if (r0 < r1) goto L9a
            int r0 = r11.length
            r2 = 5
            if (r0 <= r2) goto La
            goto L9a
        La:
            r0 = 0
            r3 = r11[r0]     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            double r3 = lib.zj.office.fc.hssf.formula.function.NumericFunction.singleOperandEvaluate(r3, r12, r13)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            int r3 = (int) r3     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            r4 = 1
            r5 = r11[r4]     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            double r5 = lib.zj.office.fc.hssf.formula.function.NumericFunction.singleOperandEvaluate(r5, r12, r13)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            int r5 = (int) r5     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            int r6 = r11.length     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            if (r6 <= r1) goto L25
            r6 = r11[r1]     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            double r6 = lib.zj.office.fc.hssf.formula.function.NumericFunction.singleOperandEvaluate(r6, r12, r13)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            int r6 = (int) r6     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            goto L26
        L25:
            r6 = r4
        L26:
            r7 = 4
            r8 = 3
            if (r6 == r4) goto L40
            if (r6 == r1) goto L3d
            if (r6 == r8) goto L3a
            if (r6 != r7) goto L32
            r1 = r0
            goto L41
        L32:
            lib.zj.office.fc.hssf.formula.eval.EvaluationException r11 = new lib.zj.office.fc.hssf.formula.eval.EvaluationException     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            lib.zj.office.fc.hssf.formula.eval.ErrorEval r12 = lib.zj.office.fc.hssf.formula.eval.ErrorEval.VALUE_INVALID     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            r11.<init>(r12)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            throw r11     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
        L3a:
            r1 = r0
            r6 = r4
            goto L42
        L3d:
            r6 = r0
            r1 = r4
            goto L42
        L40:
            r1 = r4
        L41:
            r6 = r1
        L42:
            int r9 = r11.length     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            if (r9 <= r8) goto L57
            r8 = r11[r8]     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            lib.zj.office.fc.hssf.formula.eval.ValueEval r8 = lib.zj.office.fc.hssf.formula.eval.OperandResolver.getSingleValue(r8, r12, r13)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            lib.zj.office.fc.hssf.formula.eval.MissingArgEval r9 = lib.zj.office.fc.hssf.formula.eval.MissingArgEval.instance     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            if (r8 != r9) goto L50
            goto L57
        L50:
            java.lang.Boolean r0 = lib.zj.office.fc.hssf.formula.eval.OperandResolver.coerceValueToBoolean(r8, r0)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            r0.booleanValue()     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
        L57:
            int r0 = r11.length     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            r8 = 0
            if (r0 != r2) goto L6b
            r11 = r11[r7]     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            lib.zj.office.fc.hssf.formula.eval.ValueEval r11 = lib.zj.office.fc.hssf.formula.eval.OperandResolver.getSingleValue(r11, r12, r13)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            lib.zj.office.fc.hssf.formula.eval.MissingArgEval r12 = lib.zj.office.fc.hssf.formula.eval.MissingArgEval.instance     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            if (r11 != r12) goto L66
            goto L6b
        L66:
            java.lang.String r11 = lib.zj.office.fc.hssf.formula.eval.OperandResolver.coerceValueToString(r11)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            r8 = r11
        L6b:
            lib.zj.office.fc.ss.util.CellReference r11 = new lib.zj.office.fc.ss.util.CellReference     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            int r3 = r3 - r4
            int r5 = r5 - r4
            r11.<init>(r3, r5, r1, r6)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            r13 = 32
            r12.<init>(r13)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            if (r8 == 0) goto L83
            lib.zj.office.fc.hssf.formula.SheetNameFormatter.appendFormat(r12, r8)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            r13 = 33
            r12.append(r13)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
        L83:
            java.lang.String r11 = r11.formatAsString()     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            r12.append(r11)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            lib.zj.office.fc.hssf.formula.eval.StringEval r11 = new lib.zj.office.fc.hssf.formula.eval.StringEval     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            java.lang.String r12 = r12.toString()     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            r11.<init>(r12)     // Catch: lib.zj.office.fc.hssf.formula.eval.EvaluationException -> L94
            return r11
        L94:
            r11 = move-exception
            lib.zj.office.fc.hssf.formula.eval.ErrorEval r11 = r11.getErrorEval()
            return r11
        L9a:
            lib.zj.office.fc.hssf.formula.eval.ErrorEval r11 = lib.zj.office.fc.hssf.formula.eval.ErrorEval.VALUE_INVALID
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.formula.function.Address.evaluate(lib.zj.office.fc.hssf.formula.eval.ValueEval[], int, int):lib.zj.office.fc.hssf.formula.eval.ValueEval");
    }
}
