package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.io.ScratchFile;
import com.tom_roush.pdfbox.pdfparser.PDFObjectStreamParser;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class COSDocument extends COSBase implements Closeable {
    private boolean closed;
    private long highestXRefObjectNumber;
    private boolean isDecrypted;
    private boolean isXRefStream;
    private final Map<COSObjectKey, COSObject> objectPool;
    private ScratchFile scratchFile;
    private long startXref;
    private final List<COSStream> streams;
    private COSDictionary trailer;
    private float version;
    private boolean warnMissingClose;
    private final Map<COSObjectKey, Long> xrefTable;

    public COSDocument() {
        this(ScratchFile.getMainMemoryOnlyInstance());
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) {
        return iCOSVisitor.visitFromDocument(this);
    }

    public void addXRefTable(Map<COSObjectKey, Long> map) {
        this.xrefTable.putAll(map);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        IOException iOException = null;
        for (COSObject cOSObject : getObjects()) {
            COSBase object = cOSObject.getObject();
            if (object instanceof COSStream) {
                iOException = IOUtils.closeAndLogException((COSStream) object, "COSStream", iOException);
            }
        }
        for (COSStream cOSStream : this.streams) {
            iOException = IOUtils.closeAndLogException(cOSStream, "COSStream", iOException);
        }
        ScratchFile scratchFile = this.scratchFile;
        if (scratchFile != null) {
            iOException = IOUtils.closeAndLogException(scratchFile, "ScratchFile", iOException);
        }
        this.closed = true;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    public COSStream createCOSStream() {
        COSStream cOSStream = new COSStream(this.scratchFile);
        this.streams.add(cOSStream);
        return cOSStream;
    }

    public void dereferenceObjectStreams() {
        for (COSObject cOSObject : getObjectsByType(COSName.OBJ_STM)) {
            PDFObjectStreamParser pDFObjectStreamParser = new PDFObjectStreamParser((COSStream) cOSObject.getObject(), this);
            pDFObjectStreamParser.parse();
            for (COSObject cOSObject2 : pDFObjectStreamParser.getObjects()) {
                COSObjectKey cOSObjectKey = new COSObjectKey(cOSObject2);
                if (this.objectPool.get(cOSObjectKey) == null || this.objectPool.get(cOSObjectKey).getObject() == null || (this.xrefTable.containsKey(cOSObjectKey) && this.xrefTable.get(cOSObjectKey).longValue() == (-cOSObject.getObjectNumber()))) {
                    getObjectFromPool(cOSObjectKey).setObject(cOSObject2.getObject());
                }
            }
        }
    }

    public void finalize() {
        if (!this.closed) {
            close();
        }
    }

    public COSObject getCatalog() {
        COSObject objectByType = getObjectByType(COSName.CATALOG);
        if (objectByType != null) {
            return objectByType;
        }
        throw new IOException("Catalog cannot be found");
    }

    public COSArray getDocumentID() {
        return getTrailer().getCOSArray(COSName.ID);
    }

    public COSDictionary getEncryptionDictionary() {
        return this.trailer.getCOSDictionary(COSName.ENCRYPT);
    }

    public long getHighestXRefObjectNumber() {
        return this.highestXRefObjectNumber;
    }

    public COSObjectKey getKey(COSBase cOSBase) {
        for (Map.Entry<COSObjectKey, COSObject> entry : this.objectPool.entrySet()) {
            if (entry.getValue().getObject() == cOSBase) {
                return entry.getKey();
            }
        }
        return null;
    }

    public COSObject getObjectByType(COSName cOSName) {
        for (COSObject cOSObject : this.objectPool.values()) {
            COSBase object = cOSObject.getObject();
            if (object instanceof COSDictionary) {
                try {
                    COSBase item = ((COSDictionary) object).getItem(COSName.TYPE);
                    if (item instanceof COSName) {
                        if (((COSName) item).equals(cOSName)) {
                            return cOSObject;
                        }
                    } else if (item != null) {
                        item.toString();
                    }
                } catch (ClassCastException e10) {
                    e10.getMessage();
                }
            }
        }
        return null;
    }

    public COSObject getObjectFromPool(COSObjectKey cOSObjectKey) {
        COSObject cOSObject;
        if (cOSObjectKey != null) {
            cOSObject = this.objectPool.get(cOSObjectKey);
        } else {
            cOSObject = null;
        }
        if (cOSObject == null) {
            cOSObject = new COSObject(null);
            if (cOSObjectKey != null) {
                cOSObject.setObjectNumber(cOSObjectKey.getNumber());
                cOSObject.setGenerationNumber(cOSObjectKey.getGeneration());
                this.objectPool.put(cOSObjectKey, cOSObject);
            }
        }
        return cOSObject;
    }

    public List<COSObject> getObjects() {
        return new ArrayList(this.objectPool.values());
    }

    public List<COSObject> getObjectsByType(String str) {
        return getObjectsByType(COSName.getPDFName(str));
    }

    public long getStartXref() {
        return this.startXref;
    }

    public COSDictionary getTrailer() {
        return this.trailer;
    }

    public float getVersion() {
        return this.version;
    }

    public Map<COSObjectKey, Long> getXrefTable() {
        return this.xrefTable;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isDecrypted() {
        return this.isDecrypted;
    }

    public boolean isEncrypted() {
        COSDictionary cOSDictionary = this.trailer;
        if (cOSDictionary != null) {
            return cOSDictionary.getDictionaryObject(COSName.ENCRYPT) instanceof COSDictionary;
        }
        return false;
    }

    public boolean isXRefStream() {
        return this.isXRefStream;
    }

    public void print() {
        for (COSObject cOSObject : this.objectPool.values()) {
            System.out.println(cOSObject);
        }
    }

    public COSObject removeObject(COSObjectKey cOSObjectKey) {
        return this.objectPool.remove(cOSObjectKey);
    }

    public void setDecrypted() {
        this.isDecrypted = true;
    }

    public void setDocumentID(COSArray cOSArray) {
        getTrailer().setItem(COSName.ID, (COSBase) cOSArray);
    }

    public void setEncryptionDictionary(COSDictionary cOSDictionary) {
        this.trailer.setItem(COSName.ENCRYPT, (COSBase) cOSDictionary);
    }

    public void setHighestXRefObjectNumber(long j10) {
        this.highestXRefObjectNumber = j10;
    }

    public void setIsXRefStream(boolean z10) {
        this.isXRefStream = z10;
    }

    public void setStartXref(long j10) {
        this.startXref = j10;
    }

    public void setTrailer(COSDictionary cOSDictionary) {
        this.trailer = cOSDictionary;
    }

    public void setVersion(float f10) {
        this.version = f10;
    }

    public void setWarnMissingClose(boolean z10) {
        this.warnMissingClose = z10;
    }

    public COSDocument(ScratchFile scratchFile) {
        this.version = 1.4f;
        this.objectPool = new HashMap();
        this.xrefTable = new HashMap();
        this.streams = Collections.synchronizedList(new ArrayList());
        this.warnMissingClose = true;
        this.isDecrypted = false;
        this.closed = false;
        this.scratchFile = scratchFile;
    }

    public List<COSObject> getObjectsByType(COSName cOSName) {
        ArrayList arrayList = new ArrayList();
        for (COSObject cOSObject : this.objectPool.values()) {
            COSBase object = cOSObject.getObject();
            if (object instanceof COSDictionary) {
                try {
                    COSBase item = ((COSDictionary) object).getItem(COSName.TYPE);
                    if (item instanceof COSName) {
                        if (((COSName) item).equals(cOSName)) {
                            arrayList.add(cOSObject);
                        }
                    } else if (item != null) {
                        item.toString();
                    }
                } catch (ClassCastException e10) {
                    e10.getMessage();
                }
            }
        }
        return arrayList;
    }

    public COSStream createCOSStream(COSDictionary cOSDictionary) {
        COSStream cOSStream = new COSStream(this.scratchFile);
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            cOSStream.setItem(entry.getKey(), entry.getValue());
        }
        return cOSStream;
    }
}
