package lib.zj.office.fc.dom4j;

import a0.d;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import lib.zj.office.fc.dom4j.tree.QNameCache;
import lib.zj.office.fc.dom4j.util.SingletonStrategy;

/* loaded from: classes3.dex */
public class QName implements Serializable {
    private static SingletonStrategy singleton;
    private DocumentFactory documentFactory;
    private int hashCode;
    private String name;
    private transient Namespace namespace;
    private String qualifiedName;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(System.getProperty("com.wxiwei.fc.dom4j.QName.singleton.strategy", "com.wxiwei.fc.dom4j.util.SimpleSingleton"));
        } catch (Exception unused) {
            try {
                cls = Class.forName("com.wxiwei.fc.dom4j.util.SimpleSingleton");
            } catch (Exception unused2) {
                cls = null;
            }
        }
        try {
            SingletonStrategy singletonStrategy = (SingletonStrategy) cls.newInstance();
            singleton = singletonStrategy;
            singletonStrategy.setSingletonClassName(QNameCache.class.getName());
        } catch (Exception unused3) {
        }
    }

    public QName(String str) {
        this(str, Namespace.NO_NAMESPACE);
    }

    public static QName get(String str) {
        return getCache().get(str);
    }

    private static QNameCache getCache() {
        return (QNameCache) singleton.instance();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.namespace = Namespace.get((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.namespace.getPrefix());
        objectOutputStream.writeObject(this.namespace.getURI());
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QName) {
            QName qName = (QName) obj;
            if (hashCode() == qName.hashCode()) {
                if (getName().equals(qName.getName()) && getNamespaceURI().equals(qName.getNamespaceURI())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public DocumentFactory getDocumentFactory() {
        return this.documentFactory;
    }

    public String getName() {
        return this.name;
    }

    public Namespace getNamespace() {
        return this.namespace;
    }

    public String getNamespacePrefix() {
        Namespace namespace = this.namespace;
        if (namespace == null) {
            return "";
        }
        return namespace.getPrefix();
    }

    public String getNamespaceURI() {
        Namespace namespace = this.namespace;
        if (namespace == null) {
            return "";
        }
        return namespace.getURI();
    }

    public String getQualifiedName() {
        if (this.qualifiedName == null) {
            String namespacePrefix = getNamespacePrefix();
            if (namespacePrefix != null && namespacePrefix.length() > 0) {
                StringBuilder g10 = d.g(namespacePrefix, ":");
                g10.append(this.name);
                this.qualifiedName = g10.toString();
            } else {
                this.qualifiedName = this.name;
            }
        }
        return this.qualifiedName;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            int hashCode = getName().hashCode() ^ getNamespaceURI().hashCode();
            this.hashCode = hashCode;
            if (hashCode == 0) {
                this.hashCode = 47806;
            }
        }
        return this.hashCode;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public String toString() {
        return super.toString() + " [name: " + getName() + " namespace: \"" + getNamespace() + "\"]";
    }

    public QName(String str, Namespace namespace) {
        this.name = str == null ? "" : str;
        this.namespace = namespace == null ? Namespace.NO_NAMESPACE : namespace;
    }

    public static QName get(String str, Namespace namespace) {
        return getCache().get(str, namespace);
    }

    public static QName get(String str, String str2, String str3) {
        if ((str2 == null || str2.length() == 0) && str3 == null) {
            return get(str);
        }
        if (str2 == null || str2.length() == 0) {
            return getCache().get(str, Namespace.get(str3));
        }
        if (str3 == null) {
            return get(str);
        }
        return getCache().get(str, Namespace.get(str2, str3));
    }

    public QName(String str, Namespace namespace, String str2) {
        this.name = str == null ? "" : str;
        this.qualifiedName = str2;
        this.namespace = namespace == null ? Namespace.NO_NAMESPACE : namespace;
    }

    public static QName get(String str, String str2) {
        if (str2 == null) {
            return getCache().get(str);
        }
        return getCache().get(str, str2);
    }

    public static QName get(String str, Namespace namespace, String str2) {
        return getCache().get(str, namespace, str2);
    }
}
