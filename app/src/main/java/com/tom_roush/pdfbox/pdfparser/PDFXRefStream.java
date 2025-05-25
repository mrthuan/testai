package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdfwriter.COSWriterXRefEntry;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class PDFXRefStream implements PDFXRef {
    private static final int ENTRY_FREE = 0;
    private static final int ENTRY_NORMAL = 1;
    private static final int ENTRY_OBJSTREAM = 2;
    private final Set<Long> objectNumbers;
    private long size;
    private final COSStream stream;
    private final Map<Long, Object> streamData;

    /* loaded from: classes2.dex */
    public static class FreeReference {
        long nextFree;
        int nextGenNumber;
    }

    /* loaded from: classes2.dex */
    public static class NormalReference {
        int genNumber;
        long offset;
    }

    /* loaded from: classes2.dex */
    public static class ObjectStreamReference {
        long objectNumberOfObjectStream;
        long offset;
    }

    @Deprecated
    public PDFXRefStream() {
        this.size = -1L;
        this.stream = new COSStream();
        this.streamData = new TreeMap();
        this.objectNumbers = new TreeSet();
    }

    private List<Long> getIndexEntry() {
        LinkedList linkedList = new LinkedList();
        TreeSet treeSet = new TreeSet();
        treeSet.add(0L);
        treeSet.addAll(this.objectNumbers);
        Iterator it = treeSet.iterator();
        Long l10 = null;
        Long l11 = null;
        while (it.hasNext()) {
            Long l12 = (Long) it.next();
            if (l10 == null) {
                l11 = 1L;
                l10 = l12;
            }
            if (l11.longValue() + l10.longValue() == l12.longValue()) {
                l11 = Long.valueOf(l11.longValue() + 1);
            }
            if (l11.longValue() + l10.longValue() < l12.longValue()) {
                linkedList.add(l10);
                linkedList.add(l11);
                l11 = 1L;
                l10 = l12;
            }
        }
        linkedList.add(l10);
        linkedList.add(l11);
        return linkedList;
    }

    private int[] getWEntry() {
        long[] jArr = new long[3];
        Iterator<Object> it = this.streamData.values().iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (next instanceof FreeReference) {
                    FreeReference freeReference = (FreeReference) next;
                    jArr[0] = Math.max(jArr[0], 0L);
                    jArr[1] = Math.max(jArr[1], freeReference.nextFree);
                    jArr[2] = Math.max(jArr[2], freeReference.nextGenNumber);
                } else if (next instanceof NormalReference) {
                    NormalReference normalReference = (NormalReference) next;
                    jArr[0] = Math.max(jArr[0], 1L);
                    jArr[1] = Math.max(jArr[1], normalReference.offset);
                    jArr[2] = Math.max(jArr[2], normalReference.genNumber);
                } else if (next instanceof ObjectStreamReference) {
                    ObjectStreamReference objectStreamReference = (ObjectStreamReference) next;
                    jArr[0] = Math.max(jArr[0], 2L);
                    jArr[1] = Math.max(jArr[1], objectStreamReference.offset);
                    jArr[2] = Math.max(jArr[2], objectStreamReference.objectNumberOfObjectStream);
                } else {
                    throw new RuntimeException("unexpected reference type");
                }
            } else {
                int[] iArr = new int[3];
                for (int i10 = 0; i10 < 3; i10++) {
                    while (true) {
                        long j10 = jArr[i10];
                        if (j10 > 0) {
                            iArr[i10] = iArr[i10] + 1;
                            jArr[i10] = j10 >> 8;
                        }
                    }
                }
                return iArr;
            }
        }
    }

    private void writeNumber(OutputStream outputStream, long j10, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (255 & j10);
            j10 >>= 8;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            outputStream.write(bArr[(i10 - i12) - 1]);
        }
    }

    private void writeStreamData(OutputStream outputStream, int[] iArr) {
        writeNumber(outputStream, 0L, iArr[0]);
        writeNumber(outputStream, 0L, iArr[1]);
        writeNumber(outputStream, 65535L, iArr[2]);
        for (Object obj : this.streamData.values()) {
            if (obj instanceof FreeReference) {
                FreeReference freeReference = (FreeReference) obj;
                writeNumber(outputStream, 0L, iArr[0]);
                writeNumber(outputStream, freeReference.nextFree, iArr[1]);
                writeNumber(outputStream, freeReference.nextGenNumber, iArr[2]);
            } else if (obj instanceof NormalReference) {
                NormalReference normalReference = (NormalReference) obj;
                writeNumber(outputStream, 1L, iArr[0]);
                writeNumber(outputStream, normalReference.offset, iArr[1]);
                writeNumber(outputStream, normalReference.genNumber, iArr[2]);
            } else if (obj instanceof ObjectStreamReference) {
                ObjectStreamReference objectStreamReference = (ObjectStreamReference) obj;
                writeNumber(outputStream, 2L, iArr[0]);
                writeNumber(outputStream, objectStreamReference.offset, iArr[1]);
                writeNumber(outputStream, objectStreamReference.objectNumberOfObjectStream, iArr[2]);
            } else {
                throw new RuntimeException("unexpected reference type");
            }
        }
    }

    public void addEntry(COSWriterXRefEntry cOSWriterXRefEntry) {
        this.objectNumbers.add(Long.valueOf(cOSWriterXRefEntry.getKey().getNumber()));
        if (cOSWriterXRefEntry.isFree()) {
            FreeReference freeReference = new FreeReference();
            freeReference.nextGenNumber = cOSWriterXRefEntry.getKey().getGeneration();
            long number = cOSWriterXRefEntry.getKey().getNumber();
            freeReference.nextFree = number;
            this.streamData.put(Long.valueOf(number), freeReference);
            return;
        }
        NormalReference normalReference = new NormalReference();
        normalReference.genNumber = cOSWriterXRefEntry.getKey().getGeneration();
        normalReference.offset = cOSWriterXRefEntry.getOffset();
        this.streamData.put(Long.valueOf(cOSWriterXRefEntry.getKey().getNumber()), normalReference);
    }

    public void addTrailerInfo(COSDictionary cOSDictionary) {
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            COSName key = entry.getKey();
            if (COSName.INFO.equals(key) || COSName.ROOT.equals(key) || COSName.ENCRYPT.equals(key) || COSName.ID.equals(key) || COSName.PREV.equals(key)) {
                this.stream.setItem(key, entry.getValue());
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdfparser.PDFXRef
    public COSObject getObject(int i10) {
        return null;
    }

    public COSStream getStream() {
        this.stream.setItem(COSName.TYPE, (COSBase) COSName.XREF);
        long j10 = this.size;
        if (j10 != -1) {
            this.stream.setLong(COSName.SIZE, j10);
            List<Long> indexEntry = getIndexEntry();
            COSArray cOSArray = new COSArray();
            for (Long l10 : indexEntry) {
                cOSArray.add((COSBase) COSInteger.get(l10.longValue()));
            }
            this.stream.setItem(COSName.INDEX, (COSBase) cOSArray);
            int[] wEntry = getWEntry();
            COSArray cOSArray2 = new COSArray();
            for (int i10 : wEntry) {
                cOSArray2.add((COSBase) COSInteger.get(i10));
            }
            this.stream.setItem(COSName.W, (COSBase) cOSArray2);
            OutputStream createOutputStream = this.stream.createOutputStream(COSName.FLATE_DECODE);
            writeStreamData(createOutputStream, wEntry);
            createOutputStream.flush();
            createOutputStream.close();
            for (COSName cOSName : this.stream.keySet()) {
                if (!COSName.ROOT.equals(cOSName) && !COSName.INFO.equals(cOSName) && !COSName.PREV.equals(cOSName) && !COSName.ENCRYPT.equals(cOSName)) {
                    this.stream.getDictionaryObject(cOSName).setDirect(true);
                }
            }
            return this.stream;
        }
        throw new IllegalArgumentException("size is not set in xrefstream");
    }

    public void setSize(long j10) {
        this.size = j10;
    }

    public PDFXRefStream(COSDocument cOSDocument) {
        this.size = -1L;
        this.stream = cOSDocument.createCOSStream();
        this.streamData = new TreeMap();
        this.objectNumbers = new TreeSet();
    }
}
