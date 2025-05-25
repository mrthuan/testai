package lib.zj.office.fc.hssf.formula;

import androidx.appcompat.view.menu.d;
import b.a;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import di.e;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.MissingArgEval;
import lib.zj.office.fc.hssf.formula.eval.NameEval;
import lib.zj.office.fc.hssf.formula.eval.NotImplementedException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.Choose;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;
import lib.zj.office.fc.hssf.formula.function.IfFunc;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaErrPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.AttrPtg;
import lib.zj.office.fc.hssf.formula.ptg.BoolPtg;
import lib.zj.office.fc.hssf.formula.ptg.ControlPtg;
import lib.zj.office.fc.hssf.formula.ptg.DeletedArea3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.DeletedRef3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.ErrPtg;
import lib.zj.office.fc.hssf.formula.ptg.ExpPtg;
import lib.zj.office.fc.hssf.formula.ptg.FuncVarPtg;
import lib.zj.office.fc.hssf.formula.ptg.IntPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemAreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemErrPtg;
import lib.zj.office.fc.hssf.formula.ptg.MemFuncPtg;
import lib.zj.office.fc.hssf.formula.ptg.MissingArgPtg;
import lib.zj.office.fc.hssf.formula.ptg.NamePtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.hssf.formula.ptg.NumberPtg;
import lib.zj.office.fc.hssf.formula.ptg.OperationPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.Ref3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.RefErrorPtg;
import lib.zj.office.fc.hssf.formula.ptg.RefPtg;
import lib.zj.office.fc.hssf.formula.ptg.StringPtg;
import lib.zj.office.fc.hssf.formula.ptg.UnionPtg;
import lib.zj.office.fc.hssf.formula.ptg.UnknownPtg;
import lib.zj.office.fc.hssf.formula.udf.AggregatingUDFFinder;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;
import lib.zj.office.fc.hssf.record.BoolErrRecord;
import lib.zj.office.fc.hssf.record.LabelSSTRecord;
import lib.zj.office.fc.hssf.record.NumberRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFEvaluationWorkbook;
import lib.zj.office.fc.hssf.usermodel.HSSFRichTextString;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.ss.util.CellReference;

/* loaded from: classes3.dex */
public final class WorkbookEvaluator {
    private EvaluationCache _cache;
    private CollaboratingWorkbooksEnvironment _collaboratingWorkbookEnvironment;
    private final IEvaluationListener _evaluationListener;
    private final Map<String, Integer> _sheetIndexesByName;
    private final Map<EvaluationSheet, Integer> _sheetIndexesBySheet;
    private final IStabilityClassifier _stabilityClassifier;
    private final AggregatingUDFFinder _udfFinder;
    private final EvaluationWorkbook _workbook;
    private int _workbookIx;
    private EvaluationTracker tracker;

    public WorkbookEvaluator(EvaluationWorkbook evaluationWorkbook, IStabilityClassifier iStabilityClassifier, UDFFinder uDFFinder) {
        this(evaluationWorkbook, null, iStabilityClassifier, uDFFinder);
    }

    private NotImplementedException addExceptionInfo(NotImplementedException notImplementedException, int i10, int i11, int i12) {
        try {
            CellReference cellReference = new CellReference(this._workbook.getSheetName(i10), i11, i12, false, false);
            return new NotImplementedException("Error evaluating cell " + cellReference.formatAsString(), notImplementedException);
        } catch (Exception e10) {
            e10.printStackTrace();
            return notImplementedException;
        }
    }

    private static int countTokensToBeSkipped(Ptg[] ptgArr, int i10, int i11) {
        int i12 = i10;
        while (i11 != 0) {
            i12++;
            i11 -= ptgArr[i12].getSize();
            if (i11 >= 0) {
                if (i12 >= ptgArr.length) {
                    throw new RuntimeException("Skip distance too far (ran out of formula tokens).");
                }
            } else {
                throw new RuntimeException("Bad skip distance (wrong token size calculation).");
            }
        }
        return i12 - i10;
    }

    public static ValueEval dereferenceResult(ValueEval valueEval, int i10, int i11) {
        try {
            ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, i11);
            if (singleValue == BlankEval.instance) {
                return NumberEval.ZERO;
            }
            return singleValue;
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    private ValueEval evaluateAny(EvaluationCell evaluationCell, int i10, int i11, int i12, EvaluationTracker evaluationTracker) {
        boolean z10;
        ValueEval valueEval;
        IStabilityClassifier iStabilityClassifier = this._stabilityClassifier;
        if (iStabilityClassifier == null || !iStabilityClassifier.isCellFinal(i10, i11, i12)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (evaluationCell != null && evaluationCell.getCellType() == 2) {
            FormulaCellCacheEntry orCreateFormulaCellEntry = this._cache.getOrCreateFormulaCellEntry(evaluationCell);
            if (z10 || orCreateFormulaCellEntry.isInputSensitive()) {
                evaluationTracker.acceptFormulaDependency(orCreateFormulaCellEntry);
            }
            IEvaluationListener iEvaluationListener = this._evaluationListener;
            if (orCreateFormulaCellEntry.getValue() == null) {
                if (!evaluationTracker.startEvaluate(orCreateFormulaCellEntry)) {
                    return ErrorEval.CIRCULAR_REF_ERROR;
                }
                OperationEvaluationContext operationEvaluationContext = new OperationEvaluationContext(this, this._workbook, i10, i11, i12, evaluationTracker);
                HSSFRichTextString hSSFRichTextString = null;
                try {
                    try {
                        try {
                            Ptg[] formulaTokens = this._workbook.getFormulaTokens(evaluationCell);
                            if (iEvaluationListener == null) {
                                valueEval = evaluateFormula(operationEvaluationContext, formulaTokens);
                                if (valueEval == null) {
                                    evaluationTracker.endEvaluate(orCreateFormulaCellEntry);
                                    return null;
                                }
                            } else {
                                iEvaluationListener.onStartEvaluate(evaluationCell, orCreateFormulaCellEntry);
                                ValueEval evaluateFormula = evaluateFormula(operationEvaluationContext, formulaTokens);
                                iEvaluationListener.onEndEvaluate(orCreateFormulaCellEntry, evaluateFormula);
                                valueEval = evaluateFormula;
                            }
                            evaluationTracker.updateCacheResult(valueEval);
                            evaluationTracker.endEvaluate(orCreateFormulaCellEntry);
                            if (isDebugLogEnabled()) {
                                String sheetName = getSheetName(i10);
                                CellReference cellReference = new CellReference(i11, i12);
                                StringBuilder g10 = a.g("Evaluated ", sheetName, "!");
                                g10.append(cellReference.formatAsString());
                                g10.append(" to ");
                                g10.append(valueEval.toString());
                                logDebug(g10.toString());
                            }
                            di.a aVar = (di.a) evaluationCell.getIdentityKey();
                            if (valueEval instanceof NumberEval) {
                                aVar.q(0);
                                double numberValue = ((NumberEval) valueEval).getNumberValue();
                                short s4 = aVar.f16589b;
                                if (s4 != 0) {
                                    if (s4 == 1) {
                                        aVar.f16592f = Integer.valueOf(Math.round((float) numberValue));
                                    }
                                } else {
                                    ((NumberRecord) aVar.f16202i).setValue(numberValue);
                                    aVar.f16592f = Double.valueOf(numberValue);
                                }
                            } else if (valueEval instanceof BoolEval) {
                                aVar.q(4);
                                boolean booleanValue = ((BoolEval) valueEval).getBooleanValue();
                                if (aVar.f16589b == 4) {
                                    ((BoolErrRecord) aVar.f16202i).setValue(booleanValue);
                                    aVar.f16592f = Boolean.valueOf(booleanValue);
                                }
                            } else if (valueEval instanceof StringEval) {
                                aVar.q(1);
                                String stringValue = ((StringEval) valueEval).getStringValue();
                                if (stringValue != null) {
                                    hSSFRichTextString = new HSSFRichTextString(stringValue);
                                }
                                int row = aVar.f16202i.getRow();
                                short column = aVar.f16202i.getColumn();
                                short xFIndex = aVar.f16202i.getXFIndex();
                                if (hSSFRichTextString == null) {
                                    aVar.r(3, row, column, xFIndex);
                                } else if (hSSFRichTextString.length() <= SpreadsheetVersion.EXCEL97.getMaxTextLength()) {
                                    int addSSTString = ((e) aVar.f16588a.f16601a).f16209m.addSSTString(hSSFRichTextString.getUnicodeString());
                                    ((LabelSSTRecord) aVar.f16202i).setSSTIndex(addSSTString);
                                    aVar.f16592f = Integer.valueOf(addSSTString);
                                } else {
                                    throw new IllegalArgumentException("The maximum length of cell contents (text) is 32,767 characters");
                                }
                            } else if (valueEval instanceof ErrorEval) {
                                aVar.q(5);
                                byte errorCode = (byte) ((ErrorEval) valueEval).getErrorCode();
                                if (aVar.f16589b == 5) {
                                    ((BoolErrRecord) aVar.f16202i).setValue(errorCode);
                                    aVar.f16592f = Byte.valueOf(errorCode);
                                }
                            }
                            return valueEval;
                        } catch (Exception unused) {
                            di.a aVar2 = (di.a) evaluationCell.getIdentityKey();
                            aVar2.q(5);
                            byte errorCode2 = (byte) ErrorEval.NA.getErrorCode();
                            if (aVar2.f16589b == 5) {
                                ((BoolErrRecord) aVar2.f16202i).setValue(errorCode2);
                                aVar2.f16592f = Byte.valueOf(errorCode2);
                            }
                            evaluationTracker.endEvaluate(orCreateFormulaCellEntry);
                            return null;
                        }
                    } catch (NotImplementedException e10) {
                        throw addExceptionInfo(e10, i10, i11, i12);
                    }
                } catch (Throwable th2) {
                    evaluationTracker.endEvaluate(orCreateFormulaCellEntry);
                    throw th2;
                }
            }
            if (iEvaluationListener != null) {
                iEvaluationListener.onCacheHit(i10, i11, i12, orCreateFormulaCellEntry.getValue());
            }
            return orCreateFormulaCellEntry.getValue();
        }
        ValueEval valueFromNonFormulaCell = getValueFromNonFormulaCell(evaluationCell);
        if (z10) {
            evaluationTracker.acceptPlainValueDependency(this._workbookIx, i10, i11, i12, valueFromNonFormulaCell);
        }
        return valueFromNonFormulaCell;
    }

    private ValueEval getEvalForPtg(Ptg ptg, OperationEvaluationContext operationEvaluationContext) {
        if (ptg instanceof NamePtg) {
            EvaluationName name = this._workbook.getName((NamePtg) ptg);
            if (name.isFunctionName()) {
                return new NameEval(name.getNameText());
            }
            if (name.hasFormula()) {
                return evaluateNameFormula(name.getNameDefinition(), operationEvaluationContext);
            }
            throw new RuntimeException("Don't now how to evalate name '" + name.getNameText() + OperatorName.SHOW_TEXT_LINE);
        } else if (ptg instanceof NameXPtg) {
            EvaluationName name2 = ((HSSFEvaluationWorkbook) this._workbook).getName((NameXPtg) ptg);
            if (name2.isFunctionName()) {
                return new NameEval(name2.getNameText());
            }
            if (name2.hasFormula()) {
                return evaluateNameFormula(name2.getNameDefinition(), operationEvaluationContext);
            }
            throw new RuntimeException("Don't now how to evalate name '" + name2.getNameText() + OperatorName.SHOW_TEXT_LINE);
        } else if (ptg instanceof IntPtg) {
            return new NumberEval(((IntPtg) ptg).getValue());
        } else {
            if (ptg instanceof NumberPtg) {
                return new NumberEval(((NumberPtg) ptg).getValue());
            }
            if (ptg instanceof StringPtg) {
                return new StringEval(((StringPtg) ptg).getValue());
            }
            if (ptg instanceof BoolPtg) {
                return BoolEval.valueOf(((BoolPtg) ptg).getValue());
            }
            if (ptg instanceof ErrPtg) {
                return ErrorEval.valueOf(((ErrPtg) ptg).getErrorCode());
            }
            if (ptg instanceof MissingArgPtg) {
                return MissingArgEval.instance;
            }
            if (!(ptg instanceof AreaErrPtg) && !(ptg instanceof RefErrorPtg) && !(ptg instanceof DeletedArea3DPtg) && !(ptg instanceof DeletedRef3DPtg)) {
                if (ptg instanceof Ref3DPtg) {
                    Ref3DPtg ref3DPtg = (Ref3DPtg) ptg;
                    return operationEvaluationContext.getRef3DEval(ref3DPtg.getRow(), ref3DPtg.getColumn(), ref3DPtg.getExternSheetIndex());
                } else if (ptg instanceof Area3DPtg) {
                    Area3DPtg area3DPtg = (Area3DPtg) ptg;
                    return operationEvaluationContext.getArea3DEval(area3DPtg.getFirstRow(), area3DPtg.getFirstColumn(), area3DPtg.getLastRow(), area3DPtg.getLastColumn(), area3DPtg.getExternSheetIndex());
                } else if (ptg instanceof RefPtg) {
                    RefPtg refPtg = (RefPtg) ptg;
                    return operationEvaluationContext.getRefEval(refPtg.getRow(), refPtg.getColumn());
                } else if (ptg instanceof AreaPtg) {
                    AreaPtg areaPtg = (AreaPtg) ptg;
                    return operationEvaluationContext.getAreaEval(areaPtg.getFirstRow(), areaPtg.getFirstColumn(), areaPtg.getLastRow(), areaPtg.getLastColumn());
                } else if (!(ptg instanceof UnknownPtg)) {
                    if (ptg instanceof ExpPtg) {
                        throw new RuntimeException("ExpPtg currently not supported");
                    }
                    throw new RuntimeException("Unexpected ptg class (" + ptg.getClass().getName() + ")");
                } else {
                    throw new RuntimeException("UnknownPtg not allowed");
                }
            }
            return ErrorEval.REF_INVALID;
        }
    }

    private int getSheetIndex(EvaluationSheet evaluationSheet) {
        Integer num = this._sheetIndexesBySheet.get(evaluationSheet);
        if (num == null) {
            int sheetIndex = this._workbook.getSheetIndex(evaluationSheet);
            if (sheetIndex >= 0) {
                num = Integer.valueOf(sheetIndex);
                this._sheetIndexesBySheet.put(evaluationSheet, num);
            } else {
                throw new RuntimeException("Specified sheet from a different book");
            }
        }
        return num.intValue();
    }

    public static ValueEval getValueFromNonFormulaCell(EvaluationCell evaluationCell) {
        if (evaluationCell == null) {
            return BlankEval.instance;
        }
        int cellType = evaluationCell.getCellType();
        if (cellType != 0) {
            if (cellType != 1) {
                if (cellType != 3) {
                    if (cellType != 4) {
                        if (cellType == 5) {
                            return ErrorEval.valueOf(evaluationCell.getErrorCellValue());
                        }
                        throw new RuntimeException(a0.a.g("Unexpected cell type (", cellType, ")"));
                    }
                    return BoolEval.valueOf(evaluationCell.getBooleanCellValue());
                }
                return BlankEval.instance;
            }
            return new StringEval(evaluationCell.getStringCellValue());
        }
        return new NumberEval(evaluationCell.getNumericCellValue());
    }

    private static boolean isDebugLogEnabled() {
        return false;
    }

    private static void logDebug(String str) {
        if (isDebugLogEnabled()) {
            System.out.println(str);
        }
    }

    public void attachToEnvironment(CollaboratingWorkbooksEnvironment collaboratingWorkbooksEnvironment, EvaluationCache evaluationCache, int i10) {
        this._collaboratingWorkbookEnvironment = collaboratingWorkbooksEnvironment;
        this._cache = evaluationCache;
        this._workbookIx = i10;
    }

    public void clearAllCachedResultValues() {
        this._cache.clear();
        this._sheetIndexesBySheet.clear();
    }

    public void detachFromEnvironment() {
        this._collaboratingWorkbookEnvironment = CollaboratingWorkbooksEnvironment.EMPTY;
        this._cache = new EvaluationCache(this._evaluationListener);
        this._workbookIx = 0;
    }

    public ValueEval evaluate(EvaluationCell evaluationCell) {
        int sheetIndex = getSheetIndex(evaluationCell.getSheet());
        if (this.tracker == null) {
            this.tracker = new EvaluationTracker(this._cache);
        }
        return evaluateAny(evaluationCell, sheetIndex, evaluationCell.getRowIndex(), evaluationCell.getColumnIndex(), this.tracker);
    }

    public ValueEval evaluateFormula(OperationEvaluationContext operationEvaluationContext, Ptg[] ptgArr) {
        ValueEval evalForPtg;
        int countTokensToBeSkipped;
        int chooseFuncOffset;
        int i10;
        int evaluateFirstArg;
        ArrayList arrayList = new ArrayList();
        int length = ptgArr.length;
        int i11 = 0;
        while (i11 < length) {
            Ptg ptg = ptgArr[i11];
            if (ptg instanceof AttrPtg) {
                AttrPtg attrPtg = (AttrPtg) ptg;
                if (attrPtg.isSum()) {
                    ptg = FuncVarPtg.SUM;
                }
                if (attrPtg.isOptimizedChoose()) {
                    ValueEval valueEval = (ValueEval) arrayList.remove(arrayList.size() - 1);
                    int[] jumpTable = attrPtg.getJumpTable();
                    int length2 = jumpTable.length;
                    try {
                        evaluateFirstArg = Choose.evaluateFirstArg(valueEval, operationEvaluationContext.getRowIndex(), operationEvaluationContext.getColumnIndex());
                    } catch (EvaluationException e10) {
                        arrayList.add(e10.getErrorEval());
                        chooseFuncOffset = attrPtg.getChooseFuncOffset();
                    }
                    if (evaluateFirstArg >= 1 && evaluateFirstArg <= length2) {
                        i10 = jumpTable[evaluateFirstArg - 1];
                        countTokensToBeSkipped = countTokensToBeSkipped(ptgArr, i11, i10 - ((length2 * 2) + 2));
                    }
                    arrayList.add(ErrorEval.VALUE_INVALID);
                    chooseFuncOffset = attrPtg.getChooseFuncOffset();
                    i10 = chooseFuncOffset + 4;
                    countTokensToBeSkipped = countTokensToBeSkipped(ptgArr, i11, i10 - ((length2 * 2) + 2));
                } else {
                    if (attrPtg.isOptimizedIf()) {
                        try {
                            if (!IfFunc.evaluateFirstArg((ValueEval) arrayList.remove(arrayList.size() - 1), operationEvaluationContext.getRowIndex(), operationEvaluationContext.getColumnIndex())) {
                                i11 += countTokensToBeSkipped(ptgArr, i11, attrPtg.getData());
                                int i12 = i11 + 1;
                                Ptg ptg2 = ptgArr[i12];
                                if ((ptgArr[i11] instanceof AttrPtg) && (ptg2 instanceof FuncVarPtg)) {
                                    arrayList.add(BoolEval.FALSE);
                                    i11 = i12;
                                }
                            }
                        } catch (EvaluationException e11) {
                            arrayList.add(e11.getErrorEval());
                            i11 += countTokensToBeSkipped(ptgArr, i11, attrPtg.getData());
                            countTokensToBeSkipped = countTokensToBeSkipped(ptgArr, i11, ((AttrPtg) ptgArr[i11]).getData() + 1);
                        }
                    } else if (attrPtg.isSkip()) {
                        i11 += countTokensToBeSkipped(ptgArr, i11, attrPtg.getData() + 1);
                        if (d.b(arrayList, 1) == MissingArgEval.instance) {
                            arrayList.remove(arrayList.size() - 1);
                            arrayList.add(BlankEval.instance);
                        }
                    }
                    i11++;
                }
                i11 += countTokensToBeSkipped;
                i11++;
            }
            if (!(ptg instanceof ControlPtg) && !(ptg instanceof MemFuncPtg) && !(ptg instanceof MemAreaPtg) && !(ptg instanceof MemErrPtg)) {
                if (ptg instanceof OperationPtg) {
                    OperationPtg operationPtg = (OperationPtg) ptg;
                    if (operationPtg instanceof UnionPtg) {
                        continue;
                    } else {
                        int numberOfOperands = operationPtg.getNumberOfOperands();
                        ValueEval[] valueEvalArr = new ValueEval[numberOfOperands];
                        for (int i13 = numberOfOperands - 1; i13 >= 0; i13--) {
                            valueEvalArr[i13] = (ValueEval) arrayList.remove(arrayList.size() - 1);
                        }
                        evalForPtg = OperationEvaluatorFactory.evaluate(operationPtg, valueEvalArr, operationEvaluationContext);
                    }
                } else {
                    evalForPtg = getEvalForPtg(ptg, operationEvaluationContext);
                }
                if (evalForPtg == null) {
                    return null;
                }
                arrayList.add(evalForPtg);
            }
            i11++;
        }
        ValueEval valueEval2 = (ValueEval) arrayList.remove(arrayList.size() - 1);
        if (arrayList.isEmpty()) {
            if (!(valueEval2 instanceof AreaEval) && !(valueEval2 instanceof RefEval)) {
                return dereferenceResult(valueEval2, operationEvaluationContext.getRowIndex(), operationEvaluationContext.getColumnIndex());
            }
            return valueEval2;
        }
        throw new IllegalStateException("evaluation stack not empty");
    }

    public ValueEval evaluateNameFormula(Ptg[] ptgArr, OperationEvaluationContext operationEvaluationContext) {
        if (ptgArr.length == 1) {
            return getEvalForPtg(ptgArr[0], operationEvaluationContext);
        }
        return evaluateFormula(operationEvaluationContext, ptgArr);
    }

    public ValueEval evaluateReference(EvaluationSheet evaluationSheet, int i10, int i11, int i12, EvaluationTracker evaluationTracker) {
        return evaluateAny(evaluationSheet.getCell(i11, i12), i10, i11, i12, evaluationTracker);
    }

    public FreeRefFunction findUserDefinedFunction(String str) {
        return this._udfFinder.findFunction(str);
    }

    public CollaboratingWorkbooksEnvironment getEnvironment() {
        return this._collaboratingWorkbookEnvironment;
    }

    public IEvaluationListener getEvaluationListener() {
        return this._evaluationListener;
    }

    public EvaluationName getName(String str, int i10) {
        NamePtg createPtg = this._workbook.getName(str, i10).createPtg();
        if (createPtg == null) {
            return null;
        }
        return this._workbook.getName(createPtg);
    }

    public WorkbookEvaluator getOtherWorkbookEvaluator(String str) {
        return this._collaboratingWorkbookEnvironment.getWorkbookEvaluator(str);
    }

    public EvaluationSheet getSheet(int i10) {
        for (EvaluationSheet evaluationSheet : this._sheetIndexesBySheet.keySet()) {
            if (this._sheetIndexesBySheet.get(evaluationSheet).intValue() == i10) {
                return evaluationSheet;
            }
        }
        EvaluationSheet sheet = this._workbook.getSheet(i10);
        this._sheetIndexesBySheet.put(sheet, Integer.valueOf(i10));
        return sheet;
    }

    public int getSheetIndexByExternIndex(int i10) {
        return this._workbook.convertFromExternSheetIndex(i10);
    }

    public String getSheetName(int i10) {
        return this._workbook.getSheetName(i10);
    }

    public EvaluationWorkbook getWorkbook() {
        return this._workbook;
    }

    public void notifyDeleteCell(EvaluationCell evaluationCell) {
        this._cache.notifyDeleteCell(this._workbookIx, getSheetIndex(evaluationCell.getSheet()), evaluationCell);
    }

    public void notifyUpdateCell(EvaluationCell evaluationCell) {
        this._cache.notifyUpdateCell(this._workbookIx, getSheetIndex(evaluationCell.getSheet()), evaluationCell);
    }

    public WorkbookEvaluator(EvaluationWorkbook evaluationWorkbook, IEvaluationListener iEvaluationListener, IStabilityClassifier iStabilityClassifier, UDFFinder uDFFinder) {
        this._workbook = evaluationWorkbook;
        this._evaluationListener = iEvaluationListener;
        this._cache = new EvaluationCache(iEvaluationListener);
        this._sheetIndexesBySheet = new IdentityHashMap();
        this._sheetIndexesByName = new IdentityHashMap();
        this._collaboratingWorkbookEnvironment = CollaboratingWorkbooksEnvironment.EMPTY;
        this._workbookIx = 0;
        this._stabilityClassifier = iStabilityClassifier;
        AggregatingUDFFinder aggregatingUDFFinder = evaluationWorkbook == null ? null : (AggregatingUDFFinder) evaluationWorkbook.getUDFFinder();
        if (aggregatingUDFFinder != null && uDFFinder != null) {
            aggregatingUDFFinder.add(uDFFinder);
        }
        this._udfFinder = aggregatingUDFFinder;
    }

    public int getSheetIndex(String str) {
        Integer num = this._sheetIndexesByName.get(str);
        if (num == null) {
            int sheetIndex = this._workbook.getSheetIndex(str);
            if (sheetIndex < 0) {
                return -1;
            }
            num = Integer.valueOf(sheetIndex);
            this._sheetIndexesByName.put(str, num);
        }
        return num.intValue();
    }
}
