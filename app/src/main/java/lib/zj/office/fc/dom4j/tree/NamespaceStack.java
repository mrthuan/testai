package lib.zj.office.fc.dom4j.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class NamespaceStack {
    private Map currentNamespaceCache;
    private Namespace defaultNamespace;
    private DocumentFactory documentFactory;
    private ArrayList namespaceCacheList;
    private ArrayList namespaceStack;
    private Map rootNamespaceCache;

    public NamespaceStack() {
        this.namespaceStack = new ArrayList();
        this.namespaceCacheList = new ArrayList();
        this.rootNamespaceCache = new HashMap();
        this.documentFactory = DocumentFactory.getInstance();
    }

    public Namespace addNamespace(String str, String str2) {
        Namespace createNamespace = createNamespace(str, str2);
        push(createNamespace);
        return createNamespace;
    }

    public void clear() {
        this.namespaceStack.clear();
        this.namespaceCacheList.clear();
        this.rootNamespaceCache.clear();
        this.currentNamespaceCache = null;
    }

    public boolean contains(Namespace namespace) {
        Namespace defaultNamespace;
        String prefix = namespace.getPrefix();
        if (prefix != null && prefix.length() != 0) {
            defaultNamespace = getNamespaceForPrefix(prefix);
        } else {
            defaultNamespace = getDefaultNamespace();
        }
        if (defaultNamespace == null) {
            return false;
        }
        if (defaultNamespace == namespace) {
            return true;
        }
        return namespace.getURI().equals(defaultNamespace.getURI());
    }

    public Namespace createNamespace(String str, String str2) {
        return this.documentFactory.createNamespace(str, str2);
    }

    public QName createQName(String str, String str2, Namespace namespace) {
        return this.documentFactory.createQName(str, namespace);
    }

    public Namespace findDefaultNamespace() {
        for (int size = this.namespaceStack.size() - 1; size >= 0; size--) {
            Namespace namespace = (Namespace) this.namespaceStack.get(size);
            if (namespace != null && (namespace.getPrefix() == null || namespace.getPrefix().length() == 0)) {
                return namespace;
            }
        }
        return null;
    }

    public QName getAttributeQName(String str, String str2, String str3) {
        Namespace namespace;
        if (str3 == null) {
            str3 = str2;
        }
        Map namespaceCache = getNamespaceCache();
        QName qName = (QName) namespaceCache.get(str3);
        if (qName != null) {
            return qName;
        }
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        int indexOf = str3.indexOf(":");
        if (indexOf > 0) {
            str4 = str3.substring(0, indexOf);
            namespace = createNamespace(str4, str);
            if (str2.trim().length() == 0) {
                str2 = str3.substring(indexOf + 1);
            }
        } else {
            namespace = Namespace.NO_NAMESPACE;
            if (str2.trim().length() == 0) {
                str2 = str3;
            }
        }
        QName pushQName = pushQName(str2, str3, namespace, str4);
        namespaceCache.put(str3, pushQName);
        return pushQName;
    }

    public Namespace getDefaultNamespace() {
        if (this.defaultNamespace == null) {
            this.defaultNamespace = findDefaultNamespace();
        }
        return this.defaultNamespace;
    }

    public DocumentFactory getDocumentFactory() {
        return this.documentFactory;
    }

    public Namespace getNamespace(int i10) {
        return (Namespace) this.namespaceStack.get(i10);
    }

    public Map getNamespaceCache() {
        if (this.currentNamespaceCache == null) {
            int size = this.namespaceStack.size() - 1;
            if (size < 0) {
                this.currentNamespaceCache = this.rootNamespaceCache;
            } else {
                Map map = (Map) this.namespaceCacheList.get(size);
                this.currentNamespaceCache = map;
                if (map == null) {
                    HashMap hashMap = new HashMap();
                    this.currentNamespaceCache = hashMap;
                    this.namespaceCacheList.set(size, hashMap);
                }
            }
        }
        return this.currentNamespaceCache;
    }

    public Namespace getNamespaceForPrefix(String str) {
        if (str == null) {
            str = "";
        }
        for (int size = this.namespaceStack.size() - 1; size >= 0; size--) {
            Namespace namespace = (Namespace) this.namespaceStack.get(size);
            if (str.equals(namespace.getPrefix())) {
                return namespace;
            }
        }
        return null;
    }

    public QName getQName(String str, String str2, String str3) {
        if (str2 == null) {
            str2 = str3;
        } else if (str3 == null) {
            str3 = str2;
        } else {
            str3 = str2;
            str2 = str3;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        int indexOf = str2.indexOf(":");
        if (indexOf > 0) {
            str4 = str2.substring(0, indexOf);
            if (str3.trim().length() == 0) {
                str3 = str2.substring(indexOf + 1);
            }
        } else if (str3.trim().length() == 0) {
            str3 = str2;
        }
        return pushQName(str3, str2, createNamespace(str4, str), str4);
    }

    public String getURI(String str) {
        Namespace namespaceForPrefix = getNamespaceForPrefix(str);
        if (namespaceForPrefix != null) {
            return namespaceForPrefix.getURI();
        }
        return null;
    }

    public Namespace pop() {
        return remove(this.namespaceStack.size() - 1);
    }

    public void push(Namespace namespace) {
        this.namespaceStack.add(namespace);
        this.namespaceCacheList.add(null);
        this.currentNamespaceCache = null;
        String prefix = namespace.getPrefix();
        if (prefix == null || prefix.length() == 0) {
            this.defaultNamespace = namespace;
        }
    }

    public QName pushQName(String str, String str2, Namespace namespace, String str3) {
        if (str3 == null || str3.length() == 0) {
            this.defaultNamespace = null;
        }
        return createQName(str, str2, namespace);
    }

    public Namespace remove(int i10) {
        Namespace namespace = (Namespace) this.namespaceStack.remove(i10);
        this.namespaceCacheList.remove(i10);
        this.defaultNamespace = null;
        this.currentNamespaceCache = null;
        return namespace;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public int size() {
        return this.namespaceStack.size();
    }

    public String toString() {
        return super.toString() + " Stack: " + this.namespaceStack.toString();
    }

    public Namespace pop(String str) {
        Namespace namespace;
        if (str == null) {
            str = "";
        }
        int size = this.namespaceStack.size() - 1;
        while (true) {
            if (size < 0) {
                namespace = null;
                break;
            }
            namespace = (Namespace) this.namespaceStack.get(size);
            if (str.equals(namespace.getPrefix())) {
                remove(size);
                break;
            }
            size--;
        }
        if (namespace == null) {
            System.out.println("Warning: missing namespace prefix ignored: ".concat(str));
        }
        return namespace;
    }

    public NamespaceStack(DocumentFactory documentFactory) {
        this.namespaceStack = new ArrayList();
        this.namespaceCacheList = new ArrayList();
        this.rootNamespaceCache = new HashMap();
        this.documentFactory = documentFactory;
    }

    public void push(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        push(createNamespace(str, str2));
    }
}
