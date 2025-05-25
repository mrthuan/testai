package lib.zj.office.fc.hssf.eventusermodel;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.ExtendedFormatRecord;
import lib.zj.office.fc.hssf.record.FormatRecord;
import lib.zj.office.fc.hssf.record.FormulaRecord;
import lib.zj.office.fc.hssf.record.NumberRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.usermodel.HSSFDataFormat;
import lib.zj.office.fc.hssf.usermodel.HSSFDataFormatter;

/* loaded from: classes3.dex */
public class FormatTrackingHSSFListener implements HSSFListener {
    private final HSSFListener _childListener;
    private final Map<Integer, FormatRecord> _customFormatRecords;
    private final NumberFormat _defaultFormat;
    private final HSSFDataFormatter _formatter;
    private final List<ExtendedFormatRecord> _xfRecords;

    public FormatTrackingHSSFListener(HSSFListener hSSFListener) {
        this(hSSFListener, Locale.getDefault());
    }

    public String formatNumberDateCell(CellValueRecordInterface cellValueRecordInterface) {
        double value;
        if (cellValueRecordInterface instanceof NumberRecord) {
            value = ((NumberRecord) cellValueRecordInterface).getValue();
        } else if (cellValueRecordInterface instanceof FormulaRecord) {
            value = ((FormulaRecord) cellValueRecordInterface).getValue();
        } else {
            throw new IllegalArgumentException("Unsupported CellValue Record passed in " + cellValueRecordInterface);
        }
        int formatIndex = getFormatIndex(cellValueRecordInterface);
        String formatString = getFormatString(cellValueRecordInterface);
        if (formatString == null) {
            return this._defaultFormat.format(value);
        }
        return this._formatter.formatRawCellContents(value, formatIndex, formatString);
    }

    public int getFormatIndex(CellValueRecordInterface cellValueRecordInterface) {
        ExtendedFormatRecord extendedFormatRecord = this._xfRecords.get(cellValueRecordInterface.getXFIndex());
        if (extendedFormatRecord == null) {
            PrintStream printStream = System.err;
            printStream.println("Cell " + cellValueRecordInterface.getRow() + "," + ((int) cellValueRecordInterface.getColumn()) + " uses XF with index " + ((int) cellValueRecordInterface.getXFIndex()) + ", but we don't have that");
            return -1;
        }
        return extendedFormatRecord.getFormatIndex();
    }

    public String getFormatString(int i10) {
        if (i10 >= HSSFDataFormat.getNumberOfBuiltinBuiltinFormats()) {
            FormatRecord formatRecord = this._customFormatRecords.get(Integer.valueOf(i10));
            if (formatRecord == null) {
                PrintStream printStream = System.err;
                printStream.println("Requested format at index " + i10 + ", but it wasn't found");
                return null;
            }
            return formatRecord.getFormatString();
        }
        return HSSFDataFormat.getBuiltinFormat((short) i10);
    }

    public int getNumberOfCustomFormats() {
        return this._customFormatRecords.size();
    }

    public int getNumberOfExtendedFormats() {
        return this._xfRecords.size();
    }

    @Override // lib.zj.office.fc.hssf.eventusermodel.HSSFListener
    public void processRecord(Record record) {
        processRecordInternally(record);
        this._childListener.processRecord(record);
    }

    public void processRecordInternally(Record record) {
        if (record instanceof FormatRecord) {
            FormatRecord formatRecord = (FormatRecord) record;
            this._customFormatRecords.put(Integer.valueOf(formatRecord.getIndexCode()), formatRecord);
        }
        if (record instanceof ExtendedFormatRecord) {
            this._xfRecords.add((ExtendedFormatRecord) record);
        }
    }

    public FormatTrackingHSSFListener(HSSFListener hSSFListener, Locale locale) {
        this._customFormatRecords = new Hashtable();
        this._xfRecords = new ArrayList();
        this._childListener = hSSFListener;
        this._formatter = new HSSFDataFormatter(locale);
        this._defaultFormat = NumberFormat.getInstance(locale);
    }

    public String getFormatString(CellValueRecordInterface cellValueRecordInterface) {
        int formatIndex = getFormatIndex(cellValueRecordInterface);
        if (formatIndex == -1) {
            return null;
        }
        return getFormatString(formatIndex);
    }
}
