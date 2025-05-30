package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class UnknownRecord extends StandardRecord {
    public static final int BITMAP_00E9 = 233;
    public static final int CODENAME_1BA = 442;
    public static final int HEADER_FOOTER_089C = 2204;
    public static final int LABELRANGES_015F = 351;
    public static final int PHONETICPR_00EF = 239;
    public static final int PLS_004D = 77;
    public static final int PRINTSIZE_0033 = 51;
    public static final int QUICKTIP_0800 = 2048;
    public static final int SCL_00A0 = 160;
    public static final int SHEETEXT_0862 = 2146;
    public static final int SHEETPROTECTION_0867 = 2151;
    public static final int SHEETPR_0081 = 129;
    public static final int SORT_0090 = 144;
    public static final int STANDARDWIDTH_0099 = 153;
    private byte[] _rawData;
    private int _sid;

    public UnknownRecord(int i10, byte[] bArr) {
        this._sid = i10 & Variant.VT_ILLEGAL;
        this._rawData = bArr;
    }

    public static String getBiffName(int i10) {
        switch (i10) {
            case 51:
                return "PRINTSIZE";
            case 77:
                return "PLS";
            case 80:
                return "DCON";
            case ShapeTypes.VERTICAL_SCROLL /* 127 */:
                return "IMDATA";
            case 129:
                return "SHEETPR";
            case 144:
                return "SORT";
            case 148:
                return "LHRECORD";
            case 153:
                return "STANDARDWIDTH";
            case 160:
                return "SCL";
            case ShapeTypes.GEAR_9 /* 174 */:
                return "SCENMAN";
            case ShapeTypes.MATH_MULTIPLY /* 178 */:
                return "SXVI";
            case ShapeTypes.MATH_EQUAL /* 180 */:
                return "SXIVD";
            case ShapeTypes.MATH_NOT_EQUAL /* 181 */:
                return "SXLI";
            case 211:
                return "OBPROJ";
            case 220:
                return "PARAMQRY";
            case 222:
                return "OLESIZE";
            case BITMAP_00E9 /* 233 */:
                return "BITMAP";
            case PHONETICPR_00EF /* 239 */:
                return "PHONETICPR";
            case 241:
                return "SXEX";
            case LABELRANGES_015F /* 351 */:
                return "LABELRANGES";
            case 425:
                return "USERBVIEW";
            case 429:
                return "QSI";
            case CODENAME_1BA /* 442 */:
                return "CODENAME";
            case 448:
                return "EXCEL9FILE";
            case 2048:
                return "QUICKTIP";
            case 2050:
                return "QSISXTAG";
            case 2051:
                return "DBQUERYEXT";
            case 2053:
                return "TXTQUERY";
            case 2064:
                return "SXVIEWEX9";
            case 2066:
                return "CONTINUEFRT";
            case SHEETEXT_0862 /* 2146 */:
                return "SHEETEXT";
            case 2147:
                return "BOOKEXT";
            case 2148:
                return "SXADDL";
            case SHEETPROTECTION_0867 /* 2151 */:
                return "SHEETPROTECTION";
            case 2155:
                return "DATALABEXTCONTENTS";
            case 2156:
                return "CELLWATCH";
            case 2164:
                return "DROPDOWNOBJIDS";
            case 2166:
                return "DCONN";
            case 2171:
                return "CFEX";
            case 2172:
                return "XFCRC";
            case 2173:
                return "XFEXT";
            case 2175:
                return "CONTINUEFRT12";
            case 2187:
                return "PLV";
            case 2188:
                return "COMPAT12";
            case 2189:
                return "DXF";
            case 2194:
                return "STYLEEXT";
            case 2198:
                return "THEME";
            case 2199:
                return "GUIDTYPELIB";
            case 2202:
                return "MTRSETTINGS";
            case 2203:
                return "COMPRESSPICTURES";
            case HEADER_FOOTER_089C /* 2204 */:
                return "HEADERFOOTER";
            case 2209:
                return "SHAPEPROPSSTREAM";
            case 2211:
                return "FORCEFULLCALCULATION";
            case 2212:
                return "SHAPEPROPSSTREAM";
            case 2213:
                return "TEXTPROPSSTREAM";
            case 2214:
                return "RICHTEXTSTREAM";
            case 2248:
                return "PLV{Mac Excel}";
            default:
                if (isObservedButUnknown(i10)) {
                    return "UNKNOWN-" + Integer.toHexString(i10).toUpperCase();
                }
                return null;
        }
    }

    private static boolean isObservedButUnknown(int i10) {
        if (i10 == 51 || i10 == 52 || i10 == 2205 || i10 == 2206 || i10 == 4102 || i10 == 4103 || i10 == 4170 || i10 == 4171) {
            return true;
        }
        switch (i10) {
            case 445:
            case 450:
            case 2215:
            case 4097:
            case 4116:
            case 4125:
            case 4126:
            case 4127:
            case 4128:
            case 4129:
            case 4130:
            case 4154:
            case 4161:
            case 4174:
            case 4175:
            case 4177:
            case 4188:
            case 4189:
            case 4191:
            case 4192:
            case 4194:
            case 4195:
            case 4196:
            case 4197:
            case 4198:
                return true;
            default:
                switch (i10) {
                    case 4105:
                    case 4106:
                    case 4107:
                    case 4108:
                        return true;
                    default:
                        switch (i10) {
                            case 4119:
                            case 4120:
                            case 4121:
                            case 4122:
                            case 4123:
                                return true;
                            default:
                                switch (i10) {
                                    case 4132:
                                    case 4133:
                                    case 4134:
                                    case 4135:
                                        return true;
                                    default:
                                        switch (i10) {
                                            case 4146:
                                            case 4147:
                                            case 4148:
                                            case 4149:
                                                return true;
                                            default:
                                                switch (i10) {
                                                    case 4163:
                                                    case 4164:
                                                    case 4165:
                                                    case 4166:
                                                        return true;
                                                    default:
                                                        return false;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public byte[] getData() {
        return this._rawData;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this._rawData.length;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) this._sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.write(this._rawData);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        String biffName = getBiffName(this._sid);
        if (biffName == null) {
            biffName = "UNKNOWNRECORD";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        stringBuffer.append(biffName);
        stringBuffer.append("] (0x");
        stringBuffer.append(Integer.toHexString(this._sid).toUpperCase() + ")\n");
        if (this._rawData.length > 0) {
            stringBuffer.append("  rawData=");
            stringBuffer.append(HexDump.toHex(this._rawData));
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/");
        stringBuffer.append(biffName);
        stringBuffer.append("]\n");
        return stringBuffer.toString();
    }

    public UnknownRecord(RecordInputStream recordInputStream) {
        this._sid = recordInputStream.getSid();
        this._rawData = recordInputStream.readRemainder();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return this;
    }
}
