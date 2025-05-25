package lib.zj.office.fc.dom4j.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.tree.BackedList;
import lib.zj.office.fc.dom4j.tree.DefaultElement;

/* loaded from: classes3.dex */
public class IndexedElement extends DefaultElement {
    private Map attributeIndex;
    private Map elementIndex;

    public IndexedElement(String str) {
        super(str);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.tree.AbstractBranch
    public void addNode(Node node) {
        super.addNode(node);
        if (this.elementIndex != null && (node instanceof Element)) {
            addToElementIndex((Element) node);
        } else if (this.attributeIndex != null && (node instanceof Attribute)) {
            addToAttributeIndex((Attribute) node);
        }
    }

    public void addToAttributeIndex(Attribute attribute) {
        QName qName = attribute.getQName();
        String name = qName.getName();
        addToAttributeIndex(qName, attribute);
        addToAttributeIndex(name, attribute);
    }

    public void addToElementIndex(Element element) {
        QName qName = element.getQName();
        String name = qName.getName();
        addToElementIndex(qName, element);
        addToElementIndex(name, element);
    }

    public Element asElement(Object obj) {
        if (obj instanceof Element) {
            return (Element) obj;
        }
        if (obj != null) {
            List list = (List) obj;
            if (list.size() >= 1) {
                return (Element) list.get(0);
            }
            return null;
        }
        return null;
    }

    public Iterator asElementIterator(Object obj) {
        return asElementList(obj).iterator();
    }

    public List asElementList(Object obj) {
        if (obj instanceof Element) {
            return createSingleResultList(obj);
        }
        if (obj != null) {
            List list = (List) obj;
            BackedList createResultList = createResultList();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                createResultList.addLocal(list.get(i10));
            }
            return createResultList;
        }
        return createEmptyList();
    }

    @Override // lib.zj.office.fc.dom4j.tree.DefaultElement, lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.Element
    public Attribute attribute(String str) {
        return (Attribute) attributeIndex().get(str);
    }

    public Map attributeIndex() {
        if (this.attributeIndex == null) {
            this.attributeIndex = createAttributeIndex();
            Iterator attributeIterator = attributeIterator();
            while (attributeIterator.hasNext()) {
                addToAttributeIndex((Attribute) attributeIterator.next());
            }
        }
        return this.attributeIndex;
    }

    public Map createAttributeIndex() {
        return createIndex();
    }

    public Map createElementIndex() {
        return createIndex();
    }

    public Map createIndex() {
        return new HashMap();
    }

    public List createList() {
        return new ArrayList();
    }

    @Override // lib.zj.office.fc.dom4j.tree.DefaultElement, lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.Element
    public Element element(String str) {
        return asElement(elementIndex().get(str));
    }

    public Map elementIndex() {
        if (this.elementIndex == null) {
            this.elementIndex = createElementIndex();
            Iterator elementIterator = elementIterator();
            while (elementIterator.hasNext()) {
                addToElementIndex((Element) elementIterator.next());
            }
        }
        return this.elementIndex;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.Element
    public List elements(String str) {
        return asElementList(elementIndex().get(str));
    }

    public void removeFromAttributeIndex(Attribute attribute) {
        QName qName = attribute.getQName();
        String name = qName.getName();
        removeFromAttributeIndex(qName, attribute);
        removeFromAttributeIndex(name, attribute);
    }

    public void removeFromElementIndex(Element element) {
        QName qName = element.getQName();
        String name = qName.getName();
        removeFromElementIndex(qName, element);
        removeFromElementIndex(name, element);
    }

    @Override // lib.zj.office.fc.dom4j.tree.DefaultElement, lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.tree.AbstractBranch
    public boolean removeNode(Node node) {
        if (super.removeNode(node)) {
            if (this.elementIndex != null && (node instanceof Element)) {
                removeFromElementIndex((Element) node);
                return true;
            } else if (this.attributeIndex != null && (node instanceof Attribute)) {
                removeFromAttributeIndex((Attribute) node);
                return true;
            } else {
                return true;
            }
        }
        return false;
    }

    public IndexedElement(QName qName) {
        super(qName);
    }

    @Override // lib.zj.office.fc.dom4j.tree.DefaultElement, lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.Element
    public Attribute attribute(QName qName) {
        return (Attribute) attributeIndex().get(qName);
    }

    @Override // lib.zj.office.fc.dom4j.tree.DefaultElement, lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.Element
    public Element element(QName qName) {
        return asElement(elementIndex().get(qName));
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.Element
    public List elements(QName qName) {
        return asElementList(elementIndex().get(qName));
    }

    public IndexedElement(QName qName, int i10) {
        super(qName, i10);
    }

    public void addToAttributeIndex(Object obj, Attribute attribute) {
        if (this.attributeIndex.get(obj) != null) {
            this.attributeIndex.put(obj, attribute);
        }
    }

    public void addToElementIndex(Object obj, Element element) {
        Object obj2 = this.elementIndex.get(obj);
        if (obj2 == null) {
            this.elementIndex.put(obj, element);
        } else if (obj2 instanceof List) {
            ((List) obj2).add(element);
        } else {
            List createList = createList();
            createList.add(obj2);
            createList.add(element);
            this.elementIndex.put(obj, createList);
        }
    }

    public void removeFromAttributeIndex(Object obj, Attribute attribute) {
        Object obj2 = this.attributeIndex.get(obj);
        if (obj2 == null || !obj2.equals(attribute)) {
            return;
        }
        this.attributeIndex.remove(obj);
    }

    public void removeFromElementIndex(Object obj, Element element) {
        Object obj2 = this.elementIndex.get(obj);
        if (obj2 instanceof List) {
            ((List) obj2).remove(element);
        } else {
            this.elementIndex.remove(obj);
        }
    }
}
