package lib.zj.office.fc.dom4j.dom;

import java.util.ArrayList;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.tree.DefaultDocument;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

/* loaded from: classes3.dex */
public class DOMDocument extends DefaultDocument implements Document {
    private static final DOMDocumentFactory DOCUMENT_FACTORY = (DOMDocumentFactory) DOMDocumentFactory.getInstance();

    public DOMDocument() {
        init();
    }

    private void checkNewChildNode(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 1 && nodeType != 8 && nodeType != 7 && nodeType != 10) {
            throw new DOMException((short) 3, "Given node cannot be a child of document");
        }
    }

    private void init() {
        setDocumentFactory(DOCUMENT_FACTORY);
    }

    @Override // org.w3c.dom.Document
    public Node adoptNode(Node node) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Node appendChild(Node node) {
        checkNewChildNode(node);
        return DOMNodeHelper.appendChild(this, node);
    }

    @Override // org.w3c.dom.Node
    public Node cloneNode(boolean z10) {
        return DOMNodeHelper.cloneNode(this, z10);
    }

    @Override // org.w3c.dom.Node
    public short compareDocumentPosition(Node node) {
        return (short) 0;
    }

    @Override // org.w3c.dom.Document
    public Attr createAttribute(String str) {
        return (Attr) getDocumentFactory().createAttribute((Element) null, getDocumentFactory().createQName(str), "");
    }

    @Override // org.w3c.dom.Document
    public Attr createAttributeNS(String str, String str2) {
        return (Attr) getDocumentFactory().createAttribute((Element) null, getDocumentFactory().createQName(str2, str), (String) null);
    }

    @Override // org.w3c.dom.Document
    public CDATASection createCDATASection(String str) {
        return (CDATASection) getDocumentFactory().createCDATA(str);
    }

    @Override // org.w3c.dom.Document
    public Comment createComment(String str) {
        return (Comment) getDocumentFactory().createComment(str);
    }

    @Override // org.w3c.dom.Document
    public DocumentFragment createDocumentFragment() {
        DOMNodeHelper.notSupported();
        return null;
    }

    @Override // org.w3c.dom.Document
    public org.w3c.dom.Element createElement(String str) {
        return (org.w3c.dom.Element) getDocumentFactory().createElement(str);
    }

    @Override // org.w3c.dom.Document
    public org.w3c.dom.Element createElementNS(String str, String str2) {
        return (org.w3c.dom.Element) getDocumentFactory().createElement(getDocumentFactory().createQName(str2, str));
    }

    @Override // org.w3c.dom.Document
    public EntityReference createEntityReference(String str) {
        return (EntityReference) getDocumentFactory().createEntity(str, null);
    }

    @Override // org.w3c.dom.Document
    public ProcessingInstruction createProcessingInstruction(String str, String str2) {
        return (ProcessingInstruction) getDocumentFactory().createProcessingInstruction(str, str2);
    }

    @Override // org.w3c.dom.Document
    public Text createTextNode(String str) {
        return (Text) getDocumentFactory().createText(str);
    }

    @Override // org.w3c.dom.Node
    public NamedNodeMap getAttributes() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public String getBaseURI() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public NodeList getChildNodes() {
        return DOMNodeHelper.createNodeList(content());
    }

    @Override // org.w3c.dom.Document
    public DocumentType getDoctype() {
        return DOMNodeHelper.asDOMDocumentType(getDocType());
    }

    @Override // org.w3c.dom.Document
    public org.w3c.dom.Element getDocumentElement() {
        return DOMNodeHelper.asDOMElement(getRootElement());
    }

    @Override // lib.zj.office.fc.dom4j.tree.DefaultDocument, lib.zj.office.fc.dom4j.tree.AbstractNode
    public DocumentFactory getDocumentFactory() {
        if (super.getDocumentFactory() == null) {
            return DOCUMENT_FACTORY;
        }
        return super.getDocumentFactory();
    }

    @Override // org.w3c.dom.Document
    public String getDocumentURI() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public DOMConfiguration getDomConfig() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public org.w3c.dom.Element getElementById(String str) {
        return DOMNodeHelper.asDOMElement(elementByID(str));
    }

    @Override // org.w3c.dom.Document
    public NodeList getElementsByTagName(String str) {
        ArrayList arrayList = new ArrayList();
        DOMNodeHelper.appendElementsByTagName(arrayList, this, str);
        return DOMNodeHelper.createNodeList(arrayList);
    }

    @Override // org.w3c.dom.Document
    public NodeList getElementsByTagNameNS(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        DOMNodeHelper.appendElementsByTagNameNS(arrayList, this, str, str2);
        return DOMNodeHelper.createNodeList(arrayList);
    }

    @Override // org.w3c.dom.Node
    public Object getFeature(String str, String str2) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Node getFirstChild() {
        return DOMNodeHelper.asDOMNode(node(0));
    }

    @Override // org.w3c.dom.Document
    public DOMImplementation getImplementation() {
        if (getDocumentFactory() instanceof DOMImplementation) {
            return (DOMImplementation) getDocumentFactory();
        }
        return DOCUMENT_FACTORY;
    }

    @Override // org.w3c.dom.Document
    public String getInputEncoding() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Node getLastChild() {
        return DOMNodeHelper.asDOMNode(node(nodeCount() - 1));
    }

    @Override // org.w3c.dom.Node
    public String getLocalName() {
        return DOMNodeHelper.getLocalName(this);
    }

    @Override // org.w3c.dom.Node
    public String getNamespaceURI() {
        return DOMNodeHelper.getNamespaceURI(this);
    }

    @Override // org.w3c.dom.Node
    public Node getNextSibling() {
        return DOMNodeHelper.getNextSibling(this);
    }

    @Override // org.w3c.dom.Node
    public String getNodeName() {
        return "#document";
    }

    @Override // org.w3c.dom.Node
    public String getNodeValue() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Document getOwnerDocument() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Node getParentNode() {
        return DOMNodeHelper.getParentNode(this);
    }

    @Override // org.w3c.dom.Node
    public String getPrefix() {
        return DOMNodeHelper.getPrefix(this);
    }

    @Override // org.w3c.dom.Node
    public Node getPreviousSibling() {
        return DOMNodeHelper.getPreviousSibling(this);
    }

    @Override // org.w3c.dom.Document
    public boolean getStrictErrorChecking() {
        return false;
    }

    @Override // org.w3c.dom.Node
    public String getTextContent() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Object getUserData(String str) {
        return null;
    }

    @Override // org.w3c.dom.Document
    public String getXmlEncoding() {
        return null;
    }

    @Override // org.w3c.dom.Document
    public boolean getXmlStandalone() {
        return false;
    }

    @Override // org.w3c.dom.Document
    public String getXmlVersion() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public boolean hasAttributes() {
        return DOMNodeHelper.hasAttributes(this);
    }

    @Override // org.w3c.dom.Node
    public boolean hasChildNodes() {
        if (nodeCount() > 0) {
            return true;
        }
        return false;
    }

    @Override // org.w3c.dom.Document
    public Node importNode(Node node, boolean z10) {
        DOMNodeHelper.notSupported();
        return null;
    }

    @Override // org.w3c.dom.Node
    public Node insertBefore(Node node, Node node2) {
        checkNewChildNode(node);
        return DOMNodeHelper.insertBefore(this, node, node2);
    }

    @Override // org.w3c.dom.Node
    public boolean isDefaultNamespace(String str) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public boolean isEqualNode(Node node) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public boolean isSameNode(Node node) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public boolean isSupported(String str, String str2) {
        return DOMNodeHelper.isSupported(this, str, str2);
    }

    @Override // org.w3c.dom.Node
    public String lookupNamespaceURI(String str) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public String lookupPrefix(String str) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Node removeChild(Node node) {
        return DOMNodeHelper.removeChild(this, node);
    }

    @Override // org.w3c.dom.Document
    public Node renameNode(Node node, String str, String str2) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Node replaceChild(Node node, Node node2) {
        checkNewChildNode(node);
        return DOMNodeHelper.replaceChild(this, node, node2);
    }

    @Override // org.w3c.dom.Node
    public void setPrefix(String str) {
        DOMNodeHelper.setPrefix(this, str);
    }

    @Override // org.w3c.dom.Node
    public Object setUserData(String str, Object obj, UserDataHandler userDataHandler) {
        return null;
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }

    public DOMDocument(String str) {
        super(str);
        init();
    }

    public DOMDocument(DOMElement dOMElement) {
        super(dOMElement);
        init();
    }

    public DOMDocument(DOMDocumentType dOMDocumentType) {
        super(dOMDocumentType);
        init();
    }

    public DOMDocument(DOMElement dOMElement, DOMDocumentType dOMDocumentType) {
        super(dOMElement, dOMDocumentType);
        init();
    }

    public DOMDocument(String str, DOMElement dOMElement, DOMDocumentType dOMDocumentType) {
        super(str, dOMElement, dOMDocumentType);
        init();
    }

    @Override // org.w3c.dom.Document
    public void normalizeDocument() {
    }

    @Override // org.w3c.dom.Document
    public void setDocumentURI(String str) {
    }

    @Override // org.w3c.dom.Node
    public void setNodeValue(String str) {
    }

    @Override // org.w3c.dom.Document
    public void setStrictErrorChecking(boolean z10) {
    }

    @Override // org.w3c.dom.Node
    public void setTextContent(String str) {
    }

    @Override // org.w3c.dom.Document
    public void setXmlStandalone(boolean z10) {
    }

    @Override // org.w3c.dom.Document
    public void setXmlVersion(String str) {
    }
}
