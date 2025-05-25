package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lib.zj.office.fc.hwpf.model.PropertyNode;
import lib.zj.office.fc.hwpf.model.io.HWPFFileSystem;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.hwpf.sprm.SprmIterator;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public class CHPBinTable {
    protected ArrayList<CHPX> _textRuns;

    public CHPBinTable() {
        this._textRuns = new ArrayList<>();
    }

    private static int binarySearch(List<CHPX> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int start = list.get(i12).getStart();
            if (start < i10) {
                i11 = i12 + 1;
            } else if (start > i10) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public void adjustForDelete(int i10, int i11, int i12) {
        int size = this._textRuns.size();
        int i13 = i11 + i12;
        CHPX chpx = this._textRuns.get(i10);
        int i14 = i10;
        while (chpx.getEnd() < i13) {
            i14++;
            chpx = this._textRuns.get(i14);
        }
        if (i10 == i14) {
            CHPX chpx2 = this._textRuns.get(i14);
            chpx2.setEnd((chpx2.getEnd() - i13) + i11);
        } else {
            this._textRuns.get(i10).setEnd(i11);
            while (true) {
                i10++;
                if (i10 >= i14) {
                    break;
                }
                CHPX chpx3 = this._textRuns.get(i10);
                chpx3.setStart(i11);
                chpx3.setEnd(i11);
            }
            CHPX chpx4 = this._textRuns.get(i14);
            chpx4.setEnd((chpx4.getEnd() - i13) + i11);
        }
        while (true) {
            i14++;
            if (i14 < size) {
                CHPX chpx5 = this._textRuns.get(i14);
                chpx5.setStart(chpx5.getStart() - i12);
                chpx5.setEnd(chpx5.getEnd() - i12);
            } else {
                return;
            }
        }
    }

    public void adjustForInsert(int i10, int i11) {
        int size = this._textRuns.size();
        CHPX chpx = this._textRuns.get(i10);
        chpx.setEnd(chpx.getEnd() + i11);
        while (true) {
            i10++;
            if (i10 < size) {
                CHPX chpx2 = this._textRuns.get(i10);
                chpx2.setStart(chpx2.getStart() + i11);
                chpx2.setEnd(chpx2.getEnd() + i11);
            } else {
                return;
            }
        }
    }

    public List<CHPX> getTextRuns() {
        return this._textRuns;
    }

    public void insert(int i10, int i11, SprmBuffer sprmBuffer) {
        CHPX chpx = new CHPX(0, 0, sprmBuffer);
        chpx.setStart(i11);
        chpx.setEnd(i11);
        if (i10 == this._textRuns.size()) {
            this._textRuns.add(chpx);
            return;
        }
        CHPX chpx2 = this._textRuns.get(i10);
        if (chpx2.getStart() < i11) {
            CHPX chpx3 = new CHPX(0, 0, chpx2.getSprmBuf());
            chpx3.setStart(i11);
            chpx3.setEnd(chpx2.getEnd());
            chpx2.setEnd(i11);
            this._textRuns.add(i10 + 1, chpx);
            this._textRuns.add(i10 + 2, chpx3);
            return;
        }
        this._textRuns.add(i10, chpx);
    }

    public void rebuild(ComplexFileTable complexFileTable) {
        short igrpprl;
        boolean z10;
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
                            if (it.next().getType() == 2) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        try {
                            this._textRuns.add(new CHPX(textPiece.getStart(), textPiece.getEnd(), (SprmBuffer) sprmBuffer.clone()));
                        } catch (CloneNotSupportedException e10) {
                            throw new Error(e10);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(this._textRuns);
        Collections.sort(arrayList, PropertyNode.StartComparator.instance);
        final IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<CHPX> it2 = this._textRuns.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            identityHashMap.put(it2.next(), Integer.valueOf(i10));
            i10++;
        }
        Comparator<CHPX> comparator = new Comparator<CHPX>() { // from class: lib.zj.office.fc.hwpf.model.CHPBinTable.1
            @Override // java.util.Comparator
            public int compare(CHPX chpx, CHPX chpx2) {
                return ((Integer) identityHashMap.get(chpx)).compareTo((Integer) identityHashMap.get(chpx2));
            }
        };
        HashSet hashSet = new HashSet();
        Iterator<CHPX> it3 = this._textRuns.iterator();
        while (it3.hasNext()) {
            CHPX next = it3.next();
            hashSet.add(Integer.valueOf(next.getStart()));
            hashSet.add(Integer.valueOf(next.getEnd()));
        }
        hashSet.remove(0);
        ArrayList arrayList2 = new ArrayList(hashSet);
        Collections.sort(arrayList2);
        LinkedList linkedList = new LinkedList();
        Iterator it4 = arrayList2.iterator();
        int i11 = 0;
        while (it4.hasNext()) {
            int intValue = ((Integer) it4.next()).intValue();
            int abs = Math.abs(binarySearch(arrayList, intValue));
            while (abs >= arrayList.size()) {
                abs--;
            }
            while (abs > 0 && ((CHPX) arrayList.get(abs)).getStart() >= intValue) {
                abs--;
            }
            LinkedList<CHPX> linkedList2 = new LinkedList();
            while (abs < arrayList.size()) {
                CHPX chpx = (CHPX) arrayList.get(abs);
                if (intValue < chpx.getStart()) {
                    break;
                }
                if (Math.max(i11, chpx.getStart()) < Math.min(intValue, chpx.getEnd())) {
                    linkedList2.add(chpx);
                }
                abs++;
            }
            if (linkedList2.size() == 0) {
                linkedList.add(new CHPX(i11, intValue, new SprmBuffer(0)));
            } else {
                if (linkedList2.size() == 1) {
                    CHPX chpx2 = (CHPX) linkedList2.get(0);
                    if (chpx2.getStart() == i11 && chpx2.getEnd() == intValue) {
                        linkedList.add(chpx2);
                    }
                }
                Collections.sort(linkedList2, comparator);
                SprmBuffer sprmBuffer2 = new SprmBuffer(0);
                for (CHPX chpx3 : linkedList2) {
                    sprmBuffer2.append(chpx3.getGrpprl(), 0);
                }
                linkedList.add(new CHPX(i11, intValue, sprmBuffer2));
            }
            i11 = intValue;
        }
        ArrayList<CHPX> arrayList3 = new ArrayList<>(linkedList);
        this._textRuns = arrayList3;
        Iterator<CHPX> it5 = arrayList3.iterator();
        CHPX chpx4 = null;
        while (it5.hasNext()) {
            CHPX next2 = it5.next();
            if (chpx4 != null && chpx4.getEnd() == next2.getStart() && Arrays.equals(chpx4.getGrpprl(), next2.getGrpprl())) {
                chpx4.setEnd(next2.getEnd());
                it5.remove();
            } else {
                chpx4 = next2;
            }
        }
    }

    @Deprecated
    public void writeTo(HWPFFileSystem hWPFFileSystem, int i10, CharIndexTranslator charIndexTranslator) {
        writeTo(hWPFFileSystem.getStream("WordDocument"), hWPFFileSystem.getStream("1Table"), i10, charIndexTranslator);
    }

    public CHPBinTable(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, TextPieceTable textPieceTable) {
        this(bArr, bArr2, i10, i11, textPieceTable);
    }

    public CHPBinTable(byte[] bArr, byte[] bArr2, int i10, int i11, CharIndexTranslator charIndexTranslator) {
        this._textRuns = new ArrayList<>();
        PlexOfCps plexOfCps = new PlexOfCps(bArr2, i10, i11, 4);
        int length = plexOfCps.length();
        for (int i12 = 0; i12 < length; i12++) {
            CHPFormattedDiskPage cHPFormattedDiskPage = new CHPFormattedDiskPage(bArr, LittleEndian.getInt(plexOfCps.getProperty(i12).getBytes()) * 512, charIndexTranslator);
            int size = cHPFormattedDiskPage.size();
            for (int i13 = 0; i13 < size; i13++) {
                CHPX chpx = cHPFormattedDiskPage.getCHPX(i13);
                if (chpx != null) {
                    this._textRuns.add(chpx);
                }
            }
        }
    }

    public void writeTo(HWPFOutputStream hWPFOutputStream, HWPFOutputStream hWPFOutputStream2, int i10, CharIndexTranslator charIndexTranslator) {
        PlexOfCps plexOfCps = new PlexOfCps(4);
        int offset = hWPFOutputStream.getOffset() % 512;
        if (offset != 0) {
            hWPFOutputStream.write(new byte[512 - offset]);
        }
        int offset2 = hWPFOutputStream.getOffset() / 512;
        ArrayList<CHPX> arrayList = this._textRuns;
        int byteIndex = charIndexTranslator.getByteIndex(arrayList.get(arrayList.size() - 1).getEnd());
        ArrayList<CHPX> arrayList2 = this._textRuns;
        while (true) {
            int byteIndex2 = charIndexTranslator.getByteIndex(arrayList2.get(0).getStart());
            CHPFormattedDiskPage cHPFormattedDiskPage = new CHPFormattedDiskPage();
            cHPFormattedDiskPage.fill(arrayList2);
            hWPFOutputStream.write(cHPFormattedDiskPage.toByteArray(charIndexTranslator));
            arrayList2 = cHPFormattedDiskPage.getOverflow();
            int byteIndex3 = arrayList2 != null ? charIndexTranslator.getByteIndex(arrayList2.get(0).getStart()) : byteIndex;
            byte[] bArr = new byte[4];
            int i11 = offset2 + 1;
            LittleEndian.putInt(bArr, offset2);
            plexOfCps.addProperty(new GenericPropertyNode(byteIndex2, byteIndex3, bArr));
            if (arrayList2 == null) {
                hWPFOutputStream2.write(plexOfCps.toByteArray());
                return;
            }
            offset2 = i11;
        }
    }
}
