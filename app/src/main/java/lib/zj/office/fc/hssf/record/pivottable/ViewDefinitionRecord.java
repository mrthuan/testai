package lib.zj.office.fc.hssf.record.pivottable;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class ViewDefinitionRecord extends StandardRecord {
    public static final short sid = 176;
    private int cCol;
    private int cDim;
    private int cDimCol;
    private int cDimData;
    private int cDimPg;
    private int cDimRw;
    private int cRw;
    private int colFirst;
    private int colFirstData;
    private int colLast;
    private String dataField;
    private int grbit;
    private int iCache;
    private int ipos4Data;
    private int itblAutoFmt;
    private String name;
    private int reserved;
    private int rwFirst;
    private int rwFirstData;
    private int rwFirstHead;
    private int rwLast;
    private int sxaxis4Data;

    public ViewDefinitionRecord(RecordInputStream recordInputStream) {
        this.rwFirst = recordInputStream.readUShort();
        this.rwLast = recordInputStream.readUShort();
        this.colFirst = recordInputStream.readUShort();
        this.colLast = recordInputStream.readUShort();
        this.rwFirstHead = recordInputStream.readUShort();
        this.rwFirstData = recordInputStream.readUShort();
        this.colFirstData = recordInputStream.readUShort();
        this.iCache = recordInputStream.readUShort();
        this.reserved = recordInputStream.readUShort();
        this.sxaxis4Data = recordInputStream.readUShort();
        this.ipos4Data = recordInputStream.readUShort();
        this.cDim = recordInputStream.readUShort();
        this.cDimRw = recordInputStream.readUShort();
        this.cDimCol = recordInputStream.readUShort();
        this.cDimPg = recordInputStream.readUShort();
        this.cDimData = recordInputStream.readUShort();
        this.cRw = recordInputStream.readUShort();
        this.cCol = recordInputStream.readUShort();
        this.grbit = recordInputStream.readUShort();
        this.itblAutoFmt = recordInputStream.readUShort();
        int readUShort = recordInputStream.readUShort();
        int readUShort2 = recordInputStream.readUShort();
        this.name = StringUtil.readUnicodeString(recordInputStream, readUShort);
        this.dataField = StringUtil.readUnicodeString(recordInputStream, readUShort2);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return StringUtil.getEncodedSize(this.dataField) + StringUtil.getEncodedSize(this.name) + 40;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.rwFirst);
        littleEndianOutput.writeShort(this.rwLast);
        littleEndianOutput.writeShort(this.colFirst);
        littleEndianOutput.writeShort(this.colLast);
        littleEndianOutput.writeShort(this.rwFirstHead);
        littleEndianOutput.writeShort(this.rwFirstData);
        littleEndianOutput.writeShort(this.colFirstData);
        littleEndianOutput.writeShort(this.iCache);
        littleEndianOutput.writeShort(this.reserved);
        littleEndianOutput.writeShort(this.sxaxis4Data);
        littleEndianOutput.writeShort(this.ipos4Data);
        littleEndianOutput.writeShort(this.cDim);
        littleEndianOutput.writeShort(this.cDimRw);
        littleEndianOutput.writeShort(this.cDimCol);
        littleEndianOutput.writeShort(this.cDimPg);
        littleEndianOutput.writeShort(this.cDimData);
        littleEndianOutput.writeShort(this.cRw);
        littleEndianOutput.writeShort(this.cCol);
        littleEndianOutput.writeShort(this.grbit);
        littleEndianOutput.writeShort(this.itblAutoFmt);
        littleEndianOutput.writeShort(this.name.length());
        littleEndianOutput.writeShort(this.dataField.length());
        StringUtil.writeUnicodeStringFlagAndData(littleEndianOutput, this.name);
        StringUtil.writeUnicodeStringFlagAndData(littleEndianOutput, this.dataField);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SXVIEW]\n    .rwFirst      =");
        r.j(this.rwFirst, stringBuffer, "\n    .rwLast       =");
        r.j(this.rwLast, stringBuffer, "\n    .colFirst     =");
        r.j(this.colFirst, stringBuffer, "\n    .colLast      =");
        r.j(this.colLast, stringBuffer, "\n    .rwFirstHead  =");
        r.j(this.rwFirstHead, stringBuffer, "\n    .rwFirstData  =");
        r.j(this.rwFirstData, stringBuffer, "\n    .colFirstData =");
        r.j(this.colFirstData, stringBuffer, "\n    .iCache       =");
        r.j(this.iCache, stringBuffer, "\n    .reserved     =");
        r.j(this.reserved, stringBuffer, "\n    .sxaxis4Data  =");
        r.j(this.sxaxis4Data, stringBuffer, "\n    .ipos4Data    =");
        r.j(this.ipos4Data, stringBuffer, "\n    .cDim         =");
        r.j(this.cDim, stringBuffer, "\n    .cDimRw       =");
        r.j(this.cDimRw, stringBuffer, "\n    .cDimCol      =");
        r.j(this.cDimCol, stringBuffer, "\n    .cDimPg       =");
        r.j(this.cDimPg, stringBuffer, "\n    .cDimData     =");
        r.j(this.cDimData, stringBuffer, "\n    .cRw          =");
        r.j(this.cRw, stringBuffer, "\n    .cCol         =");
        r.j(this.cCol, stringBuffer, "\n    .grbit        =");
        r.j(this.grbit, stringBuffer, "\n    .itblAutoFmt  =");
        r.j(this.itblAutoFmt, stringBuffer, "\n    .name         =");
        stringBuffer.append(this.name);
        stringBuffer.append("\n    .dataField    =");
        stringBuffer.append(this.dataField);
        stringBuffer.append("\n[/SXVIEW]\n");
        return stringBuffer.toString();
    }
}
