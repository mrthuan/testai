package lib.zj.office.fc.dom4j.io;

import androidx.activity.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.net.URL;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentException;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/* loaded from: classes3.dex */
public class SAXReader {
    private static final String SAX_DECL_HANDLER = "http://xml.org/sax/properties/declaration-handler";
    private static final String SAX_LEXICALHANDLER = "http://xml.org/sax/handlers/LexicalHandler";
    private static final String SAX_LEXICAL_HANDLER = "http://xml.org/sax/properties/lexical-handler";
    private static final String SAX_NAMESPACES = "http://xml.org/sax/features/namespaces";
    private static final String SAX_NAMESPACE_PREFIXES = "http://xml.org/sax/features/namespace-prefixes";
    private static final String SAX_STRING_INTERNING = "http://xml.org/sax/features/string-interning";
    private DispatchHandler dispatchHandler;
    private EntityResolver entityResolver;
    private ErrorHandler errorHandler;
    private DocumentFactory factory;
    private boolean validating;
    private XMLFilter xmlFilter;
    private XMLReader xmlReader;
    private boolean stringInternEnabled = true;
    private boolean includeInternalDTDDeclarations = false;
    private boolean includeExternalDTDDeclarations = false;
    private boolean mergeAdjacentText = false;
    private boolean stripWhitespaceText = false;
    private boolean ignoreComments = false;
    private String encoding = null;

    /* loaded from: classes3.dex */
    public static class SAXEntityResolver implements EntityResolver, Serializable {
        protected String uriPrefix;

        public SAXEntityResolver(String str) {
            this.uriPrefix = str;
        }

        @Override // org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) {
            if (str2 != null && str2.length() > 0 && this.uriPrefix != null && str2.indexOf(58) <= 0) {
                str2 = r.g(new StringBuilder(), this.uriPrefix, str2);
            }
            return new InputSource(str2);
        }
    }

    public SAXReader() {
    }

    public void addHandler(String str, ElementHandler elementHandler) {
        getDispatchHandler().addHandler(str, elementHandler);
    }

    public void configureReader(XMLReader xMLReader, DefaultHandler defaultHandler) {
        SAXHelper.setParserProperty(xMLReader, SAX_LEXICALHANDLER, defaultHandler);
        SAXHelper.setParserProperty(xMLReader, SAX_LEXICAL_HANDLER, defaultHandler);
        if (this.includeInternalDTDDeclarations || this.includeExternalDTDDeclarations) {
            SAXHelper.setParserProperty(xMLReader, SAX_DECL_HANDLER, defaultHandler);
        }
        SAXHelper.setParserFeature(xMLReader, SAX_NAMESPACES, true);
        SAXHelper.setParserFeature(xMLReader, SAX_NAMESPACE_PREFIXES, false);
        SAXHelper.setParserFeature(xMLReader, SAX_STRING_INTERNING, isStringInternEnabled());
        SAXHelper.setParserFeature(xMLReader, "http://xml.org/sax/features/use-locator2", true);
        try {
            xMLReader.setFeature("http://xml.org/sax/features/validation", isValidating());
            ErrorHandler errorHandler = this.errorHandler;
            if (errorHandler != null) {
                xMLReader.setErrorHandler(errorHandler);
            } else {
                xMLReader.setErrorHandler(defaultHandler);
            }
        } catch (Exception e10) {
            if (!isValidating()) {
                return;
            }
            throw new DocumentException("Validation not supported for XMLReader: " + xMLReader, e10);
        }
    }

    public SAXContentHandler createContentHandler(XMLReader xMLReader) {
        return new SAXContentHandler(getDocumentFactory(), this.dispatchHandler);
    }

    public EntityResolver createDefaultEntityResolver(String str) {
        String str2;
        int lastIndexOf;
        if (str != null && str.length() > 0 && (lastIndexOf = str.lastIndexOf(47)) > 0) {
            str2 = str.substring(0, lastIndexOf + 1);
        } else {
            str2 = null;
        }
        return new SAXEntityResolver(str2);
    }

    public XMLReader createXMLReader() {
        return SAXHelper.createXMLReader(isValidating());
    }

    public DispatchHandler getDispatchHandler() {
        if (this.dispatchHandler == null) {
            this.dispatchHandler = new DispatchHandler();
        }
        return this.dispatchHandler;
    }

    public DocumentFactory getDocumentFactory() {
        if (this.factory == null) {
            this.factory = DocumentFactory.getInstance();
        }
        return this.factory;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public XMLFilter getXMLFilter() {
        return this.xmlFilter;
    }

    public XMLReader getXMLReader() {
        if (this.xmlReader == null) {
            this.xmlReader = createXMLReader();
        }
        return this.xmlReader;
    }

    public XMLReader installXMLFilter(XMLReader xMLReader) {
        XMLFilter xMLFilter = getXMLFilter();
        if (xMLFilter != null) {
            XMLFilter xMLFilter2 = xMLFilter;
            while (true) {
                XMLReader parent = xMLFilter2.getParent();
                if (parent instanceof XMLFilter) {
                    xMLFilter2 = (XMLFilter) parent;
                } else {
                    xMLFilter2.setParent(xMLReader);
                    return xMLFilter;
                }
            }
        } else {
            return xMLReader;
        }
    }

    public boolean isIgnoreComments() {
        return this.ignoreComments;
    }

    public boolean isIncludeExternalDTDDeclarations() {
        return this.includeExternalDTDDeclarations;
    }

    public boolean isIncludeInternalDTDDeclarations() {
        return this.includeInternalDTDDeclarations;
    }

    public boolean isMergeAdjacentText() {
        return this.mergeAdjacentText;
    }

    public boolean isStringInternEnabled() {
        return this.stringInternEnabled;
    }

    public boolean isStripWhitespaceText() {
        return this.stripWhitespaceText;
    }

    public boolean isValidating() {
        return this.validating;
    }

    public Document read(File file) {
        try {
            InputSource inputSource = new InputSource(new FileInputStream(file));
            String str = this.encoding;
            if (str != null) {
                inputSource.setEncoding(str);
            }
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                StringBuffer stringBuffer = new StringBuffer("file://");
                if (!absolutePath.startsWith(File.separator)) {
                    stringBuffer.append(PackagingURIHelper.FORWARD_SLASH_STRING);
                }
                stringBuffer.append(absolutePath.replace('\\', PackagingURIHelper.FORWARD_SLASH_CHAR));
                inputSource.setSystemId(stringBuffer.toString());
            }
            return read(inputSource);
        } catch (FileNotFoundException e10) {
            throw new DocumentException(e10.getMessage(), e10);
        }
    }

    public void removeHandler(String str) {
        getDispatchHandler().removeHandler(str);
    }

    public void resetHandlers() {
        getDispatchHandler().resetHandlers();
    }

    public void setDefaultHandler(ElementHandler elementHandler) {
        getDispatchHandler().setDefaultHandler(elementHandler);
    }

    public void setDispatchHandler(DispatchHandler dispatchHandler) {
        this.dispatchHandler = dispatchHandler;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.factory = documentFactory;
    }

    public void setEncoding(String str) {
        this.encoding = str;
    }

    public void setEntityResolver(EntityResolver entityResolver) {
        this.entityResolver = entityResolver;
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    public void setFeature(String str, boolean z10) {
        getXMLReader().setFeature(str, z10);
    }

    public void setIgnoreComments(boolean z10) {
        this.ignoreComments = z10;
    }

    public void setIncludeExternalDTDDeclarations(boolean z10) {
        this.includeExternalDTDDeclarations = z10;
    }

    public void setIncludeInternalDTDDeclarations(boolean z10) {
        this.includeInternalDTDDeclarations = z10;
    }

    public void setMergeAdjacentText(boolean z10) {
        this.mergeAdjacentText = z10;
    }

    public void setProperty(String str, Object obj) {
        getXMLReader().setProperty(str, obj);
    }

    public void setStringInternEnabled(boolean z10) {
        this.stringInternEnabled = z10;
    }

    public void setStripWhitespaceText(boolean z10) {
        this.stripWhitespaceText = z10;
    }

    public void setValidation(boolean z10) {
        this.validating = z10;
    }

    public void setXMLFilter(XMLFilter xMLFilter) {
        this.xmlFilter = xMLFilter;
    }

    public void setXMLReader(XMLReader xMLReader) {
        this.xmlReader = xMLReader;
    }

    public void setXMLReaderClassName(String str) {
        setXMLReader(XMLReaderFactory.createXMLReader(str));
    }

    public SAXReader(boolean z10) {
        this.validating = z10;
    }

    public Document read(URL url) {
        InputSource inputSource = new InputSource(url.toExternalForm());
        String str = this.encoding;
        if (str != null) {
            inputSource.setEncoding(str);
        }
        return read(inputSource);
    }

    public SAXReader(DocumentFactory documentFactory) {
        this.factory = documentFactory;
    }

    public Document read(String str) {
        InputSource inputSource = new InputSource(str);
        String str2 = this.encoding;
        if (str2 != null) {
            inputSource.setEncoding(str2);
        }
        return read(inputSource);
    }

    public Document read(InputStream inputStream) {
        InputSource inputSource = new InputSource(inputStream);
        String str = this.encoding;
        if (str != null) {
            inputSource.setEncoding(str);
        }
        return read(inputSource);
    }

    public Document read(Reader reader) {
        InputSource inputSource = new InputSource(reader);
        String str = this.encoding;
        if (str != null) {
            inputSource.setEncoding(str);
        }
        return read(inputSource);
    }

    public SAXReader(DocumentFactory documentFactory, boolean z10) {
        this.factory = documentFactory;
        this.validating = z10;
    }

    public Document read(InputStream inputStream, String str) {
        InputSource inputSource = new InputSource(inputStream);
        inputSource.setSystemId(str);
        String str2 = this.encoding;
        if (str2 != null) {
            inputSource.setEncoding(str2);
        }
        return read(inputSource);
    }

    public Document read(Reader reader, String str) {
        InputSource inputSource = new InputSource(reader);
        inputSource.setSystemId(str);
        String str2 = this.encoding;
        if (str2 != null) {
            inputSource.setEncoding(str2);
        }
        return read(inputSource);
    }

    public SAXReader(XMLReader xMLReader) {
        this.xmlReader = xMLReader;
    }

    public Document read(InputSource inputSource) {
        try {
            XMLReader installXMLFilter = installXMLFilter(getXMLReader());
            EntityResolver entityResolver = this.entityResolver;
            if (entityResolver == null) {
                entityResolver = createDefaultEntityResolver(inputSource.getSystemId());
                this.entityResolver = entityResolver;
            }
            installXMLFilter.setEntityResolver(entityResolver);
            SAXContentHandler createContentHandler = createContentHandler(installXMLFilter);
            createContentHandler.setEntityResolver(entityResolver);
            createContentHandler.setInputSource(inputSource);
            boolean isIncludeInternalDTDDeclarations = isIncludeInternalDTDDeclarations();
            boolean isIncludeExternalDTDDeclarations = isIncludeExternalDTDDeclarations();
            createContentHandler.setIncludeInternalDTDDeclarations(isIncludeInternalDTDDeclarations);
            createContentHandler.setIncludeExternalDTDDeclarations(isIncludeExternalDTDDeclarations);
            createContentHandler.setMergeAdjacentText(isMergeAdjacentText());
            createContentHandler.setStripWhitespaceText(isStripWhitespaceText());
            createContentHandler.setIgnoreComments(isIgnoreComments());
            installXMLFilter.setContentHandler(createContentHandler);
            configureReader(installXMLFilter, createContentHandler);
            installXMLFilter.parse(inputSource);
            return createContentHandler.getDocument();
        } catch (Exception e10) {
            e10.printStackTrace();
            if (e10 instanceof SAXParseException) {
                SAXParseException sAXParseException = (SAXParseException) e10;
                String systemId = sAXParseException.getSystemId();
                if (systemId == null) {
                    systemId = "";
                }
                throw new DocumentException("Error on line " + sAXParseException.getLineNumber() + " of document " + systemId + " : " + sAXParseException.getMessage(), e10);
            }
            throw new DocumentException(e10.getMessage(), e10);
        }
    }

    public SAXReader(XMLReader xMLReader, boolean z10) {
        this.xmlReader = xMLReader;
        this.validating = z10;
    }

    public SAXReader(String str) {
        if (str != null) {
            this.xmlReader = XMLReaderFactory.createXMLReader(str);
        }
    }

    public SAXReader(String str, boolean z10) {
        if (str != null) {
            this.xmlReader = XMLReaderFactory.createXMLReader(str);
        }
        this.validating = z10;
    }
}
