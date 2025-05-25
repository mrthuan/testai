package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.fontbox.ttf.WGL4Names;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public final class CFFExpertSubsetCharset extends CFFCharset {
    private static final Object[][] CFF_EXPERT_SUBSET_CHARSET_TABLE;
    private static final int CHAR_CODE = 0;
    private static final int CHAR_NAME = 1;
    private static final CFFExpertSubsetCharset INSTANCE;

    static {
        Object[][] objArr = {new Object[]{0, ".notdef"}, new Object[]{1, "space"}, new Object[]{231, "dollaroldstyle"}, new Object[]{232, "dollarsuperior"}, new Object[]{235, "parenleftsuperior"}, new Object[]{236, "parenrightsuperior"}, new Object[]{237, "twodotenleader"}, new Object[]{238, "onedotenleader"}, new Object[]{13, "comma"}, new Object[]{14, "hyphen"}, new Object[]{15, "period"}, new Object[]{99, "fraction"}, new Object[]{Integer.valueOf((int) UnknownRecord.PHONETICPR_00EF), "zerooldstyle"}, new Object[]{240, "oneoldstyle"}, new Object[]{241, "twooldstyle"}, new Object[]{242, "threeoldstyle"}, new Object[]{243, "fouroldstyle"}, new Object[]{244, "fiveoldstyle"}, new Object[]{245, "sixoldstyle"}, new Object[]{246, "sevenoldstyle"}, new Object[]{247, "eightoldstyle"}, new Object[]{248, "nineoldstyle"}, new Object[]{27, "colon"}, new Object[]{28, "semicolon"}, new Object[]{249, "commasuperior"}, new Object[]{250, "threequartersemdash"}, new Object[]{251, "periodsuperior"}, new Object[]{253, "asuperior"}, new Object[]{254, "bsuperior"}, new Object[]{Integer.valueOf((int) FunctionEval.FunctionID.EXTERNAL_FUNC), "centsuperior"}, new Object[]{256, "dsuperior"}, new Object[]{257, "esuperior"}, new Object[]{Integer.valueOf((int) WGL4Names.NUMBER_OF_MAC_GLYPHS), "isuperior"}, new Object[]{259, "lsuperior"}, new Object[]{260, "msuperior"}, new Object[]{261, "nsuperior"}, new Object[]{262, "osuperior"}, new Object[]{263, "rsuperior"}, new Object[]{264, "ssuperior"}, new Object[]{265, "tsuperior"}, new Object[]{266, "ff"}, new Object[]{109, "fi"}, new Object[]{110, "fl"}, new Object[]{267, "ffi"}, new Object[]{268, "ffl"}, new Object[]{269, "parenleftinferior"}, new Object[]{270, "parenrightinferior"}, new Object[]{272, "hyphensuperior"}, new Object[]{Integer.valueOf((int) OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT), "colonmonetary"}, new Object[]{301, "onefitted"}, new Object[]{302, "rupiah"}, new Object[]{305, "centoldstyle"}, new Object[]{314, "figuredash"}, new Object[]{315, "hypheninferior"}, new Object[]{Integer.valueOf((int) ShapeTypes.FLOW_CHART_DELAY), "onequarter"}, new Object[]{Integer.valueOf((int) ShapeTypes.FLOW_CHART_MAGNETIC_DISK), "onehalf"}, new Object[]{Integer.valueOf((int) ShapeTypes.ACTION_BUTTON_HELP), "threequarters"}, new Object[]{320, "oneeighth"}, new Object[]{321, "threeeighths"}, new Object[]{322, "fiveeighths"}, new Object[]{323, "seveneighths"}, new Object[]{324, "onethird"}, new Object[]{325, "twothirds"}, new Object[]{326, "zerosuperior"}, new Object[]{Integer.valueOf((int) ShapeTypes.FLOW_CHART_EXTRACT), "onesuperior"}, new Object[]{164, "twosuperior"}, new Object[]{Integer.valueOf((int) ShapeTypes.ACTION_BUTTON_RETURN), "threesuperior"}, new Object[]{327, "foursuperior"}, new Object[]{328, "fivesuperior"}, new Object[]{329, "sixsuperior"}, new Object[]{330, "sevensuperior"}, new Object[]{331, "eightsuperior"}, new Object[]{332, "ninesuperior"}, new Object[]{333, "zeroinferior"}, new Object[]{334, "oneinferior"}, new Object[]{335, "twoinferior"}, new Object[]{336, "threeinferior"}, new Object[]{337, "fourinferior"}, new Object[]{338, "fiveinferior"}, new Object[]{339, "sixinferior"}, new Object[]{340, "seveninferior"}, new Object[]{341, "eightinferior"}, new Object[]{342, "nineinferior"}, new Object[]{343, "centinferior"}, new Object[]{344, "dollarinferior"}, new Object[]{345, "periodinferior"}, new Object[]{346, "commainferior"}};
        CFF_EXPERT_SUBSET_CHARSET_TABLE = objArr;
        INSTANCE = new CFFExpertSubsetCharset();
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object[] objArr2 = objArr[i10];
            INSTANCE.addSID(i11, ((Integer) objArr2[0]).intValue(), objArr2[1].toString());
            i10++;
            i11++;
        }
    }

    private CFFExpertSubsetCharset() {
        super(false);
    }

    public static CFFExpertSubsetCharset getInstance() {
        return INSTANCE;
    }
}
