package lib.zj.office.fc.dom4j.io;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.Branch;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.DocumentType;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.dtd.AttributeDecl;
import lib.zj.office.fc.dom4j.dtd.ElementDecl;
import lib.zj.office.fc.dom4j.dtd.ExternalEntityDecl;
import lib.zj.office.fc.dom4j.dtd.InternalEntityDecl;
import lib.zj.office.fc.dom4j.tree.AbstractElement;
import lib.zj.office.fc.dom4j.tree.NamespaceStack;
import lib.zj.office.system.AbortReaderError;
import org.xml.sax.Attributes;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes3.dex */
public class SAXContentHandler extends DefaultHandler implements LexicalHandler, DeclHandler, DTDHandler {
    private Map availableNamespaceMap;
    private StringBuffer cdataText;
    private Element currentElement;
    private int declaredNamespaceIndex;
    private List declaredNamespaceList;
    private Document document;
    private DocumentFactory documentFactory;
    private ElementHandler elementHandler;
    private ElementStack elementStack;
    private String entity;
    private int entityLevel;
    private EntityResolver entityResolver;
    private List externalDTDDeclarations;
    private boolean ignoreComments;
    private boolean includeExternalDTDDeclarations;
    private boolean includeInternalDTDDeclarations;
    private InputSource inputSource;
    private boolean insideCDATASection;
    private boolean insideDTDSection;
    private List internalDTDDeclarations;
    private boolean internalDTDsubset;
    private Locator locator;
    private boolean mergeAdjacentText;
    private NamespaceStack namespaceStack;
    private boolean stripWhitespaceText;
    private StringBuffer textBuffer;
    private boolean textInTextBuffer;

    public SAXContentHandler() {
        this(DocumentFactory.getInstance());
    }

    private String getEncoding() {
        Locator locator = this.locator;
        if (locator == null) {
            return null;
        }
        try {
            Method method = locator.getClass().getMethod("getEncoding", new Class[0]);
            if (method != null) {
                return (String) method.invoke(this.locator, null);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public void addAttributes(Element element, Attributes attributes) {
        if (element instanceof AbstractElement) {
            ((AbstractElement) element).setAttributes(attributes, this.namespaceStack, false);
            return;
        }
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String qName = attributes.getQName(i10);
            if (!qName.startsWith("xmlns")) {
                String uri = attributes.getURI(i10);
                String localName = attributes.getLocalName(i10);
                element.addAttribute(this.namespaceStack.getAttributeQName(uri, localName, qName), attributes.getValue(i10));
            }
        }
    }

    public void addDTDDeclaration(Object obj) {
        if (this.internalDTDDeclarations == null) {
            this.internalDTDDeclarations = new ArrayList();
        }
        this.internalDTDDeclarations.add(obj);
    }

    public void addDeclaredNamespaces(Element element) {
        element.getNamespace();
        int size = this.namespaceStack.size();
        while (true) {
            int i10 = this.declaredNamespaceIndex;
            if (i10 < size) {
                element.add(this.namespaceStack.getNamespace(i10));
                this.declaredNamespaceIndex++;
            } else {
                return;
            }
        }
    }

    public void addExternalDTDDeclaration(Object obj) {
        if (this.externalDTDDeclarations == null) {
            this.externalDTDDeclarations = new ArrayList();
        }
        this.externalDTDDeclarations.add(obj);
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void attributeDecl(String str, String str2, String str3, String str4, String str5) {
        if (this.internalDTDsubset) {
            if (this.includeInternalDTDDeclarations) {
                addDTDDeclaration(new AttributeDecl(str, str2, str3, str4, str5));
            }
        } else if (this.includeExternalDTDDeclarations) {
            addExternalDTDDeclaration(new AttributeDecl(str, str2, str3, str4, str5));
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) {
        Element element;
        if (i11 != 0 && (element = this.currentElement) != null) {
            if (this.entity != null) {
                if (this.mergeAdjacentText && this.textInTextBuffer) {
                    completeCurrentTextNode();
                }
                this.currentElement.addEntity(this.entity, new String(cArr, i10, i11));
                this.entity = null;
            } else if (this.insideCDATASection) {
                if (this.mergeAdjacentText && this.textInTextBuffer) {
                    completeCurrentTextNode();
                }
                this.cdataText.append(new String(cArr, i10, i11));
            } else if (this.mergeAdjacentText) {
                this.textBuffer.append(cArr, i10, i11);
                this.textInTextBuffer = true;
            } else {
                element.addText(new String(cArr, i10, i11));
            }
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i10, int i11) {
        if (!this.ignoreComments) {
            if (this.mergeAdjacentText && this.textInTextBuffer) {
                completeCurrentTextNode();
            }
            String str = new String(cArr, i10, i11);
            if (!this.insideDTDSection && str.length() > 0) {
                Element element = this.currentElement;
                if (element != null) {
                    element.addComment(str);
                } else {
                    getDocument().addComment(str);
                }
            }
        }
    }

    public void completeCurrentTextNode() {
        boolean z10;
        if (this.stripWhitespaceText) {
            int length = this.textBuffer.length();
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (!Character.isWhitespace(this.textBuffer.charAt(i10))) {
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.currentElement.addText(this.textBuffer.toString());
            }
        } else {
            this.currentElement.addText(this.textBuffer.toString());
        }
        this.textBuffer.setLength(0);
        this.textInTextBuffer = false;
    }

    public Document createDocument() {
        Document createDocument = this.documentFactory.createDocument(getEncoding());
        createDocument.setEntityResolver(this.entityResolver);
        InputSource inputSource = this.inputSource;
        if (inputSource != null) {
            createDocument.setName(inputSource.getSystemId());
        }
        return createDocument;
    }

    public ElementStack createElementStack() {
        return new ElementStack();
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void elementDecl(String str, String str2) {
        if (this.internalDTDsubset) {
            if (this.includeInternalDTDDeclarations) {
                addDTDDeclaration(new ElementDecl(str, str2));
            }
        } else if (this.includeExternalDTDDeclarations) {
            addExternalDTDDeclaration(new ElementDecl(str, str2));
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endCDATA() {
        this.insideCDATASection = false;
        this.currentElement.addCDATA(this.cdataText.toString());
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endDTD() {
        this.insideDTDSection = false;
        DocumentType docType = getDocument().getDocType();
        if (docType != null) {
            List list = this.internalDTDDeclarations;
            if (list != null) {
                docType.setInternalDeclarations(list);
            }
            List list2 = this.externalDTDDeclarations;
            if (list2 != null) {
                docType.setExternalDeclarations(list2);
            }
        }
        this.internalDTDDeclarations = null;
        this.externalDTDDeclarations = null;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() {
        this.namespaceStack.clear();
        this.elementStack.clear();
        this.currentElement = null;
        this.textBuffer = null;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (this.mergeAdjacentText && this.textInTextBuffer) {
            completeCurrentTextNode();
        }
        ElementHandler elementHandler = this.elementHandler;
        if (elementHandler != null && this.currentElement != null) {
            try {
                elementHandler.onEnd(this.elementStack);
            } catch (AbortReaderError e10) {
                e10.printStackTrace();
            }
        }
        this.elementStack.popElement();
        this.currentElement = this.elementStack.peekElement();
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) {
        int i10 = this.entityLevel - 1;
        this.entityLevel = i10;
        this.entity = null;
        if (i10 == 0) {
            this.internalDTDsubset = true;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) {
        this.namespaceStack.pop(str);
        this.declaredNamespaceIndex = this.namespaceStack.size();
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void externalEntityDecl(String str, String str2, String str3) {
        ExternalEntityDecl externalEntityDecl = new ExternalEntityDecl(str, str2, str3);
        if (this.internalDTDsubset) {
            if (this.includeInternalDTDDeclarations) {
                addDTDDeclaration(externalEntityDecl);
            }
        } else if (this.includeExternalDTDDeclarations) {
            addExternalDTDDeclaration(externalEntityDecl);
        }
    }

    public Document getDocument() {
        if (this.document == null) {
            this.document = createDocument();
        }
        return this.document;
    }

    public ElementStack getElementStack() {
        return this.elementStack;
    }

    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    public InputSource getInputSource() {
        return this.inputSource;
    }

    @Override // org.xml.sax.ext.DeclHandler
    public void internalEntityDecl(String str, String str2) {
        if (this.internalDTDsubset) {
            if (this.includeInternalDTDDeclarations) {
                addDTDDeclaration(new InternalEntityDecl(str, str2));
            }
        } else if (this.includeExternalDTDDeclarations) {
            addExternalDTDDeclaration(new InternalEntityDecl(str, str2));
        }
    }

    public boolean isIgnorableEntity(String str) {
        if (!"amp".equals(str) && !"apos".equals(str) && !"gt".equals(str) && !"lt".equals(str) && !"quot".equals(str)) {
            return false;
        }
        return true;
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

    public boolean isStripWhitespaceText() {
        return this.stripWhitespaceText;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) {
        if (this.mergeAdjacentText && this.textInTextBuffer) {
            completeCurrentTextNode();
        }
        Element element = this.currentElement;
        if (element != null) {
            element.addProcessingInstruction(str, str2);
        } else {
            getDocument().addProcessingInstruction(str, str2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
    }

    public void setElementStack(ElementStack elementStack) {
        this.elementStack = elementStack;
    }

    public void setEntityResolver(EntityResolver entityResolver) {
        this.entityResolver = entityResolver;
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

    public void setInputSource(InputSource inputSource) {
        this.inputSource = inputSource;
    }

    public void setMergeAdjacentText(boolean z10) {
        this.mergeAdjacentText = z10;
    }

    public void setStripWhitespaceText(boolean z10) {
        this.stripWhitespaceText = z10;
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startCDATA() {
        this.insideCDATASection = true;
        this.cdataText = new StringBuffer();
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startDTD(String str, String str2, String str3) {
        getDocument().addDocType(str, str2, str3);
        this.insideDTDSection = true;
        this.internalDTDsubset = true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() {
        this.document = null;
        this.currentElement = null;
        this.elementStack.clear();
        ElementHandler elementHandler = this.elementHandler;
        if (elementHandler != null && (elementHandler instanceof DispatchHandler)) {
            this.elementStack.setDispatchHandler((DispatchHandler) elementHandler);
        }
        this.namespaceStack.clear();
        this.declaredNamespaceIndex = 0;
        if (this.mergeAdjacentText && this.textBuffer == null) {
            this.textBuffer = new StringBuffer();
        }
        this.textInTextBuffer = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.mergeAdjacentText && this.textInTextBuffer) {
            completeCurrentTextNode();
        }
        QName qName = this.namespaceStack.getQName(str, str2, str3);
        Branch branch = this.currentElement;
        if (branch == null) {
            branch = getDocument();
        }
        Element addElement = branch.addElement(qName);
        addDeclaredNamespaces(addElement);
        addAttributes(addElement, attributes);
        this.elementStack.pushElement(addElement);
        this.currentElement = addElement;
        this.entity = null;
        ElementHandler elementHandler = this.elementHandler;
        if (elementHandler != null) {
            elementHandler.onStart(this.elementStack);
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) {
        this.entityLevel++;
        this.entity = null;
        if (!this.insideDTDSection && !isIgnorableEntity(str)) {
            this.entity = str;
        }
        this.internalDTDsubset = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) {
        this.namespaceStack.push(str, str2);
    }

    public SAXContentHandler(DocumentFactory documentFactory) {
        this(documentFactory, null);
    }

    public SAXContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler) {
        this(documentFactory, elementHandler, null);
        this.elementStack = createElementStack();
    }

    public SAXContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler, ElementStack elementStack) {
        this.availableNamespaceMap = new HashMap();
        this.declaredNamespaceList = new ArrayList();
        this.includeInternalDTDDeclarations = false;
        this.includeExternalDTDDeclarations = false;
        this.internalDTDsubset = false;
        this.mergeAdjacentText = false;
        this.textInTextBuffer = false;
        this.ignoreComments = false;
        this.stripWhitespaceText = false;
        this.documentFactory = documentFactory;
        this.elementHandler = elementHandler;
        this.elementStack = elementStack;
        this.namespaceStack = new NamespaceStack(documentFactory);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void notationDecl(String str, String str2, String str3) {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) {
    }
}
