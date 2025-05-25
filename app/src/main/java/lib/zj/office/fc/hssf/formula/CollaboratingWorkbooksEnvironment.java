package lib.zj.office.fc.hssf.formula;

import a6.h;
import androidx.appcompat.view.menu.d;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CollaboratingWorkbooksEnvironment {
    public static final CollaboratingWorkbooksEnvironment EMPTY = new CollaboratingWorkbooksEnvironment();
    private final WorkbookEvaluator[] _evaluators;
    private final Map<String, WorkbookEvaluator> _evaluatorsByName;
    private boolean _unhooked;

    /* loaded from: classes3.dex */
    public static final class WorkbookNotFoundException extends Exception {
        public WorkbookNotFoundException(String str) {
            super(str);
        }
    }

    private CollaboratingWorkbooksEnvironment() {
        this._evaluatorsByName = Collections.emptyMap();
        this._evaluators = new WorkbookEvaluator[0];
    }

    private static void hookNewEnvironment(WorkbookEvaluator[] workbookEvaluatorArr, CollaboratingWorkbooksEnvironment collaboratingWorkbooksEnvironment) {
        int length = workbookEvaluatorArr.length;
        IEvaluationListener evaluationListener = workbookEvaluatorArr[0].getEvaluationListener();
        for (WorkbookEvaluator workbookEvaluator : workbookEvaluatorArr) {
            if (evaluationListener != workbookEvaluator.getEvaluationListener()) {
                throw new RuntimeException("Workbook evaluators must all have the same evaluation listener");
            }
        }
        EvaluationCache evaluationCache = new EvaluationCache(evaluationListener);
        for (int i10 = 0; i10 < length; i10++) {
            workbookEvaluatorArr[i10].attachToEnvironment(collaboratingWorkbooksEnvironment, evaluationCache, i10);
        }
    }

    public static void setup(String[] strArr, WorkbookEvaluator[] workbookEvaluatorArr) {
        int length = strArr.length;
        if (workbookEvaluatorArr.length == length) {
            if (length >= 1) {
                new CollaboratingWorkbooksEnvironment(strArr, workbookEvaluatorArr, length);
                return;
            }
            throw new IllegalArgumentException("Must provide at least one collaborating worbook");
        }
        StringBuilder e10 = d.e("Number of workbook names is ", length, " but number of evaluators is ");
        e10.append(workbookEvaluatorArr.length);
        throw new IllegalArgumentException(e10.toString());
    }

    private void unhook() {
        if (this._evaluators.length < 1) {
            return;
        }
        int i10 = 0;
        while (true) {
            WorkbookEvaluator[] workbookEvaluatorArr = this._evaluators;
            if (i10 < workbookEvaluatorArr.length) {
                workbookEvaluatorArr[i10].detachFromEnvironment();
                i10++;
            } else {
                this._unhooked = true;
                return;
            }
        }
    }

    private void unhookOldEnvironments(WorkbookEvaluator[] workbookEvaluatorArr) {
        HashSet hashSet = new HashSet();
        for (WorkbookEvaluator workbookEvaluator : workbookEvaluatorArr) {
            hashSet.add(workbookEvaluator.getEnvironment());
        }
        int size = hashSet.size();
        CollaboratingWorkbooksEnvironment[] collaboratingWorkbooksEnvironmentArr = new CollaboratingWorkbooksEnvironment[size];
        hashSet.toArray(collaboratingWorkbooksEnvironmentArr);
        for (int i10 = 0; i10 < size; i10++) {
            collaboratingWorkbooksEnvironmentArr[i10].unhook();
        }
    }

    public WorkbookEvaluator getWorkbookEvaluator(String str) {
        if (!this._unhooked) {
            WorkbookEvaluator workbookEvaluator = this._evaluatorsByName.get(str);
            if (workbookEvaluator == null) {
                StringBuffer stringBuffer = new StringBuffer(256);
                stringBuffer.append("Could not resolve external workbook name '");
                stringBuffer.append(str);
                stringBuffer.append("'.");
                if (this._evaluators.length >= 1) {
                    stringBuffer.append(" The following workbook names are valid: (");
                    int i10 = 0;
                    for (String str2 : this._evaluatorsByName.keySet()) {
                        int i11 = i10 + 1;
                        if (i10 > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append(OperatorName.SHOW_TEXT_LINE);
                        stringBuffer.append(str2);
                        stringBuffer.append(OperatorName.SHOW_TEXT_LINE);
                        i10 = i11;
                    }
                    stringBuffer.append(")");
                } else {
                    stringBuffer.append(" Workbook environment has not been set up.");
                }
                throw new WorkbookNotFoundException(stringBuffer.toString());
            }
            return workbookEvaluator;
        }
        throw new IllegalStateException("This environment has been unhooked");
    }

    private CollaboratingWorkbooksEnvironment(String[] strArr, WorkbookEvaluator[] workbookEvaluatorArr, int i10) {
        int i11 = (i10 * 3) / 2;
        HashMap hashMap = new HashMap(i11);
        IdentityHashMap identityHashMap = new IdentityHashMap(i11);
        for (int i12 = 0; i12 < i10; i12++) {
            String str = strArr[i12];
            WorkbookEvaluator workbookEvaluator = workbookEvaluatorArr[i12];
            if (!hashMap.containsKey(str)) {
                if (!identityHashMap.containsKey(workbookEvaluator)) {
                    identityHashMap.put(workbookEvaluator, str);
                    hashMap.put(str, workbookEvaluator);
                } else {
                    throw new IllegalArgumentException("Attempted to register same workbook under names '" + ((String) identityHashMap.get(workbookEvaluator)) + "' and '" + str + OperatorName.SHOW_TEXT_LINE);
                }
            } else {
                throw new IllegalArgumentException(h.d("Duplicate workbook name '", str, OperatorName.SHOW_TEXT_LINE));
            }
        }
        unhookOldEnvironments(workbookEvaluatorArr);
        hookNewEnvironment(workbookEvaluatorArr, this);
        this._unhooked = false;
        this._evaluators = workbookEvaluatorArr;
        this._evaluatorsByName = hashMap;
    }
}
