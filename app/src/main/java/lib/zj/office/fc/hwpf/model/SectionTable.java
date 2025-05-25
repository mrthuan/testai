package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.model.PropertyNode;
import lib.zj.office.fc.hwpf.model.io.HWPFFileSystem;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

@Internal
/* loaded from: classes3.dex */
public class SectionTable {
    private static final int SED_SIZE = 12;
    private static final POILogger _logger = POILogFactory.getLogger(SectionTable.class);
    protected ArrayList<SEPX> _sections = new ArrayList<>();
    protected List<TextPiece> _text;
    private TextPieceTable tpt;

    public SectionTable() {
    }

    public void adjustForInsert(int i10, int i11) {
        int size = this._sections.size();
        SEPX sepx = this._sections.get(i10);
        sepx.setEnd(sepx.getEnd() + i11);
        while (true) {
            i10++;
            if (i10 < size) {
                SEPX sepx2 = this._sections.get(i10);
                sepx2.setStart(sepx2.getStart() + i11);
                sepx2.setEnd(sepx2.getEnd() + i11);
            } else {
                return;
            }
        }
    }

    public ArrayList<SEPX> getSections() {
        return this._sections;
    }

    @Deprecated
    public void writeTo(HWPFFileSystem hWPFFileSystem, int i10) {
        writeTo(hWPFFileSystem.getStream("WordDocument"), hWPFFileSystem.getStream("1Table"));
    }

    public SectionTable(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, TextPieceTable textPieceTable, CPSplitCalculator cPSplitCalculator) {
        PlexOfCps plexOfCps = new PlexOfCps(bArr2, i10, i11, 12);
        this.tpt = textPieceTable;
        this._text = textPieceTable.getTextPieces();
        int length = plexOfCps.length();
        for (int i13 = 0; i13 < length; i13++) {
            GenericPropertyNode property = plexOfCps.getProperty(i13);
            SectionDescriptor sectionDescriptor = new SectionDescriptor(property.getBytes(), 0);
            int fc2 = sectionDescriptor.getFc();
            int start = property.getStart();
            int end = property.getEnd();
            if (fc2 == -1) {
                this._sections.add(new SEPX(sectionDescriptor, start, end, new byte[0]));
            } else {
                int i14 = LittleEndian.getShort(bArr, fc2);
                byte[] bArr3 = new byte[i14];
                System.arraycopy(bArr, fc2 + 2, bArr3, 0, i14);
                this._sections.add(new SEPX(sectionDescriptor, start, end, bArr3));
            }
        }
        int mainDocumentEnd = cPSplitCalculator.getMainDocumentEnd();
        boolean z10 = false;
        boolean z11 = false;
        for (int i15 = 0; i15 < this._sections.size(); i15++) {
            SEPX sepx = this._sections.get(i15);
            if (sepx.getEnd() == mainDocumentEnd) {
                z10 = true;
            } else if (sepx.getEnd() == mainDocumentEnd || sepx.getEnd() == mainDocumentEnd - 1) {
                z11 = true;
            }
        }
        if (!z10 && z11) {
            _logger.log(POILogger.WARN, "Your document seemed to be mostly unicode, but the section definition was in bytes! Trying anyway, but things may well go wrong!");
            for (int i16 = 0; i16 < this._sections.size(); i16++) {
                SEPX sepx2 = this._sections.get(i16);
                GenericPropertyNode property2 = plexOfCps.getProperty(i16);
                int start2 = property2.getStart();
                int end2 = property2.getEnd();
                sepx2.setStart(start2);
                sepx2.setEnd(end2);
            }
        }
        Collections.sort(this._sections, PropertyNode.StartComparator.instance);
    }

    public void writeTo(HWPFOutputStream hWPFOutputStream, HWPFOutputStream hWPFOutputStream2) {
        int offset = hWPFOutputStream.getOffset();
        int size = this._sections.size();
        PlexOfCps plexOfCps = new PlexOfCps(12);
        for (int i10 = 0; i10 < size; i10++) {
            SEPX sepx = this._sections.get(i10);
            byte[] grpprl = sepx.getGrpprl();
            byte[] bArr = new byte[2];
            LittleEndian.putShort(bArr, (short) grpprl.length);
            hWPFOutputStream.write(bArr);
            hWPFOutputStream.write(grpprl);
            SectionDescriptor sectionDescriptor = sepx.getSectionDescriptor();
            sectionDescriptor.setFc(offset);
            plexOfCps.addProperty(new GenericPropertyNode(sepx.getStart(), sepx.getEnd(), sectionDescriptor.toByteArray()));
            offset = hWPFOutputStream.getOffset();
        }
        hWPFOutputStream2.write(plexOfCps.toByteArray());
    }
}
