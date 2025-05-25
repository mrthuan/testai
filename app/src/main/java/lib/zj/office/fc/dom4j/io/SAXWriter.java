package lib.zj.office.fc.dom4j.io;

import androidx.appcompat.view.menu.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.Branch;
import lib.zj.office.fc.dom4j.CDATA;
import lib.zj.office.fc.dom4j.CharacterData;
import lib.zj.office.fc.dom4j.Comment;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentType;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Entity;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.ProcessingInstruction;
import lib.zj.office.fc.dom4j.Text;
import lib.zj.office.fc.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

/* loaded from: classes3.dex */
public class SAXWriter implements XMLReader {
    protected static final String FEATURE_NAMESPACES = "http://xml.org/sax/features/namespaces";
    protected static final String FEATURE_NAMESPACE_PREFIXES = "http://xml.org/sax/features/namespace-prefixes";
    protected static final String[] LEXICAL_HANDLER_NAMES = {"http://xml.org/sax/properties/lexical-handler", "http://xml.org/sax/handlers/LexicalHandler"};
    private AttributesImpl attributes;
    private ContentHandler contentHandler;
    private boolean declareNamespaceAttributes;
    private DTDHandler dtdHandler;
    private EntityResolver entityResolver;
    private ErrorHandler errorHandler;
    private Map features;
    private LexicalHandler lexicalHandler;
    private Map properties;

    public SAXWriter() {
        this.attributes = new AttributesImpl();
        this.features = new HashMap();
        HashMap hashMap = new HashMap();
        this.properties = hashMap;
        hashMap.put(FEATURE_NAMESPACE_PREFIXES, Boolean.FALSE);
        this.properties.put(FEATURE_NAMESPACE_PREFIXES, Boolean.TRUE);
    }

    public AttributesImpl addNamespaceAttribute(AttributesImpl attributesImpl, Namespace namespace) {
        String str;
        if (this.declareNamespaceAttributes) {
            if (attributesImpl == null) {
                attributesImpl = new AttributesImpl();
            }
            String prefix = namespace.getPrefix();
            if (prefix != null && prefix.length() > 0) {
                str = "xmlns:".concat(prefix);
            } else {
                str = "xmlns";
            }
            attributesImpl.addAttribute("", prefix, str, "CDATA", namespace.getURI());
        }
        return attributesImpl;
    }

    public Attributes createAttributes(Element element, Attributes attributes) {
        this.attributes.clear();
        if (attributes != null) {
            this.attributes.setAttributes(attributes);
        }
        Iterator attributeIterator = element.attributeIterator();
        while (attributeIterator.hasNext()) {
            Attribute attribute = (Attribute) attributeIterator.next();
            this.attributes.addAttribute(attribute.getNamespaceURI(), attribute.getName(), attribute.getQualifiedName(), "CDATA", attribute.getValue());
        }
        return this.attributes;
    }

    public void documentLocator(Document document) {
        String str;
        String str2;
        LocatorImpl locatorImpl = new LocatorImpl();
        DocumentType docType = document.getDocType();
        if (docType != null) {
            str = docType.getPublicID();
            str2 = docType.getSystemID();
        } else {
            str = null;
            str2 = null;
        }
        if (str != null) {
            locatorImpl.setPublicId(str);
        }
        if (str2 != null) {
            locatorImpl.setSystemId(str2);
        }
        locatorImpl.setLineNumber(-1);
        locatorImpl.setColumnNumber(-1);
        this.contentHandler.setDocumentLocator(locatorImpl);
    }

    public void endDocument() {
        this.contentHandler.endDocument();
    }

    public void endElement(Element element) {
        this.contentHandler.endElement(element.getNamespaceURI(), element.getName(), element.getQualifiedName());
    }

    public void endPrefixMapping(NamespaceStack namespaceStack, int i10) {
        while (namespaceStack.size() > i10) {
            Namespace pop = namespaceStack.pop();
            if (pop != null) {
                this.contentHandler.endPrefixMapping(pop.getPrefix());
            }
        }
    }

    public void entityResolver(Document document) {
        DocumentType docType;
        if (this.entityResolver != null && (docType = document.getDocType()) != null) {
            String publicID = docType.getPublicID();
            String systemID = docType.getSystemID();
            if (publicID != null || systemID != null) {
                try {
                    this.entityResolver.resolveEntity(publicID, systemID);
                } catch (IOException e10) {
                    throw new SAXException(d.d("Could not resolve publicID: ", publicID, " systemID: ", systemID), e10);
                }
            }
        }
    }

    @Override // org.xml.sax.XMLReader
    public ContentHandler getContentHandler() {
        return this.contentHandler;
    }

    @Override // org.xml.sax.XMLReader
    public DTDHandler getDTDHandler() {
        return this.dtdHandler;
    }

    @Override // org.xml.sax.XMLReader
    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    @Override // org.xml.sax.XMLReader
    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    @Override // org.xml.sax.XMLReader
    public boolean getFeature(String str) {
        Boolean bool = (Boolean) this.features.get(str);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public LexicalHandler getLexicalHandler() {
        return this.lexicalHandler;
    }

    @Override // org.xml.sax.XMLReader
    public Object getProperty(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = LEXICAL_HANDLER_NAMES;
            if (i10 < strArr.length) {
                if (strArr[i10].equals(str)) {
                    return getLexicalHandler();
                }
                i10++;
            } else {
                return this.properties.get(str);
            }
        }
    }

    public boolean isDeclareNamespaceAttributes() {
        return this.declareNamespaceAttributes;
    }

    public boolean isIgnoreableNamespace(Namespace namespace, NamespaceStack namespaceStack) {
        String uri;
        if (namespace.equals(Namespace.NO_NAMESPACE) || namespace.equals(Namespace.XML_NAMESPACE) || (uri = namespace.getURI()) == null || uri.length() <= 0) {
            return true;
        }
        return namespaceStack.contains(namespace);
    }

    @Override // org.xml.sax.XMLReader
    public void parse(String str) {
        throw new SAXNotSupportedException("This XMLReader can only accept <dom4j> InputSource objects");
    }

    @Override // org.xml.sax.XMLReader
    public void setContentHandler(ContentHandler contentHandler) {
        this.contentHandler = contentHandler;
    }

    @Override // org.xml.sax.XMLReader
    public void setDTDHandler(DTDHandler dTDHandler) {
        this.dtdHandler = dTDHandler;
    }

    public void setDeclareNamespaceAttributes(boolean z10) {
        this.declareNamespaceAttributes = z10;
    }

    @Override // org.xml.sax.XMLReader
    public void setEntityResolver(EntityResolver entityResolver) {
        this.entityResolver = entityResolver;
    }

    @Override // org.xml.sax.XMLReader
    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    @Override // org.xml.sax.XMLReader
    public void setFeature(String str, boolean z10) {
        Boolean bool;
        if (FEATURE_NAMESPACE_PREFIXES.equals(str)) {
            setDeclareNamespaceAttributes(z10);
        } else if (FEATURE_NAMESPACE_PREFIXES.equals(str) && !z10) {
            throw new SAXNotSupportedException("Namespace feature is always supported in dom4j");
        }
        Map map = this.features;
        if (z10) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        map.put(str, bool);
    }

    public void setLexicalHandler(LexicalHandler lexicalHandler) {
        this.lexicalHandler = lexicalHandler;
    }

    @Override // org.xml.sax.XMLReader
    public void setProperty(String str, Object obj) {
        int i10 = 0;
        while (true) {
            String[] strArr = LEXICAL_HANDLER_NAMES;
            if (i10 < strArr.length) {
                if (strArr[i10].equals(str)) {
                    setLexicalHandler((LexicalHandler) obj);
                    return;
                }
                i10++;
            } else {
                this.properties.put(str, obj);
                return;
            }
        }
    }

    public void setXMLReader(XMLReader xMLReader) {
        setContentHandler(xMLReader.getContentHandler());
        setDTDHandler(xMLReader.getDTDHandler());
        setEntityResolver(xMLReader.getEntityResolver());
        setErrorHandler(xMLReader.getErrorHandler());
    }

    public void startDocument() {
        this.contentHandler.startDocument();
    }

    public void startElement(Element element, AttributesImpl attributesImpl) {
        this.contentHandler.startElement(element.getNamespaceURI(), element.getName(), element.getQualifiedName(), createAttributes(element, attributesImpl));
    }

    public AttributesImpl startPrefixMapping(Element element, NamespaceStack namespaceStack) {
        Namespace namespace = element.getNamespace();
        AttributesImpl attributesImpl = null;
        if (namespace != null && !isIgnoreableNamespace(namespace, namespaceStack)) {
            namespaceStack.push(namespace);
            this.contentHandler.startPrefixMapping(namespace.getPrefix(), namespace.getURI());
            attributesImpl = addNamespaceAttribute(null, namespace);
        }
        List declaredNamespaces = element.declaredNamespaces();
        int size = declaredNamespaces.size();
        for (int i10 = 0; i10 < size; i10++) {
            Namespace namespace2 = (Namespace) declaredNamespaces.get(i10);
            if (!isIgnoreableNamespace(namespace2, namespaceStack)) {
                namespaceStack.push(namespace2);
                this.contentHandler.startPrefixMapping(namespace2.getPrefix(), namespace2.getURI());
                attributesImpl = addNamespaceAttribute(attributesImpl, namespace2);
            }
        }
        return attributesImpl;
    }

    public void write(Node node) {
        switch (node.getNodeType()) {
            case 1:
                write((Element) node);
                return;
            case 2:
                write((Attribute) node);
                return;
            case 3:
                write(node.getText());
                return;
            case 4:
                write((CDATA) node);
                return;
            case 5:
                write((Entity) node);
                return;
            case 6:
            case 11:
            case 12:
            default:
                throw new SAXException("Invalid node type: " + node);
            case 7:
                write((ProcessingInstruction) node);
                return;
            case 8:
                write((Comment) node);
                return;
            case 9:
                write((Document) node);
                return;
            case 10:
                write((DocumentType) node);
                return;
            case 13:
                return;
        }
    }

    public void writeClose(Element element) {
        endElement(element);
    }

    public void writeContent(Branch branch, NamespaceStack namespaceStack) {
        Iterator nodeIterator = branch.nodeIterator();
        while (nodeIterator.hasNext()) {
            Object next = nodeIterator.next();
            if (next instanceof Element) {
                write((Element) next, namespaceStack);
            } else if (next instanceof CharacterData) {
                if (next instanceof Text) {
                    write(((Text) next).getText());
                } else if (next instanceof CDATA) {
                    write((CDATA) next);
                } else if (next instanceof Comment) {
                    write((Comment) next);
                } else {
                    throw new SAXException("Invalid Node in DOM4J content: " + next + " of type: " + next.getClass());
                }
            } else if (next instanceof String) {
                write((String) next);
            } else if (next instanceof Entity) {
                write((Entity) next);
            } else if (next instanceof ProcessingInstruction) {
                write((ProcessingInstruction) next);
            } else if (next instanceof Namespace) {
                write((Namespace) next);
            } else {
                throw new SAXException("Invalid Node in DOM4J content: " + next);
            }
        }
    }

    public void writeOpen(Element element) {
        startElement(element, null);
    }

    @Override // org.xml.sax.XMLReader
    public void parse(InputSource inputSource) {
        if (inputSource instanceof DocumentInputSource) {
            write(((DocumentInputSource) inputSource).getDocument());
            return;
        }
        throw new SAXNotSupportedException("This XMLReader can only accept <dom4j> InputSource objects");
    }

    public SAXWriter(ContentHandler contentHandler) {
        this();
        this.contentHandler = contentHandler;
    }

    public SAXWriter(ContentHandler contentHandler, LexicalHandler lexicalHandler) {
        this();
        this.contentHandler = contentHandler;
        this.lexicalHandler = lexicalHandler;
    }

    public SAXWriter(ContentHandler contentHandler, LexicalHandler lexicalHandler, EntityResolver entityResolver) {
        this();
        this.contentHandler = contentHandler;
        this.lexicalHandler = lexicalHandler;
        this.entityResolver = entityResolver;
    }

    public void write(Document document) {
        if (document != null) {
            checkForNullHandlers();
            documentLocator(document);
            startDocument();
            entityResolver(document);
            dtdHandler(document);
            writeContent(document, new NamespaceStack());
            endDocument();
        }
    }

    public void write(Element element) {
        write(element, new NamespaceStack());
    }

    public void write(String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.contentHandler.characters(charArray, 0, charArray.length);
        }
    }

    public void checkForNullHandlers() {
    }

    public void write(CDATA cdata) {
        String text = cdata.getText();
        LexicalHandler lexicalHandler = this.lexicalHandler;
        if (lexicalHandler != null) {
            lexicalHandler.startCDATA();
            write(text);
            this.lexicalHandler.endCDATA();
            return;
        }
        write(text);
    }

    public void write(Comment comment) {
        if (this.lexicalHandler != null) {
            char[] charArray = comment.getText().toCharArray();
            this.lexicalHandler.comment(charArray, 0, charArray.length);
        }
    }

    public void dtdHandler(Document document) {
    }

    public void write(Entity entity) {
        String text = entity.getText();
        if (this.lexicalHandler != null) {
            String name = entity.getName();
            this.lexicalHandler.startEntity(name);
            write(text);
            this.lexicalHandler.endEntity(name);
            return;
        }
        write(text);
    }

    public void write(ProcessingInstruction processingInstruction) {
        this.contentHandler.processingInstruction(processingInstruction.getTarget(), processingInstruction.getText());
    }

    public void write(Element element, NamespaceStack namespaceStack) {
        int size = namespaceStack.size();
        startElement(element, startPrefixMapping(element, namespaceStack));
        writeContent(element, namespaceStack);
        endElement(element);
        endPrefixMapping(namespaceStack, size);
    }
}
