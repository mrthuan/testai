package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public class TextPieceTable implements CharIndexTranslator {
    int _cpMin;
    protected ArrayList<TextPiece> _textPieces;
    protected ArrayList<TextPiece> _textPiecesFCOrder;

    /* loaded from: classes3.dex */
    public static class FCComparator implements Comparator<TextPiece> {
        private FCComparator() {
        }

        public /* synthetic */ FCComparator(int i10) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(TextPiece textPiece, TextPiece textPiece2) {
            if (textPiece.getPieceDescriptor().f20675fc > textPiece2.getPieceDescriptor().f20675fc) {
                return 1;
            }
            return textPiece.getPieceDescriptor().f20675fc < textPiece2.getPieceDescriptor().f20675fc ? -1 : 0;
        }
    }

    public TextPieceTable() {
        this._textPieces = new ArrayList<>();
        this._textPiecesFCOrder = new ArrayList<>();
    }

    public void add(TextPiece textPiece) {
        this._textPieces.add(textPiece);
        this._textPiecesFCOrder.add(textPiece);
        Collections.sort(this._textPieces);
        Collections.sort(this._textPiecesFCOrder, new FCComparator(0));
    }

    public int adjustForInsert(int i10, int i11) {
        int size = this._textPieces.size();
        TextPiece textPiece = this._textPieces.get(i10);
        textPiece.setEnd(textPiece.getEnd() + i11);
        while (true) {
            i10++;
            if (i10 < size) {
                TextPiece textPiece2 = this._textPieces.get(i10);
                textPiece2.setStart(textPiece2.getStart() + i11);
                textPiece2.setEnd(textPiece2.getEnd() + i11);
            } else {
                return i11;
            }
        }
    }

    public boolean equals(Object obj) {
        TextPieceTable textPieceTable = (TextPieceTable) obj;
        int size = textPieceTable._textPieces.size();
        if (size != this._textPieces.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!textPieceTable._textPieces.get(i10).equals(this._textPieces.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // lib.zj.office.fc.hwpf.model.CharIndexTranslator
    public int getByteIndex(int i10) {
        Iterator<TextPiece> it = this._textPieces.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            TextPiece next = it.next();
            int i12 = 2;
            if (i10 >= next.getEnd()) {
                int filePosition = next.getPieceDescriptor().getFilePosition();
                int end = next.getEnd() - next.getStart();
                if (!next.isUnicode()) {
                    i12 = 1;
                }
                i11 = filePosition + (end * i12);
                if (i10 == next.getEnd()) {
                    return i11;
                }
            } else if (i10 < next.getEnd()) {
                int start = i10 - next.getStart();
                int filePosition2 = next.getPieceDescriptor().getFilePosition();
                if (!next.isUnicode()) {
                    i12 = 1;
                }
                return (start * i12) + filePosition2;
            }
        }
        return i11;
    }

    @Override // lib.zj.office.fc.hwpf.model.CharIndexTranslator
    public int getCharIndex(int i10) {
        return getCharIndex(i10, 0);
    }

    public int getCpMin() {
        return this._cpMin;
    }

    public StringBuilder getText() {
        System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        Iterator<TextPiece> it = this._textPieces.iterator();
        while (it.hasNext()) {
            TextPiece next = it.next();
            String sb3 = next.getStringBuilder().toString();
            int length = sb3.length();
            next.getEnd();
            next.getStart();
            sb2.replace(next.getStart(), next.getStart() + length, sb3);
        }
        return sb2;
    }

    public List<TextPiece> getTextPieces() {
        return this._textPieces;
    }

    public int hashCode() {
        return this._textPieces.size();
    }

    @Override // lib.zj.office.fc.hwpf.model.CharIndexTranslator
    public boolean isIndexInTable(int i10) {
        Iterator<TextPiece> it = this._textPiecesFCOrder.iterator();
        while (it.hasNext()) {
            TextPiece next = it.next();
            int filePosition = next.getPieceDescriptor().getFilePosition();
            if (i10 <= next.bytesLength() + filePosition) {
                return filePosition <= i10;
            }
        }
        return false;
    }

    @Override // lib.zj.office.fc.hwpf.model.CharIndexTranslator
    public int lookIndexBackward(int i10) {
        Iterator<TextPiece> it = this._textPiecesFCOrder.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            TextPiece next = it.next();
            int filePosition = next.getPieceDescriptor().getFilePosition();
            if (i10 > next.bytesLength() + filePosition) {
                i11 = next.bytesLength() + filePosition;
            } else if (filePosition > i10) {
                return i11;
            } else {
                return i10;
            }
        }
        return i10;
    }

    @Override // lib.zj.office.fc.hwpf.model.CharIndexTranslator
    public int lookIndexForward(int i10) {
        Iterator<TextPiece> it = this._textPiecesFCOrder.iterator();
        while (it.hasNext()) {
            TextPiece next = it.next();
            int filePosition = next.getPieceDescriptor().getFilePosition();
            if (i10 < next.bytesLength() + filePosition) {
                if (filePosition > i10) {
                    return filePosition;
                }
                return i10;
            }
        }
        return i10;
    }

    public byte[] writeTo(HWPFOutputStream hWPFOutputStream) {
        PlexOfCps plexOfCps = new PlexOfCps(PieceDescriptor.getSizeInBytes());
        int size = this._textPieces.size();
        for (int i10 = 0; i10 < size; i10++) {
            TextPiece textPiece = this._textPieces.get(i10);
            PieceDescriptor pieceDescriptor = textPiece.getPieceDescriptor();
            int offset = hWPFOutputStream.getOffset() % 512;
            if (offset != 0) {
                hWPFOutputStream.write(new byte[512 - offset]);
            }
            pieceDescriptor.setFilePosition(hWPFOutputStream.getOffset());
            hWPFOutputStream.write(textPiece.getRawBytes());
            plexOfCps.addProperty(new GenericPropertyNode(textPiece.getStart(), textPiece.getEnd(), pieceDescriptor.toByteArray()));
        }
        return plexOfCps.toByteArray();
    }

    @Override // lib.zj.office.fc.hwpf.model.CharIndexTranslator
    public int getCharIndex(int i10, int i11) {
        int lookIndexForward = lookIndexForward(i10);
        Iterator<TextPiece> it = this._textPieces.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            TextPiece next = it.next();
            int filePosition = next.getPieceDescriptor().getFilePosition();
            int bytesLength = next.bytesLength();
            int i13 = filePosition + bytesLength;
            if (lookIndexForward >= filePosition && lookIndexForward <= i13) {
                bytesLength = (lookIndexForward <= filePosition || lookIndexForward >= i13) ? bytesLength - (i13 - lookIndexForward) : lookIndexForward - filePosition;
            }
            i12 = next.isUnicode() ? (bytesLength / 2) + i12 : i12 + bytesLength;
            if (lookIndexForward >= filePosition && lookIndexForward <= i13 && i12 >= i11) {
                break;
            }
        }
        return i12;
    }

    public TextPieceTable(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        this._textPieces = new ArrayList<>();
        this._textPiecesFCOrder = new ArrayList<>();
        PlexOfCps plexOfCps = new PlexOfCps(bArr2, i10, i11, PieceDescriptor.getSizeInBytes());
        int length = plexOfCps.length();
        PieceDescriptor[] pieceDescriptorArr = new PieceDescriptor[length];
        for (int i13 = 0; i13 < length; i13++) {
            pieceDescriptorArr[i13] = new PieceDescriptor(plexOfCps.getProperty(i13).getBytes(), 0);
        }
        this._cpMin = pieceDescriptorArr[0].getFilePosition() - i12;
        for (int i14 = 0; i14 < length; i14++) {
            int filePosition = pieceDescriptorArr[i14].getFilePosition() - i12;
            if (filePosition < this._cpMin) {
                this._cpMin = filePosition;
            }
        }
        for (int i15 = 0; i15 < length; i15++) {
            int filePosition2 = pieceDescriptorArr[i15].getFilePosition();
            GenericPropertyNode property = plexOfCps.getProperty(i15);
            int start = property.getStart();
            int end = property.getEnd();
            this._textPieces.add(new TextPiece(start, end, bArr, filePosition2, (end - start) * (pieceDescriptorArr[i15].isUnicode() ? 2 : 1), pieceDescriptorArr[i15]));
        }
        Collections.sort(this._textPieces);
        ArrayList<TextPiece> arrayList = new ArrayList<>(this._textPieces);
        this._textPiecesFCOrder = arrayList;
        Collections.sort(arrayList, new FCComparator(0));
    }

    public boolean isIndexInTable(int i10, int i11) {
        Iterator<TextPiece> it = this._textPiecesFCOrder.iterator();
        while (it.hasNext()) {
            TextPiece next = it.next();
            int filePosition = next.getPieceDescriptor().getFilePosition();
            if (i10 < next.bytesLength() + filePosition) {
                return Math.max(i10, filePosition) < Math.min(i11, next.bytesLength() + filePosition);
            }
        }
        return false;
    }
}
