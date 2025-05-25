package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import lib.zj.office.fc.hwpf.model.PropertyNode;
import lib.zj.office.fc.hwpf.model.io.HWPFFileSystem;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.hwpf.sprm.SprmIterator;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public class PAPBinTable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected ArrayList<PAPX> _paragraphs;

    public PAPBinTable() {
        this._paragraphs = new ArrayList<>();
    }

    public void adjustForDelete(int i10, int i11, int i12) {
        int size = this._paragraphs.size();
        int i13 = i11 + i12;
        PAPX papx = this._paragraphs.get(i10);
        int i14 = i10;
        while (papx.getEnd() < i13) {
            i14++;
            papx = this._paragraphs.get(i14);
        }
        if (i10 == i14) {
            PAPX papx2 = this._paragraphs.get(i14);
            papx2.setEnd((papx2.getEnd() - i13) + i11);
        } else {
            this._paragraphs.get(i10).setEnd(i11);
            while (true) {
                i10++;
                if (i10 >= i14) {
                    break;
                }
                PAPX papx3 = this._paragraphs.get(i10);
                papx3.setStart(i11);
                papx3.setEnd(i11);
            }
            PAPX papx4 = this._paragraphs.get(i14);
            papx4.setEnd((papx4.getEnd() - i13) + i11);
        }
        while (true) {
            i14++;
            if (i14 < size) {
                PAPX papx5 = this._paragraphs.get(i14);
                papx5.setStart(papx5.getStart() - i12);
                papx5.setEnd(papx5.getEnd() - i12);
            } else {
                return;
            }
        }
    }

    public void adjustForInsert(int i10, int i11) {
        int size = this._paragraphs.size();
        PAPX papx = this._paragraphs.get(i10);
        papx.setEnd(papx.getEnd() + i11);
        while (true) {
            i10++;
            if (i10 < size) {
                PAPX papx2 = this._paragraphs.get(i10);
                papx2.setStart(papx2.getStart() + i11);
                papx2.setEnd(papx2.getEnd() + i11);
            } else {
                return;
            }
        }
    }

    public ArrayList<PAPX> getParagraphs() {
        return this._paragraphs;
    }

    public void insert(int i10, int i11, SprmBuffer sprmBuffer) {
        SprmBuffer sprmBuffer2;
        PAPX papx = new PAPX(0, 0, sprmBuffer);
        papx.setStart(i11);
        papx.setEnd(i11);
        if (i10 == this._paragraphs.size()) {
            this._paragraphs.add(papx);
            return;
        }
        PAPX papx2 = this._paragraphs.get(i10);
        if (papx2 != null && papx2.getStart() < i11) {
            try {
                sprmBuffer2 = (SprmBuffer) papx2.getSprmBuf().clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                sprmBuffer2 = null;
            }
            PAPX papx3 = new PAPX(0, 0, sprmBuffer2);
            papx3.setStart(i11);
            papx3.setEnd(papx2.getEnd());
            papx2.setEnd(i11);
            this._paragraphs.add(i10 + 1, papx);
            this._paragraphs.add(i10 + 2, papx3);
            return;
        }
        this._paragraphs.add(i10, papx);
    }

    public void rebuild(StringBuilder sb2, ComplexFileTable complexFileTable) {
        boolean z10;
        short igrpprl;
        boolean z11;
        System.currentTimeMillis();
        if (complexFileTable != null) {
            SprmBuffer[] grpprls = complexFileTable.getGrpprls();
            for (TextPiece textPiece : complexFileTable.getTextPieceTable().getTextPieces()) {
                PropertyModifier prm = textPiece.getPieceDescriptor().getPrm();
                if (prm.isComplex() && (igrpprl = prm.getIgrpprl()) >= 0 && igrpprl < grpprls.length) {
                    SprmBuffer sprmBuffer = grpprls[igrpprl];
                    SprmIterator it = sprmBuffer.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getType() == 1) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        SprmBuffer sprmBuffer2 = new SprmBuffer(2);
                        sprmBuffer2.append(sprmBuffer.toByteArray());
                        this._paragraphs.add(new PAPX(textPiece.getStart(), textPiece.getEnd(), sprmBuffer2));
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(this._paragraphs);
        Collections.sort(arrayList, PropertyNode.EndComparator.instance);
        System.currentTimeMillis();
        final IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<PAPX> it2 = this._paragraphs.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            identityHashMap.put(it2.next(), Integer.valueOf(i10));
            i10++;
        }
        Comparator<PAPX> comparator = new Comparator<PAPX>() { // from class: lib.zj.office.fc.hwpf.model.PAPBinTable.1
            @Override // java.util.Comparator
            public int compare(PAPX papx, PAPX papx2) {
                return ((Integer) identityHashMap.get(papx)).compareTo((Integer) identityHashMap.get(papx2));
            }
        };
        System.currentTimeMillis();
        LinkedList linkedList = new LinkedList();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < sb2.length(); i13++) {
            char charAt = sb2.charAt(i13);
            if (charAt == '\r' || charAt == 7 || charAt == '\f') {
                int i14 = i13 + 1;
                LinkedList<PAPX> linkedList2 = new LinkedList();
                int i15 = i12;
                while (true) {
                    if (i15 < arrayList.size()) {
                        PAPX papx = (PAPX) arrayList.get(i15);
                        if (papx.getEnd() - 1 > i13) {
                            i12 = i15;
                            z10 = true;
                            break;
                        }
                        linkedList2.add(papx);
                        i15++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    i12 = arrayList.size() - 1;
                }
                if (linkedList2.size() == 0) {
                    linkedList.add(new PAPX(i11, i14, new SprmBuffer(2)));
                } else {
                    if (linkedList2.size() == 1) {
                        PAPX papx2 = (PAPX) linkedList2.get(0);
                        if (papx2.getStart() == i11 && papx2.getEnd() == i14) {
                            linkedList.add(papx2);
                        }
                    }
                    Collections.sort(linkedList2, comparator);
                    SprmBuffer sprmBuffer3 = null;
                    for (PAPX papx3 : linkedList2) {
                        if (sprmBuffer3 == null) {
                            try {
                                sprmBuffer3 = (SprmBuffer) papx3.getSprmBuf().clone();
                            } catch (CloneNotSupportedException e10) {
                                throw new Error(e10);
                            }
                        } else {
                            sprmBuffer3.append(papx3.getGrpprl(), 2);
                        }
                    }
                    linkedList.add(new PAPX(i11, i14, sprmBuffer3));
                }
                i11 = i14;
            }
        }
        this._paragraphs = new ArrayList<>(linkedList);
        System.currentTimeMillis();
    }

    @Deprecated
    public void writeTo(HWPFFileSystem hWPFFileSystem, CharIndexTranslator charIndexTranslator) {
        writeTo(hWPFFileSystem.getStream("WordDocument"), hWPFFileSystem.getStream("1Table"), charIndexTranslator);
    }

    public PAPBinTable(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, TextPieceTable textPieceTable) {
        this(bArr, bArr2, bArr3, i10, i11, textPieceTable);
    }

    public PAPBinTable(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, CharIndexTranslator charIndexTranslator) {
        this._paragraphs = new ArrayList<>();
        System.currentTimeMillis();
        PlexOfCps plexOfCps = new PlexOfCps(bArr2, i10, i11, 4);
        int length = plexOfCps.length();
        for (int i12 = 0; i12 < length; i12++) {
            PAPFormattedDiskPage pAPFormattedDiskPage = new PAPFormattedDiskPage(bArr, bArr3, LittleEndian.getInt(plexOfCps.getProperty(i12).getBytes()) * 512, charIndexTranslator);
            int size = pAPFormattedDiskPage.size();
            for (int i13 = 0; i13 < size; i13++) {
                PAPX papx = pAPFormattedDiskPage.getPAPX(i13);
                if (papx != null) {
                    this._paragraphs.add(papx);
                }
            }
        }
    }

    public void writeTo(HWPFOutputStream hWPFOutputStream, HWPFOutputStream hWPFOutputStream2, CharIndexTranslator charIndexTranslator) {
        PlexOfCps plexOfCps = new PlexOfCps(4);
        int offset = hWPFOutputStream.getOffset() % 512;
        if (offset != 0) {
            hWPFOutputStream.write(new byte[512 - offset]);
        }
        int offset2 = hWPFOutputStream.getOffset() / 512;
        ArrayList<PAPX> arrayList = this._paragraphs;
        int byteIndex = charIndexTranslator.getByteIndex(arrayList.get(arrayList.size() - 1).getEnd());
        ArrayList<PAPX> arrayList2 = this._paragraphs;
        while (true) {
            int byteIndex2 = charIndexTranslator.getByteIndex(arrayList2.get(0).getStart());
            PAPFormattedDiskPage pAPFormattedDiskPage = new PAPFormattedDiskPage();
            pAPFormattedDiskPage.fill(arrayList2);
            hWPFOutputStream.write(pAPFormattedDiskPage.toByteArray(hWPFOutputStream2, charIndexTranslator));
            arrayList2 = pAPFormattedDiskPage.getOverflow();
            int byteIndex3 = arrayList2 != null ? charIndexTranslator.getByteIndex(arrayList2.get(0).getStart()) : byteIndex;
            byte[] bArr = new byte[4];
            int i10 = offset2 + 1;
            LittleEndian.putInt(bArr, offset2);
            plexOfCps.addProperty(new GenericPropertyNode(byteIndex2, byteIndex3, bArr));
            if (arrayList2 == null) {
                hWPFOutputStream2.write(plexOfCps.toByteArray());
                return;
            }
            offset2 = i10;
        }
    }
}
