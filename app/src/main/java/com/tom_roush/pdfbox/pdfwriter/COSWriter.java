package com.tom_roush.pdfbox.pdfwriter;

import androidx.activity.r;
import b.a;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.cos.COSUpdateInfo;
import com.tom_roush.pdfbox.cos.ICOSVisitor;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.io.RandomAccessInputStream;
import com.tom_roush.pdfbox.io.RandomAccessRead;
import com.tom_roush.pdfbox.pdfparser.PDFXRefStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFDocument;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.SignatureInterface;
import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Hex;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes2.dex */
public class COSWriter implements ICOSVisitor, Closeable {
    public static final byte[] ARRAY_CLOSE;
    public static final byte[] ARRAY_OPEN;
    public static final byte[] COMMENT;
    public static final byte[] DICT_CLOSE;
    public static final byte[] DICT_OPEN;
    public static final byte[] ENDOBJ;
    public static final byte[] ENDSTREAM;
    public static final byte[] EOF;
    public static final byte[] GARBAGE;
    public static final byte[] OBJ;
    public static final byte[] REFERENCE;
    public static final byte[] SPACE;
    public static final byte[] STARTXREF;
    public static final byte[] STREAM;
    public static final byte[] TRAILER;
    public static final byte[] VERSION;
    public static final byte[] XREF;
    public static final byte[] XREF_FREE;
    public static final byte[] XREF_USED;
    private final Set<COSBase> actualsAdded;
    private COSArray byteRangeArray;
    private long byteRangeLength;
    private long byteRangeOffset;
    private COSObjectKey currentObjectKey;
    private FDFDocument fdfDocument;
    private final NumberFormat formatXrefGeneration;
    private final NumberFormat formatXrefOffset;
    private byte[] incrementPart;
    private RandomAccessRead incrementalInput;
    private OutputStream incrementalOutput;
    private boolean incrementalUpdate;
    private final Map<COSObjectKey, COSBase> keyObject;
    private long number;
    private final Map<COSBase, COSObjectKey> objectKeys;
    private final Deque<COSBase> objectsToWrite;
    private final Set<COSBase> objectsToWriteSet;
    private OutputStream output;
    private PDDocument pdDocument;
    private boolean reachedSignature;
    private SignatureInterface signatureInterface;
    private long signatureLength;
    private long signatureOffset;
    private COSStandardOutputStream standardOutput;
    private long startxref;
    private boolean willEncrypt;
    private final Set<COSBase> writtenObjects;
    private final List<COSWriterXRefEntry> xRefEntries;

    static {
        Charset charset = Charsets.US_ASCII;
        DICT_OPEN = "<<".getBytes(charset);
        DICT_CLOSE = ">>".getBytes(charset);
        SPACE = new byte[]{32};
        COMMENT = new byte[]{Field.PAGEREF};
        VERSION = "PDF-1.4".getBytes(charset);
        GARBAGE = new byte[]{-10, -28, -4, -33};
        EOF = "%%EOF".getBytes(charset);
        REFERENCE = "R".getBytes(charset);
        XREF = "xref".getBytes(charset);
        XREF_FREE = "f".getBytes(charset);
        XREF_USED = "n".getBytes(charset);
        TRAILER = "trailer".getBytes(charset);
        STARTXREF = "startxref".getBytes(charset);
        OBJ = "obj".getBytes(charset);
        ENDOBJ = "endobj".getBytes(charset);
        ARRAY_OPEN = "[".getBytes(charset);
        ARRAY_CLOSE = "]".getBytes(charset);
        STREAM = "stream".getBytes(charset);
        ENDSTREAM = "endstream".getBytes(charset);
    }

    public COSWriter(OutputStream outputStream) {
        Locale locale = Locale.US;
        this.formatXrefOffset = new DecimalFormat("0000000000", DecimalFormatSymbols.getInstance(locale));
        this.formatXrefGeneration = new DecimalFormat("00000", DecimalFormatSymbols.getInstance(locale));
        this.startxref = 0L;
        this.number = 0L;
        this.objectKeys = new Hashtable();
        this.keyObject = new HashMap();
        this.xRefEntries = new ArrayList();
        this.objectsToWriteSet = new HashSet();
        this.objectsToWrite = new LinkedList();
        this.writtenObjects = new HashSet();
        this.actualsAdded = new HashSet();
        this.currentObjectKey = null;
        this.pdDocument = null;
        this.fdfDocument = null;
        this.willEncrypt = false;
        this.incrementalUpdate = false;
        this.reachedSignature = false;
        setOutput(outputStream);
        setStandardOutput(new COSStandardOutputStream(this.output));
    }

    private void addObjectToWrite(COSBase cOSBase) {
        COSBase cOSBase2;
        COSObjectKey cOSObjectKey;
        if (cOSBase instanceof COSObject) {
            cOSBase2 = ((COSObject) cOSBase).getObject();
        } else {
            cOSBase2 = cOSBase;
        }
        if (!this.writtenObjects.contains(cOSBase) && !this.objectsToWriteSet.contains(cOSBase) && !this.actualsAdded.contains(cOSBase2)) {
            COSBase cOSBase3 = null;
            if (cOSBase2 != null) {
                cOSObjectKey = this.objectKeys.get(cOSBase2);
            } else {
                cOSObjectKey = null;
            }
            if (cOSObjectKey != null) {
                cOSBase3 = this.keyObject.get(cOSObjectKey);
            }
            if (cOSBase2 != null && this.objectKeys.containsKey(cOSBase2) && !isNeedToBeUpdated(cOSBase) && !isNeedToBeUpdated(cOSBase3)) {
                return;
            }
            this.objectsToWrite.add(cOSBase);
            this.objectsToWriteSet.add(cOSBase);
            if (cOSBase2 != null) {
                this.actualsAdded.add(cOSBase2);
            }
        }
    }

    private void doWriteIncrement() {
        IOUtils.copy(new RandomAccessInputStream(this.incrementalInput), this.incrementalOutput);
        this.incrementalOutput.write(((ByteArrayOutputStream) this.output).toByteArray());
    }

    private void doWriteObjects() {
        while (this.objectsToWrite.size() > 0) {
            COSBase removeFirst = this.objectsToWrite.removeFirst();
            this.objectsToWriteSet.remove(removeFirst);
            doWriteObject(removeFirst);
        }
    }

    private void doWriteSignature() {
        long length = this.incrementalInput.length();
        long j10 = this.signatureOffset;
        long j11 = this.signatureLength + j10;
        long pos = (getStandardOutput().getPos() - (this.signatureLength + length)) - (this.signatureOffset - length);
        StringBuilder h10 = r.h("0 ", j10, " ");
        h10.append(j11);
        h10.append(" ");
        h10.append(pos);
        h10.append("]");
        String sb2 = h10.toString();
        int i10 = 0;
        this.byteRangeArray.set(0, (COSBase) COSInteger.ZERO);
        this.byteRangeArray.set(1, (COSBase) COSInteger.get(j10));
        this.byteRangeArray.set(2, (COSBase) COSInteger.get(j11));
        this.byteRangeArray.set(3, (COSBase) COSInteger.get(pos));
        if (sb2.length() <= this.byteRangeLength) {
            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.output;
            byteArrayOutputStream.flush();
            this.incrementPart = byteArrayOutputStream.toByteArray();
            byte[] bytes = sb2.getBytes(Charsets.ISO_8859_1);
            while (true) {
                long j12 = i10;
                if (j12 >= this.byteRangeLength) {
                    break;
                }
                if (i10 >= bytes.length) {
                    this.incrementPart[(int) ((this.byteRangeOffset + j12) - length)] = 32;
                } else {
                    this.incrementPart[(int) ((this.byteRangeOffset + j12) - length)] = bytes[i10];
                }
                i10++;
            }
            if (this.signatureInterface != null) {
                writeExternalSignature(this.signatureInterface.sign(getDataToSign()));
                return;
            }
            return;
        }
        StringBuilder g10 = a.g("Can't write new byteRange '", sb2, "' not enough space: byteRange.length(): ");
        g10.append(sb2.length());
        g10.append(", byteRangeLength: ");
        g10.append(this.byteRangeLength);
        throw new IOException(g10.toString());
    }

    private void doWriteXRefInc(COSDocument cOSDocument, long j10) {
        if (cOSDocument.isXRefStream() || j10 != -1) {
            PDFXRefStream pDFXRefStream = new PDFXRefStream(cOSDocument);
            for (COSWriterXRefEntry cOSWriterXRefEntry : getXRefEntries()) {
                pDFXRefStream.addEntry(cOSWriterXRefEntry);
            }
            COSDictionary trailer = cOSDocument.getTrailer();
            if (this.incrementalUpdate) {
                trailer.setLong(COSName.PREV, cOSDocument.getStartXref());
            } else {
                trailer.removeItem(COSName.PREV);
            }
            pDFXRefStream.addTrailerInfo(trailer);
            pDFXRefStream.setSize(getNumber() + 2);
            setStartxref(getStandardOutput().getPos());
            doWriteObject(pDFXRefStream.getStream());
        }
        if (!cOSDocument.isXRefStream() || j10 != -1) {
            COSDictionary trailer2 = cOSDocument.getTrailer();
            trailer2.setLong(COSName.PREV, cOSDocument.getStartXref());
            if (j10 != -1) {
                COSName cOSName = COSName.XREF_STM;
                trailer2.removeItem(cOSName);
                trailer2.setLong(cOSName, getStartxref());
            }
            doWriteXRefTable();
            doWriteTrailer(cOSDocument);
        }
    }

    private void doWriteXRefTable() {
        addXRefEntry(COSWriterXRefEntry.getNullEntry());
        Collections.sort(getXRefEntries());
        setStartxref(getStandardOutput().getPos());
        getStandardOutput().write(XREF);
        getStandardOutput().writeEOL();
        Long[] xRefRanges = getXRefRanges(getXRefEntries());
        int length = xRefRanges.length;
        if (length % 2 == 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11 += 2) {
                int i12 = i11 + 1;
                writeXrefRange(xRefRanges[i11].longValue(), xRefRanges[i12].longValue());
                int i13 = 0;
                while (i13 < xRefRanges[i12].longValue()) {
                    writeXrefEntry(this.xRefEntries.get(i10));
                    i13++;
                    i10++;
                }
            }
        }
    }

    private COSObjectKey getObjectKey(COSBase cOSBase) {
        COSBase cOSBase2;
        if (cOSBase instanceof COSObject) {
            cOSBase2 = ((COSObject) cOSBase).getObject();
        } else {
            cOSBase2 = cOSBase;
        }
        COSObjectKey cOSObjectKey = this.objectKeys.get(cOSBase);
        if (cOSObjectKey == null && cOSBase2 != null) {
            cOSObjectKey = this.objectKeys.get(cOSBase2);
        }
        if (cOSObjectKey == null) {
            setNumber(getNumber() + 1);
            cOSObjectKey = new COSObjectKey(getNumber(), 0);
            this.objectKeys.put(cOSBase, cOSObjectKey);
            if (cOSBase2 != null) {
                this.objectKeys.put(cOSBase2, cOSObjectKey);
            }
        }
        return cOSObjectKey;
    }

    private boolean isNeedToBeUpdated(COSBase cOSBase) {
        if (cOSBase instanceof COSUpdateInfo) {
            return ((COSUpdateInfo) cOSBase).isNeedToBeUpdated();
        }
        return false;
    }

    private void prepareIncrement(PDDocument pDDocument) {
        if (pDDocument != null) {
            try {
                COSDocument document = pDDocument.getDocument();
                Set<COSObjectKey> keySet = document.getXrefTable().keySet();
                long highestXRefObjectNumber = pDDocument.getDocument().getHighestXRefObjectNumber();
                for (COSObjectKey cOSObjectKey : keySet) {
                    COSBase object = document.getObjectFromPool(cOSObjectKey).getObject();
                    if (object != null && cOSObjectKey != null && !(object instanceof COSNumber)) {
                        this.objectKeys.put(object, cOSObjectKey);
                        this.keyObject.put(cOSObjectKey, object);
                    }
                    if (cOSObjectKey != null) {
                        long number = cOSObjectKey.getNumber();
                        if (number > highestXRefObjectNumber) {
                            highestXRefObjectNumber = number;
                        }
                    }
                }
                setNumber(highestXRefObjectNumber);
            } catch (IOException e10) {
                e10.getMessage();
            }
        }
    }

    private void setOutput(OutputStream outputStream) {
        this.output = outputStream;
    }

    private void setStandardOutput(COSStandardOutputStream cOSStandardOutputStream) {
        this.standardOutput = cOSStandardOutputStream;
    }

    public static void writeString(COSString cOSString, OutputStream outputStream) {
        writeString(cOSString.getBytes(), cOSString.getForceHexForm(), outputStream);
    }

    private void writeXrefEntry(COSWriterXRefEntry cOSWriterXRefEntry) {
        byte[] bArr;
        String format = this.formatXrefOffset.format(cOSWriterXRefEntry.getOffset());
        String format2 = this.formatXrefGeneration.format(cOSWriterXRefEntry.getKey().getGeneration());
        COSStandardOutputStream standardOutput = getStandardOutput();
        Charset charset = Charsets.ISO_8859_1;
        standardOutput.write(format.getBytes(charset));
        COSStandardOutputStream standardOutput2 = getStandardOutput();
        byte[] bArr2 = SPACE;
        standardOutput2.write(bArr2);
        getStandardOutput().write(format2.getBytes(charset));
        getStandardOutput().write(bArr2);
        COSStandardOutputStream standardOutput3 = getStandardOutput();
        if (cOSWriterXRefEntry.isFree()) {
            bArr = XREF_FREE;
        } else {
            bArr = XREF_USED;
        }
        standardOutput3.write(bArr);
        getStandardOutput().writeCRLF();
    }

    private void writeXrefRange(long j10, long j11) {
        COSStandardOutputStream standardOutput = getStandardOutput();
        String valueOf = String.valueOf(j10);
        Charset charset = Charsets.ISO_8859_1;
        standardOutput.write(valueOf.getBytes(charset));
        getStandardOutput().write(SPACE);
        getStandardOutput().write(String.valueOf(j11).getBytes(charset));
        getStandardOutput().writeEOL();
    }

    public void addXRefEntry(COSWriterXRefEntry cOSWriterXRefEntry) {
        getXRefEntries().add(cOSWriterXRefEntry);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (getStandardOutput() != null) {
            getStandardOutput().close();
        }
        OutputStream outputStream = this.incrementalOutput;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    public void doWriteBody(COSDocument cOSDocument) {
        COSDictionary trailer = cOSDocument.getTrailer();
        COSDictionary cOSDictionary = trailer.getCOSDictionary(COSName.ROOT);
        COSDictionary cOSDictionary2 = trailer.getCOSDictionary(COSName.INFO);
        COSDictionary cOSDictionary3 = trailer.getCOSDictionary(COSName.ENCRYPT);
        if (cOSDictionary != null) {
            addObjectToWrite(cOSDictionary);
        }
        if (cOSDictionary2 != null) {
            addObjectToWrite(cOSDictionary2);
        }
        doWriteObjects();
        this.willEncrypt = false;
        if (cOSDictionary3 != null) {
            addObjectToWrite(cOSDictionary3);
        }
        doWriteObjects();
    }

    public void doWriteHeader(COSDocument cOSDocument) {
        String str;
        if (this.fdfDocument != null) {
            str = "%FDF-" + cOSDocument.getVersion();
        } else {
            str = "%PDF-" + cOSDocument.getVersion();
        }
        getStandardOutput().write(str.getBytes(Charsets.ISO_8859_1));
        getStandardOutput().writeEOL();
        getStandardOutput().write(COMMENT);
        getStandardOutput().write(GARBAGE);
        getStandardOutput().writeEOL();
    }

    public void doWriteObject(COSBase cOSBase) {
        this.writtenObjects.add(cOSBase);
        this.currentObjectKey = getObjectKey(cOSBase);
        addXRefEntry(new COSWriterXRefEntry(getStandardOutput().getPos(), cOSBase, this.currentObjectKey));
        COSStandardOutputStream standardOutput = getStandardOutput();
        String valueOf = String.valueOf(this.currentObjectKey.getNumber());
        Charset charset = Charsets.ISO_8859_1;
        standardOutput.write(valueOf.getBytes(charset));
        COSStandardOutputStream standardOutput2 = getStandardOutput();
        byte[] bArr = SPACE;
        standardOutput2.write(bArr);
        getStandardOutput().write(String.valueOf(this.currentObjectKey.getGeneration()).getBytes(charset));
        getStandardOutput().write(bArr);
        getStandardOutput().write(OBJ);
        getStandardOutput().writeEOL();
        cOSBase.accept(this);
        getStandardOutput().writeEOL();
        getStandardOutput().write(ENDOBJ);
        getStandardOutput().writeEOL();
    }

    public void doWriteTrailer(COSDocument cOSDocument) {
        getStandardOutput().write(TRAILER);
        getStandardOutput().writeEOL();
        COSDictionary trailer = cOSDocument.getTrailer();
        Collections.sort(getXRefEntries());
        trailer.setLong(COSName.SIZE, getXRefEntries().get(getXRefEntries().size() - 1).getKey().getNumber() + 1);
        if (!this.incrementalUpdate) {
            trailer.removeItem(COSName.PREV);
        }
        if (!cOSDocument.isXRefStream()) {
            trailer.removeItem(COSName.XREF_STM);
        }
        trailer.removeItem(COSName.DOC_CHECKSUM);
        COSArray cOSArray = trailer.getCOSArray(COSName.ID);
        if (cOSArray != null) {
            cOSArray.setDirect(true);
        }
        trailer.accept(this);
    }

    public InputStream getDataToSign() {
        RandomAccessRead randomAccessRead;
        if (this.incrementPart != null && (randomAccessRead = this.incrementalInput) != null) {
            int length = (int) (this.signatureOffset - randomAccessRead.length());
            int i10 = ((int) this.signatureLength) + length;
            return new SequenceInputStream(new RandomAccessInputStream(this.incrementalInput), new COSFilterInputStream(this.incrementPart, new int[]{0, length, i10, this.incrementPart.length - i10}));
        }
        throw new IllegalStateException("PDF not prepared for signing");
    }

    public long getNumber() {
        return this.number;
    }

    public Map<COSBase, COSObjectKey> getObjectKeys() {
        return this.objectKeys;
    }

    public OutputStream getOutput() {
        return this.output;
    }

    public COSStandardOutputStream getStandardOutput() {
        return this.standardOutput;
    }

    public long getStartxref() {
        return this.startxref;
    }

    public List<COSWriterXRefEntry> getXRefEntries() {
        return this.xRefEntries;
    }

    public Long[] getXRefRanges(List<COSWriterXRefEntry> list) {
        ArrayList arrayList = new ArrayList();
        long j10 = -2;
        long j11 = 1;
        for (COSWriterXRefEntry cOSWriterXRefEntry : list) {
            long number = cOSWriterXRefEntry.getKey().getNumber();
            if (number == j10 + 1) {
                j11++;
            } else if (j10 != -2) {
                arrayList.add(Long.valueOf((j10 - j11) + 1));
                arrayList.add(Long.valueOf(j11));
                j11 = 1;
            }
            j10 = number;
        }
        if (list.size() > 0) {
            arrayList.add(Long.valueOf((j10 - j11) + 1));
            arrayList.add(Long.valueOf(j11));
        }
        return (Long[]) arrayList.toArray(new Long[arrayList.size()]);
    }

    public void setNumber(long j10) {
        this.number = j10;
    }

    public void setStartxref(long j10) {
        this.startxref = j10;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromArray(COSArray cOSArray) {
        getStandardOutput().write(ARRAY_OPEN);
        Iterator<COSBase> it = cOSArray.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            COSBase next = it.next();
            if (next instanceof COSDictionary) {
                if (next.isDirect()) {
                    visitFromDictionary((COSDictionary) next);
                } else {
                    addObjectToWrite(next);
                    writeReference(next);
                }
            } else if (next instanceof COSObject) {
                COSBase object = ((COSObject) next).getObject();
                if (!this.willEncrypt && !this.incrementalUpdate && !(object instanceof COSDictionary) && object != null) {
                    object.accept(this);
                } else {
                    addObjectToWrite(next);
                    writeReference(next);
                }
            } else if (next == null) {
                COSNull.NULL.accept(this);
            } else {
                next.accept(this);
            }
            i10++;
            if (it.hasNext()) {
                if (i10 % 10 == 0) {
                    getStandardOutput().writeEOL();
                } else {
                    getStandardOutput().write(SPACE);
                }
            }
        }
        getStandardOutput().write(ARRAY_CLOSE);
        getStandardOutput().writeEOL();
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromBoolean(COSBoolean cOSBoolean) {
        cOSBoolean.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromDictionary(COSDictionary cOSDictionary) {
        if (!this.reachedSignature) {
            COSBase item = cOSDictionary.getItem(COSName.TYPE);
            if (COSName.SIG.equals(item) || COSName.DOC_TIME_STAMP.equals(item)) {
                this.reachedSignature = true;
            }
        }
        getStandardOutput().write(DICT_OPEN);
        getStandardOutput().writeEOL();
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            COSBase value = entry.getValue();
            if (value != null) {
                entry.getKey().accept(this);
                getStandardOutput().write(SPACE);
                if (value instanceof COSDictionary) {
                    COSDictionary cOSDictionary2 = (COSDictionary) value;
                    if (!this.incrementalUpdate) {
                        COSName cOSName = COSName.XOBJECT;
                        COSBase item2 = cOSDictionary2.getItem(cOSName);
                        if (item2 != null && !cOSName.equals(entry.getKey())) {
                            item2.setDirect(true);
                        }
                        COSName cOSName2 = COSName.RESOURCES;
                        COSBase item3 = cOSDictionary2.getItem(cOSName2);
                        if (item3 != null && !cOSName2.equals(entry.getKey())) {
                            item3.setDirect(true);
                        }
                    }
                    if (cOSDictionary2.isDirect()) {
                        visitFromDictionary(cOSDictionary2);
                    } else {
                        addObjectToWrite(cOSDictionary2);
                        writeReference(cOSDictionary2);
                    }
                } else if (value instanceof COSObject) {
                    COSBase object = ((COSObject) value).getObject();
                    if (!this.willEncrypt && !this.incrementalUpdate && !(object instanceof COSDictionary) && object != null) {
                        object.accept(this);
                    } else {
                        addObjectToWrite(value);
                        writeReference(value);
                    }
                } else if (this.reachedSignature && COSName.CONTENTS.equals(entry.getKey())) {
                    this.signatureOffset = getStandardOutput().getPos();
                    value.accept(this);
                    this.signatureLength = getStandardOutput().getPos() - this.signatureOffset;
                } else if (this.reachedSignature && COSName.BYTERANGE.equals(entry.getKey())) {
                    this.byteRangeArray = (COSArray) entry.getValue();
                    this.byteRangeOffset = getStandardOutput().getPos() + 1;
                    value.accept(this);
                    this.byteRangeLength = (getStandardOutput().getPos() - 1) - this.byteRangeOffset;
                    this.reachedSignature = false;
                } else {
                    value.accept(this);
                }
                getStandardOutput().writeEOL();
            }
        }
        getStandardOutput().write(DICT_CLOSE);
        getStandardOutput().writeEOL();
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromDocument(COSDocument cOSDocument) {
        long j10;
        if (!this.incrementalUpdate) {
            doWriteHeader(cOSDocument);
        } else {
            getStandardOutput().writeCRLF();
        }
        doWriteBody(cOSDocument);
        COSDictionary trailer = cOSDocument.getTrailer();
        if (trailer != null) {
            j10 = trailer.getLong(COSName.XREF_STM);
        } else {
            j10 = -1;
        }
        if (!this.incrementalUpdate && !cOSDocument.isXRefStream()) {
            doWriteXRefTable();
            doWriteTrailer(cOSDocument);
        } else {
            doWriteXRefInc(cOSDocument, j10);
        }
        getStandardOutput().write(STARTXREF);
        getStandardOutput().writeEOL();
        getStandardOutput().write(String.valueOf(getStartxref()).getBytes(Charsets.ISO_8859_1));
        getStandardOutput().writeEOL();
        getStandardOutput().write(EOF);
        getStandardOutput().writeEOL();
        if (this.incrementalUpdate) {
            if (this.signatureOffset != 0 && this.byteRangeOffset != 0) {
                doWriteSignature();
                return null;
            }
            doWriteIncrement();
            return null;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromFloat(COSFloat cOSFloat) {
        cOSFloat.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromInt(COSInteger cOSInteger) {
        cOSInteger.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromName(COSName cOSName) {
        cOSName.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromNull(COSNull cOSNull) {
        cOSNull.writePDF(getStandardOutput());
        return null;
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromStream(COSStream cOSStream) {
        Throwable th2;
        InputStream inputStream;
        if (this.willEncrypt) {
            this.pdDocument.getEncryption().getSecurityHandler().encryptStream(cOSStream, this.currentObjectKey.getNumber(), this.currentObjectKey.getGeneration());
        }
        try {
            visitFromDictionary(cOSStream);
            getStandardOutput().write(STREAM);
            getStandardOutput().writeCRLF();
            inputStream = cOSStream.createRawInputStream();
        } catch (Throwable th3) {
            th2 = th3;
            inputStream = null;
        }
        try {
            IOUtils.copy(inputStream, getStandardOutput());
            getStandardOutput().writeCRLF();
            getStandardOutput().write(ENDSTREAM);
            getStandardOutput().writeEOL();
            if (inputStream != null) {
                inputStream.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    @Override // com.tom_roush.pdfbox.cos.ICOSVisitor
    public Object visitFromString(COSString cOSString) {
        if (this.willEncrypt) {
            this.pdDocument.getEncryption().getSecurityHandler().encryptString(cOSString, this.currentObjectKey.getNumber(), this.currentObjectKey.getGeneration());
        }
        writeString(cOSString, getStandardOutput());
        return null;
    }

    public void write(COSDocument cOSDocument) {
        write(new PDDocument(cOSDocument));
    }

    public void writeExternalSignature(byte[] bArr) {
        if (this.incrementPart != null && this.incrementalInput != null) {
            byte[] bytes = Hex.getBytes(bArr);
            if (bytes.length <= this.signatureLength - 2) {
                System.arraycopy(bytes, 0, this.incrementPart, ((int) (this.signatureOffset - this.incrementalInput.length())) + 1, bytes.length);
                IOUtils.copy(new RandomAccessInputStream(this.incrementalInput), this.incrementalOutput);
                this.incrementalOutput.write(this.incrementPart);
                this.incrementPart = null;
                return;
            }
            throw new IOException("Can't write signature, not enough space");
        }
        throw new IllegalStateException("PDF not prepared for setting signature");
    }

    public void writeReference(COSBase cOSBase) {
        COSObjectKey objectKey = getObjectKey(cOSBase);
        COSStandardOutputStream standardOutput = getStandardOutput();
        String valueOf = String.valueOf(objectKey.getNumber());
        Charset charset = Charsets.ISO_8859_1;
        standardOutput.write(valueOf.getBytes(charset));
        COSStandardOutputStream standardOutput2 = getStandardOutput();
        byte[] bArr = SPACE;
        standardOutput2.write(bArr);
        getStandardOutput().write(String.valueOf(objectKey.getGeneration()).getBytes(charset));
        getStandardOutput().write(bArr);
        getStandardOutput().write(REFERENCE);
    }

    public static void writeString(byte[] bArr, OutputStream outputStream) {
        writeString(bArr, false, outputStream);
    }

    private static void writeString(byte[] bArr, boolean z10, OutputStream outputStream) {
        boolean z11;
        if (!z10) {
            for (byte b10 : bArr) {
                if (b10 < 0 || b10 == 13 || b10 == 10) {
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        if (z11 && !z10) {
            outputStream.write(40);
            for (int i10 : bArr) {
                if (i10 != 40 && i10 != 41 && i10 != 92) {
                    outputStream.write(i10);
                } else {
                    outputStream.write(92);
                    outputStream.write(i10);
                }
            }
            outputStream.write(41);
            return;
        }
        outputStream.write(60);
        Hex.writeHexBytes(bArr, outputStream);
        outputStream.write(62);
    }

    public void write(PDDocument pDDocument) {
        write(pDDocument, null);
    }

    public void write(PDDocument pDDocument, SignatureInterface signatureInterface) {
        COSArray cOSArray;
        Long valueOf = Long.valueOf(pDDocument.getDocumentId() == null ? System.currentTimeMillis() : pDDocument.getDocumentId().longValue());
        this.pdDocument = pDDocument;
        this.signatureInterface = signatureInterface;
        if (this.incrementalUpdate) {
            prepareIncrement(pDDocument);
        }
        boolean z10 = true;
        if (pDDocument.isAllSecurityToBeRemoved()) {
            this.willEncrypt = false;
            pDDocument.getDocument().getTrailer().removeItem(COSName.ENCRYPT);
        } else if (this.pdDocument.getEncryption() != null) {
            if (!this.incrementalUpdate) {
                SecurityHandler securityHandler = this.pdDocument.getEncryption().getSecurityHandler();
                if (securityHandler.hasProtectionPolicy()) {
                    securityHandler.prepareDocumentForEncryption(this.pdDocument);
                } else {
                    throw new IllegalStateException("PDF contains an encryption dictionary, please remove it with setAllSecurityToBeRemoved() or set a protection policy with protect()");
                }
            }
            this.willEncrypt = true;
        } else {
            this.willEncrypt = false;
        }
        COSDocument document = this.pdDocument.getDocument();
        COSDictionary trailer = document.getTrailer();
        COSBase dictionaryObject = trailer.getDictionaryObject(COSName.ID);
        if (dictionaryObject instanceof COSArray) {
            cOSArray = (COSArray) dictionaryObject;
            if (cOSArray.size() == 2) {
                z10 = false;
            }
        } else {
            cOSArray = null;
        }
        if (cOSArray != null && cOSArray.size() == 2) {
            z10 = false;
        }
        if (z10 || this.incrementalUpdate) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(Long.toString(valueOf.longValue()).getBytes(Charsets.ISO_8859_1));
                COSDictionary cOSDictionary = trailer.getCOSDictionary(COSName.INFO);
                if (cOSDictionary != null) {
                    for (COSBase cOSBase : cOSDictionary.getValues()) {
                        messageDigest.update(cOSBase.toString().getBytes(Charsets.ISO_8859_1));
                    }
                }
                COSString cOSString = z10 ? new COSString(messageDigest.digest()) : (COSString) cOSArray.get(0);
                COSString cOSString2 = z10 ? cOSString : new COSString(messageDigest.digest());
                COSArray cOSArray2 = new COSArray();
                cOSArray2.add((COSBase) cOSString);
                cOSArray2.add((COSBase) cOSString2);
                trailer.setItem(COSName.ID, (COSBase) cOSArray2);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
        document.accept(this);
    }

    public COSWriter(OutputStream outputStream, RandomAccessRead randomAccessRead) {
        Locale locale = Locale.US;
        this.formatXrefOffset = new DecimalFormat("0000000000", DecimalFormatSymbols.getInstance(locale));
        this.formatXrefGeneration = new DecimalFormat("00000", DecimalFormatSymbols.getInstance(locale));
        this.startxref = 0L;
        this.number = 0L;
        this.objectKeys = new Hashtable();
        this.keyObject = new HashMap();
        this.xRefEntries = new ArrayList();
        this.objectsToWriteSet = new HashSet();
        this.objectsToWrite = new LinkedList();
        this.writtenObjects = new HashSet();
        this.actualsAdded = new HashSet();
        this.currentObjectKey = null;
        this.pdDocument = null;
        this.fdfDocument = null;
        this.willEncrypt = false;
        this.incrementalUpdate = false;
        this.reachedSignature = false;
        setOutput(new ByteArrayOutputStream());
        setStandardOutput(new COSStandardOutputStream(this.output, randomAccessRead.length()));
        this.incrementalInput = randomAccessRead;
        this.incrementalOutput = outputStream;
        this.incrementalUpdate = true;
    }

    public void write(FDFDocument fDFDocument) {
        this.fdfDocument = fDFDocument;
        this.willEncrypt = false;
        fDFDocument.getDocument().accept(this);
    }

    public COSWriter(OutputStream outputStream, RandomAccessRead randomAccessRead, Set<COSDictionary> set) {
        this(outputStream, randomAccessRead);
        this.objectsToWrite.addAll(set);
    }
}
