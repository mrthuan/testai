package lib.zj.office.fc.hssf.usermodel;

import a0.a;
import a6.h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.ss.usermodel.DataValidationConstraint;
import lib.zj.office.ss.util.DateUtil;

/* loaded from: classes3.dex */
public class DVConstraint implements DataValidationConstraint {
    private static final DataValidationConstraint.ValidationType VT = null;
    private String[] _explicitListValues;
    private String _formula1;
    private String _formula2;
    private int _operator;
    private final int _validationType;
    private Double _value1;
    private Double _value2;

    /* loaded from: classes3.dex */
    public static final class FormulaPair {
        private final Ptg[] _formula1;
        private final Ptg[] _formula2;

        public FormulaPair(Ptg[] ptgArr, Ptg[] ptgArr2) {
            this._formula1 = ptgArr;
            this._formula2 = ptgArr2;
        }

        public Ptg[] getFormula1() {
            return this._formula1;
        }

        public Ptg[] getFormula2() {
            return this._formula2;
        }
    }

    private DVConstraint(int i10, int i11, String str, String str2, Double d10, Double d11, String[] strArr) {
        this._validationType = i10;
        this._operator = i11;
        this._formula1 = str;
        this._formula2 = str2;
        this._value1 = d10;
        this._value2 = d11;
        this._explicitListValues = strArr;
    }

    private static Double convertDate(String str, SimpleDateFormat simpleDateFormat) {
        Date parse;
        if (str == null) {
            return null;
        }
        if (simpleDateFormat == null) {
            parse = DateUtil.parseYYYYMMDDDate(str);
        } else {
            try {
                parse = simpleDateFormat.parse(str);
            } catch (ParseException e10) {
                throw new RuntimeException("Failed to parse date '" + str + "' using specified format '" + simpleDateFormat + OperatorName.SHOW_TEXT_LINE, e10);
            }
        }
        return new Double(DateUtil.getExcelDate(parse));
    }

    private static Ptg[] convertDoubleFormula(String str, Double d10, HSSFSheet hSSFSheet) {
        return null;
    }

    private static Double convertNumber(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Double(str);
        } catch (NumberFormatException unused) {
            throw new RuntimeException(h.d("The supplied text '", str, "' could not be parsed as a number"));
        }
    }

    private static Double convertTime(String str) {
        if (str == null) {
            return null;
        }
        return new Double(DateUtil.convertTime(str));
    }

    public static DVConstraint createCustomFormulaConstraint(String str) {
        if (str != null) {
            return new DVConstraint(7, 0, str, null, null, null, null);
        }
        throw new IllegalArgumentException("formula must be supplied");
    }

    public static DVConstraint createDateConstraint(int i10, String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat;
        Double d10;
        if (str != null) {
            DataValidationConstraint.OperatorType.validateSecondArg(i10, str2);
            Double d11 = null;
            if (str3 == null) {
                simpleDateFormat = null;
            } else {
                simpleDateFormat = new SimpleDateFormat(str3);
            }
            String formulaFromTextExpression = getFormulaFromTextExpression(str);
            if (formulaFromTextExpression == null) {
                d10 = convertDate(str, simpleDateFormat);
            } else {
                d10 = null;
            }
            String formulaFromTextExpression2 = getFormulaFromTextExpression(str2);
            if (formulaFromTextExpression2 == null) {
                d11 = convertDate(str2, simpleDateFormat);
            }
            return new DVConstraint(4, i10, formulaFromTextExpression, formulaFromTextExpression2, d10, d11, null);
        }
        throw new IllegalArgumentException("expr1 must be supplied");
    }

    public static DVConstraint createExplicitListConstraint(String[] strArr) {
        return new DVConstraint(null, strArr);
    }

    public static DVConstraint createFormulaListConstraint(String str) {
        return new DVConstraint(str, null);
    }

    private Ptg[] createListFormula(HSSFSheet hSSFSheet) {
        return null;
    }

    public static DVConstraint createNumericConstraint(int i10, int i11, String str, String str2) {
        Double d10;
        Double d11;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2 && i10 != 6) {
                throw new IllegalArgumentException(a.g("Validation Type (", i10, ") not supported with this method"));
            }
            if (str != null) {
                DataValidationConstraint.OperatorType.validateSecondArg(i11, str2);
            } else {
                throw new IllegalArgumentException("expr1 must be supplied");
            }
        } else if (str != null || str2 != null) {
            throw new IllegalArgumentException("expr1 and expr2 must be null for validation type 'any'");
        }
        String formulaFromTextExpression = getFormulaFromTextExpression(str);
        if (formulaFromTextExpression == null) {
            d10 = convertNumber(str);
        } else {
            d10 = null;
        }
        String formulaFromTextExpression2 = getFormulaFromTextExpression(str2);
        if (formulaFromTextExpression2 == null) {
            d11 = convertNumber(str2);
        } else {
            d11 = null;
        }
        return new DVConstraint(i10, i11, formulaFromTextExpression, formulaFromTextExpression2, d10, d11, null);
    }

    public static DVConstraint createTimeConstraint(int i10, String str, String str2) {
        Double d10;
        Double d11;
        if (str != null) {
            DataValidationConstraint.OperatorType.validateSecondArg(i10, str);
            String formulaFromTextExpression = getFormulaFromTextExpression(str);
            if (formulaFromTextExpression == null) {
                d10 = convertTime(str);
            } else {
                d10 = null;
            }
            String formulaFromTextExpression2 = getFormulaFromTextExpression(str2);
            if (formulaFromTextExpression2 == null) {
                d11 = convertTime(str2);
            } else {
                d11 = null;
            }
            return new DVConstraint(5, i10, formulaFromTextExpression, formulaFromTextExpression2, d10, d11, null);
        }
        throw new IllegalArgumentException("expr1 must be supplied");
    }

    private static String getFormulaFromTextExpression(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() >= 1) {
            if (str.charAt(0) != '=') {
                return null;
            }
            return str.substring(1);
        }
        throw new IllegalArgumentException("Empty string is not a valid formula/value expression");
    }

    public FormulaPair createFormulas(HSSFSheet hSSFSheet) {
        Ptg[] convertDoubleFormula;
        Ptg[] ptgArr;
        if (isListValidationType()) {
            ptgArr = createListFormula(hSSFSheet);
            convertDoubleFormula = Ptg.EMPTY_PTG_ARRAY;
        } else {
            Ptg[] convertDoubleFormula2 = convertDoubleFormula(this._formula1, this._value1, hSSFSheet);
            convertDoubleFormula = convertDoubleFormula(this._formula2, this._value2, hSSFSheet);
            ptgArr = convertDoubleFormula2;
        }
        return new FormulaPair(ptgArr, convertDoubleFormula);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationConstraint
    public String[] getExplicitListValues() {
        return this._explicitListValues;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationConstraint
    public String getFormula1() {
        return this._formula1;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationConstraint
    public String getFormula2() {
        return this._formula2;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationConstraint
    public int getOperator() {
        return this._operator;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationConstraint
    public int getValidationType() {
        return this._validationType;
    }

    public Double getValue1() {
        return this._value1;
    }

    public Double getValue2() {
        return this._value2;
    }

    public boolean isExplicitList() {
        if (this._validationType == 3 && this._explicitListValues != null) {
            return true;
        }
        return false;
    }

    public boolean isListValidationType() {
        if (this._validationType == 3) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationConstraint
    public void setExplicitListValues(String[] strArr) {
        if (this._validationType == 3) {
            this._formula1 = null;
            this._explicitListValues = strArr;
            return;
        }
        throw new RuntimeException("Cannot setExplicitListValues on non-list constraint");
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationConstraint
    public void setFormula1(String str) {
        this._value1 = null;
        this._explicitListValues = null;
        this._formula1 = str;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationConstraint
    public void setFormula2(String str) {
        this._value2 = null;
        this._formula2 = str;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationConstraint
    public void setOperator(int i10) {
        this._operator = i10;
    }

    public void setValue1(double d10) {
        this._formula1 = null;
        this._value1 = new Double(d10);
    }

    public void setValue2(double d10) {
        this._formula2 = null;
        this._value2 = new Double(d10);
    }

    private DVConstraint(String str, String[] strArr) {
        this(3, 0, str, null, null, null, strArr);
    }
}
