package di;

import android.os.Message;
import com.google.android.play.core.assetpacks.b1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.OldExcelFormatException;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;
import lib.zj.office.fc.hssf.model.InternalSheet;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.ExtendedFormatRecord;
import lib.zj.office.fc.hssf.record.FontRecord;
import lib.zj.office.fc.hssf.record.LabelRecord;
import lib.zj.office.fc.hssf.record.NameRecord;
import lib.zj.office.fc.hssf.record.PaletteRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordFactory;
import lib.zj.office.fc.hssf.usermodel.HSSFDataFormat;
import lib.zj.office.fc.hssf.usermodel.HSSFName;
import lib.zj.office.fc.poifs.filesystem.DirectoryNode;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;
import lib.zj.office.fc.ss.usermodel.Workbook;
import lib.zj.office.fc.xls.SSReader;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.f;

/* compiled from: AWorkbook.java */
/* loaded from: classes3.dex */
public final class e extends ei.d implements Workbook {

    /* renamed from: q  reason: collision with root package name */
    public static final String[] f16207q = {"Workbook", "WORKBOOK"};

    /* renamed from: l  reason: collision with root package name */
    public final UDFFinder f16208l;

    /* renamed from: m  reason: collision with root package name */
    public final InternalWorkbook f16209m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<HSSFName> f16210n;

    /* renamed from: o  reason: collision with root package name */
    public int f16211o;

    /* renamed from: p  reason: collision with root package name */
    public final SSReader f16212p;

    /* compiled from: AWorkbook.java */
    /* loaded from: classes3.dex */
    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public e f16213a;

        /* renamed from: b  reason: collision with root package name */
        public Map<Integer, ei.c> f16214b;
        public SSReader c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16215d;

        /* renamed from: e  reason: collision with root package name */
        public f f16216e;

        public a(e eVar, HashMap hashMap, int i10, SSReader sSReader) {
            this.f16213a = eVar;
            this.f16214b = hashMap;
            this.f16215d = i10;
            this.c = sSReader;
            this.f16216e = sSReader.getControl();
        }

        public final void a() {
            for (Integer num : this.f16214b.keySet()) {
                ((c) this.f16213a.o(num.intValue())).s(this.c);
            }
            for (Integer num2 : this.f16214b.keySet()) {
                e eVar = this.f16213a;
                f fVar = this.f16216e;
                c cVar = (c) eVar.c.get(Integer.valueOf(num2.intValue()));
                try {
                    if (cVar.j() != 2) {
                        cVar.t(fVar);
                        cVar.o((short) 2);
                    }
                } catch (Exception unused) {
                    cVar.o((short) 2);
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [di.e, java.util.Map<java.lang.Integer, ei.c>, lib.zj.office.fc.xls.SSReader, lib.zj.office.system.f] */
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            int i10 = this.f16215d;
            try {
                if (i10 >= 0) {
                    try {
                        SSReader sSReader = this.c;
                        if (sSReader != null) {
                            sSReader.abortCurrentReading();
                            Thread.sleep(50L);
                            ((c) this.f16213a.o(i10)).s(this.c);
                            a();
                        }
                    } catch (Exception | OutOfMemoryError | AbortReaderError e10) {
                        SSReader sSReader2 = this.c;
                        if (sSReader2 != null) {
                            sSReader2.dispose();
                            this.c.getControl().o().c().a(true, e10);
                        }
                    }
                }
            } finally {
                this.f16213a = null;
                this.f16214b = null;
                this.c = null;
                this.f16216e = null;
            }
        }
    }

    public e(FileInputStream fileInputStream, SSReader sSReader) {
        super(true);
        boolean z10;
        this.f16208l = UDFFinder.DEFAULT;
        this.f16212p = sSReader;
        DirectoryNode root = new POIFSFileSystem(fileInputStream).getRoot();
        List<Record> createRecords = RecordFactory.createRecords(root.createDocumentInputStream(v(root)), sSReader);
        InternalWorkbook createWorkbook = InternalWorkbook.createWorkbook(createRecords, sSReader);
        this.f16209m = createWorkbook;
        int numRecords = createWorkbook.getNumRecords();
        int sSTUniqueStringSize = createWorkbook.getSSTUniqueStringSize();
        for (int i10 = 0; i10 < sSTUniqueStringSize; i10++) {
            f(i10, this.f16209m.getSSTString(i10));
        }
        for (int i11 = numRecords; i11 < createRecords.size(); i11++) {
            Record record = createRecords.get(i11);
            if (record.getSid() == 516) {
                HashMap hashMap = this.f16629g;
                hashMap.put(Integer.valueOf(hashMap.size()), ((LabelRecord) record).getValue());
            }
        }
        this.f16625b = this.f16209m.isUsing1904DateWindowing();
        PaletteRecord customPalette = this.f16209m.getCustomPalette();
        b(8, b1.X(0, 0, 0));
        byte[] color = customPalette.getColor(9);
        int i12 = 9;
        while (color != null) {
            int i13 = i12 + 1;
            b(i12, b1.W(color[0], color[1], color[2]));
            color = customPalette.getColor(i13);
            i12 = i13;
        }
        InternalWorkbook internalWorkbook = this.f16209m;
        int numberOfFontRecords = internalWorkbook.getNumberOfFontRecords();
        numberOfFontRecords = numberOfFontRecords <= 4 ? numberOfFontRecords - 1 : numberOfFontRecords;
        for (int i14 = 0; i14 <= numberOfFontRecords; i14++) {
            FontRecord fontRecordAt = internalWorkbook.getFontRecordAt(i14);
            yh.a aVar = new yh.a();
            aVar.f32141a = fontRecordAt.getFontName();
            aVar.f32142b = (short) (fontRecordAt.getFontHeight() / 20);
            short colorPaletteIndex = fontRecordAt.getColorPaletteIndex();
            aVar.f32144e = colorPaletteIndex == Short.MAX_VALUE ? (short) 8 : colorPaletteIndex;
            aVar.c = fontRecordAt.isItalic();
            if (fontRecordAt.getBoldWeight() > 400) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.f32143d = z10;
            aVar.f32145f = (byte) fontRecordAt.getSuperSubScript();
            aVar.f32147h = fontRecordAt.isStruckout();
            aVar.f32146g = fontRecordAt.getUnderline();
            c(i14, aVar);
        }
        short numExFormats = (short) internalWorkbook.getNumExFormats();
        short s4 = 0;
        while (s4 < numExFormats) {
            ExtendedFormatRecord exFormatAt = internalWorkbook.getExFormatAt(s4);
            if (exFormatAt != null) {
                ii.e eVar = new ii.e();
                short formatIndex = exFormatAt.getFormatIndex();
                if (eVar.f18502a == null) {
                    eVar.f18502a = new ii.f();
                }
                eVar.f18502a.f18506a = formatIndex;
                String formatCode = HSSFDataFormat.getFormatCode(internalWorkbook, exFormatAt.getFormatIndex());
                if (eVar.f18502a == null) {
                    eVar.f18502a = new ii.f();
                }
                eVar.f18502a.f18507b = formatCode;
                eVar.f18503b = exFormatAt.getFontIndex();
                exFormatAt.isHidden();
                exFormatAt.isLocked();
                boolean wrapText = exFormatAt.getWrapText();
                eVar.a();
                eVar.c.c = wrapText;
                short alignment = exFormatAt.getAlignment();
                eVar.a();
                eVar.c.f18493a = alignment;
                short verticalAlignment = exFormatAt.getVerticalAlignment();
                eVar.a();
                eVar.c.f18494b = verticalAlignment;
                exFormatAt.getRotation();
                eVar.a();
                eVar.c.getClass();
                short indent = exFormatAt.getIndent();
                eVar.a();
                eVar.c.f18495d = indent;
                short borderLeft = exFormatAt.getBorderLeft();
                eVar.b();
                eVar.f18504d.f18499a.f18496a = borderLeft;
                short leftBorderPaletteIdx = exFormatAt.getLeftBorderPaletteIdx();
                leftBorderPaletteIdx = leftBorderPaletteIdx == 64 ? (short) 8 : leftBorderPaletteIdx;
                eVar.b();
                eVar.f18504d.f18499a.f18497b = leftBorderPaletteIdx;
                short borderRight = exFormatAt.getBorderRight();
                eVar.b();
                eVar.f18504d.c.f18496a = borderRight;
                short rightBorderPaletteIdx = exFormatAt.getRightBorderPaletteIdx();
                rightBorderPaletteIdx = rightBorderPaletteIdx == 64 ? (short) 8 : rightBorderPaletteIdx;
                eVar.b();
                eVar.f18504d.c.f18497b = rightBorderPaletteIdx;
                short borderTop = exFormatAt.getBorderTop();
                eVar.b();
                eVar.f18504d.f18500b.f18496a = borderTop;
                short topBorderPaletteIdx = exFormatAt.getTopBorderPaletteIdx();
                topBorderPaletteIdx = topBorderPaletteIdx == 64 ? (short) 8 : topBorderPaletteIdx;
                eVar.b();
                eVar.f18504d.f18500b.f18497b = topBorderPaletteIdx;
                short borderBottom = exFormatAt.getBorderBottom();
                eVar.b();
                eVar.f18504d.f18501d.f18496a = borderBottom;
                short bottomBorderPaletteIdx = exFormatAt.getBottomBorderPaletteIdx();
                bottomBorderPaletteIdx = bottomBorderPaletteIdx == 64 ? (short) 8 : bottomBorderPaletteIdx;
                eVar.b();
                eVar.f18504d.f18501d.f18497b = bottomBorderPaletteIdx;
                i(exFormatAt.getFillBackground());
                eVar.c();
                eVar.f18505e.getClass();
                short fillForeground = exFormatAt.getFillForeground();
                int i15 = i(fillForeground == 64 ? (short) 9 : fillForeground);
                eVar.c();
                eVar.f18505e.f16571d = i15;
                eVar.c();
                eVar.f18505e.c = (byte) (exFormatAt.getAdtlFillPattern() - 1);
                short s10 = (short) (s4 + 1);
                synchronized (this) {
                    this.f16628f.put(Integer.valueOf(s4), eVar);
                }
                s4 = s10;
            }
        }
        RecordStream recordStream = new RecordStream(createRecords, numRecords);
        int i16 = 0;
        while (recordStream.hasNext()) {
            InternalSheet createSheet = InternalSheet.createSheet(recordStream, sSReader);
            c cVar = new c(this, createSheet);
            cVar.f16612m = this.f16209m.getSheetName(i16);
            if (createSheet.isChartSheet()) {
                cVar.f16609j = (short) 1;
            }
            this.c.put(Integer.valueOf(i16), cVar);
            i16++;
        }
        createRecords.clear();
        this.f16210n = new ArrayList<>(3);
        for (int i17 = 0; i17 < this.f16209m.getNumNames(); i17++) {
            NameRecord nameRecord = this.f16209m.getNameRecord(i17);
            this.f16210n.add(new HSSFName(this, nameRecord, this.f16209m.getNameCommentRecord(nameRecord)));
        }
        this.f16624a = new d(this, this);
        Message message = new Message();
        message.what = 0;
        message.obj = 0;
        this.f16624a.handleMessage(message);
    }

    public static String v(DirectoryNode directoryNode) {
        String[] strArr = f16207q;
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            try {
                directoryNode.getEntry(str);
                return str;
            } catch (FileNotFoundException unused) {
            }
        }
        try {
            directoryNode.getEntry("Book");
            throw new OldExcelFormatException("The supplied spreadsheet seems to be Excel 5.0/7.0 (BIFF5) format. POI only supports BIFF8 format (from Excel versions 97/2000/XP/2003)");
        } catch (FileNotFoundException unused2) {
            throw new IllegalArgumentException("The supplied POIFSFileSystem does not contain a BIFF8 'Workbook' entry. Is it really an excel file?");
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.Workbook
    public final int getNumberOfSheets() {
        return this.c.size();
    }

    @Override // ei.d
    public final int r(ei.c cVar) {
        int i10 = 0;
        while (true) {
            HashMap hashMap = this.c;
            if (i10 < hashMap.size()) {
                if (hashMap.get(Integer.valueOf(i10)) == cVar) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final HSSFName t(int i10) {
        ArrayList<HSSFName> arrayList = this.f16210n;
        int size = arrayList.size();
        if (size >= 1) {
            if (i10 >= 0 && i10 <= size) {
                return arrayList.get(i10);
            }
            StringBuilder e10 = androidx.appcompat.view.menu.d.e("Specified name index ", i10, " is outside the allowable range (0..");
            e10.append(size - 1);
            e10.append(").");
            throw new IllegalArgumentException(e10.toString());
        }
        throw new IllegalStateException("There are no defined names in this workbook");
    }

    @Override // lib.zj.office.fc.ss.usermodel.Workbook
    /* renamed from: u */
    public final c getSheetAt(int i10) {
        if (i10 >= 0) {
            HashMap hashMap = this.c;
            if (i10 < hashMap.size()) {
                return (c) hashMap.get(Integer.valueOf(i10));
            }
            return null;
        }
        return null;
    }
}
