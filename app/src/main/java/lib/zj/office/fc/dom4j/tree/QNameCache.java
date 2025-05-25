package lib.zj.office.fc.dom4j.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class QNameCache {
    private DocumentFactory documentFactory;
    protected Map noNamespaceCache = Collections.synchronizedMap(new WeakHashMap());
    protected Map namespaceCache = Collections.synchronizedMap(new WeakHashMap());

    public QNameCache() {
    }

    public Map createMap() {
        return Collections.synchronizedMap(new HashMap());
    }

    public QName createQName(String str) {
        return new QName(str);
    }

    public QName get(String str) {
        QName qName;
        if (str != null) {
            qName = (QName) this.noNamespaceCache.get(str);
        } else {
            qName = null;
            str = "";
        }
        if (qName == null) {
            QName createQName = createQName(str);
            createQName.setDocumentFactory(this.documentFactory);
            this.noNamespaceCache.put(str, createQName);
            return createQName;
        }
        return qName;
    }

    public Map getNamespaceCache(Namespace namespace) {
        Map map;
        if (namespace == Namespace.NO_NAMESPACE) {
            return this.noNamespaceCache;
        }
        if (namespace != null) {
            map = (Map) this.namespaceCache.get(namespace);
        } else {
            map = null;
        }
        if (map == null) {
            Map createMap = createMap();
            this.namespaceCache.put(namespace, createMap);
            return createMap;
        }
        return map;
    }

    public List getQNames() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.noNamespaceCache.values());
        for (Map map : this.namespaceCache.values()) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    public QName intern(QName qName) {
        return get(qName.getName(), qName.getNamespace(), qName.getQualifiedName());
    }

    public QName createQName(String str, Namespace namespace) {
        return new QName(str, namespace);
    }

    public QName createQName(String str, Namespace namespace, String str2) {
        return new QName(str, namespace, str2);
    }

    public QNameCache(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public QName get(String str, Namespace namespace) {
        QName qName;
        Map namespaceCache = getNamespaceCache(namespace);
        if (str != null) {
            qName = (QName) namespaceCache.get(str);
        } else {
            qName = null;
            str = "";
        }
        if (qName == null) {
            QName createQName = createQName(str, namespace);
            createQName.setDocumentFactory(this.documentFactory);
            namespaceCache.put(str, createQName);
            return createQName;
        }
        return qName;
    }

    public QName get(String str, Namespace namespace, String str2) {
        QName qName;
        Map namespaceCache = getNamespaceCache(namespace);
        if (str != null) {
            qName = (QName) namespaceCache.get(str);
        } else {
            qName = null;
            str = "";
        }
        if (qName == null) {
            QName createQName = createQName(str, namespace, str2);
            createQName.setDocumentFactory(this.documentFactory);
            namespaceCache.put(str, createQName);
            return createQName;
        }
        return qName;
    }

    public QName get(String str, String str2) {
        int indexOf = str.indexOf(58);
        if (indexOf < 0) {
            return get(str, Namespace.get(str2));
        }
        return get(str.substring(indexOf + 1), Namespace.get(str.substring(0, indexOf), str2));
    }
}
