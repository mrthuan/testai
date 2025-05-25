package lib.zj.office.fc.hssf.formula;

import a6.h;
import lib.zj.office.fc.hssf.formula.CollaboratingWorkbooksEnvironment;
import lib.zj.office.fc.hssf.formula.EvaluationWorkbook;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.NameXEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.Ref3DPtg;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.ss.util.CellReference;

/* loaded from: classes3.dex */
public final class OperationEvaluationContext {
    public static final FreeRefFunction UDF = UserDefinedFunction.instance;
    private final WorkbookEvaluator _bookEvaluator;
    private final int _columnIndex;
    private final int _rowIndex;
    private final int _sheetIndex;
    private SheetRefEvaluator _sre;
    private final EvaluationTracker _tracker;
    private final EvaluationWorkbook _workbook;

    /* renamed from: lib.zj.office.fc.hssf.formula.OperationEvaluationContext$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$lib$zj$office$fc$ss$util$CellReference$NameType;

        static {
            int[] iArr = new int[CellReference.NameType.values().length];
            $SwitchMap$lib$zj$office$fc$ss$util$CellReference$NameType = iArr;
            try {
                iArr[CellReference.NameType.BAD_CELL_OR_NAMED_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$ss$util$CellReference$NameType[CellReference.NameType.NAMED_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$ss$util$CellReference$NameType[CellReference.NameType.COLUMN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$ss$util$CellReference$NameType[CellReference.NameType.ROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$ss$util$CellReference$NameType[CellReference.NameType.CELL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public OperationEvaluationContext(WorkbookEvaluator workbookEvaluator, EvaluationWorkbook evaluationWorkbook, int i10, int i11, int i12, EvaluationTracker evaluationTracker) {
        this._bookEvaluator = workbookEvaluator;
        this._workbook = evaluationWorkbook;
        this._sheetIndex = i10;
        this._rowIndex = i11;
        this._columnIndex = i12;
        this._tracker = evaluationTracker;
        this._sre = new SheetRefEvaluator(workbookEvaluator, evaluationTracker, i10);
    }

    private static CellReference.NameType classifyCellReference(String str, SpreadsheetVersion spreadsheetVersion) {
        if (str.length() < 1) {
            return CellReference.NameType.BAD_CELL_OR_NAMED_RANGE;
        }
        return CellReference.classifyCellReference(str, spreadsheetVersion);
    }

    private static int parseColRef(String str) {
        return Integer.parseInt(str) - 1;
    }

    private static int parseRowRef(String str) {
        return CellReference.convertColStringToIndex(str);
    }

    public SheetRefEvaluator createExternSheetRefEvaluator(ExternSheetReferenceToken externSheetReferenceToken) {
        return createExternSheetRefEvaluator(externSheetReferenceToken.getExternSheetIndex());
    }

    public FreeRefFunction findUserDefinedFunction(String str) {
        return this._bookEvaluator.findUserDefinedFunction(str);
    }

    public ValueEval getArea3DEval(int i10, int i11, int i12, int i13, int i14) {
        return new LazyAreaEval(i10, i11, i12, i13, createExternSheetRefEvaluator(i14));
    }

    public ValueEval getAreaEval(int i10, int i11, int i12, int i13) {
        return new LazyAreaEval(i10, i11, i12, i13, getRefEvaluatorForCurrentSheet());
    }

    public int getColumnIndex() {
        return this._columnIndex;
    }

    public ValueEval getDynamicReference(String str, String str2, String str3, String str4, boolean z10) {
        int lastRowIndex;
        short parseColRef;
        short parseColRef2;
        int i10;
        if (z10) {
            SheetRefEvaluator createExternSheetRefEvaluator = createExternSheetRefEvaluator(str, str2);
            if (createExternSheetRefEvaluator == null) {
                return ErrorEval.REF_INVALID;
            }
            SpreadsheetVersion spreadsheetVersion = ((FormulaParsingWorkbook) this._workbook).getSpreadsheetVersion();
            CellReference.NameType classifyCellReference = classifyCellReference(str3, spreadsheetVersion);
            int[] iArr = AnonymousClass1.$SwitchMap$lib$zj$office$fc$ss$util$CellReference$NameType;
            int i11 = iArr[classifyCellReference.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (str4 == null) {
                        int i12 = iArr[classifyCellReference.ordinal()];
                        if (i12 != 3 && i12 != 4) {
                            if (i12 == 5) {
                                CellReference cellReference = new CellReference(str3);
                                return new LazyRefEval(cellReference.getRow(), cellReference.getCol(), createExternSheetRefEvaluator);
                            }
                            throw new IllegalStateException(h.d("Unexpected reference classification of '", str3, "'."));
                        }
                        return ErrorEval.REF_INVALID;
                    }
                    CellReference.NameType classifyCellReference2 = classifyCellReference(str3, spreadsheetVersion);
                    int i13 = iArr[classifyCellReference2.ordinal()];
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (classifyCellReference2 != classifyCellReference) {
                                return ErrorEval.REF_INVALID;
                            }
                            int i14 = iArr[classifyCellReference.ordinal()];
                            if (i14 != 3) {
                                if (i14 != 4) {
                                    if (i14 == 5) {
                                        CellReference cellReference2 = new CellReference(str3);
                                        int row = cellReference2.getRow();
                                        short col = cellReference2.getCol();
                                        CellReference cellReference3 = new CellReference(str4);
                                        int row2 = cellReference3.getRow();
                                        parseColRef = col;
                                        i10 = row;
                                        parseColRef2 = cellReference3.getCol();
                                        lastRowIndex = row2;
                                    } else {
                                        throw new IllegalStateException(h.d("Unexpected reference classification of '", str3, "'."));
                                    }
                                } else {
                                    parseColRef2 = spreadsheetVersion.getLastColumnIndex();
                                    i10 = parseRowRef(str3);
                                    lastRowIndex = parseRowRef(str4);
                                    parseColRef = 0;
                                }
                            } else {
                                lastRowIndex = spreadsheetVersion.getLastRowIndex();
                                parseColRef = parseColRef(str3);
                                parseColRef2 = parseColRef(str4);
                                i10 = 0;
                            }
                            return new LazyAreaEval(i10, parseColRef, lastRowIndex, parseColRef2, createExternSheetRefEvaluator);
                        }
                        throw new RuntimeException(h.d("Cannot evaluate '", str3, "'. Indirect evaluation of defined names not supported yet"));
                    }
                    return ErrorEval.REF_INVALID;
                }
                EvaluationName name = ((FormulaParsingWorkbook) this._workbook).getName(str3, this._sheetIndex);
                if (name.isRange()) {
                    return this._bookEvaluator.evaluateNameFormula(name.getNameDefinition(), this);
                }
                throw new RuntimeException(h.d("Specified name '", str3, "' is not a range as expected."));
            }
            return ErrorEval.REF_INVALID;
        }
        throw new RuntimeException("R1C1 style not supported yet");
    }

    public ValueEval getNameXEval(NameXPtg nameXPtg) {
        EvaluationWorkbook.ExternalSheet externalSheet = this._workbook.getExternalSheet(nameXPtg.getSheetRefIndex());
        if (externalSheet == null) {
            return new NameXEval(nameXPtg);
        }
        String workbookName = externalSheet.getWorkbookName();
        EvaluationWorkbook.ExternalName externalName = this._workbook.getExternalName(nameXPtg.getSheetRefIndex(), nameXPtg.getNameIndex());
        try {
            WorkbookEvaluator otherWorkbookEvaluator = this._bookEvaluator.getOtherWorkbookEvaluator(workbookName);
            EvaluationName name = otherWorkbookEvaluator.getName(externalName.getName(), externalName.getIx() - 1);
            if (name != null && name.hasFormula()) {
                if (name.getNameDefinition().length <= 1) {
                    Ptg ptg = name.getNameDefinition()[0];
                    if (ptg instanceof Ref3DPtg) {
                        Ref3DPtg ref3DPtg = (Ref3DPtg) ptg;
                        return new LazyRefEval(ref3DPtg.getRow(), ref3DPtg.getColumn(), createExternSheetRefEvaluator(workbookName, otherWorkbookEvaluator.getSheetName(otherWorkbookEvaluator.getSheetIndexByExternIndex(ref3DPtg.getExternSheetIndex()))));
                    } else if (ptg instanceof Area3DPtg) {
                        Area3DPtg area3DPtg = (Area3DPtg) ptg;
                        return new LazyAreaEval(area3DPtg.getFirstRow(), area3DPtg.getFirstColumn(), area3DPtg.getLastRow(), area3DPtg.getLastColumn(), createExternSheetRefEvaluator(workbookName, otherWorkbookEvaluator.getSheetName(otherWorkbookEvaluator.getSheetIndexByExternIndex(area3DPtg.getExternSheetIndex()))));
                    }
                } else {
                    throw new RuntimeException("Complex name formulas not supported yet");
                }
            }
            return ErrorEval.REF_INVALID;
        } catch (CollaboratingWorkbooksEnvironment.WorkbookNotFoundException unused) {
            return ErrorEval.REF_INVALID;
        }
    }

    public ValueEval getRef3DEval(int i10, int i11, int i12) {
        return new LazyRefEval(i10, i11, createExternSheetRefEvaluator(i12));
    }

    public ValueEval getRefEval(int i10, int i11) {
        return new LazyRefEval(i10, i11, getRefEvaluatorForCurrentSheet());
    }

    public SheetRefEvaluator getRefEvaluatorForCurrentSheet() {
        if (this._sre == null) {
            this._sre = new SheetRefEvaluator(this._bookEvaluator, this._tracker, this._sheetIndex);
        }
        return this._sre;
    }

    public int getRowIndex() {
        return this._rowIndex;
    }

    public EvaluationWorkbook getWorkbook() {
        return this._workbook;
    }

    public SheetRefEvaluator createExternSheetRefEvaluator(int i10) {
        WorkbookEvaluator workbookEvaluator;
        int i11;
        EvaluationWorkbook.ExternalSheet externalSheet = this._workbook.getExternalSheet(i10);
        if (externalSheet == null) {
            i11 = this._workbook.convertFromExternSheetIndex(i10);
            workbookEvaluator = this._bookEvaluator;
        } else {
            String workbookName = externalSheet.getWorkbookName();
            try {
                WorkbookEvaluator otherWorkbookEvaluator = this._bookEvaluator.getOtherWorkbookEvaluator(workbookName);
                int sheetIndex = otherWorkbookEvaluator.getSheetIndex(externalSheet.getSheetName());
                if (sheetIndex < 0) {
                    throw new RuntimeException("Invalid sheet name '" + externalSheet.getSheetName() + "' in bool '" + workbookName + "'.");
                }
                workbookEvaluator = otherWorkbookEvaluator;
                i11 = sheetIndex;
            } catch (CollaboratingWorkbooksEnvironment.WorkbookNotFoundException e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }
        return new SheetRefEvaluator(workbookEvaluator, this._tracker, i11);
    }

    private SheetRefEvaluator createExternSheetRefEvaluator(String str, String str2) {
        WorkbookEvaluator otherWorkbookEvaluator;
        if (str == null) {
            otherWorkbookEvaluator = this._bookEvaluator;
        } else if (str2 != null) {
            try {
                otherWorkbookEvaluator = this._bookEvaluator.getOtherWorkbookEvaluator(str);
            } catch (CollaboratingWorkbooksEnvironment.WorkbookNotFoundException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("sheetName must not be null if workbookName is provided");
        }
        int sheetIndex = str2 == null ? this._sheetIndex : otherWorkbookEvaluator.getSheetIndex(str2);
        if (sheetIndex < 0) {
            return null;
        }
        return new SheetRefEvaluator(otherWorkbookEvaluator, this._tracker, sheetIndex);
    }
}
