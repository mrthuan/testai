package lib.zj.office.fc.dom4j;

import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.rule.Pattern;
import lib.zj.office.fc.dom4j.tree.AbstractDocument;
import lib.zj.office.fc.dom4j.tree.DefaultAttribute;
import lib.zj.office.fc.dom4j.tree.DefaultCDATA;
import lib.zj.office.fc.dom4j.tree.DefaultComment;
import lib.zj.office.fc.dom4j.tree.DefaultDocument;
import lib.zj.office.fc.dom4j.tree.DefaultDocumentType;
import lib.zj.office.fc.dom4j.tree.DefaultElement;
import lib.zj.office.fc.dom4j.tree.DefaultEntity;
import lib.zj.office.fc.dom4j.tree.DefaultProcessingInstruction;
import lib.zj.office.fc.dom4j.tree.DefaultText;
import lib.zj.office.fc.dom4j.tree.QNameCache;
import lib.zj.office.fc.dom4j.util.SimpleSingleton;
import lib.zj.office.fc.dom4j.util.SingletonStrategy;
import lib.zj.office.fc.dom4j.xpath.DefaultXPath;
import lib.zj.office.fc.dom4j.xpath.XPathPattern;

/* loaded from: classes3.dex */
public class DocumentFactory implements Serializable {
    private static SingletonStrategy singleton;
    protected transient QNameCache cache;
    private Map xpathNamespaceURIs;

    public DocumentFactory() {
        init();
    }

    private static SingletonStrategy createSingleton() {
        SingletonStrategy simpleSingleton;
        String str = "lib.zj.office.fc.dom4j.DocumentFactory";
        try {
            str = System.getProperty("lib.zj.office.fc.dom4j.factory", "lib.zj.office.fc.dom4j.DocumentFactory");
        } catch (Exception unused) {
        }
        try {
            simpleSingleton = (SingletonStrategy) Class.forName(System.getProperty("lib.zj.office.fc.dom4j.DocumentFactory.singleton.strategy", "lib.zj.office.fc.dom4j.util.SimpleSingleton")).newInstance();
        } catch (Exception unused2) {
            simpleSingleton = new SimpleSingleton();
        }
        simpleSingleton.setSingletonClassName(str);
        return simpleSingleton;
    }

    public static synchronized DocumentFactory getInstance() {
        DocumentFactory documentFactory;
        synchronized (DocumentFactory.class) {
            if (singleton == null) {
                singleton = createSingleton();
            }
            documentFactory = (DocumentFactory) singleton.instance();
        }
        return documentFactory;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init();
    }

    public Attribute createAttribute(Element element, QName qName, String str) {
        return new DefaultAttribute(qName, str);
    }

    public CDATA createCDATA(String str) {
        return new DefaultCDATA(str);
    }

    public Comment createComment(String str) {
        return new DefaultComment(str);
    }

    public DocumentType createDocType(String str, String str2, String str3) {
        return new DefaultDocumentType(str, str2, str3);
    }

    public Document createDocument() {
        DefaultDocument defaultDocument = new DefaultDocument();
        defaultDocument.setDocumentFactory(this);
        return defaultDocument;
    }

    public Element createElement(QName qName) {
        return new DefaultElement(qName);
    }

    public Entity createEntity(String str, String str2) {
        return new DefaultEntity(str, str2);
    }

    public Namespace createNamespace(String str, String str2) {
        return Namespace.get(str, str2);
    }

    public Pattern createPattern(String str) {
        return new XPathPattern(str);
    }

    public ProcessingInstruction createProcessingInstruction(String str, String str2) {
        return new DefaultProcessingInstruction(str, str2);
    }

    public QName createQName(String str, Namespace namespace) {
        return this.cache.get(str, namespace);
    }

    public QNameCache createQNameCache() {
        return new QNameCache(this);
    }

    public Text createText(String str) {
        if (str != null) {
            return new DefaultText(str);
        }
        throw new IllegalArgumentException("Adding text to an XML document must not be null");
    }

    public XPath createXPath(String str) {
        DefaultXPath defaultXPath = new DefaultXPath(str);
        Map map = this.xpathNamespaceURIs;
        if (map != null) {
            defaultXPath.setNamespaceURIs(map);
        }
        return defaultXPath;
    }

    public NodeFilter createXPathFilter(String str) {
        return createXPath(str);
    }

    public List getQNames() {
        return this.cache.getQNames();
    }

    public Map getXPathNamespaceURIs() {
        return this.xpathNamespaceURIs;
    }

    public void init() {
        this.cache = createQNameCache();
    }

    public QName intern(QName qName) {
        return this.cache.intern(qName);
    }

    public void setXPathNamespaceURIs(Map map) {
        this.xpathNamespaceURIs = map;
    }

    public Attribute createAttribute(Element element, String str, String str2) {
        return createAttribute(element, createQName(str), str2);
    }

    public Element createElement(String str) {
        return createElement(createQName(str));
    }

    public ProcessingInstruction createProcessingInstruction(String str, Map map) {
        return new DefaultProcessingInstruction(str, map);
    }

    public QName createQName(String str) {
        return this.cache.get(str);
    }

    public Document createDocument(String str) {
        Document createDocument = createDocument();
        if (createDocument instanceof AbstractDocument) {
            ((AbstractDocument) createDocument).setXMLEncoding(str);
        }
        return createDocument;
    }

    public Element createElement(String str, String str2) {
        return createElement(createQName(str, str2));
    }

    public QName createQName(String str, String str2, String str3) {
        return this.cache.get(str, Namespace.get(str2, str3));
    }

    public QName createQName(String str, String str2) {
        return this.cache.get(str, str2);
    }

    public Document createDocument(Element element) {
        Document createDocument = createDocument();
        createDocument.setRootElement(element);
        return createDocument;
    }

    public static DocumentFactory createSingleton(String str) {
        try {
            return (DocumentFactory) Class.forName(str, true, DocumentFactory.class.getClassLoader()).newInstance();
        } catch (Throwable unused) {
            PrintStream printStream = System.out;
            printStream.println("WARNING: Cannot load DocumentFactory: " + str);
            return new DocumentFactory();
        }
    }
}
