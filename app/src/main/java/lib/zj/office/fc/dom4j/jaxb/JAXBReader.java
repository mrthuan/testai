package lib.zj.office.fc.dom4j.jaxb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentException;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

/* loaded from: classes3.dex */
public class JAXBReader extends JAXBSupport {
    private boolean pruneElements;
    private SAXReader reader;

    public JAXBReader(String str) {
        super(str);
    }

    private SAXReader getReader() {
        if (this.reader == null) {
            this.reader = new SAXReader();
        }
        return this.reader;
    }

    public void addHandler(String str, ElementHandler elementHandler) {
        getReader().addHandler(str, elementHandler);
    }

    public void addObjectHandler(String str, JAXBObjectHandler jAXBObjectHandler) {
        getReader().addHandler(str, new UnmarshalElementHandler(this, jAXBObjectHandler));
    }

    public boolean isPruneElements() {
        return this.pruneElements;
    }

    public Document read(File file) {
        return getReader().read(file);
    }

    public void removeHandler(String str) {
        getReader().removeHandler(str);
    }

    public void removeObjectHandler(String str) {
        getReader().removeHandler(str);
    }

    public void resetHandlers() {
        getReader().resetHandlers();
    }

    public void setPruneElements(boolean z10) {
        this.pruneElements = z10;
        if (z10) {
            getReader().setDefaultHandler(new PruningElementHandler());
        }
    }

    public JAXBReader(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public Document read(File file, Charset charset) {
        try {
            return getReader().read(new InputStreamReader(new FileInputStream(file), charset));
        } catch (FileNotFoundException e10) {
            throw new DocumentException(e10.getMessage(), e10);
        } catch (JAXBRuntimeException e11) {
            Throwable cause = e11.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(InputSource inputSource) {
        try {
            return getReader().read(inputSource);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(InputStream inputStream) {
        try {
            return getReader().read(inputStream);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(InputStream inputStream, String str) {
        try {
            return getReader().read(inputStream);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(Reader reader) {
        try {
            return getReader().read(reader);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(Reader reader, String str) {
        try {
            return getReader().read(reader);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(String str) {
        try {
            return getReader().read(str);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(URL url) {
        try {
            return getReader().read(url);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    /* loaded from: classes3.dex */
    public class PruningElementHandler implements ElementHandler {
        public PruningElementHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            elementPath.getCurrent().detach();
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }

    /* loaded from: classes3.dex */
    public class UnmarshalElementHandler implements ElementHandler {
        private JAXBObjectHandler handler;
        private JAXBReader jaxbReader;

        public UnmarshalElementHandler(JAXBReader jAXBReader, JAXBObjectHandler jAXBObjectHandler) {
            this.jaxbReader = jAXBReader;
            this.handler = jAXBObjectHandler;
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }
}
