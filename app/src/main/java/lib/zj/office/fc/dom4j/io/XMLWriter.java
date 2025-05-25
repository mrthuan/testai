package lib.zj.office.fc.dom4j.io;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.CDATA;
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
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.XMLFilterImpl;

/* loaded from: classes3.dex */
public class XMLWriter extends XMLFilterImpl implements LexicalHandler {
    private static final String PAD_TEXT = " ";
    private boolean autoFlush;
    private StringBuffer buffer;
    private boolean charsAdded;
    private boolean escapeText;
    private OutputFormat format;
    private boolean inDTD;
    private int indentLevel;
    private char lastChar;
    private boolean lastElementClosed;
    protected int lastOutputNodeType;
    private LexicalHandler lexicalHandler;
    private int maximumAllowedCharacter;
    private NamespaceStack namespaceStack;
    private Map namespacesMap;
    protected boolean preserve;
    private boolean resolveEntityRefs;
    private boolean showCommentsInDTDs;
    protected Writer writer;
    protected static final String[] LEXICAL_HANDLER_NAMES = {"http://xml.org/sax/properties/lexical-handler", "http://xml.org/sax/handlers/LexicalHandler"};
    protected static final OutputFormat DEFAULT_FORMAT = new OutputFormat();

    public XMLWriter(Writer writer) {
        this(writer, DEFAULT_FORMAT);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) {
        if (cArr != null && cArr.length != 0 && i11 > 0) {
            try {
                String valueOf = String.valueOf(cArr, i10, i11);
                if (this.escapeText) {
                    valueOf = escapeElementEntities(valueOf);
                }
                if (this.format.isTrimText()) {
                    if (this.lastOutputNodeType == 3 && !this.charsAdded) {
                        this.writer.write(32);
                    } else if (this.charsAdded && Character.isWhitespace(this.lastChar)) {
                        this.writer.write(32);
                    } else if (this.lastOutputNodeType == 1 && this.format.isPadText() && this.lastElementClosed && Character.isWhitespace(cArr[0])) {
                        this.writer.write(PAD_TEXT);
                    }
                    String str = "";
                    StringTokenizer stringTokenizer = new StringTokenizer(valueOf);
                    while (stringTokenizer.hasMoreTokens()) {
                        this.writer.write(str);
                        this.writer.write(stringTokenizer.nextToken());
                        str = PAD_TEXT;
                    }
                } else {
                    this.writer.write(valueOf);
                }
                this.charsAdded = true;
                this.lastChar = cArr[(i10 + i11) - 1];
                this.lastOutputNodeType = 3;
                super.characters(cArr, i10, i11);
            } catch (IOException e10) {
                handleException(e10);
            }
        }
    }

    public void close() {
        this.writer.close();
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i10, int i11) {
        if (this.showCommentsInDTDs || !this.inDTD) {
            try {
                this.charsAdded = false;
                writeComment(new String(cArr, i10, i11));
            } catch (IOException e10) {
                handleException(e10);
            }
        }
        LexicalHandler lexicalHandler = this.lexicalHandler;
        if (lexicalHandler != null) {
            lexicalHandler.comment(cArr, i10, i11);
        }
    }

    public Writer createWriter(OutputStream outputStream, String str) {
        return new BufferedWriter(new OutputStreamWriter(outputStream, str));
    }

    public int defaultMaximumAllowedCharacter() {
        String encoding = this.format.getEncoding();
        if (encoding != null && encoding.equals(CharEncoding.US_ASCII)) {
            return ShapeTypes.VERTICAL_SCROLL;
        }
        return -1;
    }

    public void endCDATA() {
        try {
            this.writer.write("]]>");
        } catch (IOException e10) {
            handleException(e10);
        }
        LexicalHandler lexicalHandler = this.lexicalHandler;
        if (lexicalHandler != null) {
            lexicalHandler.endCDATA();
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endDTD() {
        this.inDTD = false;
        LexicalHandler lexicalHandler = this.lexicalHandler;
        if (lexicalHandler != null) {
            lexicalHandler.endDTD();
        }
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endDocument() {
        super.endDocument();
        if (this.autoFlush) {
            try {
                flush();
            } catch (IOException unused) {
            }
        }
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        try {
            this.charsAdded = false;
            this.indentLevel--;
            if (this.lastElementClosed) {
                writePrintln();
                indent();
            }
            writeClose(str3);
            this.lastOutputNodeType = 1;
            this.lastElementClosed = true;
            super.endElement(str, str2, str3);
        } catch (IOException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) {
        LexicalHandler lexicalHandler = this.lexicalHandler;
        if (lexicalHandler != null) {
            lexicalHandler.endEntity(str);
        }
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) {
        super.endPrefixMapping(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String escapeAttributeEntities(java.lang.String r11) {
        /*
            r10 = this;
            lib.zj.office.fc.dom4j.io.OutputFormat r0 = r10.format
            char r0 = r0.getAttributeQuoteCharacter()
            int r1 = r11.length()
            r2 = 0
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Lf:
            if (r4 >= r1) goto L75
            char r7 = r11.charAt(r4)
            r8 = 9
            if (r7 == r8) goto L5b
            r8 = 10
            if (r7 == r8) goto L5b
            r8 = 13
            if (r7 == r8) goto L5b
            r8 = 34
            if (r7 == r8) goto L56
            r8 = 60
            if (r7 == r8) goto L53
            r8 = 62
            if (r7 == r8) goto L50
            r8 = 38
            if (r7 == r8) goto L4d
            r8 = 39
            if (r7 == r8) goto L48
            r8 = 32
            if (r7 < r8) goto L3f
            boolean r8 = r10.shouldEncodeChar(r7)
            if (r8 == 0) goto L5b
        L3f:
            java.lang.String r8 = "&#"
            java.lang.String r9 = ";"
            java.lang.String r7 = a0.a.g(r8, r7, r9)
            goto L5c
        L48:
            if (r0 != r8) goto L5b
            java.lang.String r7 = "&apos;"
            goto L5c
        L4d:
            java.lang.String r7 = "&amp;"
            goto L5c
        L50:
            java.lang.String r7 = "&gt;"
            goto L5c
        L53:
            java.lang.String r7 = "&lt;"
            goto L5c
        L56:
            if (r0 != r8) goto L5b
            java.lang.String r7 = "&quot;"
            goto L5c
        L5b:
            r7 = r2
        L5c:
            if (r7 == 0) goto L72
            if (r6 != 0) goto L64
            char[] r6 = r11.toCharArray()
        L64:
            java.lang.StringBuffer r8 = r10.buffer
            int r9 = r4 - r5
            r8.append(r6, r5, r9)
            java.lang.StringBuffer r5 = r10.buffer
            r5.append(r7)
            int r5 = r4 + 1
        L72:
            int r4 = r4 + 1
            goto Lf
        L75:
            if (r5 != 0) goto L78
            return r11
        L78:
            if (r5 >= r1) goto L86
            if (r6 != 0) goto L80
            char[] r6 = r11.toCharArray()
        L80:
            java.lang.StringBuffer r11 = r10.buffer
            int r4 = r4 - r5
            r11.append(r6, r5, r4)
        L86:
            java.lang.StringBuffer r11 = r10.buffer
            java.lang.String r11 = r11.toString()
            java.lang.StringBuffer r0 = r10.buffer
            r0.setLength(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.dom4j.io.XMLWriter.escapeAttributeEntities(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String escapeElementEntities(java.lang.String r10) {
        /*
            r9 = this;
            int r0 = r10.length()
            r1 = 0
            r2 = 0
            r5 = r1
            r3 = r2
            r4 = r3
        L9:
            if (r3 >= r0) goto L66
            char r6 = r10.charAt(r3)
            r7 = 9
            if (r6 == r7) goto L43
            r7 = 10
            if (r6 == r7) goto L43
            r7 = 13
            if (r6 == r7) goto L43
            r7 = 38
            if (r6 == r7) goto L40
            r7 = 60
            if (r6 == r7) goto L3d
            r7 = 62
            if (r6 == r7) goto L3a
            r7 = 32
            if (r6 < r7) goto L31
            boolean r7 = r9.shouldEncodeChar(r6)
            if (r7 == 0) goto L4c
        L31:
            java.lang.String r7 = "&#"
            java.lang.String r8 = ";"
            java.lang.String r6 = a0.a.g(r7, r6, r8)
            goto L4d
        L3a:
            java.lang.String r6 = "&gt;"
            goto L4d
        L3d:
            java.lang.String r6 = "&lt;"
            goto L4d
        L40:
            java.lang.String r6 = "&amp;"
            goto L4d
        L43:
            boolean r7 = r9.preserve
            if (r7 == 0) goto L4c
            java.lang.String r6 = java.lang.String.valueOf(r6)
            goto L4d
        L4c:
            r6 = r1
        L4d:
            if (r6 == 0) goto L63
            if (r5 != 0) goto L55
            char[] r5 = r10.toCharArray()
        L55:
            java.lang.StringBuffer r7 = r9.buffer
            int r8 = r3 - r4
            r7.append(r5, r4, r8)
            java.lang.StringBuffer r4 = r9.buffer
            r4.append(r6)
            int r4 = r3 + 1
        L63:
            int r3 = r3 + 1
            goto L9
        L66:
            if (r4 != 0) goto L69
            return r10
        L69:
            if (r4 >= r0) goto L77
            if (r5 != 0) goto L71
            char[] r5 = r10.toCharArray()
        L71:
            java.lang.StringBuffer r10 = r9.buffer
            int r3 = r3 - r4
            r10.append(r5, r4, r3)
        L77:
            java.lang.StringBuffer r10 = r9.buffer
            java.lang.String r10 = r10.toString()
            java.lang.StringBuffer r0 = r9.buffer
            r0.setLength(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.dom4j.io.XMLWriter.escapeElementEntities(java.lang.String):java.lang.String");
    }

    public void flush() {
        this.writer.flush();
    }

    public LexicalHandler getLexicalHandler() {
        return this.lexicalHandler;
    }

    public int getMaximumAllowedCharacter() {
        if (this.maximumAllowedCharacter == 0) {
            this.maximumAllowedCharacter = defaultMaximumAllowedCharacter();
        }
        return this.maximumAllowedCharacter;
    }

    public OutputFormat getOutputFormat() {
        return this.format;
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.XMLReader
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
                return super.getProperty(str);
            }
        }
    }

    public void handleException(IOException iOException) {
        throw new SAXException(iOException);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        super.ignorableWhitespace(cArr, i10, i11);
    }

    public void indent() {
        String indent = this.format.getIndent();
        if (indent != null && indent.length() > 0) {
            for (int i10 = 0; i10 < this.indentLevel; i10++) {
                this.writer.write(indent);
            }
        }
    }

    public void installLexicalHandler() {
        XMLReader parent = getParent();
        if (parent != null) {
            int i10 = 0;
            while (true) {
                String[] strArr = LEXICAL_HANDLER_NAMES;
                if (i10 < strArr.length) {
                    try {
                        parent.setProperty(strArr[i10], this);
                        return;
                    } catch (SAXNotRecognizedException | SAXNotSupportedException unused) {
                        i10++;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new NullPointerException("No parent for filter");
        }
    }

    public final boolean isElementSpacePreserved(Element element) {
        Attribute attribute = element.attribute("space");
        boolean z10 = this.preserve;
        if (attribute != null) {
            if (ContentTypes.EXTENSION_XML.equals(attribute.getNamespacePrefix()) && "preserve".equals(attribute.getText())) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public boolean isEscapeText() {
        return this.escapeText;
    }

    public boolean isExpandEmptyElements() {
        return this.format.isExpandEmptyElements();
    }

    public boolean isNamespaceDeclaration(Namespace namespace) {
        if (namespace != null && namespace != Namespace.XML_NAMESPACE && namespace.getURI() != null && !this.namespaceStack.contains(namespace)) {
            return true;
        }
        return false;
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.DTDHandler
    public void notationDecl(String str, String str2, String str3) {
        super.notationDecl(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.XMLReader
    public void parse(InputSource inputSource) {
        installLexicalHandler();
        super.parse(inputSource);
    }

    public void println() {
        this.writer.write(this.format.getLineSeparator());
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) {
        try {
            indent();
            this.writer.write("<?");
            this.writer.write(str);
            this.writer.write(PAD_TEXT);
            this.writer.write(str2);
            this.writer.write("?>");
            writePrintln();
            this.lastOutputNodeType = 7;
            super.processingInstruction(str, str2);
        } catch (IOException e10) {
            handleException(e10);
        }
    }

    public boolean resolveEntityRefs() {
        return this.resolveEntityRefs;
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        super.setDocumentLocator(locator);
    }

    public void setEscapeText(boolean z10) {
        this.escapeText = z10;
    }

    public void setIndentLevel(int i10) {
        this.indentLevel = i10;
    }

    public void setLexicalHandler(LexicalHandler lexicalHandler) {
        if (lexicalHandler != null) {
            this.lexicalHandler = lexicalHandler;
            return;
        }
        throw new NullPointerException("Null lexical handler");
    }

    public void setMaximumAllowedCharacter(int i10) {
        this.maximumAllowedCharacter = i10;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.writer = createWriter(outputStream, this.format.getEncoding());
        this.autoFlush = true;
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.XMLReader
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
                super.setProperty(str, obj);
                return;
            }
        }
    }

    public void setResolveEntityRefs(boolean z10) {
        this.resolveEntityRefs = z10;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
        this.autoFlush = false;
    }

    public boolean shouldEncodeChar(char c) {
        int maximumAllowedCharacter = getMaximumAllowedCharacter();
        if (maximumAllowedCharacter > 0 && c > maximumAllowedCharacter) {
            return true;
        }
        return false;
    }

    public void startCDATA() {
        try {
            this.writer.write("<![CDATA[");
        } catch (IOException e10) {
            handleException(e10);
        }
        LexicalHandler lexicalHandler = this.lexicalHandler;
        if (lexicalHandler != null) {
            lexicalHandler.startCDATA();
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startDTD(String str, String str2, String str3) {
        this.inDTD = true;
        try {
            writeDocType(str, str2, str3);
        } catch (IOException e10) {
            handleException(e10);
        }
        LexicalHandler lexicalHandler = this.lexicalHandler;
        if (lexicalHandler != null) {
            lexicalHandler.startDTD(str, str2, str3);
        }
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startDocument() {
        try {
            writeDeclaration();
            super.startDocument();
        } catch (IOException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        try {
            this.charsAdded = false;
            writePrintln();
            indent();
            this.writer.write("<");
            this.writer.write(str3);
            writeNamespaces();
            writeAttributes(attributes);
            this.writer.write(">");
            this.indentLevel++;
            this.lastOutputNodeType = 1;
            this.lastElementClosed = false;
            super.startElement(str, str2, str3, attributes);
        } catch (IOException e10) {
            handleException(e10);
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) {
        try {
            writeEntityRef(str);
        } catch (IOException e10) {
            handleException(e10);
        }
        LexicalHandler lexicalHandler = this.lexicalHandler;
        if (lexicalHandler != null) {
            lexicalHandler.startEntity(str);
        }
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) {
        if (this.namespacesMap == null) {
            this.namespacesMap = new HashMap();
        }
        this.namespacesMap.put(str, str2);
        super.startPrefixMapping(str, str2);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.DTDHandler
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) {
        super.unparsedEntityDecl(str, str2, str3, str4);
    }

    public void write(Attribute attribute) {
        writeAttribute(attribute);
        if (this.autoFlush) {
            flush();
        }
    }

    public void writeAttribute(Attribute attribute) {
        this.writer.write(PAD_TEXT);
        this.writer.write(attribute.getQualifiedName());
        this.writer.write("=");
        char attributeQuoteCharacter = this.format.getAttributeQuoteCharacter();
        this.writer.write(attributeQuoteCharacter);
        writeEscapeAttributeEntities(attribute.getValue());
        this.writer.write(attributeQuoteCharacter);
        this.lastOutputNodeType = 2;
    }

    public void writeAttributes(Element element) {
        int attributeCount = element.attributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            Attribute attribute = element.attribute(i10);
            Namespace namespace = attribute.getNamespace();
            if (namespace != null && namespace != Namespace.NO_NAMESPACE && namespace != Namespace.XML_NAMESPACE) {
                if (!namespace.getURI().equals(this.namespaceStack.getURI(namespace.getPrefix()))) {
                    writeNamespace(namespace);
                    this.namespaceStack.push(namespace);
                }
            }
            String name = attribute.getName();
            if (name.startsWith("xmlns:")) {
                String substring = name.substring(6);
                if (this.namespaceStack.getNamespaceForPrefix(substring) == null) {
                    String value = attribute.getValue();
                    this.namespaceStack.push(substring, value);
                    writeNamespace(substring, value);
                }
            } else if (name.equals("xmlns")) {
                if (this.namespaceStack.getDefaultNamespace() == null) {
                    String value2 = attribute.getValue();
                    this.namespaceStack.push(null, value2);
                    writeNamespace(null, value2);
                }
            } else {
                char attributeQuoteCharacter = this.format.getAttributeQuoteCharacter();
                this.writer.write(PAD_TEXT);
                this.writer.write(attribute.getQualifiedName());
                this.writer.write("=");
                this.writer.write(attributeQuoteCharacter);
                writeEscapeAttributeEntities(attribute.getValue());
                this.writer.write(attributeQuoteCharacter);
            }
        }
    }

    public void writeCDATA(String str) {
        this.writer.write("<![CDATA[");
        if (str != null) {
            this.writer.write(str);
        }
        this.writer.write("]]>");
        this.lastOutputNodeType = 4;
    }

    public void writeClose(Element element) {
        writeClose(element.getQualifiedName());
    }

    public void writeComment(String str) {
        if (this.format.isNewlines()) {
            println();
            indent();
        }
        this.writer.write("<!--");
        this.writer.write(str);
        this.writer.write("-->");
        this.lastOutputNodeType = 8;
    }

    public void writeDeclaration() {
        String encoding = this.format.getEncoding();
        if (!this.format.isSuppressDeclaration()) {
            if (encoding.equals("UTF8")) {
                this.writer.write("<?xml version=\"1.0\"");
                if (!this.format.isOmitEncoding()) {
                    this.writer.write(" encoding=\"UTF-8\"");
                }
                this.writer.write("?>");
            } else {
                this.writer.write("<?xml version=\"1.0\"");
                if (!this.format.isOmitEncoding()) {
                    Writer writer = this.writer;
                    writer.write(" encoding=\"" + encoding + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                }
                this.writer.write("?>");
            }
            if (this.format.isNewLineAfterDeclaration()) {
                println();
            }
        }
    }

    public void writeDocType(DocumentType documentType) {
        if (documentType != null) {
            documentType.write(this.writer);
            writePrintln();
        }
    }

    public void writeElement(Element element) {
        int nodeCount = element.nodeCount();
        String qualifiedName = element.getQualifiedName();
        writePrintln();
        indent();
        this.writer.write("<");
        this.writer.write(qualifiedName);
        int size = this.namespaceStack.size();
        Namespace namespace = element.getNamespace();
        if (isNamespaceDeclaration(namespace)) {
            this.namespaceStack.push(namespace);
            writeNamespace(namespace);
        }
        boolean z10 = true;
        for (int i10 = 0; i10 < nodeCount; i10++) {
            Node node = element.node(i10);
            if (node instanceof Namespace) {
                Namespace namespace2 = (Namespace) node;
                if (isNamespaceDeclaration(namespace2)) {
                    this.namespaceStack.push(namespace2);
                    writeNamespace(namespace2);
                }
            } else if ((node instanceof Element) || (node instanceof Comment)) {
                z10 = false;
            }
        }
        writeAttributes(element);
        this.lastOutputNodeType = 1;
        if (nodeCount <= 0) {
            writeEmptyElementClose(qualifiedName);
        } else {
            this.writer.write(">");
            if (z10) {
                writeElementContent(element);
            } else {
                this.indentLevel++;
                writeElementContent(element);
                this.indentLevel--;
                writePrintln();
                indent();
            }
            this.writer.write("</");
            this.writer.write(qualifiedName);
            this.writer.write(">");
        }
        while (this.namespaceStack.size() > size) {
            this.namespaceStack.pop();
        }
        this.lastOutputNodeType = 1;
    }

    public void writeElementContent(Element element) {
        char charAt;
        char charAt2;
        char c;
        boolean isTrimText = this.format.isTrimText();
        boolean z10 = this.preserve;
        if (isTrimText) {
            boolean isElementSpacePreserved = isElementSpacePreserved(element);
            this.preserve = isElementSpacePreserved;
            isTrimText = !isElementSpacePreserved;
        }
        if (isTrimText) {
            int nodeCount = element.nodeCount();
            boolean z11 = true;
            Text text = null;
            StringBuffer stringBuffer = null;
            for (int i10 = 0; i10 < nodeCount; i10++) {
                Node node = element.node(i10);
                if (node instanceof Text) {
                    if (text == null) {
                        text = (Text) node;
                    } else {
                        if (stringBuffer == null) {
                            stringBuffer = new StringBuffer(text.getText());
                        }
                        stringBuffer.append(((Text) node).getText());
                    }
                } else {
                    if (!z11 && this.format.isPadText()) {
                        if (stringBuffer != null) {
                            c = stringBuffer.charAt(0);
                        } else if (text != null) {
                            c = text.getText().charAt(0);
                        } else {
                            c = 'a';
                        }
                        if (Character.isWhitespace(c)) {
                            this.writer.write(PAD_TEXT);
                        }
                    }
                    if (text != null) {
                        if (stringBuffer != null) {
                            writeString(stringBuffer.toString());
                            stringBuffer = null;
                        } else {
                            writeString(text.getText());
                        }
                        if (this.format.isPadText()) {
                            if (stringBuffer != null) {
                                charAt2 = stringBuffer.charAt(stringBuffer.length() - 1);
                            } else {
                                String text2 = text.getText();
                                charAt2 = text2.charAt(text2.length() - 1);
                            }
                            if (Character.isWhitespace(charAt2)) {
                                this.writer.write(PAD_TEXT);
                            }
                        }
                        text = null;
                    }
                    writeNode(node);
                    z11 = false;
                }
            }
            if (text != null) {
                if (!z11 && this.format.isPadText()) {
                    if (stringBuffer != null) {
                        charAt = stringBuffer.charAt(0);
                    } else {
                        charAt = text.getText().charAt(0);
                    }
                    if (Character.isWhitespace(charAt)) {
                        this.writer.write(PAD_TEXT);
                    }
                }
                if (stringBuffer != null) {
                    writeString(stringBuffer.toString());
                } else {
                    writeString(text.getText());
                }
            }
        } else {
            int nodeCount2 = element.nodeCount();
            Node node2 = null;
            for (int i11 = 0; i11 < nodeCount2; i11++) {
                Node node3 = element.node(i11);
                if (node3 instanceof Text) {
                    writeNode(node3);
                    node2 = node3;
                } else {
                    if (node2 != null && this.format.isPadText()) {
                        String text3 = node2.getText();
                        if (Character.isWhitespace(text3.charAt(text3.length() - 1))) {
                            this.writer.write(PAD_TEXT);
                        }
                    }
                    writeNode(node3);
                    node2 = null;
                }
            }
        }
        this.preserve = z10;
    }

    public void writeEmptyElementClose(String str) {
        if (!this.format.isExpandEmptyElements()) {
            this.writer.write("/>");
            return;
        }
        this.writer.write("></");
        this.writer.write(str);
        this.writer.write(">");
    }

    public void writeEntity(Entity entity) {
        if (!resolveEntityRefs()) {
            writeEntityRef(entity.getName());
        } else {
            this.writer.write(entity.getText());
        }
    }

    public void writeEntityRef(String str) {
        this.writer.write("&");
        this.writer.write(str);
        this.writer.write(";");
        this.lastOutputNodeType = 5;
    }

    public void writeEscapeAttributeEntities(String str) {
        if (str != null) {
            this.writer.write(escapeAttributeEntities(str));
        }
    }

    public void writeNamespace(Namespace namespace) {
        if (namespace != null) {
            writeNamespace(namespace.getPrefix(), namespace.getURI());
        }
    }

    public void writeNamespaces() {
        Map map = this.namespacesMap;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                writeNamespace((String) entry.getKey(), (String) entry.getValue());
            }
            this.namespacesMap = null;
        }
    }

    public void writeNode(Node node) {
        switch (node.getNodeType()) {
            case 1:
                writeElement((Element) node);
                return;
            case 2:
                writeAttribute((Attribute) node);
                return;
            case 3:
                writeNodeText(node);
                return;
            case 4:
                writeCDATA(node.getText());
                return;
            case 5:
                writeEntity((Entity) node);
                return;
            case 6:
            case 11:
            case 12:
            default:
                throw new IOException("Invalid node type: " + node);
            case 7:
                writeProcessingInstruction((ProcessingInstruction) node);
                return;
            case 8:
                writeComment(node.getText());
                return;
            case 9:
                write((Document) node);
                return;
            case 10:
                writeDocType((DocumentType) node);
                return;
            case 13:
                return;
        }
    }

    public void writeNodeText(Node node) {
        String text = node.getText();
        if (text != null && text.length() > 0) {
            if (this.escapeText) {
                text = escapeElementEntities(text);
            }
            this.lastOutputNodeType = 3;
            this.writer.write(text);
            this.lastChar = text.charAt(text.length() - 1);
        }
    }

    public void writeOpen(Element element) {
        this.writer.write("<");
        this.writer.write(element.getQualifiedName());
        writeAttributes(element);
        this.writer.write(">");
    }

    public void writePrintln() {
        if (this.format.isNewlines()) {
            String lineSeparator = this.format.getLineSeparator();
            if (this.lastChar != lineSeparator.charAt(lineSeparator.length() - 1)) {
                this.writer.write(this.format.getLineSeparator());
            }
        }
    }

    public void writeProcessingInstruction(ProcessingInstruction processingInstruction) {
        this.writer.write("<?");
        this.writer.write(processingInstruction.getName());
        this.writer.write(PAD_TEXT);
        this.writer.write(processingInstruction.getText());
        this.writer.write("?>");
        writePrintln();
        this.lastOutputNodeType = 7;
    }

    public void writeString(String str) {
        if (str != null && str.length() > 0) {
            if (this.escapeText) {
                str = escapeElementEntities(str);
            }
            if (this.format.isTrimText()) {
                StringTokenizer stringTokenizer = new StringTokenizer(str);
                boolean z10 = true;
                while (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    if (z10) {
                        if (this.lastOutputNodeType == 3) {
                            this.writer.write(PAD_TEXT);
                        }
                        z10 = false;
                    } else {
                        this.writer.write(PAD_TEXT);
                    }
                    this.writer.write(nextToken);
                    this.lastOutputNodeType = 3;
                    this.lastChar = nextToken.charAt(nextToken.length() - 1);
                }
                return;
            }
            this.lastOutputNodeType = 3;
            this.writer.write(str);
            this.lastChar = str.charAt(str.length() - 1);
        }
    }

    public XMLWriter(Writer writer, OutputFormat outputFormat) {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        this.writer = writer;
        this.format = outputFormat;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }

    public void writeClose(String str) {
        this.writer.write("</");
        this.writer.write(str);
        this.writer.write(">");
    }

    public void writeNamespace(String str, String str2) {
        if (str != null && str.length() > 0) {
            this.writer.write(" xmlns:");
            this.writer.write(str);
            this.writer.write("=\"");
        } else {
            this.writer.write(" xmlns=\"");
        }
        this.writer.write(str2);
        this.writer.write(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
    }

    public void writeDocType(String str, String str2, String str3) {
        boolean z10;
        this.writer.write("<!DOCTYPE ");
        this.writer.write(str);
        if (str2 == null || str2.equals("")) {
            z10 = false;
        } else {
            this.writer.write(" PUBLIC \"");
            this.writer.write(str2);
            this.writer.write(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            z10 = true;
        }
        if (str3 != null && !str3.equals("")) {
            if (!z10) {
                this.writer.write(" SYSTEM");
            }
            this.writer.write(" \"");
            this.writer.write(str3);
            this.writer.write(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
        this.writer.write(">");
        writePrintln();
    }

    public void write(Document document) {
        writeDeclaration();
        if (document.getDocType() != null) {
            indent();
            writeDocType(document.getDocType());
        }
        int nodeCount = document.nodeCount();
        for (int i10 = 0; i10 < nodeCount; i10++) {
            writeNode(document.node(i10));
        }
        writePrintln();
        if (this.autoFlush) {
            flush();
        }
    }

    public void writeAttribute(Attributes attributes, int i10) {
        char attributeQuoteCharacter = this.format.getAttributeQuoteCharacter();
        this.writer.write(PAD_TEXT);
        this.writer.write(attributes.getQName(i10));
        this.writer.write("=");
        this.writer.write(attributeQuoteCharacter);
        writeEscapeAttributeEntities(attributes.getValue(i10));
        this.writer.write(attributeQuoteCharacter);
    }

    public XMLWriter() {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        this.format = DEFAULT_FORMAT;
        this.writer = new BufferedWriter(new OutputStreamWriter(System.out));
        this.autoFlush = true;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }

    public void write(Element element) {
        writeElement(element);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(CDATA cdata) {
        writeCDATA(cdata.getText());
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Comment comment) {
        writeComment(comment.getText());
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(DocumentType documentType) {
        writeDocType(documentType);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Entity entity) {
        writeEntity(entity);
        if (this.autoFlush) {
            flush();
        }
    }

    public XMLWriter(OutputStream outputStream) {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        OutputFormat outputFormat = DEFAULT_FORMAT;
        this.format = outputFormat;
        this.writer = createWriter(outputStream, outputFormat.getEncoding());
        this.autoFlush = true;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }

    public void write(Namespace namespace) {
        writeNamespace(namespace);
        if (this.autoFlush) {
            flush();
        }
    }

    public void writeAttributes(Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            writeAttribute(attributes, i10);
        }
    }

    public void write(ProcessingInstruction processingInstruction) {
        writeProcessingInstruction(processingInstruction);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(String str) {
        writeString(str);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Text text) {
        writeString(text.getText());
        if (this.autoFlush) {
            flush();
        }
    }

    public XMLWriter(OutputStream outputStream, OutputFormat outputFormat) {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        this.format = outputFormat;
        this.writer = createWriter(outputStream, outputFormat.getEncoding());
        this.autoFlush = true;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }

    public void write(Node node) {
        writeNode(node);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Object obj) {
        if (obj instanceof Node) {
            write((Node) obj);
        } else if (obj instanceof String) {
            write((String) obj);
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                write(list.get(i10));
            }
        } else {
            if (obj == null) {
                return;
            }
            throw new IOException("Invalid object: " + obj);
        }
    }

    public XMLWriter(OutputFormat outputFormat) {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        this.format = outputFormat;
        this.writer = createWriter(System.out, outputFormat.getEncoding());
        this.autoFlush = true;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }
}
