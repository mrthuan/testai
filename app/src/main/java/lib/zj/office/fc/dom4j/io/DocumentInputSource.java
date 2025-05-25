package lib.zj.office.fc.dom4j.io;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import lib.zj.office.fc.dom4j.Document;
import org.xml.sax.InputSource;

/* loaded from: classes3.dex */
class DocumentInputSource extends InputSource {
    private Document document;

    public DocumentInputSource() {
    }

    @Override // org.xml.sax.InputSource
    public Reader getCharacterStream() {
        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xMLWriter = new XMLWriter(stringWriter);
            xMLWriter.write(this.document);
            xMLWriter.flush();
            return new StringReader(stringWriter.toString());
        } catch (IOException e10) {
            return new Reader() { // from class: lib.zj.office.fc.dom4j.io.DocumentInputSource.1
                @Override // java.io.Reader
                public int read(char[] cArr, int i10, int i11) {
                    throw e10;
                }

                @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }
            };
        }
    }

    public Document getDocument() {
        return this.document;
    }

    @Override // org.xml.sax.InputSource
    public void setCharacterStream(Reader reader) {
        throw new UnsupportedOperationException();
    }

    public void setDocument(Document document) {
        this.document = document;
        setSystemId(document.getName());
    }

    public DocumentInputSource(Document document) {
        this.document = document;
        setSystemId(document.getName());
    }
}
