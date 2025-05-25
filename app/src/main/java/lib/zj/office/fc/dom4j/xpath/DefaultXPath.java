package lib.zj.office.fc.dom4j.xpath;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.NamespaceContext;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.NodeFilter;
import lib.zj.office.fc.dom4j.XPath;

/* loaded from: classes3.dex */
public class DefaultXPath implements XPath, NodeFilter, Serializable {
    private NamespaceContext namespaceContext;
    private String text;
    private XPath xpath;

    public DefaultXPath(String str) {
        this.text = str;
        this.xpath = parse(str);
    }

    public static XPath parse(String str) {
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public boolean booleanValueOf(Object obj) {
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public Object evaluate(Object obj) {
        return null;
    }

    public Object getCompareValue(Node node) {
        return valueOf(node);
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public NamespaceContext getNamespaceContext() {
        return this.namespaceContext;
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public String getText() {
        return this.text;
    }

    @Override // lib.zj.office.fc.dom4j.XPath, lib.zj.office.fc.dom4j.NodeFilter
    public boolean matches(Node node) {
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public Number numberValueOf(Object obj) {
        return null;
    }

    public void removeDuplicates(List list, Map map) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = map.get(it.next());
            if (hashSet.contains(obj)) {
                it.remove();
            } else {
                hashSet.add(obj);
            }
        }
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public List selectNodes(Object obj) {
        return Collections.EMPTY_LIST;
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public Object selectObject(Object obj) {
        return evaluate(obj);
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public Node selectSingleNode(Object obj) {
        return null;
    }

    public void setNSContext(Object obj) {
        if (this.namespaceContext == null) {
            this.xpath.setNamespaceContext(DefaultNamespaceContext.create(obj));
        }
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public void setNamespaceContext(NamespaceContext namespaceContext) {
        this.namespaceContext = namespaceContext;
        this.xpath.setNamespaceContext(namespaceContext);
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public void sort(List list) {
        sort(list, false);
    }

    public String toString() {
        return "[XPath: " + this.xpath + "]";
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public String valueOf(Object obj) {
        return "";
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public List selectNodes(Object obj, XPath xPath) {
        List selectNodes = selectNodes(obj);
        xPath.sort(selectNodes);
        return selectNodes;
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public void sort(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        HashMap hashMap = new HashMap(size);
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof Node) {
                Node node = (Node) obj;
                hashMap.put(node, getCompareValue(node));
            }
        }
        sort(list, hashMap);
        if (z10) {
            removeDuplicates(list, hashMap);
        }
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public List selectNodes(Object obj, XPath xPath, boolean z10) {
        List selectNodes = selectNodes(obj);
        xPath.sort(selectNodes, z10);
        return selectNodes;
    }

    public void sort(List list, final Map map) {
        Collections.sort(list, new Comparator() { // from class: lib.zj.office.fc.dom4j.xpath.DefaultXPath.1
            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                Object obj3 = map.get(obj);
                Object obj4 = map.get(obj2);
                if (obj3 == obj4) {
                    return 0;
                }
                if (obj3 instanceof Comparable) {
                    return ((Comparable) obj3).compareTo(obj4);
                }
                if (obj3 == null) {
                    return 1;
                }
                if (obj4 != null && obj3.equals(obj4)) {
                    return 0;
                }
                return -1;
            }
        });
    }

    public void setNamespaceContext1(NamespaceContext namespaceContext) {
    }

    @Override // lib.zj.office.fc.dom4j.XPath
    public void setNamespaceURIs(Map map) {
    }
}
