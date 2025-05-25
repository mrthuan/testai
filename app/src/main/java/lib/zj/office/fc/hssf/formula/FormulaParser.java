package lib.zj.office.fc.hssf.formula;

import a0.d;
import a6.h;
import androidx.activity.f;
import androidx.activity.r;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.regex.Pattern;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.function.FunctionMetadata;
import lib.zj.office.fc.hssf.formula.function.FunctionMetadataRegistry;
import lib.zj.office.fc.hssf.formula.ptg.AbstractFunctionPtg;
import lib.zj.office.fc.hssf.formula.ptg.AddPtg;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.ArrayPtg;
import lib.zj.office.fc.hssf.formula.ptg.AttrPtg;
import lib.zj.office.fc.hssf.formula.ptg.BoolPtg;
import lib.zj.office.fc.hssf.formula.ptg.ConcatPtg;
import lib.zj.office.fc.hssf.formula.ptg.DividePtg;
import lib.zj.office.fc.hssf.formula.ptg.EqualPtg;
import lib.zj.office.fc.hssf.formula.ptg.ErrPtg;
import lib.zj.office.fc.hssf.formula.ptg.FuncPtg;
import lib.zj.office.fc.hssf.formula.ptg.FuncVarPtg;
import lib.zj.office.fc.hssf.formula.ptg.GreaterEqualPtg;
import lib.zj.office.fc.hssf.formula.ptg.GreaterThanPtg;
import lib.zj.office.fc.hssf.formula.ptg.IntPtg;
import lib.zj.office.fc.hssf.formula.ptg.LessEqualPtg;
import lib.zj.office.fc.hssf.formula.ptg.LessThanPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemAreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemFuncPtg;
import lib.zj.office.fc.hssf.formula.ptg.MultiplyPtg;
import lib.zj.office.fc.hssf.formula.ptg.NamePtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.hssf.formula.ptg.NotEqualPtg;
import lib.zj.office.fc.hssf.formula.ptg.NumberPtg;
import lib.zj.office.fc.hssf.formula.ptg.OperandPtg;
import lib.zj.office.fc.hssf.formula.ptg.OperationPtg;
import lib.zj.office.fc.hssf.formula.ptg.ParenthesisPtg;
import lib.zj.office.fc.hssf.formula.ptg.PercentPtg;
import lib.zj.office.fc.hssf.formula.ptg.PowerPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.RangePtg;
import lib.zj.office.fc.hssf.formula.ptg.Ref3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.RefPtg;
import lib.zj.office.fc.hssf.formula.ptg.StringPtg;
import lib.zj.office.fc.hssf.formula.ptg.SubtractPtg;
import lib.zj.office.fc.hssf.formula.ptg.UnaryMinusPtg;
import lib.zj.office.fc.hssf.formula.ptg.UnaryPlusPtg;
import lib.zj.office.fc.hssf.formula.ptg.UnionPtg;
import lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.ss.util.AreaReference;
import lib.zj.office.fc.ss.util.CellReference;
import nh.a;

/* loaded from: classes3.dex */
public final class FormulaParser {
    private static final Pattern CELL_REF_PATTERN = Pattern.compile("(\\$?[A-Za-z]+)?(\\$?[0-9]+)?");
    private static char TAB = '\t';
    private FormulaParsingWorkbook _book;
    private final int _formulaLength;
    private final String _formulaString;
    private int _pointer = 0;
    private ParseNode _rootNode;
    private int _sheetIndex;
    private SpreadsheetVersion _ssVersion;
    private char look;

    /* loaded from: classes3.dex */
    public static final class Identifier {
        private final boolean _isQuoted;
        private final String _name;

        public Identifier(String str, boolean z10) {
            this._name = str;
            this._isQuoted = z10;
        }

        public String getName() {
            return this._name;
        }

        public boolean isQuoted() {
            return this._isQuoted;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            d.h(Identifier.class, stringBuffer, " [");
            if (this._isQuoted) {
                stringBuffer.append(OperatorName.SHOW_TEXT_LINE);
                stringBuffer.append(this._name);
                stringBuffer.append(OperatorName.SHOW_TEXT_LINE);
            } else {
                stringBuffer.append(this._name);
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class SheetIdentifier {
        private final String _bookName;
        private final Identifier _sheetIdentifier;

        public SheetIdentifier(String str, Identifier identifier) {
            this._bookName = str;
            this._sheetIdentifier = identifier;
        }

        public String getBookName() {
            return this._bookName;
        }

        public Identifier getSheetIdentifier() {
            return this._sheetIdentifier;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            d.h(SheetIdentifier.class, stringBuffer, " [");
            if (this._bookName != null) {
                stringBuffer.append(" [");
                stringBuffer.append(this._sheetIdentifier.getName());
                stringBuffer.append("]");
            }
            if (this._sheetIdentifier.isQuoted()) {
                stringBuffer.append(OperatorName.SHOW_TEXT_LINE);
                stringBuffer.append(this._sheetIdentifier.getName());
                stringBuffer.append(OperatorName.SHOW_TEXT_LINE);
            } else {
                stringBuffer.append(this._sheetIdentifier.getName());
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class SimpleRangePart {
        private final String _rep;
        private final Type _type;

        /* loaded from: classes3.dex */
        public enum Type {
            CELL,
            ROW,
            COLUMN;

            public static Type get(boolean z10, boolean z11) {
                if (z10) {
                    if (z11) {
                        return CELL;
                    }
                    return COLUMN;
                } else if (z11) {
                    return ROW;
                } else {
                    throw new IllegalArgumentException("must have either letters or numbers");
                }
            }
        }

        public SimpleRangePart(String str, boolean z10, boolean z11) {
            this._rep = str;
            this._type = Type.get(z10, z11);
        }

        public CellReference getCellReference() {
            if (this._type == Type.CELL) {
                return new CellReference(this._rep);
            }
            throw new IllegalStateException("Not applicable to this type");
        }

        public String getRep() {
            return this._rep;
        }

        public boolean isCell() {
            if (this._type == Type.CELL) {
                return true;
            }
            return false;
        }

        public boolean isColumn() {
            if (this._type == Type.COLUMN) {
                return true;
            }
            return false;
        }

        public boolean isCompatibleForArea(SimpleRangePart simpleRangePart) {
            if (this._type == simpleRangePart._type) {
                return true;
            }
            return false;
        }

        public boolean isRow() {
            if (this._type == Type.ROW) {
                return true;
            }
            return false;
        }

        public boolean isRowOrColumn() {
            if (this._type != Type.CELL) {
                return true;
            }
            return false;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(SimpleRangePart.class.getName());
            sb2.append(" [");
            return r.g(sb2, this._rep, "]");
        }
    }

    private FormulaParser(String str, FormulaParsingWorkbook formulaParsingWorkbook, int i10) {
        SpreadsheetVersion spreadsheetVersion;
        this._formulaString = str;
        this._book = formulaParsingWorkbook;
        if (formulaParsingWorkbook == null) {
            spreadsheetVersion = SpreadsheetVersion.EXCEL97;
        } else {
            spreadsheetVersion = formulaParsingWorkbook.getSpreadsheetVersion();
        }
        this._ssVersion = spreadsheetVersion;
        this._formulaLength = str.length();
        this._sheetIndex = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r3 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        r0.add(new lib.zj.office.fc.hssf.formula.ParseNode(lib.zj.office.fc.hssf.formula.ptg.MissingArgPtg.instance));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r5.look != ')') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        r1 = new lib.zj.office.fc.hssf.formula.ParseNode[r0.size()];
        r0.toArray(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private lib.zj.office.fc.hssf.formula.ParseNode[] Arguments() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r5.SkipWhite()
            char r1 = r5.look
            r2 = 41
            if (r1 != r2) goto L12
            lib.zj.office.fc.hssf.formula.ParseNode[] r0 = lib.zj.office.fc.hssf.formula.ParseNode.EMPTY_ARRAY
            return r0
        L12:
            r1 = 1
        L13:
            r3 = r1
        L14:
            r5.SkipWhite()
            char r4 = r5.look
            boolean r4 = isArgumentDelimiter(r4)
            if (r4 == 0) goto L3f
            if (r3 == 0) goto L2b
            lib.zj.office.fc.hssf.formula.ParseNode r3 = new lib.zj.office.fc.hssf.formula.ParseNode
            lib.zj.office.fc.hssf.formula.ptg.Ptg r4 = lib.zj.office.fc.hssf.formula.ptg.MissingArgPtg.instance
            r3.<init>(r4)
            r0.add(r3)
        L2b:
            char r3 = r5.look
            if (r3 != r2) goto L39
            int r1 = r0.size()
            lib.zj.office.fc.hssf.formula.ParseNode[] r1 = new lib.zj.office.fc.hssf.formula.ParseNode[r1]
            r0.toArray(r1)
            return r1
        L39:
            r3 = 44
            r5.Match(r3)
            goto L13
        L3f:
            lib.zj.office.fc.hssf.formula.ParseNode r3 = r5.comparisonExpression()
            r0.add(r3)
            r5.SkipWhite()
            char r3 = r5.look
            boolean r3 = isArgumentDelimiter(r3)
            if (r3 == 0) goto L53
            r3 = 0
            goto L14
        L53:
            java.lang.String r0 = "',' or ')'"
            java.lang.RuntimeException r0 = r5.expected(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.formula.FormulaParser.Arguments():lib.zj.office.fc.hssf.formula.ParseNode[]");
    }

    private void GetChar() {
        int i10 = this._pointer;
        int i11 = this._formulaLength;
        if (i10 <= i11) {
            if (i10 < i11) {
                this.look = this._formulaString.charAt(i10);
            } else {
                this.look = (char) 0;
            }
            this._pointer++;
            return;
        }
        throw new RuntimeException("too far");
    }

    private String GetNum() {
        StringBuffer stringBuffer = new StringBuffer();
        while (IsDigit(this.look)) {
            stringBuffer.append(this.look);
            GetChar();
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    private static boolean IsAlpha(char c) {
        if (!Character.isLetter(c) && c != '$' && c != '_') {
            return false;
        }
        return true;
    }

    private static boolean IsDigit(char c) {
        return Character.isDigit(c);
    }

    private static boolean IsWhite(char c) {
        if (c != ' ' && c != TAB) {
            return false;
        }
        return true;
    }

    private void Match(char c) {
        if (this.look == c) {
            GetChar();
            return;
        }
        throw expected(OperatorName.SHOW_TEXT_LINE + c + OperatorName.SHOW_TEXT_LINE);
    }

    private void SkipWhite() {
        while (IsWhite(this.look)) {
            GetChar();
        }
    }

    private ParseNode Term() {
        ValueOperatorPtg valueOperatorPtg;
        ParseNode powerFactor = powerFactor();
        while (true) {
            SkipWhite();
            char c = this.look;
            if (c != '*') {
                if (c != '/') {
                    return powerFactor;
                }
                Match(PackagingURIHelper.FORWARD_SLASH_CHAR);
                valueOperatorPtg = DividePtg.instance;
            } else {
                Match('*');
                valueOperatorPtg = MultiplyPtg.instance;
            }
            powerFactor = new ParseNode(valueOperatorPtg, powerFactor, powerFactor());
        }
    }

    private ParseNode additiveExpression() {
        ValueOperatorPtg valueOperatorPtg;
        ParseNode Term = Term();
        while (true) {
            SkipWhite();
            char c = this.look;
            if (c != '+') {
                if (c != '-') {
                    return Term;
                }
                Match('-');
                valueOperatorPtg = SubtractPtg.instance;
            } else {
                Match('+');
                valueOperatorPtg = AddPtg.instance;
            }
            Term = new ParseNode(valueOperatorPtg, Term, Term());
        }
    }

    private static ParseNode augmentWithMemPtg(ParseNode parseNode) {
        Ptg memAreaPtg;
        if (needsMemFunc(parseNode)) {
            memAreaPtg = new MemFuncPtg(parseNode.getEncodedSize());
        } else {
            memAreaPtg = new MemAreaPtg(parseNode.getEncodedSize());
        }
        return new ParseNode(memAreaPtg, parseNode);
    }

    private void checkRowLengths(Object[][] objArr, int i10) {
        for (int i11 = 0; i11 < objArr.length; i11++) {
            int length = objArr[i11].length;
            if (length != i10) {
                StringBuilder f10 = d.f("Array row ", i11, " has length ", length, " but row 0 has length ");
                f10.append(i10);
                throw new FormulaParseException(f10.toString());
            }
        }
    }

    private static void checkValidRangeOperand(String str, int i10, ParseNode parseNode) {
        if (isValidRangeOperand(parseNode)) {
            return;
        }
        throw new FormulaParseException("The " + str + " of the range operator ':' at position " + i10 + " is not a proper reference.");
    }

    private ParseNode comparisonExpression() {
        ParseNode concatExpression = concatExpression();
        while (true) {
            SkipWhite();
            switch (this.look) {
                case '<':
                case '=':
                case '>':
                    concatExpression = new ParseNode(getComparisonToken(), concatExpression, concatExpression());
                default:
                    return concatExpression;
            }
        }
    }

    private ParseNode concatExpression() {
        ParseNode additiveExpression = additiveExpression();
        while (true) {
            SkipWhite();
            if (this.look != '&') {
                return additiveExpression;
            }
            Match('&');
            additiveExpression = new ParseNode(ConcatPtg.instance, additiveExpression, additiveExpression());
        }
    }

    private static Double convertArrayNumber(Ptg ptg, boolean z10) {
        double value;
        if (ptg instanceof IntPtg) {
            value = ((IntPtg) ptg).getValue();
        } else if (ptg instanceof NumberPtg) {
            value = ((NumberPtg) ptg).getValue();
        } else {
            throw new RuntimeException("Unexpected ptg (" + ptg.getClass().getName() + ")");
        }
        if (!z10) {
            value = -value;
        }
        return new Double(value);
    }

    private static AreaReference createAreaRef(SimpleRangePart simpleRangePart, SimpleRangePart simpleRangePart2) {
        if (simpleRangePart.isCompatibleForArea(simpleRangePart2)) {
            if (simpleRangePart.isRow()) {
                return AreaReference.getWholeRow(simpleRangePart.getRep(), simpleRangePart2.getRep());
            }
            if (simpleRangePart.isColumn()) {
                return AreaReference.getWholeColumn(simpleRangePart.getRep(), simpleRangePart2.getRep());
            }
            return new AreaReference(simpleRangePart.getCellReference(), simpleRangePart2.getCellReference());
        }
        StringBuilder sb2 = new StringBuilder("has incompatible parts: '");
        sb2.append(simpleRangePart.getRep());
        sb2.append("' and '");
        throw new FormulaParseException(r.g(sb2, simpleRangePart2.getRep(), "'."));
    }

    private ParseNode createAreaRefParseNode(SheetIdentifier sheetIdentifier, SimpleRangePart simpleRangePart, SimpleRangePart simpleRangePart2) {
        int externalSheetIndex;
        Ptg area3DPtg;
        if (sheetIdentifier == null) {
            externalSheetIndex = SlideAtom.USES_MASTER_SLIDE_ID;
        } else {
            String name = sheetIdentifier.getSheetIdentifier().getName();
            if (sheetIdentifier.getBookName() == null) {
                externalSheetIndex = this._book.getExternalSheetIndex(name);
            } else {
                externalSheetIndex = this._book.getExternalSheetIndex(sheetIdentifier.getBookName(), name);
            }
        }
        if (simpleRangePart2 == null) {
            CellReference cellReference = simpleRangePart.getCellReference();
            if (sheetIdentifier == null) {
                area3DPtg = new RefPtg(cellReference);
            } else {
                area3DPtg = new Ref3DPtg(cellReference, externalSheetIndex);
            }
        } else {
            AreaReference createAreaRef = createAreaRef(simpleRangePart, simpleRangePart2);
            if (sheetIdentifier == null) {
                area3DPtg = new AreaPtg(createAreaRef);
            } else {
                area3DPtg = new Area3DPtg(createAreaRef, externalSheetIndex);
            }
        }
        return new ParseNode(area3DPtg);
    }

    private RuntimeException expected(String str) {
        String o10;
        if (this.look == '=' && this._formulaString.substring(0, this._pointer - 1).trim().length() < 1) {
            o10 = r.g(new StringBuilder("The specified formula '"), this._formulaString, "' starts with an equals sign which is not allowed.");
        } else {
            StringBuilder sb2 = new StringBuilder("Parse error near char ");
            sb2.append(this._pointer - 1);
            sb2.append(" '");
            sb2.append(this.look);
            sb2.append("' in specified formula '");
            o10 = f.o(sb2, this._formulaString, "'. Expected ", str);
        }
        return new FormulaParseException(o10);
    }

    private ParseNode function(String str) {
        Ptg ptg;
        if (!AbstractFunctionPtg.isBuiltInFunctionName(str)) {
            FormulaParsingWorkbook formulaParsingWorkbook = this._book;
            if (formulaParsingWorkbook != null) {
                EvaluationName name = formulaParsingWorkbook.getName(str, this._sheetIndex);
                if (name == null) {
                    ptg = this._book.getNameXPtg(str);
                    if (ptg == null) {
                        throw new FormulaParseException(h.d("Name '", str, "' is completely unknown in the current workbook"));
                    }
                } else if (name.isFunctionName()) {
                    ptg = name.createPtg();
                } else {
                    throw new FormulaParseException(h.d("Attempt to use name '", str, "' as a function, but defined name in workbook does not refer to a function"));
                }
            } else {
                throw new IllegalStateException(h.d("Need book to evaluate name '", str, OperatorName.SHOW_TEXT_LINE));
            }
        } else {
            ptg = null;
        }
        Match('(');
        ParseNode[] Arguments = Arguments();
        Match(')');
        return getFunction(str, ptg, Arguments);
    }

    private Ptg getComparisonToken() {
        boolean z10;
        char c = this.look;
        if (c == '=') {
            Match(c);
            return EqualPtg.instance;
        }
        if (c == '>') {
            z10 = true;
        } else {
            z10 = false;
        }
        Match(c);
        if (z10) {
            if (this.look == '=') {
                Match('=');
                return GreaterEqualPtg.instance;
            }
            return GreaterThanPtg.instance;
        }
        char c10 = this.look;
        if (c10 != '=') {
            if (c10 != '>') {
                return LessThanPtg.instance;
            }
            Match('>');
            return NotEqualPtg.instance;
        }
        Match('=');
        return LessEqualPtg.instance;
    }

    private ParseNode getFunction(String str, Ptg ptg, ParseNode[] parseNodeArr) {
        Ptg create;
        FunctionMetadata functionByName = FunctionMetadataRegistry.getFunctionByName(str.toUpperCase());
        int length = parseNodeArr.length;
        if (functionByName == null) {
            if (ptg != null) {
                int i10 = length + 1;
                ParseNode[] parseNodeArr2 = new ParseNode[i10];
                parseNodeArr2[0] = new ParseNode(ptg);
                System.arraycopy(parseNodeArr, 0, parseNodeArr2, 1, length);
                return new ParseNode(FuncVarPtg.create(str, i10), parseNodeArr2);
            }
            throw new IllegalStateException("NamePtg must be supplied for external functions");
        } else if (ptg == null) {
            boolean z10 = !functionByName.hasFixedArgsLength();
            int index = functionByName.getIndex();
            if (index == 4 && parseNodeArr.length == 1) {
                return new ParseNode(AttrPtg.getSumSingle(), parseNodeArr);
            }
            validateNumArgs(parseNodeArr.length, functionByName);
            if (z10) {
                create = FuncVarPtg.create(str, length);
            } else {
                create = FuncPtg.create(index);
            }
            return new ParseNode(create, parseNodeArr);
        } else {
            throw new IllegalStateException("NamePtg no applicable to internal functions");
        }
    }

    private static Ptg getNumberPtgFromString(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str2 == null) {
            stringBuffer.append(str);
            if (str3 != null) {
                stringBuffer.append('E');
                stringBuffer.append(str3);
            }
            String stringBuffer2 = stringBuffer.toString();
            try {
                int parseInt = Integer.parseInt(stringBuffer2);
                if (IntPtg.isInRange(parseInt)) {
                    return new IntPtg(parseInt);
                }
                return new NumberPtg(stringBuffer2);
            } catch (NumberFormatException unused) {
                return new NumberPtg(stringBuffer2);
            }
        }
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append('.');
        stringBuffer.append(str2);
        if (str3 != null) {
            stringBuffer.append('E');
            stringBuffer.append(str3);
        }
        return new NumberPtg(stringBuffer.toString());
    }

    private Ptg[] getRPNPtg(int i10) {
        new OperandClassTransformer(i10).transformFormula(this._rootNode);
        return ParseNode.toTokenArray(this._rootNode);
    }

    private static boolean isArgumentDelimiter(char c) {
        if (c != ',' && c != ')') {
            return false;
        }
        return true;
    }

    private static boolean isUnquotedSheetNameChar(char c) {
        if (Character.isLetterOrDigit(c) || c == '.' || c == '_') {
            return true;
        }
        return false;
    }

    private boolean isValidCellReference(String str) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (CellReference.classifyCellReference(str, this._ssVersion) == CellReference.NameType.CELL) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (FunctionMetadataRegistry.getFunctionByName(str.toUpperCase()) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i10 = this._pointer;
                resetPointer(str.length() + i10);
                SkipWhite();
                if (this.look == '(') {
                    z12 = false;
                }
                resetPointer(i10);
                return z12;
            }
            return z10;
        }
        return z10;
    }

    private static boolean isValidDefinedNameChar(char c) {
        if (Character.isLetterOrDigit(c) || c == '.' || c == '?' || c == '\\' || c == '_') {
            return true;
        }
        return false;
    }

    private static boolean isValidRangeOperand(ParseNode parseNode) {
        Ptg token = parseNode.getToken();
        if (token instanceof OperandPtg) {
            return true;
        }
        if (token instanceof AbstractFunctionPtg) {
            if (((AbstractFunctionPtg) token).getDefaultOperandClass() == 0) {
                return true;
            }
            return false;
        } else if (token instanceof ValueOperatorPtg) {
            return false;
        } else {
            if (token instanceof OperationPtg) {
                return true;
            }
            if (token instanceof ParenthesisPtg) {
                return isValidRangeOperand(parseNode.getChildren()[0]);
            }
            if (token == ErrPtg.REF_INVALID) {
                return true;
            }
            return false;
        }
    }

    private static boolean needsMemFunc(ParseNode parseNode) {
        Ptg token = parseNode.getToken();
        if ((token instanceof AbstractFunctionPtg) || (token instanceof ExternSheetReferenceToken) || (token instanceof NamePtg) || (token instanceof NameXPtg)) {
            return true;
        }
        boolean z10 = token instanceof OperationPtg;
        if (!z10 && !(token instanceof ParenthesisPtg)) {
            if (!(token instanceof OperandPtg) && z10) {
                return true;
            }
            return false;
        }
        for (ParseNode parseNode2 : parseNode.getChildren()) {
            if (needsMemFunc(parseNode2)) {
                return true;
            }
        }
        return false;
    }

    public static Ptg[] parse(String str, FormulaParsingWorkbook formulaParsingWorkbook, int i10, int i11) {
        FormulaParser formulaParser = new FormulaParser(str, formulaParsingWorkbook, i11);
        formulaParser.parse();
        return formulaParser.getRPNPtg(i10);
    }

    private ParseNode parseArray() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(parseArrayRow());
            char c = this.look;
            if (c == '}') {
                Object[][] objArr = new Object[arrayList.size()];
                arrayList.toArray(objArr);
                checkRowLengths(objArr, objArr[0].length);
                return new ParseNode(new ArrayPtg(objArr));
            } else if (c == ';') {
                Match(';');
            } else {
                throw expected("'}' or ';'");
            }
        }
    }

    private Object parseArrayItem() {
        SkipWhite();
        char c = this.look;
        if (c != '\"') {
            if (c != '#') {
                if (c != '-') {
                    if (c != 'F' && c != 'T' && c != 'f' && c != 't') {
                        return convertArrayNumber(parseNumber(), true);
                    }
                    return parseBooleanLiteral();
                }
                Match('-');
                SkipWhite();
                return convertArrayNumber(parseNumber(), false);
            }
            return a.b(parseErrorLiteral());
        }
        return parseStringLiteral();
    }

    private Object[] parseArrayRow() {
        char c;
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(parseArrayItem());
            SkipWhite();
            c = this.look;
            if (c != ',') {
                break;
            }
            Match(',');
        }
        if (c != ';' && c != '}') {
            throw expected("'}' or ','");
        }
        Object[] objArr = new Object[arrayList.size()];
        arrayList.toArray(objArr);
        return objArr;
    }

    private Boolean parseBooleanLiteral() {
        String parseUnquotedIdentifier = parseUnquotedIdentifier();
        if ("TRUE".equalsIgnoreCase(parseUnquotedIdentifier)) {
            return Boolean.TRUE;
        }
        if ("FALSE".equalsIgnoreCase(parseUnquotedIdentifier)) {
            return Boolean.FALSE;
        }
        throw expected("'TRUE' or 'FALSE'");
    }

    private int parseErrorLiteral() {
        Match('#');
        String upperCase = parseUnquotedIdentifier().toUpperCase();
        if (upperCase != null) {
            char charAt = upperCase.charAt(0);
            if (charAt != 'D') {
                if (charAt != 'N') {
                    if (charAt != 'R') {
                        if (charAt == 'V') {
                            if (upperCase.equals("VALUE")) {
                                Match('!');
                                return 15;
                            }
                            throw expected("#VALUE!");
                        }
                        throw expected("#VALUE!, #REF!, #DIV/0!, #NAME?, #NUM!, #NULL! or #N/A");
                    } else if (upperCase.equals("REF")) {
                        Match('!');
                        return 23;
                    } else {
                        throw expected("#REF!");
                    }
                } else if (upperCase.equals("NAME")) {
                    Match('?');
                    return 29;
                } else if (upperCase.equals("NUM")) {
                    Match('!');
                    return 36;
                } else if (upperCase.equals("NULL")) {
                    Match('!');
                    return 0;
                } else if (upperCase.equals("N")) {
                    Match(PackagingURIHelper.FORWARD_SLASH_CHAR);
                    char c = this.look;
                    if (c != 'A' && c != 'a') {
                        throw expected("#N/A");
                    }
                    Match(c);
                    return 42;
                } else {
                    throw expected("#NAME?, #NUM!, #NULL! or #N/A");
                }
            } else if (upperCase.equals("DIV")) {
                Match(PackagingURIHelper.FORWARD_SLASH_CHAR);
                Match('0');
                Match('!');
                return 7;
            } else {
                throw expected("#DIV/0!");
            }
        }
        throw expected("remainder of error constant literal");
    }

    private ParseNode parseNonRange(int i10) {
        resetPointer(i10);
        if (Character.isDigit(this.look)) {
            return new ParseNode(parseNumber());
        }
        if (this.look == '\"') {
            return new ParseNode(new StringPtg(parseStringLiteral()));
        }
        StringBuilder sb2 = new StringBuilder();
        if (!Character.isLetter(this.look) && this.look != '_') {
            throw expected("number, string, or defined name");
        }
        while (isValidDefinedNameChar(this.look)) {
            sb2.append(this.look);
            GetChar();
        }
        SkipWhite();
        String sb3 = sb2.toString();
        if (this.look == '(') {
            return function(sb3);
        }
        if (!sb3.equalsIgnoreCase("TRUE") && !sb3.equalsIgnoreCase("FALSE")) {
            FormulaParsingWorkbook formulaParsingWorkbook = this._book;
            if (formulaParsingWorkbook != null) {
                EvaluationName name = formulaParsingWorkbook.getName(sb3, this._sheetIndex);
                if (name != null) {
                    if (name.isRange()) {
                        return new ParseNode(name.createPtg());
                    }
                    throw new FormulaParseException(h.d("Specified name '", sb3, "' is not a range as expected."));
                }
                throw new FormulaParseException(h.d("Specified named range '", sb3, "' does not exist in the current workbook."));
            }
            throw new IllegalStateException(h.d("Need book to evaluate name '", sb3, OperatorName.SHOW_TEXT_LINE));
        }
        return new ParseNode(BoolPtg.valueOf(sb3.equalsIgnoreCase("TRUE")));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private lib.zj.office.fc.hssf.formula.ptg.Ptg parseNumber() {
        /*
            r6 = this;
            java.lang.String r0 = r6.GetNum()
            char r1 = r6.look
            r2 = 46
            r3 = 0
            if (r1 != r2) goto L13
            r6.GetChar()
            java.lang.String r1 = r6.GetNum()
            goto L14
        L13:
            r1 = r3
        L14:
            char r2 = r6.look
            r4 = 69
            java.lang.String r5 = "Integer"
            if (r2 != r4) goto L45
            r6.GetChar()
            char r2 = r6.look
            r3 = 43
            if (r2 != r3) goto L29
            r6.GetChar()
            goto L33
        L29:
            r3 = 45
            if (r2 != r3) goto L33
            r6.GetChar()
            java.lang.String r2 = "-"
            goto L35
        L33:
            java.lang.String r2 = ""
        L35:
            java.lang.String r3 = r6.GetNum()
            if (r3 == 0) goto L40
            java.lang.String r3 = r2.concat(r3)
            goto L45
        L40:
            java.lang.RuntimeException r0 = r6.expected(r5)
            throw r0
        L45:
            if (r0 != 0) goto L4f
            if (r1 == 0) goto L4a
            goto L4f
        L4a:
            java.lang.RuntimeException r0 = r6.expected(r5)
            throw r0
        L4f:
            lib.zj.office.fc.hssf.formula.ptg.Ptg r0 = getNumberPtgFromString(r0, r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.formula.FormulaParser.parseNumber():lib.zj.office.fc.hssf.formula.ptg.Ptg");
    }

    private ParseNode parseRangeExpression() {
        ParseNode parseRangeable = parseRangeable();
        boolean z10 = false;
        while (this.look == ':') {
            int i10 = this._pointer;
            GetChar();
            ParseNode parseRangeable2 = parseRangeable();
            checkValidRangeOperand("LHS", i10, parseRangeable);
            checkValidRangeOperand("RHS", i10, parseRangeable2);
            z10 = true;
            parseRangeable = new ParseNode(RangePtg.instance, new ParseNode[]{parseRangeable, parseRangeable2});
        }
        if (z10) {
            return augmentWithMemPtg(parseRangeable);
        }
        return parseRangeable;
    }

    private ParseNode parseRangeable() {
        char c;
        String f10;
        SkipWhite();
        int i10 = this._pointer;
        SheetIdentifier parseSheetName = parseSheetName();
        if (parseSheetName == null) {
            resetPointer(i10);
        } else {
            SkipWhite();
            i10 = this._pointer;
        }
        SimpleRangePart parseSimpleRangePart = parseSimpleRangePart();
        if (parseSimpleRangePart == null) {
            if (parseSheetName != null) {
                if (this.look == '#') {
                    return new ParseNode(ErrPtg.valueOf(parseErrorLiteral()));
                }
                throw new FormulaParseException(h.g(new StringBuilder("Cell reference expected after sheet name at index "), this._pointer, "."));
            }
            return parseNonRange(i10);
        }
        boolean IsWhite = IsWhite(this.look);
        if (IsWhite) {
            SkipWhite();
        }
        char c10 = this.look;
        SimpleRangePart simpleRangePart = null;
        if (c10 == ':') {
            int i11 = this._pointer;
            GetChar();
            SkipWhite();
            SimpleRangePart parseSimpleRangePart2 = parseSimpleRangePart();
            if (parseSimpleRangePart2 == null || parseSimpleRangePart.isCompatibleForArea(parseSimpleRangePart2)) {
                simpleRangePart = parseSimpleRangePart2;
            }
            if (simpleRangePart == null) {
                resetPointer(i11);
                if (!parseSimpleRangePart.isCell()) {
                    if (parseSheetName == null) {
                        f10 = "";
                    } else {
                        f10 = r.f(new StringBuilder(OperatorName.SHOW_TEXT_LINE), parseSheetName.getSheetIdentifier().getName(), '!');
                    }
                    throw new FormulaParseException(r.g(a0.a.k(f10), parseSimpleRangePart.getRep(), "' is not a proper reference."));
                }
                return createAreaRefParseNode(parseSheetName, parseSimpleRangePart, simpleRangePart);
            }
            return createAreaRefParseNode(parseSheetName, parseSimpleRangePart, simpleRangePart);
        } else if (c10 == '.') {
            GetChar();
            int i12 = 1;
            while (true) {
                c = this.look;
                if (c != '.') {
                    break;
                }
                i12++;
                GetChar();
            }
            boolean IsWhite2 = IsWhite(c);
            SkipWhite();
            SimpleRangePart parseSimpleRangePart3 = parseSimpleRangePart();
            String substring = this._formulaString.substring(i10 - 1, this._pointer - 1);
            if (parseSimpleRangePart3 == null) {
                if (parseSheetName == null) {
                    return parseNonRange(i10);
                }
                throw new FormulaParseException(h.g(new StringBuilder("Complete area reference expected after sheet name at index "), this._pointer, "."));
            } else if (!IsWhite && !IsWhite2) {
                if (i12 == 1 && parseSimpleRangePart.isRow() && parseSimpleRangePart3.isRow()) {
                    return parseNonRange(i10);
                }
                if ((!parseSimpleRangePart.isRowOrColumn() && !parseSimpleRangePart3.isRowOrColumn()) || i12 == 2) {
                    return createAreaRefParseNode(parseSheetName, parseSimpleRangePart, parseSimpleRangePart3);
                }
                throw new FormulaParseException(h.d("Dotted range (full row or column) expression '", substring, "' must have exactly 2 dots."));
            } else if (!parseSimpleRangePart.isRowOrColumn() && !parseSimpleRangePart3.isRowOrColumn()) {
                return createAreaRefParseNode(parseSheetName, parseSimpleRangePart, parseSimpleRangePart3);
            } else {
                throw new FormulaParseException(h.d("Dotted range (full row or column) expression '", substring, "' must not contain whitespace."));
            }
        } else if (parseSimpleRangePart.isCell() && isValidCellReference(parseSimpleRangePart.getRep())) {
            return createAreaRefParseNode(parseSheetName, parseSimpleRangePart, null);
        } else {
            if (parseSheetName == null) {
                return parseNonRange(i10);
            }
            throw new FormulaParseException(h.g(new StringBuilder("Second part of cell reference expected after sheet name at index "), this._pointer, "."));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r9.look == '\'') goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        r1.append(r9.look);
        GetChar();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r9.look != '\'') goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        Match('\'');
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r9.look == '\'') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r4 = new lib.zj.office.fc.hssf.formula.FormulaParser.Identifier(r1.toString(), true);
        SkipWhite();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r9.look != '!') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        GetChar();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        return new lib.zj.office.fc.hssf.formula.FormulaParser.SheetIdentifier(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        return null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003d -> B:16:0x003e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0051 -> B:14:0x003b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private lib.zj.office.fc.hssf.formula.FormulaParser.SheetIdentifier parseSheetName() {
        /*
            r9 = this;
            char r0 = r9.look
            r1 = 91
            r2 = 0
            if (r0 != r1) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r9.GetChar()
        Lf:
            char r1 = r9.look
            r3 = 93
            if (r1 == r3) goto L1c
            r0.append(r1)
            r9.GetChar()
            goto Lf
        L1c:
            r9.GetChar()
            java.lang.String r0 = r0.toString()
            goto L25
        L24:
            r0 = r2
        L25:
            char r1 = r9.look
            r3 = 33
            r4 = 0
            r5 = 39
            if (r1 != r5) goto L6e
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r9.Match(r5)
            char r6 = r9.look
            r7 = 1
            if (r6 != r5) goto L3d
        L3b:
            r6 = r7
            goto L3e
        L3d:
            r6 = r4
        L3e:
            if (r6 != 0) goto L54
            char r8 = r9.look
            r1.append(r8)
            r9.GetChar()
            char r8 = r9.look
            if (r8 != r5) goto L3e
            r9.Match(r5)
            char r6 = r9.look
            if (r6 == r5) goto L3d
            goto L3b
        L54:
            lib.zj.office.fc.hssf.formula.FormulaParser$Identifier r4 = new lib.zj.office.fc.hssf.formula.FormulaParser$Identifier
            java.lang.String r1 = r1.toString()
            r4.<init>(r1, r7)
            r9.SkipWhite()
            char r1 = r9.look
            if (r1 != r3) goto L6d
            r9.GetChar()
            lib.zj.office.fc.hssf.formula.FormulaParser$SheetIdentifier r1 = new lib.zj.office.fc.hssf.formula.FormulaParser$SheetIdentifier
            r1.<init>(r0, r4)
            return r1
        L6d:
            return r2
        L6e:
            r5 = 95
            if (r1 == r5) goto L7a
            boolean r1 = java.lang.Character.isLetter(r1)
            if (r1 == 0) goto L79
            goto L7a
        L79:
            return r2
        L7a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L7f:
            char r5 = r9.look
            boolean r5 = isUnquotedSheetNameChar(r5)
            if (r5 == 0) goto L90
            char r5 = r9.look
            r1.append(r5)
            r9.GetChar()
            goto L7f
        L90:
            r9.SkipWhite()
            char r5 = r9.look
            if (r5 != r3) goto La8
            r9.GetChar()
            lib.zj.office.fc.hssf.formula.FormulaParser$SheetIdentifier r2 = new lib.zj.office.fc.hssf.formula.FormulaParser$SheetIdentifier
            lib.zj.office.fc.hssf.formula.FormulaParser$Identifier r3 = new lib.zj.office.fc.hssf.formula.FormulaParser$Identifier
            java.lang.String r1 = r1.toString()
            r3.<init>(r1, r4)
            r2.<init>(r0, r3)
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.formula.FormulaParser.parseSheetName():lib.zj.office.fc.hssf.formula.FormulaParser$SheetIdentifier");
    }

    private ParseNode parseSimpleFactor() {
        char c;
        SkipWhite();
        char c10 = this.look;
        if (c10 != '\"') {
            if (c10 != '#') {
                if (c10 != '(') {
                    if (c10 != '+') {
                        if (c10 != '-') {
                            if (c10 != '{') {
                                if (!IsAlpha(c10) && !Character.isDigit(this.look) && (c = this.look) != '\'' && c != '[') {
                                    if (c == '.') {
                                        return new ParseNode(parseNumber());
                                    }
                                    throw expected("cell ref or constant literal");
                                }
                                return parseRangeExpression();
                            }
                            Match('{');
                            ParseNode parseArray = parseArray();
                            Match('}');
                            return parseArray;
                        }
                        Match('-');
                        return parseUnary(false);
                    }
                    Match('+');
                    return parseUnary(true);
                }
                Match('(');
                ParseNode comparisonExpression = comparisonExpression();
                Match(')');
                return new ParseNode(ParenthesisPtg.instance, comparisonExpression);
            }
            return new ParseNode(ErrPtg.valueOf(parseErrorLiteral()));
        }
        return new ParseNode(new StringPtg(parseStringLiteral()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        if (r5 <= 65536) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private lib.zj.office.fc.hssf.formula.FormulaParser.SimpleRangePart parseSimpleRangePart() {
        /*
            r8 = this;
            int r0 = r8._pointer
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L6:
            int r4 = r8._formulaLength
            if (r0 >= r4) goto L2b
            java.lang.String r4 = r8._formulaString
            char r4 = r4.charAt(r0)
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 == 0) goto L18
            r2 = r1
            goto L28
        L18:
            boolean r5 = java.lang.Character.isLetter(r4)
            if (r5 == 0) goto L20
            r3 = r1
            goto L28
        L20:
            r5 = 36
            if (r4 == r5) goto L28
            r5 = 95
            if (r4 != r5) goto L2b
        L28:
            int r0 = r0 + 1
            goto L6
        L2b:
            int r4 = r8._pointer
            int r5 = r4 + (-1)
            r6 = 0
            if (r0 > r5) goto L33
            return r6
        L33:
            java.lang.String r5 = r8._formulaString
            int r4 = r4 - r1
            java.lang.String r4 = r5.substring(r4, r0)
            java.util.regex.Pattern r5 = lib.zj.office.fc.hssf.formula.FormulaParser.CELL_REF_PATTERN
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L47
            return r6
        L47:
            if (r3 == 0) goto L52
            if (r2 == 0) goto L52
            boolean r5 = r8.isValidCellReference(r4)
            if (r5 != 0) goto L76
            return r6
        L52:
            java.lang.String r5 = ""
            java.lang.String r7 = "$"
            if (r3 == 0) goto L65
            java.lang.String r5 = r4.replace(r7, r5)
            lib.zj.office.fc.ss.SpreadsheetVersion r7 = r8._ssVersion
            boolean r5 = lib.zj.office.fc.ss.util.CellReference.isColumnWithnRange(r5, r7)
            if (r5 != 0) goto L76
            return r6
        L65:
            if (r2 == 0) goto L80
            java.lang.String r5 = r4.replace(r7, r5)     // Catch: java.lang.NumberFormatException -> L80
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L80
            if (r5 < r1) goto L80
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r5 <= r7) goto L76
            goto L80
        L76:
            int r0 = r0 + r1
            r8.resetPointer(r0)
            lib.zj.office.fc.hssf.formula.FormulaParser$SimpleRangePart r0 = new lib.zj.office.fc.hssf.formula.FormulaParser$SimpleRangePart
            r0.<init>(r4, r3, r2)
            return r0
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.formula.FormulaParser.parseSimpleRangePart():lib.zj.office.fc.hssf.formula.FormulaParser$SimpleRangePart");
    }

    private String parseStringLiteral() {
        Match('\"');
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            if (this.look == '\"') {
                GetChar();
                if (this.look != '\"') {
                    return stringBuffer.toString();
                }
            }
            stringBuffer.append(this.look);
            GetChar();
        }
    }

    private ParseNode parseUnary(boolean z10) {
        boolean z11;
        ValueOperatorPtg valueOperatorPtg;
        if (!IsDigit(this.look) && this.look != '.') {
            z11 = false;
        } else {
            z11 = true;
        }
        ParseNode powerFactor = powerFactor();
        if (z11) {
            Ptg token = powerFactor.getToken();
            if (token instanceof NumberPtg) {
                if (z10) {
                    return powerFactor;
                }
                return new ParseNode(new NumberPtg(-((NumberPtg) token).getValue()));
            } else if (token instanceof IntPtg) {
                if (z10) {
                    return powerFactor;
                }
                return new ParseNode(new NumberPtg(-((IntPtg) token).getValue()));
            }
        }
        if (z10) {
            valueOperatorPtg = UnaryPlusPtg.instance;
        } else {
            valueOperatorPtg = UnaryMinusPtg.instance;
        }
        return new ParseNode(valueOperatorPtg, powerFactor);
    }

    private String parseUnquotedIdentifier() {
        if (this.look != '\'') {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                if (!Character.isLetterOrDigit(this.look) && this.look != '.') {
                    break;
                }
                sb2.append(this.look);
                GetChar();
            }
            if (sb2.length() < 1) {
                return null;
            }
            return sb2.toString();
        }
        throw expected("unquoted identifier");
    }

    private ParseNode percentFactor() {
        ParseNode parseSimpleFactor = parseSimpleFactor();
        while (true) {
            SkipWhite();
            if (this.look != '%') {
                return parseSimpleFactor;
            }
            Match('%');
            parseSimpleFactor = new ParseNode(PercentPtg.instance, parseSimpleFactor);
        }
    }

    private ParseNode powerFactor() {
        ParseNode percentFactor = percentFactor();
        while (true) {
            SkipWhite();
            if (this.look != '^') {
                return percentFactor;
            }
            Match('^');
            percentFactor = new ParseNode(PowerPtg.instance, percentFactor, percentFactor());
        }
    }

    private void resetPointer(int i10) {
        this._pointer = i10;
        if (i10 <= this._formulaLength) {
            this.look = this._formulaString.charAt(i10 - 1);
        } else {
            this.look = (char) 0;
        }
    }

    private ParseNode unionExpression() {
        ParseNode comparisonExpression = comparisonExpression();
        boolean z10 = false;
        while (true) {
            SkipWhite();
            if (this.look != ',') {
                break;
            }
            GetChar();
            ParseNode parseNode = new ParseNode(UnionPtg.instance, comparisonExpression, comparisonExpression());
            z10 = true;
            comparisonExpression = parseNode;
        }
        if (z10) {
            return augmentWithMemPtg(comparisonExpression);
        }
        return comparisonExpression;
    }

    private void validateNumArgs(int i10, FunctionMetadata functionMetadata) {
        int maxParams;
        String str;
        String sb2;
        if (i10 < functionMetadata.getMinParams()) {
            String str2 = "Too few arguments to function '" + functionMetadata.getName() + "'. ";
            if (functionMetadata.hasFixedArgsLength()) {
                StringBuilder g10 = d.g(str2, "Expected ");
                g10.append(functionMetadata.getMinParams());
                sb2 = g10.toString();
            } else {
                StringBuilder g11 = d.g(str2, "At least ");
                g11.append(functionMetadata.getMinParams());
                g11.append(" were expected");
                sb2 = g11.toString();
            }
            throw new FormulaParseException(sb2 + " but got " + i10 + ".");
        }
        if (functionMetadata.hasUnlimitedVarags()) {
            FormulaParsingWorkbook formulaParsingWorkbook = this._book;
            if (formulaParsingWorkbook != null) {
                maxParams = formulaParsingWorkbook.getSpreadsheetVersion().getMaxFunctionArgs();
            } else {
                maxParams = functionMetadata.getMaxParams();
            }
        } else {
            maxParams = functionMetadata.getMaxParams();
        }
        if (i10 > maxParams) {
            String str3 = "Too many arguments to function '" + functionMetadata.getName() + "'. ";
            if (functionMetadata.hasFixedArgsLength()) {
                str = str3 + "Expected " + maxParams;
            } else {
                str = str3 + "At most " + maxParams + " were expected";
            }
            throw new FormulaParseException(str + " but got " + i10 + ".");
        }
    }

    private void parse() {
        this._pointer = 0;
        GetChar();
        this._rootNode = unionExpression();
        if (this._pointer > this._formulaLength) {
            return;
        StringBuilder sb2 = new StringBuilder("Unused input [");
        sb2.append(this._formulaString.substring(this._pointer - 1));
        sb2.append("] after attempting to parse the formula [");
        throw new FormulaParseException(r.g(sb2, this._formulaString, "]"));
