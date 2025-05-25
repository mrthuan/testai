package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.fontbox.ttf.WGL4Names;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public final class CFFExpertCharset extends CFFCharset {
    private static final Object[][] CFF_EXPERT_CHARSET_TABLE;
    private static final int CHAR_CODE = 0;
    private static final int CHAR_NAME = 1;
    private static final CFFExpertCharset INSTANCE;

    static {
        Object[][] objArr = {new Object[]{0, ".notdef"}, new Object[]{1, "space"}, new Object[]{229, "exclamsmall"}, new Object[]{230, "Hungarumlautsmall"}, new Object[]{231, "dollaroldstyle"}, new Object[]{232, "dollarsuperior"}, new Object[]{Integer.valueOf((int) UnknownRecord.BITMAP_00E9), "ampersandsmall"}, new Object[]{234, "Acutesmall"}, new Object[]{235, "parenleftsuperior"}, new Object[]{236, "parenrightsuperior"}, new Object[]{237, "twodotenleader"}, new Object[]{238, "onedotenleader"}, new Object[]{13, "comma"}, new Object[]{14, "hyphen"}, new Object[]{15, "period"}, new Object[]{99, "fraction"}, new Object[]{Integer.valueOf((int) UnknownRecord.PHONETICPR_00EF), "zerooldstyle"}, new Object[]{240, "oneoldstyle"}, new Object[]{241, "twooldstyle"}, new Object[]{242, "threeoldstyle"}, new Object[]{243, "fouroldstyle"}, new Object[]{244, "fiveoldstyle"}, new Object[]{245, "sixoldstyle"}, new Object[]{246, "sevenoldstyle"}, new Object[]{247, "eightoldstyle"}, new Object[]{248, "nineoldstyle"}, new Object[]{27, "colon"}, new Object[]{28, "semicolon"}, new Object[]{249, "commasuperior"}, new Object[]{250, "threequartersemdash"}, new Object[]{251, "periodsuperior"}, new Object[]{252, "questionsmall"}, new Object[]{253, "asuperior"}, new Object[]{254, "bsuperior"}, new Object[]{Integer.valueOf((int) FunctionEval.FunctionID.EXTERNAL_FUNC), "centsuperior"}, new Object[]{256, "dsuperior"}, new Object[]{257, "esuperior"}, new Object[]{Integer.valueOf((int) WGL4Names.NUMBER_OF_MAC_GLYPHS), "isuperior"}, new Object[]{259, "lsuperior"}, new Object[]{260, "msuperior"}, new Object[]{261, "nsuperior"}, new Object[]{262, "osuperior"}, new Object[]{263, "rsuperior"}, new Object[]{264, "ssuperior"}, new Object[]{265, "tsuperior"}, new Object[]{266, "ff"}, new Object[]{109, "fi"}, new Object[]{110, "fl"}, new Object[]{267, "ffi"}, new Object[]{268, "ffl"}, new Object[]{269, "parenleftinferior"}, new Object[]{270, "parenrightinferior"}, new Object[]{271, "Circumflexsmall"}, new Object[]{272, "hyphensuperior"}, new Object[]{273, "Gravesmall"}, new Object[]{274, "Asmall"}, new Object[]{275, "Bsmall"}, new Object[]{276, "Csmall"}, new Object[]{277, "Dsmall"}, new Object[]{278, "Esmall"}, new Object[]{279, "Fsmall"}, new Object[]{280, "Gsmall"}, new Object[]{281, "Hsmall"}, new Object[]{282, "Ismall"}, new Object[]{283, "Jsmall"}, new Object[]{284, "Ksmall"}, new Object[]{285, "Lsmall"}, new Object[]{286, "Msmall"}, new Object[]{287, "Nsmall"}, new Object[]{288, "Osmall"}, new Object[]{289, "Psmall"}, new Object[]{290, "Qsmall"}, new Object[]{291, "Rsmall"}, new Object[]{292, "Ssmall"}, new Object[]{293, "Tsmall"}, new Object[]{294, "Usmall"}, new Object[]{295, "Vsmall"}, new Object[]{296, "Wsmall"}, new Object[]{297, "Xsmall"}, new Object[]{298, "Ysmall"}, new Object[]{299, "Zsmall"}, new Object[]{Integer.valueOf((int) OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT), "colonmonetary"}, new Object[]{301, "onefitted"}, new Object[]{302, "rupiah"}, new Object[]{303, "Tildesmall"}, new Object[]{304, "exclamdownsmall"}, new Object[]{305, "centoldstyle"}, new Object[]{306, "Lslashsmall"}, new Object[]{307, "Scaronsmall"}, new Object[]{308, "Zcaronsmall"}, new Object[]{309, "Dieresissmall"}, new Object[]{310, "Brevesmall"}, new Object[]{311, "Caronsmall"}, new Object[]{312, "Dotaccentsmall"}, new Object[]{313, "Macronsmall"}, new Object[]{314, "figuredash"}, new Object[]{315, "hypheninferior"}, new Object[]{316, "Ogoneksmall"}, new Object[]{317, "Ringsmall"}, new Object[]{318, "Cedillasmall"}, new Object[]{Integer.valueOf((int) ShapeTypes.FLOW_CHART_DELAY), "onequarter"}, new Object[]{Integer.valueOf((int) ShapeTypes.FLOW_CHART_MAGNETIC_DISK), "onehalf"}, new Object[]{Integer.valueOf((int) ShapeTypes.ACTION_BUTTON_HELP), "threequarters"}, new Object[]{319, "questiondownsmall"}, new Object[]{320, "oneeighth"}, new Object[]{321, "threeeighths"}, new Object[]{322, "fiveeighths"}, new Object[]{323, "seveneighths"}, new Object[]{324, "onethird"}, new Object[]{325, "twothirds"}, new Object[]{326, "zerosuperior"}, new Object[]{Integer.valueOf((int) ShapeTypes.FLOW_CHART_EXTRACT), "onesuperior"}, new Object[]{164, "twosuperior"}, new Object[]{Integer.valueOf((int) ShapeTypes.ACTION_BUTTON_RETURN), "threesuperior"}, new Object[]{327, "foursuperior"}, new Object[]{328, "fivesuperior"}, new Object[]{329, "sixsuperior"}, new Object[]{330, "sevensuperior"}, new Object[]{331, "eightsuperior"}, new Object[]{332, "ninesuperior"}, new Object[]{333, "zeroinferior"}, new Object[]{334, "oneinferior"}, new Object[]{335, "twoinferior"}, new Object[]{336, "threeinferior"}, new Object[]{337, "fourinferior"}, new Object[]{338, "fiveinferior"}, new Object[]{339, "sixinferior"}, new Object[]{340, "seveninferior"}, new Object[]{341, "eightinferior"}, new Object[]{342, "nineinferior"}, new Object[]{343, "centinferior"}, new Object[]{344, "dollarinferior"}, new Object[]{345, "periodinferior"}, new Object[]{346, "commainferior"}, new Object[]{347, "Agravesmall"}, new Object[]{348, "Aacutesmall"}, new Object[]{349, "Acircumflexsmall"}, new Object[]{350, "Atildesmall"}, new Object[]{Integer.valueOf((int) UnknownRecord.LABELRANGES_015F), "Adieresissmall"}, new Object[]{352, "Aringsmall"}, new Object[]{353, "AEsmall"}, new Object[]{354, "Ccedillasmall"}, new Object[]{355, "Egravesmall"}, new Object[]{356, "Eacutesmall"}, new Object[]{357, "Ecircumflexsmall"}, new Object[]{358, "Edieresissmall"}, new Object[]{359, "Igravesmall"}, new Object[]{360, "Iacutesmall"}, new Object[]{361, "Icircumflexsmall"}, new Object[]{362, "Idieresissmall"}, new Object[]{363, "Ethsmall"}, new Object[]{364, "Ntildesmall"}, new Object[]{365, "Ogravesmall"}, new Object[]{366, "Oacutesmall"}, new Object[]{367, "Ocircumflexsmall"}, new Object[]{368, "Otildesmall"}, new Object[]{369, "Odieresissmall"}, new Object[]{370, "OEsmall"}, new Object[]{371, "Oslashsmall"}, new Object[]{372, "Ugravesmall"}, new Object[]{373, "Uacutesmall"}, new Object[]{374, "Ucircumflexsmall"}, new Object[]{375, "Udieresissmall"}, new Object[]{376, "Yacutesmall"}, new Object[]{377, "Thornsmall"}, new Object[]{378, "Ydieresissmall"}};
        CFF_EXPERT_CHARSET_TABLE = objArr;
        INSTANCE = new CFFExpertCharset();
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

    private CFFExpertCharset() {
        super(false);
    }

    public static CFFExpertCharset getInstance() {
        return INSTANCE;
    }
}
