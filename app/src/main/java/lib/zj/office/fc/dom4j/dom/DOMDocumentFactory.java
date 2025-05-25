package lib.zj.office.fc.dom4j.dom;

import com.bytedance.sdk.component.embedapplog.BuildConfig;
import java.util.Map;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.CDATA;
import lib.zj.office.fc.dom4j.Comment;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Entity;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.ProcessingInstruction;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.Text;
import lib.zj.office.fc.dom4j.util.SingletonStrategy;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentType;

/* loaded from: classes3.dex */
public class DOMDocumentFactory extends DocumentFactory implements DOMImplementation {
    private static SingletonStrategy singleton;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(System.getProperty("org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.dom4j.util.SimpleSingleton"));
        } catch (Exception unused) {
            try {
                cls = Class.forName("org.dom4j.util.SimpleSingleton");
            } catch (Exception unused2) {
                cls = null;
            }
        }
        try {
            SingletonStrategy singletonStrategy = (SingletonStrategy) cls.newInstance();
            singleton = singletonStrategy;
            singletonStrategy.setSingletonClassName(DOMDocumentFactory.class.getName());
        } catch (Exception unused3) {
        }
    }

    public static DocumentFactory getInstance() {
        return (DOMDocumentFactory) singleton.instance();
    }

    public DOMDocumentType asDocumentType(DocumentType documentType) {
        if (documentType instanceof DOMDocumentType) {
            return (DOMDocumentType) documentType;
        }
        return new DOMDocumentType(documentType.getName(), documentType.getPublicId(), documentType.getSystemId());
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Attribute createAttribute(Element element, QName qName, String str) {
        return new DOMAttribute(qName, str);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public CDATA createCDATA(String str) {
        return new DOMCDATA(str);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Comment createComment(String str) {
        return new DOMComment(str);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public lib.zj.office.fc.dom4j.DocumentType createDocType(String str, String str2, String str3) {
        return new DOMDocumentType(str, str2, str3);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Document createDocument() {
        DOMDocument dOMDocument = new DOMDocument();
        dOMDocument.setDocumentFactory(this);
        return dOMDocument;
    }

    @Override // org.w3c.dom.DOMImplementation
    public DocumentType createDocumentType(String str, String str2, String str3) {
        return new DOMDocumentType(str, str2, str3);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Element createElement(QName qName) {
        return new DOMElement(qName);
    }

    public Entity createEntity(String str) {
        return new DOMEntityReference(str);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Namespace createNamespace(String str, String str2) {
        return new DOMNamespace(str, str2);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public ProcessingInstruction createProcessingInstruction(String str, String str2) {
        return new DOMProcessingInstruction(str, str2);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Text createText(String str) {
        return new DOMText(str);
    }

    @Override // org.w3c.dom.DOMImplementation
    public Object getFeature(String str, String str2) {
        return null;
    }

    @Override // org.w3c.dom.DOMImplementation
    public boolean hasFeature(String str, String str2) {
        if (!"XML".equalsIgnoreCase(str) && !"Core".equalsIgnoreCase(str)) {
            return false;
        }
        if (str2 != null && str2.length() != 0 && !BuildConfig.VERSION_NAME.equals(str2) && !"2.0".equals(str2)) {
            return false;
        }
        return true;
    }

    public Element createElement(QName qName, int i10) {
        return new DOMElement(qName, i10);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Entity createEntity(String str, String str2) {
        return new DOMEntityReference(str, str2);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public ProcessingInstruction createProcessingInstruction(String str, Map map) {
        return new DOMProcessingInstruction(str, map);
    }

    @Override // org.w3c.dom.DOMImplementation
    public org.w3c.dom.Document createDocument(String str, String str2, DocumentType documentType) {
        DOMDocument dOMDocument;
        if (documentType != null) {
            dOMDocument = new DOMDocument(asDocumentType(documentType));
        } else {
            dOMDocument = new DOMDocument();
        }
        dOMDocument.addElement(createQName(str2, str));
        return dOMDocument;
    }
}
