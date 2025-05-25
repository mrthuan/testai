package lib.zj.office.fc.poifs.filesystem;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import lib.zj.office.fc.poifs.property.DocumentProperty;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.IOUtils;

/* loaded from: classes3.dex */
public final class NPOIFSDocument {
    private int _block_size;
    private NPOIFSFileSystem _filesystem;
    private DocumentProperty _property;
    private NPOIFSStream _stream;

    public NPOIFSDocument(DocumentProperty documentProperty, NPOIFSFileSystem nPOIFSFileSystem) {
        this._property = documentProperty;
        this._filesystem = nPOIFSFileSystem;
        if (documentProperty.getSize() < 4096) {
            this._stream = new NPOIFSStream(this._filesystem.getMiniStore(), documentProperty.getStartBlock());
            this._block_size = this._filesystem.getMiniStore().getBlockStoreBlockSize();
            return;
        }
        this._stream = new NPOIFSStream(this._filesystem, documentProperty.getStartBlock());
        this._block_size = this._filesystem.getBlockStoreBlockSize();
    }

    public Iterator<ByteBuffer> getBlockIterator() {
        if (getSize() > 0) {
            return this._stream.getBlockIterator();
        }
        return Collections.emptyList().iterator();
    }

    public int getDocumentBlockSize() {
        return this._block_size;
    }

    public DocumentProperty getDocumentProperty() {
        return this._property;
    }

    public String getShortDescription() {
        StringBuffer stringBuffer = new StringBuffer("Document: \"");
        stringBuffer.append(this._property.getName());
        stringBuffer.append("\" size = ");
        stringBuffer.append(getSize());
        return stringBuffer.toString();
    }

    public int getSize() {
        return this._property.getSize();
    }

    public Object[] getViewableArray() {
        String message;
        Object[] objArr = new Object[1];
        try {
            if (getSize() > 0) {
                int size = getSize();
                byte[] bArr = new byte[size];
                Iterator<ByteBuffer> it = this._stream.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    int min = Math.min(this._block_size, size - i10);
                    it.next().get(bArr, i10, min);
                    i10 += min;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                HexDump.dump(bArr, 0L, byteArrayOutputStream, 0);
                message = byteArrayOutputStream.toString();
            } else {
                message = "<NO DATA>";
            }
        } catch (IOException e10) {
            message = e10.getMessage();
        }
        objArr[0] = message;
        return objArr;
    }

    public Iterator getViewableIterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    public boolean preferArray() {
        return true;
    }

    public NPOIFSDocument(String str, NPOIFSFileSystem nPOIFSFileSystem, InputStream inputStream) {
        byte[] byteArray;
        this._filesystem = nPOIFSFileSystem;
        if (inputStream instanceof ByteArrayInputStream) {
            ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) inputStream;
            byteArray = new byte[byteArrayInputStream.available()];
            byteArrayInputStream.read(byteArray);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            IOUtils.copy(inputStream, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
        }
        if (byteArray.length <= 4096) {
            this._stream = new NPOIFSStream(nPOIFSFileSystem.getMiniStore());
            this._block_size = this._filesystem.getMiniStore().getBlockStoreBlockSize();
        } else {
            this._stream = new NPOIFSStream(nPOIFSFileSystem);
            this._block_size = this._filesystem.getBlockStoreBlockSize();
        }
        this._stream.updateContents(byteArray);
        DocumentProperty documentProperty = new DocumentProperty(str, byteArray.length);
        this._property = documentProperty;
        documentProperty.setStartBlock(this._stream.getStartBlock());
    }
}
