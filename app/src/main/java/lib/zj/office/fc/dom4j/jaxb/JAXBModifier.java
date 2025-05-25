package lib.zj.office.fc.dom4j.jaxb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentException;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.ElementModifier;
import lib.zj.office.fc.dom4j.io.OutputFormat;
import lib.zj.office.fc.dom4j.io.SAXModifier;
import lib.zj.office.fc.dom4j.io.XMLWriter;
import org.xml.sax.InputSource;

/* loaded from: classes3.dex */
public class JAXBModifier extends JAXBSupport {
    private SAXModifier modifier;
    private HashMap modifiers;
    private OutputFormat outputFormat;
    private boolean pruneElements;
    private XMLWriter xmlWriter;

    /* loaded from: classes3.dex */
    public class JAXBElementModifier implements ElementModifier {
        private JAXBModifier jaxbModifier;
        private JAXBObjectModifier objectModifier;

        public JAXBElementModifier(JAXBModifier jAXBModifier, JAXBObjectModifier jAXBObjectModifier) {
            this.jaxbModifier = jAXBModifier;
            this.objectModifier = jAXBObjectModifier;
        }

        @Override // lib.zj.office.fc.dom4j.io.ElementModifier
        public Element modifyElement(Element element) {
            return null;
        }
    }

    public JAXBModifier(String str) {
        super(str);
        this.modifiers = new HashMap();
        this.outputFormat = new OutputFormat();
    }

    private XMLWriter createXMLWriter() {
        if (this.xmlWriter == null) {
            this.xmlWriter = new XMLWriter(this.outputFormat);
        }
        return this.xmlWriter;
    }

    private SAXModifier getModifier() {
        if (this.modifier == null) {
            this.modifier = new SAXModifier(isPruneElements());
        }
        return this.modifier;
    }

    private XMLWriter getXMLWriter() {
        return this.xmlWriter;
    }

    private SAXModifier installModifier() {
        SAXModifier sAXModifier = new SAXModifier(isPruneElements());
        this.modifier = sAXModifier;
        sAXModifier.resetModifiers();
        for (Map.Entry entry : this.modifiers.entrySet()) {
            getModifier().addModifier((String) entry.getKey(), new JAXBElementModifier(this, (JAXBObjectModifier) entry.getValue()));
        }
        this.modifier.setXMLWriter(getXMLWriter());
        return this.modifier;
    }

    public void addObjectModifier(String str, JAXBObjectModifier jAXBObjectModifier) {
        this.modifiers.put(str, jAXBObjectModifier);
    }

    public boolean isPruneElements() {
        return this.pruneElements;
    }

    public Document modify(File file) {
        return installModifier().modify(file);
    }

    public void removeObjectModifier(String str) {
        this.modifiers.remove(str);
        getModifier().removeModifier(str);
    }

    public void resetObjectModifiers() {
        this.modifiers.clear();
        getModifier().resetModifiers();
    }

    public void setOutput(File file) {
        createXMLWriter().setOutputStream(new FileOutputStream(file));
    }

    public void setPruneElements(boolean z10) {
        this.pruneElements = z10;
    }

    public Document modify(File file, Charset charset) {
        try {
            return installModifier().modify(new InputStreamReader(new FileInputStream(file), charset));
        } catch (FileNotFoundException e10) {
            throw new DocumentException(e10.getMessage(), e10);
        } catch (JAXBRuntimeException e11) {
            Throwable cause = e11.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public void setOutput(OutputStream outputStream) {
        createXMLWriter().setOutputStream(outputStream);
    }

    public void setOutput(Writer writer) {
        createXMLWriter().setWriter(writer);
    }

    public JAXBModifier(String str, ClassLoader classLoader) {
        super(str, classLoader);
        this.modifiers = new HashMap();
        this.outputFormat = new OutputFormat();
    }

    public JAXBModifier(String str, OutputFormat outputFormat) {
        super(str);
        this.modifiers = new HashMap();
        this.outputFormat = outputFormat;
    }

    public Document modify(InputSource inputSource) {
        try {
            return installModifier().modify(inputSource);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public JAXBModifier(String str, ClassLoader classLoader, OutputFormat outputFormat) {
        super(str, classLoader);
        this.modifiers = new HashMap();
        this.outputFormat = outputFormat;
    }

    public Document modify(InputStream inputStream) {
        try {
            return installModifier().modify(inputStream);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(InputStream inputStream, String str) {
        try {
            return installModifier().modify(inputStream);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(Reader reader) {
        try {
            return installModifier().modify(reader);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(Reader reader, String str) {
        try {
            return installModifier().modify(reader);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(String str) {
        try {
            return installModifier().modify(str);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(URL url) {
        try {
            return installModifier().modify(url);
        } catch (JAXBRuntimeException e10) {
            Throwable cause = e10.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }
}
